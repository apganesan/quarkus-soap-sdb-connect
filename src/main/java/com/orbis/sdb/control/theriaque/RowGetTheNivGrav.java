package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_niv_grav complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_niv_grav">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="cdf_code_pk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cdf_nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_niv_grav", propOrder = {

})
public class RowGetTheNivGrav {

    @XmlElement(name = "cdf_code_pk", required = true, nillable = true)
    protected String cdfCodePk;
    @XmlElement(name = "cdf_nom", required = true, nillable = true)
    protected String cdfNom;

    /**
     * Gets the value of the cdfCodePk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCdfCodePk() {
        return cdfCodePk;
    }

    /**
     * Sets the value of the cdfCodePk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCdfCodePk(String value) {
        this.cdfCodePk = value;
    }

    /**
     * Gets the value of the cdfNom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCdfNom() {
        return cdfNom;
    }

    /**
     * Sets the value of the cdfNom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCdfNom(String value) {
        this.cdfNom = value;
    }

}
