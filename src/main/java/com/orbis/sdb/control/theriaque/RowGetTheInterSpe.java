package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_inter_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_inter_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="codeinter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="textinter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dtref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="refoff" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_inter_spe", propOrder = {

})
public class RowGetTheInterSpe {

    @XmlElement(required = true, nillable = true)
    protected String codeinter;
    @XmlElement(required = true, nillable = true)
    protected String textinter;
    @XmlElement(required = true, nillable = true)
    protected String dtref;
    @XmlElement(required = true, nillable = true)
    protected String refoff;

    /**
     * Gets the value of the codeinter property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeinter() {
        return codeinter;
    }

    /**
     * Sets the value of the codeinter property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeinter(String value) {
        this.codeinter = value;
    }

    /**
     * Gets the value of the textinter property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTextinter() {
        return textinter;
    }

    /**
     * Sets the value of the textinter property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTextinter(String value) {
        this.textinter = value;
    }

    /**
     * Gets the value of the dtref property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDtref() {
        return dtref;
    }

    /**
     * Sets the value of the dtref property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDtref(String value) {
        this.dtref = value;
    }

    /**
     * Gets the value of the refoff property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRefoff() {
        return refoff;
    }

    /**
     * Sets the value of the refoff property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRefoff(String value) {
        this.refoff = value;
    }

}
