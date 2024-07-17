package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_forme_principale complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_forme_principale">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="lib_cfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_cfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ref_off" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_forme_principale", propOrder = {

})
public class RowGetTheFormePrincipale {

    @XmlElement(name = "lib_cfo", required = true, nillable = true)
    protected String libCfo;
    @XmlElement(name = "id_cfo", required = true, nillable = true)
    protected String idCfo;
    @XmlElement(name = "ref_off", required = true, nillable = true)
    protected String refOff;

    /**
     * Gets the value of the libCfo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibCfo() {
        return libCfo;
    }

    /**
     * Sets the value of the libCfo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibCfo(String value) {
        this.libCfo = value;
    }

    /**
     * Gets the value of the idCfo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdCfo() {
        return idCfo;
    }

    /**
     * Sets the value of the idCfo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdCfo(String value) {
        this.idCfo = value;
    }

    /**
     * Gets the value of the refOff property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRefOff() {
        return refOff;
    }

    /**
     * Sets the value of the refOff property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRefOff(String value) {
        this.refOff = value;
    }

}
