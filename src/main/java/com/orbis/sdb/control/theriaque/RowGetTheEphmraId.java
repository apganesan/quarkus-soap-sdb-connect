package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_ephmra_id complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_ephmra_id">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="ceph_code_pk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ceph_ceph_code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ceph_nomf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ceph_noma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ceph_datecr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ceph_datemj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_ephmra_id", propOrder = {

})
public class RowGetTheEphmraId {

    @XmlElement(name = "ceph_code_pk", required = true, nillable = true)
    protected String cephCodePk;
    @XmlElement(name = "ceph_ceph_code_fk", required = true, nillable = true)
    protected String cephCephCodeFk;
    @XmlElement(name = "ceph_nomf", required = true, nillable = true)
    protected String cephNomf;
    @XmlElement(name = "ceph_noma", required = true, nillable = true)
    protected String cephNoma;
    @XmlElement(name = "ceph_datecr", required = true, nillable = true)
    protected String cephDatecr;
    @XmlElement(name = "ceph_datemj", required = true, nillable = true)
    protected String cephDatemj;

    /**
     * Gets the value of the cephCodePk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCephCodePk() {
        return cephCodePk;
    }

    /**
     * Sets the value of the cephCodePk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCephCodePk(String value) {
        this.cephCodePk = value;
    }

    /**
     * Gets the value of the cephCephCodeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCephCephCodeFk() {
        return cephCephCodeFk;
    }

    /**
     * Sets the value of the cephCephCodeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCephCephCodeFk(String value) {
        this.cephCephCodeFk = value;
    }

    /**
     * Gets the value of the cephNomf property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCephNomf() {
        return cephNomf;
    }

    /**
     * Sets the value of the cephNomf property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCephNomf(String value) {
        this.cephNomf = value;
    }

    /**
     * Gets the value of the cephNoma property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCephNoma() {
        return cephNoma;
    }

    /**
     * Sets the value of the cephNoma property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCephNoma(String value) {
        this.cephNoma = value;
    }

    /**
     * Gets the value of the cephDatecr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCephDatecr() {
        return cephDatecr;
    }

    /**
     * Sets the value of the cephDatecr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCephDatecr(String value) {
        this.cephDatecr = value;
    }

    /**
     * Gets the value of the cephDatemj property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCephDatemj() {
        return cephDatemj;
    }

    /**
     * Sets the value of the cephDatemj property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCephDatemj(String value) {
        this.cephDatemj = value;
    }

}
