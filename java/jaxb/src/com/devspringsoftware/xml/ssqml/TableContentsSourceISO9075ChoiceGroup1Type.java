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
 * <p>Java class for TableContentsSource_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TableContentsSource_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}OfStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}PathResolvedUserDefinedTypeName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SubtableClause" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TableElementList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableContentsSource_ISO9075ChoiceGroup1Type", propOrder = {
    "ofStaticString",
    "pathResolvedUserDefinedTypeName",
    "subtableClause",
    "tableElementList"
})
public class TableContentsSourceISO9075ChoiceGroup1Type {

    @XmlElement(name = "OfStaticString", required = true)
    protected OfStaticStringType ofStaticString;
    @XmlElementRef(name = "PathResolvedUserDefinedTypeName", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<SchemaQualifiedTypeNameType> pathResolvedUserDefinedTypeName;
    @XmlElement(name = "SubtableClause")
    protected SubtableClauseType subtableClause;
    @XmlElement(name = "TableElementList")
    protected TableElementListType tableElementList;

    /**
     * Gets the value of the ofStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link OfStaticStringType }
     *     
     */
    public OfStaticStringType getOfStaticString() {
        return ofStaticString;
    }

    /**
     * Sets the value of the ofStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfStaticStringType }
     *     
     */
    public void setOfStaticString(OfStaticStringType value) {
        this.ofStaticString = value;
    }

    /**
     * Gets the value of the pathResolvedUserDefinedTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SchemaQualifiedTypeNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchemaQualifiedTypeNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchemaQualifiedTypeNameType }{@code >}
     *     
     */
    public JAXBElement<SchemaQualifiedTypeNameType> getPathResolvedUserDefinedTypeName() {
        return pathResolvedUserDefinedTypeName;
    }

    /**
     * Sets the value of the pathResolvedUserDefinedTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SchemaQualifiedTypeNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchemaQualifiedTypeNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchemaQualifiedTypeNameType }{@code >}
     *     
     */
    public void setPathResolvedUserDefinedTypeName(JAXBElement<SchemaQualifiedTypeNameType> value) {
        this.pathResolvedUserDefinedTypeName = value;
    }

    /**
     * Gets the value of the subtableClause property.
     * 
     * @return
     *     possible object is
     *     {@link SubtableClauseType }
     *     
     */
    public SubtableClauseType getSubtableClause() {
        return subtableClause;
    }

    /**
     * Sets the value of the subtableClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubtableClauseType }
     *     
     */
    public void setSubtableClause(SubtableClauseType value) {
        this.subtableClause = value;
    }

    /**
     * Gets the value of the tableElementList property.
     * 
     * @return
     *     possible object is
     *     {@link TableElementListType }
     *     
     */
    public TableElementListType getTableElementList() {
        return tableElementList;
    }

    /**
     * Sets the value of the tableElementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableElementListType }
     *     
     */
    public void setTableElementList(TableElementListType value) {
        this.tableElementList = value;
    }

}
