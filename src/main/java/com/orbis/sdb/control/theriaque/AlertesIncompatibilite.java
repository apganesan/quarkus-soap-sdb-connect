package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for alertes_incompatibilite complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="alertes_incompatibilite">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="id_type_alerte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="indiceligneprescription_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="idproduit_1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="typeproduit_1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="indiceligneprescription_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="idproduit_2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="typeproduit_2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="texte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vecteur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="materiau" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_fic_ic" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alertes_incompatibilite", propOrder = {

})
public class AlertesIncompatibilite {

    @XmlElement(name = "id_type_alerte", required = true, nillable = true)
    protected String idTypeAlerte;
    @XmlElement(name = "indiceligneprescription_1", required = true, nillable = true)
    protected String indiceligneprescription1;
    @XmlElement(name = "idproduit_1", required = true, type = Integer.class, nillable = true)
    protected Integer idproduit1;
    @XmlElement(name = "typeproduit_1", required = true, type = Integer.class, nillable = true)
    protected Integer typeproduit1;
    @XmlElement(name = "indiceligneprescription_2", required = true, nillable = true)
    protected String indiceligneprescription2;
    @XmlElement(name = "idproduit_2", required = true, type = Integer.class, nillable = true)
    protected Integer idproduit2;
    @XmlElement(name = "typeproduit_2", required = true, type = Integer.class, nillable = true)
    protected Integer typeproduit2;
    @XmlElement(required = true, nillable = true)
    protected String texte;
    @XmlElement(required = true, nillable = true)
    protected String vecteur;
    @XmlElement(required = true, nillable = true)
    protected String materiau;
    @XmlElement(name = "id_fic_ic", required = true, type = Integer.class, nillable = true)
    protected Integer idFicIc;

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
     * Gets the value of the indiceligneprescription1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIndiceligneprescription1() {
        return indiceligneprescription1;
    }

    /**
     * Sets the value of the indiceligneprescription1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIndiceligneprescription1(String value) {
        this.indiceligneprescription1 = value;
    }

    /**
     * Gets the value of the idproduit1 property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getIdproduit1() {
        return idproduit1;
    }

    /**
     * Sets the value of the idproduit1 property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setIdproduit1(Integer value) {
        this.idproduit1 = value;
    }

    /**
     * Gets the value of the typeproduit1 property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTypeproduit1() {
        return typeproduit1;
    }

    /**
     * Sets the value of the typeproduit1 property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTypeproduit1(Integer value) {
        this.typeproduit1 = value;
    }

    /**
     * Gets the value of the indiceligneprescription2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIndiceligneprescription2() {
        return indiceligneprescription2;
    }

    /**
     * Sets the value of the indiceligneprescription2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIndiceligneprescription2(String value) {
        this.indiceligneprescription2 = value;
    }

    /**
     * Gets the value of the idproduit2 property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getIdproduit2() {
        return idproduit2;
    }

    /**
     * Sets the value of the idproduit2 property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setIdproduit2(Integer value) {
        this.idproduit2 = value;
    }

    /**
     * Gets the value of the typeproduit2 property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTypeproduit2() {
        return typeproduit2;
    }

    /**
     * Sets the value of the typeproduit2 property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTypeproduit2(Integer value) {
        this.typeproduit2 = value;
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
     * Gets the value of the vecteur property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVecteur() {
        return vecteur;
    }

    /**
     * Sets the value of the vecteur property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVecteur(String value) {
        this.vecteur = value;
    }

    /**
     * Gets the value of the materiau property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMateriau() {
        return materiau;
    }

    /**
     * Sets the value of the materiau property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMateriau(String value) {
        this.materiau = value;
    }

    /**
     * Gets the value of the idFicIc property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getIdFicIc() {
        return idFicIc;
    }

    /**
     * Sets the value of the idFicIc property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setIdFicIc(Integer value) {
        this.idFicIc = value;
    }

}
