//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 11:18:10 AM CEST 
//


package org.cxml.fulfill;

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
    "money",
    "modifications"
})
@XmlRootElement(name = "Total")
public class Total {

    @XmlElement(name = "Money", required = true)
    protected Money money;
    @XmlElement(name = "Modifications")
    protected Modifications modifications;

    /**
     * Gets the value of the money property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMoney() {
        return money;
    }

    /**
     * Sets the value of the money property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMoney(Money value) {
        this.money = value;
    }

    /**
     * Gets the value of the modifications property.
     * 
     * @return
     *     possible object is
     *     {@link Modifications }
     *     
     */
    public Modifications getModifications() {
        return modifications;
    }

    /**
     * Sets the value of the modifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modifications }
     *     
     */
    public void setModifications(Modifications value) {
        this.modifications = value;
    }

}
