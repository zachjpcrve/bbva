//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package com.ibm.bbva.service.business.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for expedienteDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="expedienteDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bancoConyuge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clasificacionBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clasificacionSbs" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="codigoEstadoCivilTitular" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoExpediente" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoNivel" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoProducto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoTipoMonedaSol" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoTipoScoring" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lineaConsumo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lineaCredAprob" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lineaCredSol" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="perExpPub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="porcentajeEndeudamiento" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="riesgoCliente" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sbsConyuge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expedienteDTO", propOrder = {
    "bancoConyuge",
    "clasificacionBanco",
    "clasificacionSbs",
    "codigoEstadoCivilTitular",
    "codigoExpediente",
    "codigoNivel",
    "codigoProducto",
    "codigoTipoMonedaSol",
    "codigoTipoScoring",
    "lineaConsumo",
    "lineaCredAprob",
    "lineaCredSol",
    "perExpPub",
    "porcentajeEndeudamiento",
    "riesgoCliente",
    "sbsConyuge",
    "plazoSolicitado",
    "flagSubRogado"
})
public class ExpedienteDTO {

    protected Long bancoConyuge;
    protected Long clasificacionBanco;
    protected double clasificacionSbs;
    protected Long codigoEstadoCivilTitular;
    protected Long codigoExpediente;
    protected Long codigoNivel;
    protected Long codigoProducto;
    protected Long codigoTipoMonedaSol;
    protected Long codigoTipoScoring;
    protected double lineaConsumo;
    protected double lineaCredAprob;
    protected double lineaCredSol;
    protected String perExpPub;
    protected double porcentajeEndeudamiento;
    protected double riesgoCliente;
    protected double sbsConyuge;
    protected String plazoSolicitado;
    protected String flagSubRogado;
    /**
     * Gets the value of the bancoConyuge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getBancoConyuge() {
        return bancoConyuge;
    }

    /**
     * Sets the value of the bancoConyuge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBancoConyuge(Long value) {
        this.bancoConyuge = value;
    }

    /**
     * Gets the value of the clasificacionBanco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getClasificacionBanco() {
        return clasificacionBanco;
    }

    /**
     * Sets the value of the clasificacionBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasificacionBanco(Long value) {
        this.clasificacionBanco = value;
    }

    /**
     * Gets the value of the clasificacionSbs property.
     * 
     */
    public double getClasificacionSbs() {
        return clasificacionSbs;
    }

    /**
     * Sets the value of the clasificacionSbs property.
     * 
     */
    public void setClasificacionSbs(double value) {
        this.clasificacionSbs = value;
    }

    /**
     * Gets the value of the codigoEstadoCivilTitular property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoEstadoCivilTitular() {
        return codigoEstadoCivilTitular;
    }

    /**
     * Sets the value of the codigoEstadoCivilTitular property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoEstadoCivilTitular(Long value) {
        this.codigoEstadoCivilTitular = value;
    }

    /**
     * Gets the value of the codigoExpediente property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoExpediente() {
        return codigoExpediente;
    }

    /**
     * Sets the value of the codigoExpediente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoExpediente(Long value) {
        this.codigoExpediente = value;
    }

    /**
     * Gets the value of the codigoNivel property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoNivel() {
        return codigoNivel;
    }

    /**
     * Sets the value of the codigoNivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoNivel(Long value) {
        this.codigoNivel = value;
    }

    /**
     * Gets the value of the codigoProducto property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Sets the value of the codigoProducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoProducto(Long value) {
        this.codigoProducto = value;
    }

    /**
     * Gets the value of the codigoTipoMonedaSol property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoTipoMonedaSol() {
        return codigoTipoMonedaSol;
    }

    /**
     * Sets the value of the codigoTipoMonedaSol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoTipoMonedaSol(Long value) {
        this.codigoTipoMonedaSol = value;
    }

    /**
     * Gets the value of the codigoTipoScoring property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoTipoScoring() {
        return codigoTipoScoring;
    }

    /**
     * Sets the value of the codigoTipoScoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoTipoScoring(Long value) {
        this.codigoTipoScoring = value;
    }

    /**
     * Gets the value of the lineaConsumo property.
     * 
     */
    public double getLineaConsumo() {
        return lineaConsumo;
    }

    /**
     * Sets the value of the lineaConsumo property.
     * 
     */
    public void setLineaConsumo(double value) {
        this.lineaConsumo = value;
    }

    /**
     * Gets the value of the lineaCredAprob property.
     * 
     */
    public double getLineaCredAprob() {
        return lineaCredAprob;
    }

    /**
     * Sets the value of the lineaCredAprob property.
     * 
     */
    public void setLineaCredAprob(double value) {
        this.lineaCredAprob = value;
    }

    /**
     * Gets the value of the lineaCredSol property.
     * 
     */
    public double getLineaCredSol() {
        return lineaCredSol;
    }

    /**
     * Sets the value of the lineaCredSol property.
     * 
     */
    public void setLineaCredSol(double value) {
        this.lineaCredSol = value;
    }

    /**
     * Gets the value of the perExpPub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerExpPub() {
        return perExpPub;
    }

    /**
     * Sets the value of the perExpPub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerExpPub(String value) {
        this.perExpPub = value;
    }

    /**
     * Gets the value of the porcentajeEndeudamiento property.
     * 
     */
    public double getPorcentajeEndeudamiento() {
        return porcentajeEndeudamiento;
    }

    /**
     * Sets the value of the porcentajeEndeudamiento property.
     * 
     */
    public void setPorcentajeEndeudamiento(double value) {
        this.porcentajeEndeudamiento = value;
    }

    /**
     * Gets the value of the riesgoCliente property.
     * 
     */
    public double getRiesgoCliente() {
        return riesgoCliente;
    }

    /**
     * Sets the value of the riesgoCliente property.
     * 
     */
    public void setRiesgoCliente(double value) {
        this.riesgoCliente = value;
    }

    /**
     * Gets the value of the sbsConyuge property.
     * 
     */
    public double getSbsConyuge() {
        return sbsConyuge;
    }

    /**
     * Sets the value of the sbsConyuge property.
     * 
     */
    public void setSbsConyuge(double value) {
        this.sbsConyuge = value;
    }

    /**
     * Gets the value of the plazoSolicitado property.
     * 
     */
	public String getPlazoSolicitado() {
		return plazoSolicitado;
	}
	
    /**
     * Sets the value of the plazoSolicitado property.
     * 
     */
	public void setPlazoSolicitado(String plazoSolicitado) {
		this.plazoSolicitado = plazoSolicitado;
	}

	public String getFlagSubRogado() {
		return flagSubRogado;
	}

	public void setFlagSubRogado(String flagSubRogado) {
		this.flagSubRogado = flagSubRogado;
	}
    
    

}