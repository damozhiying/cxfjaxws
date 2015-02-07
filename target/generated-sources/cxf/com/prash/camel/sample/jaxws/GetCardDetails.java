
package com.prash.camel.sample.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.prash.camel.sample.jaxws.values.PersonDetails;


/**
 * <p>Java class for getCardDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCardDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personDetails" type="{http://values.jaxws.sample.camel.prash.com/}personDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCardDetails", propOrder = {
    "personDetails"
})
public class GetCardDetails {

    protected PersonDetails personDetails;

    /**
     * Gets the value of the personDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PersonDetails }
     *     
     */
    public PersonDetails getPersonDetails() {
        return personDetails;
    }

    /**
     * Sets the value of the personDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonDetails }
     *     
     */
    public void setPersonDetails(PersonDetails value) {
        this.personDetails = value;
    }

}
