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
 * <p>Java class for DatetimeValueExpression_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatetimeValueExpression_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}IntervalValueExpression"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}PlusSign"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DatetimeTerm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatetimeValueExpression_ISO9075ChoiceGroup1Type", propOrder = {
    "intervalValueExpression",
    "plusSign",
    "datetimeTerm"
})
public class DatetimeValueExpressionISO9075ChoiceGroup1Type {

    @XmlElementRef(name = "IntervalValueExpression", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<IntervalValueExpressionType> intervalValueExpression;
    @XmlElement(name = "PlusSign", required = true)
    protected String plusSign;
    @XmlElement(name = "DatetimeTerm", required = true)
    protected DatetimeFactorType datetimeTerm;

    /**
     * Gets the value of the intervalValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntervalValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalValueExpressionType }{@code >}
     *     
     */
    public JAXBElement<IntervalValueExpressionType> getIntervalValueExpression() {
        return intervalValueExpression;
    }

    /**
     * Sets the value of the intervalValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntervalValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalValueExpressionType }{@code >}
     *     
     */
    public void setIntervalValueExpression(JAXBElement<IntervalValueExpressionType> value) {
        this.intervalValueExpression = value;
    }

    /**
     * Gets the value of the plusSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlusSign() {
        return plusSign;
    }

    /**
     * Sets the value of the plusSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlusSign(String value) {
        this.plusSign = value;
    }

    /**
     * Gets the value of the datetimeTerm property.
     * 
     * @return
     *     possible object is
     *     {@link DatetimeFactorType }
     *     
     */
    public DatetimeFactorType getDatetimeTerm() {
        return datetimeTerm;
    }

    /**
     * Sets the value of the datetimeTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatetimeFactorType }
     *     
     */
    public void setDatetimeTerm(DatetimeFactorType value) {
        this.datetimeTerm = value;
    }

}