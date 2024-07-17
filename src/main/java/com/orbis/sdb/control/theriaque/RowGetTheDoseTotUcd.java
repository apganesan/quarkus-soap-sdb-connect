package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_dose_tot_ucd complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_dose_tot_ucd">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="id_spe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cip13" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_subact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="lib_subst" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dose" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_dose_tot_ucd", propOrder = {

})
public class RowGetTheDoseTotUcd {

    @XmlElement(name = "id_spe", required = true, nillable = true)
    protected String idSpe;
    @XmlElement(required = true, nillable = true)
    protected String cip;
    @XmlElement(required = true, nillable = true)
    protected String cip13;
    @XmlElement(name = "id_subact", required = true, nillable = true)
    protected String idSubact;
    @XmlElement(name = "lib_subst", required = true, nillable = true)
    protected String libSubst;
    @XmlElement(required = true, nillable = true)
    protected String dose;
    @XmlElement(required = true, nillable = true)
    protected String unit;

    /**
     * Gets the value of the idSpe property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdSpe() {
        return idSpe;
    }

    /**
     * Sets the value of the idSpe property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdSpe(String value) {
        this.idSpe = value;
    }

    /**
     * Gets the value of the cip property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCip() {
        return cip;
    }

    /**
     * Sets the value of the cip property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCip(String value) {
        this.cip = value;
    }

    /**
     * Gets the value of the cip13 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCip13() {
        return cip13;
    }

    /**
     * Sets the value of the cip13 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCip13(String value) {
        this.cip13 = value;
    }

    /**
     * Gets the value of the idSubact property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdSubact() {
        return idSubact;
    }

    /**
     * Sets the value of the idSubact property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdSubact(String value) {
        this.idSubact = value;
    }

    /**
     * Gets the value of the libSubst property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibSubst() {
        return libSubst;
    }

    /**
     * Sets the value of the libSubst property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibSubst(String value) {
        this.libSubst = value;
    }

    /**
     * Gets the value of the dose property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDose() {
        return dose;
    }

    /**
     * Sets the value of the dose property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDose(String value) {
        this.dose = value;
    }

    /**
     * Gets the value of the unit property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}
