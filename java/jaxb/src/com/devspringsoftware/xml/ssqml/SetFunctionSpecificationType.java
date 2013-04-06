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
 * <p>Java class for SetFunctionSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetFunctionSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}AggregateFunction"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}GroupingOperation"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetFunctionSpecificationType", propOrder = {
    "aggregateFunctionOrGroupingOperation"
})
public class SetFunctionSpecificationType {

    @XmlElements({
        @XmlElement(name = "AggregateFunction", type = AggregateFunctionType.class),
        @XmlElement(name = "GroupingOperation", type = GroupingOperationType.class)
    })
    protected Object aggregateFunctionOrGroupingOperation;

    /**
     * Gets the value of the aggregateFunctionOrGroupingOperation property.
     * 
     * @return
     *     possible object is
     *     {@link AggregateFunctionType }
     *     {@link GroupingOperationType }
     *     
     */
    public Object getAggregateFunctionOrGroupingOperation() {
        return aggregateFunctionOrGroupingOperation;
    }

    /**
     * Sets the value of the aggregateFunctionOrGroupingOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregateFunctionType }
     *     {@link GroupingOperationType }
     *     
     */
    public void setAggregateFunctionOrGroupingOperation(Object value) {
        this.aggregateFunctionOrGroupingOperation = value;
    }

}
