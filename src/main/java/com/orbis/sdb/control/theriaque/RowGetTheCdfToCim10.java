package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_cdf_to_cim10 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_cdf_to_cim10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="nat_codif" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_cim10" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_the" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="the_nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cim10_lc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cim10_ll" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_cdf_to_cim10", propOrder = {

})
public class RowGetTheCdfToCim10 {

    @XmlElement(name = "nat_codif", required = true, nillable = true)
    protected String natCodif;
    @XmlElement(name = "id_cim10", required = true, nillable = true)
    protected String idCim10;
    @XmlElement(name = "id_the", required = true, nillable = true)
    protected String idThe;
    @XmlElement(name = "the_nom", required = true, nillable = true)
    protected String theNom;
    @XmlElement(name = "cim10_lc", required = true, nillable = true)
    protected String cim10Lc;
    @XmlElement(name = "cim10_ll", required = true, nillable = true)
    protected String cim10Ll;

    /**
     * Gets the value of the natCodif property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNatCodif() {
        return natCodif;
    }

    /**
     * Sets the value of the natCodif property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNatCodif(String value) {
        this.natCodif = value;
    }

    /**
     * Gets the value of the idCim10 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdCim10() {
        return idCim10;
    }

    /**
     * Sets the value of the idCim10 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdCim10(String value) {
        this.idCim10 = value;
    }

    /**
     * Gets the value of the idThe property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdThe() {
        return idThe;
    }

    /**
     * Sets the value of the idThe property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdThe(String value) {
        this.idThe = value;
    }

    /**
     * Gets the value of the theNom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTheNom() {
        return theNom;
    }

    /**
     * Sets the value of the theNom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTheNom(String value) {
        this.theNom = value;
    }

    /**
     * Gets the value of the cim10Lc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCim10Lc() {
        return cim10Lc;
    }

    /**
     * Sets the value of the cim10Lc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCim10Lc(String value) {
        this.cim10Lc = value;
    }

    /**
     * Gets the value of the cim10Ll property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCim10Ll() {
        return cim10Ll;
    }

    /**
     * Sets the value of the cim10Ll property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCim10Ll(String value) {
        this.cim10Ll = value;
    }

}
