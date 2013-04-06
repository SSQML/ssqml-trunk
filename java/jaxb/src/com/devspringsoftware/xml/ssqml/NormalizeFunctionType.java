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
 * <p>Java class for NormalizeFunctionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NormalizeFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}NormalizeStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterValueExpression"/>
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
@XmlType(name = "NormalizeFunctionType", propOrder = {
    "normalizeStaticString",
    "leftParen",
    "characterValueExpression",
    "rightParen"
})
public class NormalizeFunctionType {

    @XmlElement(name = "NormalizeStaticString", required = true)
    protected NormalizeStaticStringType normalizeStaticString;
    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;
    @XmlElementRef(name = "CharacterValueExpression", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<CharacterValueExpressionType> characterValueExpression;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;

    /**
     * Gets the value of the normalizeStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link NormalizeStaticStringType }
     *     
     */
    public NormalizeStaticStringType getNormalizeStaticString() {
        return normalizeStaticString;
    }

    /**
     * Sets the value of the normalizeStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link NormalizeStaticStringType }
     *     
     */
    public void setNormalizeStaticString(NormalizeStaticStringType value) {
        this.normalizeStaticString = value;
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
     * Gets the value of the characterValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CharacterValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterValueExpressionType }{@code >}
     *     
     */
    public JAXBElement<CharacterValueExpressionType> getCharacterValueExpression() {
        return characterValueExpression;
    }

    /**
     * Sets the value of the characterValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CharacterValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterValueExpressionType }{@code >}
     *     
     */
    public void setCharacterValueExpression(JAXBElement<CharacterValueExpressionType> value) {
        this.characterValueExpression = value;
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