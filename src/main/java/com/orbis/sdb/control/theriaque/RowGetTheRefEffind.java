package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_ref_effind complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_ref_effind">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="nofic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nospe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="refoff" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_ref_effind", propOrder = {

})
public class RowGetTheRefEffind {

    @XmlElement(required = true, nillable = true)
    protected String nofic;
    @XmlElement(required = true, nillable = true)
    protected String nospe;
    @XmlElement(required = true, nillable = true)
    protected String refoff;
    @XmlElement(required = true, nillable = true)
    protected String datref;

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
     * Gets the value of the nospe property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNospe() {
        return nospe;
    }

    /**
     * Sets the value of the nospe property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNospe(String value) {
        this.nospe = value;
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

    /**
     * Gets the value of the datref property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatref() {
        return datref;
    }

    /**
     * Sets the value of the datref property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatref(String value) {
        this.datref = value;
    }

}
