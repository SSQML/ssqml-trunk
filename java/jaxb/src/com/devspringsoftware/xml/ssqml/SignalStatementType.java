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
 * <p>Java class for SignalStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignalStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SignalStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SignalValue"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetSignalInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignalStatementType", propOrder = {
    "signalStaticString",
    "signalValue",
    "setSignalInformation"
})
public class SignalStatementType {

    @XmlElement(name = "SignalStaticString", required = true)
    protected SignalStaticStringType signalStaticString;
    @XmlElement(name = "SignalValue", required = true)
    protected SignalValueType signalValue;
    @XmlElement(name = "SetSignalInformation")
    protected SetSignalInformationType setSignalInformation;

    /**
     * Gets the value of the signalStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link SignalStaticStringType }
     *     
     */
    public SignalStaticStringType getSignalStaticString() {
        return signalStaticString;
    }

    /**
     * Sets the value of the signalStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalStaticStringType }
     *     
     */
    public void setSignalStaticString(SignalStaticStringType value) {
        this.signalStaticString = value;
    }

    /**
     * Gets the value of the signalValue property.
     * 
     * @return
     *     possible object is
     *     {@link SignalValueType }
     *     
     */
    public SignalValueType getSignalValue() {
        return signalValue;
    }

    /**
     * Sets the value of the signalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalValueType }
     *     
     */
    public void setSignalValue(SignalValueType value) {
        this.signalValue = value;
    }

    /**
     * Gets the value of the setSignalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SetSignalInformationType }
     *     
     */
    public SetSignalInformationType getSetSignalInformation() {
        return setSignalInformation;
    }

    /**
     * Sets the value of the setSignalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetSignalInformationType }
     *     
     */
    public void setSetSignalInformation(SetSignalInformationType value) {
        this.setSignalInformation = value;
    }

}
