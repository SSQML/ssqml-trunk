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
 * <p>Java class for AssignedRowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignedRowType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ContextuallyTypedRowValueExpression"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignedRowType", propOrder = {
    "contextuallyTypedRowValueExpression"
})
public class AssignedRowType {

    @XmlElement(name = "ContextuallyTypedRowValueExpression", required = true)
    protected ContextuallyTypedRowValueExpressionType contextuallyTypedRowValueExpression;

    /**
     * Gets the value of the contextuallyTypedRowValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link ContextuallyTypedRowValueExpressionType }
     *     
     */
    public ContextuallyTypedRowValueExpressionType getContextuallyTypedRowValueExpression() {
        return contextuallyTypedRowValueExpression;
    }

    /**
     * Sets the value of the contextuallyTypedRowValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextuallyTypedRowValueExpressionType }
     *     
     */
    public void setContextuallyTypedRowValueExpression(ContextuallyTypedRowValueExpressionType value) {
        this.contextuallyTypedRowValueExpression = value;
    }

}