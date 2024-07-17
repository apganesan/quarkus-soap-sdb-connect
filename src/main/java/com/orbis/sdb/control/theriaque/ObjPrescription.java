package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for obj_prescription complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="obj_prescription">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="indiceligneprescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datedebut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datefin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="idprod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="typeprod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="contenance_ud" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unite_contenance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="vecteur_inj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="materiau_cont_inj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obj_prescription", propOrder = {

})
public class ObjPrescription {

    @XmlElement(required = true, nillable = true)
    protected String indiceligneprescription;
    @XmlElement(required = true, nillable = true)
    protected String datedebut;
    @XmlElement(required = true, nillable = true)
    protected String datefin;
    @XmlElement(required = true, nillable = true)
    protected String idprod;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer typeprod;
    @XmlElement(name = "contenance_ud", required = true, nillable = true)
    protected String contenanceUd;
    @XmlElement(name = "unite_contenance", required = true, nillable = true)
    protected String uniteContenance;
    @XmlElement(name = "vecteur_inj", required = true, nillable = true)
    protected String vecteurInj;
    @XmlElement(name = "materiau_cont_inj", required = true, nillable = true)
    protected String materiauContInj;

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
     * Gets the value of the datedebut property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatedebut() {
        return datedebut;
    }

    /**
     * Sets the value of the datedebut property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatedebut(String value) {
        this.datedebut = value;
    }

    /**
     * Gets the value of the datefin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatefin() {
        return datefin;
    }

    /**
     * Sets the value of the datefin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatefin(String value) {
        this.datefin = value;
    }

    /**
     * Gets the value of the idprod property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdprod() {
        return idprod;
    }

    /**
     * Sets the value of the idprod property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdprod(String value) {
        this.idprod = value;
    }

    /**
     * Gets the value of the typeprod property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTypeprod() {
        return typeprod;
    }

    /**
     * Sets the value of the typeprod property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTypeprod(Integer value) {
        this.typeprod = value;
    }

    /**
     * Gets the value of the contenanceUd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContenanceUd() {
        return contenanceUd;
    }

    /**
     * Sets the value of the contenanceUd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContenanceUd(String value) {
        this.contenanceUd = value;
    }

    /**
     * Gets the value of the uniteContenance property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUniteContenance() {
        return uniteContenance;
    }

    /**
     * Sets the value of the uniteContenance property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUniteContenance(String value) {
        this.uniteContenance = value;
    }

    /**
     * Gets the value of the vecteurInj property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVecteurInj() {
        return vecteurInj;
    }

    /**
     * Sets the value of the vecteurInj property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVecteurInj(String value) {
        this.vecteurInj = value;
    }

    /**
     * Gets the value of the materiauContInj property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMateriauContInj() {
        return materiauContInj;
    }

    /**
     * Sets the value of the materiauContInj property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMateriauContInj(String value) {
        this.materiauContInj = value;
    }

}
