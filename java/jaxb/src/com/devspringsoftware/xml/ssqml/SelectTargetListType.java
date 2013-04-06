//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectTargetListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectTargetListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}TargetSpecification"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CommaTargetSpecificationItemtype" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectTargetListType", propOrder = {
    "targetSpecification",
    "commaTargetSpecificationItemtype"
})
public class SelectTargetListType {

    @XmlElementRef(name = "TargetSpecification", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<TargetSpecificationType> targetSpecification;
    @XmlElement(name = "CommaTargetSpecificationItemtype")
    protected List<CommaTargetSpecificationItemtypeType> commaTargetSpecificationItemtype;

    /**
     * Gets the value of the targetSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TargetSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TargetSpecificationType }{@code >}
     *     
     */
    public JAXBElement<TargetSpecificationType> getTargetSpecification() {
        return targetSpecification;
    }

    /**
     * Sets the value of the targetSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TargetSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TargetSpecificationType }{@code >}
     *     
     */
    public void setTargetSpecification(JAXBElement<TargetSpecificationType> value) {
        this.targetSpecification = value;
    }

    /**
     * Gets the value of the commaTargetSpecificationItemtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commaTargetSpecificationItemtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommaTargetSpecificationItemtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommaTargetSpecificationItemtypeType }
     * 
     * 
     */
    public List<CommaTargetSpecificationItemtypeType> getCommaTargetSpecificationItemtype() {
        if (commaTargetSpecificationItemtype == null) {
            commaTargetSpecificationItemtype = new ArrayList<CommaTargetSpecificationItemtypeType>();
        }
        return this.commaTargetSpecificationItemtype;
    }

}
