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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "invoiceIDInfo",
    "partialAmount",
    "comments"
})
@XmlRootElement(name = "InvoiceStatus")
public class InvoiceStatus {

    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlElement(name = "InvoiceIDInfo")
    protected InvoiceIDInfo invoiceIDInfo;
    @XmlElement(name = "PartialAmount")
    protected PartialAmount partialAmount;
    @XmlElement(name = "Comments")
    protected List<Comments> comments;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the invoiceIDInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceIDInfo }
     *     
     */
    public InvoiceIDInfo getInvoiceIDInfo() {
        return invoiceIDInfo;
    }

    /**
     * Sets the value of the invoiceIDInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceIDInfo }
     *     
     */
    public void setInvoiceIDInfo(InvoiceIDInfo value) {
        this.invoiceIDInfo = value;
    }

    /**
     * Gets the value of the partialAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PartialAmount }
     *     
     */
    public PartialAmount getPartialAmount() {
        return partialAmount;
    }

    /**
     * Sets the value of the partialAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialAmount }
     *     
     */
    public void setPartialAmount(PartialAmount value) {
        this.partialAmount = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comments }
     * 
     * 
     */
    public List<Comments> getComments() {
        if (comments == null) {
            comments = new ArrayList<Comments>();
        }
        return this.comments;
    }

}
