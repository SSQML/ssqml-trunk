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
 * <p>Java class for TokenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}NondelimiterToken"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DelimiterToken"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenType", propOrder = {
    "nondelimiterTokenOrDelimiterToken"
})
public class TokenType {

    @XmlElements({
        @XmlElement(name = "NondelimiterToken", type = NondelimiterTokenType.class),
        @XmlElement(name = "DelimiterToken", type = DelimiterTokenType.class)
    })
    protected Object nondelimiterTokenOrDelimiterToken;

    /**
     * Gets the value of the nondelimiterTokenOrDelimiterToken property.
     * 
     * @return
     *     possible object is
     *     {@link NondelimiterTokenType }
     *     {@link DelimiterTokenType }
     *     
     */
    public Object getNondelimiterTokenOrDelimiterToken() {
        return nondelimiterTokenOrDelimiterToken;
    }

    /**
     * Sets the value of the nondelimiterTokenOrDelimiterToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link NondelimiterTokenType }
     *     {@link DelimiterTokenType }
     *     
     */
    public void setNondelimiterTokenOrDelimiterToken(Object value) {
        this.nondelimiterTokenOrDelimiterToken = value;
    }

}
