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
 * <p>Java class for XmlValidAccordingToUri_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XmlValidAccordingToUri_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}UriStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlValidTargetNamespace"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlValidSchemaLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlValidAccordingToUri_ISO9075ChoiceGroup1Type", propOrder = {
    "uriStaticString",
    "xmlValidTargetNamespace",
    "xmlValidSchemaLocation"
})
public class XmlValidAccordingToUriISO9075ChoiceGroup1Type {

    @XmlElement(name = "UriStaticString", required = true)
    protected UriStaticStringType uriStaticString;
    @XmlElement(name = "XmlValidTargetNamespace", required = true)
    protected CharacterStringLiteralType xmlValidTargetNamespace;
    @XmlElement(name = "XmlValidSchemaLocation")
    protected XmlValidSchemaLocationType xmlValidSchemaLocation;

    /**
     * Gets the value of the uriStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link UriStaticStringType }
     *     
     */
    public UriStaticStringType getUriStaticString() {
        return uriStaticString;
    }

    /**
     * Sets the value of the uriStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link UriStaticStringType }
     *     
     */
    public void setUriStaticString(UriStaticStringType value) {
        this.uriStaticString = value;
    }

    /**
     * Gets the value of the xmlValidTargetNamespace property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringLiteralType }
     *     
     */
    public CharacterStringLiteralType getXmlValidTargetNamespace() {
        return xmlValidTargetNamespace;
    }

    /**
     * Sets the value of the xmlValidTargetNamespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringLiteralType }
     *     
     */
    public void setXmlValidTargetNamespace(CharacterStringLiteralType value) {
        this.xmlValidTargetNamespace = value;
    }

    /**
     * Gets the value of the xmlValidSchemaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValidSchemaLocationType }
     *     
     */
    public XmlValidSchemaLocationType getXmlValidSchemaLocation() {
        return xmlValidSchemaLocation;
    }

    /**
     * Sets the value of the xmlValidSchemaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValidSchemaLocationType }
     *     
     */
    public void setXmlValidSchemaLocation(XmlValidSchemaLocationType value) {
        this.xmlValidSchemaLocation = value;
    }

}