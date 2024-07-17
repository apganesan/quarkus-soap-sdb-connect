package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_det_effind complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_det_effind">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="codeind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="libind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_det_effind", propOrder = {

})
public class RowGetTheDetEffind {

    @XmlElement(required = true, nillable = true)
    protected String codeind;
    @XmlElement(required = true, nillable = true)
    protected String libind;

    /**
     * Gets the value of the codeind property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeind() {
        return codeind;
    }

    /**
     * Sets the value of the codeind property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeind(String value) {
        this.codeind = value;
    }

    /**
     * Gets the value of the libind property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibind() {
        return libind;
    }

    /**
     * Sets the value of the libind property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibind(String value) {
        this.libind = value;
    }

}
