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
 * <p>Java class for QuantifiedComparisonPredicatePart2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantifiedComparisonPredicatePart2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}CompOp"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Quantifier"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TableSubquery"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantifiedComparisonPredicatePart2Type", propOrder = {
    "compOp",
    "quantifier",
    "tableSubquery"
})
public class QuantifiedComparisonPredicatePart2Type {

    @XmlElement(name = "CompOp", required = true)
    protected CompOpType compOp;
    @XmlElement(name = "Quantifier", required = true)
    protected QuantifierType quantifier;
    @XmlElementRef(name = "TableSubquery", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<SubqueryType> tableSubquery;

    /**
     * Gets the value of the compOp property.
     * 
     * @return
     *     possible object is
     *     {@link CompOpType }
     *     
     */
    public CompOpType getCompOp() {
        return compOp;
    }

    /**
     * Sets the value of the compOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompOpType }
     *     
     */
    public void setCompOp(CompOpType value) {
        this.compOp = value;
    }

    /**
     * Gets the value of the quantifier property.
     * 
     * @return
     *     possible object is
     *     {@link QuantifierType }
     *     
     */
    public QuantifierType getQuantifier() {
        return quantifier;
    }

    /**
     * Sets the value of the quantifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantifierType }
     *     
     */
    public void setQuantifier(QuantifierType value) {
        this.quantifier = value;
    }

    /**
     * Gets the value of the tableSubquery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubqueryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubqueryType }{@code >}
     *     
     */
    public JAXBElement<SubqueryType> getTableSubquery() {
        return tableSubquery;
    }

    /**
     * Sets the value of the tableSubquery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubqueryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubqueryType }{@code >}
     *     
     */
    public void setTableSubquery(JAXBElement<SubqueryType> value) {
        this.tableSubquery = value;
    }

}
