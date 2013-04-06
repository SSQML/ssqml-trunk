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
 * <p>Java class for SetItemInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetItemInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}DescriptorItemName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}EqualsOperator"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SimpleValueSpecification2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetItemInformationType", propOrder = {
    "descriptorItemName",
    "equalsOperator",
    "simpleValueSpecification2"
})
public class SetItemInformationType {

    @XmlElement(name = "DescriptorItemName", required = true)
    protected DescriptorItemNameType descriptorItemName;
    @XmlElement(name = "EqualsOperator", required = true)
    protected String equalsOperator;
    @XmlElement(name = "SimpleValueSpecification2", required = true)
    protected SimpleValueSpecificationType simpleValueSpecification2;

    /**
     * Gets the value of the descriptorItemName property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptorItemNameType }
     *     
     */
    public DescriptorItemNameType getDescriptorItemName() {
        return descriptorItemName;
    }

    /**
     * Sets the value of the descriptorItemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptorItemNameType }
     *     
     */
    public void setDescriptorItemName(DescriptorItemNameType value) {
        this.descriptorItemName = value;
    }

    /**
     * Gets the value of the equalsOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqualsOperator() {
        return equalsOperator;
    }

    /**
     * Sets the value of the equalsOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqualsOperator(String value) {
        this.equalsOperator = value;
    }

    /**
     * Gets the value of the simpleValueSpecification2 property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleValueSpecificationType }
     *     
     */
    public SimpleValueSpecificationType getSimpleValueSpecification2() {
        return simpleValueSpecification2;
    }

    /**
     * Sets the value of the simpleValueSpecification2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleValueSpecificationType }
     *     
     */
    public void setSimpleValueSpecification2(SimpleValueSpecificationType value) {
        this.simpleValueSpecification2 = value;
    }

}