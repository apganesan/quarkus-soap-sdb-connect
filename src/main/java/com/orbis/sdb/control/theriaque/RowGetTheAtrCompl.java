package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_atr_compl complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_atr_compl">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="presmr_pre_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="presmr_date_smr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_atr_compl", propOrder = {

})
public class RowGetTheAtrCompl {

    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(name = "presmr_pre_code", required = true, nillable = true)
    protected String presmrPreCode;
    @XmlElement(name = "presmr_date_smr", required = true, nillable = true)
    protected String presmrDateSmr;
    @XmlElement(required = true, nillable = true)
    protected String nature;

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the presmrPreCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPresmrPreCode() {
        return presmrPreCode;
    }

    /**
     * Sets the value of the presmrPreCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPresmrPreCode(String value) {
        this.presmrPreCode = value;
    }

    /**
     * Gets the value of the presmrDateSmr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPresmrDateSmr() {
        return presmrDateSmr;
    }

    /**
     * Sets the value of the presmrDateSmr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPresmrDateSmr(String value) {
        this.presmrDateSmr = value;
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

}
