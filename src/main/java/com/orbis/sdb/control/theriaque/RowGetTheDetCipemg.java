package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_det_cipemg complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_det_cipemg">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="textdet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="info_01" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_det_cipemg", propOrder = {

})
public class RowGetTheDetCipemg {

    @XmlElement(required = true, nillable = true)
    protected String textdet;
    @XmlElement(name = "info_01", required = true, nillable = true)
    protected String info01;

    /**
     * Gets the value of the textdet property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTextdet() {
        return textdet;
    }

    /**
     * Sets the value of the textdet property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTextdet(String value) {
        this.textdet = value;
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

}
