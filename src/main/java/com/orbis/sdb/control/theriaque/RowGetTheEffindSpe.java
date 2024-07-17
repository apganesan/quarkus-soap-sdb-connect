package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_effind_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_effind_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="codeeffind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="texteffet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_effind_spe", propOrder = {

})
public class RowGetTheEffindSpe {

    @XmlElement(required = true, nillable = true)
    protected String codeeffind;
    @XmlElement(required = true, nillable = true)
    protected String texteffet;

    /**
     * Gets the value of the codeeffind property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeeffind() {
        return codeeffind;
    }

    /**
     * Sets the value of the codeeffind property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeeffind(String value) {
        this.codeeffind = value;
    }

    /**
     * Gets the value of the texteffet property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTexteffet() {
        return texteffet;
    }

    /**
     * Sets the value of the texteffet property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTexteffet(String value) {
        this.texteffet = value;
    }

}
