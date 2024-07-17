package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for alertes_redondance complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="alertes_redondance">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="id_type_alerte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="indiceligneprescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="idproduit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="typeproduit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="texte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_sa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="groupe" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alertes_redondance", propOrder = {

})
public class AlertesRedondance {

    @XmlElement(name = "id_type_alerte", required = true, nillable = true)
    protected String idTypeAlerte;
    @XmlElement(required = true, nillable = true)
    protected String indiceligneprescription;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer idproduit;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer typeproduit;
    @XmlElement(required = true, nillable = true)
    protected String texte;
    @XmlElement(name = "id_sa", required = true, nillable = true)
    protected String idSa;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer groupe;

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
     * Gets the value of the idSa property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdSa() {
        return idSa;
    }

    /**
     * Sets the value of the idSa property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdSa(String value) {
        this.idSa = value;
    }

    /**
     * Gets the value of the groupe property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getGroupe() {
        return groupe;
    }

    /**
     * Sets the value of the groupe property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setGroupe(Integer value) {
        this.groupe = value;
    }

}
