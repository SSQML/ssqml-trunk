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
 * <p>Java class for AccordingToXmlschemaStaticStringType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccordingToXmlschemaStaticStringType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value=" ACCORDING TO XMLSCHEMA "/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccordingToXmlschemaStaticStringType")
@XmlEnum
public enum AccordingToXmlschemaStaticStringType {

    @XmlEnumValue(" ACCORDING TO XMLSCHEMA ")
    ACCORDING_TO_XMLSCHEMA(" ACCORDING TO XMLSCHEMA ");
    private final String value;

    AccordingToXmlschemaStaticStringType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccordingToXmlschemaStaticStringType fromValue(String v) {
        for (AccordingToXmlschemaStaticStringType c: AccordingToXmlschemaStaticStringType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
