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
 * <p>Java class for YearMonthLiteral_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YearMonthLiteral_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}YearsValue2" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}MinusSign" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}MonthsValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YearMonthLiteral_ISO9075ChoiceGroup1Type", propOrder = {
    "yearsValue2",
    "minusSign",
    "monthsValue"
})
public class YearMonthLiteralISO9075ChoiceGroup1Type {

    @XmlElement(name = "YearsValue2")
    protected String yearsValue2;
    @XmlElement(name = "MinusSign")
    protected String minusSign;
    @XmlElement(name = "MonthsValue", required = true)
    protected String monthsValue;

    /**
     * Gets the value of the yearsValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearsValue2() {
        return yearsValue2;
    }

    /**
     * Sets the value of the yearsValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearsValue2(String value) {
        this.yearsValue2 = value;
    }

    /**
     * Gets the value of the minusSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinusSign() {
        return minusSign;
    }

    /**
     * Sets the value of the minusSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinusSign(String value) {
        this.minusSign = value;
    }

    /**
     * Gets the value of the monthsValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthsValue() {
        return monthsValue;
    }

    /**
     * Sets the value of the monthsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthsValue(String value) {
        this.monthsValue = value;
    }

}