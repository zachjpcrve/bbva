//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package com.ibm.bbva.service.business.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for delegacionOficina complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delegacionOficina">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idNivel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idExpediente" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delegacionOficina", propOrder = {
    "idNivel",
    "idExpediente"
})
public class DelegacionOficina {

    protected Integer idNivel;
    protected Long idExpediente;

    /**
     * Gets the value of the idNivel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdNivel() {
        return idNivel;
    }

    /**
     * Sets the value of the idNivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdNivel(Integer value) {
        this.idNivel = value;
    }

    /**
     * Gets the value of the idExpediente property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdExpediente() {
        return idExpediente;
    }

    /**
     * Sets the value of the idExpediente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdExpediente(Long value) {
        this.idExpediente = value;
    }

}