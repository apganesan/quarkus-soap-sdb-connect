package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for alertes_interaction complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="alertes_interaction">
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
 *         <element name="id_fic_im" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="niveau" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alertes_interaction", propOrder = {

})
public class AlertesInteraction {

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
    @XmlElement(name = "id_fic_im", required = true, type = Integer.class, nillable = true)
    protected Integer idFicIm;
    @XmlElement(required = true, nillable = true)
    protected String niveau;

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
     * Gets the value of the idFicIm property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getIdFicIm() {
        return idFicIm;
    }

    /**
     * Sets the value of the idFicIm property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setIdFicIm(Integer value) {
        this.idFicIm = value;
    }

    /**
     * Gets the value of the niveau property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNiveau() {
        return niveau;
    }

    /**
     * Sets the value of the niveau property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNiveau(String value) {
        this.niveau = value;
    }

}
