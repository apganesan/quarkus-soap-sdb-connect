package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_sub_id complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_sub_id">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="sac_code_sq_pk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sac_cdf_orn_code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sac_sau_code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sac_gsac_code_fk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sac_nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sac_noma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sac_datecr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sac_datemj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="code_ref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nom_ref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_sub_id", propOrder = {

})
public class RowGetTheSubId {

    @XmlElement(name = "sac_code_sq_pk", required = true, nillable = true)
    protected String sacCodeSqPk;
    @XmlElement(name = "sac_cdf_orn_code_fk", required = true, nillable = true)
    protected String sacCdfOrnCodeFk;
    @XmlElement(name = "sac_sau_code_fk", required = true, nillable = true)
    protected String sacSauCodeFk;
    @XmlElement(name = "sac_gsac_code_fk", required = true, nillable = true)
    protected String sacGsacCodeFk;
    @XmlElement(name = "sac_nom", required = true, nillable = true)
    protected String sacNom;
    @XmlElement(name = "sac_noma", required = true, nillable = true)
    protected String sacNoma;
    @XmlElement(name = "sac_datecr", required = true, nillable = true)
    protected String sacDatecr;
    @XmlElement(name = "sac_datemj", required = true, nillable = true)
    protected String sacDatemj;
    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(name = "code_ref", required = true, nillable = true)
    protected String codeRef;
    @XmlElement(name = "nom_ref", required = true, nillable = true)
    protected String nomRef;

    /**
     * Gets the value of the sacCodeSqPk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSacCodeSqPk() {
        return sacCodeSqPk;
    }

    /**
     * Sets the value of the sacCodeSqPk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSacCodeSqPk(String value) {
        this.sacCodeSqPk = value;
    }

    /**
     * Gets the value of the sacCdfOrnCodeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSacCdfOrnCodeFk() {
        return sacCdfOrnCodeFk;
    }

    /**
     * Sets the value of the sacCdfOrnCodeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSacCdfOrnCodeFk(String value) {
        this.sacCdfOrnCodeFk = value;
    }

    /**
     * Gets the value of the sacSauCodeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSacSauCodeFk() {
        return sacSauCodeFk;
    }

    /**
     * Sets the value of the sacSauCodeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSacSauCodeFk(String value) {
        this.sacSauCodeFk = value;
    }

    /**
     * Gets the value of the sacGsacCodeFk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSacGsacCodeFk() {
        return sacGsacCodeFk;
    }

    /**
     * Sets the value of the sacGsacCodeFk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSacGsacCodeFk(String value) {
        this.sacGsacCodeFk = value;
    }

    /**
     * Gets the value of the sacNom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSacNom() {
        return sacNom;
    }

    /**
     * Sets the value of the sacNom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSacNom(String value) {
        this.sacNom = value;
    }

    /**
     * Gets the value of the sacNoma property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSacNoma() {
        return sacNoma;
    }

    /**
     * Sets the value of the sacNoma property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSacNoma(String value) {
        this.sacNoma = value;
    }

    /**
     * Gets the value of the sacDatecr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSacDatecr() {
        return sacDatecr;
    }

    /**
     * Sets the value of the sacDatecr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSacDatecr(String value) {
        this.sacDatecr = value;
    }

    /**
     * Gets the value of the sacDatemj property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSacDatemj() {
        return sacDatemj;
    }

    /**
     * Sets the value of the sacDatemj property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSacDatemj(String value) {
        this.sacDatemj = value;
    }

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
     * Gets the value of the codeRef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeRef() {
        return codeRef;
    }

    /**
     * Sets the value of the codeRef property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeRef(String value) {
        this.codeRef = value;
    }

    /**
     * Gets the value of the nomRef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNomRef() {
        return nomRef;
    }

    /**
     * Sets the value of the nomRef property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNomRef(String value) {
        this.nomRef = value;
    }

}
