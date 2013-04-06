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
 * <p>Java class for TriggerDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriggerDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}CreateTriggerStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TriggerName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TriggerActionTime"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TriggerEvent"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}OnStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TableName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ReferencingStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}OldOrNewValuesAliasList" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TriggeredAction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriggerDefinitionType", propOrder = {
    "createTriggerStaticString",
    "triggerName",
    "triggerActionTime",
    "triggerEvent",
    "onStaticString",
    "tableName",
    "referencingStaticString",
    "oldOrNewValuesAliasList",
    "triggeredAction"
})
public class TriggerDefinitionType {

    @XmlElement(name = "CreateTriggerStaticString", required = true)
    protected CreateTriggerStaticStringType createTriggerStaticString;
    @XmlElement(name = "TriggerName", required = true)
    protected SchemaQualifiedNameType triggerName;
    @XmlElement(name = "TriggerActionTime", required = true)
    protected TriggerActionTimeType triggerActionTime;
    @XmlElement(name = "TriggerEvent", required = true)
    protected TriggerEventType triggerEvent;
    @XmlElement(name = "OnStaticString", required = true)
    protected OnStaticStringType onStaticString;
    @XmlElementRef(name = "TableName", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<LocalOrSchemaQualifiedNameType> tableName;
    @XmlElement(name = "ReferencingStaticString")
    protected ReferencingStaticStringType referencingStaticString;
    @XmlElement(name = "OldOrNewValuesAliasList")
    protected OldOrNewValuesAliasListType oldOrNewValuesAliasList;
    @XmlElement(name = "TriggeredAction", required = true)
    protected TriggeredActionType triggeredAction;

    /**
     * Gets the value of the createTriggerStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link CreateTriggerStaticStringType }
     *     
     */
    public CreateTriggerStaticStringType getCreateTriggerStaticString() {
        return createTriggerStaticString;
    }

    /**
     * Sets the value of the createTriggerStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateTriggerStaticStringType }
     *     
     */
    public void setCreateTriggerStaticString(CreateTriggerStaticStringType value) {
        this.createTriggerStaticString = value;
    }

    /**
     * Gets the value of the triggerName property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaQualifiedNameType }
     *     
     */
    public SchemaQualifiedNameType getTriggerName() {
        return triggerName;
    }

    /**
     * Sets the value of the triggerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaQualifiedNameType }
     *     
     */
    public void setTriggerName(SchemaQualifiedNameType value) {
        this.triggerName = value;
    }

    /**
     * Gets the value of the triggerActionTime property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerActionTimeType }
     *     
     */
    public TriggerActionTimeType getTriggerActionTime() {
        return triggerActionTime;
    }

    /**
     * Sets the value of the triggerActionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerActionTimeType }
     *     
     */
    public void setTriggerActionTime(TriggerActionTimeType value) {
        this.triggerActionTime = value;
    }

    /**
     * Gets the value of the triggerEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerEventType }
     *     
     */
    public TriggerEventType getTriggerEvent() {
        return triggerEvent;
    }

    /**
     * Sets the value of the triggerEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerEventType }
     *     
     */
    public void setTriggerEvent(TriggerEventType value) {
        this.triggerEvent = value;
    }

    /**
     * Gets the value of the onStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link OnStaticStringType }
     *     
     */
    public OnStaticStringType getOnStaticString() {
        return onStaticString;
    }

    /**
     * Sets the value of the onStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnStaticStringType }
     *     
     */
    public void setOnStaticString(OnStaticStringType value) {
        this.onStaticString = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     
     */
    public JAXBElement<LocalOrSchemaQualifiedNameType> getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     
     */
    public void setTableName(JAXBElement<LocalOrSchemaQualifiedNameType> value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the referencingStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencingStaticStringType }
     *     
     */
    public ReferencingStaticStringType getReferencingStaticString() {
        return referencingStaticString;
    }

    /**
     * Sets the value of the referencingStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencingStaticStringType }
     *     
     */
    public void setReferencingStaticString(ReferencingStaticStringType value) {
        this.referencingStaticString = value;
    }

    /**
     * Gets the value of the oldOrNewValuesAliasList property.
     * 
     * @return
     *     possible object is
     *     {@link OldOrNewValuesAliasListType }
     *     
     */
    public OldOrNewValuesAliasListType getOldOrNewValuesAliasList() {
        return oldOrNewValuesAliasList;
    }

    /**
     * Sets the value of the oldOrNewValuesAliasList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OldOrNewValuesAliasListType }
     *     
     */
    public void setOldOrNewValuesAliasList(OldOrNewValuesAliasListType value) {
        this.oldOrNewValuesAliasList = value;
    }

    /**
     * Gets the value of the triggeredAction property.
     * 
     * @return
     *     possible object is
     *     {@link TriggeredActionType }
     *     
     */
    public TriggeredActionType getTriggeredAction() {
        return triggeredAction;
    }

    /**
     * Sets the value of the triggeredAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggeredActionType }
     *     
     */
    public void setTriggeredAction(TriggeredActionType value) {
        this.triggeredAction = value;
    }

}
