package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_atc_atc complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_atc_atc">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="catc_code_pk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="catc_catc_code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="catc_nomf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="catc_noma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="catc_datecr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="catc_datemj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="catc_texte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_atc_atc", propOrder = {

})
public class RowGetTheAtcAtc {

    @XmlElement(name = "catc_code_pk", required = true, nillable = true)
    protected String catcCodePk;
    @XmlElement(name = "catc_catc_code_fk", required = true, nillable = true)
    protected String catcCatcCodeFk;
    @XmlElement(name = "catc_nomf", required = true, nillable = true)
    protected String catcNomf;
    @XmlElement(name = "catc_noma", required = true, nillable = true)
    protected String catcNoma;
    @XmlElement(name = "catc_datecr", required = true, nillable = true)
    protected String catcDatecr;
    @XmlElement(name = "catc_datemj", required = true, nillable = true)
    protected String catcDatemj;
    @XmlElement(name = "catc_texte", required = true, nillable = true)
    protected String catcTexte;

    /**
     * Gets the value of the catcCodePk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCatcCodePk() {
        return catcCodePk;
    }

    /**
     * Sets the value of the catcCodePk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCatcCodePk(String value) {
        this.catcCodePk = value;
    }

    /**
     * Gets the value of the catcCatcCodeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCatcCatcCodeFk() {
        return catcCatcCodeFk;
    }

    /**
     * Sets the value of the catcCatcCodeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCatcCatcCodeFk(String value) {
        this.catcCatcCodeFk = value;
    }

    /**
     * Gets the value of the catcNomf property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCatcNomf() {
        return catcNomf;
    }

    /**
     * Sets the value of the catcNomf property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCatcNomf(String value) {
        this.catcNomf = value;
    }

    /**
     * Gets the value of the catcNoma property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCatcNoma() {
        return catcNoma;
    }

    /**
     * Sets the value of the catcNoma property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCatcNoma(String value) {
        this.catcNoma = value;
    }

    /**
     * Gets the value of the catcDatecr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCatcDatecr() {
        return catcDatecr;
    }

    /**
     * Sets the value of the catcDatecr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCatcDatecr(String value) {
        this.catcDatecr = value;
    }

    /**
     * Gets the value of the catcDatemj property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCatcDatemj() {
        return catcDatemj;
    }

    /**
     * Sets the value of the catcDatemj property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCatcDatemj(String value) {
        this.catcDatemj = value;
    }

    /**
     * Gets the value of the catcTexte property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCatcTexte() {
        return catcTexte;
    }

    /**
     * Sets the value of the catcTexte property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCatcTexte(String value) {
        this.catcTexte = value;
    }

}
