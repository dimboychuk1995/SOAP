
package test;

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
 *         &lt;element name="OutTab" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZpernComm"/>
 *         &lt;element name="Return" type="{urn:sap-com:document:sap:soap:functions:mc-style}Bapireturn"/>
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
    "outTab",
    "_return"
})
@XmlRootElement(name = "ZPersonalSearchResponse")
public class ZPersonalSearchResponse {

    @XmlElement(name = "OutTab", required = true)
    protected TableOfZpernComm outTab;
    @XmlElement(name = "Return", required = true)
    protected Bapireturn _return;

    /**
     * Gets the value of the outTab property.
     * 
     * @return
     *     possible object is
     *     {@link TableOfZpernComm }
     *     
     */
    public TableOfZpernComm getOutTab() {
        return outTab;
    }

    /**
     * Sets the value of the outTab property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfZpernComm }
     *     
     */
    public void setOutTab(TableOfZpernComm value) {
        this.outTab = value;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link Bapireturn }
     *     
     */
    public Bapireturn getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bapireturn }
     *     
     */
    public void setReturn(Bapireturn value) {
        this._return = value;
    }

}
