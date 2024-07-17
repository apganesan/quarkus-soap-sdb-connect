package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_recadm_id complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_recadm_id">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="textrecadm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dtrecadm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_recadm_id", propOrder = {

})
public class RowGetTheRecadmId {

    @XmlElement(required = true, nillable = true)
    protected String textrecadm;
    @XmlElement(required = true, nillable = true)
    protected String dtrecadm;

    /**
     * Gets the value of the textrecadm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTextrecadm() {
        return textrecadm;
    }

    /**
     * Sets the value of the textrecadm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTextrecadm(String value) {
        this.textrecadm = value;
    }

    /**
     * Gets the value of the dtrecadm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDtrecadm() {
        return dtrecadm;
    }

    /**
     * Sets the value of the dtrecadm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDtrecadm(String value) {
        this.dtrecadm = value;
    }

}
