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
 * <p>Java class for RowValueExpressionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowValueExpressionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}RowValueSpecialCase"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ExplicitRowValueConstructor"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowValueExpressionType", propOrder = {
    "rowValueSpecialCaseOrExplicitRowValueConstructor"
})
public class RowValueExpressionType {

    @XmlElements({
        @XmlElement(name = "RowValueSpecialCase", type = NonparenthesizedValueExpressionPrimaryType.class),
        @XmlElement(name = "ExplicitRowValueConstructor", type = ExplicitRowValueConstructorType.class)
    })
    protected Object rowValueSpecialCaseOrExplicitRowValueConstructor;

    /**
     * Gets the value of the rowValueSpecialCaseOrExplicitRowValueConstructor property.
     * 
     * @return
     *     possible object is
     *     {@link NonparenthesizedValueExpressionPrimaryType }
     *     {@link ExplicitRowValueConstructorType }
     *     
     */
    public Object getRowValueSpecialCaseOrExplicitRowValueConstructor() {
        return rowValueSpecialCaseOrExplicitRowValueConstructor;
    }

    /**
     * Sets the value of the rowValueSpecialCaseOrExplicitRowValueConstructor property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonparenthesizedValueExpressionPrimaryType }
     *     {@link ExplicitRowValueConstructorType }
     *     
     */
    public void setRowValueSpecialCaseOrExplicitRowValueConstructor(Object value) {
        this.rowValueSpecialCaseOrExplicitRowValueConstructor = value;
    }

}
