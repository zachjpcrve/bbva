//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package com.bbva.general.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bbva.general.entities.Producto;


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
 *         &lt;element name="getProductoReturn" type="{http://entities.general.bbva.com}Producto"/>
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
    "getProductoReturn"
})
@XmlRootElement(name = "getProductoResponse")
public class GetProductoResponse {

    @XmlElement(required = true, nillable = true)
    protected Producto getProductoReturn;

    /**
     * Gets the value of the getProductoReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Producto }
     *     
     */
    public Producto getGetProductoReturn() {
        return getProductoReturn;
    }

    /**
     * Sets the value of the getProductoReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Producto }
     *     
     */
    public void setGetProductoReturn(Producto value) {
        this.getProductoReturn = value;
    }

}
