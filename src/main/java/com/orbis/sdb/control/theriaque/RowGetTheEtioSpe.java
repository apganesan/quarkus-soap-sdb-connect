package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_etio_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_etio_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="codefic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_etio_spe", propOrder = {

})
public class RowGetTheEtioSpe {

    @XmlElement(required = true, nillable = true)
    protected String codefic;

    /**
     * Gets the value of the codefic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodefic() {
        return codefic;
    }

    /**
     * Sets the value of the codefic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodefic(String value) {
        this.codefic = value;
    }

}
