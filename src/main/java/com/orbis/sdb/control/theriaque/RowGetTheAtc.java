package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_atc complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_atc">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="libelle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_atc", propOrder = {

})
public class RowGetTheAtc {

    @XmlElement(required = true, nillable = true)
    protected String libelle;
    @XmlElement(required = true, nillable = true)
    protected String code;

    /**
     * Gets the value of the libelle property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Sets the value of the libelle property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibelle(String value) {
        this.libelle = value;
    }

    /**
     * Gets the value of the code property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCode(String value) {
        this.code = value;
    }

}
