//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package com.ibm.bbva.reniec.consultapordni;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatosDNI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatosDNI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constanciaVotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoRestriccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionRestriccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosDNI", propOrder = {
    "fechaInscripcion",
    "fechaExpedicion",
    "constanciaVotacion",
    "codigoRestriccion",
    "descripcionRestriccion"
})
public class DatosDNI {

    protected String fechaInscripcion;
    protected String fechaExpedicion;
    protected String constanciaVotacion;
    protected String codigoRestriccion;
    protected String descripcionRestriccion;

    /**
     * Gets the value of the fechaInscripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    /**
     * Sets the value of the fechaInscripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInscripcion(String value) {
        this.fechaInscripcion = value;
    }

    /**
     * Gets the value of the fechaExpedicion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Sets the value of the fechaExpedicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicion(String value) {
        this.fechaExpedicion = value;
    }

    /**
     * Gets the value of the constanciaVotacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstanciaVotacion() {
        return constanciaVotacion;
    }

    /**
     * Sets the value of the constanciaVotacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstanciaVotacion(String value) {
        this.constanciaVotacion = value;
    }

    /**
     * Gets the value of the codigoRestriccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRestriccion() {
        return codigoRestriccion;
    }

    /**
     * Sets the value of the codigoRestriccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRestriccion(String value) {
        this.codigoRestriccion = value;
    }

    /**
     * Gets the value of the descripcionRestriccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionRestriccion() {
        return descripcionRestriccion;
    }

    /**
     * Sets the value of the descripcionRestriccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionRestriccion(String value) {
        this.descripcionRestriccion = value;
    }

}
