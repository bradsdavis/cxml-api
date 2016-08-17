//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 11:18:10 AM CEST 
//


package org.cxml.v12028;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "componentConsumptionHeader",
    "componentConsumptionPortion"
})
@XmlRootElement(name = "ComponentConsumptionRequest")
public class ComponentConsumptionRequest {

    @XmlElement(name = "ComponentConsumptionHeader", required = true)
    protected ComponentConsumptionHeader componentConsumptionHeader;
    @XmlElement(name = "ComponentConsumptionPortion")
    protected List<ComponentConsumptionPortion> componentConsumptionPortion;

    /**
     * Gets the value of the componentConsumptionHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentConsumptionHeader }
     *     
     */
    public ComponentConsumptionHeader getComponentConsumptionHeader() {
        return componentConsumptionHeader;
    }

    /**
     * Sets the value of the componentConsumptionHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentConsumptionHeader }
     *     
     */
    public void setComponentConsumptionHeader(ComponentConsumptionHeader value) {
        this.componentConsumptionHeader = value;
    }

    /**
     * Gets the value of the componentConsumptionPortion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentConsumptionPortion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentConsumptionPortion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentConsumptionPortion }
     * 
     * 
     */
    public List<ComponentConsumptionPortion> getComponentConsumptionPortion() {
        if (componentConsumptionPortion == null) {
            componentConsumptionPortion = new ArrayList<ComponentConsumptionPortion>();
        }
        return this.componentConsumptionPortion;
    }

}
