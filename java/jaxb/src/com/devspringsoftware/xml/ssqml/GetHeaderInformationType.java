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
 * <p>Java class for GetHeaderInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHeaderInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SimpleTargetSpecification1"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}EqualsOperator"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}HeaderItemName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHeaderInformationType", propOrder = {
    "simpleTargetSpecification1",
    "equalsOperator",
    "headerItemName"
})
public class GetHeaderInformationType {

    @XmlElement(name = "SimpleTargetSpecification1", required = true)
    protected SimpleTargetSpecificationType simpleTargetSpecification1;
    @XmlElement(name = "EqualsOperator", required = true)
    protected String equalsOperator;
    @XmlElement(name = "HeaderItemName", required = true)
    protected HeaderItemNameType headerItemName;

    /**
     * Gets the value of the simpleTargetSpecification1 property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleTargetSpecificationType }
     *     
     */
    public SimpleTargetSpecificationType getSimpleTargetSpecification1() {
        return simpleTargetSpecification1;
    }

    /**
     * Sets the value of the simpleTargetSpecification1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleTargetSpecificationType }
     *     
     */
    public void setSimpleTargetSpecification1(SimpleTargetSpecificationType value) {
        this.simpleTargetSpecification1 = value;
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
     * Gets the value of the headerItemName property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderItemNameType }
     *     
     */
    public HeaderItemNameType getHeaderItemName() {
        return headerItemName;
    }

    /**
     * Sets the value of the headerItemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderItemNameType }
     *     
     */
    public void setHeaderItemName(HeaderItemNameType value) {
        this.headerItemName = value;
    }

}