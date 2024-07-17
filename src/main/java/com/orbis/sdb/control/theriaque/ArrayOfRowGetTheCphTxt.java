package com.orbis.sdb.control.theriaque;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ArrayOfRow_get_the_cph_txt complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="ArrayOfRow_get_the_cph_txt">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="item" type="{http://www.ws-theriaque.localhost/server.php}row_get_the_cph_txt" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRow_get_the_cph_txt", propOrder = {
        "item"
})
public class ArrayOfRowGetTheCphTxt {

    protected List<RowGetTheCphTxt> item;

    /**
     * Gets the value of the item property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the item property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RowGetTheCphTxt }
     *
     *
     * @return
     *     The value of the item property.
     */
    public List<RowGetTheCphTxt> getItem() {
        if (item == null) {
            item = new ArrayList<>();
        }
        return this.item;
    }

}
