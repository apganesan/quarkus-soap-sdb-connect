package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_redon complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_redon">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="idspe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sac" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dose" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sac_nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_redon", propOrder = {

})
public class RowGetTheRedon {

    @XmlElement(required = true, nillable = true)
    protected String idspe;
    @XmlElement(required = true, nillable = true)
    protected String nom;
    @XmlElement(required = true, nillable = true)
    protected String sac;
    @XmlElement(required = true, nillable = true)
    protected String dose;
    @XmlElement(required = true, nillable = true)
    protected String unite;
    @XmlElement(name = "sac_nom", required = true, nillable = true)
    protected String sacNom;

    /**
     * Gets the value of the idspe property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdspe() {
        return idspe;
    }

    /**
     * Sets the value of the idspe property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdspe(String value) {
        this.idspe = value;
    }

    /**
     * Gets the value of the nom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the value of the nom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Gets the value of the sac property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSac() {
        return sac;
    }

    /**
     * Sets the value of the sac property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSac(String value) {
        this.sac = value;
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
     * Gets the value of the unite property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnite() {
        return unite;
    }

    /**
     * Sets the value of the unite property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnite(String value) {
        this.unite = value;
    }

    /**
     * Gets the value of the sacNom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSacNom() {
        return sacNom;
    }

    /**
     * Sets the value of the sacNom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSacNom(String value) {
        this.sacNom = value;
    }

}
