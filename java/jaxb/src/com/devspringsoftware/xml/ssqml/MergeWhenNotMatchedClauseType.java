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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MergeWhenNotMatchedClauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MergeWhenNotMatchedClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}WhenNotMatchedThenStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}MergeInsertSpecification"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MergeWhenNotMatchedClauseType", propOrder = {
    "whenNotMatchedThenStaticString",
    "mergeInsertSpecification"
})
public class MergeWhenNotMatchedClauseType {

    @XmlElement(name = "WhenNotMatchedThenStaticString", required = true)
    protected WhenNotMatchedThenStaticStringType whenNotMatchedThenStaticString;
    @XmlElement(name = "MergeInsertSpecification", required = true)
    protected MergeInsertSpecificationType mergeInsertSpecification;

    /**
     * Gets the value of the whenNotMatchedThenStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link WhenNotMatchedThenStaticStringType }
     *     
     */
    public WhenNotMatchedThenStaticStringType getWhenNotMatchedThenStaticString() {
        return whenNotMatchedThenStaticString;
    }

    /**
     * Sets the value of the whenNotMatchedThenStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhenNotMatchedThenStaticStringType }
     *     
     */
    public void setWhenNotMatchedThenStaticString(WhenNotMatchedThenStaticStringType value) {
        this.whenNotMatchedThenStaticString = value;
    }

    /**
     * Gets the value of the mergeInsertSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link MergeInsertSpecificationType }
     *     
     */
    public MergeInsertSpecificationType getMergeInsertSpecification() {
        return mergeInsertSpecification;
    }

    /**
     * Sets the value of the mergeInsertSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MergeInsertSpecificationType }
     *     
     */
    public void setMergeInsertSpecification(MergeInsertSpecificationType value) {
        this.mergeInsertSpecification = value;
    }

}
