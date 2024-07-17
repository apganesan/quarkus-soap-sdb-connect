package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_prix_unit_est complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_prix_unit_est">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ucd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ucd13" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="prix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_prix_unit_est", propOrder = {

})
public class RowGetThePrixUnitEst {

    @XmlElement(required = true, nillable = true)
    protected String code;
    @XmlElement(required = true, nillable = true)
    protected String ucd;
    @XmlElement(required = true, nillable = true)
    protected String ucd13;
    @XmlElement(required = true, nillable = true)
    protected String prix;

    /**
     * Gets the value of the code property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the ucd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUcd() {
        return ucd;
    }

    /**
     * Sets the value of the ucd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUcd(String value) {
        this.ucd = value;
    }

    /**
     * Gets the value of the ucd13 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUcd13() {
        return ucd13;
    }

    /**
     * Sets the value of the ucd13 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUcd13(String value) {
        this.ucd13 = value;
    }

    /**
     * Gets the value of the prix property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrix() {
        return prix;
    }

    /**
     * Sets the value of the prix property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrix(String value) {
        this.prix = value;
    }

}
