//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonValueExpressionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonValueExpressionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}NumericValueExpression"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}StringValueExpression"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DatetimeValueExpression"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}IntervalValueExpression"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}UserDefinedTypeValueExpression"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ReferenceValueExpression"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CollectionValueExpression"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlValueExpression"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonValueExpressionType", propOrder = {
    "numericValueExpressionOrStringValueExpressionOrDatetimeValueExpression"
})
public class CommonValueExpressionType {

    @XmlElementRefs({
        @XmlElementRef(name = "ReferenceValueExpression", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UserDefinedTypeValueExpression", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "XmlValueExpression", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IntervalValueExpression", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DatetimeValueExpression", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollectionValueExpression", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NumericValueExpression", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "StringValueExpression", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    })
    protected JAXBElement<?> numericValueExpressionOrStringValueExpressionOrDatetimeValueExpression;

    /**
     * Gets the value of the numericValueExpressionOrStringValueExpressionOrDatetimeValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntervalValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XmlPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DatetimeValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectionValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringValueExpressionType }{@code >}
     *     
     */
    public JAXBElement<?> getNumericValueExpressionOrStringValueExpressionOrDatetimeValueExpression() {
        return numericValueExpressionOrStringValueExpressionOrDatetimeValueExpression;
    }

    /**
     * Sets the value of the numericValueExpressionOrStringValueExpressionOrDatetimeValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntervalValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XmlPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DatetimeValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollectionValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringValueExpressionType }{@code >}
     *     
     */
    public void setNumericValueExpressionOrStringValueExpressionOrDatetimeValueExpression(JAXBElement<?> value) {
        this.numericValueExpressionOrStringValueExpressionOrDatetimeValueExpression = value;
    }

}
