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
 * <p>Java class for CompoundStatement_ISO9075ChoiceGroup2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompoundStatement_ISO9075ChoiceGroup2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}NotStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}AtomicStaticString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompoundStatement_ISO9075ChoiceGroup2Type", propOrder = {
    "notStaticString",
    "atomicStaticString"
})
public class CompoundStatementISO9075ChoiceGroup2Type {

    @XmlElement(name = "NotStaticString")
    protected NotStaticStringType notStaticString;
    @XmlElement(name = "AtomicStaticString", required = true)
    protected AtomicStaticStringType atomicStaticString;

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
     * Gets the value of the atomicStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link AtomicStaticStringType }
     *     
     */
    public AtomicStaticStringType getAtomicStaticString() {
        return atomicStaticString;
    }

    /**
     * Sets the value of the atomicStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtomicStaticStringType }
     *     
     */
    public void setAtomicStaticString(AtomicStaticStringType value) {
        this.atomicStaticString = value;
    }

}