//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:27 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:17 AM(foreman)-)
//


package pe.com.grupobbva.sce.tc84;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctExtraerTipoCambioRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctExtraerTipoCambioRq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://grupobbva.com.pe/sce/tc84/}ctHeader"/>
 *         &lt;element name="Data" type="{http://grupobbva.com.pe/sce/tc84/}ctBodyRq"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctExtraerTipoCambioRq", propOrder = {
    "header",
    "data"
})
public class CtExtraerTipoCambioRq {

    @XmlElement(name = "Header", required = true)
    protected CtHeader header;
    @XmlElement(name = "Data", required = true)
    protected CtBodyRq data;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link CtHeader }
     *     
     */
    public CtHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtHeader }
     *     
     */
    public void setHeader(CtHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link CtBodyRq }
     *     
     */
    public CtBodyRq getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtBodyRq }
     *     
     */
    public void setData(CtBodyRq value) {
        this.data = value;
    }

}
