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
 * <p>Java class for QualifiedAsterisk_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualifiedAsterisk_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}AsteriskedIdentifierChain"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Period"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Asterisk"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifiedAsterisk_ISO9075ChoiceGroup1Type", propOrder = {
    "asteriskedIdentifierChain",
    "period",
    "asterisk"
})
public class QualifiedAsteriskISO9075ChoiceGroup1Type {

    @XmlElement(name = "AsteriskedIdentifierChain", required = true)
    protected AsteriskedIdentifierChainType asteriskedIdentifierChain;
    @XmlElement(name = "Period", required = true)
    protected String period;
    @XmlElement(name = "Asterisk", required = true)
    protected String asterisk;

    /**
     * Gets the value of the asteriskedIdentifierChain property.
     * 
     * @return
     *     possible object is
     *     {@link AsteriskedIdentifierChainType }
     *     
     */
    public AsteriskedIdentifierChainType getAsteriskedIdentifierChain() {
        return asteriskedIdentifierChain;
    }

    /**
     * Sets the value of the asteriskedIdentifierChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsteriskedIdentifierChainType }
     *     
     */
    public void setAsteriskedIdentifierChain(AsteriskedIdentifierChainType value) {
        this.asteriskedIdentifierChain = value;
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

}