//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.06 at 10:00:50 AM EST 
//


package org.slc.sli.test.edfi.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BehaviorCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BehaviorCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="State Law Crime"/>
 *     &lt;enumeration value="State Offense"/>
 *     &lt;enumeration value="School Violation"/>
 *     &lt;enumeration value="School Code of Conduct"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BehaviorCategoryType")
@XmlEnum
public enum BehaviorCategoryType {

    @XmlEnumValue("State Law Crime")
    STATE_LAW_CRIME("State Law Crime"),
    @XmlEnumValue("State Offense")
    STATE_OFFENSE("State Offense"),
    @XmlEnumValue("School Violation")
    SCHOOL_VIOLATION("School Violation"),
    @XmlEnumValue("School Code of Conduct")
    SCHOOL_CODE_OF_CONDUCT("School Code of Conduct");
    private final String value;

    BehaviorCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BehaviorCategoryType fromValue(String v) {
        for (BehaviorCategoryType c: BehaviorCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
