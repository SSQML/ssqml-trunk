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
 * <p>Java class for FromConstructorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FromConstructorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}InsertColumnList" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RightParen" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}OverrideClause" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ContextuallyTypedTableValueConstructor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FromConstructorType", propOrder = {
    "leftParen",
    "insertColumnList",
    "rightParen",
    "overrideClause",
    "contextuallyTypedTableValueConstructor"
})
public class FromConstructorType {

    @XmlElement(name = "LeftParen")
    protected String leftParen;
    @XmlElement(name = "InsertColumnList")
    protected ColumnNameListType insertColumnList;
    @XmlElement(name = "RightParen")
    protected String rightParen;
    @XmlElement(name = "OverrideClause")
    protected OverrideClauseType overrideClause;
    @XmlElement(name = "ContextuallyTypedTableValueConstructor", required = true)
    protected ContextuallyTypedTableValueConstructorType contextuallyTypedTableValueConstructor;

    /**
     * Gets the value of the leftParen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftParen() {
        return leftParen;
    }

    /**
     * Sets the value of the leftParen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftParen(String value) {
        this.leftParen = value;
    }

    /**
     * Gets the value of the insertColumnList property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnNameListType }
     *     
     */
    public ColumnNameListType getInsertColumnList() {
        return insertColumnList;
    }

    /**
     * Sets the value of the insertColumnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnNameListType }
     *     
     */
    public void setInsertColumnList(ColumnNameListType value) {
        this.insertColumnList = value;
    }

    /**
     * Gets the value of the rightParen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightParen() {
        return rightParen;
    }

    /**
     * Sets the value of the rightParen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightParen(String value) {
        this.rightParen = value;
    }

    /**
     * Gets the value of the overrideClause property.
     * 
     * @return
     *     possible object is
     *     {@link OverrideClauseType }
     *     
     */
    public OverrideClauseType getOverrideClause() {
        return overrideClause;
    }

    /**
     * Sets the value of the overrideClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverrideClauseType }
     *     
     */
    public void setOverrideClause(OverrideClauseType value) {
        this.overrideClause = value;
    }

    /**
     * Gets the value of the contextuallyTypedTableValueConstructor property.
     * 
     * @return
     *     possible object is
     *     {@link ContextuallyTypedTableValueConstructorType }
     *     
     */
    public ContextuallyTypedTableValueConstructorType getContextuallyTypedTableValueConstructor() {
        return contextuallyTypedTableValueConstructor;
    }

    /**
     * Sets the value of the contextuallyTypedTableValueConstructor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextuallyTypedTableValueConstructorType }
     *     
     */
    public void setContextuallyTypedTableValueConstructor(ContextuallyTypedTableValueConstructorType value) {
        this.contextuallyTypedTableValueConstructor = value;
    }

}
