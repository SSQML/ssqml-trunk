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
 * <p>Java class for AggregateFunction_ISO9075ChoiceGroup4Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregateFunction_ISO9075ChoiceGroup4Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}OrderedSetFunction"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}FilterClause" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateFunction_ISO9075ChoiceGroup4Type", propOrder = {
    "orderedSetFunction",
    "filterClause"
})
public class AggregateFunctionISO9075ChoiceGroup4Type {

    @XmlElement(name = "OrderedSetFunction", required = true)
    protected OrderedSetFunctionType orderedSetFunction;
    @XmlElement(name = "FilterClause")
    protected FilterClauseType filterClause;

    /**
     * Gets the value of the orderedSetFunction property.
     * 
     * @return
     *     possible object is
     *     {@link OrderedSetFunctionType }
     *     
     */
    public OrderedSetFunctionType getOrderedSetFunction() {
        return orderedSetFunction;
    }

    /**
     * Sets the value of the orderedSetFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderedSetFunctionType }
     *     
     */
    public void setOrderedSetFunction(OrderedSetFunctionType value) {
        this.orderedSetFunction = value;
    }

    /**
     * Gets the value of the filterClause property.
     * 
     * @return
     *     possible object is
     *     {@link FilterClauseType }
     *     
     */
    public FilterClauseType getFilterClause() {
        return filterClause;
    }

    /**
     * Sets the value of the filterClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterClauseType }
     *     
     */
    public void setFilterClause(FilterClauseType value) {
        this.filterClause = value;
    }

}