//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstraintCharacteristics_ISO9075ChoiceGroup3Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstraintCharacteristics_ISO9075ChoiceGroup3Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}NotStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DeferrableStaticString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintCharacteristics_ISO9075ChoiceGroup3Type", propOrder = {
    "notStaticString",
    "deferrableStaticString"
})
public class ConstraintCharacteristicsISO9075ChoiceGroup3Type {

    @XmlElement(name = "NotStaticString")
    protected NotStaticStringType notStaticString;
    @XmlElement(name = "DeferrableStaticString", required = true)
    protected DeferrableStaticStringType deferrableStaticString;

    /**
     * Gets the value of the notStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link NotStaticStringType }
     *     
     */
    public NotStaticStringType getNotStaticString() {
        return notStaticString;
    }

    /**
     * Sets the value of the notStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotStaticStringType }
     *     
     */
    public void setNotStaticString(NotStaticStringType value) {
        this.notStaticString = value;
    }

    /**
     * Gets the value of the deferrableStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link DeferrableStaticStringType }
     *     
     */
    public DeferrableStaticStringType getDeferrableStaticString() {
        return deferrableStaticString;
    }

    /**
     * Sets the value of the deferrableStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeferrableStaticStringType }
     *     
     */
    public void setDeferrableStaticString(DeferrableStaticStringType value) {
        this.deferrableStaticString = value;
    }

}
