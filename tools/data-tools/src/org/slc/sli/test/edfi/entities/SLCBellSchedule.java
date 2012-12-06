//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.06 at 10:00:50 AM EST 
//


package org.slc.sli.test.edfi.entities;import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Changed types of SessionReference, MeetingTimeReference and CalendarDateReference to SLC reference types.
 * 
 * <p>Java class for SLC-BellSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SLC-BellSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ed-fi.org/0100}ComplexObjectType">
 *       &lt;sequence>
 *         &lt;element name="BellScheduleName" type="{http://ed-fi.org/0100}BellScheduleName"/>
 *         &lt;element name="GradeLevels" type="{http://ed-fi.org/0100}GradeLevelsType"/>
 *         &lt;element name="WeeksInCycle">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="52"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SessionReference" type="{http://ed-fi.org/0100}SLC-SessionReferenceType"/>
 *         &lt;element name="MeetingTimeReference" type="{http://ed-fi.org/0100}SLC-MeetingTimeReferenceType" maxOccurs="unbounded"/>
 *         &lt;element name="CalendarDateReference" type="{http://ed-fi.org/0100}SLC-CalendarDateReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLC-BellSchedule", propOrder = {
    "bellScheduleName",
    "gradeLevels",
    "weeksInCycle",
    "sessionReference",
    "meetingTimeReference",
    "calendarDateReference"
})
@XmlRootElement public class SLCBellSchedule
    extends ComplexObjectType
{

    @XmlElement(name = "BellScheduleName", required = true)
    protected String bellScheduleName;
    @XmlElement(name = "GradeLevels", required = true)
    protected GradeLevelsType gradeLevels;
    @XmlElement(name = "WeeksInCycle")
    protected int weeksInCycle;
    @XmlElement(name = "SessionReference", required = true)
    protected SLCSessionReferenceType sessionReference;
    @XmlElement(name = "MeetingTimeReference", required = true)
    protected List<SLCMeetingTimeReferenceType> meetingTimeReference;
    @XmlElement(name = "CalendarDateReference")
    protected List<SLCCalendarDateReferenceType> calendarDateReference;

    /**
     * Gets the value of the bellScheduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBellScheduleName() {
        return bellScheduleName;
    }

    /**
     * Sets the value of the bellScheduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBellScheduleName(String value) {
        this.bellScheduleName = value;
    }

    /**
     * Gets the value of the gradeLevels property.
     * 
     * @return
     *     possible object is
     *     {@link GradeLevelsType }
     *     
     */
    public GradeLevelsType getGradeLevels() {
        return gradeLevels;
    }

    /**
     * Sets the value of the gradeLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeLevelsType }
     *     
     */
    public void setGradeLevels(GradeLevelsType value) {
        this.gradeLevels = value;
    }

    /**
     * Gets the value of the weeksInCycle property.
     * 
     */
    public int getWeeksInCycle() {
        return weeksInCycle;
    }

    /**
     * Sets the value of the weeksInCycle property.
     * 
     */
    public void setWeeksInCycle(int value) {
        this.weeksInCycle = value;
    }

    /**
     * Gets the value of the sessionReference property.
     * 
     * @return
     *     possible object is
     *     {@link SLCSessionReferenceType }
     *     
     */
    public SLCSessionReferenceType getSessionReference() {
        return sessionReference;
    }

    /**
     * Sets the value of the sessionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SLCSessionReferenceType }
     *     
     */
    public void setSessionReference(SLCSessionReferenceType value) {
        this.sessionReference = value;
    }

    /**
     * Gets the value of the meetingTimeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meetingTimeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeetingTimeReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SLCMeetingTimeReferenceType }
     * 
     * 
     */
    public List<SLCMeetingTimeReferenceType> getMeetingTimeReference() {
        if (meetingTimeReference == null) {
            meetingTimeReference = new ArrayList<SLCMeetingTimeReferenceType>();
        }
        return this.meetingTimeReference;
    }

    /**
     * Gets the value of the calendarDateReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calendarDateReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalendarDateReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SLCCalendarDateReferenceType }
     * 
     * 
     */
    public List<SLCCalendarDateReferenceType> getCalendarDateReference() {
        if (calendarDateReference == null) {
            calendarDateReference = new ArrayList<SLCCalendarDateReferenceType>();
        }
        return this.calendarDateReference;
    }

}
