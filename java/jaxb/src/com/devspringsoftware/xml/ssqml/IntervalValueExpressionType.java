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
 * <p>Java class for IntervalValueExpressionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntervalValueExpressionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}IntervalTerm"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}IntervalValueExpression_ISO9075ChoiceGroup1"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}IntervalValueExpression_ISO9075ChoiceGroup2"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntervalValueExpressionType", propOrder = {
    "intervalTermOrIntervalValueExpressionISO9075ChoiceGroup1OrIntervalValueExpressionISO9075ChoiceGroup2"
})
public class IntervalValueExpressionType {

    @XmlElementRefs({
        @XmlElementRef(name = "IntervalTerm", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IntervalValueExpression_ISO9075ChoiceGroup1", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IntervalValueExpression_ISO9075ChoiceGroup2", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    })
    protected JAXBElement<?> intervalTermOrIntervalValueExpressionISO9075ChoiceGroup1OrIntervalValueExpressionISO9075ChoiceGroup2;

    /**
     * Gets the value of the intervalTermOrIntervalValueExpressionISO9075ChoiceGroup1OrIntervalValueExpressionISO9075ChoiceGroup2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntervalValueExpressionISO9075ChoiceGroup2Type }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalTermType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalTermType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalValueExpressionISO9075ChoiceGroup1Type }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalTermType }{@code >}
     *     
     */
    public JAXBElement<?> getIntervalTermOrIntervalValueExpressionISO9075ChoiceGroup1OrIntervalValueExpressionISO9075ChoiceGroup2() {
        return intervalTermOrIntervalValueExpressionISO9075ChoiceGroup1OrIntervalValueExpressionISO9075ChoiceGroup2;
    }

    /**
     * Sets the value of the intervalTermOrIntervalValueExpressionISO9075ChoiceGroup1OrIntervalValueExpressionISO9075ChoiceGroup2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntervalValueExpressionISO9075ChoiceGroup2Type }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalTermType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalTermType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalValueExpressionISO9075ChoiceGroup1Type }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalTermType }{@code >}
     *     
     */
    public void setIntervalTermOrIntervalValueExpressionISO9075ChoiceGroup1OrIntervalValueExpressionISO9075ChoiceGroup2(JAXBElement<?> value) {
        this.intervalTermOrIntervalValueExpressionISO9075ChoiceGroup1OrIntervalValueExpressionISO9075ChoiceGroup2 = value;
    }

}