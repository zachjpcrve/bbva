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
 *         &lt;element name="productoId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subProductoId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "productoId",
    "subProductoId"
})
@XmlRootElement(name = "getProducto")
public class GetProducto {

    @XmlElement(required = true, nillable = true)
    protected String productoId;
    @XmlElement(required = true, nillable = true)
    protected String subProductoId;

    /**
     * Gets the value of the productoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductoId() {
        return productoId;
    }

    /**
     * Sets the value of the productoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductoId(String value) {
        this.productoId = value;
    }

    /**
     * Gets the value of the subProductoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubProductoId() {
        return subProductoId;
    }

    /**
     * Sets the value of the subProductoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubProductoId(String value) {
        this.subProductoId = value;
    }

}
