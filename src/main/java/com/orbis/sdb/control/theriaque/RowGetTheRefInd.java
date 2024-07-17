package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_ref_ind complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_ref_ind">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="referind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dtrefind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_ref_ind", propOrder = {

})
public class RowGetTheRefInd {

    @XmlElement(required = true, nillable = true)
    protected String referind;
    @XmlElement(required = true, nillable = true)
    protected String dtrefind;

    /**
     * Gets the value of the referind property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReferind() {
        return referind;
    }

    /**
     * Sets the value of the referind property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReferind(String value) {
        this.referind = value;
    }

    /**
     * Gets the value of the dtrefind property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDtrefind() {
        return dtrefind;
    }

    /**
     * Sets the value of the dtrefind property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDtrefind(String value) {
        this.dtrefind = value;
    }

}
