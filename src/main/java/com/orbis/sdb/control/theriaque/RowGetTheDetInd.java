package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_det_ind complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_det_ind">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="codedoc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="libcourt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="liblong" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="codefils" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_det_ind", propOrder = {

})
public class RowGetTheDetInd {

    @XmlElement(required = true, nillable = true)
    protected String codedoc;
    @XmlElement(required = true, nillable = true)
    protected String libcourt;
    @XmlElement(required = true, nillable = true)
    protected String liblong;
    @XmlElement(required = true, nillable = true)
    protected String codefils;

    /**
     * Gets the value of the codedoc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodedoc() {
        return codedoc;
    }

    /**
     * Sets the value of the codedoc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodedoc(String value) {
        this.codedoc = value;
    }

    /**
     * Gets the value of the libcourt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibcourt() {
        return libcourt;
    }

    /**
     * Sets the value of the libcourt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibcourt(String value) {
        this.libcourt = value;
    }

    /**
     * Gets the value of the liblong property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLiblong() {
        return liblong;
    }

    /**
     * Sets the value of the liblong property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLiblong(String value) {
        this.liblong = value;
    }

    /**
     * Gets the value of the codefils property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodefils() {
        return codefils;
    }

    /**
     * Sets the value of the codefils property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodefils(String value) {
        this.codefils = value;
    }

}
