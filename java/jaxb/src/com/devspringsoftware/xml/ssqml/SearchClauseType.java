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
 * <p>Java class for SearchClauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SearchStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RecursiveSearchOrder"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SequenceColumn"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchClauseType", propOrder = {
    "searchStaticString",
    "recursiveSearchOrder",
    "setStaticString",
    "sequenceColumn"
})
public class SearchClauseType {

    @XmlElement(name = "SearchStaticString", required = true)
    protected SearchStaticStringType searchStaticString;
    @XmlElement(name = "RecursiveSearchOrder", required = true)
    protected RecursiveSearchOrderType recursiveSearchOrder;
    @XmlElement(name = "SetStaticString", required = true)
    protected SetStaticStringType setStaticString;
    @XmlElement(name = "SequenceColumn", required = true)
    protected ActualIdentifierType sequenceColumn;

    /**
     * Gets the value of the searchStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStaticStringType }
     *     
     */
    public SearchStaticStringType getSearchStaticString() {
        return searchStaticString;
    }

    /**
     * Sets the value of the searchStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStaticStringType }
     *     
     */
    public void setSearchStaticString(SearchStaticStringType value) {
        this.searchStaticString = value;
    }

    /**
     * Gets the value of the recursiveSearchOrder property.
     * 
     * @return
     *     possible object is
     *     {@link RecursiveSearchOrderType }
     *     
     */
    public RecursiveSearchOrderType getRecursiveSearchOrder() {
        return recursiveSearchOrder;
    }

    /**
     * Sets the value of the recursiveSearchOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecursiveSearchOrderType }
     *     
     */
    public void setRecursiveSearchOrder(RecursiveSearchOrderType value) {
        this.recursiveSearchOrder = value;
    }

    /**
     * Gets the value of the setStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link SetStaticStringType }
     *     
     */
    public SetStaticStringType getSetStaticString() {
        return setStaticString;
    }

    /**
     * Sets the value of the setStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetStaticStringType }
     *     
     */
    public void setSetStaticString(SetStaticStringType value) {
        this.setStaticString = value;
    }

    /**
     * Gets the value of the sequenceColumn property.
     * 
     * @return
     *     possible object is
     *     {@link ActualIdentifierType }
     *     
     */
    public ActualIdentifierType getSequenceColumn() {
        return sequenceColumn;
    }

    /**
     * Sets the value of the sequenceColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualIdentifierType }
     *     
     */
    public void setSequenceColumn(ActualIdentifierType value) {
        this.sequenceColumn = value;
    }

}