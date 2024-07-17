package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_gen_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_gen_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="gsp_nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_gref_datecr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_datejogene" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="gen_ref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_gen_spe", propOrder = {

})
public class RowGetTheGenSpe {

    @XmlElement(name = "gsp_nom", required = true, nillable = true)
    protected String gspNom;
    @XmlElement(name = "sp_code", required = true, nillable = true)
    protected String spCode;
    @XmlElement(name = "sp_gref_datecr", required = true, nillable = true)
    protected String spGrefDatecr;
    @XmlElement(name = "sp_datejogene", required = true, nillable = true)
    protected String spDatejogene;
    @XmlElement(name = "gen_ref", required = true, nillable = true)
    protected String genRef;

    /**
     * Gets the value of the gspNom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGspNom() {
        return gspNom;
    }

    /**
     * Sets the value of the gspNom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGspNom(String value) {
        this.gspNom = value;
    }

    /**
     * Gets the value of the spCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpCode() {
        return spCode;
    }

    /**
     * Sets the value of the spCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpCode(String value) {
        this.spCode = value;
    }

    /**
     * Gets the value of the spGrefDatecr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpGrefDatecr() {
        return spGrefDatecr;
    }

    /**
     * Sets the value of the spGrefDatecr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpGrefDatecr(String value) {
        this.spGrefDatecr = value;
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
     * Gets the value of the genRef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGenRef() {
        return genRef;
    }

    /**
     * Sets the value of the genRef property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGenRef(String value) {
        this.genRef = value;
    }

}
