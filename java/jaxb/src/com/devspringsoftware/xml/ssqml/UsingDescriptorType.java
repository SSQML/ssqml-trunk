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
 * <p>Java class for UsingDescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsingDescriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}UsingStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DescriptorStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DescriptorName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsingDescriptorType", propOrder = {
    "usingStaticString",
    "sqlStaticString",
    "descriptorStaticString",
    "descriptorName"
})
public class UsingDescriptorType {

    @XmlElement(name = "UsingStaticString", required = true)
    protected UsingStaticStringType usingStaticString;
    @XmlElement(name = "SqlStaticString")
    protected SqlStaticStringType sqlStaticString;
    @XmlElement(name = "DescriptorStaticString", required = true)
    protected DescriptorStaticStringType descriptorStaticString;
    @XmlElement(name = "DescriptorName", required = true)
    protected DescriptorNameType descriptorName;

    /**
     * Gets the value of the usingStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link UsingStaticStringType }
     *     
     */
    public UsingStaticStringType getUsingStaticString() {
        return usingStaticString;
    }

    /**
     * Sets the value of the usingStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsingStaticStringType }
     *     
     */
    public void setUsingStaticString(UsingStaticStringType value) {
        this.usingStaticString = value;
    }

    /**
     * Gets the value of the sqlStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link SqlStaticStringType }
     *     
     */
    public SqlStaticStringType getSqlStaticString() {
        return sqlStaticString;
    }

    /**
     * Sets the value of the sqlStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlStaticStringType }
     *     
     */
    public void setSqlStaticString(SqlStaticStringType value) {
        this.sqlStaticString = value;
    }

    /**
     * Gets the value of the descriptorStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptorStaticStringType }
     *     
     */
    public DescriptorStaticStringType getDescriptorStaticString() {
        return descriptorStaticString;
    }

    /**
     * Sets the value of the descriptorStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptorStaticStringType }
     *     
     */
    public void setDescriptorStaticString(DescriptorStaticStringType value) {
        this.descriptorStaticString = value;
    }

    /**
     * Gets the value of the descriptorName property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptorNameType }
     *     
     */
    public DescriptorNameType getDescriptorName() {
        return descriptorName;
    }

    /**
     * Sets the value of the descriptorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptorNameType }
     *     
     */
    public void setDescriptorName(DescriptorNameType value) {
        this.descriptorName = value;
    }

}
