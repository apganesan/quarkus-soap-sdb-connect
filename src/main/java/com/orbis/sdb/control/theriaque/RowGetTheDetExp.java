package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_det_exp complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_det_exp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="libdet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="doseseuil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_det_exp", propOrder = {

})
public class RowGetTheDetExp {

    @XmlElement(required = true, nillable = true)
    protected String libdet;
    @XmlElement(required = true, nillable = true)
    protected String doseseuil;

    /**
     * Gets the value of the libdet property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibdet() {
        return libdet;
    }

    /**
     * Sets the value of the libdet property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibdet(String value) {
        this.libdet = value;
    }

    /**
     * Gets the value of the doseseuil property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDoseseuil() {
        return doseseuil;
    }

    /**
     * Sets the value of the doseseuil property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDoseseuil(String value) {
        this.doseseuil = value;
    }

}
