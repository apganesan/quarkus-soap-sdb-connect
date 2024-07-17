package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_denomination_commune complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_denomination_commune">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="libelle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="code7" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="code13" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="speref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="text_info" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="prescription_dc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_denomination_commune", propOrder = {

})
public class RowGetTheDenominationCommune {

    @XmlElement(required = true, nillable = true)
    protected String code;
    @XmlElement(required = true, nillable = true)
    protected String libelle;
    @XmlElement(required = true, nillable = true)
    protected String code7;
    @XmlElement(required = true, nillable = true)
    protected String code13;
    @XmlElement(required = true, nillable = true)
    protected String speref;
    @XmlElement(name = "text_info", required = true, nillable = true)
    protected String textInfo;
    @XmlElement(name = "prescription_dc", required = true, nillable = true)
    protected String prescriptionDc;

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
     * Gets the value of the code7 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCode7() {
        return code7;
    }

    /**
     * Sets the value of the code7 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCode7(String value) {
        this.code7 = value;
    }

    /**
     * Gets the value of the code13 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCode13() {
        return code13;
    }

    /**
     * Sets the value of the code13 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCode13(String value) {
        this.code13 = value;
    }

    /**
     * Gets the value of the speref property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSperef() {
        return speref;
    }

    /**
     * Sets the value of the speref property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSperef(String value) {
        this.speref = value;
    }

    /**
     * Gets the value of the textInfo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTextInfo() {
        return textInfo;
    }

    /**
     * Sets the value of the textInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTextInfo(String value) {
        this.textInfo = value;
    }

    /**
     * Gets the value of the prescriptionDc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrescriptionDc() {
        return prescriptionDc;
    }

    /**
     * Sets the value of the prescriptionDc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrescriptionDc(String value) {
        this.prescriptionDc = value;
    }

}
