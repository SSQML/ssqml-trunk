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
 * <p>Java class for SetTransformGroupStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetTransformGroupStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TransformGroupCharacteristic"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetTransformGroupStatementType", propOrder = {
    "setStaticString",
    "transformGroupCharacteristic"
})
public class SetTransformGroupStatementType {

    @XmlElement(name = "SetStaticString", required = true)
    protected SetStaticStringType setStaticString;
    @XmlElement(name = "TransformGroupCharacteristic", required = true)
    protected TransformGroupCharacteristicType transformGroupCharacteristic;

    /**
     * Gets the value of the setStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link SetStaticStringType }
     *     
     */
    public SetStaticStringType getSetStaticString() {
        return setStaticString;
    }

    /**
     * Sets the value of the setStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetStaticStringType }
     *     
     */
    public void setSetStaticString(SetStaticStringType value) {
        this.setStaticString = value;
    }

    /**
     * Gets the value of the transformGroupCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link TransformGroupCharacteristicType }
     *     
     */
    public TransformGroupCharacteristicType getTransformGroupCharacteristic() {
        return transformGroupCharacteristic;
    }

    /**
     * Sets the value of the transformGroupCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformGroupCharacteristicType }
     *     
     */
    public void setTransformGroupCharacteristic(TransformGroupCharacteristicType value) {
        this.transformGroupCharacteristic = value;
    }

}