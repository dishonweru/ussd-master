
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
 *         &lt;element name="import" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0158VDrawdownRequestMaintenaceImport" minOccurs="0"/>
 *         &lt;element name="executionParameters" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ExtExecParameters" minOccurs="0"/>
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
    "_import",
    "executionParameters"
})
@XmlRootElement(name = "I0158V_DrawdownRequestMaintenace")
public class I0158VDrawdownRequestMaintenace {

    @XmlElement(name = "import")
    protected I0158VDrawdownRequestMaintenaceImport _import;
    protected ExtExecParameters executionParameters;

    /**
     * Gets the value of the import property.
     * 
     * @return
     *     possible object is
     *     {@link I0158VDrawdownRequestMaintenaceImport }
     *     
     */
    public I0158VDrawdownRequestMaintenaceImport getImport() {
        return _import;
    }

    /**
     * Sets the value of the import property.
     * 
     * @param value
     *     allowed object is
     *     {@link I0158VDrawdownRequestMaintenaceImport }
     *     
     */
    public void setImport(I0158VDrawdownRequestMaintenaceImport value) {
        this._import = value;
    }

    /**
     * Gets the value of the executionParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ExtExecParameters }
     *     
     */
    public ExtExecParameters getExecutionParameters() {
        return executionParameters;
    }

    /**
     * Sets the value of the executionParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtExecParameters }
     *     
     */
    public void setExecutionParameters(ExtExecParameters value) {
        this.executionParameters = value;
    }

}
