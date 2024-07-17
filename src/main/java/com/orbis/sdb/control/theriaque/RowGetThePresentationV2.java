package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_presentation_v2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_presentation_v2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="pre_code_pk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_sp_code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_nbunite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unit_prise" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_adm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="reservhop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="liste" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_etat_commer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_datecommer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_datesup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="presunit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_ceph_code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_catc_code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_datejocip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_agrcoll" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_datejocoll" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_datefincoll" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_date_applifincoll" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_partstatut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_tss_texte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_consapouv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_datecr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_datemj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_cacdt_texte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_ceps" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_nat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pre_ean_ref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="code_ups" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="multidose" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unidose" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_presentation_v2", propOrder = {

})
public class RowGetThePresentationV2 {

    @XmlElement(name = "pre_code_pk", required = true, nillable = true)
    protected String preCodePk;
    @XmlElement(name = "pre_sp_code_fk", required = true, nillable = true)
    protected String preSpCodeFk;
    @XmlElement(name = "pre_nbunite", required = true, nillable = true)
    protected String preNbunite;
    @XmlElement(name = "unit_prise", required = true, nillable = true)
    protected String unitPrise;
    @XmlElement(name = "pre_adm", required = true, nillable = true)
    protected String preAdm;
    @XmlElement(required = true, nillable = true)
    protected String reservhop;
    @XmlElement(required = true, nillable = true)
    protected String liste;
    @XmlElement(name = "pre_etat_commer", required = true, nillable = true)
    protected String preEtatCommer;
    @XmlElement(name = "pre_datecommer", required = true, nillable = true)
    protected String preDatecommer;
    @XmlElement(name = "pre_datesup", required = true, nillable = true)
    protected String preDatesup;
    @XmlElement(required = true, nillable = true)
    protected String presunit;
    @XmlElement(name = "pre_ceph_code_fk", required = true, nillable = true)
    protected String preCephCodeFk;
    @XmlElement(name = "pre_catc_code_fk", required = true, nillable = true)
    protected String preCatcCodeFk;
    @XmlElement(name = "pre_datejocip", required = true, nillable = true)
    protected String preDatejocip;
    @XmlElement(name = "pre_agrcoll", required = true, nillable = true)
    protected String preAgrcoll;
    @XmlElement(name = "pre_datejocoll", required = true, nillable = true)
    protected String preDatejocoll;
    @XmlElement(name = "pre_datefincoll", required = true, nillable = true)
    protected String preDatefincoll;
    @XmlElement(name = "pre_date_applifincoll", required = true, nillable = true)
    protected String preDateApplifincoll;
    @XmlElement(name = "pre_partstatut", required = true, nillable = true)
    protected String prePartstatut;
    @XmlElement(name = "pre_tss_texte", required = true, nillable = true)
    protected String preTssTexte;
    @XmlElement(name = "pre_consapouv", required = true, nillable = true)
    protected String preConsapouv;
    @XmlElement(name = "pre_datecr", required = true, nillable = true)
    protected String preDatecr;
    @XmlElement(name = "pre_datemj", required = true, nillable = true)
    protected String preDatemj;
    @XmlElement(name = "pre_cacdt_texte", required = true, nillable = true)
    protected String preCacdtTexte;
    @XmlElement(name = "pre_ceps", required = true, nillable = true)
    protected String preCeps;
    @XmlElement(name = "pre_nat", required = true, nillable = true)
    protected String preNat;
    @XmlElement(name = "pre_ean_ref", required = true, nillable = true)
    protected String preEanRef;
    @XmlElement(name = "code_ups", required = true, nillable = true)
    protected String codeUps;
    @XmlElement(required = true, nillable = true)
    protected String multidose;
    @XmlElement(required = true, nillable = true)
    protected String unidose;

