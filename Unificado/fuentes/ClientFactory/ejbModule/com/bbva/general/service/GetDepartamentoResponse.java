//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package com.bbva.general.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getDepartamentoReturn" type="{http://service.general.bbva.com}ArrayOf_tns2_nillable_Ubigeo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getDepartamentoReturn"
})
@XmlRootElement(name = "getDepartamentoResponse")
public class GetDepartamentoResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns2NillableUbigeo getDepartamentoReturn;

    /**
     * Gets the value of the getDepartamentoReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2NillableUbigeo }
     *     
     */
    public ArrayOfTns2NillableUbigeo getGetDepartamentoReturn() {
        return getDepartamentoReturn;
    }

    /**
     * Sets the value of the getDepartamentoReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2NillableUbigeo }
     *     
     */
    public void setGetDepartamentoReturn(ArrayOfTns2NillableUbigeo value) {
        this.getDepartamentoReturn = value;
    }

}
