package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_ephmra_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_ephmra_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="cephpere" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cephfils" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cephlibf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cephliba" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_ephmra_spe", propOrder = {

})
public class RowGetTheEphmraSpe {

    @XmlElement(required = true, nillable = true)
    protected String cephpere;
    @XmlElement(required = true, nillable = true)
    protected String cephfils;
    @XmlElement(required = true, nillable = true)
    protected String cephlibf;
    @XmlElement(required = true, nillable = true)
    protected String cephliba;

    /**
     * Gets the value of the cephpere property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCephpere() {
        return cephpere;
    }

    /**
     * Sets the value of the cephpere property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCephpere(String value) {
        this.cephpere = value;
    }

    /**
     * Gets the value of the cephfils property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCephfils() {
        return cephfils;
    }

    /**
     * Sets the value of the cephfils property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCephfils(String value) {
        this.cephfils = value;
    }

    /**
     * Gets the value of the cephlibf property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCephlibf() {
        return cephlibf;
    }

    /**
     * Sets the value of the cephlibf property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCephlibf(String value) {
        this.cephlibf = value;
    }

    /**
     * Gets the value of the cephliba property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCephliba() {
        return cephliba;
    }

    /**
     * Sets the value of the cephliba property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCephliba(String value) {
        this.cephliba = value;
    }

}
