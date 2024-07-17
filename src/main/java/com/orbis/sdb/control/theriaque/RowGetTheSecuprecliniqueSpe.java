package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_secupreclinique_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_secupreclinique_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="codefic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="textfic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datecre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datemaj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_secupreclinique_spe", propOrder = {

})
public class RowGetTheSecuprecliniqueSpe {

    @XmlElement(required = true, nillable = true)
    protected String codefic;
    @XmlElement(required = true, nillable = true)
    protected String textfic;
    @XmlElement(required = true, nillable = true)
    protected String datecre;
    @XmlElement(required = true, nillable = true)
    protected String datemaj;

    /**
     * Gets the value of the codefic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodefic() {
        return codefic;
    }

    /**
     * Sets the value of the codefic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodefic(String value) {
        this.codefic = value;
    }

    /**
     * Gets the value of the textfic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTextfic() {
        return textfic;
    }

    /**
     * Sets the value of the textfic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTextfic(String value) {
        this.textfic = value;
    }

    /**
     * Gets the value of the datecre property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatecre() {
        return datecre;
    }

    /**
     * Sets the value of the datecre property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatecre(String value) {
        this.datecre = value;
    }

    /**
     * Gets the value of the datemaj property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatemaj() {
        return datemaj;
    }

    /**
     * Sets the value of the datemaj property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatemaj(String value) {
        this.datemaj = value;
    }

}
