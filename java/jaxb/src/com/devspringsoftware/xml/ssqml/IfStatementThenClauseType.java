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
 * <p>Java class for IfStatementThenClauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfStatementThenClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ThenStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlStatementList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfStatementThenClauseType", propOrder = {
    "thenStaticString",
    "sqlStatementList"
})
public class IfStatementThenClauseType {

    @XmlElement(name = "ThenStaticString", required = true)
    protected ThenStaticStringType thenStaticString;
    @XmlElement(name = "SqlStatementList", required = true)
    protected SqlStatementListType sqlStatementList;

    /**
     * Gets the value of the thenStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ThenStaticStringType }
     *     
     */
    public ThenStaticStringType getThenStaticString() {
        return thenStaticString;
    }

    /**
     * Sets the value of the thenStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThenStaticStringType }
     *     
     */
    public void setThenStaticString(ThenStaticStringType value) {
        this.thenStaticString = value;
    }

    /**
     * Gets the value of the sqlStatementList property.
     * 
     * @return
     *     possible object is
     *     {@link SqlStatementListType }
     *     
     */
    public SqlStatementListType getSqlStatementList() {
        return sqlStatementList;
    }

    /**
     * Sets the value of the sqlStatementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlStatementListType }
     *     
     */
    public void setSqlStatementList(SqlStatementListType value) {
        this.sqlStatementList = value;
    }

}