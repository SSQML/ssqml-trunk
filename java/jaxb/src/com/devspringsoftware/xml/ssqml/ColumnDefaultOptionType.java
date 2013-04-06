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
 * <p>Java class for ColumnDefaultOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ColumnDefaultOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCLUDING DEFAULTS"/>
 *     &lt;enumeration value="EXCLUDING DEFAULTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ColumnDefaultOptionType")
@XmlEnum
public enum ColumnDefaultOptionType {

    @XmlEnumValue("INCLUDING DEFAULTS")
    INCLUDING_DEFAULTS("INCLUDING DEFAULTS"),
    @XmlEnumValue("EXCLUDING DEFAULTS")
    EXCLUDING_DEFAULTS("EXCLUDING DEFAULTS");
    private final String value;

    ColumnDefaultOptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ColumnDefaultOptionType fromValue(String v) {
        for (ColumnDefaultOptionType c: ColumnDefaultOptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}