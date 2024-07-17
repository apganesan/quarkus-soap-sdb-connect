package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_incomp_det complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_incomp_det">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="typ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="valeur_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="data_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="noord" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_incomp_det", propOrder = {

})
public class RowGetTheIncompDet {

    @XmlElement(required = true, nillable = true)
    protected String typ;
    @XmlElement(name = "valeur_1", required = true, nillable = true)
    protected String valeur1;
    @XmlElement(name = "data_1", required = true, nillable = true)
    protected String data1;
    @XmlElement(required = true, nillable = true)
    protected String noord;

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
     * Gets the value of the noord property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoord() {
        return noord;
    }

    /**
     * Sets the value of the noord property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoord(String value) {
        this.noord = value;
    }

}
