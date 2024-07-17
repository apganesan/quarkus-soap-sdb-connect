package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_prf_hyper complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_prf_hyper">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="id_com" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cdf_nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_spe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sp_nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_ter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="idseq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_prf_hyper", propOrder = {

})
public class RowGetThePrfHyper {

    @XmlElement(name = "id_com", required = true, nillable = true)
    protected String idCom;
    @XmlElement(name = "cdf_nom", required = true, nillable = true)
    protected String cdfNom;
    @XmlElement(name = "id_spe", required = true, nillable = true)
    protected String idSpe;
    @XmlElement(name = "sp_nom", required = true, nillable = true)
    protected String spNom;
    @XmlElement(name = "id_ter", required = true, nillable = true)
    protected String idTer;
    @XmlElement(required = true, nillable = true)
    protected String idseq;
    @XmlElement(required = true, nillable = true)
    protected String nature;

    /**
     * Gets the value of the idCom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdCom() {
        return idCom;
    }

    /**
     * Sets the value of the idCom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdCom(String value) {
        this.idCom = value;
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

    /**
     * Gets the value of the idSpe property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdSpe() {
        return idSpe;
    }

    /**
     * Sets the value of the idSpe property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdSpe(String value) {
        this.idSpe = value;
    }

    /**
     * Gets the value of the spNom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpNom() {
        return spNom;
    }

    /**
     * Sets the value of the spNom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpNom(String value) {
        this.spNom = value;
    }

    /**
     * Gets the value of the idTer property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdTer() {
        return idTer;
    }

    /**
     * Sets the value of the idTer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdTer(String value) {
        this.idTer = value;
    }

    /**
     * Gets the value of the idseq property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdseq() {
        return idseq;
    }

    /**
     * Sets the value of the idseq property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdseq(String value) {
        this.idseq = value;
    }

    /**
     * Gets the value of the nature property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNature() {
        return nature;
    }

    /**
     * Sets the value of the nature property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNature(String value) {
        this.nature = value;
    }

}
