package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_prf_pat complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_prf_pat">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="critere" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="lib" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fils" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_prf_pat", propOrder = {

})
public class RowGetThePrfPat {

    @XmlElement(required = true, nillable = true)
    protected String critere;
    @XmlElement(required = true, nillable = true)
    protected String lib;
    @XmlElement(required = true, nillable = true)
    protected String code;
    @XmlElement(required = true, nillable = true)
    protected String fils;

    /**
     * Gets the value of the critere property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCritere() {
        return critere;
    }

    /**
     * Sets the value of the critere property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCritere(String value) {
        this.critere = value;
    }

    /**
     * Gets the value of the lib property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLib() {
        return lib;
    }

    /**
     * Sets the value of the lib property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLib(String value) {
        this.lib = value;
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
     * Gets the value of the fils property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFils() {
        return fils;
    }

    /**
     * Sets the value of the fils property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFils(String value) {
        this.fils = value;
    }

}
