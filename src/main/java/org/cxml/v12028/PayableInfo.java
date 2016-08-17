//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 11:14:20 AM CEST 
//


package org.cxml.v12028;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "payableInvoiceInfoOrPayableOrderInfoOrPayableMasterAgreementInfo"
})
@XmlRootElement(name = "PayableInfo")
public class PayableInfo {

    @XmlElements({
        @XmlElement(name = "PayableInvoiceInfo", required = true, type = PayableInvoiceInfo.class),
        @XmlElement(name = "PayableOrderInfo", required = true, type = PayableOrderInfo.class),
        @XmlElement(name = "PayableMasterAgreementInfo", required = true, type = PayableMasterAgreementInfo.class)
    })
    protected List<Object> payableInvoiceInfoOrPayableOrderInfoOrPayableMasterAgreementInfo;

    /**
     * Gets the value of the payableInvoiceInfoOrPayableOrderInfoOrPayableMasterAgreementInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payableInvoiceInfoOrPayableOrderInfoOrPayableMasterAgreementInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayableInvoiceInfoOrPayableOrderInfoOrPayableMasterAgreementInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayableInvoiceInfo }
     * {@link PayableOrderInfo }
     * {@link PayableMasterAgreementInfo }
     * 
     * 
     */
    public List<Object> getPayableInvoiceInfoOrPayableOrderInfoOrPayableMasterAgreementInfo() {
        if (payableInvoiceInfoOrPayableOrderInfoOrPayableMasterAgreementInfo == null) {
            payableInvoiceInfoOrPayableOrderInfoOrPayableMasterAgreementInfo = new ArrayList<Object>();
        }
        return this.payableInvoiceInfoOrPayableOrderInfoOrPayableMasterAgreementInfo;
    }

}
