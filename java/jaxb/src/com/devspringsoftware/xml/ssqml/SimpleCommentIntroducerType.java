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
 * <p>Java class for SimpleCommentIntroducerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleCommentIntroducerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}MinusSignMinusSignMinusSign"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleCommentIntroducerType", propOrder = {
    "minusSignMinusSignMinusSign"
})
public class SimpleCommentIntroducerType {

    @XmlElement(name = "MinusSignMinusSignMinusSign", required = true)
    protected String minusSignMinusSignMinusSign;

    /**
     * Gets the value of the minusSignMinusSignMinusSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinusSignMinusSignMinusSign() {
        return minusSignMinusSignMinusSign;
    }

    /**
     * Sets the value of the minusSignMinusSignMinusSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinusSignMinusSignMinusSign(String value) {
        this.minusSignMinusSignMinusSign = value;
    }

}