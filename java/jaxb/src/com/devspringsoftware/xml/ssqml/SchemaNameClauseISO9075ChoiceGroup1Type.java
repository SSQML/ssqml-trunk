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
 * <p>Java class for SchemaNameClause_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchemaNameClause_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}AuthorizationStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaAuthorizationIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchemaNameClause_ISO9075ChoiceGroup1Type", propOrder = {
    "authorizationStaticString",
    "schemaAuthorizationIdentifier"
})
public class SchemaNameClauseISO9075ChoiceGroup1Type {

    @XmlElement(name = "AuthorizationStaticString", required = true)
    protected AuthorizationStaticStringType authorizationStaticString;
    @XmlElement(name = "SchemaAuthorizationIdentifier", required = true)
    protected AuthorizationIdentifierType schemaAuthorizationIdentifier;

    /**
     * Gets the value of the authorizationStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationStaticStringType }
     *     
     */
    public AuthorizationStaticStringType getAuthorizationStaticString() {
        return authorizationStaticString;
    }

    /**
     * Sets the value of the authorizationStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationStaticStringType }
     *     
     */
    public void setAuthorizationStaticString(AuthorizationStaticStringType value) {
        this.authorizationStaticString = value;
    }

    /**
     * Gets the value of the schemaAuthorizationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationIdentifierType }
     *     
     */
    public AuthorizationIdentifierType getSchemaAuthorizationIdentifier() {
        return schemaAuthorizationIdentifier;
    }

    /**
     * Sets the value of the schemaAuthorizationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationIdentifierType }
     *     
     */
    public void setSchemaAuthorizationIdentifier(AuthorizationIdentifierType value) {
        this.schemaAuthorizationIdentifier = value;
    }

}