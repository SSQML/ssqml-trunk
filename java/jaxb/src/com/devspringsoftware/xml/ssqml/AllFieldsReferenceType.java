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
 * <p>Java class for AllFieldsReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllFieldsReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ValueExpressionPrimary"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Period"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Asterisk"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}AsStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}AllFieldsColumnNameList" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RightParen" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllFieldsReferenceType", propOrder = {
    "valueExpressionPrimary",
    "period",
    "asterisk",
    "asStaticString",
    "leftParen",
    "allFieldsColumnNameList",
    "rightParen"
})
public class AllFieldsReferenceType {

    @XmlElementRef(name = "ValueExpressionPrimary", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<ValueExpressionPrimaryType> valueExpressionPrimary;
    @XmlElement(name = "Period", required = true)
    protected String period;
    @XmlElement(name = "Asterisk", required = true)
    protected String asterisk;
    @XmlElement(name = "AsStaticString")
    protected AsStaticStringType asStaticString;
    @XmlElement(name = "LeftParen")
    protected String leftParen;
    @XmlElement(name = "AllFieldsColumnNameList")
    protected AllFieldsColumnNameListType allFieldsColumnNameList;
    @XmlElement(name = "RightParen")
    protected String rightParen;

    /**
     * Gets the value of the valueExpressionPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     
     */
    public JAXBElement<ValueExpressionPrimaryType> getValueExpressionPrimary() {
        return valueExpressionPrimary;
    }

    /**
     * Sets the value of the valueExpressionPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     
     */
    public void setValueExpressionPrimary(JAXBElement<ValueExpressionPrimaryType> value) {
        this.valueExpressionPrimary = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets the value of the asterisk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsterisk() {
        return asterisk;
    }

    /**
     * Sets the value of the asterisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsterisk(String value) {
        this.asterisk = value;
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
     * Gets the value of the allFieldsColumnNameList property.
     * 
     * @return
     *     possible object is
     *     {@link AllFieldsColumnNameListType }
     *     
     */
    public AllFieldsColumnNameListType getAllFieldsColumnNameList() {
        return allFieldsColumnNameList;
    }

    /**
     * Sets the value of the allFieldsColumnNameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllFieldsColumnNameListType }
     *     
     */
    public void setAllFieldsColumnNameList(AllFieldsColumnNameListType value) {
        this.allFieldsColumnNameList = value;
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