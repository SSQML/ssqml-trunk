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
 * <p>Java class for FactorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FactorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}Sign" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}NumericPrimary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FactorType", propOrder = {
    "sign",
    "numericPrimary"
})
public class FactorType {

    @XmlElement(name = "Sign")
    protected SignType sign;
    @XmlElement(name = "NumericPrimary", required = true)
    protected NumericPrimaryType numericPrimary;

    /**
     * Gets the value of the sign property.
     * 
     * @return
     *     possible object is
     *     {@link SignType }
     *     
     */
    public SignType getSign() {
        return sign;
    }

    /**
     * Sets the value of the sign property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignType }
     *     
     */
    public void setSign(SignType value) {
        this.sign = value;
    }

    /**
     * Gets the value of the numericPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link NumericPrimaryType }
     *     
     */
    public NumericPrimaryType getNumericPrimary() {
        return numericPrimary;
    }

    /**
     * Sets the value of the numericPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericPrimaryType }
     *     
     */
    public void setNumericPrimary(NumericPrimaryType value) {
        this.numericPrimary = value;
    }

}