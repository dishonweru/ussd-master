
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
 *         &lt;element name="import" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}PAR29V_SynchronizeBanksImport" minOccurs="0"/>
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
@XmlRootElement(name = "PAR29V_SynchronizeBanks")
public class PAR29VSynchronizeBanks {

    @XmlElement(name = "import")
    protected PAR29VSynchronizeBanksImport _import;
    protected ExtExecParameters executionParameters;

    /**
     * Gets the value of the import property.
     * 
     * @return
     *     possible object is
     *     {@link PAR29VSynchronizeBanksImport }
     *     
     */
    public PAR29VSynchronizeBanksImport getImport() {
        return _import;
    }

    /**
     * Sets the value of the import property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAR29VSynchronizeBanksImport }
     *     
     */
    public void setImport(PAR29VSynchronizeBanksImport value) {
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
