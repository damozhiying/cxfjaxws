package com.prash.camel.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.cxf.jaxrs.JAXRSBinding;

import com.prash.camel.sample.jaxws.values.CardDetails;
import com.prash.camel.sample.jaxws.values.PersonDetails;
import com.prash.sample.rest.values.CardInputDetails;
import com.prash.sample.rest.values.CardOutputDetails;

public class CamelRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("cxf:bean:serviceEndpoint?dataFormat=POJO")
				.process(new Processor() {

					@Override
					public void process(Exchange exchange) throws Exception {
						PersonDetails personDetails = exchange.getIn().getBody(PersonDetails.class);
						System.out.println("in camel route " + personDetails);
						CardInputDetails cardInputDetails = new CardInputDetails();
						cardInputDetails.setCardType("Prepaid");
						cardInputDetails.setProxyNumber(personDetails.getProxyNumber());
						exchange.getIn().setBody(cardInputDetails);
                        exchange.getIn().setHeader(Exchange.CONTENT_TYPE, "application/json");
                        exchange.getIn().setHeader(Exchange.ACCEPT_CONTENT_TYPE, "application/json");
                    }
				}).marshal().json(JsonLibrary.Jackson,CardInputDetails.class)
				.to("log:${body}")
				.to("restlet:http://localhost:8080/cxfrs/service/card/rest/fetchCardDetailsPost?bridgeEndpoint=true&restletMethod=POST")
//				.convertBodyTo(String.class)
				.unmarshal().json(JsonLibrary.Jackson, CardOutputDetails.class)
				.process(new Processor() {
					
					@Override
					public void process(Exchange exchange) throws Exception {
						CardOutputDetails cardOutput = exchange.getIn().getBody(CardOutputDetails.class);
						CardDetails cardDetails = new CardDetails();
						cardDetails.setCardBalance(cardOutput.getCardBalance());
						cardDetails.setCardNumber(cardOutput.getCardNumber());
						cardDetails.setCardStatus(cardOutput.getCardStatus());
						exchange.getOut().setBody(cardDetails);
					}
				});

	}

}
