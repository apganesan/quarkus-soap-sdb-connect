package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_cim10_terrain complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_cim10_terrain">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="code_cim10" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="code_terrain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cim_libelle_court" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cim_libelle_long" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_cim10_terrain", propOrder = {

})
public class RowGetTheCim10Terrain {

    @XmlElement(name = "code_cim10", required = true, nillable = true)
    protected String codeCim10;
    @XmlElement(name = "code_terrain", required = true, nillable = true)
    protected String codeTerrain;
    @XmlElement(name = "cim_libelle_court", required = true, nillable = true)
    protected String cimLibelleCourt;
    @XmlElement(name = "cim_libelle_long", required = true, nillable = true)
    protected String cimLibelleLong;

    /**
     * Gets the value of the codeCim10 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeCim10() {
        return codeCim10;
    }

    /**
     * Sets the value of the codeCim10 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeCim10(String value) {
        this.codeCim10 = value;
    }

    /**
     * Gets the value of the codeTerrain property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeTerrain() {
        return codeTerrain;
    }

    /**
     * Sets the value of the codeTerrain property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeTerrain(String value) {
        this.codeTerrain = value;
    }

    /**
     * Gets the value of the cimLibelleCourt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCimLibelleCourt() {
        return cimLibelleCourt;
    }

    /**
     * Sets the value of the cimLibelleCourt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCimLibelleCourt(String value) {
        this.cimLibelleCourt = value;
    }

    /**
     * Gets the value of the cimLibelleLong property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCimLibelleLong() {
        return cimLibelleLong;
    }

    /**
     * Sets the value of the cimLibelleLong property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCimLibelleLong(String value) {
        this.cimLibelleLong = value;
    }

}
