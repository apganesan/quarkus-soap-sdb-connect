package com.orbis.sdb.control.theriaque;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java class for alertes_ordonnance complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="alertes_ordonnance">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="alertes_cipemg" type="{http://www.ws-theriaque.localhost/server.php}ArrayOfAlertes_cipemg"/>
 *         <element name="alertes_interaction" type="{http://www.ws-theriaque.localhost/server.php}ArrayOfAlertes_interaction"/>
 *         <element name="alertes_incompatibilite" type="{http://www.ws-theriaque.localhost/server.php}ArrayOfAlertes_incompatibilite"/>
 *         <element name="alertes_redondance" type="{http://www.ws-theriaque.localhost/server.php}ArrayOfAlertes_redondance"/>
 *         <element name="alertes_grossesse" type="{http://www.ws-theriaque.localhost/server.php}ArrayOfAlertes_grossesse"/>
 *         <element name="alertes_posologie" type="{http://www.ws-theriaque.localhost/server.php}ArrayOfAlertes_posologie"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alertes_ordonnance", propOrder = {

})
public class AlertesOrdonnance {

    @XmlElement(name = "alertes_cipemg", required = true, nillable = true)
    protected ArrayOfAlertesCipemg alertesCipemg;
    @XmlElement(name = "alertes_interaction", required = true, nillable = true)
    protected ArrayOfAlertesInteraction alertesInteraction;
    @XmlElement(name = "alertes_incompatibilite", required = true, nillable = true)
    protected ArrayOfAlertesIncompatibilite alertesIncompatibilite;
    @XmlElement(name = "alertes_redondance", required = true, nillable = true)
    protected ArrayOfAlertesRedondance alertesRedondance;
    @XmlElement(name = "alertes_grossesse", required = true, nillable = true)
    protected ArrayOfAlertesGrossesse alertesGrossesse;
    @XmlElement(name = "alertes_posologie", required = true, nillable = true)
    protected ArrayOfAlertesPosologie alertesPosologie;

    /**
     * Gets the value of the alertesCipemg property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfAlertesCipemg }
     *
     */
    public ArrayOfAlertesCipemg getAlertesCipemg() {
        return alertesCipemg;
    }

    /**
     * Sets the value of the alertesCipemg property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlertesCipemg }
     *
     */
    public void setAlertesCipemg(ArrayOfAlertesCipemg value) {
        this.alertesCipemg = value;
    }

    /**
     * Gets the value of the alertesInteraction property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfAlertesInteraction }
     *
     */
    public ArrayOfAlertesInteraction getAlertesInteraction() {
        return alertesInteraction;
    }

    /**
     * Sets the value of the alertesInteraction property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlertesInteraction }
     *
     */
    public void setAlertesInteraction(ArrayOfAlertesInteraction value) {
        this.alertesInteraction = value;
    }

    /**
     * Gets the value of the alertesIncompatibilite property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfAlertesIncompatibilite }
     *
     */
    public ArrayOfAlertesIncompatibilite getAlertesIncompatibilite() {
        return alertesIncompatibilite;
    }

    /**
     * Sets the value of the alertesIncompatibilite property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlertesIncompatibilite }
     *
     */
    public void setAlertesIncompatibilite(ArrayOfAlertesIncompatibilite value) {
        this.alertesIncompatibilite = value;
    }

    /**
     * Gets the value of the alertesRedondance property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfAlertesRedondance }
     *
     */
    public ArrayOfAlertesRedondance getAlertesRedondance() {
        return alertesRedondance;
    }

    /**
     * Sets the value of the alertesRedondance property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlertesRedondance }
     *
     */
    public void setAlertesRedondance(ArrayOfAlertesRedondance value) {
        this.alertesRedondance = value;
    }

    /**
     * Gets the value of the alertesGrossesse property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfAlertesGrossesse }
     *
     */
    public ArrayOfAlertesGrossesse getAlertesGrossesse() {
        return alertesGrossesse;
    }

    /**
     * Sets the value of the alertesGrossesse property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlertesGrossesse }
     *
     */
    public void setAlertesGrossesse(ArrayOfAlertesGrossesse value) {
        this.alertesGrossesse = value;
    }

    /**
     * Gets the value of the alertesPosologie property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfAlertesPosologie }
     *
     */
    public ArrayOfAlertesPosologie getAlertesPosologie() {
        return alertesPosologie;
    }

    /**
     * Sets the value of the alertesPosologie property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfAlertesPosologie }
     *
     */
    public void setAlertesPosologie(ArrayOfAlertesPosologie value) {
        this.alertesPosologie = value;
    }

}
