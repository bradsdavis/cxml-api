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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderReferenceOrOrderIDInfo",
    "contact",
    "comments",
    "extrinsic"
})
@XmlRootElement(name = "OrderStatusRequestHeader")
public class OrderStatusRequestHeader {

    @XmlAttribute(name = "orderStatusRequestID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String orderStatusRequestID;
    @XmlAttribute(name = "orderStatusRequestDate", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String orderStatusRequestDate;
    @XmlElements({
        @XmlElement(name = "OrderReference", required = true, type = OrderReference.class),
        @XmlElement(name = "OrderIDInfo", required = true, type = OrderIDInfo.class)
    })
    protected List<Object> orderReferenceOrOrderIDInfo;
    @XmlElement(name = "Contact", required = true)
    protected List<Contact> contact;
    @XmlElement(name = "Comments")
    protected Comments comments;
    @XmlElement(name = "Extrinsic")
    protected List<Extrinsic> extrinsic;

    /**
     * Gets the value of the orderStatusRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatusRequestID() {
        return orderStatusRequestID;
    }

    /**
     * Sets the value of the orderStatusRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatusRequestID(String value) {
        this.orderStatusRequestID = value;
    }

    /**
     * Gets the value of the orderStatusRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatusRequestDate() {
        return orderStatusRequestDate;
    }

    /**
     * Sets the value of the orderStatusRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatusRequestDate(String value) {
        this.orderStatusRequestDate = value;
    }

    /**
     * Gets the value of the orderReferenceOrOrderIDInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderReferenceOrOrderIDInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderReferenceOrOrderIDInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderReference }
     * {@link OrderIDInfo }
     * 
     * 
     */
    public List<Object> getOrderReferenceOrOrderIDInfo() {
        if (orderReferenceOrOrderIDInfo == null) {
            orderReferenceOrOrderIDInfo = new ArrayList<Object>();
        }
        return this.orderReferenceOrOrderIDInfo;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getContact() {
        if (contact == null) {
            contact = new ArrayList<Contact>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link Comments }
     *     
     */
    public Comments getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comments }
     *     
     */
    public void setComments(Comments value) {
        this.comments = value;
    }

    /**
     * Gets the value of the extrinsic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extrinsic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrinsic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extrinsic }
     * 
     * 
     */
    public List<Extrinsic> getExtrinsic() {
        if (extrinsic == null) {
            extrinsic = new ArrayList<Extrinsic>();
        }
        return this.extrinsic;
    }

}
