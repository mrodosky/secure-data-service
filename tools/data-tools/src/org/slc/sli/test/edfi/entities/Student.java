//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.16 at 01:39:34 PM EST 
//


package org.slc.sli.test.edfi.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This entity represents an individual for whom instruction, services and/or care are provided in an early childhood, elementary or secondary educational program under the jurisdiction of a school, education agency, or other institution or program.  A student is a person who has been enrolled in a school or other educational institution.
 * 
 * <p>Java class for Student complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Student">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ed-fi.org/0100}ComplexObjectType">
 *       &lt;sequence>
 *         &lt;element name="StudentUniqueStateId" type="{http://ed-fi.org/0100}UniqueStateIdentifier"/>
 *         &lt;element name="StudentIdentificationCode" type="{http://ed-fi.org/0100}StudentIdentificationCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://ed-fi.org/0100}Name"/>
 *         &lt;element name="OtherName" type="{http://ed-fi.org/0100}OtherName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Sex" type="{http://ed-fi.org/0100}SexType"/>
 *         &lt;element name="BirthData" type="{http://ed-fi.org/0100}BirthData"/>
 *         &lt;element name="Address" type="{http://ed-fi.org/0100}Address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Telephone" type="{http://ed-fi.org/0100}Telephone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ElectronicMail" type="{http://ed-fi.org/0100}ElectronicMail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProfileThumbnail" type="{http://ed-fi.org/0100}ProfileThumbnail" minOccurs="0"/>
 *         &lt;element name="HispanicLatinoEthnicity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OldEthnicity" type="{http://ed-fi.org/0100}OldEthnicityType" minOccurs="0"/>
 *         &lt;element name="Race" type="{http://ed-fi.org/0100}RaceType"/>
 *         &lt;element name="EconomicDisadvantaged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SchoolFoodServicesEligibility" type="{http://ed-fi.org/0100}SchoolFoodServicesEligibilityType" minOccurs="0"/>
 *         &lt;element name="StudentCharacteristics" type="{http://ed-fi.org/0100}StudentCharacteristic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LimitedEnglishProficiency" type="{http://ed-fi.org/0100}LimitedEnglishProficiencyType" minOccurs="0"/>
 *         &lt;element name="Languages" type="{http://ed-fi.org/0100}LanguagesType" minOccurs="0"/>
 *         &lt;element name="HomeLanguages" type="{http://ed-fi.org/0100}LanguagesType" minOccurs="0"/>
 *         &lt;element name="Disabilities" type="{http://ed-fi.org/0100}Disability" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Section504Disabilities" type="{http://ed-fi.org/0100}Section504DisabilitiesType" minOccurs="0"/>
 *         &lt;element name="DisplacementStatus" type="{http://ed-fi.org/0100}DisplacementStatusType" minOccurs="0"/>
 *         &lt;element name="ProgramParticipations" type="{http://ed-fi.org/0100}ProgramParticipation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LearningStyles" type="{http://ed-fi.org/0100}LearningStyles" minOccurs="0"/>
 *         &lt;element name="CohortYears" type="{http://ed-fi.org/0100}CohortYear" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StudentIndicators" type="{http://ed-fi.org/0100}StudentIndicator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LoginId" type="{http://ed-fi.org/0100}IdentificationCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Student", propOrder = {
    "studentUniqueStateId",
    "studentIdentificationCode",
    "name",
    "otherName",
    "sex",
    "birthData",
    "address",
    "telephone",
    "electronicMail",
    "profileThumbnail",
    "hispanicLatinoEthnicity",
    "oldEthnicity",
    "race",
    "economicDisadvantaged",
    "schoolFoodServicesEligibility",
    "studentCharacteristics",
    "limitedEnglishProficiency",
    "languages",
    "homeLanguages",
    "disabilities",
    "section504Disabilities",
    "displacementStatus",
    "programParticipations",
    "learningStyles",
    "cohortYears",
    "studentIndicators",
    "loginId"
})
public class Student
    extends ComplexObjectType
{

    @XmlElement(name = "StudentUniqueStateId", required = true)
    protected String studentUniqueStateId;
    @XmlElement(name = "StudentIdentificationCode")
    protected List<StudentIdentificationCode> studentIdentificationCode;
    @XmlElement(name = "Name", required = true)
    protected Name name;
    @XmlElement(name = "OtherName")
    protected List<OtherName> otherName;
    @XmlElement(name = "Sex", required = true)
    protected SexType sex;
    @XmlElement(name = "BirthData", required = true)
    protected BirthData birthData;
    @XmlElement(name = "Address")
    protected List<Address> address;
    @XmlElement(name = "Telephone")
    protected List<Telephone> telephone;
    @XmlElement(name = "ElectronicMail")
    protected List<ElectronicMail> electronicMail;
    @XmlElement(name = "ProfileThumbnail")
    protected String profileThumbnail;
    @XmlElement(name = "HispanicLatinoEthnicity", required = true, type = Boolean.class, nillable = true)
    protected Boolean hispanicLatinoEthnicity;
    @XmlElement(name = "OldEthnicity")
    protected OldEthnicityType oldEthnicity;
    @XmlElement(name = "Race", required = true)
    protected RaceType race;
    @XmlElement(name = "EconomicDisadvantaged")
    protected Boolean economicDisadvantaged;
    @XmlElement(name = "SchoolFoodServicesEligibility")
    protected SchoolFoodServicesEligibilityType schoolFoodServicesEligibility;
    @XmlElement(name = "StudentCharacteristics")
    protected List<StudentCharacteristic> studentCharacteristics;
    @XmlElement(name = "LimitedEnglishProficiency")
    protected LimitedEnglishProficiencyType limitedEnglishProficiency;
    @XmlElement(name = "Languages")
    protected LanguagesType languages;
    @XmlElement(name = "HomeLanguages")
    protected LanguagesType homeLanguages;
    @XmlElement(name = "Disabilities")
    protected List<Disability> disabilities;
    @XmlElement(name = "Section504Disabilities")
    protected Section504DisabilitiesType section504Disabilities;
    @XmlElement(name = "DisplacementStatus")
    protected String displacementStatus;
    @XmlElement(name = "ProgramParticipations")
    protected List<ProgramParticipation> programParticipations;
    @XmlElement(name = "LearningStyles")
    protected LearningStyles learningStyles;
    @XmlElement(name = "CohortYears")
    protected List<CohortYear> cohortYears;
    @XmlElement(name = "StudentIndicators")
    protected List<StudentIndicator> studentIndicators;
    @XmlElement(name = "LoginId")
    protected String loginId;

    /**
     * Gets the value of the studentUniqueStateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentUniqueStateId() {
        return studentUniqueStateId;
    }

    /**
     * Sets the value of the studentUniqueStateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentUniqueStateId(String value) {
        this.studentUniqueStateId = value;
    }

    /**
     * Gets the value of the studentIdentificationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentIdentificationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentIdentificationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentIdentificationCode }
     * 
     * 
     */
    public List<StudentIdentificationCode> getStudentIdentificationCode() {
        if (studentIdentificationCode == null) {
            studentIdentificationCode = new ArrayList<StudentIdentificationCode>();
        }
        return this.studentIdentificationCode;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the otherName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherName }
     * 
     * 
     */
    public List<OtherName> getOtherName() {
        if (otherName == null) {
            otherName = new ArrayList<OtherName>();
        }
        return this.otherName;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link SexType }
     *     
     */
    public SexType getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link SexType }
     *     
     */
    public void setSex(SexType value) {
        this.sex = value;
    }

    /**
     * Gets the value of the birthData property.
     * 
     * @return
     *     possible object is
     *     {@link BirthData }
     *     
     */
    public BirthData getBirthData() {
        return birthData;
    }

    /**
     * Sets the value of the birthData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthData }
     *     
     */
    public void setBirthData(BirthData value) {
        this.birthData = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Telephone }
     * 
     * 
     */
    public List<Telephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<Telephone>();
        }
        return this.telephone;
    }

    /**
     * Gets the value of the electronicMail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicMail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicMail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicMail }
     * 
     * 
     */
    public List<ElectronicMail> getElectronicMail() {
        if (electronicMail == null) {
            electronicMail = new ArrayList<ElectronicMail>();
        }
        return this.electronicMail;
    }

    /**
     * Gets the value of the profileThumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileThumbnail() {
        return profileThumbnail;
    }

    /**
     * Sets the value of the profileThumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileThumbnail(String value) {
        this.profileThumbnail = value;
    }

    /**
     * Gets the value of the hispanicLatinoEthnicity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHispanicLatinoEthnicity() {
        return hispanicLatinoEthnicity;
    }

    /**
     * Sets the value of the hispanicLatinoEthnicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHispanicLatinoEthnicity(Boolean value) {
        this.hispanicLatinoEthnicity = value;
    }

    /**
     * Gets the value of the oldEthnicity property.
     * 
     * @return
     *     possible object is
     *     {@link OldEthnicityType }
     *     
     */
    public OldEthnicityType getOldEthnicity() {
        return oldEthnicity;
    }

    /**
     * Sets the value of the oldEthnicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OldEthnicityType }
     *     
     */
    public void setOldEthnicity(OldEthnicityType value) {
        this.oldEthnicity = value;
    }

    /**
     * Gets the value of the race property.
     * 
     * @return
     *     possible object is
     *     {@link RaceType }
     *     
     */
    public RaceType getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     * 
     * @param value
     *     allowed object is
     *     {@link RaceType }
     *     
     */
    public void setRace(RaceType value) {
        this.race = value;
    }

    /**
     * Gets the value of the economicDisadvantaged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEconomicDisadvantaged() {
        return economicDisadvantaged;
    }

    /**
     * Sets the value of the economicDisadvantaged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEconomicDisadvantaged(Boolean value) {
        this.economicDisadvantaged = value;
    }

    /**
     * Gets the value of the schoolFoodServicesEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolFoodServicesEligibilityType }
     *     
     */
    public SchoolFoodServicesEligibilityType getSchoolFoodServicesEligibility() {
        return schoolFoodServicesEligibility;
    }

    /**
     * Sets the value of the schoolFoodServicesEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolFoodServicesEligibilityType }
     *     
     */
    public void setSchoolFoodServicesEligibility(SchoolFoodServicesEligibilityType value) {
        this.schoolFoodServicesEligibility = value;
    }

    /**
     * Gets the value of the studentCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentCharacteristic }
     * 
     * 
     */
    public List<StudentCharacteristic> getStudentCharacteristics() {
        if (studentCharacteristics == null) {
            studentCharacteristics = new ArrayList<StudentCharacteristic>();
        }
        return this.studentCharacteristics;
    }

    /**
     * Gets the value of the limitedEnglishProficiency property.
     * 
     * @return
     *     possible object is
     *     {@link LimitedEnglishProficiencyType }
     *     
     */
    public LimitedEnglishProficiencyType getLimitedEnglishProficiency() {
        return limitedEnglishProficiency;
    }

    /**
     * Sets the value of the limitedEnglishProficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitedEnglishProficiencyType }
     *     
     */
    public void setLimitedEnglishProficiency(LimitedEnglishProficiencyType value) {
        this.limitedEnglishProficiency = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link LanguagesType }
     *     
     */
    public LanguagesType getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguagesType }
     *     
     */
    public void setLanguages(LanguagesType value) {
        this.languages = value;
    }

    /**
     * Gets the value of the homeLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link LanguagesType }
     *     
     */
    public LanguagesType getHomeLanguages() {
        return homeLanguages;
    }

    /**
     * Sets the value of the homeLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguagesType }
     *     
     */
    public void setHomeLanguages(LanguagesType value) {
        this.homeLanguages = value;
    }

    /**
     * Gets the value of the disabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Disability }
     * 
     * 
     */
    public List<Disability> getDisabilities() {
        if (disabilities == null) {
            disabilities = new ArrayList<Disability>();
        }
        return this.disabilities;
    }

    /**
     * Gets the value of the section504Disabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Section504DisabilitiesType }
     *     
     */
    public Section504DisabilitiesType getSection504Disabilities() {
        return section504Disabilities;
    }

    /**
     * Sets the value of the section504Disabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Section504DisabilitiesType }
     *     
     */
    public void setSection504Disabilities(Section504DisabilitiesType value) {
        this.section504Disabilities = value;
    }

    /**
     * Gets the value of the displacementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplacementStatus() {
        return displacementStatus;
    }

    /**
     * Sets the value of the displacementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplacementStatus(String value) {
        this.displacementStatus = value;
    }

    /**
     * Gets the value of the programParticipations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programParticipations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgramParticipations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgramParticipation }
     * 
     * 
     */
    public List<ProgramParticipation> getProgramParticipations() {
        if (programParticipations == null) {
            programParticipations = new ArrayList<ProgramParticipation>();
        }
        return this.programParticipations;
    }

    /**
     * Gets the value of the learningStyles property.
     * 
     * @return
     *     possible object is
     *     {@link LearningStyles }
     *     
     */
    public LearningStyles getLearningStyles() {
        return learningStyles;
    }

    /**
     * Sets the value of the learningStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningStyles }
     *     
     */
    public void setLearningStyles(LearningStyles value) {
        this.learningStyles = value;
    }

    /**
     * Gets the value of the cohortYears property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cohortYears property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCohortYears().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CohortYear }
     * 
     * 
     */
    public List<CohortYear> getCohortYears() {
        if (cohortYears == null) {
            cohortYears = new ArrayList<CohortYear>();
        }
        return this.cohortYears;
    }

    /**
     * Gets the value of the studentIndicators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentIndicators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentIndicators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentIndicator }
     * 
     * 
     */
    public List<StudentIndicator> getStudentIndicators() {
        if (studentIndicators == null) {
            studentIndicators = new ArrayList<StudentIndicator>();
        }
        return this.studentIndicators;
    }

    /**
     * Gets the value of the loginId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * Sets the value of the loginId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginId(String value) {
        this.loginId = value;
    }

}
