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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsClauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}AsStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ColumnName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsClauseType", propOrder = {
    "asStaticString",
    "columnName"
})
public class AsClauseType {

    @XmlElement(name = "AsStaticString")
    protected AsStaticStringType asStaticString;
    @XmlElementRef(name = "ColumnName", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<ActualIdentifierType> columnName;

    /**
     * Gets the value of the asStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link AsStaticStringType }
     *     
     */
    public AsStaticStringType getAsStaticString() {
        return asStaticString;
    }

    /**
     * Sets the value of the asStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsStaticStringType }
     *     
     */
    public void setAsStaticString(AsStaticStringType value) {
        this.asStaticString = value;
    }

    /**
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     
     */
    public JAXBElement<ActualIdentifierType> getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     
     */
    public void setColumnName(JAXBElement<ActualIdentifierType> value) {
        this.columnName = value;
    }

}