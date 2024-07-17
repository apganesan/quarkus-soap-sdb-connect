package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_prf_indic complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_prf_indic">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="pds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_prf_indic", propOrder = {

})
public class RowGetThePrfIndic {

    @XmlElement(required = true, nillable = true)
    protected String pds;
    @XmlElement(name = "id_ind", required = true, nillable = true)
    protected String idInd;

    /**
     * Gets the value of the pds property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPds() {
        return pds;
    }

    /**
     * Sets the value of the pds property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPds(String value) {
        this.pds = value;
    }

    /**
     * Gets the value of the idInd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdInd() {
        return idInd;
    }

    /**
     * Sets the value of the idInd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdInd(String value) {
        this.idInd = value;
    }

}
