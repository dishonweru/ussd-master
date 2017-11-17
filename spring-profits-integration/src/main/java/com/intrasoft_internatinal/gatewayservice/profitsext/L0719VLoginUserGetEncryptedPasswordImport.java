
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0719V_LoginUserGetEncryptedPasswordImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0719V_LoginUserGetEncryptedPasswordImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsercodeUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0719V_LoginUserGetEncryptedPasswordImport", propOrder = {
    "command",
    "inCommandIefSuppliedCommand",
    "inTrxUnitCode",
    "inTrxUsrCode",
    "inUsercodeUsrCode"
})
public class L0719VLoginUserGetEncryptedPasswordImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InCommandIefSuppliedCommand")
    protected String inCommandIefSuppliedCommand;
    @XmlElement(name = "InTrxUnitCode")
    protected int inTrxUnitCode;
    @XmlElement(name = "InTrxUsrCode")
    protected String inTrxUsrCode;
    @XmlElement(name = "InUsercodeUsrCode")
    protected String inUsercodeUsrCode;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the inCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCommandIefSuppliedCommand() {
        return inCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the inCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCommandIefSuppliedCommand(String value) {
        this.inCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inTrxUnitCode property.
     * 
     */
    public int getInTrxUnitCode() {
        return inTrxUnitCode;
    }

    /**
     * Sets the value of the inTrxUnitCode property.
     * 
     */
    public void setInTrxUnitCode(int value) {
        this.inTrxUnitCode = value;
    }

    /**
     * Gets the value of the inTrxUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxUsrCode() {
        return inTrxUsrCode;
    }

    /**
     * Sets the value of the inTrxUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxUsrCode(String value) {
        this.inTrxUsrCode = value;
    }

    /**
     * Gets the value of the inUsercodeUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsercodeUsrCode() {
        return inUsercodeUsrCode;
    }

    /**
     * Sets the value of the inUsercodeUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsercodeUsrCode(String value) {
        this.inUsercodeUsrCode = value;
    }

}
