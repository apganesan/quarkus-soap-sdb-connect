package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_gtiam_txt complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_gtiam_txt">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="nofit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="texte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="date_txt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_gtiam_txt", propOrder = {

})
public class RowGetTheGtiamTxt {

    @XmlElement(required = true, nillable = true)
    protected String nofit;
    @XmlElement(required = true, nillable = true)
    protected String texte;
    @XmlElement(name = "date_txt", required = true, nillable = true)
    protected String dateTxt;

    /**
     * Gets the value of the nofit property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNofit() {
        return nofit;
    }

    /**
     * Sets the value of the nofit property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNofit(String value) {
        this.nofit = value;
    }

    /**
     * Gets the value of the texte property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Sets the value of the texte property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTexte(String value) {
        this.texte = value;
    }

    /**
     * Gets the value of the dateTxt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDateTxt() {
        return dateTxt;
    }

    /**
     * Sets the value of the dateTxt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDateTxt(String value) {
        this.dateTxt = value;
    }

}
