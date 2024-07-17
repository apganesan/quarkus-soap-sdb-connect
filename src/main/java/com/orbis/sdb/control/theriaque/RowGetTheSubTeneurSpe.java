package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_sub_teneur_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_sub_teneur_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="teneur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="qualificatif" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dosage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unitecode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unitenom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dosage_equiv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unitecode_equiv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unitenom_equiv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_sub_teneur_spe", propOrder = {

})
public class RowGetTheSubTeneurSpe {

    @XmlElement(required = true, nillable = true)
    protected String teneur;
    @XmlElement(required = true, nillable = true)
    protected String qualificatif;
    @XmlElement(required = true, nillable = true)
    protected String dosage;
    @XmlElement(required = true, nillable = true)
    protected String unitecode;
    @XmlElement(required = true, nillable = true)
    protected String unitenom;
    @XmlElement(name = "dosage_equiv", required = true, nillable = true)
    protected String dosageEquiv;
    @XmlElement(name = "unitecode_equiv", required = true, nillable = true)
    protected String unitecodeEquiv;
    @XmlElement(name = "unitenom_equiv", required = true, nillable = true)
    protected String unitenomEquiv;

    /**
     * Gets the value of the teneur property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTeneur() {
        return teneur;
    }

    /**
     * Sets the value of the teneur property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTeneur(String value) {
        this.teneur = value;
    }

    /**
     * Gets the value of the qualificatif property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getQualificatif() {
        return qualificatif;
    }

    /**
     * Sets the value of the qualificatif property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setQualificatif(String value) {
        this.qualificatif = value;
    }

    /**
     * Gets the value of the dosage property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDosage() {
        return dosage;
    }

    /**
     * Sets the value of the dosage property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDosage(String value) {
        this.dosage = value;
    }

    /**
     * Gets the value of the unitecode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitecode() {
        return unitecode;
    }

    /**
     * Sets the value of the unitecode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitecode(String value) {
        this.unitecode = value;
    }

    /**
     * Gets the value of the unitenom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitenom() {
        return unitenom;
    }

    /**
     * Sets the value of the unitenom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitenom(String value) {
        this.unitenom = value;
    }

    /**
     * Gets the value of the dosageEquiv property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDosageEquiv() {
        return dosageEquiv;
    }

    /**
     * Sets the value of the dosageEquiv property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDosageEquiv(String value) {
        this.dosageEquiv = value;
    }

    /**
     * Gets the value of the unitecodeEquiv property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitecodeEquiv() {
        return unitecodeEquiv;
    }

    /**
     * Sets the value of the unitecodeEquiv property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitecodeEquiv(String value) {
        this.unitecodeEquiv = value;
    }

    /**
     * Gets the value of the unitenomEquiv property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitenomEquiv() {
        return unitenomEquiv;
    }

    /**
     * Sets the value of the unitenomEquiv property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitenomEquiv(String value) {
        this.unitenomEquiv = value;
    }

}
