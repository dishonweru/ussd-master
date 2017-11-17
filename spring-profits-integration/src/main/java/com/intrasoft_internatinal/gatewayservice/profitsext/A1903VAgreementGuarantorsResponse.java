
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="A1903V_AgreementGuarantorsResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}AgreementGuarantorsExport" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "a1903VAgreementGuarantorsResult"
})
@XmlRootElement(name = "A1903V_AgreementGuarantorsResponse")
public class A1903VAgreementGuarantorsResponse {

    @XmlElement(name = "A1903V_AgreementGuarantorsResult")
    protected AgreementGuarantorsExport a1903VAgreementGuarantorsResult;

    /**
     * Gets the value of the a1903VAgreementGuarantorsResult property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementGuarantorsExport }
     *     
     */
    public AgreementGuarantorsExport getA1903VAgreementGuarantorsResult() {
        return a1903VAgreementGuarantorsResult;
    }

    /**
     * Sets the value of the a1903VAgreementGuarantorsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementGuarantorsExport }
     *     
     */
    public void setA1903VAgreementGuarantorsResult(AgreementGuarantorsExport value) {
        this.a1903VAgreementGuarantorsResult = value;
    }

}
