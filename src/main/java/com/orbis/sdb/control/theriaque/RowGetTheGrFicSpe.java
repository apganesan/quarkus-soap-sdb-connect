package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_gr_fic_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_gr_fic_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="code_fiche" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datecr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datemj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="typeeffet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="passagelait" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fixprot" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fixprotmini" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fixprotmaxi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="plasmalait" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="plasmalaitmini" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="plasmalaitmaxi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="concent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="concentmini" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="concentmaxi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="concentuni" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_gr_fic_spe", propOrder = {

})
public class RowGetTheGrFicSpe {

    @XmlElement(name = "code_fiche", required = true, nillable = true)
    protected String codeFiche;
    @XmlElement(required = true, nillable = true)
    protected String datecr;
    @XmlElement(required = true, nillable = true)
    protected String datemj;
    @XmlElement(required = true, nillable = true)
    protected String typeeffet;
    @XmlElement(required = true, nillable = true)
    protected String passagelait;
    @XmlElement(required = true, nillable = true)
    protected String fixprot;
    @XmlElement(required = true, nillable = true)
    protected String fixprotmini;
    @XmlElement(required = true, nillable = true)
    protected String fixprotmaxi;
    @XmlElement(required = true, nillable = true)
    protected String plasmalait;
    @XmlElement(required = true, nillable = true)
    protected String plasmalaitmini;
    @XmlElement(required = true, nillable = true)
    protected String plasmalaitmaxi;
    @XmlElement(required = true, nillable = true)
    protected String concent;
    @XmlElement(required = true, nillable = true)
    protected String concentmini;
    @XmlElement(required = true, nillable = true)
    protected String concentmaxi;
    @XmlElement(required = true, nillable = true)
    protected String concentuni;

    /**
     * Gets the value of the codeFiche property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeFiche() {
        return codeFiche;
    }

    /**
     * Sets the value of the codeFiche property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeFiche(String value) {
        this.codeFiche = value;
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

    /**
     * Gets the value of the typeeffet property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTypeeffet() {
        return typeeffet;
    }

    /**
     * Sets the value of the typeeffet property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTypeeffet(String value) {
        this.typeeffet = value;
    }

    /**
     * Gets the value of the passagelait property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPassagelait() {
        return passagelait;
    }

    /**
     * Sets the value of the passagelait property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPassagelait(String value) {
        this.passagelait = value;
    }

    /**
     * Gets the value of the fixprot property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFixprot() {
        return fixprot;
    }

    /**
     * Sets the value of the fixprot property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFixprot(String value) {
        this.fixprot = value;
    }

    /**
     * Gets the value of the fixprotmini property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFixprotmini() {
        return fixprotmini;
    }

    /**
     * Sets the value of the fixprotmini property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFixprotmini(String value) {
        this.fixprotmini = value;
    }

    /**
     * Gets the value of the fixprotmaxi property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFixprotmaxi() {
        return fixprotmaxi;
    }

    /**
     * Sets the value of the fixprotmaxi property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFixprotmaxi(String value) {
        this.fixprotmaxi = value;
    }

    /**
     * Gets the value of the plasmalait property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPlasmalait() {
        return plasmalait;
    }

    /**
     * Sets the value of the plasmalait property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPlasmalait(String value) {
        this.plasmalait = value;
    }

    /**
     * Gets the value of the plasmalaitmini property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPlasmalaitmini() {
        return plasmalaitmini;
    }

    /**
     * Sets the value of the plasmalaitmini property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPlasmalaitmini(String value) {
        this.plasmalaitmini = value;
    }

    /**
     * Gets the value of the plasmalaitmaxi property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPlasmalaitmaxi() {
        return plasmalaitmaxi;
    }

    /**
     * Sets the value of the plasmalaitmaxi property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPlasmalaitmaxi(String value) {
        this.plasmalaitmaxi = value;
    }

    /**
     * Gets the value of the concent property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getConcent() {
        return concent;
    }

    /**
     * Sets the value of the concent property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setConcent(String value) {
        this.concent = value;
    }

    /**
     * Gets the value of the concentmini property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getConcentmini() {
        return concentmini;
    }

    /**
     * Sets the value of the concentmini property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setConcentmini(String value) {
        this.concentmini = value;
    }

    /**
     * Gets the value of the concentmaxi property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getConcentmaxi() {
        return concentmaxi;
    }

    /**
     * Sets the value of the concentmaxi property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setConcentmaxi(String value) {
        this.concentmaxi = value;
    }

    /**
     * Gets the value of the concentuni property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getConcentuni() {
        return concentuni;
    }

    /**
     * Sets the value of the concentuni property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setConcentuni(String value) {
        this.concentuni = value;
    }

}
