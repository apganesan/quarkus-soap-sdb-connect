package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_pre_rbt complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_pre_rbt">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="info_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="valeur_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="date_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="date_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="texte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_pre_rbt", propOrder = {

})
public class RowGetThePreRbt {

    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(name = "info_1", required = true, nillable = true)
    protected String info1;
    @XmlElement(name = "valeur_1", required = true, nillable = true)
    protected String valeur1;
    @XmlElement(name = "date_1", required = true, nillable = true)
    protected String date1;
    @XmlElement(name = "date_2", required = true, nillable = true)
    protected String date2;
    @XmlElement(required = true, nillable = true)
    protected String texte;

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
     * Gets the value of the info1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInfo1() {
        return info1;
    }

    /**
     * Sets the value of the info1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInfo1(String value) {
        this.info1 = value;
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
     * Gets the value of the date2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDate2() {
        return date2;
    }

    /**
     * Sets the value of the date2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDate2(String value) {
        this.date2 = value;
    }

    /**
     * Gets the value of the texte property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Sets the value of the texte property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTexte(String value) {
        this.texte = value;
    }

}
