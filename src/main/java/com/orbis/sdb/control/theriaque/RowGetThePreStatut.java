package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_pre_statut complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_pre_statut">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ref_off" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ident" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dat_ref_off" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dat_revision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_pre_statut", propOrder = {

})
public class RowGetThePreStatut {

    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(name = "ref_off", required = true, nillable = true)
    protected String refOff;
    @XmlElement(required = true, nillable = true)
    protected String ident;
    @XmlElement(name = "dat_ref_off", required = true, nillable = true)
    protected String datRefOff;
    @XmlElement(name = "dat_revision", required = true, nillable = true)
    protected String datRevision;

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

    /**
     * Gets the value of the ident property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Sets the value of the ident property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdent(String value) {
        this.ident = value;
    }

    /**
     * Gets the value of the datRefOff property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatRefOff() {
        return datRefOff;
    }

    /**
     * Sets the value of the datRefOff property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatRefOff(String value) {
        this.datRefOff = value;
    }

    /**
     * Gets the value of the datRevision property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatRevision() {
        return datRevision;
    }

    /**
     * Sets the value of the datRevision property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatRevision(String value) {
        this.datRevision = value;
    }

}
