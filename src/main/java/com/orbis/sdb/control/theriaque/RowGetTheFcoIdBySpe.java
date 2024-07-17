package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_fco_id_by_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_fco_id_by_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="idfco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fco_txt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="info_01" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dat_cre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_fco_id_by_spe", propOrder = {

})
public class RowGetTheFcoIdBySpe {

    @XmlElement(required = true, nillable = true)
    protected String idfco;
    @XmlElement(name = "fco_txt", required = true, nillable = true)
    protected String fcoTxt;
    @XmlElement(name = "info_01", required = true, nillable = true)
    protected String info01;
    @XmlElement(name = "dat_cre", required = true, nillable = true)
    protected String datCre;

    /**
     * Gets the value of the idfco property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdfco() {
        return idfco;
    }

    /**
     * Sets the value of the idfco property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdfco(String value) {
        this.idfco = value;
    }

    /**
     * Gets the value of the fcoTxt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFcoTxt() {
        return fcoTxt;
    }

    /**
     * Sets the value of the fcoTxt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFcoTxt(String value) {
        this.fcoTxt = value;
    }

    /**
     * Gets the value of the info01 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInfo01() {
        return info01;
    }

    /**
     * Sets the value of the info01 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInfo01(String value) {
        this.info01 = value;
    }

    /**
     * Gets the value of the datCre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatCre() {
        return datCre;
    }

    /**
     * Sets the value of the datCre property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatCre(String value) {
        this.datCre = value;
    }

}
