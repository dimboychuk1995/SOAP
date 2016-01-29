
package test1;

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
 *         &lt;element name="PosadyList" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfBapiObjec"/>
 *         &lt;element name="Return" type="{urn:sap-com:document:sap:soap:functions:mc-style}Bapiret2"/>
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
    "posadyList",
    "_return"
})
@XmlRootElement(name = "ZPosadyListResponse")
public class ZPosadyListResponse {

    @XmlElement(name = "PosadyList", required = true)
    protected TableOfBapiObjec posadyList;
    @XmlElement(name = "Return", required = true)
    protected Bapiret2 _return;

    /**
     * Gets the value of the posadyList property.
     * 
     * @return
     *     possible object is
     *     {@link TableOfBapiObjec }
     *     
     */
    public TableOfBapiObjec getPosadyList() {
        return posadyList;
    }

    /**
     * Sets the value of the posadyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfBapiObjec }
     *     
     */
    public void setPosadyList(TableOfBapiObjec value) {
        this.posadyList = value;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link Bapiret2 }
     *     
     */
    public Bapiret2 getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bapiret2 }
     *     
     */
    public void setReturn(Bapiret2 value) {
        this._return = value;
    }

}
