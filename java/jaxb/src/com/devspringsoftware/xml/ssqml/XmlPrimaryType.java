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
 * <p>Java class for XmlPrimaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XmlPrimaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}ValueExpressionPrimary"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlValueFunction"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlPrimaryType", propOrder = {
    "valueExpressionPrimaryOrXmlValueFunction"
})
public class XmlPrimaryType {

    @XmlElementRefs({
        @XmlElementRef(name = "ValueExpressionPrimary", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "XmlValueFunction", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    })
    protected JAXBElement<?> valueExpressionPrimaryOrXmlValueFunction;

    /**
     * Gets the value of the valueExpressionPrimaryOrXmlValueFunction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XmlValueFunctionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     
     */
    public JAXBElement<?> getValueExpressionPrimaryOrXmlValueFunction() {
        return valueExpressionPrimaryOrXmlValueFunction;
    }

    /**
     * Sets the value of the valueExpressionPrimaryOrXmlValueFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XmlValueFunctionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     
     */
    public void setValueExpressionPrimaryOrXmlValueFunction(JAXBElement<?> value) {
        this.valueExpressionPrimaryOrXmlValueFunction = value;
    }

}
