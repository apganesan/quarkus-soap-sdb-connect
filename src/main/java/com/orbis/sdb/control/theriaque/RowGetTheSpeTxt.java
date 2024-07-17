package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_spe_txt complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_spe_txt">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="sp_code_sq_pk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_gsp_code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="statut_lab" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_liste" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_catc_code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_ceph_code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_cge_code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_pr_code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_type_spe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_gref_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_gref_datecr_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_nomcomp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_ph" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_cipucd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_datecr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_datemj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_nl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_aphp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_datejogene" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_origine_gene" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_nomlong" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_cdt_prescr_texte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_atc_ddd_texte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_cipucd13" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="mono_vir" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_spe_txt", propOrder = {

})
public class RowGetTheSpeTxt {

    @XmlElement(name = "sp_code_sq_pk", required = true, nillable = true)
    protected String spCodeSqPk;
    @XmlElement(name = "sp_gsp_code_fk", required = true, nillable = true)
    protected String spGspCodeFk;
    @XmlElement(name = "statut_lab", required = true, nillable = true)
    protected String statutLab;
    @XmlElement(name = "sp_liste", required = true, nillable = true)
    protected String spListe;
    @XmlElement(name = "sp_catc_code_fk", required = true, nillable = true)
    protected String spCatcCodeFk;
    @XmlElement(name = "sp_ceph_code_fk", required = true, nillable = true)
    protected String spCephCodeFk;
    @XmlElement(name = "sp_cge_code_fk", required = true, nillable = true)
    protected String spCgeCodeFk;
    @XmlElement(name = "sp_pr_code_fk", required = true, nillable = true)
    protected String spPrCodeFk;
    @XmlElement(name = "sp_type_spe", required = true, nillable = true)
    protected String spTypeSpe;
    @XmlElement(name = "sp_gref_fk", required = true, nillable = true)
    protected String spGrefFk;
    @XmlElement(name = "sp_gref_datecr_fk", required = true, nillable = true)
    protected String spGrefDatecrFk;
    @XmlElement(name = "sp_nom", required = true, nillable = true)
    protected String spNom;
    @XmlElement(name = "sp_nomcomp", required = true, nillable = true)
    protected String spNomcomp;
    @XmlElement(name = "sp_ph", required = true, nillable = true)
    protected String spPh;
    @XmlElement(name = "sp_cipucd", required = true, nillable = true)
    protected String spCipucd;
    @XmlElement(name = "sp_datecr", required = true, nillable = true)
    protected String spDatecr;
    @XmlElement(name = "sp_datemj", required = true, nillable = true)
    protected String spDatemj;
    @XmlElement(name = "sp_nl", required = true, nillable = true)
    protected String spNl;
    @XmlElement(name = "sp_aphp", required = true, nillable = true)
    protected String spAphp;
    @XmlElement(name = "sp_datejogene", required = true, nillable = true)
    protected String spDatejogene;
    @XmlElement(name = "sp_origine_gene", required = true, nillable = true)
    protected String spOrigineGene;
    @XmlElement(name = "sp_nomlong", required = true, nillable = true)
    protected String spNomlong;
    @XmlElement(name = "sp_cdt_prescr_texte", required = true, nillable = true)
    protected String spCdtPrescrTexte;
    @XmlElement(name = "sp_atc_ddd_texte", required = true, nillable = true)
    protected String spAtcDddTexte;
    @XmlElement(name = "sp_cipucd13", required = true, nillable = true)
    protected String spCipucd13;
    @XmlElement(name = "mono_vir", required = true, nillable = true)
    protected String monoVir;

