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
 * <p>Java class for DatetimeValueExpression_ISO9075ChoiceGroup4Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatetimeValueExpression_ISO9075ChoiceGroup4Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}PlusSign"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}IntervalTerm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatetimeValueExpression_ISO9075ChoiceGroup4Type", propOrder = {
    "plusSign",
    "intervalTerm"
})
public class DatetimeValueExpressionISO9075ChoiceGroup4Type {

    @XmlElement(name = "PlusSign", required = true)
    protected String plusSign;
    @XmlElementRef(name = "IntervalTerm", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<IntervalTermType> intervalTerm;

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
     * Gets the value of the intervalTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntervalTermType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalTermType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalTermType }{@code >}
     *     
     */
    public JAXBElement<IntervalTermType> getIntervalTerm() {
        return intervalTerm;
    }

    /**
     * Sets the value of the intervalTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntervalTermType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalTermType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalTermType }{@code >}
     *     
     */
    public void setIntervalTerm(JAXBElement<IntervalTermType> value) {
        this.intervalTerm = value;
    }

}