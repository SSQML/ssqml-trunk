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
 * <p>Java class for SchemaNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchemaNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}CatalogName" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Period" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}UnqualifiedSchemaName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchemaNameType", propOrder = {
    "catalogName",
    "period",
    "unqualifiedSchemaName"
})
public class SchemaNameType {

    @XmlElement(name = "CatalogName")
    protected ActualIdentifierType catalogName;
    @XmlElement(name = "Period")
    protected String period;
    @XmlElement(name = "UnqualifiedSchemaName", required = true)
    protected ActualIdentifierType unqualifiedSchemaName;

    /**
     * Gets the value of the catalogName property.
     * 
     * @return
     *     possible object is
     *     {@link ActualIdentifierType }
     *     
     */
    public ActualIdentifierType getCatalogName() {
        return catalogName;
    }

    /**
     * Sets the value of the catalogName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualIdentifierType }
     *     
     */
    public void setCatalogName(ActualIdentifierType value) {
        this.catalogName = value;
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
     * Gets the value of the unqualifiedSchemaName property.
     * 
     * @return
     *     possible object is
     *     {@link ActualIdentifierType }
     *     
     */
    public ActualIdentifierType getUnqualifiedSchemaName() {
        return unqualifiedSchemaName;
    }

    /**
     * Sets the value of the unqualifiedSchemaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualIdentifierType }
     *     
     */
    public void setUnqualifiedSchemaName(ActualIdentifierType value) {
        this.unqualifiedSchemaName = value;
    }

}