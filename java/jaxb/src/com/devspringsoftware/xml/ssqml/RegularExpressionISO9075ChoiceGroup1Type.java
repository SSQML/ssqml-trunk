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
 * <p>Java class for RegularExpression_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegularExpression_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}RegularExpression"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}VerticalBar"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RegularTerm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegularExpression_ISO9075ChoiceGroup1Type", propOrder = {
    "regularExpression",
    "verticalBar",
    "regularTerm"
})
public class RegularExpressionISO9075ChoiceGroup1Type {

    @XmlElement(name = "RegularExpression", required = true)
    protected RegularExpressionType regularExpression;
    @XmlElement(name = "VerticalBar", required = true)
    protected String verticalBar;
    @XmlElement(name = "RegularTerm", required = true)
    protected RegularTermType regularTerm;

    /**
     * Gets the value of the regularExpression property.
     * 
     * @return
     *     possible object is
     *     {@link RegularExpressionType }
     *     
     */
    public RegularExpressionType getRegularExpression() {
        return regularExpression;
    }

    /**
     * Sets the value of the regularExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegularExpressionType }
     *     
     */
    public void setRegularExpression(RegularExpressionType value) {
        this.regularExpression = value;
    }

    /**
     * Gets the value of the verticalBar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerticalBar() {
        return verticalBar;
    }

    /**
     * Sets the value of the verticalBar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticalBar(String value) {
        this.verticalBar = value;
    }

    /**
     * Gets the value of the regularTerm property.
     * 
     * @return
     *     possible object is
     *     {@link RegularTermType }
     *     
     */
    public RegularTermType getRegularTerm() {
        return regularTerm;
    }

    /**
     * Sets the value of the regularTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegularTermType }
     *     
     */
    public void setRegularTerm(RegularTermType value) {
        this.regularTerm = value;
    }

}
