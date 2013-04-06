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
 * <p>Java class for ReferentialConstraintDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferentialConstraintDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ForeignKeyStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ReferencingColumns"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RightParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ReferencesSpecification"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferentialConstraintDefinitionType", propOrder = {
    "foreignKeyStaticString",
    "leftParen",
    "referencingColumns",
    "rightParen",
    "referencesSpecification"
})
public class ReferentialConstraintDefinitionType {

    @XmlElement(name = "ForeignKeyStaticString", required = true)
    protected ForeignKeyStaticStringType foreignKeyStaticString;
    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;
    @XmlElement(name = "ReferencingColumns", required = true)
    protected ColumnNameListType referencingColumns;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;
    @XmlElement(name = "ReferencesSpecification", required = true)
    protected ReferencesSpecificationType referencesSpecification;

    /**
     * Gets the value of the foreignKeyStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignKeyStaticStringType }
     *     
     */
    public ForeignKeyStaticStringType getForeignKeyStaticString() {
        return foreignKeyStaticString;
    }

    /**
     * Sets the value of the foreignKeyStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignKeyStaticStringType }
     *     
     */
    public void setForeignKeyStaticString(ForeignKeyStaticStringType value) {
        this.foreignKeyStaticString = value;
    }

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
     * Gets the value of the referencingColumns property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnNameListType }
     *     
     */
    public ColumnNameListType getReferencingColumns() {
        return referencingColumns;
    }

    /**
     * Sets the value of the referencingColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnNameListType }
     *     
     */
    public void setReferencingColumns(ColumnNameListType value) {
        this.referencingColumns = value;
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
     * Gets the value of the referencesSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencesSpecificationType }
     *     
     */
    public ReferencesSpecificationType getReferencesSpecification() {
        return referencesSpecification;
    }

    /**
     * Sets the value of the referencesSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencesSpecificationType }
     *     
     */
    public void setReferencesSpecification(ReferencesSpecificationType value) {
        this.referencesSpecification = value;
    }

}
