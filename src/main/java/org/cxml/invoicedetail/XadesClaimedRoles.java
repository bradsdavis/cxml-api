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
    "xadesClaimedRole"
})
@XmlRootElement(name = "xades:ClaimedRoles")
public class XadesClaimedRoles {

    @XmlElement(name = "xades:ClaimedRole", required = true)
    protected List<XadesClaimedRole> xadesClaimedRole;

    /**
     * Gets the value of the xadesClaimedRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xadesClaimedRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXadesClaimedRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XadesClaimedRole }
     * 
     * 
     */
    public List<XadesClaimedRole> getXadesClaimedRole() {
        if (xadesClaimedRole == null) {
            xadesClaimedRole = new ArrayList<XadesClaimedRole>();
        }
        return this.xadesClaimedRole;
    }

}
