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
 * <p>Java class for XmlReturningClauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XmlReturningClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ReturningStaticString"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.devspringsoftware.com}ContentStaticString"/>
 *           &lt;element ref="{http://www.devspringsoftware.com}SequenceStaticString"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlReturningClauseType", propOrder = {
    "returningStaticString",
    "contentStaticStringOrSequenceStaticString"
})
public class XmlReturningClauseType {

    @XmlElement(name = "ReturningStaticString", required = true)
    protected ReturningStaticStringType returningStaticString;
    @XmlElements({
        @XmlElement(name = "ContentStaticString", type = ContentStaticStringType.class),
        @XmlElement(name = "SequenceStaticString", type = SequenceStaticStringType.class)
    })
    protected Object contentStaticStringOrSequenceStaticString;

    /**
     * Gets the value of the returningStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ReturningStaticStringType }
     *     
     */
    public ReturningStaticStringType getReturningStaticString() {
        return returningStaticString;
    }

    /**
     * Sets the value of the returningStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturningStaticStringType }
     *     
     */
    public void setReturningStaticString(ReturningStaticStringType value) {
        this.returningStaticString = value;
    }

    /**
     * Gets the value of the contentStaticStringOrSequenceStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ContentStaticStringType }
     *     {@link SequenceStaticStringType }
     *     
     */
    public Object getContentStaticStringOrSequenceStaticString() {
        return contentStaticStringOrSequenceStaticString;
    }

    /**
     * Sets the value of the contentStaticStringOrSequenceStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentStaticStringType }
     *     {@link SequenceStaticStringType }
     *     
     */
    public void setContentStaticStringOrSequenceStaticString(Object value) {
        this.contentStaticStringOrSequenceStaticString = value;
    }

}