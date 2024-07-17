package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_atc_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_atc_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="catcfils" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="catcpere" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="catclibf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="catcliba" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="catctext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_atc_spe", propOrder = {

})
public class RowGetTheAtcSpe {

    @XmlElement(required = true, nillable = true)
    protected String catcfils;
    @XmlElement(required = true, nillable = true)
    protected String catcpere;
    @XmlElement(required = true, nillable = true)
    protected String catclibf;
    @XmlElement(required = true, nillable = true)
    protected String catcliba;
    @XmlElement(required = true, nillable = true)
    protected String catctext;

    /**
     * Gets the value of the catcfils property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCatcfils() {
        return catcfils;
    }

    /**
     * Sets the value of the catcfils property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCatcfils(String value) {
        this.catcfils = value;
    }

    /**
     * Gets the value of the catcpere property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCatcpere() {
        return catcpere;
    }

    /**
     * Sets the value of the catcpere property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCatcpere(String value) {
        this.catcpere = value;
    }

    /**
     * Gets the value of the catclibf property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCatclibf() {
        return catclibf;
    }

    /**
     * Sets the value of the catclibf property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCatclibf(String value) {
        this.catclibf = value;
    }

    /**
     * Gets the value of the catcliba property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCatcliba() {
        return catcliba;
    }

    /**
     * Sets the value of the catcliba property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCatcliba(String value) {
        this.catcliba = value;
    }

    /**
     * Gets the value of the catctext property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCatctext() {
        return catctext;
    }

    /**
     * Sets the value of the catctext property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCatctext(String value) {
        this.catctext = value;
    }

}
