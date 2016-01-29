
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Objec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Objec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlanVers" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Objecttype" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="ObjectId" type="{urn:sap-com:document:sap:rfc:functions}numeric8"/>
 *         &lt;element name="StartDate" type="{urn:sap-com:document:sap:rfc:functions}date"/>
 *         &lt;element name="EndDate" type="{urn:sap-com:document:sap:rfc:functions}date"/>
 *         &lt;element name="PlanStat" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="HistoFlag" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="ShortText" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="LongText" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="ExtObjId" type="{urn:sap-com:document:sap:rfc:functions}char45"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Objec", propOrder = {
    "planVers",
    "objecttype",
    "objectId",
    "startDate",
    "endDate",
    "planStat",
    "histoFlag",
    "shortText",
    "longText",
    "extObjId"
})
public class Objec {

    @XmlElement(name = "PlanVers", required = true)
    protected String planVers;
    @XmlElement(name = "Objecttype", required = true)
    protected String objecttype;
    @XmlElement(name = "ObjectId", required = true)
    protected String objectId;
    @XmlElement(name = "StartDate", required = true)
    protected String startDate;
    @XmlElement(name = "EndDate", required = true)
    protected String endDate;
    @XmlElement(name = "PlanStat", required = true)
    protected String planStat;
    @XmlElement(name = "HistoFlag", required = true)
    protected String histoFlag;
    @XmlElement(name = "ShortText", required = true)
    protected String shortText;
    @XmlElement(name = "LongText", required = true)
    protected String longText;
    @XmlElement(name = "ExtObjId", required = true)
    protected String extObjId;

    /**
     * Gets the value of the planVers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanVers() {
        return planVers;
    }

    /**
     * Sets the value of the planVers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanVers(String value) {
        this.planVers = value;
    }

    /**
     * Gets the value of the objecttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjecttype() {
        return objecttype;
    }

    /**
     * Sets the value of the objecttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjecttype(String value) {
        this.objecttype = value;
    }

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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the planStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanStat() {
        return planStat;
    }

    /**
     * Sets the value of the planStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanStat(String value) {
        this.planStat = value;
    }

    /**
     * Gets the value of the histoFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoFlag() {
        return histoFlag;
    }

    /**
     * Sets the value of the histoFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoFlag(String value) {
        this.histoFlag = value;
    }

    /**
     * Gets the value of the shortText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortText() {
        return shortText;
    }

    /**
     * Sets the value of the shortText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortText(String value) {
        this.shortText = value;
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
     * Gets the value of the extObjId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtObjId() {
        return extObjId;
    }

    /**
     * Sets the value of the extObjId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtObjId(String value) {
        this.extObjId = value;
    }

}
