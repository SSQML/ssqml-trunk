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
 * <p>Java class for ArrayTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}DataType"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ArrayStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftBracketOrTrigraph" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}UnsignedInteger" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RightBracketOrTrigraph" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayTypeType", propOrder = {
    "dataType",
    "arrayStaticString",
    "leftBracketOrTrigraph",
    "unsignedInteger",
    "rightBracketOrTrigraph"
})
public class ArrayTypeType {

    @XmlElementRef(name = "DataType", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<DataTypeType> dataType;
    @XmlElement(name = "ArrayStaticString", required = true)
    protected ArrayStaticStringType arrayStaticString;
    @XmlElement(name = "LeftBracketOrTrigraph")
    protected String leftBracketOrTrigraph;
    @XmlElementRef(name = "UnsignedInteger", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unsignedInteger;
    @XmlElement(name = "RightBracketOrTrigraph")
    protected String rightBracketOrTrigraph;

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     *     
     */
    public JAXBElement<DataTypeType> getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     *     
     */
    public void setDataType(JAXBElement<DataTypeType> value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the arrayStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayStaticStringType }
     *     
     */
    public ArrayStaticStringType getArrayStaticString() {
        return arrayStaticString;
    }

    /**
     * Sets the value of the arrayStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayStaticStringType }
     *     
     */
    public void setArrayStaticString(ArrayStaticStringType value) {
        this.arrayStaticString = value;
    }

    /**
     * Gets the value of the leftBracketOrTrigraph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftBracketOrTrigraph() {
        return leftBracketOrTrigraph;
    }

    /**
     * Sets the value of the leftBracketOrTrigraph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftBracketOrTrigraph(String value) {
        this.leftBracketOrTrigraph = value;
    }

    /**
     * Gets the value of the unsignedInteger property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnsignedInteger() {
        return unsignedInteger;
    }

    /**
     * Sets the value of the unsignedInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnsignedInteger(JAXBElement<String> value) {
        this.unsignedInteger = value;
    }

    /**
     * Gets the value of the rightBracketOrTrigraph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightBracketOrTrigraph() {
        return rightBracketOrTrigraph;
    }

    /**
     * Sets the value of the rightBracketOrTrigraph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightBracketOrTrigraph(String value) {
        this.rightBracketOrTrigraph = value;
    }

}
