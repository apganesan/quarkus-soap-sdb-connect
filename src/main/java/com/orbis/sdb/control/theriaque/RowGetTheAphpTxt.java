package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_aphp_txt complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_aphp_txt">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="cge_code_sq_pk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cge_nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cge_datecr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cge_datemj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_aphp_txt", propOrder = {

})
public class RowGetTheAphpTxt {

    @XmlElement(name = "cge_code_sq_pk", required = true, nillable = true)
    protected String cgeCodeSqPk;
    @XmlElement(name = "cge_nom", required = true, nillable = true)
    protected String cgeNom;
    @XmlElement(name = "cge_datecr", required = true, nillable = true)
    protected String cgeDatecr;
    @XmlElement(name = "cge_datemj", required = true, nillable = true)
    protected String cgeDatemj;

    /**
     * Gets the value of the cgeCodeSqPk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCgeCodeSqPk() {
        return cgeCodeSqPk;
    }

    /**
     * Sets the value of the cgeCodeSqPk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCgeCodeSqPk(String value) {
        this.cgeCodeSqPk = value;
    }

    /**
     * Gets the value of the cgeNom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCgeNom() {
        return cgeNom;
    }

    /**
     * Sets the value of the cgeNom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCgeNom(String value) {
        this.cgeNom = value;
    }

    /**
     * Gets the value of the cgeDatecr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCgeDatecr() {
        return cgeDatecr;
    }

    /**
     * Sets the value of the cgeDatecr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCgeDatecr(String value) {
        this.cgeDatecr = value;
    }

    /**
     * Gets the value of the cgeDatemj property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCgeDatemj() {
        return cgeDatemj;
    }

    /**
     * Sets the value of the cgeDatemj property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCgeDatemj(String value) {
        this.cgeDatemj = value;
    }

}
