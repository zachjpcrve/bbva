//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package com.ibm.bbva.harec.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovimientosXContratoRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MovimientosXContratoRs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="head" type="{http://grupobbva.com.pe/HarecService/}HeadRs"/>
 *         &lt;element name="body" type="{http://grupobbva.com.pe/HarecService/}BodyMovimientosXContratoRs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovimientosXContratoRs", propOrder = {
    "head",
    "body"
})
public class MovimientosXContratoRs {

    @XmlElement(required = true)
    protected HeadRs head;
    protected BodyMovimientosXContratoRs body;

    /**
     * Gets the value of the head property.
     * 
     * @return
     *     possible object is
     *     {@link HeadRs }
     *     
     */
    public HeadRs getHead() {
        return head;
    }

    /**
     * Sets the value of the head property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeadRs }
     *     
     */
    public void setHead(HeadRs value) {
        this.head = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link BodyMovimientosXContratoRs }
     *     
     */
    public BodyMovimientosXContratoRs getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyMovimientosXContratoRs }
     *     
     */
    public void setBody(BodyMovimientosXContratoRs value) {
        this.body = value;
    }

}