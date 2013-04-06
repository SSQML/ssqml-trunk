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
 * <p>Java class for CastToTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CastToTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}CastStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RefAsSourceStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RightParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}WithStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CastToTypeIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CastToTypeType", propOrder = {
    "castStaticString",
    "leftParen",
    "refAsSourceStaticString",
    "rightParen",
    "withStaticString",
    "castToTypeIdentifier"
})
public class CastToTypeType {

    @XmlElement(name = "CastStaticString", required = true)
    protected CastStaticStringType castStaticString;
    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;
    @XmlElement(name = "RefAsSourceStaticString", required = true)
    protected RefAsSourceStaticStringType refAsSourceStaticString;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;
    @XmlElement(name = "WithStaticString", required = true)
    protected WithStaticStringType withStaticString;
    @XmlElement(name = "CastToTypeIdentifier", required = true)
    protected ActualIdentifierType castToTypeIdentifier;

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
     * Gets the value of the refAsSourceStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link RefAsSourceStaticStringType }
     *     
     */
    public RefAsSourceStaticStringType getRefAsSourceStaticString() {
        return refAsSourceStaticString;
    }

    /**
     * Sets the value of the refAsSourceStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefAsSourceStaticStringType }
     *     
     */
    public void setRefAsSourceStaticString(RefAsSourceStaticStringType value) {
        this.refAsSourceStaticString = value;
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

    /**
     * Gets the value of the withStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link WithStaticStringType }
     *     
     */
    public WithStaticStringType getWithStaticString() {
        return withStaticString;
    }

    /**
     * Sets the value of the withStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithStaticStringType }
     *     
     */
    public void setWithStaticString(WithStaticStringType value) {
        this.withStaticString = value;
    }

    /**
     * Gets the value of the castToTypeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ActualIdentifierType }
     *     
     */
    public ActualIdentifierType getCastToTypeIdentifier() {
        return castToTypeIdentifier;
    }

    /**
     * Sets the value of the castToTypeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualIdentifierType }
     *     
     */
    public void setCastToTypeIdentifier(ActualIdentifierType value) {
        this.castToTypeIdentifier = value;
    }

}
