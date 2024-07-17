package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_desc_pres complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_desc_pres">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="cip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="quantite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="type_unite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="code_unite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="contenance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="unite_volume" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_desc_pres", propOrder = {

})
public class RowGetTheDescPres {

    @XmlElement(required = true, nillable = true)
    protected String cip;
    @XmlElement(required = true, nillable = true)
    protected String quantite;
    @XmlElement(required = true, nillable = true)
    protected String unite;
    @XmlElement(name = "type_unite", required = true, nillable = true)
    protected String typeUnite;
    @XmlElement(name = "code_unite", required = true, nillable = true)
    protected String codeUnite;
    @XmlElement(required = true, nillable = true)
    protected String contenance;
    @XmlElement(name = "unite_volume", required = true, nillable = true)
    protected String uniteVolume;

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
     * Gets the value of the quantite property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getQuantite() {
        return quantite;
    }

    /**
     * Sets the value of the quantite property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setQuantite(String value) {
        this.quantite = value;
    }

    /**
     * Gets the value of the unite property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnite() {
        return unite;
    }

    /**
     * Sets the value of the unite property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnite(String value) {
        this.unite = value;
    }

    /**
     * Gets the value of the typeUnite property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTypeUnite() {
        return typeUnite;
    }

    /**
     * Sets the value of the typeUnite property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTypeUnite(String value) {
        this.typeUnite = value;
    }

    /**
     * Gets the value of the codeUnite property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeUnite() {
        return codeUnite;
    }

    /**
     * Sets the value of the codeUnite property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeUnite(String value) {
        this.codeUnite = value;
    }

    /**
     * Gets the value of the contenance property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContenance() {
        return contenance;
    }

    /**
     * Sets the value of the contenance property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContenance(String value) {
        this.contenance = value;
    }

    /**
     * Gets the value of the uniteVolume property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUniteVolume() {
        return uniteVolume;
    }

    /**
     * Sets the value of the uniteVolume property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUniteVolume(String value) {
        this.uniteVolume = value;
    }

}
