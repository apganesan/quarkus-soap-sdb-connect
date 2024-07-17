package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_det_fco complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_det_fco">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="fcoid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="grp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="info_01" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dat_cre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dat_maj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_det_fco", propOrder = {

})
public class RowGetTheDetFco {

    @XmlElement(required = true, nillable = true)
    protected String fcoid;
    @XmlElement(required = true, nillable = true)
    protected String grp;
    @XmlElement(name = "info_01", required = true, nillable = true)
    protected String info01;
    @XmlElement(name = "dat_cre", required = true, nillable = true)
    protected String datCre;
    @XmlElement(name = "dat_maj", required = true, nillable = true)
    protected String datMaj;

    /**
     * Gets the value of the fcoid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFcoid() {
        return fcoid;
    }

    /**
     * Sets the value of the fcoid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFcoid(String value) {
        this.fcoid = value;
    }

    /**
     * Gets the value of the grp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGrp() {
        return grp;
    }

    /**
     * Sets the value of the grp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGrp(String value) {
        this.grp = value;
    }

    /**
     * Gets the value of the info01 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInfo01() {
        return info01;
    }

    /**
     * Sets the value of the info01 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInfo01(String value) {
        this.info01 = value;
    }

    /**
     * Gets the value of the datCre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatCre() {
        return datCre;
    }

    /**
     * Sets the value of the datCre property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatCre(String value) {
        this.datCre = value;
    }

    /**
     * Gets the value of the datMaj property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatMaj() {
        return datMaj;
    }

    /**
     * Sets the value of the datMaj property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatMaj(String value) {
        this.datMaj = value;
    }

}
