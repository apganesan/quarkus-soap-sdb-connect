package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_lab_txt complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_lab_txt">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="cdf_numero_pk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cdf_code_pk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cdf_nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cdf_datecr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cdf_datemj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_lab_txt", propOrder = {

})
public class RowGetTheLabTxt {

    @XmlElement(name = "cdf_numero_pk", required = true, nillable = true)
    protected String cdfNumeroPk;
    @XmlElement(name = "cdf_code_pk", required = true, nillable = true)
    protected String cdfCodePk;
    @XmlElement(name = "cdf_nom", required = true, nillable = true)
    protected String cdfNom;
    @XmlElement(name = "cdf_datecr", required = true, nillable = true)
    protected String cdfDatecr;
    @XmlElement(name = "cdf_datemj", required = true, nillable = true)
    protected String cdfDatemj;

    /**
     * Gets the value of the cdfNumeroPk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCdfNumeroPk() {
        return cdfNumeroPk;
    }

    /**
     * Sets the value of the cdfNumeroPk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCdfNumeroPk(String value) {
        this.cdfNumeroPk = value;
    }

    /**
     * Gets the value of the cdfCodePk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCdfCodePk() {
        return cdfCodePk;
    }

    /**
     * Sets the value of the cdfCodePk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCdfCodePk(String value) {
        this.cdfCodePk = value;
    }

    /**
     * Gets the value of the cdfNom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCdfNom() {
        return cdfNom;
    }

    /**
     * Sets the value of the cdfNom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCdfNom(String value) {
        this.cdfNom = value;
    }

    /**
     * Gets the value of the cdfDatecr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCdfDatecr() {
        return cdfDatecr;
    }

    /**
     * Sets the value of the cdfDatecr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCdfDatecr(String value) {
        this.cdfDatecr = value;
    }

    /**
     * Gets the value of the cdfDatemj property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCdfDatemj() {
        return cdfDatemj;
    }

    /**
     * Sets the value of the cdfDatemj property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCdfDatemj(String value) {
        this.cdfDatemj = value;
    }

}
