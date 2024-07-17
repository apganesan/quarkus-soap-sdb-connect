package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_cph complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_cph">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="code_classe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="code_parent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_cph", propOrder = {

})
public class RowGetTheCph {

    @XmlElement(name = "code_classe", required = true, nillable = true)
    protected String codeClasse;
    @XmlElement(required = true, nillable = true)
    protected String nom;
    @XmlElement(name = "code_parent", required = true, nillable = true)
    protected String codeParent;

    /**
     * Gets the value of the codeClasse property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeClasse() {
        return codeClasse;
    }

    /**
     * Sets the value of the codeClasse property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeClasse(String value) {
        this.codeClasse = value;
    }

    /**
     * Gets the value of the nom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the value of the nom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Gets the value of the codeParent property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodeParent() {
        return codeParent;
    }

    /**
     * Sets the value of the codeParent property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodeParent(String value) {
        this.codeParent = value;
    }

}
