package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_effind_id complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_effind_id">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="date_maj_ei" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="effet_specialite_classe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="frequence_ei" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dose_therap" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="surdose" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_effind_id", propOrder = {

})
public class RowGetTheEffindId {

    @XmlElement(name = "date_maj_ei", required = true, nillable = true)
    protected String dateMajEi;
    @XmlElement(name = "effet_specialite_classe", required = true, nillable = true)
    protected String effetSpecialiteClasse;
    @XmlElement(name = "frequence_ei", required = true, nillable = true)
    protected String frequenceEi;
    @XmlElement(name = "dose_therap", required = true, nillable = true)
    protected String doseTherap;
    @XmlElement(required = true, nillable = true)
    protected String surdose;

    /**
     * Gets the value of the dateMajEi property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDateMajEi() {
        return dateMajEi;
    }

    /**
     * Sets the value of the dateMajEi property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDateMajEi(String value) {
        this.dateMajEi = value;
    }

    /**
     * Gets the value of the effetSpecialiteClasse property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEffetSpecialiteClasse() {
        return effetSpecialiteClasse;
    }

    /**
     * Sets the value of the effetSpecialiteClasse property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEffetSpecialiteClasse(String value) {
        this.effetSpecialiteClasse = value;
    }

    /**
     * Gets the value of the frequenceEi property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFrequenceEi() {
        return frequenceEi;
    }

    /**
     * Sets the value of the frequenceEi property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFrequenceEi(String value) {
        this.frequenceEi = value;
    }

    /**
     * Gets the value of the doseTherap property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDoseTherap() {
        return doseTherap;
    }

    /**
     * Sets the value of the doseTherap property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDoseTherap(String value) {
        this.doseTherap = value;
    }

    /**
     * Gets the value of the surdose property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurdose() {
        return surdose;
    }

    /**
     * Sets the value of the surdose property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurdose(String value) {
        this.surdose = value;
    }

}
