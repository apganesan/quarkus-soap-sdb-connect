package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_gr_spe complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_gr_spe">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="textgr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_gr_spe", propOrder = {

})
public class RowGetTheGrSpe {

    @XmlElement(required = true, nillable = true)
    protected String textgr;

    /**
     * Gets the value of the textgr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTextgr() {
        return textgr;
    }

    /**
     * Sets the value of the textgr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTextgr(String value) {
        this.textgr = value;
    }

}
