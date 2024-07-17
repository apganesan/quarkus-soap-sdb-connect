package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_ind_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_ind_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="codeind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fin_text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_ind_spe", propOrder = {

})
public class RowGetTheIndSpe {

    @XmlElement(required = true, nillable = true)
    protected String codeind;
    @XmlElement(name = "fin_text", required = true, nillable = true)
    protected String finText;

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
     * Gets the value of the finText property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFinText() {
        return finText;
    }

    /**
     * Sets the value of the finText property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFinText(String value) {
        this.finText = value;
    }

}
