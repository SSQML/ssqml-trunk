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
 * <p>Java class for DescribedObject_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribedObject_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}CursorStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ExtendedCursorName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}StructureStaticString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribedObject_ISO9075ChoiceGroup1Type", propOrder = {
    "cursorStaticString",
    "extendedCursorName",
    "structureStaticString"
})
public class DescribedObjectISO9075ChoiceGroup1Type {

    @XmlElement(name = "CursorStaticString", required = true)
    protected CursorStaticStringType cursorStaticString;
    @XmlElement(name = "ExtendedCursorName", required = true)
    protected ExtendedCursorNameType extendedCursorName;
    @XmlElement(name = "StructureStaticString", required = true)
    protected StructureStaticStringType structureStaticString;

    /**
     * Gets the value of the cursorStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link CursorStaticStringType }
     *     
     */
    public CursorStaticStringType getCursorStaticString() {
        return cursorStaticString;
    }

    /**
     * Sets the value of the cursorStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link CursorStaticStringType }
     *     
     */
    public void setCursorStaticString(CursorStaticStringType value) {
        this.cursorStaticString = value;
    }

    /**
     * Gets the value of the extendedCursorName property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedCursorNameType }
     *     
     */
    public ExtendedCursorNameType getExtendedCursorName() {
        return extendedCursorName;
    }

    /**
     * Sets the value of the extendedCursorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedCursorNameType }
     *     
     */
    public void setExtendedCursorName(ExtendedCursorNameType value) {
        this.extendedCursorName = value;
    }

    /**
     * Gets the value of the structureStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link StructureStaticStringType }
     *     
     */
    public StructureStaticStringType getStructureStaticString() {
        return structureStaticString;
    }

    /**
     * Sets the value of the structureStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructureStaticStringType }
     *     
     */
    public void setStructureStaticString(StructureStaticStringType value) {
        this.structureStaticString = value;
    }

}