    /**
     * Gets the value of the preCodePk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreCodePk() {
        return preCodePk;
    }

    /**
     * Sets the value of the preCodePk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreCodePk(String value) {
        this.preCodePk = value;
    }

    /**
     * Gets the value of the preSpCodeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreSpCodeFk() {
        return preSpCodeFk;
    }

    /**
     * Sets the value of the preSpCodeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreSpCodeFk(String value) {
        this.preSpCodeFk = value;
    }

    /**
     * Gets the value of the preNbunite property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreNbunite() {
        return preNbunite;
    }

    /**
     * Sets the value of the preNbunite property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreNbunite(String value) {
        this.preNbunite = value;
    }

    /**
     * Gets the value of the unitPrise property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitPrise() {
        return unitPrise;
    }

    /**
     * Sets the value of the unitPrise property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitPrise(String value) {
        this.unitPrise = value;
    }

    /**
     * Gets the value of the preAdm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreAdm() {
        return preAdm;
    }

    /**
     * Sets the value of the preAdm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreAdm(String value) {
        this.preAdm = value;
    }

    /**
     * Gets the value of the reservhop property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReservhop() {
        return reservhop;
    }

    /**
     * Sets the value of the reservhop property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReservhop(String value) {
        this.reservhop = value;
    }

    /**
     * Gets the value of the liste property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getListe() {
        return liste;
    }

    /**
     * Sets the value of the liste property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setListe(String value) {
        this.liste = value;
    }

    /**
     * Gets the value of the preEtatCommer property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreEtatCommer() {
        return preEtatCommer;
    }

    /**
     * Sets the value of the preEtatCommer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreEtatCommer(String value) {
        this.preEtatCommer = value;
    }

    /**
     * Gets the value of the preDatecommer property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreDatecommer() {
        return preDatecommer;
    }

    /**
     * Sets the value of the preDatecommer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreDatecommer(String value) {
        this.preDatecommer = value;
    }

    /**
     * Gets the value of the preDatesup property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreDatesup() {
        return preDatesup;
    }

    /**
     * Sets the value of the preDatesup property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreDatesup(String value) {
        this.preDatesup = value;
    }

    /**
     * Gets the value of the presunit property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPresunit() {
        return presunit;
    }

    /**
     * Sets the value of the presunit property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPresunit(String value) {
        this.presunit = value;
    }

    /**
     * Gets the value of the preCephCodeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreCephCodeFk() {
        return preCephCodeFk;
    }

    /**
     * Sets the value of the preCephCodeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreCephCodeFk(String value) {
        this.preCephCodeFk = value;
    }

    /**
     * Gets the value of the preCatcCodeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreCatcCodeFk() {
        return preCatcCodeFk;
    }

    /**
     * Sets the value of the preCatcCodeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreCatcCodeFk(String value) {
        this.preCatcCodeFk = value;
    }

    /**
     * Gets the value of the preDatejocip property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreDatejocip() {
        return preDatejocip;
    }

    /**
     * Sets the value of the preDatejocip property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreDatejocip(String value) {
        this.preDatejocip = value;
    }

    /**
     * Gets the value of the preAgrcoll property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreAgrcoll() {
        return preAgrcoll;
    }

    /**
     * Sets the value of the preAgrcoll property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreAgrcoll(String value) {
        this.preAgrcoll = value;
    }

    /**
     * Gets the value of the preDatejocoll property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreDatejocoll() {
        return preDatejocoll;
    }

    /**
     * Sets the value of the preDatejocoll property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreDatejocoll(String value) {
        this.preDatejocoll = value;
    }

    /**
     * Gets the value of the preDatefincoll property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreDatefincoll() {
        return preDatefincoll;
    }

    /**
     * Sets the value of the preDatefincoll property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreDatefincoll(String value) {
        this.preDatefincoll = value;
    }

    /**
     * Gets the value of the preDateApplifincoll property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreDateApplifincoll() {
        return preDateApplifincoll;
    }

    /**
     * Sets the value of the preDateApplifincoll property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreDateApplifincoll(String value) {
        this.preDateApplifincoll = value;
    }

    /**
     * Gets the value of the prePartstatut property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrePartstatut() {
        return prePartstatut;
    }

    /**
     * Sets the value of the prePartstatut property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrePartstatut(String value) {
        this.prePartstatut = value;
    }

    /**
     * Gets the value of the preTssTexte property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreTssTexte() {
        return preTssTexte;
    }

    /**
     * Sets the value of the preTssTexte property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreTssTexte(String value) {
        this.preTssTexte = value;
    }

    /**
     * Gets the value of the preConsapouv property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreConsapouv() {
        return preConsapouv;
    }

    /**
     * Sets the value of the preConsapouv property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreConsapouv(String value) {
        this.preConsapouv = value;
    }

    /**
     * Gets the value of the preDatecr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreDatecr() {
        return preDatecr;
    }

    /**
     * Sets the value of the preDatecr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreDatecr(String value) {
        this.preDatecr = value;
    }

    /**
     * Gets the value of the preDatemj property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreDatemj() {
        return preDatemj;
    }

    /**
     * Sets the value of the preDatemj property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreDatemj(String value) {
        this.preDatemj = value;
    }

    /**
     * Gets the value of the preCacdtTexte property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreCacdtTexte() {
        return preCacdtTexte;
    }

    /**
     * Sets the value of the preCacdtTexte property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreCacdtTexte(String value) {
        this.preCacdtTexte = value;
    }

    /**
     * Gets the value of the preCeps property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreCeps() {
        return preCeps;
    }

    /**
     * Sets the value of the preCeps property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreCeps(String value) {
        this.preCeps = value;
    }

    /**
     * Gets the value of the preNat property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreNat() {
        return preNat;
    }

    /**
     * Sets the value of the preNat property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreNat(String value) {
        this.preNat = value;
    }

    /**
     * Gets the value of the preEanRef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreEanRef() {
        return preEanRef;
    }

    /**
     * Sets the value of the preEanRef property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreEanRef(String value) {
        this.preEanRef = value;
    }

    /**
     * Gets the value of the codeUps property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeUps() {
        return codeUps;
    }

    /**
     * Sets the value of the codeUps property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeUps(String value) {
        this.codeUps = value;
    }

    /**
     * Gets the value of the multidose property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMultidose() {
        return multidose;
    }

    /**
     * Sets the value of the multidose property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMultidose(String value) {
        this.multidose = value;
    }

    /**
     * Gets the value of the unidose property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnidose() {
        return unidose;
    }

    /**
     * Sets the value of the unidose property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnidose(String value) {
        this.unidose = value;
    }

}
