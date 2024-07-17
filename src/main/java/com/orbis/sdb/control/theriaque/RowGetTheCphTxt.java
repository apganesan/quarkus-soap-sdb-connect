package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_cph_txt complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_cph_txt">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="cph_code_pk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cph_cph_code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cph_nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cph_datecr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cph_datemj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_cph_txt", propOrder = {

})
public class RowGetTheCphTxt {

    @XmlElement(name = "cph_code_pk", required = true, nillable = true)
    protected String cphCodePk;
    @XmlElement(name = "cph_cph_code_fk", required = true, nillable = true)
    protected String cphCphCodeFk;
    @XmlElement(name = "cph_nom", required = true, nillable = true)
    protected String cphNom;
    @XmlElement(name = "cph_datecr", required = true, nillable = true)
    protected String cphDatecr;
    @XmlElement(name = "cph_datemj", required = true, nillable = true)
    protected String cphDatemj;

    /**
     * Gets the value of the cphCodePk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCphCodePk() {
        return cphCodePk;
    }

    /**
     * Sets the value of the cphCodePk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCphCodePk(String value) {
        this.cphCodePk = value;
    }

    /**
     * Gets the value of the cphCphCodeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCphCphCodeFk() {
        return cphCphCodeFk;
    }

    /**
     * Sets the value of the cphCphCodeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCphCphCodeFk(String value) {
        this.cphCphCodeFk = value;
    }

    /**
     * Gets the value of the cphNom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCphNom() {
        return cphNom;
    }

    /**
     * Sets the value of the cphNom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCphNom(String value) {
        this.cphNom = value;
    }

    /**
     * Gets the value of the cphDatecr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCphDatecr() {
        return cphDatecr;
    }

    /**
     * Sets the value of the cphDatecr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCphDatecr(String value) {
        this.cphDatecr = value;
    }

    /**
     * Gets the value of the cphDatemj property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCphDatemj() {
        return cphDatemj;
    }

    /**
     * Sets the value of the cphDatemj property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCphDatemj(String value) {
        this.cphDatemj = value;
    }

}
