//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package com.bbva.general.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CentroSuperior complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CentroSuperior">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoCentroSuperior" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoAgrupacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoNivel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CentroSuperior", propOrder = {
    "codigoCentroSuperior",
    "codigoAgrupacion",
    "codigoNivel"
})
public class CentroSuperior {

    @XmlElement(required = true, nillable = true)
    protected String codigoCentroSuperior;
    @XmlElement(required = true, nillable = true)
    protected String codigoAgrupacion;
    @XmlElement(required = true, nillable = true)
    protected String codigoNivel;

    /**
     * Gets the value of the codigoCentroSuperior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCentroSuperior() {
        return codigoCentroSuperior;
    }

    /**
     * Sets the value of the codigoCentroSuperior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCentroSuperior(String value) {
        this.codigoCentroSuperior = value;
    }

    /**
     * Gets the value of the codigoAgrupacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAgrupacion() {
        return codigoAgrupacion;
    }

    /**
     * Sets the value of the codigoAgrupacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAgrupacion(String value) {
        this.codigoAgrupacion = value;
    }

    /**
     * Gets the value of the codigoNivel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoNivel() {
        return codigoNivel;
    }

    /**
     * Sets the value of the codigoNivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoNivel(String value) {
        this.codigoNivel = value;
    }

}