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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SqlSessionStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SqlSessionStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetSessionUserIdentifierStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetRoleStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetLocalTimeZoneStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetSessionCharacteristicsStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetCatalogStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetSchemaStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetNamesStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetPathStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetTransformGroupStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetSessionCollationStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetXmlOptionStatement"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SqlSessionStatementType", propOrder = {
    "setSessionUserIdentifierStatementOrSetRoleStatementOrSetLocalTimeZoneStatement"
})
public class SqlSessionStatementType {

    @XmlElements({
        @XmlElement(name = "SetSessionUserIdentifierStatement", type = SetSessionUserIdentifierStatementType.class),
        @XmlElement(name = "SetRoleStatement", type = SetRoleStatementType.class),
        @XmlElement(name = "SetLocalTimeZoneStatement", type = SetLocalTimeZoneStatementType.class),
        @XmlElement(name = "SetSessionCharacteristicsStatement", type = SetSessionCharacteristicsStatementType.class),
        @XmlElement(name = "SetCatalogStatement", type = SetCatalogStatementType.class),
        @XmlElement(name = "SetSchemaStatement", type = SetSchemaStatementType.class),
        @XmlElement(name = "SetNamesStatement", type = SetNamesStatementType.class),
        @XmlElement(name = "SetPathStatement", type = SetPathStatementType.class),
        @XmlElement(name = "SetTransformGroupStatement", type = SetTransformGroupStatementType.class),
        @XmlElement(name = "SetSessionCollationStatement", type = SetSessionCollationStatementType.class),
        @XmlElement(name = "SetXmlOptionStatement", type = SetXmlOptionStatementType.class)
    })
    protected Object setSessionUserIdentifierStatementOrSetRoleStatementOrSetLocalTimeZoneStatement;

    /**
     * Gets the value of the setSessionUserIdentifierStatementOrSetRoleStatementOrSetLocalTimeZoneStatement property.
     * 
     * @return
     *     possible object is
     *     {@link SetSessionUserIdentifierStatementType }
     *     {@link SetRoleStatementType }
     *     {@link SetLocalTimeZoneStatementType }
     *     {@link SetSessionCharacteristicsStatementType }
     *     {@link SetCatalogStatementType }
     *     {@link SetSchemaStatementType }
     *     {@link SetNamesStatementType }
     *     {@link SetPathStatementType }
     *     {@link SetTransformGroupStatementType }
     *     {@link SetSessionCollationStatementType }
     *     {@link SetXmlOptionStatementType }
     *     
     */
    public Object getSetSessionUserIdentifierStatementOrSetRoleStatementOrSetLocalTimeZoneStatement() {
        return setSessionUserIdentifierStatementOrSetRoleStatementOrSetLocalTimeZoneStatement;
    }

    /**
     * Sets the value of the setSessionUserIdentifierStatementOrSetRoleStatementOrSetLocalTimeZoneStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetSessionUserIdentifierStatementType }
     *     {@link SetRoleStatementType }
     *     {@link SetLocalTimeZoneStatementType }
     *     {@link SetSessionCharacteristicsStatementType }
     *     {@link SetCatalogStatementType }
     *     {@link SetSchemaStatementType }
     *     {@link SetNamesStatementType }
     *     {@link SetPathStatementType }
     *     {@link SetTransformGroupStatementType }
     *     {@link SetSessionCollationStatementType }
     *     {@link SetXmlOptionStatementType }
     *     
     */
    public void setSetSessionUserIdentifierStatementOrSetRoleStatementOrSetLocalTimeZoneStatement(Object value) {
        this.setSessionUserIdentifierStatementOrSetRoleStatementOrSetLocalTimeZoneStatement = value;
    }

}