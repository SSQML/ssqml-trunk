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
 * <p>Java class for GetDiagnosticsStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDiagnosticsStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}GetDiagnosticsStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlDiagnosticsInformation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDiagnosticsStatementType", propOrder = {
    "getDiagnosticsStaticString",
    "sqlDiagnosticsInformation"
})
public class GetDiagnosticsStatementType {

    @XmlElement(name = "GetDiagnosticsStaticString", required = true)
    protected GetDiagnosticsStaticStringType getDiagnosticsStaticString;
    @XmlElement(name = "SqlDiagnosticsInformation", required = true)
    protected SqlDiagnosticsInformationType sqlDiagnosticsInformation;

    /**
     * Gets the value of the getDiagnosticsStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link GetDiagnosticsStaticStringType }
     *     
     */
    public GetDiagnosticsStaticStringType getGetDiagnosticsStaticString() {
        return getDiagnosticsStaticString;
    }

    /**
     * Sets the value of the getDiagnosticsStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDiagnosticsStaticStringType }
     *     
     */
    public void setGetDiagnosticsStaticString(GetDiagnosticsStaticStringType value) {
        this.getDiagnosticsStaticString = value;
    }

    /**
     * Gets the value of the sqlDiagnosticsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SqlDiagnosticsInformationType }
     *     
     */
    public SqlDiagnosticsInformationType getSqlDiagnosticsInformation() {
        return sqlDiagnosticsInformation;
    }

    /**
     * Sets the value of the sqlDiagnosticsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlDiagnosticsInformationType }
     *     
     */
    public void setSqlDiagnosticsInformation(SqlDiagnosticsInformationType value) {
        this.sqlDiagnosticsInformation = value;
    }

}
