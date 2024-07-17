package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_al_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_al_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="textal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_al_spe", propOrder = {

})
public class RowGetTheAlSpe {

    @XmlElement(required = true, nillable = true)
    protected String textal;

    /**
     * Gets the value of the textal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTextal() {
        return textal;
    }

    /**
     * Sets the value of the textal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTextal(String value) {
        this.textal = value;
    }

}
