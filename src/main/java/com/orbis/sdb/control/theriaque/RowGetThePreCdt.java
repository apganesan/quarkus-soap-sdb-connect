package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_pre_cdt complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_pre_cdt">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="valeur_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="info_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="valeur_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="info_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="valeur_3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="info_3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="valeur_4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_pre_cdt", propOrder = {

})
public class RowGetThePreCdt {

    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(name = "valeur_1", required = true, nillable = true)
    protected String valeur1;
    @XmlElement(name = "info_1", required = true, nillable = true)
    protected String info1;
    @XmlElement(name = "valeur_2", required = true, nillable = true)
    protected String valeur2;
    @XmlElement(name = "info_2", required = true, nillable = true)
    protected String info2;
    @XmlElement(name = "valeur_3", required = true, nillable = true)
    protected String valeur3;
    @XmlElement(name = "info_3", required = true, nillable = true)
    protected String info3;
    @XmlElement(name = "valeur_4", required = true, nillable = true)
    protected String valeur4;

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
     * Gets the value of the valeur2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValeur2() {
        return valeur2;
    }

    /**
     * Sets the value of the valeur2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValeur2(String value) {
        this.valeur2 = value;
    }

    /**
     * Gets the value of the info2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInfo2() {
        return info2;
    }

    /**
     * Sets the value of the info2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInfo2(String value) {
        this.info2 = value;
    }

    /**
     * Gets the value of the valeur3 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValeur3() {
        return valeur3;
    }

    /**
     * Sets the value of the valeur3 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValeur3(String value) {
        this.valeur3 = value;
    }

    /**
     * Gets the value of the info3 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInfo3() {
        return info3;
    }

    /**
     * Sets the value of the info3 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInfo3(String value) {
        this.info3 = value;
    }

    /**
     * Gets the value of the valeur4 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValeur4() {
        return valeur4;
    }

    /**
     * Sets the value of the valeur4 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValeur4(String value) {
        this.valeur4 = value;
    }

}
