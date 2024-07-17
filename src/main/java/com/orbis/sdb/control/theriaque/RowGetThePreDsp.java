package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_pre_dsp complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_pre_dsp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="typ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="info_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="valeur_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "row_get_the_pre_dsp", propOrder = {

})
public class RowGetThePreDsp {

    @XmlElement(required = true, nillable = true)
    protected String typ;
    @XmlElement(name = "info_1", required = true, nillable = true)
    protected String info1;
    @XmlElement(name = "valeur_1", required = true, nillable = true)
    protected String valeur1;
    @XmlElement(required = true, nillable = true)
    protected String texte;

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
