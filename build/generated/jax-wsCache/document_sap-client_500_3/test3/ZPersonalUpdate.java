
package test3;

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
 *         &lt;element name="Email" type="{urn:sap-com:document:sap:rfc:functions}char60" minOccurs="0"/>
 *         &lt;element name="EmployeeId" type="{urn:sap-com:document:sap:rfc:functions}numeric8" minOccurs="0"/>
 *         &lt;element name="TelAts" type="{urn:sap-com:document:sap:rfc:functions}char20" minOccurs="0"/>
 *         &lt;element name="TelFax" type="{urn:sap-com:document:sap:rfc:functions}char20" minOccurs="0"/>
 *         &lt;element name="TelHome" type="{urn:sap-com:document:sap:rfc:functions}char20" minOccurs="0"/>
 *         &lt;element name="TelMisto" type="{urn:sap-com:document:sap:rfc:functions}char20" minOccurs="0"/>
 *         &lt;element name="TelMob1" type="{urn:sap-com:document:sap:rfc:functions}char20" minOccurs="0"/>
 *         &lt;element name="TelMob2" type="{urn:sap-com:document:sap:rfc:functions}char20" minOccurs="0"/>
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
    "email",
    "employeeId",
    "telAts",
    "telFax",
    "telHome",
    "telMisto",
    "telMob1",
    "telMob2"
})
@XmlRootElement(name = "ZPersonalUpdate")
public class ZPersonalUpdate {

    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "EmployeeId")
    protected String employeeId;
    @XmlElement(name = "TelAts")
    protected String telAts;
    @XmlElement(name = "TelFax")
    protected String telFax;
    @XmlElement(name = "TelHome")
    protected String telHome;
    @XmlElement(name = "TelMisto")
    protected String telMisto;
    @XmlElement(name = "TelMob1")
    protected String telMob1;
    @XmlElement(name = "TelMob2")
    protected String telMob2;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeId(String value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the telAts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelAts() {
        return telAts;
    }

    /**
     * Sets the value of the telAts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelAts(String value) {
        this.telAts = value;
    }

    /**
     * Gets the value of the telFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelFax() {
        return telFax;
    }

    /**
     * Sets the value of the telFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelFax(String value) {
        this.telFax = value;
    }

    /**
     * Gets the value of the telHome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelHome() {
        return telHome;
    }

    /**
     * Sets the value of the telHome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelHome(String value) {
        this.telHome = value;
    }

    /**
     * Gets the value of the telMisto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelMisto() {
        return telMisto;
    }

    /**
     * Sets the value of the telMisto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelMisto(String value) {
        this.telMisto = value;
    }

    /**
     * Gets the value of the telMob1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelMob1() {
        return telMob1;
    }

    /**
     * Sets the value of the telMob1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelMob1(String value) {
        this.telMob1 = value;
    }

    /**
     * Gets the value of the telMob2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelMob2() {
        return telMob2;
    }

    /**
     * Sets the value of the telMob2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelMob2(String value) {
        this.telMob2 = value;
    }

}
