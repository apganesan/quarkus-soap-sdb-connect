package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_pre_pri complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_pre_pri">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="grp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="valeur_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nature_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="date_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="data_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="validite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_pre_pri", propOrder = {

})
public class RowGetThePrePri {

    @XmlElement(required = true, nillable = true)
    protected String grp;
    @XmlElement(name = "valeur_1", required = true, nillable = true)
    protected String valeur1;
    @XmlElement(name = "nature_1", required = true, nillable = true)
    protected String nature1;
    @XmlElement(name = "date_1", required = true, nillable = true)
    protected String date1;
    @XmlElement(name = "data_1", required = true, nillable = true)
    protected String data1;
    @XmlElement(required = true, nillable = true)
    protected String validite;

    /**
     * Gets the value of the grp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGrp() {
        return grp;
    }

    /**
     * Sets the value of the grp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGrp(String value) {
        this.grp = value;
    }

    /**
     * Gets the value of the valeur1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValeur1() {
        return valeur1;
    }

    /**
     * Sets the value of the valeur1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValeur1(String value) {
        this.valeur1 = value;
    }

    /**
     * Gets the value of the nature1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNature1() {
        return nature1;
    }

    /**
     * Sets the value of the nature1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNature1(String value) {
        this.nature1 = value;
    }

    /**
     * Gets the value of the date1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDate1() {
        return date1;
    }

    /**
     * Sets the value of the date1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDate1(String value) {
        this.date1 = value;
    }

    /**
     * Gets the value of the data1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getData1() {
        return data1;
    }

    /**
     * Sets the value of the data1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setData1(String value) {
        this.data1 = value;
    }

    /**
     * Gets the value of the validite property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValidite() {
        return validite;
    }

    /**
     * Sets the value of the validite property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValidite(String value) {
        this.validite = value;
    }

}
