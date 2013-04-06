//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WhenOperandListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WhenOperandListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}WhenOperand"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CommaWhenOperandItemtype" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WhenOperandListType", propOrder = {
    "whenOperand",
    "commaWhenOperandItemtype"
})
public class WhenOperandListType {

    @XmlElement(name = "WhenOperand", required = true)
    protected WhenOperandType whenOperand;
    @XmlElement(name = "CommaWhenOperandItemtype")
    protected List<CommaWhenOperandItemtypeType> commaWhenOperandItemtype;

    /**
     * Gets the value of the whenOperand property.
     * 
     * @return
     *     possible object is
     *     {@link WhenOperandType }
     *     
     */
    public WhenOperandType getWhenOperand() {
        return whenOperand;
    }

    /**
     * Sets the value of the whenOperand property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhenOperandType }
     *     
     */
    public void setWhenOperand(WhenOperandType value) {
        this.whenOperand = value;
    }

    /**
     * Gets the value of the commaWhenOperandItemtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commaWhenOperandItemtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommaWhenOperandItemtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommaWhenOperandItemtypeType }
     * 
     * 
     */
    public List<CommaWhenOperandItemtypeType> getCommaWhenOperandItemtype() {
        if (commaWhenOperandItemtype == null) {
            commaWhenOperandItemtype = new ArrayList<CommaWhenOperandItemtypeType>();
        }
        return this.commaWhenOperandItemtype;
    }

}
