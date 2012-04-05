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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An accountability rating for a school or district.
 * 
 * <p>Java class for AccountabilityRating complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountabilityRating">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatingTitle" type="{http://ed-fi.org/0100}RatingTitleType"/>
 *         &lt;element name="Rating" type="{http://ed-fi.org/0100}Rating"/>
 *         &lt;element name="RatingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SchoolYear" type="{http://ed-fi.org/0100}SchoolYearType"/>
 *         &lt;element name="RatingOrganization" type="{http://ed-fi.org/0100}RatingOrganization" minOccurs="0"/>
 *         &lt;element name="RatingProgram" type="{http://ed-fi.org/0100}RatingProgramType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountabilityRating", propOrder = {
    "ratingTitle",
    "rating",
    "ratingDate",
    "schoolYear",
    "ratingOrganization",
    "ratingProgram"
})
public class AccountabilityRating {

    @XmlElement(name = "RatingTitle", required = true)
    protected String ratingTitle;
    @XmlElement(name = "Rating", required = true)
    protected String rating;
    @XmlElement(name = "RatingDate")
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected String ratingDate;
    @XmlElement(name = "SchoolYear", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolYear;
    @XmlElement(name = "RatingOrganization")
    protected String ratingOrganization;
    @XmlElement(name = "RatingProgram")
    protected String ratingProgram;

    /**
     * Gets the value of the ratingTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingTitle() {
        return ratingTitle;
    }

    /**
     * Sets the value of the ratingTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingTitle(String value) {
        this.ratingTitle = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRating(String value) {
        this.rating = value;
    }

    /**
     * Gets the value of the ratingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingDate() {
        return ratingDate;
    }

    /**
     * Sets the value of the ratingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingDate(String value) {
        this.ratingDate = value;
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
     * Gets the value of the ratingOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingOrganization() {
        return ratingOrganization;
    }

    /**
     * Sets the value of the ratingOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingOrganization(String value) {
        this.ratingOrganization = value;
    }

    /**
     * Gets the value of the ratingProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingProgram() {
        return ratingProgram;
    }

    /**
     * Sets the value of the ratingProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingProgram(String value) {
        this.ratingProgram = value;
    }

}
