package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_vir_id complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_vir_id">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="id13" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id7" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pres_dc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="libelle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="texte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="date_crea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="date_modif" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="mono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_vir_id", propOrder = {

})
public class RowGetTheVirId {

    @XmlElement(required = true, nillable = true)
    protected String id13;
    @XmlElement(required = true, nillable = true)
    protected String id7;
    @XmlElement(name = "pres_dc", required = true, nillable = true)
    protected String presDc;
    @XmlElement(required = true, nillable = true)
    protected String libelle;
    @XmlElement(required = true, nillable = true)
    protected String texte;
    @XmlElement(name = "date_crea", required = true, nillable = true)
    protected String dateCrea;
    @XmlElement(name = "date_modif", required = true, nillable = true)
    protected String dateModif;
    @XmlElement(required = true, nillable = true)
    protected String mono;

    /**
     * Gets the value of the id13 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId13() {
        return id13;
    }

    /**
     * Sets the value of the id13 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId13(String value) {
        this.id13 = value;
    }

    /**
     * Gets the value of the id7 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId7() {
        return id7;
    }

    /**
     * Sets the value of the id7 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId7(String value) {
        this.id7 = value;
    }

    /**
     * Gets the value of the presDc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPresDc() {
        return presDc;
    }

    /**
     * Sets the value of the presDc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPresDc(String value) {
        this.presDc = value;
    }

    /**
     * Gets the value of the libelle property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Sets the value of the libelle property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibelle(String value) {
        this.libelle = value;
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
     * Gets the value of the dateCrea property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDateCrea() {
        return dateCrea;
    }

    /**
     * Sets the value of the dateCrea property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDateCrea(String value) {
        this.dateCrea = value;
    }

    /**
     * Gets the value of the dateModif property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDateModif() {
        return dateModif;
    }

    /**
     * Sets the value of the dateModif property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDateModif(String value) {
        this.dateModif = value;
    }

    /**
     * Gets the value of the mono property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMono() {
        return mono;
    }

    /**
     * Sets the value of the mono property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMono(String value) {
        this.mono = value;
    }

}
