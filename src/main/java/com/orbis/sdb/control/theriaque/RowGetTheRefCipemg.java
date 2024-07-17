package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_ref_cipemg complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_ref_cipemg">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="refoff" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dtrefoff" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_ref_cipemg", propOrder = {

})
public class RowGetTheRefCipemg {

    @XmlElement(required = true, nillable = true)
    protected String refoff;
    @XmlElement(required = true, nillable = true)
    protected String dtrefoff;

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
     * Gets the value of the dtrefoff property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDtrefoff() {
        return dtrefoff;
    }

    /**
     * Sets the value of the dtrefoff property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDtrefoff(String value) {
        this.dtrefoff = value;
    }

}
