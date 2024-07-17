package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for obj_patient complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="obj_patient">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="datenaissance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sexe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="taille" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="poids" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="surfacecorp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="grossesse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="date_grossesse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="typ_date_gross" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="allaitement" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="age_procreer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="clairance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="insufhepat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="etatpatho" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="etatpatho_cim" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="hypersensibilite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obj_patient", propOrder = {

})
public class ObjPatient {

    @XmlElement(required = true, nillable = true)
    protected String datenaissance;
    @XmlElement(required = true, nillable = true)
    protected String sexe;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer taille;
    @XmlElement(required = true, nillable = true)
    protected String poids;
    @XmlElement(required = true, nillable = true)
    protected String surfacecorp;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer grossesse;
    @XmlElement(name = "date_grossesse", required = true, nillable = true)
    protected String dateGrossesse;
    @XmlElement(name = "typ_date_gross", required = true, type = Integer.class, nillable = true)
    protected Integer typDateGross;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer allaitement;
    @XmlElement(name = "age_procreer", required = true, type = Integer.class, nillable = true)
    protected Integer ageProcreer;
    @XmlElement(required = true, nillable = true)
    protected String clairance;
    @XmlElement(required = true, nillable = true)
    protected String insufhepat;
    @XmlElement(required = true, nillable = true)
    protected String etatpatho;
    @XmlElement(name = "etatpatho_cim", required = true, nillable = true)
    protected String etatpathoCim;
    @XmlElement(required = true, nillable = true)
    protected String hypersensibilite;

    /**
     * Gets the value of the datenaissance property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatenaissance() {
        return datenaissance;
    }

    /**
     * Sets the value of the datenaissance property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatenaissance(String value) {
        this.datenaissance = value;
    }

    /**
     * Gets the value of the sexe property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * Sets the value of the sexe property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSexe(String value) {
        this.sexe = value;
    }

    /**
     * Gets the value of the taille property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTaille() {
        return taille;
    }

    /**
     * Sets the value of the taille property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTaille(Integer value) {
        this.taille = value;
    }

    /**
     * Gets the value of the poids property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPoids() {
        return poids;
    }

    /**
     * Sets the value of the poids property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPoids(String value) {
        this.poids = value;
    }

    /**
     * Gets the value of the surfacecorp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurfacecorp() {
        return surfacecorp;
    }

    /**
     * Sets the value of the surfacecorp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurfacecorp(String value) {
        this.surfacecorp = value;
    }

    /**
     * Gets the value of the grossesse property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getGrossesse() {
        return grossesse;
    }

    /**
     * Sets the value of the grossesse property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setGrossesse(Integer value) {
        this.grossesse = value;
    }

    /**
     * Gets the value of the dateGrossesse property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDateGrossesse() {
        return dateGrossesse;
    }

    /**
     * Sets the value of the dateGrossesse property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDateGrossesse(String value) {
        this.dateGrossesse = value;
    }

    /**
     * Gets the value of the typDateGross property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTypDateGross() {
        return typDateGross;
    }

    /**
     * Sets the value of the typDateGross property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTypDateGross(Integer value) {
        this.typDateGross = value;
    }

    /**
     * Gets the value of the allaitement property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getAllaitement() {
        return allaitement;
    }

    /**
     * Sets the value of the allaitement property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setAllaitement(Integer value) {
        this.allaitement = value;
    }

    /**
     * Gets the value of the ageProcreer property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getAgeProcreer() {
        return ageProcreer;
    }

    /**
     * Sets the value of the ageProcreer property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setAgeProcreer(Integer value) {
        this.ageProcreer = value;
    }

    /**
     * Gets the value of the clairance property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClairance() {
        return clairance;
    }

    /**
     * Sets the value of the clairance property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClairance(String value) {
        this.clairance = value;
    }

    /**
     * Gets the value of the insufhepat property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInsufhepat() {
        return insufhepat;
    }

    /**
     * Sets the value of the insufhepat property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInsufhepat(String value) {
        this.insufhepat = value;
    }

    /**
     * Gets the value of the etatpatho property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEtatpatho() {
        return etatpatho;
    }

    /**
     * Sets the value of the etatpatho property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEtatpatho(String value) {
        this.etatpatho = value;
    }

    /**
     * Gets the value of the etatpathoCim property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEtatpathoCim() {
        return etatpathoCim;
    }

    /**
     * Sets the value of the etatpathoCim property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEtatpathoCim(String value) {
        this.etatpathoCim = value;
    }

    /**
     * Gets the value of the hypersensibilite property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHypersensibilite() {
        return hypersensibilite;
    }

    /**
     * Sets the value of the hypersensibilite property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHypersensibilite(String value) {
        this.hypersensibilite = value;
    }

}
