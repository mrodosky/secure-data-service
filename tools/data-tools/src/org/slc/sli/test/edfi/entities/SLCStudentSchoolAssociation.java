//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.06 at 10:00:50 AM EST 
//


package org.slc.sli.test.edfi.entities;import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * StudentSchoolAssociation record with key fields: StudentReference, SchoolReference and EntryDate. Changed types of StudentReference, SchoolReference and GraduationPlanReference to SLC reference types. 
 * 
 * <p>Java class for SLC-StudentSchoolAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SLC-StudentSchoolAssociation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ed-fi.org/0100}ComplexObjectType">
 *       &lt;sequence>
 *         &lt;element name="StudentReference" type="{http://ed-fi.org/0100}SLC-StudentReferenceType"/>
 *         &lt;element name="SchoolReference" type="{http://ed-fi.org/0100}SLC-EducationalOrgReferenceType"/>
 *         &lt;element name="SchoolYear" type="{http://ed-fi.org/0100}SchoolYearType" minOccurs="0"/>
 *         &lt;element name="EntryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="EntryGradeLevel" type="{http://ed-fi.org/0100}GradeLevelType"/>
 *         &lt;element name="EntryType" type="{http://ed-fi.org/0100}EntryType" minOccurs="0"/>
 *         &lt;element name="RepeatGradeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassOf" type="{http://ed-fi.org/0100}SchoolYearType" minOccurs="0"/>
 *         &lt;element name="SchoolChoiceTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExitWithdrawDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExitWithdrawType" type="{http://ed-fi.org/0100}ExitWithdrawType" minOccurs="0"/>
 *         &lt;element name="EducationalPlans" type="{http://ed-fi.org/0100}EducationalPlansType" minOccurs="0"/>
 *         &lt;element name="GraduationPlanReference" type="{http://ed-fi.org/0100}SLC-GraduationPlanReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLC-StudentSchoolAssociation", propOrder = {
    "studentReference",
    "schoolReference",
    "schoolYear",
    "entryDate",
    "entryGradeLevel",
    "entryType",
    "repeatGradeIndicator",
    "classOf",
    "schoolChoiceTransfer",
    "exitWithdrawDate",
    "exitWithdrawType",
    "educationalPlans",
    "graduationPlanReference"
})
@XmlRootElement public class SLCStudentSchoolAssociation
    extends ComplexObjectType
{

    @XmlElement(name = "StudentReference", required = true)
    protected SLCStudentReferenceType studentReference;
    @XmlElement(name = "SchoolReference", required = true)
    protected SLCEducationalOrgReferenceType schoolReference;
    @XmlElement(name = "SchoolYear")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolYear;
    @XmlElement(name = "EntryDate", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected String entryDate;
    @XmlElement(name = "EntryGradeLevel", required = true)
    protected GradeLevelType entryGradeLevel;
    @XmlElement(name = "EntryType")
    protected EntryType entryType;
    @XmlElement(name = "RepeatGradeIndicator")
    protected Boolean repeatGradeIndicator;
    @XmlElement(name = "ClassOf")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String classOf;
    @XmlElement(name = "SchoolChoiceTransfer")
    protected Boolean schoolChoiceTransfer;
    @XmlElement(name = "ExitWithdrawDate")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected String exitWithdrawDate;
    @XmlElement(name = "ExitWithdrawType")
    protected ExitWithdrawType exitWithdrawType;
    @XmlElement(name = "EducationalPlans")
    protected EducationalPlansType educationalPlans;
    @XmlElement(name = "GraduationPlanReference")
    protected SLCGraduationPlanReferenceType graduationPlanReference;

    /**
     * Gets the value of the studentReference property.
     * 
     * @return
     *     possible object is
     *     {@link SLCStudentReferenceType }
     *     
     */
    public SLCStudentReferenceType getStudentReference() {
        return studentReference;
    }

    /**
     * Sets the value of the studentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SLCStudentReferenceType }
     *     
     */
    public void setStudentReference(SLCStudentReferenceType value) {
        this.studentReference = value;
    }

    /**
     * Gets the value of the schoolReference property.
     * 
     * @return
     *     possible object is
     *     {@link SLCEducationalOrgReferenceType }
     *     
     */
    public SLCEducationalOrgReferenceType getSchoolReference() {
        return schoolReference;
    }

    /**
     * Sets the value of the schoolReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SLCEducationalOrgReferenceType }
     *     
     */
    public void setSchoolReference(SLCEducationalOrgReferenceType value) {
        this.schoolReference = value;
    }

    /**
     * Gets the value of the schoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolYear() {
        return schoolYear;
    }

    /**
     * Sets the value of the schoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolYear(String value) {
        this.schoolYear = value;
    }

    /**
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryDate(String value) {
        this.entryDate = value;
    }

    /**
     * Gets the value of the entryGradeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link GradeLevelType }
     *     
     */
    public GradeLevelType getEntryGradeLevel() {
        return entryGradeLevel;
    }

    /**
     * Sets the value of the entryGradeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeLevelType }
     *     
     */
    public void setEntryGradeLevel(GradeLevelType value) {
        this.entryGradeLevel = value;
    }

    /**
     * Gets the value of the entryType property.
     * 
     * @return
     *     possible object is
     *     {@link EntryType }
     *     
     */
    public EntryType getEntryType() {
        return entryType;
    }

    /**
     * Sets the value of the entryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryType }
     *     
     */
    public void setEntryType(EntryType value) {
        this.entryType = value;
    }

    /**
     * Gets the value of the repeatGradeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRepeatGradeIndicator() {
        return repeatGradeIndicator;
    }

    /**
     * Sets the value of the repeatGradeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepeatGradeIndicator(Boolean value) {
        this.repeatGradeIndicator = value;
    }

    /**
     * Gets the value of the classOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOf() {
        return classOf;
    }

    /**
     * Sets the value of the classOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOf(String value) {
        this.classOf = value;
    }

    /**
     * Gets the value of the schoolChoiceTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSchoolChoiceTransfer() {
        return schoolChoiceTransfer;
    }

    /**
     * Sets the value of the schoolChoiceTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSchoolChoiceTransfer(Boolean value) {
        this.schoolChoiceTransfer = value;
    }

    /**
     * Gets the value of the exitWithdrawDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExitWithdrawDate() {
        return exitWithdrawDate;
    }

    /**
     * Sets the value of the exitWithdrawDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExitWithdrawDate(String value) {
        this.exitWithdrawDate = value;
    }

    /**
     * Gets the value of the exitWithdrawType property.
     * 
     * @return
     *     possible object is
     *     {@link ExitWithdrawType }
     *     
     */
    public ExitWithdrawType getExitWithdrawType() {
        return exitWithdrawType;
    }

    /**
     * Sets the value of the exitWithdrawType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExitWithdrawType }
     *     
     */
    public void setExitWithdrawType(ExitWithdrawType value) {
        this.exitWithdrawType = value;
    }

    /**
     * Gets the value of the educationalPlans property.
     * 
     * @return
     *     possible object is
     *     {@link EducationalPlansType }
     *     
     */
    public EducationalPlansType getEducationalPlans() {
        return educationalPlans;
    }

    /**
     * Sets the value of the educationalPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationalPlansType }
     *     
     */
    public void setEducationalPlans(EducationalPlansType value) {
        this.educationalPlans = value;
    }

    /**
     * Gets the value of the graduationPlanReference property.
     * 
     * @return
     *     possible object is
     *     {@link SLCGraduationPlanReferenceType }
     *     
     */
    public SLCGraduationPlanReferenceType getGraduationPlanReference() {
        return graduationPlanReference;
    }

    /**
     * Sets the value of the graduationPlanReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SLCGraduationPlanReferenceType }
     *     
     */
    public void setGraduationPlanReference(SLCGraduationPlanReferenceType value) {
        this.graduationPlanReference = value;
    }

}
