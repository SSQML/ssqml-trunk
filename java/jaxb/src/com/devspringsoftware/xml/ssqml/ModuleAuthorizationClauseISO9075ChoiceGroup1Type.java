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
 * <p>Java class for ModuleAuthorizationClause_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModuleAuthorizationClause_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModuleAuthorizationClause_ISO9075ChoiceGroup1Type", propOrder = {
    "schemaStaticString",
    "schemaName"
})
public class ModuleAuthorizationClauseISO9075ChoiceGroup1Type {

    @XmlElement(name = "SchemaStaticString", required = true)
    protected SchemaStaticStringType schemaStaticString;
    @XmlElementRef(name = "SchemaName", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<SchemaNameType> schemaName;

    /**
     * Gets the value of the schemaStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaStaticStringType }
     *     
     */
    public SchemaStaticStringType getSchemaStaticString() {
        return schemaStaticString;
    }

    /**
     * Sets the value of the schemaStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaStaticStringType }
     *     
     */
    public void setSchemaStaticString(SchemaStaticStringType value) {
        this.schemaStaticString = value;
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

}
