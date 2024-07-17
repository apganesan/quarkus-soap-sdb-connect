package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_cim_10 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_cim_10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="libelle_court" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="libelle_long" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="code_cim10" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_cim_10", propOrder = {

})
public class RowGetTheCim10 {

    @XmlElement(required = true, nillable = true)
    protected String code;
    @XmlElement(name = "libelle_court", required = true, nillable = true)
    protected String libelleCourt;
    @XmlElement(name = "libelle_long", required = true, nillable = true)
    protected String libelleLong;
    @XmlElement(name = "code_cim10", required = true, nillable = true)
    protected String codeCim10;

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
     * Gets the value of the libelleCourt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibelleCourt() {
        return libelleCourt;
    }

    /**
     * Sets the value of the libelleCourt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibelleCourt(String value) {
        this.libelleCourt = value;
    }

    /**
     * Gets the value of the libelleLong property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibelleLong() {
        return libelleLong;
    }

    /**
     * Sets the value of the libelleLong property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibelleLong(String value) {
        this.libelleLong = value;
    }

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

}
