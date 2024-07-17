package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_exp_id complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_exp_id">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="sau_code_sq_pk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sau_sac_code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sau_gsau_code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sau_nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sau_datecr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sau_datemj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sau_effetnotoire" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cdf_nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sau_doc_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sau_texte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_exp_id", propOrder = {

})
public class RowGetTheExpId {

    @XmlElement(name = "sau_code_sq_pk", required = true, nillable = true)
    protected String sauCodeSqPk;
    @XmlElement(name = "sau_sac_code_fk", required = true, nillable = true)
    protected String sauSacCodeFk;
    @XmlElement(name = "sau_gsau_code_fk", required = true, nillable = true)
    protected String sauGsauCodeFk;
    @XmlElement(name = "sau_nom", required = true, nillable = true)
    protected String sauNom;
    @XmlElement(name = "sau_datecr", required = true, nillable = true)
    protected String sauDatecr;
    @XmlElement(name = "sau_datemj", required = true, nillable = true)
    protected String sauDatemj;
    @XmlElement(name = "sau_effetnotoire", required = true, nillable = true)
    protected String sauEffetnotoire;
    @XmlElement(name = "cdf_nom", required = true, nillable = true)
    protected String cdfNom;
    @XmlElement(name = "sau_doc_date", required = true, nillable = true)
    protected String sauDocDate;
    @XmlElement(name = "sau_texte", required = true, nillable = true)
    protected String sauTexte;

    /**
     * Gets the value of the sauCodeSqPk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSauCodeSqPk() {
        return sauCodeSqPk;
    }

    /**
     * Sets the value of the sauCodeSqPk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSauCodeSqPk(String value) {
        this.sauCodeSqPk = value;
    }

    /**
     * Gets the value of the sauSacCodeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSauSacCodeFk() {
        return sauSacCodeFk;
    }

    /**
     * Sets the value of the sauSacCodeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSauSacCodeFk(String value) {
        this.sauSacCodeFk = value;
    }

    /**
     * Gets the value of the sauGsauCodeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSauGsauCodeFk() {
        return sauGsauCodeFk;
    }

    /**
     * Sets the value of the sauGsauCodeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSauGsauCodeFk(String value) {
        this.sauGsauCodeFk = value;
    }

    /**
     * Gets the value of the sauNom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSauNom() {
        return sauNom;
    }

    /**
     * Sets the value of the sauNom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSauNom(String value) {
        this.sauNom = value;
    }

    /**
     * Gets the value of the sauDatecr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSauDatecr() {
        return sauDatecr;
    }

    /**
     * Sets the value of the sauDatecr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSauDatecr(String value) {
        this.sauDatecr = value;
    }

    /**
     * Gets the value of the sauDatemj property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSauDatemj() {
        return sauDatemj;
    }

    /**
     * Sets the value of the sauDatemj property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSauDatemj(String value) {
        this.sauDatemj = value;
    }

    /**
     * Gets the value of the sauEffetnotoire property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSauEffetnotoire() {
        return sauEffetnotoire;
    }

    /**
     * Sets the value of the sauEffetnotoire property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSauEffetnotoire(String value) {
        this.sauEffetnotoire = value;
    }

    /**
     * Gets the value of the cdfNom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCdfNom() {
        return cdfNom;
    }

    /**
     * Sets the value of the cdfNom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCdfNom(String value) {
        this.cdfNom = value;
    }

    /**
     * Gets the value of the sauDocDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSauDocDate() {
        return sauDocDate;
    }

    /**
     * Sets the value of the sauDocDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSauDocDate(String value) {
        this.sauDocDate = value;
    }

    /**
     * Gets the value of the sauTexte property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSauTexte() {
        return sauTexte;
    }

    /**
     * Sets the value of the sauTexte property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSauTexte(String value) {
        this.sauTexte = value;
    }

}
