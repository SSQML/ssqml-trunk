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
 * <p>Java class for DatetimeLiteralType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatetimeLiteralType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}DateLiteral"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TimeLiteral"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TimestampLiteral"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatetimeLiteralType", propOrder = {
    "dateLiteralOrTimeLiteralOrTimestampLiteral"
})
public class DatetimeLiteralType {

    @XmlElements({
        @XmlElement(name = "DateLiteral", type = DateLiteralType.class),
        @XmlElement(name = "TimeLiteral", type = TimeLiteralType.class),
        @XmlElement(name = "TimestampLiteral", type = TimestampLiteralType.class)
    })
    protected Object dateLiteralOrTimeLiteralOrTimestampLiteral;

    /**
     * Gets the value of the dateLiteralOrTimeLiteralOrTimestampLiteral property.
     * 
     * @return
     *     possible object is
     *     {@link DateLiteralType }
     *     {@link TimeLiteralType }
     *     {@link TimestampLiteralType }
     *     
     */
    public Object getDateLiteralOrTimeLiteralOrTimestampLiteral() {
        return dateLiteralOrTimeLiteralOrTimestampLiteral;
    }

    /**
     * Sets the value of the dateLiteralOrTimeLiteralOrTimestampLiteral property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateLiteralType }
     *     {@link TimeLiteralType }
     *     {@link TimestampLiteralType }
     *     
     */
    public void setDateLiteralOrTimeLiteralOrTimestampLiteral(Object value) {
        this.dateLiteralOrTimeLiteralOrTimestampLiteral = value;
    }

}