//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.17 at 01:12:00 PM EDT 
//


package org.slc.sli.test.edfi.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides alternative references for Staff reference during interchange (including teachers). Use XML IDREF to reference a staff record that is included in the interchange
 * 
 * <p>Java class for StaffReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ed-fi.org/0100}ReferenceType">
 *       &lt;sequence>
 *         &lt;element name="StaffIdentity" type="{http://ed-fi.org/0100}StaffIdentityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaffReferenceType", propOrder = {
    "staffIdentity"
})
public class StaffReferenceType
    extends ReferenceType
{

    @XmlElement(name = "StaffIdentity")
    protected StaffIdentityType staffIdentity;

    /**
     * Gets the value of the staffIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link StaffIdentityType }
     *     
     */
    public StaffIdentityType getStaffIdentity() {
        return staffIdentity;
    }

    /**
     * Sets the value of the staffIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffIdentityType }
     *     
     */
    public void setStaffIdentity(StaffIdentityType value) {
        this.staffIdentity = value;
    }

}
