package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_doc_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_doc_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="titre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="texte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="no_ord" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="precision" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "row_get_the_doc_spe", propOrder = {

})
public class RowGetTheDocSpe {

    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(required = true, nillable = true)
    protected String titre;
    @XmlElement(required = true, nillable = true)
    protected String texte;
    @XmlElement(name = "no_ord", required = true, nillable = true)
    protected String noOrd;
    @XmlElement(required = true, nillable = true)
    protected String precision;
    @XmlElement(name = "date_texte", required = true, nillable = true)
    protected String dateTexte;

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setType(String value) {
        this.type = value;
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
     * Gets the value of the noOrd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoOrd() {
        return noOrd;
    }

    /**
     * Sets the value of the noOrd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoOrd(String value) {
        this.noOrd = value;
    }

    /**
     * Gets the value of the precision property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrecision(String value) {
        this.precision = value;
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
