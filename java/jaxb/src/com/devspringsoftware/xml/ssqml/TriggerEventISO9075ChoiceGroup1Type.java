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
 * <p>Java class for TriggerEvent_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriggerEvent_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}UpdateStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}OfStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TriggerColumnList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggerEvent_ISO9075ChoiceGroup1Type", propOrder = {
    "updateStaticString",
    "ofStaticString",
    "triggerColumnList"
})
public class TriggerEventISO9075ChoiceGroup1Type {

    @XmlElement(name = "UpdateStaticString", required = true)
    protected UpdateStaticStringType updateStaticString;
    @XmlElement(name = "OfStaticString")
    protected OfStaticStringType ofStaticString;
    @XmlElement(name = "TriggerColumnList")
    protected ColumnNameListType triggerColumnList;

    /**
     * Gets the value of the updateStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateStaticStringType }
     *     
     */
    public UpdateStaticStringType getUpdateStaticString() {
        return updateStaticString;
    }

    /**
     * Sets the value of the updateStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateStaticStringType }
     *     
     */
    public void setUpdateStaticString(UpdateStaticStringType value) {
        this.updateStaticString = value;
    }

    /**
     * Gets the value of the ofStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link OfStaticStringType }
     *     
     */
    public OfStaticStringType getOfStaticString() {
        return ofStaticString;
    }

    /**
     * Sets the value of the ofStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfStaticStringType }
     *     
     */
    public void setOfStaticString(OfStaticStringType value) {
        this.ofStaticString = value;
    }

    /**
     * Gets the value of the triggerColumnList property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnNameListType }
     *     
     */
    public ColumnNameListType getTriggerColumnList() {
        return triggerColumnList;
    }

    /**
     * Sets the value of the triggerColumnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnNameListType }
     *     
     */
    public void setTriggerColumnList(ColumnNameListType value) {
        this.triggerColumnList = value;
    }

}
