package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_atc_ddd complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_atc_ddd">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="catc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dosage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="codevoie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nomvoie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="codeunite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nomunite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_atc_ddd", propOrder = {

})
public class RowGetTheAtcDdd {

    @XmlElement(required = true, nillable = true)
    protected String catc;
    @XmlElement(required = true, nillable = true)
    protected String dosage;
    @XmlElement(required = true, nillable = true)
    protected String codevoie;
    @XmlElement(required = true, nillable = true)
    protected String nomvoie;
    @XmlElement(required = true, nillable = true)
    protected String codeunite;
    @XmlElement(required = true, nillable = true)
    protected String nomunite;

    /**
     * Gets the value of the catc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCatc() {
        return catc;
    }

    /**
     * Sets the value of the catc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCatc(String value) {
        this.catc = value;
    }

    /**
     * Gets the value of the dosage property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDosage() {
        return dosage;
    }

    /**
     * Sets the value of the dosage property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDosage(String value) {
        this.dosage = value;
    }

    /**
     * Gets the value of the codevoie property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodevoie() {
        return codevoie;
    }

    /**
     * Sets the value of the codevoie property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodevoie(String value) {
        this.codevoie = value;
    }

    /**
     * Gets the value of the nomvoie property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNomvoie() {
        return nomvoie;
    }

    /**
     * Sets the value of the nomvoie property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNomvoie(String value) {
        this.nomvoie = value;
    }

    /**
     * Gets the value of the codeunite property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeunite() {
        return codeunite;
    }

    /**
     * Sets the value of the codeunite property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeunite(String value) {
        this.codeunite = value;
    }

    /**
     * Gets the value of the nomunite property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNomunite() {
        return nomunite;
    }

    /**
     * Sets the value of the nomunite property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNomunite(String value) {
        this.nomunite = value;
    }

}
