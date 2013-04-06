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
 * <p>Java class for DropSchemaStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DropSchemaStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}DropSchemaStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DropBehavior"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DropSchemaStatementType", propOrder = {
    "dropSchemaStaticString",
    "schemaName",
    "dropBehavior"
})
public class DropSchemaStatementType {

    @XmlElement(name = "DropSchemaStaticString", required = true)
    protected DropSchemaStaticStringType dropSchemaStaticString;
    @XmlElementRef(name = "SchemaName", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<SchemaNameType> schemaName;
    @XmlElement(name = "DropBehavior", required = true)
    protected DropBehaviorType dropBehavior;

    /**
     * Gets the value of the dropSchemaStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link DropSchemaStaticStringType }
     *     
     */
    public DropSchemaStaticStringType getDropSchemaStaticString() {
        return dropSchemaStaticString;
    }

    /**
     * Sets the value of the dropSchemaStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropSchemaStaticStringType }
     *     
     */
    public void setDropSchemaStaticString(DropSchemaStaticStringType value) {
        this.dropSchemaStaticString = value;
    }

    /**
     * Gets the value of the schemaName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SchemaNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchemaNameType }{@code >}
     *     
     */
    public JAXBElement<SchemaNameType> getSchemaName() {
        return schemaName;
    }

    /**
     * Sets the value of the schemaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SchemaNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchemaNameType }{@code >}
     *     
     */
    public void setSchemaName(JAXBElement<SchemaNameType> value) {
        this.schemaName = value;
    }

    /**
     * Gets the value of the dropBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link DropBehaviorType }
     *     
     */
    public DropBehaviorType getDropBehavior() {
        return dropBehavior;
    }

    /**
     * Sets the value of the dropBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropBehaviorType }
     *     
     */
    public void setDropBehavior(DropBehaviorType value) {
        this.dropBehavior = value;
    }

}
