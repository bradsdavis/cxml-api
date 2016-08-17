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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "buyerBatchID",
    "supplierBatchID",
    "propertyValuation"
})
@XmlRootElement(name = "Batch")
public class Batch {

    @XmlAttribute(name = "productionDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String productionDate;
    @XmlAttribute(name = "expirationDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String expirationDate;
    @XmlAttribute(name = "originCountryCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String originCountryCode;
    @XmlElement(name = "BuyerBatchID")
    protected String buyerBatchID;
    @XmlElement(name = "SupplierBatchID")
    protected String supplierBatchID;
    @XmlElement(name = "PropertyValuation")
    protected List<PropertyValuation> propertyValuation;

    /**
     * Gets the value of the productionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionDate() {
        return productionDate;
    }

    /**
     * Sets the value of the productionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionDate(String value) {
        this.productionDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the originCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /**
     * Sets the value of the originCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCountryCode(String value) {
        this.originCountryCode = value;
    }

    /**
     * Gets the value of the buyerBatchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerBatchID() {
        return buyerBatchID;
    }

    /**
     * Sets the value of the buyerBatchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerBatchID(String value) {
        this.buyerBatchID = value;
    }

    /**
     * Gets the value of the supplierBatchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierBatchID() {
        return supplierBatchID;
    }

    /**
     * Sets the value of the supplierBatchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierBatchID(String value) {
        this.supplierBatchID = value;
    }

    /**
     * Gets the value of the propertyValuation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyValuation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyValuation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyValuation }
     * 
     * 
     */
    public List<PropertyValuation> getPropertyValuation() {
        if (propertyValuation == null) {
            propertyValuation = new ArrayList<PropertyValuation>();
        }
        return this.propertyValuation;
    }

}
