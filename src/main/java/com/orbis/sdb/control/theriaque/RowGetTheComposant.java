package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_composant complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_composant">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="libelle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="excipient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="effetnotoire" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_composant", propOrder = {

})
public class RowGetTheComposant {

    @XmlElement(required = true, nillable = true)
    protected String id;
    @XmlElement(required = true, nillable = true)
    protected String libelle;
    @XmlElement(required = true, nillable = true)
    protected String excipient;
    @XmlElement(required = true, nillable = true)
    protected String effetnotoire;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the libelle property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Sets the value of the libelle property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibelle(String value) {
        this.libelle = value;
    }

    /**
     * Gets the value of the excipient property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExcipient() {
        return excipient;
    }

    /**
     * Sets the value of the excipient property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExcipient(String value) {
        this.excipient = value;
    }

    /**
     * Gets the value of the effetnotoire property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEffetnotoire() {
        return effetnotoire;
    }

    /**
     * Sets the value of the effetnotoire property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEffetnotoire(String value) {
        this.effetnotoire = value;
    }

}
