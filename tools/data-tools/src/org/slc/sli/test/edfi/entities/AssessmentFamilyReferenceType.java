//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.30 at 01:48:06 PM EDT 
//


package org.slc.sli.test.edfi.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides alternative references for assessment families during interchange. Use XML IDREF to reference a course record that is included in the interchange
 * 
 * <p>Java class for AssessmentFamilyReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentFamilyReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ed-fi.org/0100}ReferenceType">
 *       &lt;sequence>
 *         &lt;element name="AssessmentFamilyIdentity" type="{http://ed-fi.org/0100}AssessmentFamilyIdentityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentFamilyReferenceType", propOrder = {
    "assessmentFamilyIdentity"
})
public class AssessmentFamilyReferenceType
    extends ReferenceType
{

    @XmlElement(name = "AssessmentFamilyIdentity")
    protected AssessmentFamilyIdentityType assessmentFamilyIdentity;

    /**
     * Gets the value of the assessmentFamilyIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentFamilyIdentityType }
     *     
     */
    public AssessmentFamilyIdentityType getAssessmentFamilyIdentity() {
        return assessmentFamilyIdentity;
    }

    /**
     * Sets the value of the assessmentFamilyIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentFamilyIdentityType }
     *     
     */
    public void setAssessmentFamilyIdentity(AssessmentFamilyIdentityType value) {
        this.assessmentFamilyIdentity = value;
    }

}
