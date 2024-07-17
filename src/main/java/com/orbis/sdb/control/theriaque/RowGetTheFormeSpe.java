package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_forme_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_forme_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="codefo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="libfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="forme_abrege" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_forme_spe", propOrder = {

})
public class RowGetTheFormeSpe {

    @XmlElement(required = true, nillable = true)
    protected String codefo;
    @XmlElement(required = true, nillable = true)
    protected String libfo;
    @XmlElement(name = "forme_abrege", required = true, nillable = true)
    protected String formeAbrege;

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

    /**
     * Gets the value of the formeAbrege property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFormeAbrege() {
        return formeAbrege;
    }

    /**
     * Sets the value of the formeAbrege property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFormeAbrege(String value) {
        this.formeAbrege = value;
    }

}
