package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_cipemg_spe_ter complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_cipemg_spe_ter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="idcipemg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="codeter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="terrain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="no_seq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_cipemg_spe_ter", propOrder = {

})
public class RowGetTheCipemgSpeTer {

    @XmlElement(required = true, nillable = true)
    protected String idcipemg;
    @XmlElement(required = true, nillable = true)
    protected String nature;
    @XmlElement(required = true, nillable = true)
    protected String codeter;
    @XmlElement(required = true, nillable = true)
    protected String terrain;
    @XmlElement(required = true, nillable = true)
    protected String text;
    @XmlElement(name = "no_seq", required = true, nillable = true)
    protected String noSeq;

    /**
     * Gets the value of the idcipemg property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdcipemg() {
        return idcipemg;
    }

    /**
     * Sets the value of the idcipemg property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdcipemg(String value) {
        this.idcipemg = value;
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

    /**
     * Gets the value of the codeter property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeter() {
        return codeter;
    }

    /**
     * Sets the value of the codeter property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeter(String value) {
        this.codeter = value;
    }

    /**
     * Gets the value of the terrain property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTerrain() {
        return terrain;
    }

    /**
     * Sets the value of the terrain property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTerrain(String value) {
        this.terrain = value;
    }

    /**
     * Gets the value of the text property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the noSeq property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoSeq() {
        return noSeq;
    }

    /**
     * Sets the value of the noSeq property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoSeq(String value) {
        this.noSeq = value;
    }

}
