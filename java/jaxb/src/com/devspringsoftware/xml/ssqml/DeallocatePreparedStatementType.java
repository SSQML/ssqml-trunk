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
 * <p>Java class for DeallocatePreparedStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeallocatePreparedStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}DeallocatePrepareStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlStatementName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeallocatePreparedStatementType", propOrder = {
    "deallocatePrepareStaticString",
    "sqlStatementName"
})
public class DeallocatePreparedStatementType {

    @XmlElement(name = "DeallocatePrepareStaticString", required = true)
    protected DeallocatePrepareStaticStringType deallocatePrepareStaticString;
    @XmlElement(name = "SqlStatementName", required = true)
    protected SqlStatementNameType sqlStatementName;

    /**
     * Gets the value of the deallocatePrepareStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link DeallocatePrepareStaticStringType }
     *     
     */
    public DeallocatePrepareStaticStringType getDeallocatePrepareStaticString() {
        return deallocatePrepareStaticString;
    }

    /**
     * Sets the value of the deallocatePrepareStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeallocatePrepareStaticStringType }
     *     
     */
    public void setDeallocatePrepareStaticString(DeallocatePrepareStaticStringType value) {
        this.deallocatePrepareStaticString = value;
    }

    /**
     * Gets the value of the sqlStatementName property.
     * 
     * @return
     *     possible object is
     *     {@link SqlStatementNameType }
     *     
     */
    public SqlStatementNameType getSqlStatementName() {
        return sqlStatementName;
    }

    /**
     * Sets the value of the sqlStatementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlStatementNameType }
     *     
     */
    public void setSqlStatementName(SqlStatementNameType value) {
        this.sqlStatementName = value;
    }

}