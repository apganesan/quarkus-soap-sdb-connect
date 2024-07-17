package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_ucd_cond_prim complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_ucd_cond_prim">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="id_spe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cip13" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nb_ucd_cp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_ucd_cond_prim", propOrder = {

})
public class RowGetTheUcdCondPrim {

    @XmlElement(name = "id_spe", required = true, nillable = true)
    protected String idSpe;
    @XmlElement(required = true, nillable = true)
    protected String cip;
    @XmlElement(required = true, nillable = true)
    protected String cip13;
    @XmlElement(name = "nb_ucd_cp", required = true, nillable = true)
    protected String nbUcdCp;

    /**
     * Gets the value of the idSpe property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdSpe() {
        return idSpe;
    }

    /**
     * Sets the value of the idSpe property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdSpe(String value) {
        this.idSpe = value;
    }

    /**
     * Gets the value of the cip property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCip() {
        return cip;
    }

    /**
     * Sets the value of the cip property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCip(String value) {
        this.cip = value;
    }

    /**
     * Gets the value of the cip13 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCip13() {
        return cip13;
    }

    /**
     * Sets the value of the cip13 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCip13(String value) {
        this.cip13 = value;
    }

    /**
     * Gets the value of the nbUcdCp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNbUcdCp() {
        return nbUcdCp;
    }

    /**
     * Sets the value of the nbUcdCp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNbUcdCp(String value) {
        this.nbUcdCp = value;
    }

}
