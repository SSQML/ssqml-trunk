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
 * <p>Java class for CommaWithListElementItemtypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommaWithListElementItemtypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}Comma"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}WithListElement"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommaWithListElementItemtypeType", propOrder = {
    "comma",
    "withListElement"
})
public class CommaWithListElementItemtypeType {

    @XmlElement(name = "Comma", required = true)
    protected String comma;
    @XmlElement(name = "WithListElement", required = true)
    protected WithListElementType withListElement;

    /**
     * Gets the value of the comma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComma() {
        return comma;
    }

    /**
     * Sets the value of the comma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComma(String value) {
        this.comma = value;
    }

    /**
     * Gets the value of the withListElement property.
     * 
     * @return
     *     possible object is
     *     {@link WithListElementType }
     *     
     */
    public WithListElementType getWithListElement() {
        return withListElement;
    }

    /**
     * Sets the value of the withListElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithListElementType }
     *     
     */
    public void setWithListElement(WithListElementType value) {
        this.withListElement = value;
    }

}