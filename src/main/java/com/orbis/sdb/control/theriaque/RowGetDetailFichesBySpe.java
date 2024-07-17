package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_detail_fiches_by_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_detail_fiches_by_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="code_fiche" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nature_ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="niveau_ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="typ_ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="texte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_detail_fiches_by_spe", propOrder = {

})
public class RowGetDetailFichesBySpe {

    @XmlElement(name = "code_fiche", required = true, nillable = true)
    protected String codeFiche;
    @XmlElement(name = "nature_ind", required = true, nillable = true)
    protected String natureInd;
    @XmlElement(name = "niveau_ind", required = true, nillable = true)
    protected String niveauInd;
    @XmlElement(name = "typ_ind", required = true, nillable = true)
    protected String typInd;
    @XmlElement(required = true, nillable = true)
    protected String texte;

    /**
     * Gets the value of the codeFiche property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeFiche() {
        return codeFiche;
    }

    /**
     * Sets the value of the codeFiche property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeFiche(String value) {
        this.codeFiche = value;
    }

    /**
     * Gets the value of the natureInd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNatureInd() {
        return natureInd;
    }

    /**
     * Sets the value of the natureInd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNatureInd(String value) {
        this.natureInd = value;
    }

    /**
     * Gets the value of the niveauInd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNiveauInd() {
        return niveauInd;
    }

    /**
     * Sets the value of the niveauInd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNiveauInd(String value) {
        this.niveauInd = value;
    }

    /**
     * Gets the value of the typInd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTypInd() {
        return typInd;
    }

    /**
     * Sets the value of the typInd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTypInd(String value) {
        this.typInd = value;
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

}
