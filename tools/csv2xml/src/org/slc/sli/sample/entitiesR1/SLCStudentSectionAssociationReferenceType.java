//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.05 at 01:12:38 PM EST 
//


package org.slc.sli.sample.entitiesR1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Changed to use a required SLC identity type.
 * 
 * <p>Java class for SLC-StudentSectionAssociationReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SLC-StudentSectionAssociationReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentSectionAssociationIdentity" type="{http://ed-fi.org/0100}SLC-StudentSectionAssociationIdentityType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLC-StudentSectionAssociationReferenceType", propOrder = {
    "studentSectionAssociationIdentity"
})
public class SLCStudentSectionAssociationReferenceType {

    @XmlElement(name = "StudentSectionAssociationIdentity", required = true)
    protected SLCStudentSectionAssociationIdentityType studentSectionAssociationIdentity;

    /**
     * Gets the value of the studentSectionAssociationIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link SLCStudentSectionAssociationIdentityType }
     *     
     */
    public SLCStudentSectionAssociationIdentityType getStudentSectionAssociationIdentity() {
        return studentSectionAssociationIdentity;
    }

    /**
     * Sets the value of the studentSectionAssociationIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SLCStudentSectionAssociationIdentityType }
     *     
     */
    public void setStudentSectionAssociationIdentity(SLCStudentSectionAssociationIdentityType value) {
        this.studentSectionAssociationIdentity = value;
    }

}
