package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_unite complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_unite">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="code_spe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="code_ud" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ucd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="substance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="association" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="code_up" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unite_prescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nb_up" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="xup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="code_ua" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ua" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nb_ua" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="xua" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unite_prise" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="code_ups" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nb_ups" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="xups" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dose_fractionnee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vol_contenant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unite_vol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="code_unite_vol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_unite", propOrder = {

})
public class RowGetTheUnite {

    @XmlElement(name = "code_spe", required = true, nillable = true)
    protected String codeSpe;
    @XmlElement(name = "code_ud", required = true, nillable = true)
    protected String codeUd;
    @XmlElement(required = true, nillable = true)
    protected String ucd;
    @XmlElement(required = true, nillable = true)
    protected String substance;
    @XmlElement(required = true, nillable = true)
    protected String association;
    @XmlElement(name = "code_up", required = true, nillable = true)
    protected String codeUp;
    @XmlElement(name = "unite_prescription", required = true, nillable = true)
    protected String unitePrescription;
    @XmlElement(name = "nb_up", required = true, nillable = true)
    protected String nbUp;
    @XmlElement(required = true, nillable = true)
    protected String xup;
    @XmlElement(name = "code_ua", required = true, nillable = true)
    protected String codeUa;
    @XmlElement(required = true, nillable = true)
    protected String ua;
    @XmlElement(name = "nb_ua", required = true, nillable = true)
    protected String nbUa;
    @XmlElement(required = true, nillable = true)
    protected String xua;
    @XmlElement(name = "unite_prise", required = true, nillable = true)
    protected String unitePrise;
    @XmlElement(name = "code_ups", required = true, nillable = true)
    protected String codeUps;
    @XmlElement(name = "nb_ups", required = true, nillable = true)
    protected String nbUps;
    @XmlElement(required = true, nillable = true)
    protected String xups;
    @XmlElement(name = "dose_fractionnee", required = true, nillable = true)
    protected String doseFractionnee;
    @XmlElement(name = "vol_contenant", required = true, nillable = true)
    protected String volContenant;
    @XmlElement(name = "unite_vol", required = true, nillable = true)
    protected String uniteVol;
    @XmlElement(name = "code_unite_vol", required = true, nillable = true)
    protected String codeUniteVol;

    /**
     * Gets the value of the codeSpe property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeSpe() {
        return codeSpe;
    }

    /**
     * Sets the value of the codeSpe property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeSpe(String value) {
        this.codeSpe = value;
    }

    /**
     * Gets the value of the codeUd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeUd() {
        return codeUd;
    }

    /**
     * Sets the value of the codeUd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeUd(String value) {
        this.codeUd = value;
    }

    /**
     * Gets the value of the ucd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUcd() {
        return ucd;
    }

    /**
     * Sets the value of the ucd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUcd(String value) {
        this.ucd = value;
    }

    /**
     * Gets the value of the substance property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubstance() {
        return substance;
    }

    /**
     * Sets the value of the substance property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubstance(String value) {
        this.substance = value;
    }

    /**
     * Gets the value of the association property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAssociation() {
        return association;
    }

    /**
     * Sets the value of the association property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAssociation(String value) {
        this.association = value;
    }

    /**
     * Gets the value of the codeUp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeUp() {
        return codeUp;
    }

    /**
     * Sets the value of the codeUp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeUp(String value) {
        this.codeUp = value;
    }

    /**
     * Gets the value of the unitePrescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitePrescription() {
        return unitePrescription;
    }

    /**
     * Sets the value of the unitePrescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitePrescription(String value) {
        this.unitePrescription = value;
    }

    /**
     * Gets the value of the nbUp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNbUp() {
        return nbUp;
    }

    /**
     * Sets the value of the nbUp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNbUp(String value) {
        this.nbUp = value;
    }

    /**
     * Gets the value of the xup property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getXup() {
        return xup;
    }

    /**
     * Sets the value of the xup property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setXup(String value) {
        this.xup = value;
    }

    /**
     * Gets the value of the codeUa property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeUa() {
        return codeUa;
    }

    /**
     * Sets the value of the codeUa property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeUa(String value) {
        this.codeUa = value;
    }

    /**
     * Gets the value of the ua property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUa() {
        return ua;
    }

    /**
     * Sets the value of the ua property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUa(String value) {
        this.ua = value;
    }

    /**
     * Gets the value of the nbUa property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNbUa() {
        return nbUa;
    }

    /**
     * Sets the value of the nbUa property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNbUa(String value) {
        this.nbUa = value;
    }

    /**
     * Gets the value of the xua property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getXua() {
        return xua;
    }

    /**
     * Sets the value of the xua property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setXua(String value) {
        this.xua = value;
    }

    /**
     * Gets the value of the unitePrise property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitePrise() {
        return unitePrise;
    }

    /**
     * Sets the value of the unitePrise property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitePrise(String value) {
        this.unitePrise = value;
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
     * Gets the value of the nbUps property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNbUps() {
        return nbUps;
    }

    /**
     * Sets the value of the nbUps property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNbUps(String value) {
        this.nbUps = value;
    }

    /**
     * Gets the value of the xups property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getXups() {
        return xups;
    }

    /**
     * Sets the value of the xups property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setXups(String value) {
        this.xups = value;
    }

    /**
     * Gets the value of the doseFractionnee property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDoseFractionnee() {
        return doseFractionnee;
    }

    /**
     * Sets the value of the doseFractionnee property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDoseFractionnee(String value) {
        this.doseFractionnee = value;
    }

    /**
     * Gets the value of the volContenant property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVolContenant() {
        return volContenant;
    }

    /**
     * Sets the value of the volContenant property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVolContenant(String value) {
        this.volContenant = value;
    }

    /**
     * Gets the value of the uniteVol property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUniteVol() {
        return uniteVol;
    }

    /**
     * Sets the value of the uniteVol property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUniteVol(String value) {
        this.uniteVol = value;
    }

    /**
     * Gets the value of the codeUniteVol property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeUniteVol() {
        return codeUniteVol;
    }

    /**
     * Sets the value of the codeUniteVol property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeUniteVol(String value) {
        this.codeUniteVol = value;
    }

}
