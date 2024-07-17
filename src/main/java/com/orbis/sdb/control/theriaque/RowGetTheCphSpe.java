package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_cph_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_cph_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="cphpere" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cphfils" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="libcph" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_cph_spe", propOrder = {

})
public class RowGetTheCphSpe {

    @XmlElement(required = true, nillable = true)
    protected String cphpere;
    @XmlElement(required = true, nillable = true)
    protected String cphfils;
    @XmlElement(required = true, nillable = true)
    protected String libcph;

    /**
     * Gets the value of the cphpere property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCphpere() {
        return cphpere;
    }

    /**
     * Sets the value of the cphpere property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCphpere(String value) {
        this.cphpere = value;
    }

    /**
     * Gets the value of the cphfils property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCphfils() {
        return cphfils;
    }

    /**
     * Sets the value of the cphfils property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCphfils(String value) {
        this.cphfils = value;
    }

    /**
     * Gets the value of the libcph property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibcph() {
        return libcph;
    }

    /**
     * Sets the value of the libcph property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibcph(String value) {
        this.libcph = value;
    }

}
