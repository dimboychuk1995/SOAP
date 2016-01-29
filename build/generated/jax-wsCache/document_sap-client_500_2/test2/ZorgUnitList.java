
package test2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZorgUnitList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZorgUnitList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectId" type="{urn:sap-com:document:sap:rfc:functions}numeric8"/>
 *         &lt;element name="LongText" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="ParentId" type="{urn:sap-com:document:sap:rfc:functions}numeric8"/>
 *         &lt;element name="Tel" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZorgUnitList", propOrder = {
    "objectId",
    "longText",
    "parentId",
    "tel"
})
public class ZorgUnitList {

    @XmlElement(name = "ObjectId", required = true)
    protected String objectId;
    @XmlElement(name = "LongText", required = true)
    protected String longText;
    @XmlElement(name = "ParentId", required = true)
    protected String parentId;
    @XmlElement(name = "Tel", required = true)
    protected String tel;

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the longText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongText() {
        return longText;
    }

    /**
     * Sets the value of the longText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongText(String value) {
        this.longText = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentId(String value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

}
