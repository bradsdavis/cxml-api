//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.23 at 10:57:51 AM CEST 
//


package org.cxml.invoicedetail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xadesSignedProperties",
    "xadesUnsignedProperties"
})
@XmlRootElement(name = "xades:QualifyingProperties")
public class XadesQualifyingProperties {

    @XmlAttribute(name = "Target", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String target;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "xmlns:xades")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String xmlnsXades;
    @XmlElement(name = "xades:SignedProperties")
    protected XadesSignedProperties xadesSignedProperties;
    @XmlElement(name = "xades:UnsignedProperties")
    protected XadesUnsignedProperties xadesUnsignedProperties;

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the xmlnsXades property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlnsXades() {
        if (xmlnsXades == null) {
            return "http://uri.etsi.org/01903/v1.3.2#";
        } else {
            return xmlnsXades;
        }
    }

    /**
     * Sets the value of the xmlnsXades property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlnsXades(String value) {
        this.xmlnsXades = value;
    }

    /**
     * Gets the value of the xadesSignedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link XadesSignedProperties }
     *     
     */
    public XadesSignedProperties getXadesSignedProperties() {
        return xadesSignedProperties;
    }

    /**
     * Sets the value of the xadesSignedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesSignedProperties }
     *     
     */
    public void setXadesSignedProperties(XadesSignedProperties value) {
        this.xadesSignedProperties = value;
    }

    /**
     * Gets the value of the xadesUnsignedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link XadesUnsignedProperties }
     *     
     */
    public XadesUnsignedProperties getXadesUnsignedProperties() {
        return xadesUnsignedProperties;
    }

    /**
     * Sets the value of the xadesUnsignedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesUnsignedProperties }
     *     
     */
    public void setXadesUnsignedProperties(XadesUnsignedProperties value) {
        this.xadesUnsignedProperties = value;
    }

}
