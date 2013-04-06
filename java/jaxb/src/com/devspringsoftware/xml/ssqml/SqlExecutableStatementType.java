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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SqlExecutableStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SqlExecutableStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlSchemaStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlDataStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlControlStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlTransactionStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlConnectionStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlSessionStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlDiagnosticsStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlDynamicStatement"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SqlExecutableStatementType", propOrder = {
    "sqlSchemaStatementOrSqlDataStatementOrSqlControlStatement"
})
public class SqlExecutableStatementType {

    @XmlElementRefs({
        @XmlElementRef(name = "SqlControlStatement", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SqlSchemaStatement", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SqlDataStatement", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SqlDynamicStatement", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SqlDiagnosticsStatement", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SqlConnectionStatement", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SqlTransactionStatement", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SqlSessionStatement", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    })
    protected JAXBElement<?> sqlSchemaStatementOrSqlDataStatementOrSqlControlStatement;

    /**
     * Gets the value of the sqlSchemaStatementOrSqlDataStatementOrSqlControlStatement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SqlSchemaStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlControlStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlSchemaStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlDataStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlControlStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlTransactionStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlConnectionStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GetDiagnosticsStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlDynamicStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlSessionStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlTransactionStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlSessionStatementType }{@code >}
     *     
     */
    public JAXBElement<?> getSqlSchemaStatementOrSqlDataStatementOrSqlControlStatement() {
        return sqlSchemaStatementOrSqlDataStatementOrSqlControlStatement;
    }

    /**
     * Sets the value of the sqlSchemaStatementOrSqlDataStatementOrSqlControlStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SqlSchemaStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlControlStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlSchemaStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlDataStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlControlStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlTransactionStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlConnectionStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GetDiagnosticsStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlDynamicStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlSessionStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlTransactionStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlSessionStatementType }{@code >}
     *     
     */
    public void setSqlSchemaStatementOrSqlDataStatementOrSqlControlStatement(JAXBElement<?> value) {
        this.sqlSchemaStatementOrSqlDataStatementOrSqlControlStatement = value;
    }

}