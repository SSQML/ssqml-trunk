//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SqlArgumentListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SqlArgumentListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlArgument" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CommaSqlArgumentItemtype" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RightParen"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SqlArgumentListType", propOrder = {
    "leftParen",
    "sqlArgument",
    "commaSqlArgumentItemtype",
    "rightParen"
})
public class SqlArgumentListType {

    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;
    @XmlElement(name = "SqlArgument")
    protected SqlArgumentType sqlArgument;
    @XmlElement(name = "CommaSqlArgumentItemtype")
    protected List<CommaSqlArgumentItemtypeType> commaSqlArgumentItemtype;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;

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
     * Gets the value of the sqlArgument property.
     * 
     * @return
     *     possible object is
     *     {@link SqlArgumentType }
     *     
     */
    public SqlArgumentType getSqlArgument() {
        return sqlArgument;
    }

    /**
     * Sets the value of the sqlArgument property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlArgumentType }
     *     
     */
    public void setSqlArgument(SqlArgumentType value) {
        this.sqlArgument = value;
    }

    /**
     * Gets the value of the commaSqlArgumentItemtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commaSqlArgumentItemtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommaSqlArgumentItemtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommaSqlArgumentItemtypeType }
     * 
     * 
     */
    public List<CommaSqlArgumentItemtypeType> getCommaSqlArgumentItemtype() {
        if (commaSqlArgumentItemtype == null) {
            commaSqlArgumentItemtype = new ArrayList<CommaSqlArgumentItemtypeType>();
        }
        return this.commaSqlArgumentItemtype;
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

}