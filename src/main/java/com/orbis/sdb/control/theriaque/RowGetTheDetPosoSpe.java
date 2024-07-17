package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_det_poso_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_det_poso_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="nofic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="grp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="info_01" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="mini" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="info_02" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="maxi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="info_03" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_det_poso_spe", propOrder = {

})
public class RowGetTheDetPosoSpe {

    @XmlElement(required = true, nillable = true)
    protected String nofic;
    @XmlElement(required = true, nillable = true)
    protected String grp;
    @XmlElement(required = true, nillable = true)
    protected String nature;
    @XmlElement(name = "info_01", required = true, nillable = true)
    protected String info01;
    @XmlElement(required = true, nillable = true)
    protected String mini;
    @XmlElement(name = "info_02", required = true, nillable = true)
    protected String info02;
    @XmlElement(required = true, nillable = true)
    protected String maxi;
    @XmlElement(name = "info_03", required = true, nillable = true)
    protected String info03;

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
     * Gets the value of the mini property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMini() {
        return mini;
    }

    /**
     * Sets the value of the mini property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMini(String value) {
        this.mini = value;
    }

    /**
     * Gets the value of the info02 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInfo02() {
        return info02;
    }

    /**
     * Sets the value of the info02 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInfo02(String value) {
        this.info02 = value;
    }

    /**
     * Gets the value of the maxi property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMaxi() {
        return maxi;
    }

    /**
     * Sets the value of the maxi property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMaxi(String value) {
        this.maxi = value;
    }

    /**
     * Gets the value of the info03 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInfo03() {
        return info03;
    }

    /**
     * Sets the value of the info03 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInfo03(String value) {
        this.info03 = value;
    }

}
