package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_lab_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_lab_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="codelab" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nomlab" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="refof" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "row_get_the_lab_spe", propOrder = {

})
public class RowGetTheLabSpe {

    @XmlElement(required = true, nillable = true)
    protected String codelab;
    @XmlElement(required = true, nillable = true)
    protected String nomlab;
    @XmlElement(required = true, nillable = true)
    protected String refof;
    @XmlElement(required = true, nillable = true)
    protected String dateref;

    /**
     * Gets the value of the codelab property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodelab() {
        return codelab;
    }

    /**
     * Sets the value of the codelab property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodelab(String value) {
        this.codelab = value;
    }

    /**
     * Gets the value of the nomlab property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNomlab() {
        return nomlab;
    }

    /**
     * Sets the value of the nomlab property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNomlab(String value) {
        this.nomlab = value;
    }

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
