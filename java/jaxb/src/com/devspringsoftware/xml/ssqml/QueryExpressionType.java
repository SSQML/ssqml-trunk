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
 * <p>Java class for QueryExpressionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryExpressionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}WithClause" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}QueryExpressionBody"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryExpressionType", propOrder = {
    "withClause",
    "queryExpressionBody"
})
public class QueryExpressionType {

    @XmlElement(name = "WithClause")
    protected WithClauseType withClause;
    @XmlElement(name = "QueryExpressionBody", required = true)
    protected QueryExpressionBodyType queryExpressionBody;

    /**
     * Gets the value of the withClause property.
     * 
     * @return
     *     possible object is
     *     {@link WithClauseType }
     *     
     */
    public WithClauseType getWithClause() {
        return withClause;
    }

    /**
     * Sets the value of the withClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithClauseType }
     *     
     */
    public void setWithClause(WithClauseType value) {
        this.withClause = value;
    }

    /**
     * Gets the value of the queryExpressionBody property.
     * 
     * @return
     *     possible object is
     *     {@link QueryExpressionBodyType }
     *     
     */
    public QueryExpressionBodyType getQueryExpressionBody() {
        return queryExpressionBody;
    }

    /**
     * Sets the value of the queryExpressionBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryExpressionBodyType }
     *     
     */
    public void setQueryExpressionBody(QueryExpressionBodyType value) {
        this.queryExpressionBody = value;
    }

}
