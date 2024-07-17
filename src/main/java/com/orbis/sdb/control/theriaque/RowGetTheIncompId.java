package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_incomp_id complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_incomp_id">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="idincomp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="terme_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="terme_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_t1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_t2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_incomp_id", propOrder = {

})
public class RowGetTheIncompId {

    @XmlElement(required = true, nillable = true)
    protected String idincomp;
    @XmlElement(name = "terme_1", required = true, nillable = true)
    protected String terme1;
    @XmlElement(name = "terme_2", required = true, nillable = true)
    protected String terme2;
    @XmlElement(name = "id_t1", required = true, nillable = true)
    protected String idT1;
    @XmlElement(name = "id_t2", required = true, nillable = true)
    protected String idT2;

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

    /**
     * Gets the value of the terme2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTerme2() {
        return terme2;
    }

    /**
     * Sets the value of the terme2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTerme2(String value) {
        this.terme2 = value;
    }

    /**
     * Gets the value of the idT1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdT1() {
        return idT1;
    }

    /**
     * Sets the value of the idT1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdT1(String value) {
        this.idT1 = value;
    }

    /**
     * Gets the value of the idT2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdT2() {
        return idT2;
    }

    /**
     * Sets the value of the idT2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdT2(String value) {
        this.idT2 = value;
    }

}
