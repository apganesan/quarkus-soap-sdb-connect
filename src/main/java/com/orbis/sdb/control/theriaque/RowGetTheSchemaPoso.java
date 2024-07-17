package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_schema_poso complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_schema_poso">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="nofic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="seq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="uniteprise" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dosemin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dosemax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="freqmin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="freqmax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unitefreqmin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unitefreqmax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dureemin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dureemax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unitedureemin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unitedureemax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_schema_poso", propOrder = {

})
public class RowGetTheSchemaPoso {

    @XmlElement(required = true, nillable = true)
    protected String nofic;
    @XmlElement(required = true, nillable = true)
    protected String seq;
    @XmlElement(required = true, nillable = true)
    protected String nature;
    @XmlElement(required = true, nillable = true)
    protected String uniteprise;
    @XmlElement(required = true, nillable = true)
    protected String dosemin;
    @XmlElement(required = true, nillable = true)
    protected String dosemax;
    @XmlElement(required = true, nillable = true)
    protected String freqmin;
    @XmlElement(required = true, nillable = true)
    protected String freqmax;
    @XmlElement(required = true, nillable = true)
    protected String unitefreqmin;
    @XmlElement(required = true, nillable = true)
    protected String unitefreqmax;
    @XmlElement(required = true, nillable = true)
    protected String dureemin;
    @XmlElement(required = true, nillable = true)
    protected String dureemax;
    @XmlElement(required = true, nillable = true)
    protected String unitedureemin;
    @XmlElement(required = true, nillable = true)
    protected String unitedureemax;

    /**
     * Gets the value of the nofic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNofic() {
        return nofic;
    }

    /**
     * Sets the value of the nofic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNofic(String value) {
        this.nofic = value;
    }

    /**
     * Gets the value of the seq property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSeq(String value) {
        this.seq = value;
    }

    /**
     * Gets the value of the nature property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNature() {
        return nature;
    }

    /**
     * Sets the value of the nature property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNature(String value) {
        this.nature = value;
    }

    /**
     * Gets the value of the uniteprise property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUniteprise() {
        return uniteprise;
    }

    /**
     * Sets the value of the uniteprise property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUniteprise(String value) {
        this.uniteprise = value;
    }

    /**
     * Gets the value of the dosemin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDosemin() {
        return dosemin;
    }

    /**
     * Sets the value of the dosemin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDosemin(String value) {
        this.dosemin = value;
    }

    /**
     * Gets the value of the dosemax property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDosemax() {
        return dosemax;
    }

    /**
     * Sets the value of the dosemax property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDosemax(String value) {
        this.dosemax = value;
    }

    /**
     * Gets the value of the freqmin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFreqmin() {
        return freqmin;
    }

    /**
     * Sets the value of the freqmin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFreqmin(String value) {
        this.freqmin = value;
    }

    /**
     * Gets the value of the freqmax property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFreqmax() {
        return freqmax;
    }

    /**
     * Sets the value of the freqmax property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFreqmax(String value) {
        this.freqmax = value;
    }

    /**
     * Gets the value of the unitefreqmin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitefreqmin() {
        return unitefreqmin;
    }

    /**
     * Sets the value of the unitefreqmin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitefreqmin(String value) {
        this.unitefreqmin = value;
    }

    /**
     * Gets the value of the unitefreqmax property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitefreqmax() {
        return unitefreqmax;
    }

    /**
     * Sets the value of the unitefreqmax property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitefreqmax(String value) {
        this.unitefreqmax = value;
    }

    /**
     * Gets the value of the dureemin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDureemin() {
        return dureemin;
    }

    /**
     * Sets the value of the dureemin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDureemin(String value) {
        this.dureemin = value;
    }

    /**
     * Gets the value of the dureemax property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDureemax() {
        return dureemax;
    }

    /**
     * Sets the value of the dureemax property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDureemax(String value) {
        this.dureemax = value;
    }

    /**
     * Gets the value of the unitedureemin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitedureemin() {
        return unitedureemin;
    }

    /**
     * Sets the value of the unitedureemin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitedureemin(String value) {
        this.unitedureemin = value;
    }

    /**
     * Gets the value of the unitedureemax property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitedureemax() {
        return unitedureemax;
    }

    /**
     * Sets the value of the unitedureemax property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitedureemax(String value) {
        this.unitedureemax = value;
    }

}
