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
 * <p>Java class for CharacterStringTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacterStringTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterStringType_ISO9075ChoiceGroup1"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterStringType_ISO9075ChoiceGroup2"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterStringType_ISO9075ChoiceGroup3"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterStringType_ISO9075ChoiceGroup4"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterStringType_ISO9075ChoiceGroup5"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterStringType_ISO9075ChoiceGroup6"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterStringType_ISO9075ChoiceGroup7"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterStringType_ISO9075ChoiceGroup8"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacterStringTypeType", propOrder = {
    "characterStringTypeISO9075ChoiceGroup1OrCharacterStringTypeISO9075ChoiceGroup2OrCharacterStringTypeISO9075ChoiceGroup3"
})
public class CharacterStringTypeType {

    @XmlElements({
        @XmlElement(name = "CharacterStringType_ISO9075ChoiceGroup1", type = CharacterStringTypeISO9075ChoiceGroup1Type.class),
        @XmlElement(name = "CharacterStringType_ISO9075ChoiceGroup2", type = CharacterStringTypeISO9075ChoiceGroup2Type.class),
        @XmlElement(name = "CharacterStringType_ISO9075ChoiceGroup3", type = CharacterStringTypeISO9075ChoiceGroup3Type.class),
        @XmlElement(name = "CharacterStringType_ISO9075ChoiceGroup4", type = CharacterStringTypeISO9075ChoiceGroup4Type.class),
        @XmlElement(name = "CharacterStringType_ISO9075ChoiceGroup5", type = CharacterStringTypeISO9075ChoiceGroup5Type.class),
        @XmlElement(name = "CharacterStringType_ISO9075ChoiceGroup6", type = CharacterStringTypeISO9075ChoiceGroup6Type.class),
        @XmlElement(name = "CharacterStringType_ISO9075ChoiceGroup7", type = CharacterStringTypeISO9075ChoiceGroup7Type.class),
        @XmlElement(name = "CharacterStringType_ISO9075ChoiceGroup8", type = CharacterStringTypeISO9075ChoiceGroup8Type.class)
    })
    protected Object characterStringTypeISO9075ChoiceGroup1OrCharacterStringTypeISO9075ChoiceGroup2OrCharacterStringTypeISO9075ChoiceGroup3;

    /**
     * Gets the value of the characterStringTypeISO9075ChoiceGroup1OrCharacterStringTypeISO9075ChoiceGroup2OrCharacterStringTypeISO9075ChoiceGroup3 property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringTypeISO9075ChoiceGroup1Type }
     *     {@link CharacterStringTypeISO9075ChoiceGroup2Type }
     *     {@link CharacterStringTypeISO9075ChoiceGroup3Type }
     *     {@link CharacterStringTypeISO9075ChoiceGroup4Type }
     *     {@link CharacterStringTypeISO9075ChoiceGroup5Type }
     *     {@link CharacterStringTypeISO9075ChoiceGroup6Type }
     *     {@link CharacterStringTypeISO9075ChoiceGroup7Type }
     *     {@link CharacterStringTypeISO9075ChoiceGroup8Type }
     *     
     */
    public Object getCharacterStringTypeISO9075ChoiceGroup1OrCharacterStringTypeISO9075ChoiceGroup2OrCharacterStringTypeISO9075ChoiceGroup3() {
        return characterStringTypeISO9075ChoiceGroup1OrCharacterStringTypeISO9075ChoiceGroup2OrCharacterStringTypeISO9075ChoiceGroup3;
    }

    /**
     * Sets the value of the characterStringTypeISO9075ChoiceGroup1OrCharacterStringTypeISO9075ChoiceGroup2OrCharacterStringTypeISO9075ChoiceGroup3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringTypeISO9075ChoiceGroup1Type }
     *     {@link CharacterStringTypeISO9075ChoiceGroup2Type }
     *     {@link CharacterStringTypeISO9075ChoiceGroup3Type }
     *     {@link CharacterStringTypeISO9075ChoiceGroup4Type }
     *     {@link CharacterStringTypeISO9075ChoiceGroup5Type }
     *     {@link CharacterStringTypeISO9075ChoiceGroup6Type }
     *     {@link CharacterStringTypeISO9075ChoiceGroup7Type }
     *     {@link CharacterStringTypeISO9075ChoiceGroup8Type }
     *     
     */
    public void setCharacterStringTypeISO9075ChoiceGroup1OrCharacterStringTypeISO9075ChoiceGroup2OrCharacterStringTypeISO9075ChoiceGroup3(Object value) {
        this.characterStringTypeISO9075ChoiceGroup1OrCharacterStringTypeISO9075ChoiceGroup2OrCharacterStringTypeISO9075ChoiceGroup3 = value;
    }

}