package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_conducteur complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_conducteur">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="reco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="niv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="libelle_niv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="texte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_conducteur", propOrder = {

})
public class RowGetTheConducteur {

    @XmlElement(required = true, nillable = true)
    protected String reco;
    @XmlElement(required = true, nillable = true)
    protected String niv;
    @XmlElement(name = "libelle_niv", required = true, nillable = true)
    protected String libelleNiv;
    @XmlElement(required = true, nillable = true)
    protected String ref;
    @XmlElement(required = true, nillable = true)
    protected String texte;
    @XmlElement(required = true, nillable = true)
    protected String url;

    /**
     * Gets the value of the reco property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReco() {
        return reco;
    }

    /**
     * Sets the value of the reco property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReco(String value) {
        this.reco = value;
    }

    /**
     * Gets the value of the niv property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNiv() {
        return niv;
    }

    /**
     * Sets the value of the niv property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNiv(String value) {
        this.niv = value;
    }

    /**
     * Gets the value of the libelleNiv property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibelleNiv() {
        return libelleNiv;
    }

    /**
     * Sets the value of the libelleNiv property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibelleNiv(String value) {
        this.libelleNiv = value;
    }

    /**
     * Gets the value of the ref property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRef(String value) {
        this.ref = value;
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
     * Gets the value of the url property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
