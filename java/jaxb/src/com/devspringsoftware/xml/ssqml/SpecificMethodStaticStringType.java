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
 * <p>Java class for SpecificMethodStaticStringType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecificMethodStaticStringType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value=" SPECIFIC METHOD "/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecificMethodStaticStringType")
@XmlEnum
public enum SpecificMethodStaticStringType {

    @XmlEnumValue(" SPECIFIC METHOD ")
    SPECIFIC_METHOD(" SPECIFIC METHOD ");
    private final String value;

    SpecificMethodStaticStringType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecificMethodStaticStringType fromValue(String v) {
        for (SpecificMethodStaticStringType c: SpecificMethodStaticStringType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}