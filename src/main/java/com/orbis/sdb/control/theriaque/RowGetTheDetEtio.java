package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_det_etio complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_det_etio">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="textetio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="valetio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_det_etio", propOrder = {

})
public class RowGetTheDetEtio {

    @XmlElement(required = true, nillable = true)
    protected String textetio;
    @XmlElement(required = true, nillable = true)
    protected String valetio;

    /**
     * Gets the value of the textetio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTextetio() {
        return textetio;
    }

    /**
     * Sets the value of the textetio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTextetio(String value) {
        this.textetio = value;
    }

    /**
     * Gets the value of the valetio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValetio() {
        return valetio;
    }

    /**
     * Sets the value of the valetio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValetio(String value) {
        this.valetio = value;
    }

}
