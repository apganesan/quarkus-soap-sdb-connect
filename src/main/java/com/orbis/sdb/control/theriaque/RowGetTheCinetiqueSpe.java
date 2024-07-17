package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_cinetique_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_cinetique_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="codepharmaco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dtref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pharmacotext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="refofficielle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_cinetique_spe", propOrder = {

})
public class RowGetTheCinetiqueSpe {

    @XmlElement(required = true, nillable = true)
    protected String codepharmaco;
    @XmlElement(required = true, nillable = true)
    protected String dtref;
    @XmlElement(required = true, nillable = true)
    protected String pharmacotext;
    @XmlElement(required = true, nillable = true)
    protected String refofficielle;

    /**
     * Gets the value of the codepharmaco property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodepharmaco() {
        return codepharmaco;
    }

    /**
     * Sets the value of the codepharmaco property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodepharmaco(String value) {
        this.codepharmaco = value;
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
     * Gets the value of the pharmacotext property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPharmacotext() {
        return pharmacotext;
    }

    /**
     * Sets the value of the pharmacotext property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPharmacotext(String value) {
        this.pharmacotext = value;
    }

    /**
     * Gets the value of the refofficielle property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRefofficielle() {
        return refofficielle;
    }

    /**
     * Sets the value of the refofficielle property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRefofficielle(String value) {
        this.refofficielle = value;
    }

}
