package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_alerte_ordonnance complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_alerte_ordonnance">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="interactions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="femme" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cipemg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="allergies" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_alerte_ordonnance", propOrder = {

})
public class RowGetAlerteOrdonnance {

    @XmlElement(required = true, nillable = true)
    protected String interactions;
    @XmlElement(required = true, nillable = true)
    protected String femme;
    @XmlElement(required = true, nillable = true)
    protected String cipemg;
    @XmlElement(required = true, nillable = true)
    protected String allergies;

    /**
     * Gets the value of the interactions property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInteractions() {
        return interactions;
    }

    /**
     * Sets the value of the interactions property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInteractions(String value) {
        this.interactions = value;
    }

    /**
     * Gets the value of the femme property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFemme() {
        return femme;
    }

    /**
     * Sets the value of the femme property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFemme(String value) {
        this.femme = value;
    }

    /**
     * Gets the value of the cipemg property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCipemg() {
        return cipemg;
    }

    /**
     * Sets the value of the cipemg property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCipemg(String value) {
        this.cipemg = value;
    }

    /**
     * Gets the value of the allergies property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAllergies() {
        return allergies;
    }

    /**
     * Sets the value of the allergies property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAllergies(String value) {
        this.allergies = value;
    }

}
