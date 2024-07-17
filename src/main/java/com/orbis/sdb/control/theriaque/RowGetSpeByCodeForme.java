package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_spe_by_code_forme complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_spe_by_code_forme">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="cod_spe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nom_spe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nom_virtuel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="virtuel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_spe_by_code_forme", propOrder = {

})
public class RowGetSpeByCodeForme {

    @XmlElement(name = "cod_spe", required = true, nillable = true)
    protected String codSpe;
    @XmlElement(name = "nom_spe", required = true, nillable = true)
    protected String nomSpe;
    @XmlElement(name = "nom_virtuel", required = true, nillable = true)
    protected String nomVirtuel;
    @XmlElement(required = true, nillable = true)
    protected String virtuel;

    /**
     * Gets the value of the codSpe property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodSpe() {
        return codSpe;
    }

    /**
     * Sets the value of the codSpe property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodSpe(String value) {
        this.codSpe = value;
    }

    /**
     * Gets the value of the nomSpe property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNomSpe() {
        return nomSpe;
    }

    /**
     * Sets the value of the nomSpe property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNomSpe(String value) {
        this.nomSpe = value;
    }

    /**
     * Gets the value of the nomVirtuel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNomVirtuel() {
        return nomVirtuel;
    }

    /**
     * Sets the value of the nomVirtuel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNomVirtuel(String value) {
        this.nomVirtuel = value;
    }

    /**
     * Gets the value of the virtuel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVirtuel() {
        return virtuel;
    }

    /**
     * Sets the value of the virtuel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVirtuel(String value) {
        this.virtuel = value;
    }

}
