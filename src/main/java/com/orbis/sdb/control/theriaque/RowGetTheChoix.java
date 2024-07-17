package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_choix complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_choix">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="lib_choix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="titre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="precision1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="precision2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nu_fiche" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="date_texte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_choix", propOrder = {

})
public class RowGetTheChoix {

    @XmlElement(name = "lib_choix", required = true, nillable = true)
    protected String libChoix;
    @XmlElement(required = true, nillable = true)
    protected String titre;
    @XmlElement(required = true, nillable = true)
    protected String precision1;
    @XmlElement(required = true, nillable = true)
    protected String precision2;
    @XmlElement(name = "nu_fiche", required = true, nillable = true)
    protected String nuFiche;
    @XmlElement(name = "date_texte", required = true, nillable = true)
    protected String dateTexte;

    /**
     * Gets the value of the libChoix property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibChoix() {
        return libChoix;
    }

    /**
     * Sets the value of the libChoix property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibChoix(String value) {
        this.libChoix = value;
    }

    /**
     * Gets the value of the titre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Sets the value of the titre property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitre(String value) {
        this.titre = value;
    }

    /**
     * Gets the value of the precision1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrecision1() {
        return precision1;
    }

    /**
     * Sets the value of the precision1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrecision1(String value) {
        this.precision1 = value;
    }

    /**
     * Gets the value of the precision2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrecision2() {
        return precision2;
    }

    /**
     * Sets the value of the precision2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrecision2(String value) {
        this.precision2 = value;
    }

    /**
     * Gets the value of the nuFiche property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNuFiche() {
        return nuFiche;
    }

    /**
     * Sets the value of the nuFiche property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNuFiche(String value) {
        this.nuFiche = value;
    }

    /**
     * Gets the value of the dateTexte property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDateTexte() {
        return dateTexte;
    }

    /**
     * Sets the value of the dateTexte property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDateTexte(String value) {
        this.dateTexte = value;
    }

}
