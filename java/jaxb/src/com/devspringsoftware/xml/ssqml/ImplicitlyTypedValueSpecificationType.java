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
 * <p>Java class for ImplicitlyTypedValueSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImplicitlyTypedValueSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}NullStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}EmptySpecification"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImplicitlyTypedValueSpecificationType", propOrder = {
    "nullStaticStringOrEmptySpecification"
})
public class ImplicitlyTypedValueSpecificationType {

    @XmlElements({
        @XmlElement(name = "NullStaticString", type = NullStaticStringType.class),
        @XmlElement(name = "EmptySpecification", type = EmptySpecificationType.class)
    })
    protected Object nullStaticStringOrEmptySpecification;

    /**
     * Gets the value of the nullStaticStringOrEmptySpecification property.
     * 
     * @return
     *     possible object is
     *     {@link NullStaticStringType }
     *     {@link EmptySpecificationType }
     *     
     */
    public Object getNullStaticStringOrEmptySpecification() {
        return nullStaticStringOrEmptySpecification;
    }

    /**
     * Sets the value of the nullStaticStringOrEmptySpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullStaticStringType }
     *     {@link EmptySpecificationType }
     *     
     */
    public void setNullStaticStringOrEmptySpecification(Object value) {
        this.nullStaticStringOrEmptySpecification = value;
    }

}
