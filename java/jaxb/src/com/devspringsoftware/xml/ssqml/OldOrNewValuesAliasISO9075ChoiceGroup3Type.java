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
 * <p>Java class for OldOrNewValuesAlias_ISO9075ChoiceGroup3Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OldOrNewValuesAlias_ISO9075ChoiceGroup3Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}OldTableStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}AsStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}OldValuesTableAlias"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OldOrNewValuesAlias_ISO9075ChoiceGroup3Type", propOrder = {
    "oldTableStaticString",
    "asStaticString",
    "oldValuesTableAlias"
})
public class OldOrNewValuesAliasISO9075ChoiceGroup3Type {

    @XmlElement(name = "OldTableStaticString", required = true)
    protected OldTableStaticStringType oldTableStaticString;
    @XmlElement(name = "AsStaticString")
    protected AsStaticStringType asStaticString;
    @XmlElement(name = "OldValuesTableAlias", required = true)
    protected ActualIdentifierType oldValuesTableAlias;

    /**
     * Gets the value of the oldTableStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link OldTableStaticStringType }
     *     
     */
    public OldTableStaticStringType getOldTableStaticString() {
        return oldTableStaticString;
    }

    /**
     * Sets the value of the oldTableStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link OldTableStaticStringType }
     *     
     */
    public void setOldTableStaticString(OldTableStaticStringType value) {
        this.oldTableStaticString = value;
    }

    /**
     * Gets the value of the asStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link AsStaticStringType }
     *     
     */
    public AsStaticStringType getAsStaticString() {
        return asStaticString;
    }

    /**
     * Sets the value of the asStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsStaticStringType }
     *     
     */
    public void setAsStaticString(AsStaticStringType value) {
        this.asStaticString = value;
    }

    /**
     * Gets the value of the oldValuesTableAlias property.
     * 
     * @return
     *     possible object is
     *     {@link ActualIdentifierType }
     *     
     */
    public ActualIdentifierType getOldValuesTableAlias() {
        return oldValuesTableAlias;
    }

    /**
     * Sets the value of the oldValuesTableAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualIdentifierType }
     *     
     */
    public void setOldValuesTableAlias(ActualIdentifierType value) {
        this.oldValuesTableAlias = value;
    }

}
