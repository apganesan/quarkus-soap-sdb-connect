package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_secabilite complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_secabilite">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="code_forme" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="coeff" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_secabilite", propOrder = {

})
public class RowGetTheSecabilite {

    @XmlElement(name = "code_forme", required = true, nillable = true)
    protected String codeForme;
    @XmlElement(required = true, nillable = true)
    protected String coeff;

    /**
     * Gets the value of the codeForme property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeForme() {
        return codeForme;
    }

    /**
     * Sets the value of the codeForme property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeForme(String value) {
        this.codeForme = value;
    }

    /**
     * Gets the value of the coeff property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCoeff() {
        return coeff;
    }

    /**
     * Sets the value of the coeff property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCoeff(String value) {
        this.coeff = value;
    }

}