    /**
     * Gets the value of the spCodeSqPk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpCodeSqPk() {
        return spCodeSqPk;
    }

    /**
     * Sets the value of the spCodeSqPk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpCodeSqPk(String value) {
        this.spCodeSqPk = value;
    }

    /**
     * Gets the value of the spGspCodeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpGspCodeFk() {
        return spGspCodeFk;
    }

    /**
     * Sets the value of the spGspCodeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpGspCodeFk(String value) {
        this.spGspCodeFk = value;
    }

    /**
     * Gets the value of the statutLab property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatutLab() {
        return statutLab;
    }

    /**
     * Sets the value of the statutLab property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatutLab(String value) {
        this.statutLab = value;
    }

    /**
     * Gets the value of the spListe property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpListe() {
        return spListe;
    }

    /**
     * Sets the value of the spListe property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpListe(String value) {
        this.spListe = value;
    }

    /**
     * Gets the value of the spCatcCodeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpCatcCodeFk() {
        return spCatcCodeFk;
    }

    /**
     * Sets the value of the spCatcCodeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpCatcCodeFk(String value) {
        this.spCatcCodeFk = value;
    }

    /**
     * Gets the value of the spCephCodeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpCephCodeFk() {
        return spCephCodeFk;
    }

    /**
     * Sets the value of the spCephCodeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpCephCodeFk(String value) {
        this.spCephCodeFk = value;
    }

    /**
     * Gets the value of the spCgeCodeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpCgeCodeFk() {
        return spCgeCodeFk;
    }

    /**
     * Sets the value of the spCgeCodeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpCgeCodeFk(String value) {
        this.spCgeCodeFk = value;
    }

    /**
     * Gets the value of the spPrCodeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpPrCodeFk() {
        return spPrCodeFk;
    }

    /**
     * Sets the value of the spPrCodeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpPrCodeFk(String value) {
        this.spPrCodeFk = value;
    }

    /**
     * Gets the value of the spTypeSpe property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpTypeSpe() {
        return spTypeSpe;
    }

    /**
     * Sets the value of the spTypeSpe property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpTypeSpe(String value) {
        this.spTypeSpe = value;
    }

    /**
     * Gets the value of the spGrefFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpGrefFk() {
        return spGrefFk;
    }

    /**
     * Sets the value of the spGrefFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpGrefFk(String value) {
        this.spGrefFk = value;
    }

    /**
     * Gets the value of the spGrefDatecrFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpGrefDatecrFk() {
        return spGrefDatecrFk;
    }

    /**
     * Sets the value of the spGrefDatecrFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpGrefDatecrFk(String value) {
        this.spGrefDatecrFk = value;
    }

    /**
     * Gets the value of the spNom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpNom() {
        return spNom;
    }

    /**
     * Sets the value of the spNom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpNom(String value) {
        this.spNom = value;
    }

    /**
     * Gets the value of the spNomcomp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpNomcomp() {
        return spNomcomp;
    }

    /**
     * Sets the value of the spNomcomp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpNomcomp(String value) {
        this.spNomcomp = value;
    }

    /**
     * Gets the value of the spPh property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpPh() {
        return spPh;
    }

    /**
     * Sets the value of the spPh property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpPh(String value) {
        this.spPh = value;
    }

    /**
     * Gets the value of the spCipucd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpCipucd() {
        return spCipucd;
    }

    /**
     * Sets the value of the spCipucd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpCipucd(String value) {
        this.spCipucd = value;
    }

    /**
     * Gets the value of the spDatecr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpDatecr() {
        return spDatecr;
    }

    /**
     * Sets the value of the spDatecr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpDatecr(String value) {
        this.spDatecr = value;
    }

    /**
     * Gets the value of the spDatemj property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpDatemj() {
        return spDatemj;
    }

    /**
     * Sets the value of the spDatemj property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpDatemj(String value) {
        this.spDatemj = value;
    }

    /**
     * Gets the value of the spNl property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpNl() {
        return spNl;
    }

    /**
     * Sets the value of the spNl property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpNl(String value) {
        this.spNl = value;
    }

    /**
     * Gets the value of the spAphp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpAphp() {
        return spAphp;
    }

    /**
     * Sets the value of the spAphp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpAphp(String value) {
        this.spAphp = value;
    }

    /**
     * Gets the value of the spDatejogene property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpDatejogene() {
        return spDatejogene;
    }

    /**
     * Sets the value of the spDatejogene property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpDatejogene(String value) {
        this.spDatejogene = value;
    }

    /**
     * Gets the value of the spOrigineGene property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpOrigineGene() {
        return spOrigineGene;
    }

    /**
     * Sets the value of the spOrigineGene property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpOrigineGene(String value) {
        this.spOrigineGene = value;
    }

    /**
     * Gets the value of the spNomlong property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpNomlong() {
        return spNomlong;
    }

    /**
     * Sets the value of the spNomlong property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpNomlong(String value) {
        this.spNomlong = value;
    }

    /**
     * Gets the value of the spCdtPrescrTexte property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpCdtPrescrTexte() {
        return spCdtPrescrTexte;
    }

    /**
     * Sets the value of the spCdtPrescrTexte property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpCdtPrescrTexte(String value) {
        this.spCdtPrescrTexte = value;
    }

    /**
     * Gets the value of the spAtcDddTexte property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpAtcDddTexte() {
        return spAtcDddTexte;
    }

    /**
     * Sets the value of the spAtcDddTexte property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpAtcDddTexte(String value) {
        this.spAtcDddTexte = value;
    }

    /**
     * Gets the value of the spCipucd13 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpCipucd13() {
        return spCipucd13;
    }

    /**
     * Sets the value of the spCipucd13 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpCipucd13(String value) {
        this.spCipucd13 = value;
    }

    /**
     * Gets the value of the monoVir property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMonoVir() {
        return monoVir;
    }

    /**
     * Sets the value of the monoVir property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMonoVir(String value) {
        this.monoVir = value;
    }

}
