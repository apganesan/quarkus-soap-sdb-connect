package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_forme_par_code_forme complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_forme_par_code_forme">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="cod_form" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="lib_form" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_forme_par_code_forme", propOrder = {

})
public class RowGetTheFormeParCodeForme {

    @XmlElement(name = "cod_form", required = true, nillable = true)
    protected String codForm;
    @XmlElement(name = "lib_form", required = true, nillable = true)
    protected String libForm;

    /**
     * Gets the value of the codForm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodForm() {
        return codForm;
    }

    /**
     * Sets the value of the codForm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodForm(String value) {
        this.codForm = value;
    }

    /**
     * Gets the value of the libForm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLibForm() {
        return libForm;
    }

    /**
     * Sets the value of the libForm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLibForm(String value) {
        this.libForm = value;
    }

}
