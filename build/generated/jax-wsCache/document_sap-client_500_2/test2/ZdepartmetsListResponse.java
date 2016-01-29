
package test2;

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
 *         &lt;element name="OrgList" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZorgUnitList"/>
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
    "orgList",
    "_return"
})
@XmlRootElement(name = "ZdepartmetsListResponse")
public class ZdepartmetsListResponse {

    @XmlElement(name = "OrgList", required = true)
    protected TableOfZorgUnitList orgList;
    @XmlElement(name = "Return", required = true)
    protected Bapiret2 _return;

    /**
     * Gets the value of the orgList property.
     * 
     * @return
     *     possible object is
     *     {@link TableOfZorgUnitList }
     *     
     */
    public TableOfZorgUnitList getOrgList() {
        return orgList;
    }

    /**
     * Sets the value of the orgList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfZorgUnitList }
     *     
     */
    public void setOrgList(TableOfZorgUnitList value) {
        this.orgList = value;
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
