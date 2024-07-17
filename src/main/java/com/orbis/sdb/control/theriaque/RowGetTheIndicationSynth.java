package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_indication_synth complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_indication_synth">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="niveau" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="t2a" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="groupe_t2a" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="indic_synt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="texte_ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="date_doc_global" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="date_doc_indic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_indication_synth", propOrder = {

})
public class RowGetTheIndicationSynth {

    @XmlElement(required = true, nillable = true)
    protected String niveau;
    @XmlElement(name = "t2a", required = true, nillable = true)
    protected String t2A;
    @XmlElement(name = "groupe_t2a", required = true, nillable = true)
    protected String groupeT2A;
    @XmlElement(name = "indic_synt", required = true, nillable = true)
    protected String indicSynt;
    @XmlElement(name = "texte_ind", required = true, nillable = true)
    protected String texteInd;
    @XmlElement(name = "date_doc_global", required = true, nillable = true)
    protected String dateDocGlobal;
    @XmlElement(name = "date_doc_indic", required = true, nillable = true)
    protected String dateDocIndic;

    /**
     * Gets the value of the niveau property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNiveau() {
        return niveau;
    }

    /**
     * Sets the value of the niveau property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNiveau(String value) {
        this.niveau = value;
    }

    /**
     * Gets the value of the t2A property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getT2A() {
        return t2A;
    }

    /**
     * Sets the value of the t2A property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setT2A(String value) {
        this.t2A = value;
    }

    /**
     * Gets the value of the groupeT2A property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGroupeT2A() {
        return groupeT2A;
    }

    /**
     * Sets the value of the groupeT2A property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGroupeT2A(String value) {
        this.groupeT2A = value;
    }

    /**
     * Gets the value of the indicSynt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIndicSynt() {
        return indicSynt;
    }

    /**
     * Sets the value of the indicSynt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIndicSynt(String value) {
        this.indicSynt = value;
    }

    /**
     * Gets the value of the texteInd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTexteInd() {
        return texteInd;
    }

    /**
     * Sets the value of the texteInd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTexteInd(String value) {
        this.texteInd = value;
    }

    /**
     * Gets the value of the dateDocGlobal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDateDocGlobal() {
        return dateDocGlobal;
    }

    /**
     * Sets the value of the dateDocGlobal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDateDocGlobal(String value) {
        this.dateDocGlobal = value;
    }

    /**
     * Gets the value of the dateDocIndic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDateDocIndic() {
        return dateDocIndic;
    }

    /**
     * Sets the value of the dateDocIndic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDateDocIndic(String value) {
        this.dateDocIndic = value;
    }

}
