package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_infos complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_infos">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="vers" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="date_ext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_infos", propOrder = {

})
public class RowGetTheInfos {

    @XmlElement(required = true, nillable = true)
    protected String vers;
    @XmlElement(name = "date_ext", required = true, nillable = true)
    protected String dateExt;

    /**
     * Gets the value of the vers property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVers() {
        return vers;
    }

    /**
     * Sets the value of the vers property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVers(String value) {
        this.vers = value;
    }

    /**
     * Gets the value of the dateExt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDateExt() {
        return dateExt;
    }

    /**
     * Sets the value of the dateExt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDateExt(String value) {
        this.dateExt = value;
    }

}
