package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_spe_statut complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_spe_statut">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="typ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="info_01" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="date_01" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="date_02" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_spe_statut", propOrder = {

})
public class RowGetTheSpeStatut {

    @XmlElement(required = true, nillable = true)
    protected String typ;
    @XmlElement(name = "info_01", required = true, nillable = true)
    protected String info01;
    @XmlElement(name = "date_01", required = true, nillable = true)
    protected String date01;
    @XmlElement(name = "date_02", required = true, nillable = true)
    protected String date02;

    /**
     * Gets the value of the typ property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTyp(String value) {
        this.typ = value;
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
     * Gets the value of the date01 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDate01() {
        return date01;
    }

    /**
     * Sets the value of the date01 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDate01(String value) {
        this.date01 = value;
    }

    /**
     * Gets the value of the date02 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDate02() {
        return date02;
    }

    /**
     * Sets the value of the date02 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDate02(String value) {
        this.date02 = value;
    }

}
