//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 10:57:51 AM CEST 
//


package org.cxml.invoicedetail;

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
    "eanid",
    "europeanWasteCatalogID",
    "characteristic"
})
@XmlRootElement(name = "InvoiceDetailItemReferenceRetail")
public class InvoiceDetailItemReferenceRetail {

    @XmlElement(name = "EANID")
    protected String eanid;
    @XmlElement(name = "EuropeanWasteCatalogID")
    protected String europeanWasteCatalogID;
    @XmlElement(name = "Characteristic")
    protected List<Characteristic> characteristic;

    /**
     * Gets the value of the eanid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEANID() {
        return eanid;
    }

    /**
     * Sets the value of the eanid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEANID(String value) {
        this.eanid = value;
    }

    /**
     * Gets the value of the europeanWasteCatalogID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuropeanWasteCatalogID() {
        return europeanWasteCatalogID;
    }

    /**
     * Sets the value of the europeanWasteCatalogID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuropeanWasteCatalogID(String value) {
        this.europeanWasteCatalogID = value;
    }

    /**
     * Gets the value of the characteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Characteristic }
     * 
     * 
     */
    public List<Characteristic> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<Characteristic>();
        }
        return this.characteristic;
    }

}
