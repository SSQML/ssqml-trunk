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
 * <p>Java class for UserDefinedOrderingDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDefinedOrderingDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}CreateOrderingForStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaResolvedUserDefinedTypeName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}OrderingForm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDefinedOrderingDefinitionType", propOrder = {
    "createOrderingForStaticString",
    "schemaResolvedUserDefinedTypeName",
    "orderingForm"
})
public class UserDefinedOrderingDefinitionType {

    @XmlElement(name = "CreateOrderingForStaticString", required = true)
    protected CreateOrderingForStaticStringType createOrderingForStaticString;
    @XmlElement(name = "SchemaResolvedUserDefinedTypeName", required = true)
    protected SchemaQualifiedTypeNameType schemaResolvedUserDefinedTypeName;
    @XmlElement(name = "OrderingForm", required = true)
    protected OrderingFormType orderingForm;

    /**
     * Gets the value of the createOrderingForStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link CreateOrderingForStaticStringType }
     *     
     */
    public CreateOrderingForStaticStringType getCreateOrderingForStaticString() {
        return createOrderingForStaticString;
    }

    /**
     * Sets the value of the createOrderingForStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateOrderingForStaticStringType }
     *     
     */
    public void setCreateOrderingForStaticString(CreateOrderingForStaticStringType value) {
        this.createOrderingForStaticString = value;
    }

    /**
     * Gets the value of the schemaResolvedUserDefinedTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaQualifiedTypeNameType }
     *     
     */
    public SchemaQualifiedTypeNameType getSchemaResolvedUserDefinedTypeName() {
        return schemaResolvedUserDefinedTypeName;
    }

    /**
     * Sets the value of the schemaResolvedUserDefinedTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaQualifiedTypeNameType }
     *     
     */
    public void setSchemaResolvedUserDefinedTypeName(SchemaQualifiedTypeNameType value) {
        this.schemaResolvedUserDefinedTypeName = value;
    }

    /**
     * Gets the value of the orderingForm property.
     * 
     * @return
     *     possible object is
     *     {@link OrderingFormType }
     *     
     */
    public OrderingFormType getOrderingForm() {
        return orderingForm;
    }

    /**
     * Sets the value of the orderingForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderingFormType }
     *     
     */
    public void setOrderingForm(OrderingFormType value) {
        this.orderingForm = value;
    }

}