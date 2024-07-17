package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_det_poso complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_det_poso">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="typ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nofic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="info" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="grp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="numord" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_det_poso", propOrder = {

})
public class RowGetTheDetPoso {

    @XmlElement(required = true, nillable = true)
    protected String typ;
    @XmlElement(required = true, nillable = true)
    protected String nofic;
    @XmlElement(required = true, nillable = true)
    protected String code;
    @XmlElement(required = true, nillable = true)
    protected String info;
    @XmlElement(required = true, nillable = true)
    protected String grp;
    @XmlElement(required = true, nillable = true)
    protected String numord;

    /**
     * Gets the value of the typ property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTyp(String value) {
        this.typ = value;
    }

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
     * Gets the value of the info property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInfo(String value) {
        this.info = value;
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
     * Gets the value of the numord property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumord() {
        return numord;
    }

    /**
     * Sets the value of the numord property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumord(String value) {
        this.numord = value;
    }

}
