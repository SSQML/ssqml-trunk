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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralValueSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralValueSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}HostParameterSpecification"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlParameterReference"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DynamicParameterSpecification"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CurrentCollationSpecification"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Current_default_transform_groupStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Current_pathStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Current_roleStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Current_transform_group_for_typeStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Current_userStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Session_userStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}System_userStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}UserStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ValueStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlVariableReference"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralValueSpecificationType", propOrder = {
    "hostParameterSpecificationOrSqlParameterReferenceOrDynamicParameterSpecification"
})
public class GeneralValueSpecificationType {

    @XmlElementRefs({
        @XmlElementRef(name = "CurrentCollationSpecification", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "System_userStaticString", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SqlVariableReference", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UserStaticString", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Session_userStaticString", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Current_pathStaticString", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ValueStaticString", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Current_transform_group_for_typeStaticString", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SqlParameterReference", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "HostParameterSpecification", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DynamicParameterSpecification", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Current_default_transform_groupStaticString", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Current_userStaticString", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Current_roleStaticString", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    })
    protected JAXBElement<?> hostParameterSpecificationOrSqlParameterReferenceOrDynamicParameterSpecification;

    /**
     * Gets the value of the hostParameterSpecificationOrSqlParameterReferenceOrDynamicParameterSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurrentCollationSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SystemUserStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentifierChainType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SessionUserStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentPathStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentTransformGroupForTypeStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentifierChainType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HostParameterSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentDefaultTransformGroupStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentUserStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentRoleStaticStringType }{@code >}
     *     
     */
    public JAXBElement<?> getHostParameterSpecificationOrSqlParameterReferenceOrDynamicParameterSpecification() {
        return hostParameterSpecificationOrSqlParameterReferenceOrDynamicParameterSpecification;
    }

    /**
     * Sets the value of the hostParameterSpecificationOrSqlParameterReferenceOrDynamicParameterSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurrentCollationSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SystemUserStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentifierChainType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SessionUserStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentPathStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentTransformGroupForTypeStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IdentifierChainType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HostParameterSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentDefaultTransformGroupStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentUserStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CurrentRoleStaticStringType }{@code >}
     *     
     */
    public void setHostParameterSpecificationOrSqlParameterReferenceOrDynamicParameterSpecification(JAXBElement<?> value) {
        this.hostParameterSpecificationOrSqlParameterReferenceOrDynamicParameterSpecification = value;
    }

}
