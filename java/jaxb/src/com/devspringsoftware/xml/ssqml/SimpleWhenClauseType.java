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
 * <p>Java class for SimpleWhenClauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleWhenClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}WhenStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}WhenOperand"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ThenStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Result"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleWhenClauseType", propOrder = {
    "whenStaticString",
    "whenOperand",
    "thenStaticString",
    "result"
})
public class SimpleWhenClauseType {

    @XmlElement(name = "WhenStaticString", required = true)
    protected WhenStaticStringType whenStaticString;
    @XmlElement(name = "WhenOperand", required = true)
    protected WhenOperandType whenOperand;
    @XmlElement(name = "ThenStaticString", required = true)
    protected ThenStaticStringType thenStaticString;
    @XmlElement(name = "Result", required = true)
    protected ResultType result;

    /**
     * Gets the value of the whenStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link WhenStaticStringType }
     *     
     */
    public WhenStaticStringType getWhenStaticString() {
        return whenStaticString;
    }

    /**
     * Sets the value of the whenStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhenStaticStringType }
     *     
     */
    public void setWhenStaticString(WhenStaticStringType value) {
        this.whenStaticString = value;
    }

    /**
     * Gets the value of the whenOperand property.
     * 
     * @return
     *     possible object is
     *     {@link WhenOperandType }
     *     
     */
    public WhenOperandType getWhenOperand() {
        return whenOperand;
    }

    /**
     * Sets the value of the whenOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhenOperandType }
     *     
     */
    public void setWhenOperand(WhenOperandType value) {
        this.whenOperand = value;
    }

    /**
     * Gets the value of the thenStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ThenStaticStringType }
     *     
     */
    public ThenStaticStringType getThenStaticString() {
        return thenStaticString;
    }

    /**
     * Sets the value of the thenStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThenStaticStringType }
     *     
     */
    public void setThenStaticString(ThenStaticStringType value) {
        this.thenStaticString = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultType }
     *     
     */
    public ResultType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultType }
     *     
     */
    public void setResult(ResultType value) {
        this.result = value;
    }

}