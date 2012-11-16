//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.16 at 01:39:34 PM EST 
//


package org.slc.sli.test.edfi.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides alternative references for finance accounts during interchange. Use XML IDREF to reference a course record that is included in the interchange
 * 
 * <p>Java class for AccountReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ed-fi.org/0100}ReferenceType">
 *       &lt;sequence>
 *         &lt;element name="AccountIdentity" type="{http://ed-fi.org/0100}AccountIdentityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountReferenceType", propOrder = {
    "accountIdentity"
})
public class AccountReferenceType
    extends ReferenceType
{

    @XmlElement(name = "AccountIdentity")
    protected AccountIdentityType accountIdentity;

    /**
     * Gets the value of the accountIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentityType }
     *     
     */
    public AccountIdentityType getAccountIdentity() {
        return accountIdentity;
    }

    /**
     * Sets the value of the accountIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentityType }
     *     
     */
    public void setAccountIdentity(AccountIdentityType value) {
        this.accountIdentity = value;
    }

}
