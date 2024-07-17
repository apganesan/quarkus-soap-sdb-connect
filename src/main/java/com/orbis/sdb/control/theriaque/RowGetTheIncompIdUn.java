package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_incomp_id_un complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_incomp_id_un">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="idincomp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="terme_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_incomp_id_un", propOrder = {

})
public class RowGetTheIncompIdUn {

    @XmlElement(required = true, nillable = true)
    protected String idincomp;
    @XmlElement(name = "terme_1", required = true, nillable = true)
    protected String terme1;

    /**
     * Gets the value of the idincomp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdincomp() {
        return idincomp;
    }

    /**
     * Sets the value of the idincomp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdincomp(String value) {
        this.idincomp = value;
    }

    /**
     * Gets the value of the terme1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTerme1() {
        return terme1;
    }

    /**
     * Sets the value of the terme1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTerme1(String value) {
        this.terme1 = value;
    }

}
