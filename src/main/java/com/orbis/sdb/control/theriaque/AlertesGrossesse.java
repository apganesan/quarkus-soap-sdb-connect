package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for alertes_grossesse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="alertes_grossesse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="id_fic_gral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_type_alerte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="indiceligneprescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="idproduit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="typeproduit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="id_ter_per" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="lib_ter_per" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="niv_reco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="lib_reco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="lib_periode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="texte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="url_mono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alertes_grossesse", propOrder = {

})
public class AlertesGrossesse {

    @XmlElement(name = "id_fic_gral", required = true, nillable = true)
    protected String idFicGral;
    @XmlElement(name = "id_type_alerte", required = true, nillable = true)
    protected String idTypeAlerte;
    @XmlElement(required = true, nillable = true)
    protected String indiceligneprescription;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer idproduit;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer typeproduit;
    @XmlElement(name = "id_ter_per", required = true, nillable = true)
    protected String idTerPer;
    @XmlElement(name = "lib_ter_per", required = true, nillable = true)
    protected String libTerPer;
    @XmlElement(name = "niv_reco", required = true, nillable = true)
    protected String nivReco;
    @XmlElement(name = "lib_reco", required = true, nillable = true)
    protected String libReco;
    @XmlElement(name = "lib_periode", required = true, nillable = true)
    protected String libPeriode;
    @XmlElement(required = true, nillable = true)
    protected String texte;
    @XmlElement(name = "url_mono", required = true, nillable = true)
    protected String urlMono;

    /**
     * Gets the value of the idFicGral property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdFicGral() {
        return idFicGral;
    }

    /**
     * Sets the value of the idFicGral property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdFicGral(String value) {
        this.idFicGral = value;
    }

    /**
     * Gets the value of the idTypeAlerte property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdTypeAlerte() {
        return idTypeAlerte;
    }

    /**
     * Sets the value of the idTypeAlerte property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdTypeAlerte(String value) {
        this.idTypeAlerte = value;
    }

    /**
     * Gets the value of the indiceligneprescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIndiceligneprescription() {
        return indiceligneprescription;
    }

    /**
     * Sets the value of the indiceligneprescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIndiceligneprescription(String value) {
        this.indiceligneprescription = value;
    }

    /**
     * Gets the value of the idproduit property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getIdproduit() {
        return idproduit;
    }

    /**
     * Sets the value of the idproduit property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setIdproduit(Integer value) {
        this.idproduit = value;
    }

    /**
     * Gets the value of the typeproduit property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTypeproduit() {
        return typeproduit;
    }

    /**
     * Sets the value of the typeproduit property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTypeproduit(Integer value) {
        this.typeproduit = value;
    }

    /**
     * Gets the value of the idTerPer property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdTerPer() {
        return idTerPer;
    }

    /**
     * Sets the value of the idTerPer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdTerPer(String value) {
        this.idTerPer = value;
    }

    /**
     * Gets the value of the libTerPer property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibTerPer() {
        return libTerPer;
    }

    /**
     * Sets the value of the libTerPer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibTerPer(String value) {
        this.libTerPer = value;
    }

    /**
     * Gets the value of the nivReco property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNivReco() {
        return nivReco;
    }

    /**
     * Sets the value of the nivReco property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNivReco(String value) {
        this.nivReco = value;
    }

    /**
     * Gets the value of the libReco property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibReco() {
        return libReco;
    }

    /**
     * Sets the value of the libReco property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibReco(String value) {
        this.libReco = value;
    }

    /**
     * Gets the value of the libPeriode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibPeriode() {
        return libPeriode;
    }

    /**
     * Sets the value of the libPeriode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibPeriode(String value) {
        this.libPeriode = value;
    }

    /**
     * Gets the value of the texte property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Sets the value of the texte property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTexte(String value) {
        this.texte = value;
    }

    /**
     * Gets the value of the urlMono property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUrlMono() {
        return urlMono;
    }

    /**
     * Sets the value of the urlMono property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUrlMono(String value) {
        this.urlMono = value;
    }

}
