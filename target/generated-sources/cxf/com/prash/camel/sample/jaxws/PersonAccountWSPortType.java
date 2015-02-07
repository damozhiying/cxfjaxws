package com.prash.camel.sample.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.3
 * 2015-02-07T00:48:20.935+05:30
 * Generated source version: 3.0.3
 * 
 */
@WebService(targetNamespace = "http://jaxws.sample.camel.prash.com/", name = "PersonAccountWSPortType")
@XmlSeeAlso({com.prash.camel.sample.jaxws.values.ObjectFactory.class, ObjectFactory.class})
public interface PersonAccountWSPortType {

    @WebMethod
    @RequestWrapper(localName = "getCardDetails", targetNamespace = "http://jaxws.sample.camel.prash.com/", className = "com.prash.camel.sample.jaxws.GetCardDetails")
    @ResponseWrapper(localName = "getCardDetailsResponse", targetNamespace = "http://jaxws.sample.camel.prash.com/", className = "com.prash.camel.sample.jaxws.GetCardDetailsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.prash.camel.sample.jaxws.values.CardDetails getCardDetails(
        @WebParam(name = "personDetails", targetNamespace = "")
        com.prash.camel.sample.jaxws.values.PersonDetails personDetails
    );
}
