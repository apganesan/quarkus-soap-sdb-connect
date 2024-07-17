package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_smr_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_smr_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="codeatr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dtsmr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="textsmr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_smr_spe", propOrder = {

})
public class RowGetTheSmrSpe {

    @XmlElement(required = true, nillable = true)
    protected String codeatr;
    @XmlElement(required = true, nillable = true)
    protected String dtsmr;
    @XmlElement(required = true, nillable = true)
    protected String textsmr;

    /**
     * Gets the value of the codeatr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeatr() {
        return codeatr;
    }

    /**
     * Sets the value of the codeatr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeatr(String value) {
        this.codeatr = value;
    }

    /**
     * Gets the value of the dtsmr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDtsmr() {
        return dtsmr;
    }

    /**
     * Sets the value of the dtsmr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDtsmr(String value) {
        this.dtsmr = value;
    }

    /**
     * Gets the value of the textsmr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTextsmr() {
        return textsmr;
    }

    /**
     * Sets the value of the textsmr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTextsmr(String value) {
        this.textsmr = value;
    }

}
