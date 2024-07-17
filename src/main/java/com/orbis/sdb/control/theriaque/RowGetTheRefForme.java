package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_ref_forme complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_ref_forme">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="refof" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dtref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_ref_forme", propOrder = {

})
public class RowGetTheRefForme {

    @XmlElement(required = true, nillable = true)
    protected String refof;
    @XmlElement(required = true, nillable = true)
    protected String dtref;

    /**
     * Gets the value of the refof property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRefof() {
        return refof;
    }

    /**
     * Sets the value of the refof property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRefof(String value) {
        this.refof = value;
    }

    /**
     * Gets the value of the dtref property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDtref() {
        return dtref;
    }

    /**
     * Sets the value of the dtref property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDtref(String value) {
        this.dtref = value;
    }

}
