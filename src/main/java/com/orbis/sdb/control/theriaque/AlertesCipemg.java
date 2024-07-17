package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for alertes_cipemg complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="alertes_cipemg">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="id_type_alerte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="indiceligneprescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="idproduit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="typeproduit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="id_ter_per" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="lib_ter_per" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_ter_com" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_typ_ter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="lib_ter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_cim" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_nature_ci" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_ter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_sequence_ter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_fic_ci" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "alertes_cipemg", propOrder = {

})
public class AlertesCipemg {

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
    @XmlElement(name = "id_ter_com", required = true, nillable = true)
    protected String idTerCom;
    @XmlElement(name = "id_typ_ter", required = true, type = Integer.class, nillable = true)
    protected Integer idTypTer;
    @XmlElement(name = "lib_ter", required = true, nillable = true)
    protected String libTer;
    @XmlElement(name = "id_cim", required = true, nillable = true)
    protected String idCim;
    @XmlElement(name = "id_nature_ci", required = true, nillable = true)
    protected String idNatureCi;
    @XmlElement(name = "id_ter", required = true, nillable = true)
    protected String idTer;
    @XmlElement(name = "id_sequence_ter", required = true, nillable = true)
    protected String idSequenceTer;
    @XmlElement(name = "id_fic_ci", required = true, type = Integer.class, nillable = true)
    protected Integer idFicCi;
    @XmlElement(required = true, nillable = true)
    protected String texte;
    @XmlElement(name = "url_mono", required = true, nillable = true)
    protected String urlMono;

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
     * Gets the value of the idTerCom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdTerCom() {
        return idTerCom;
    }

    /**
     * Sets the value of the idTerCom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdTerCom(String value) {
        this.idTerCom = value;
    }

    /**
     * Gets the value of the idTypTer property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getIdTypTer() {
        return idTypTer;
    }

    /**
     * Sets the value of the idTypTer property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setIdTypTer(Integer value) {
        this.idTypTer = value;
    }

    /**
     * Gets the value of the libTer property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibTer() {
        return libTer;
    }

    /**
     * Sets the value of the libTer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibTer(String value) {
        this.libTer = value;
    }

    /**
     * Gets the value of the idCim property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdCim() {
        return idCim;
    }

    /**
     * Sets the value of the idCim property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdCim(String value) {
        this.idCim = value;
    }

    /**
     * Gets the value of the idNatureCi property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdNatureCi() {
        return idNatureCi;
    }

    /**
     * Sets the value of the idNatureCi property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdNatureCi(String value) {
        this.idNatureCi = value;
    }

    /**
     * Gets the value of the idTer property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdTer() {
        return idTer;
    }

    /**
     * Sets the value of the idTer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdTer(String value) {
        this.idTer = value;
    }

    /**
     * Gets the value of the idSequenceTer property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdSequenceTer() {
        return idSequenceTer;
    }

    /**
     * Sets the value of the idSequenceTer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdSequenceTer(String value) {
        this.idSequenceTer = value;
    }

    /**
     * Gets the value of the idFicCi property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getIdFicCi() {
        return idFicCi;
    }

    /**
     * Sets the value of the idFicCi property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setIdFicCi(Integer value) {
        this.idFicCi = value;
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
