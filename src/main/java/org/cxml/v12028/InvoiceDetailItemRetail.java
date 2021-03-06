//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 10:57:51 AM CEST 
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
    "additionalPrices",
    "totalRetailAmount",
    "itemIndicator",
    "promotionDealID",
    "promotionVariantID"
})
@XmlRootElement(name = "InvoiceDetailItemRetail")
public class InvoiceDetailItemRetail {

    @XmlElement(name = "AdditionalPrices")
    protected AdditionalPrices additionalPrices;
    @XmlElement(name = "TotalRetailAmount")
    protected TotalRetailAmount totalRetailAmount;
    @XmlElement(name = "ItemIndicator")
    protected List<ItemIndicator> itemIndicator;
    @XmlElement(name = "PromotionDealID")
    protected String promotionDealID;
    @XmlElement(name = "PromotionVariantID")
    protected String promotionVariantID;

    /**
     * Gets the value of the additionalPrices property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalPrices }
     *     
     */
    public AdditionalPrices getAdditionalPrices() {
        return additionalPrices;
    }

    /**
     * Sets the value of the additionalPrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalPrices }
     *     
     */
    public void setAdditionalPrices(AdditionalPrices value) {
        this.additionalPrices = value;
    }

    /**
     * Gets the value of the totalRetailAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TotalRetailAmount }
     *     
     */
    public TotalRetailAmount getTotalRetailAmount() {
        return totalRetailAmount;
    }

    /**
     * Sets the value of the totalRetailAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalRetailAmount }
     *     
     */
    public void setTotalRetailAmount(TotalRetailAmount value) {
        this.totalRetailAmount = value;
    }

    /**
     * Gets the value of the itemIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemIndicator }
     * 
     * 
     */
    public List<ItemIndicator> getItemIndicator() {
        if (itemIndicator == null) {
            itemIndicator = new ArrayList<ItemIndicator>();
        }
        return this.itemIndicator;
    }

    /**
     * Gets the value of the promotionDealID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionDealID() {
        return promotionDealID;
    }

    /**
     * Sets the value of the promotionDealID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionDealID(String value) {
        this.promotionDealID = value;
    }

    /**
     * Gets the value of the promotionVariantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionVariantID() {
        return promotionVariantID;
    }

    /**
     * Sets the value of the promotionVariantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionVariantID(String value) {
        this.promotionVariantID = value;
    }

}
