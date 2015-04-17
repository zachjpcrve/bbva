//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package com.ibm.bbva.harec.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovimientoPorProcesarMP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MovimientoPorProcesarMP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaOperacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="horaOperacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroAutorizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="situacionMovimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaConciliacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroComercio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombreComercio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroNapCred" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditoDebito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroRetencion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroCuentaCargo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minicard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="importeOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="monedaOrigen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="importeDebito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="monedaDebido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovimientoPorProcesarMP", propOrder = {
    "tarjeta",
    "tipoOperacion",
    "fechaOperacion",
    "horaOperacion",
    "numeroAutorizacion",
    "situacionMovimiento",
    "fechaConciliacion",
    "numeroComercio",
    "nombreComercio",
    "numeroNapCred",
    "creditoDebito",
    "numeroRetencion",
    "numeroCuentaCargo",
    "minicard",
    "importeOrigen",
    "monedaOrigen",
    "importeDebito",
    "monedaDebido"
})
public class MovimientoPorProcesarMP {

    @XmlElement(required = true)
    protected String tarjeta;
    @XmlElement(required = true)
    protected String tipoOperacion;
    @XmlElement(required = true)
    protected String fechaOperacion;
    @XmlElement(required = true)
    protected String horaOperacion;
    @XmlElement(required = true)
    protected String numeroAutorizacion;
    @XmlElement(required = true)
    protected String situacionMovimiento;
    @XmlElement(required = true)
    protected String fechaConciliacion;
    @XmlElement(required = true)
    protected String numeroComercio;
    @XmlElement(required = true)
    protected String nombreComercio;
    @XmlElement(required = true)
    protected String numeroNapCred;
    @XmlElement(required = true)
    protected String creditoDebito;
    @XmlElement(required = true)
    protected String numeroRetencion;
    @XmlElement(required = true)
    protected String numeroCuentaCargo;
    @XmlElement(required = true)
    protected String minicard;
    @XmlElement(required = true)
    protected String importeOrigen;
    @XmlElement(required = true)
    protected String monedaOrigen;
    @XmlElement(required = true)
    protected String importeDebito;
    @XmlElement(required = true)
    protected String monedaDebido;

    /**
     * Gets the value of the tarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarjeta() {
        return tarjeta;
    }

    /**
     * Sets the value of the tarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarjeta(String value) {
        this.tarjeta = value;
    }

    /**
     * Gets the value of the tipoOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Sets the value of the tipoOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperacion(String value) {
        this.tipoOperacion = value;
    }

    /**
     * Gets the value of the fechaOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOperacion() {
        return fechaOperacion;
    }

    /**
     * Sets the value of the fechaOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOperacion(String value) {
        this.fechaOperacion = value;
    }

    /**
     * Gets the value of the horaOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraOperacion() {
        return horaOperacion;
    }

    /**
     * Sets the value of the horaOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraOperacion(String value) {
        this.horaOperacion = value;
    }

    /**
     * Gets the value of the numeroAutorizacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAutorizacion() {
        return numeroAutorizacion;
    }

    /**
     * Sets the value of the numeroAutorizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAutorizacion(String value) {
        this.numeroAutorizacion = value;
    }

    /**
     * Gets the value of the situacionMovimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacionMovimiento() {
        return situacionMovimiento;
    }

    /**
     * Sets the value of the situacionMovimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacionMovimiento(String value) {
        this.situacionMovimiento = value;
    }

    /**
     * Gets the value of the fechaConciliacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaConciliacion() {
        return fechaConciliacion;
    }

    /**
     * Sets the value of the fechaConciliacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaConciliacion(String value) {
        this.fechaConciliacion = value;
    }

    /**
     * Gets the value of the numeroComercio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroComercio() {
        return numeroComercio;
    }

    /**
     * Sets the value of the numeroComercio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroComercio(String value) {
        this.numeroComercio = value;
    }

    /**
     * Gets the value of the nombreComercio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreComercio() {
        return nombreComercio;
    }

    /**
     * Sets the value of the nombreComercio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreComercio(String value) {
        this.nombreComercio = value;
    }

    /**
     * Gets the value of the numeroNapCred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroNapCred() {
        return numeroNapCred;
    }

    /**
     * Sets the value of the numeroNapCred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroNapCred(String value) {
        this.numeroNapCred = value;
    }

    /**
     * Gets the value of the creditoDebito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditoDebito() {
        return creditoDebito;
    }

    /**
     * Sets the value of the creditoDebito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditoDebito(String value) {
        this.creditoDebito = value;
    }

    /**
     * Gets the value of the numeroRetencion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRetencion() {
        return numeroRetencion;
    }

    /**
     * Sets the value of the numeroRetencion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRetencion(String value) {
        this.numeroRetencion = value;
    }

    /**
     * Gets the value of the numeroCuentaCargo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCuentaCargo() {
        return numeroCuentaCargo;
    }

    /**
     * Sets the value of the numeroCuentaCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCuentaCargo(String value) {
        this.numeroCuentaCargo = value;
    }

    /**
     * Gets the value of the minicard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinicard() {
        return minicard;
    }

    /**
     * Sets the value of the minicard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinicard(String value) {
        this.minicard = value;
    }

    /**
     * Gets the value of the importeOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteOrigen() {
        return importeOrigen;
    }

    /**
     * Sets the value of the importeOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteOrigen(String value) {
        this.importeOrigen = value;
    }

    /**
     * Gets the value of the monedaOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    /**
     * Sets the value of the monedaOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaOrigen(String value) {
        this.monedaOrigen = value;
    }

    /**
     * Gets the value of the importeDebito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteDebito() {
        return importeDebito;
    }

    /**
     * Sets the value of the importeDebito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteDebito(String value) {
        this.importeDebito = value;
    }

    /**
     * Gets the value of the monedaDebido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaDebido() {
        return monedaDebido;
    }

    /**
     * Sets the value of the monedaDebido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaDebido(String value) {
        this.monedaDebido = value;
    }

}