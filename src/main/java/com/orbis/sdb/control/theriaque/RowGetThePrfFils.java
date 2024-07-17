package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_prf_fils complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_prf_fils">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="typ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pere" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fils" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="lib" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="no_ord" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_prf_fils", propOrder = {

})
public class RowGetThePrfFils {

    @XmlElement(required = true, nillable = true)
    protected String typ;
    @XmlElement(required = true, nillable = true)
    protected String pere;
    @XmlElement(required = true, nillable = true)
    protected String fils;
    @XmlElement(required = true, nillable = true)
    protected String lib;
    @XmlElement(name = "no_ord", required = true, nillable = true)
    protected String noOrd;

    /**
     * Gets the value of the typ property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Gets the value of the pere property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPere() {
        return pere;
    }

    /**
     * Sets the value of the pere property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPere(String value) {
        this.pere = value;
    }

    /**
     * Gets the value of the fils property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFils() {
        return fils;
    }

    /**
     * Sets the value of the fils property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFils(String value) {
        this.fils = value;
    }

    /**
     * Gets the value of the lib property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLib() {
        return lib;
    }

    /**
     * Sets the value of the lib property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLib(String value) {
        this.lib = value;
    }

    /**
     * Gets the value of the noOrd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoOrd() {
        return noOrd;
    }

    /**
     * Sets the value of the noOrd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoOrd(String value) {
        this.noOrd = value;
    }

}
