//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 11:07:02 AM CEST 
//


package org.cxml.catalog;

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
    "purchaseRequisitionHeader",
    "itemIn"
})
@XmlRootElement(name = "PurchaseRequisition")
public class PurchaseRequisition {

    @XmlElement(name = "PurchaseRequisitionHeader", required = true)
    protected PurchaseRequisitionHeader purchaseRequisitionHeader;
    @XmlElement(name = "ItemIn")
    protected List<ItemIn> itemIn;

    /**
     * Gets the value of the purchaseRequisitionHeader property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseRequisitionHeader }
     *     
     */
    public PurchaseRequisitionHeader getPurchaseRequisitionHeader() {
        return purchaseRequisitionHeader;
    }

    /**
     * Sets the value of the purchaseRequisitionHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseRequisitionHeader }
     *     
     */
    public void setPurchaseRequisitionHeader(PurchaseRequisitionHeader value) {
        this.purchaseRequisitionHeader = value;
    }

    /**
     * Gets the value of the itemIn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemIn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemIn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemIn }
     * 
     * 
     */
    public List<ItemIn> getItemIn() {
        if (itemIn == null) {
            itemIn = new ArrayList<ItemIn>();
        }
        return this.itemIn;
    }

}
