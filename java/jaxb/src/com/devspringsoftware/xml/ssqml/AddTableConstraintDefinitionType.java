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
 * <p>Java class for AddTableConstraintDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddTableConstraintDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}AddStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TableConstraintDefinition"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddTableConstraintDefinitionType", propOrder = {
    "addStaticString",
    "tableConstraintDefinition"
})
public class AddTableConstraintDefinitionType {

    @XmlElement(name = "AddStaticString", required = true)
    protected AddStaticStringType addStaticString;
    @XmlElement(name = "TableConstraintDefinition", required = true)
    protected TableConstraintDefinitionType tableConstraintDefinition;

    /**
     * Gets the value of the addStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link AddStaticStringType }
     *     
     */
    public AddStaticStringType getAddStaticString() {
        return addStaticString;
    }

    /**
     * Sets the value of the addStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddStaticStringType }
     *     
     */
    public void setAddStaticString(AddStaticStringType value) {
        this.addStaticString = value;
    }

    /**
     * Gets the value of the tableConstraintDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link TableConstraintDefinitionType }
     *     
     */
    public TableConstraintDefinitionType getTableConstraintDefinition() {
        return tableConstraintDefinition;
    }

    /**
     * Sets the value of the tableConstraintDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableConstraintDefinitionType }
     *     
     */
    public void setTableConstraintDefinition(TableConstraintDefinitionType value) {
        this.tableConstraintDefinition = value;
    }

}
