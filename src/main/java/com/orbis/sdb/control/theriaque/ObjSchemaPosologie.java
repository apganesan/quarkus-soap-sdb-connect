package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for obj_schema_posologie complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="obj_schema_posologie">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="posologie" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="indiceligneprescription" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="typeposo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="valduree" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="idduree" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="quantiteunite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="idunite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="valrepetition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="typerepetition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nb_elements" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="surface_element" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obj_schema_posologie", propOrder = {

})
public class ObjSchemaPosologie {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer posologie;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer indiceligneprescription;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer typeposo;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer valduree;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer idduree;
    @XmlElement(required = true, nillable = true)
    protected String quantiteunite;
    @XmlElement(required = true, nillable = true)
    protected String idunite;
    @XmlElement(required = true, nillable = true)
    protected String valrepetition;
    @XmlElement(required = true, nillable = true)
    protected String typerepetition;
    @XmlElement(name = "nb_elements", required = true, nillable = true)
    protected String nbElements;
    @XmlElement(name = "surface_element", required = true, nillable = true)
    protected String surfaceElement;

    /**
     * Gets the value of the posologie property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getPosologie() {
        return posologie;
    }

    /**
     * Sets the value of the posologie property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setPosologie(Integer value) {
        this.posologie = value;
    }

    /**
     * Gets the value of the indiceligneprescription property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getIndiceligneprescription() {
        return indiceligneprescription;
    }

    /**
     * Sets the value of the indiceligneprescription property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setIndiceligneprescription(Integer value) {
        this.indiceligneprescription = value;
    }

    /**
     * Gets the value of the typeposo property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTypeposo() {
        return typeposo;
    }

    /**
     * Sets the value of the typeposo property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTypeposo(Integer value) {
        this.typeposo = value;
    }

    /**
     * Gets the value of the valduree property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getValduree() {
        return valduree;
    }

    /**
     * Sets the value of the valduree property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setValduree(Integer value) {
        this.valduree = value;
    }

    /**
     * Gets the value of the idduree property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getIdduree() {
        return idduree;
    }

    /**
     * Sets the value of the idduree property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setIdduree(Integer value) {
        this.idduree = value;
    }

    /**
     * Gets the value of the quantiteunite property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getQuantiteunite() {
        return quantiteunite;
    }

    /**
     * Sets the value of the quantiteunite property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setQuantiteunite(String value) {
        this.quantiteunite = value;
    }

    /**
     * Gets the value of the idunite property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdunite() {
        return idunite;
    }

    /**
     * Sets the value of the idunite property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdunite(String value) {
        this.idunite = value;
    }

    /**
     * Gets the value of the valrepetition property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValrepetition() {
        return valrepetition;
    }

    /**
     * Sets the value of the valrepetition property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValrepetition(String value) {
        this.valrepetition = value;
    }

    /**
     * Gets the value of the typerepetition property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTyperepetition() {
        return typerepetition;
    }

    /**
     * Sets the value of the typerepetition property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTyperepetition(String value) {
        this.typerepetition = value;
    }

    /**
     * Gets the value of the nbElements property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNbElements() {
        return nbElements;
    }

    /**
     * Sets the value of the nbElements property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNbElements(String value) {
        this.nbElements = value;
    }

    /**
     * Gets the value of the surfaceElement property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurfaceElement() {
        return surfaceElement;
    }

    /**
     * Sets the value of the surfaceElement property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurfaceElement(String value) {
        this.surfaceElement = value;
    }

}
