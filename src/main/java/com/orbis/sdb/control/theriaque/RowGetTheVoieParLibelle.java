package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_voie_par_libelle complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_voie_par_libelle">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="codevoie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="txtvoie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_voie_par_libelle", propOrder = {

})
public class RowGetTheVoieParLibelle {

    @XmlElement(required = true, nillable = true)
    protected String codevoie;
    @XmlElement(required = true, nillable = true)
    protected String txtvoie;

    /**
     * Gets the value of the codevoie property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodevoie() {
        return codevoie;
    }

    /**
     * Sets the value of the codevoie property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodevoie(String value) {
        this.codevoie = value;
    }

    /**
     * Gets the value of the txtvoie property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTxtvoie() {
        return txtvoie;
    }

    /**
     * Sets the value of the txtvoie property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTxtvoie(String value) {
        this.txtvoie = value;
    }

}
