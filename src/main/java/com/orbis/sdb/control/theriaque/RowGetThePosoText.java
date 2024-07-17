package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_poso_text complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_poso_text">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="nofic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="date_01" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="date_02" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "row_get_the_poso_text", propOrder = {

})
public class RowGetThePosoText {

    @XmlElement(required = true, nillable = true)
    protected String nofic;
    @XmlElement(name = "date_01", required = true, nillable = true)
    protected String date01;
    @XmlElement(name = "date_02", required = true, nillable = true)
    protected String date02;
    @XmlElement(required = true, nillable = true)
    protected String texte;

    /**
     * Gets the value of the nofic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNofic() {
        return nofic;
    }

    /**
     * Sets the value of the nofic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNofic(String value) {
        this.nofic = value;
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
