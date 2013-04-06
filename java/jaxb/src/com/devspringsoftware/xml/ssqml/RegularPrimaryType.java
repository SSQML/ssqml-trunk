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
 * <p>Java class for RegularPrimaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegularPrimaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterSpecifier"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Percent"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RegularCharacterSet"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RegularPrimary_ISO9075ChoiceGroup1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegularPrimaryType", propOrder = {
    "characterSpecifierOrPercentOrRegularCharacterSet"
})
public class RegularPrimaryType {

    @XmlElements({
        @XmlElement(name = "CharacterSpecifier", type = CharacterSpecifierType.class),
        @XmlElement(name = "Percent", type = String.class),
        @XmlElement(name = "RegularCharacterSet", type = RegularCharacterSetType.class),
        @XmlElement(name = "RegularPrimary_ISO9075ChoiceGroup1", type = RegularPrimaryISO9075ChoiceGroup1Type.class)
    })
    protected Object characterSpecifierOrPercentOrRegularCharacterSet;

    /**
     * Gets the value of the characterSpecifierOrPercentOrRegularCharacterSet property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterSpecifierType }
     *     {@link String }
     *     {@link RegularCharacterSetType }
     *     {@link RegularPrimaryISO9075ChoiceGroup1Type }
     *     
     */
    public Object getCharacterSpecifierOrPercentOrRegularCharacterSet() {
        return characterSpecifierOrPercentOrRegularCharacterSet;
    }

    /**
     * Sets the value of the characterSpecifierOrPercentOrRegularCharacterSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterSpecifierType }
     *     {@link String }
     *     {@link RegularCharacterSetType }
     *     {@link RegularPrimaryISO9075ChoiceGroup1Type }
     *     
     */
    public void setCharacterSpecifierOrPercentOrRegularCharacterSet(Object value) {
        this.characterSpecifierOrPercentOrRegularCharacterSet = value;
    }

}
