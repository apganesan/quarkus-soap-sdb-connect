package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_atr_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_atr_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="titre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="avis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="date_avis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_atr_spe", propOrder = {

})
public class RowGetTheAtrSpe {

    @XmlElement(required = true, nillable = true)
    protected String titre;
    @XmlElement(required = true, nillable = true)
    protected String avis;
    @XmlElement(name = "date_avis", required = true, nillable = true)
    protected String dateAvis;

    /**
     * Gets the value of the titre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Sets the value of the titre property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitre(String value) {
        this.titre = value;
    }

    /**
     * Gets the value of the avis property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAvis() {
        return avis;
    }

    /**
     * Sets the value of the avis property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAvis(String value) {
        this.avis = value;
    }

    /**
     * Gets the value of the dateAvis property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDateAvis() {
        return dateAvis;
    }

    /**
     * Sets the value of the dateAvis property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDateAvis(String value) {
        this.dateAvis = value;
    }

}
