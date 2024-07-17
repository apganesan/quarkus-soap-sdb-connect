package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_ref_cipemg_rcp complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_ref_cipemg_rcp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="statut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="rcpfic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dat_ref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ref_txt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_ref_cipemg_rcp", propOrder = {

})
public class RowGetTheRefCipemgRcp {

    @XmlElement(required = true, nillable = true)
    protected String statut;
    @XmlElement(required = true, nillable = true)
    protected String rcpfic;
    @XmlElement(required = true, nillable = true)
    protected String ref;
    @XmlElement(name = "dat_ref", required = true, nillable = true)
    protected String datRef;
    @XmlElement(name = "ref_txt", required = true, nillable = true)
    protected String refTxt;

    /**
     * Gets the value of the statut property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatut() {
        return statut;
    }

    /**
     * Sets the value of the statut property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatut(String value) {
        this.statut = value;
    }

    /**
     * Gets the value of the rcpfic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRcpfic() {
        return rcpfic;
    }

    /**
     * Sets the value of the rcpfic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRcpfic(String value) {
        this.rcpfic = value;
    }

    /**
     * Gets the value of the ref property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the datRef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatRef() {
        return datRef;
    }

    /**
     * Sets the value of the datRef property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatRef(String value) {
        this.datRef = value;
    }

    /**
     * Gets the value of the refTxt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRefTxt() {
        return refTxt;
    }

    /**
     * Sets the value of the refTxt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRefTxt(String value) {
        this.refTxt = value;
    }

}
