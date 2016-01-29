
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
    "posadyList"
})
@XmlRootElement(name = "ZPosadyList")
public class ZPosadyList {

    @XmlElement(name = "PosadyList", required = true)
    protected TableOfBapiObjec posadyList;

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

}
