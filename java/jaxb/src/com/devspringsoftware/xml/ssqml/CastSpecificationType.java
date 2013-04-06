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
 * <p>Java class for CastSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CastSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}CastStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CastOperand"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}AsStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CastTarget"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RightParen"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CastSpecificationType", propOrder = {
    "castStaticString",
    "leftParen",
    "castOperand",
    "asStaticString",
    "castTarget",
    "rightParen"
})
public class CastSpecificationType {

    @XmlElement(name = "CastStaticString", required = true)
    protected CastStaticStringType castStaticString;
    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;
    @XmlElement(name = "CastOperand", required = true)
    protected CastOperandType castOperand;
    @XmlElement(name = "AsStaticString", required = true)
    protected AsStaticStringType asStaticString;
    @XmlElement(name = "CastTarget", required = true)
    protected CastTargetType castTarget;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;

    /**
     * Gets the value of the castStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link CastStaticStringType }
     *     
     */
    public CastStaticStringType getCastStaticString() {
        return castStaticString;
    }

    /**
     * Sets the value of the castStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link CastStaticStringType }
     *     
     */
    public void setCastStaticString(CastStaticStringType value) {
        this.castStaticString = value;
    }

    /**
     * Gets the value of the leftParen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftParen() {
        return leftParen;
    }

    /**
     * Sets the value of the leftParen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftParen(String value) {
        this.leftParen = value;
    }

    /**
     * Gets the value of the castOperand property.
     * 
     * @return
     *     possible object is
     *     {@link CastOperandType }
     *     
     */
    public CastOperandType getCastOperand() {
        return castOperand;
    }

    /**
     * Sets the value of the castOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link CastOperandType }
     *     
     */
    public void setCastOperand(CastOperandType value) {
        this.castOperand = value;
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
     * Gets the value of the castTarget property.
     * 
     * @return
     *     possible object is
     *     {@link CastTargetType }
     *     
     */
    public CastTargetType getCastTarget() {
        return castTarget;
    }

    /**
     * Sets the value of the castTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link CastTargetType }
     *     
     */
    public void setCastTarget(CastTargetType value) {
        this.castTarget = value;
    }

    /**
     * Gets the value of the rightParen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightParen() {
        return rightParen;
    }

    /**
     * Sets the value of the rightParen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightParen(String value) {
        this.rightParen = value;
    }

}