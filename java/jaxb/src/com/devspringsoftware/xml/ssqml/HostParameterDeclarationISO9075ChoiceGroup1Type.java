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
 * <p>Java class for HostParameterDeclaration_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostParameterDeclaration_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}HostParameterName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}HostParameterDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostParameterDeclaration_ISO9075ChoiceGroup1Type", propOrder = {
    "hostParameterName",
    "hostParameterDataType"
})
public class HostParameterDeclarationISO9075ChoiceGroup1Type {

    @XmlElement(name = "HostParameterName", required = true)
    protected HostParameterNameType hostParameterName;
    @XmlElement(name = "HostParameterDataType", required = true)
    protected HostParameterDataTypeType hostParameterDataType;

    /**
     * Gets the value of the hostParameterName property.
     * 
     * @return
     *     possible object is
     *     {@link HostParameterNameType }
     *     
     */
    public HostParameterNameType getHostParameterName() {
        return hostParameterName;
    }

    /**
     * Sets the value of the hostParameterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostParameterNameType }
     *     
     */
    public void setHostParameterName(HostParameterNameType value) {
        this.hostParameterName = value;
    }

    /**
     * Gets the value of the hostParameterDataType property.
     * 
     * @return
     *     possible object is
     *     {@link HostParameterDataTypeType }
     *     
     */
    public HostParameterDataTypeType getHostParameterDataType() {
        return hostParameterDataType;
    }

    /**
     * Sets the value of the hostParameterDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostParameterDataTypeType }
     *     
     */
    public void setHostParameterDataType(HostParameterDataTypeType value) {
        this.hostParameterDataType = value;
    }

}
