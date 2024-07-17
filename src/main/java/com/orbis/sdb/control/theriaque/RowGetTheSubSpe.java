package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_sub_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_sub_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="typsubst" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="codesubst" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dosesubst" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="udosesubst" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="subactpere" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="libsubst" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="numordre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="compordre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="effetnotoire" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_sub_spe", propOrder = {

})
public class RowGetTheSubSpe {

    @XmlElement(required = true, nillable = true)
    protected String typsubst;
    @XmlElement(required = true, nillable = true)
    protected String codesubst;
    @XmlElement(required = true, nillable = true)
    protected String dosesubst;
    @XmlElement(required = true, nillable = true)
    protected String udosesubst;
    @XmlElement(required = true, nillable = true)
    protected String subactpere;
    @XmlElement(required = true, nillable = true)
    protected String libsubst;
    @XmlElement(required = true, nillable = true)
    protected String numordre;
    @XmlElement(required = true, nillable = true)
    protected String compordre;
    @XmlElement(required = true, nillable = true)
    protected String effetnotoire;

    /**
     * Gets the value of the typsubst property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTypsubst() {
        return typsubst;
    }

    /**
     * Sets the value of the typsubst property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTypsubst(String value) {
        this.typsubst = value;
    }

    /**
     * Gets the value of the codesubst property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodesubst() {
        return codesubst;
    }

    /**
     * Sets the value of the codesubst property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodesubst(String value) {
        this.codesubst = value;
    }

    /**
     * Gets the value of the dosesubst property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDosesubst() {
        return dosesubst;
    }

    /**
     * Sets the value of the dosesubst property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDosesubst(String value) {
        this.dosesubst = value;
    }

    /**
     * Gets the value of the udosesubst property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUdosesubst() {
        return udosesubst;
    }

    /**
     * Sets the value of the udosesubst property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUdosesubst(String value) {
        this.udosesubst = value;
    }

    /**
     * Gets the value of the subactpere property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubactpere() {
        return subactpere;
    }

    /**
     * Sets the value of the subactpere property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubactpere(String value) {
        this.subactpere = value;
    }

    /**
     * Gets the value of the libsubst property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibsubst() {
        return libsubst;
    }

    /**
     * Sets the value of the libsubst property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibsubst(String value) {
        this.libsubst = value;
    }

    /**
     * Gets the value of the numordre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumordre() {
        return numordre;
    }

    /**
     * Sets the value of the numordre property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumordre(String value) {
        this.numordre = value;
    }

    /**
     * Gets the value of the compordre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompordre() {
        return compordre;
    }

    /**
     * Sets the value of the compordre property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompordre(String value) {
        this.compordre = value;
    }

    /**
     * Gets the value of the effetnotoire property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEffetnotoire() {
        return effetnotoire;
    }

    /**
     * Sets the value of the effetnotoire property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEffetnotoire(String value) {
        this.effetnotoire = value;
    }

}
