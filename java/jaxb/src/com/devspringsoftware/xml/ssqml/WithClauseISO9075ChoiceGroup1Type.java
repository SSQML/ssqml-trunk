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
 * <p>Java class for WithClause_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WithClause_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}RecursiveStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}WithList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WithClause_ISO9075ChoiceGroup1Type", propOrder = {
    "recursiveStaticString",
    "withList"
})
public class WithClauseISO9075ChoiceGroup1Type {

    @XmlElement(name = "RecursiveStaticString")
    protected RecursiveStaticStringType recursiveStaticString;
    @XmlElement(name = "WithList", required = true)
    protected WithListType withList;

    /**
     * Gets the value of the recursiveStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link RecursiveStaticStringType }
     *     
     */
    public RecursiveStaticStringType getRecursiveStaticString() {
        return recursiveStaticString;
    }

    /**
     * Sets the value of the recursiveStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecursiveStaticStringType }
     *     
     */
    public void setRecursiveStaticString(RecursiveStaticStringType value) {
        this.recursiveStaticString = value;
    }

    /**
     * Gets the value of the withList property.
     * 
     * @return
     *     possible object is
     *     {@link WithListType }
     *     
     */
    public WithListType getWithList() {
        return withList;
    }

    /**
     * Sets the value of the withList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithListType }
     *     
     */
    public void setWithList(WithListType value) {
        this.withList = value;
    }

}
