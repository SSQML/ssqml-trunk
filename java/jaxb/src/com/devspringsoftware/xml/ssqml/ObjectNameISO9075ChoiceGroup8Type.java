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
 * <p>Java class for ObjectName_ISO9075ChoiceGroup8Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectName_ISO9075ChoiceGroup8Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ModuleStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlServerModuleName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectName_ISO9075ChoiceGroup8Type", propOrder = {
    "moduleStaticString",
    "sqlServerModuleName"
})
public class ObjectNameISO9075ChoiceGroup8Type {

    @XmlElementRef(name = "ModuleStaticString", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<ModuleStaticStringType> moduleStaticString;
    @XmlElement(name = "SqlServerModuleName", required = true)
    protected SchemaQualifiedNameType sqlServerModuleName;

    /**
     * Gets the value of the moduleStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ModuleStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ModuleStaticStringType }{@code >}
     *     
     */
    public JAXBElement<ModuleStaticStringType> getModuleStaticString() {
        return moduleStaticString;
    }

    /**
     * Sets the value of the moduleStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ModuleStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ModuleStaticStringType }{@code >}
     *     
     */
    public void setModuleStaticString(JAXBElement<ModuleStaticStringType> value) {
        this.moduleStaticString = value;
    }

    /**
     * Gets the value of the sqlServerModuleName property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaQualifiedNameType }
     *     
     */
    public SchemaQualifiedNameType getSqlServerModuleName() {
        return sqlServerModuleName;
    }

    /**
     * Sets the value of the sqlServerModuleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaQualifiedNameType }
     *     
     */
    public void setSqlServerModuleName(SchemaQualifiedNameType value) {
        this.sqlServerModuleName = value;
    }

}