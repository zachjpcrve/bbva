//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package com.ibm.bbva.reniec.consultapornombres;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatosPersona complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatosPersona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroDNIConsultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caracterVerificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoFichaRegistral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellidoPaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellidoMaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preNombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indDatos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indImagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosPersona", propOrder = {
    "numeroDNIConsultado",
    "caracterVerificacion",
    "tipoFichaRegistral",
    "apellidoPaterno",
    "apellidoMaterno",
    "preNombres",
    "indDatos",
    "indImagen"
})
public class DatosPersona {

    protected String numeroDNIConsultado;
    protected String caracterVerificacion;
    protected String tipoFichaRegistral;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected String preNombres;
    protected String indDatos;
    protected String indImagen;

    /**
     * Gets the value of the numeroDNIConsultado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDNIConsultado() {
        return numeroDNIConsultado;
    }

    /**
     * Sets the value of the numeroDNIConsultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDNIConsultado(String value) {
        this.numeroDNIConsultado = value;
    }

    /**
     * Gets the value of the caracterVerificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaracterVerificacion() {
        return caracterVerificacion;
    }

    /**
     * Sets the value of the caracterVerificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaracterVerificacion(String value) {
        this.caracterVerificacion = value;
    }

    /**
     * Gets the value of the tipoFichaRegistral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFichaRegistral() {
        return tipoFichaRegistral;
    }

    /**
     * Sets the value of the tipoFichaRegistral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFichaRegistral(String value) {
        this.tipoFichaRegistral = value;
    }

    /**
     * Gets the value of the apellidoPaterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Sets the value of the apellidoPaterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoPaterno(String value) {
        this.apellidoPaterno = value;
    }

    /**
     * Gets the value of the apellidoMaterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Sets the value of the apellidoMaterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoMaterno(String value) {
        this.apellidoMaterno = value;
    }

    /**
     * Gets the value of the preNombres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreNombres() {
        return preNombres;
    }

    /**
     * Sets the value of the preNombres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreNombres(String value) {
        this.preNombres = value;
    }

    /**
     * Gets the value of the indDatos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndDatos() {
        return indDatos;
    }

    /**
     * Sets the value of the indDatos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndDatos(String value) {
        this.indDatos = value;
    }

    /**
     * Gets the value of the indImagen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndImagen() {
        return indImagen;
    }

    /**
     * Sets the value of the indImagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndImagen(String value) {
        this.indImagen = value;
    }

}