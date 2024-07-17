package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_fiche_indication_by_code complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_fiche_indication_by_code">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="fin_code_sq_pk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fin_cdf_nain_code_fk_pk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fin_cdf_nvin_code_fk_pk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fin_texte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fin_datecr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fin_datemj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fin_cdf_t2a_code_fk_pk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_fiche_indication_by_code", propOrder = {

})
public class RowGetTheFicheIndicationByCode {

    @XmlElement(name = "fin_code_sq_pk", required = true, nillable = true)
    protected String finCodeSqPk;
    @XmlElement(name = "fin_cdf_nain_code_fk_pk", required = true, nillable = true)
    protected String finCdfNainCodeFkPk;
    @XmlElement(name = "fin_cdf_nvin_code_fk_pk", required = true, nillable = true)
    protected String finCdfNvinCodeFkPk;
    @XmlElement(name = "fin_texte", required = true, nillable = true)
    protected String finTexte;
    @XmlElement(name = "fin_datecr", required = true, nillable = true)
    protected String finDatecr;
    @XmlElement(name = "fin_datemj", required = true, nillable = true)
    protected String finDatemj;
    @XmlElement(name = "fin_cdf_t2a_code_fk_pk", required = true, nillable = true)
    protected String finCdfT2ACodeFkPk;

    /**
     * Gets the value of the finCodeSqPk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFinCodeSqPk() {
        return finCodeSqPk;
    }

    /**
     * Sets the value of the finCodeSqPk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFinCodeSqPk(String value) {
        this.finCodeSqPk = value;
    }

    /**
     * Gets the value of the finCdfNainCodeFkPk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFinCdfNainCodeFkPk() {
        return finCdfNainCodeFkPk;
    }

    /**
     * Sets the value of the finCdfNainCodeFkPk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFinCdfNainCodeFkPk(String value) {
        this.finCdfNainCodeFkPk = value;
    }

    /**
     * Gets the value of the finCdfNvinCodeFkPk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFinCdfNvinCodeFkPk() {
        return finCdfNvinCodeFkPk;
    }

    /**
     * Sets the value of the finCdfNvinCodeFkPk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFinCdfNvinCodeFkPk(String value) {
        this.finCdfNvinCodeFkPk = value;
    }

    /**
     * Gets the value of the finTexte property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFinTexte() {
        return finTexte;
    }

    /**
     * Sets the value of the finTexte property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFinTexte(String value) {
        this.finTexte = value;
    }

    /**
     * Gets the value of the finDatecr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFinDatecr() {
        return finDatecr;
    }

    /**
     * Sets the value of the finDatecr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFinDatecr(String value) {
        this.finDatecr = value;
    }

    /**
     * Gets the value of the finDatemj property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFinDatemj() {
        return finDatemj;
    }

    /**
     * Sets the value of the finDatemj property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFinDatemj(String value) {
        this.finDatemj = value;
    }

    /**
     * Gets the value of the finCdfT2ACodeFkPk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFinCdfT2ACodeFkPk() {
        return finCdfT2ACodeFkPk;
    }

    /**
     * Sets the value of the finCdfT2ACodeFkPk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFinCdfT2ACodeFkPk(String value) {
        this.finCdfT2ACodeFkPk = value;
    }

}
