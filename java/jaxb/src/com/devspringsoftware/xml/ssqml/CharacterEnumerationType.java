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
 * <p>Java class for CharacterEnumerationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacterEnumerationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterSpecifier"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterEnumeration_ISO9075ChoiceGroup1"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterEnumeration_ISO9075ChoiceGroup2"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacterEnumerationType", propOrder = {
    "characterSpecifierOrCharacterEnumerationISO9075ChoiceGroup1OrCharacterEnumerationISO9075ChoiceGroup2"
})
public class CharacterEnumerationType {

    @XmlElements({
        @XmlElement(name = "CharacterSpecifier", type = CharacterSpecifierType.class),
        @XmlElement(name = "CharacterEnumeration_ISO9075ChoiceGroup1", type = CharacterEnumerationISO9075ChoiceGroup1Type.class),
        @XmlElement(name = "CharacterEnumeration_ISO9075ChoiceGroup2", type = CharacterEnumerationISO9075ChoiceGroup2Type.class)
    })
    protected Object characterSpecifierOrCharacterEnumerationISO9075ChoiceGroup1OrCharacterEnumerationISO9075ChoiceGroup2;

    /**
     * Gets the value of the characterSpecifierOrCharacterEnumerationISO9075ChoiceGroup1OrCharacterEnumerationISO9075ChoiceGroup2 property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterSpecifierType }
     *     {@link CharacterEnumerationISO9075ChoiceGroup1Type }
     *     {@link CharacterEnumerationISO9075ChoiceGroup2Type }
     *     
     */
    public Object getCharacterSpecifierOrCharacterEnumerationISO9075ChoiceGroup1OrCharacterEnumerationISO9075ChoiceGroup2() {
        return characterSpecifierOrCharacterEnumerationISO9075ChoiceGroup1OrCharacterEnumerationISO9075ChoiceGroup2;
    }

    /**
     * Sets the value of the characterSpecifierOrCharacterEnumerationISO9075ChoiceGroup1OrCharacterEnumerationISO9075ChoiceGroup2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterSpecifierType }
     *     {@link CharacterEnumerationISO9075ChoiceGroup1Type }
     *     {@link CharacterEnumerationISO9075ChoiceGroup2Type }
     *     
     */
    public void setCharacterSpecifierOrCharacterEnumerationISO9075ChoiceGroup1OrCharacterEnumerationISO9075ChoiceGroup2(Object value) {
        this.characterSpecifierOrCharacterEnumerationISO9075ChoiceGroup1OrCharacterEnumerationISO9075ChoiceGroup2 = value;
    }

}
