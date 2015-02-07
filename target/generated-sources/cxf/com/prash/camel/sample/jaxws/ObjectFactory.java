
package com.prash.camel.sample.jaxws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.prash.camel.sample.jaxws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCardDetailsResponse_QNAME = new QName("http://jaxws.sample.camel.prash.com/", "getCardDetailsResponse");
    private final static QName _GetCardDetails_QNAME = new QName("http://jaxws.sample.camel.prash.com/", "getCardDetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.prash.camel.sample.jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCardDetailsResponse }
     * 
     */
    public GetCardDetailsResponse createGetCardDetailsResponse() {
        return new GetCardDetailsResponse();
    }

    /**
     * Create an instance of {@link GetCardDetails }
     * 
     */
    public GetCardDetails createGetCardDetails() {
        return new GetCardDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.sample.camel.prash.com/", name = "getCardDetailsResponse")
    public JAXBElement<GetCardDetailsResponse> createGetCardDetailsResponse(GetCardDetailsResponse value) {
        return new JAXBElement<GetCardDetailsResponse>(_GetCardDetailsResponse_QNAME, GetCardDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws.sample.camel.prash.com/", name = "getCardDetails")
    public JAXBElement<GetCardDetails> createGetCardDetails(GetCardDetails value) {
        return new JAXBElement<GetCardDetails>(_GetCardDetails_QNAME, GetCardDetails.class, null, value);
    }

}
