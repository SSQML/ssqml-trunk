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
 * <p>Java class for CharacterSetDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacterSetDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}CreateCharacterSetStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterSetName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}AsStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterSetSource"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CollateClause" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacterSetDefinitionType", propOrder = {
    "createCharacterSetStaticString",
    "characterSetName",
    "asStaticString",
    "characterSetSource",
    "collateClause"
})
public class CharacterSetDefinitionType {

    @XmlElement(name = "CreateCharacterSetStaticString", required = true)
    protected CreateCharacterSetStaticStringType createCharacterSetStaticString;
    @XmlElementRef(name = "CharacterSetName", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<CharacterSetNameType> characterSetName;
    @XmlElement(name = "AsStaticString")
    protected AsStaticStringType asStaticString;
    @XmlElement(name = "CharacterSetSource", required = true)
    protected CharacterSetSourceType characterSetSource;
    @XmlElement(name = "CollateClause")
    protected CollateClauseType collateClause;

    /**
     * Gets the value of the createCharacterSetStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCharacterSetStaticStringType }
     *     
     */
    public CreateCharacterSetStaticStringType getCreateCharacterSetStaticString() {
        return createCharacterSetStaticString;
    }

    /**
     * Sets the value of the createCharacterSetStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCharacterSetStaticStringType }
     *     
     */
    public void setCreateCharacterSetStaticString(CreateCharacterSetStaticStringType value) {
        this.createCharacterSetStaticString = value;
    }

    /**
     * Gets the value of the characterSetName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CharacterSetNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterSetNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterSetNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterSetNameType }{@code >}
     *     
     */
    public JAXBElement<CharacterSetNameType> getCharacterSetName() {
        return characterSetName;
    }

    /**
     * Sets the value of the characterSetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CharacterSetNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterSetNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterSetNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterSetNameType }{@code >}
     *     
     */
    public void setCharacterSetName(JAXBElement<CharacterSetNameType> value) {
        this.characterSetName = value;
    }

    /**
     * Gets the value of the asStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link AsStaticStringType }
     *     
     */
    public AsStaticStringType getAsStaticString() {
        return asStaticString;
    }

    /**
     * Sets the value of the asStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsStaticStringType }
     *     
     */
    public void setAsStaticString(AsStaticStringType value) {
        this.asStaticString = value;
    }

    /**
     * Gets the value of the characterSetSource property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterSetSourceType }
     *     
     */
    public CharacterSetSourceType getCharacterSetSource() {
        return characterSetSource;
    }

    /**
     * Sets the value of the characterSetSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterSetSourceType }
     *     
     */
    public void setCharacterSetSource(CharacterSetSourceType value) {
        this.characterSetSource = value;
    }

    /**
     * Gets the value of the collateClause property.
     * 
     * @return
     *     possible object is
     *     {@link CollateClauseType }
     *     
     */
    public CollateClauseType getCollateClause() {
        return collateClause;
    }

    /**
     * Sets the value of the collateClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateClauseType }
     *     
     */
    public void setCollateClause(CollateClauseType value) {
        this.collateClause = value;
    }

}
