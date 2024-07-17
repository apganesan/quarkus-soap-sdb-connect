package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_gen_vir_txt complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_gen_vir_txt">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="gsp_nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pres_dc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id13" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="gen_text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_gen_vir_txt", propOrder = {

})
public class RowGetTheGenVirTxt {

    @XmlElement(name = "gsp_nom", required = true, nillable = true)
    protected String gspNom;
    @XmlElement(required = true, nillable = true)
    protected String id;
    @XmlElement(name = "pres_dc", required = true, nillable = true)
    protected String presDc;
    @XmlElement(required = true, nillable = true)
    protected String id13;
    @XmlElement(name = "gen_text", required = true, nillable = true)
    protected String genText;

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
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the presDc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPresDc() {
        return presDc;
    }

    /**
     * Sets the value of the presDc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPresDc(String value) {
        this.presDc = value;
    }

    /**
     * Gets the value of the id13 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId13() {
        return id13;
    }

    /**
     * Sets the value of the id13 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId13(String value) {
        this.id13 = value;
    }

    /**
     * Gets the value of the genText property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGenText() {
        return genText;
    }

    /**
     * Sets the value of the genText property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGenText(String value) {
        this.genText = value;
    }

}
