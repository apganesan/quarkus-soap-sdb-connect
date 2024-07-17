package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_inc complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_inc">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="idfic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="typeic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="texteic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datecr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datemj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_inc", propOrder = {

})
public class RowGetTheInc {

    @XmlElement(required = true, nillable = true)
    protected String idfic;
    @XmlElement(required = true, nillable = true)
    protected String typeic;
    @XmlElement(required = true, nillable = true)
    protected String texteic;
    @XmlElement(required = true, nillable = true)
    protected String datecr;
    @XmlElement(required = true, nillable = true)
    protected String datemj;

    /**
     * Gets the value of the idfic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdfic() {
        return idfic;
    }

    /**
     * Sets the value of the idfic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdfic(String value) {
        this.idfic = value;
    }

    /**
     * Gets the value of the typeic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTypeic() {
        return typeic;
    }

    /**
     * Sets the value of the typeic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTypeic(String value) {
        this.typeic = value;
    }

    /**
     * Gets the value of the texteic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTexteic() {
        return texteic;
    }

    /**
     * Sets the value of the texteic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTexteic(String value) {
        this.texteic = value;
    }

    /**
     * Gets the value of the datecr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatecr() {
        return datecr;
    }

    /**
     * Sets the value of the datecr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatecr(String value) {
        this.datecr = value;
    }

    /**
     * Gets the value of the datemj property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatemj() {
        return datemj;
    }

    /**
     * Sets the value of the datemj property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatemj(String value) {
        this.datemj = value;
    }

}
