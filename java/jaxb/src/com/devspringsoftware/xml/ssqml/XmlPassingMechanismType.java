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
 * <p>Java class for XmlPassingMechanismType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="XmlPassingMechanismType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BY REF"/>
 *     &lt;enumeration value="BY VALUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "XmlPassingMechanismType")
@XmlEnum
public enum XmlPassingMechanismType {

    @XmlEnumValue("BY REF")
    BY_REF("BY REF"),
    @XmlEnumValue("BY VALUE")
    BY_VALUE("BY VALUE");
    private final String value;

    XmlPassingMechanismType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XmlPassingMechanismType fromValue(String v) {
        for (XmlPassingMechanismType c: XmlPassingMechanismType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
