package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_forme_comp_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_forme_comp_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="codefo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="codecp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="numseq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="libfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_forme_comp_spe", propOrder = {

})
public class RowGetTheFormeCompSpe {

    @XmlElement(required = true, nillable = true)
    protected String codefo;
    @XmlElement(required = true, nillable = true)
    protected String codecp;
    @XmlElement(required = true, nillable = true)
    protected String numseq;
    @XmlElement(required = true, nillable = true)
    protected String libfo;

    /**
     * Gets the value of the codefo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodefo() {
        return codefo;
    }

    /**
     * Sets the value of the codefo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodefo(String value) {
        this.codefo = value;
    }

    /**
     * Gets the value of the codecp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodecp() {
        return codecp;
    }

    /**
     * Sets the value of the codecp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodecp(String value) {
        this.codecp = value;
    }

    /**
     * Gets the value of the numseq property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumseq() {
        return numseq;
    }

    /**
     * Sets the value of the numseq property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumseq(String value) {
        this.numseq = value;
    }

    /**
     * Gets the value of the libfo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibfo() {
        return libfo;
    }

    /**
     * Sets the value of the libfo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibfo(String value) {
        this.libfo = value;
    }

}
