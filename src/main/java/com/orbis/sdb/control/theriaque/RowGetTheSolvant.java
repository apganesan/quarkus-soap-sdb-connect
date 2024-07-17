package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_solvant complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_solvant">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="fiche" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="solute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="texte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_solvant", propOrder = {

})
public class RowGetTheSolvant {

    @XmlElement(required = true, nillable = true)
    protected String fiche;
    @XmlElement(required = true, nillable = true)
    protected String solute;
    @XmlElement(required = true, nillable = true)
    protected String texte;
    @XmlElement(required = true, nillable = true)
    protected String ref;

    /**
     * Gets the value of the fiche property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFiche() {
        return fiche;
    }

    /**
     * Sets the value of the fiche property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFiche(String value) {
        this.fiche = value;
    }

    /**
     * Gets the value of the solute property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSolute() {
        return solute;
    }

    /**
     * Sets the value of the solute property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSolute(String value) {
        this.solute = value;
    }

    /**
     * Gets the value of the texte property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Sets the value of the texte property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTexte(String value) {
        this.texte = value;
    }

    /**
     * Gets the value of the ref property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRef(String value) {
        this.ref = value;
    }

}
