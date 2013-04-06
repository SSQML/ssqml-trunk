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
 * <p>Java class for GroupingElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupingElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}OrdinaryGroupingSet"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RollupList"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CubeList"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}GroupingSetsSpecification"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}EmptyGroupingSet"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupingElementType", propOrder = {
    "ordinaryGroupingSetOrRollupListOrCubeList"
})
public class GroupingElementType {

    @XmlElements({
        @XmlElement(name = "OrdinaryGroupingSet", type = OrdinaryGroupingSetType.class),
        @XmlElement(name = "RollupList", type = RollupListType.class),
        @XmlElement(name = "CubeList", type = CubeListType.class),
        @XmlElement(name = "GroupingSetsSpecification", type = GroupingSetsSpecificationType.class),
        @XmlElement(name = "EmptyGroupingSet", type = EmptyGroupingSetType.class)
    })
    protected Object ordinaryGroupingSetOrRollupListOrCubeList;

    /**
     * Gets the value of the ordinaryGroupingSetOrRollupListOrCubeList property.
     * 
     * @return
     *     possible object is
     *     {@link OrdinaryGroupingSetType }
     *     {@link RollupListType }
     *     {@link CubeListType }
     *     {@link GroupingSetsSpecificationType }
     *     {@link EmptyGroupingSetType }
     *     
     */
    public Object getOrdinaryGroupingSetOrRollupListOrCubeList() {
        return ordinaryGroupingSetOrRollupListOrCubeList;
    }

    /**
     * Sets the value of the ordinaryGroupingSetOrRollupListOrCubeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdinaryGroupingSetType }
     *     {@link RollupListType }
     *     {@link CubeListType }
     *     {@link GroupingSetsSpecificationType }
     *     {@link EmptyGroupingSetType }
     *     
     */
    public void setOrdinaryGroupingSetOrRollupListOrCubeList(Object value) {
        this.ordinaryGroupingSetOrRollupListOrCubeList = value;
    }

}
