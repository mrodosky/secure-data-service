//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.30 at 01:48:06 PM EDT 
//


package org.slc.sli.test.edfi.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdeaEligibilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdeaEligibilityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Not Applicable To This Student"/>
 *     &lt;enumeration value="Individuals With Disabilities Education Act"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdeaEligibilityType")
@XmlEnum
public enum IdeaEligibilityType {

    @XmlEnumValue("Not Applicable To This Student")
    NOT_APPLICABLE_TO_THIS_STUDENT("Not Applicable To This Student"),
    @XmlEnumValue("Individuals With Disabilities Education Act")
    INDIVIDUALS_WITH_DISABILITIES_EDUCATION_ACT("Individuals With Disabilities Education Act");
    private final String value;

    IdeaEligibilityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdeaEligibilityType fromValue(String v) {
        for (IdeaEligibilityType c: IdeaEligibilityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
