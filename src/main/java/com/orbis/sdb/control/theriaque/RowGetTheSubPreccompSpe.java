package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_sub_preccomp_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_sub_preccomp_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="textprec" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ref_off" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dat_off" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_sub_preccomp_spe", propOrder = {

})
public class RowGetTheSubPreccompSpe {

    @XmlElement(required = true, nillable = true)
    protected String textprec;
    @XmlElement(name = "ref_off", required = true, nillable = true)
    protected String refOff;
    @XmlElement(name = "dat_off", required = true, nillable = true)
    protected String datOff;

    /**
     * Gets the value of the textprec property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTextprec() {
        return textprec;
    }

    /**
     * Sets the value of the textprec property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTextprec(String value) {
        this.textprec = value;
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
     * Gets the value of the datOff property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatOff() {
        return datOff;
    }

    /**
     * Sets the value of the datOff property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatOff(String value) {
        this.datOff = value;
    }

}
