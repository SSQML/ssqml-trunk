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
 * <p>Java class for SqlStatementNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SqlStatementNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}StatementName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ExtendedStatementName"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SqlStatementNameType", propOrder = {
    "statementNameOrExtendedStatementName"
})
public class SqlStatementNameType {

    @XmlElements({
        @XmlElement(name = "StatementName", type = ActualIdentifierType.class),
        @XmlElement(name = "ExtendedStatementName", type = ExtendedStatementNameType.class)
    })
    protected Object statementNameOrExtendedStatementName;

    /**
     * Gets the value of the statementNameOrExtendedStatementName property.
     * 
     * @return
     *     possible object is
     *     {@link ActualIdentifierType }
     *     {@link ExtendedStatementNameType }
     *     
     */
    public Object getStatementNameOrExtendedStatementName() {
        return statementNameOrExtendedStatementName;
    }

    /**
     * Sets the value of the statementNameOrExtendedStatementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualIdentifierType }
     *     {@link ExtendedStatementNameType }
     *     
     */
    public void setStatementNameOrExtendedStatementName(Object value) {
        this.statementNameOrExtendedStatementName = value;
    }

}