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
 * <p>Java class for CardinalityExpressionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardinalityExpressionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}CardinalityStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CollectionValueExpression"/>
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
@XmlType(name = "CardinalityExpressionType", propOrder = {
    "cardinalityStaticString",
    "leftParen",
    "collectionValueExpression",
    "rightParen"
})
public class CardinalityExpressionType {

    @XmlElement(name = "CardinalityStaticString", required = true)
    protected CardinalityStaticStringType cardinalityStaticString;
    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;
    @XmlElement(name = "CollectionValueExpression", required = true)
    protected CollectionValueExpressionType collectionValueExpression;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;

    /**
     * Gets the value of the cardinalityStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link CardinalityStaticStringType }
     *     
     */
    public CardinalityStaticStringType getCardinalityStaticString() {
        return cardinalityStaticString;
    }

    /**
     * Sets the value of the cardinalityStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardinalityStaticStringType }
     *     
     */
    public void setCardinalityStaticString(CardinalityStaticStringType value) {
        this.cardinalityStaticString = value;
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
     * Gets the value of the collectionValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionValueExpressionType }
     *     
     */
    public CollectionValueExpressionType getCollectionValueExpression() {
        return collectionValueExpression;
    }

    /**
     * Sets the value of the collectionValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionValueExpressionType }
     *     
     */
    public void setCollectionValueExpression(CollectionValueExpressionType value) {
        this.collectionValueExpression = value;
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