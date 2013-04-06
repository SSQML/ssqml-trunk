//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeclareCursorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeclareCursorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}DeclareStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CursorName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CursorSensitivity" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CursorScrollability" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CursorStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CursorHoldability" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CursorReturnability" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ForStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CursorSpecification"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclareCursorType", propOrder = {
    "declareStaticString",
    "cursorName",
    "cursorSensitivity",
    "cursorScrollability",
    "cursorStaticString",
    "cursorHoldability",
    "cursorReturnability",
    "forStaticString",
    "cursorSpecification"
})
public class DeclareCursorType {

    @XmlElement(name = "DeclareStaticString", required = true)
    protected DeclareStaticStringType declareStaticString;
    @XmlElement(name = "CursorName", required = true)
    protected LocalQualifiedNameType cursorName;
    @XmlElement(name = "CursorSensitivity")
    protected CursorSensitivityType cursorSensitivity;
    @XmlElement(name = "CursorScrollability")
    protected CursorScrollabilityType cursorScrollability;
    @XmlElement(name = "CursorStaticString", required = true)
    protected CursorStaticStringType cursorStaticString;
    @XmlElement(name = "CursorHoldability")
    protected CursorHoldabilityType cursorHoldability;
    @XmlElement(name = "CursorReturnability")
    protected CursorReturnabilityType cursorReturnability;
    @XmlElement(name = "ForStaticString", required = true)
    protected ForStaticStringType forStaticString;
    @XmlElementRef(name = "CursorSpecification", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<CursorSpecificationType> cursorSpecification;

    /**
     * Gets the value of the declareStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link DeclareStaticStringType }
     *     
     */
    public DeclareStaticStringType getDeclareStaticString() {
        return declareStaticString;
    }

    /**
     * Sets the value of the declareStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclareStaticStringType }
     *     
     */
    public void setDeclareStaticString(DeclareStaticStringType value) {
        this.declareStaticString = value;
    }

    /**
     * Gets the value of the cursorName property.
     * 
     * @return
     *     possible object is
     *     {@link LocalQualifiedNameType }
     *     
     */
    public LocalQualifiedNameType getCursorName() {
        return cursorName;
    }

    /**
     * Sets the value of the cursorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalQualifiedNameType }
     *     
     */
    public void setCursorName(LocalQualifiedNameType value) {
        this.cursorName = value;
    }

    /**
     * Gets the value of the cursorSensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link CursorSensitivityType }
     *     
     */
    public CursorSensitivityType getCursorSensitivity() {
        return cursorSensitivity;
    }

    /**
     * Sets the value of the cursorSensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CursorSensitivityType }
     *     
     */
    public void setCursorSensitivity(CursorSensitivityType value) {
        this.cursorSensitivity = value;
    }

    /**
     * Gets the value of the cursorScrollability property.
     * 
     * @return
     *     possible object is
     *     {@link CursorScrollabilityType }
     *     
     */
    public CursorScrollabilityType getCursorScrollability() {
        return cursorScrollability;
    }

    /**
     * Sets the value of the cursorScrollability property.
     * 
     * @param value
     *     allowed object is
     *     {@link CursorScrollabilityType }
     *     
     */
    public void setCursorScrollability(CursorScrollabilityType value) {
        this.cursorScrollability = value;
    }

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
     * Gets the value of the cursorHoldability property.
     * 
     * @return
     *     possible object is
     *     {@link CursorHoldabilityType }
     *     
     */
    public CursorHoldabilityType getCursorHoldability() {
        return cursorHoldability;
    }

    /**
     * Sets the value of the cursorHoldability property.
     * 
     * @param value
     *     allowed object is
     *     {@link CursorHoldabilityType }
     *     
     */
    public void setCursorHoldability(CursorHoldabilityType value) {
        this.cursorHoldability = value;
    }

    /**
     * Gets the value of the cursorReturnability property.
     * 
     * @return
     *     possible object is
     *     {@link CursorReturnabilityType }
     *     
     */
    public CursorReturnabilityType getCursorReturnability() {
        return cursorReturnability;
    }

    /**
     * Sets the value of the cursorReturnability property.
     * 
     * @param value
     *     allowed object is
     *     {@link CursorReturnabilityType }
     *     
     */
    public void setCursorReturnability(CursorReturnabilityType value) {
        this.cursorReturnability = value;
    }

    /**
     * Gets the value of the forStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ForStaticStringType }
     *     
     */
    public ForStaticStringType getForStaticString() {
        return forStaticString;
    }

    /**
     * Sets the value of the forStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForStaticStringType }
     *     
     */
    public void setForStaticString(ForStaticStringType value) {
        this.forStaticString = value;
    }

    /**
     * Gets the value of the cursorSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CursorSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CursorSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CursorSpecificationType }{@code >}
     *     
     */
    public JAXBElement<CursorSpecificationType> getCursorSpecification() {
        return cursorSpecification;
    }

    /**
     * Sets the value of the cursorSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CursorSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CursorSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CursorSpecificationType }{@code >}
     *     
     */
    public void setCursorSpecification(JAXBElement<CursorSpecificationType> value) {
        this.cursorSpecification = value;
    }

}
