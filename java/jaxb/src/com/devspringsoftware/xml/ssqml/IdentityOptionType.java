//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentityOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentityOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCLUDING IDENTITY"/>
 *     &lt;enumeration value="EXCLUDING IDENTITY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdentityOptionType")
@XmlEnum
public enum IdentityOptionType {

    @XmlEnumValue("INCLUDING IDENTITY")
    INCLUDING_IDENTITY("INCLUDING IDENTITY"),
    @XmlEnumValue("EXCLUDING IDENTITY")
    EXCLUDING_IDENTITY("EXCLUDING IDENTITY");
    private final String value;

    IdentityOptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdentityOptionType fromValue(String v) {
        for (IdentityOptionType c: IdentityOptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
