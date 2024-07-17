package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_sub_txt complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_sub_txt">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="code_sq_pk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cdf_orn_code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="gsa_code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="noma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datecr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datemj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="code_ref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nom_ref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_sub_txt", propOrder = {

})
public class RowGetTheSubTxt {

    @XmlElement(name = "code_sq_pk", required = true, nillable = true)
    protected String codeSqPk;
    @XmlElement(name = "cdf_orn_code_fk", required = true, nillable = true)
    protected String cdfOrnCodeFk;
    @XmlElement(name = "code_fk", required = true, nillable = true)
    protected String codeFk;
    @XmlElement(name = "gsa_code_fk", required = true, nillable = true)
    protected String gsaCodeFk;
    @XmlElement(required = true, nillable = true)
    protected String nom;
    @XmlElement(required = true, nillable = true)
    protected String noma;
    @XmlElement(required = true, nillable = true)
    protected String datecr;
    @XmlElement(required = true, nillable = true)
    protected String datemj;
    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(name = "code_ref", required = true, nillable = true)
    protected String codeRef;
    @XmlElement(name = "nom_ref", required = true, nillable = true)
    protected String nomRef;

    /**
     * Gets the value of the codeSqPk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeSqPk() {
        return codeSqPk;
    }

    /**
     * Sets the value of the codeSqPk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeSqPk(String value) {
        this.codeSqPk = value;
    }

    /**
     * Gets the value of the cdfOrnCodeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCdfOrnCodeFk() {
        return cdfOrnCodeFk;
    }

    /**
     * Sets the value of the cdfOrnCodeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCdfOrnCodeFk(String value) {
        this.cdfOrnCodeFk = value;
    }

    /**
     * Gets the value of the codeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeFk() {
        return codeFk;
    }

    /**
     * Sets the value of the codeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeFk(String value) {
        this.codeFk = value;
    }

    /**
     * Gets the value of the gsaCodeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGsaCodeFk() {
        return gsaCodeFk;
    }

    /**
     * Sets the value of the gsaCodeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGsaCodeFk(String value) {
        this.gsaCodeFk = value;
    }

    /**
     * Gets the value of the nom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the value of the nom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Gets the value of the noma property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoma() {
        return noma;
    }

    /**
     * Sets the value of the noma property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoma(String value) {
        this.noma = value;
    }

    /**
     * Gets the value of the datecr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatecr() {
        return datecr;
    }

    /**
     * Sets the value of the datecr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatecr(String value) {
        this.datecr = value;
    }

    /**
     * Gets the value of the datemj property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatemj() {
        return datemj;
    }

    /**
     * Sets the value of the datemj property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatemj(String value) {
        this.datemj = value;
    }

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
     * Gets the value of the codeRef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeRef() {
        return codeRef;
    }

    /**
     * Sets the value of the codeRef property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeRef(String value) {
        this.codeRef = value;
    }

    /**
     * Gets the value of the nomRef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNomRef() {
        return nomRef;
    }

    /**
     * Sets the value of the nomRef property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNomRef(String value) {
        this.nomRef = value;
    }

}
