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
 * <p>Java class for DefaultClauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefaultClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}DefaultStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DefaultOption"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultClauseType", propOrder = {
    "defaultStaticString",
    "defaultOption"
})
public class DefaultClauseType {

    @XmlElement(name = "DefaultStaticString", required = true)
    protected DefaultStaticStringType defaultStaticString;
    @XmlElement(name = "DefaultOption", required = true)
    protected DefaultOptionType defaultOption;

    /**
     * Gets the value of the defaultStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultStaticStringType }
     *     
     */
    public DefaultStaticStringType getDefaultStaticString() {
        return defaultStaticString;
    }

    /**
     * Sets the value of the defaultStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultStaticStringType }
     *     
     */
    public void setDefaultStaticString(DefaultStaticStringType value) {
        this.defaultStaticString = value;
    }

    /**
     * Gets the value of the defaultOption property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultOptionType }
     *     
     */
    public DefaultOptionType getDefaultOption() {
        return defaultOption;
    }

    /**
     * Sets the value of the defaultOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultOptionType }
     *     
     */
    public void setDefaultOption(DefaultOptionType value) {
        this.defaultOption = value;
    }

}