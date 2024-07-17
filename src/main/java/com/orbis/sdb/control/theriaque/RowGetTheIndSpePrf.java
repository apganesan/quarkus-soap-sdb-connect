package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for row_get_the_ind_spe_prf complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="row_get_the_ind_spe_prf">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="nofic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="txt_fic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "row_get_the_ind_spe_prf", propOrder = {

})
public class RowGetTheIndSpePrf {

    @XmlElement(required = true, nillable = true)
    protected String nofic;
    @XmlElement(name = "txt_fic", required = true, nillable = true)
    protected String txtFic;

    /**
     * Gets the value of the nofic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNofic() {
        return nofic;
    }

    /**
     * Sets the value of the nofic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNofic(String value) {
        this.nofic = value;
    }

    /**
     * Gets the value of the txtFic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTxtFic() {
        return txtFic;
    }

    /**
     * Sets the value of the txtFic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTxtFic(String value) {
        this.txtFic = value;
    }

}
