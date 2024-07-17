package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_ref_secupreclinique complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_ref_secupreclinique">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="refoff" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dateref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_ref_secupreclinique", propOrder = {

})
public class RowGetTheRefSecupreclinique {

    @XmlElement(required = true, nillable = true)
    protected String refoff;
    @XmlElement(required = true, nillable = true)
    protected String dateref;

    /**
     * Gets the value of the refoff property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRefoff() {
        return refoff;
    }

    /**
     * Sets the value of the refoff property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRefoff(String value) {
        this.refoff = value;
    }

    /**
     * Gets the value of the dateref property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDateref() {
        return dateref;
    }

    /**
     * Sets the value of the dateref property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDateref(String value) {
        this.dateref = value;
    }

}
