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
 * <p>Java class for UniqueConstraintDefinition_ISO9075ChoiceGroup2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniqueConstraintDefinition_ISO9075ChoiceGroup2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}UniqueStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RightParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ValueStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniqueConstraintDefinition_ISO9075ChoiceGroup2Type", propOrder = {
    "uniqueStaticString",
    "rightParen",
    "valueStaticString",
    "leftParen"
})
public class UniqueConstraintDefinitionISO9075ChoiceGroup2Type {

    @XmlElement(name = "UniqueStaticString", required = true)
    protected UniqueStaticStringType uniqueStaticString;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;
    @XmlElement(name = "ValueStaticString", required = true)
    protected ValueStaticStringType valueStaticString;
    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;

    /**
     * Gets the value of the uniqueStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueStaticStringType }
     *     
     */
    public UniqueStaticStringType getUniqueStaticString() {
        return uniqueStaticString;
    }

    /**
     * Sets the value of the uniqueStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueStaticStringType }
     *     
     */
    public void setUniqueStaticString(UniqueStaticStringType value) {
        this.uniqueStaticString = value;
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
     * Gets the value of the valueStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ValueStaticStringType }
     *     
     */
    public ValueStaticStringType getValueStaticString() {
        return valueStaticString;
    }

    /**
     * Sets the value of the valueStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueStaticStringType }
     *     
     */
    public void setValueStaticString(ValueStaticStringType value) {
        this.valueStaticString = value;
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

}
