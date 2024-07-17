package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_presdel complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_presdel">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="ATU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="RH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="PH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="PIH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="SP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="PS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="T2A" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ORPHELIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ORPH_CREF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="SAGE_F" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="R_IDE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="PODO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_presdel", propOrder = {

})
public class RowGetThePresdel {

    @XmlElement(name = "ATU", required = true, nillable = true)
    protected String atu;
    @XmlElement(name = "RH", required = true, nillable = true)
    protected String rh;
    @XmlElement(name = "PH", required = true, nillable = true)
    protected String ph;
    @XmlElement(name = "PIH", required = true, nillable = true)
    protected String pih;
    @XmlElement(name = "SP", required = true, nillable = true)
    protected String sp;
    @XmlElement(name = "PS", required = true, nillable = true)
    protected String ps;
    @XmlElement(name = "T2A", required = true, nillable = true)
    protected String t2A;
    @XmlElement(name = "ORPHELIN", required = true, nillable = true)
    protected String orphelin;
    @XmlElement(name = "ORPH_CREF", required = true, nillable = true)
    protected String orphcref;
    @XmlElement(name = "SAGE_F", required = true, nillable = true)
    protected String sagef;
    @XmlElement(name = "R_IDE", required = true, nillable = true)
    protected String ride;
    @XmlElement(name = "PODO", required = true, nillable = true)
    protected String podo;
    @XmlElement(name = "URL", required = true, nillable = true)
    protected String url;

    /**
     * Gets the value of the atu property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getATU() {
        return atu;
    }

    /**
     * Sets the value of the atu property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setATU(String value) {
        this.atu = value;
    }

    /**
     * Gets the value of the rh property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRH() {
        return rh;
    }

    /**
     * Sets the value of the rh property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRH(String value) {
        this.rh = value;
    }

    /**
     * Gets the value of the ph property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPH() {
        return ph;
    }

    /**
     * Sets the value of the ph property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPH(String value) {
        this.ph = value;
    }

    /**
     * Gets the value of the pih property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPIH() {
        return pih;
    }

    /**
     * Sets the value of the pih property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPIH(String value) {
        this.pih = value;
    }

    /**
     * Gets the value of the sp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSP() {
        return sp;
    }

    /**
     * Sets the value of the sp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSP(String value) {
        this.sp = value;
    }

    /**
     * Gets the value of the ps property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPS() {
        return ps;
    }

    /**
     * Sets the value of the ps property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPS(String value) {
        this.ps = value;
    }

    /**
     * Gets the value of the t2A property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getT2A() {
        return t2A;
    }

    /**
     * Sets the value of the t2A property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setT2A(String value) {
        this.t2A = value;
    }

    /**
     * Gets the value of the orphelin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getORPHELIN() {
        return orphelin;
    }

    /**
     * Sets the value of the orphelin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setORPHELIN(String value) {
        this.orphelin = value;
    }

    /**
     * Gets the value of the orphcref property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getORPHCREF() {
        return orphcref;
    }

    /**
     * Sets the value of the orphcref property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setORPHCREF(String value) {
        this.orphcref = value;
    }

    /**
     * Gets the value of the sagef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSAGEF() {
        return sagef;
    }

    /**
     * Sets the value of the sagef property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSAGEF(String value) {
        this.sagef = value;
    }

    /**
     * Gets the value of the ride property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRIDE() {
        return ride;
    }

    /**
     * Sets the value of the ride property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRIDE(String value) {
        this.ride = value;
    }

    /**
     * Gets the value of the podo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPODO() {
        return podo;
    }

    /**
     * Sets the value of the podo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPODO(String value) {
        this.podo = value;
    }

    /**
     * Gets the value of the url property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setURL(String value) {
        this.url = value;
    }

}
