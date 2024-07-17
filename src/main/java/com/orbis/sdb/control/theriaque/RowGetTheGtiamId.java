package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_gtiam_id complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_gtiam_id">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="idinter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="valide" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="terme_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="terme_2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_t1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="id_t2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="niveau" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_gtiam_id", propOrder = {

})
public class RowGetTheGtiamId {

    @XmlElement(required = true, nillable = true)
    protected String idinter;
    @XmlElement(required = true, nillable = true)
    protected String valide;
    @XmlElement(name = "terme_1", required = true, nillable = true)
    protected String terme1;
    @XmlElement(name = "terme_2", required = true, nillable = true)
    protected String terme2;
    @XmlElement(name = "id_t1", required = true, nillable = true)
    protected String idT1;
    @XmlElement(name = "id_t2", required = true, nillable = true)
    protected String idT2;
    @XmlElement(required = true, nillable = true)
    protected String niveau;

    /**
     * Gets the value of the idinter property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdinter() {
        return idinter;
    }

    /**
     * Sets the value of the idinter property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdinter(String value) {
        this.idinter = value;
    }

    /**
     * Gets the value of the valide property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValide() {
        return valide;
    }

    /**
     * Sets the value of the valide property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValide(String value) {
        this.valide = value;
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

    /**
     * Gets the value of the niveau property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNiveau() {
        return niveau;
    }

    /**
     * Sets the value of the niveau property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNiveau(String value) {
        this.niveau = value;
    }

}
