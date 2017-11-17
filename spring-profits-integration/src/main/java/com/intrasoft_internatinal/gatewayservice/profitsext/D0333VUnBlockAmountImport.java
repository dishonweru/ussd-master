
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for D0333VUnBlockAmountImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D0333VUnBlockAmountImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBlockTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InBlockTransactionEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBlockTransactionExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBlockTransactionTrxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InBlockTransactionTrxUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBlockTransactionTrxUsr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBlockTransactionTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPartialIefSuppliedPartial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSupervisorsTeamInformationSuper1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSupervisorsTeamInformationSuper2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InUsedInputCharSuppliedChar37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InWebRefNoIefSuppliedText40" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D0333VUnBlockAmountImport", propOrder = {
    "command",
    "profitsAccountNumber",
    "profitsAccountCd",
    "inAuthorGrantedIefSuppliedFlag",
    "inBlockTransactionAmount",
    "inBlockTransactionEntryComments",
    "inBlockTransactionExpiryDate",
    "inBlockTransactionTrxDate",
    "inBlockTransactionTrxUnit",
    "inBlockTransactionTrxUsr",
    "inBlockTransactionTrxUsrSn",
    "inPartialIefSuppliedPartial",
    "inJustificIdJustific",
    "inPrftTransactionIdTransact",
    "inParametersInTerminalTerminalNumber",
    "inSupervisorsTeamInformationSuper1Code",
    "inSupervisorsTeamInformationSuper2Code",
    "inUsedInputCharSuppliedChar37",
    "inWebRefNoIefSuppliedText40"
})
public class D0333VUnBlockAmountImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "InAuthorGrantedIefSuppliedFlag")
    protected String inAuthorGrantedIefSuppliedFlag;
    @XmlElement(name = "InBlockTransactionAmount", required = true)
    protected BigDecimal inBlockTransactionAmount;
    @XmlElement(name = "InBlockTransactionEntryComments")
    protected String inBlockTransactionEntryComments;
    @XmlElement(name = "InBlockTransactionExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBlockTransactionExpiryDate;
    @XmlElement(name = "InBlockTransactionTrxDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inBlockTransactionTrxDate;
    @XmlElement(name = "InBlockTransactionTrxUnit")
    protected int inBlockTransactionTrxUnit;
    @XmlElement(name = "InBlockTransactionTrxUsr")
    protected String inBlockTransactionTrxUsr;
    @XmlElement(name = "InBlockTransactionTrxUsrSn")
    protected int inBlockTransactionTrxUsrSn;
    @XmlElement(name = "InPartialIefSuppliedPartial")
    protected String inPartialIefSuppliedPartial;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InSupervisorsTeamInformationSuper1Code")
    protected String inSupervisorsTeamInformationSuper1Code;
    @XmlElement(name = "InSupervisorsTeamInformationSuper2Code")
    protected String inSupervisorsTeamInformationSuper2Code;
    @XmlElement(name = "InUsedInputCharSuppliedChar37")
    protected String inUsedInputCharSuppliedChar37;
    @XmlElement(name = "InWebRefNoIefSuppliedText40")
    protected String inWebRefNoIefSuppliedText40;

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
     * Gets the value of the profitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitsAccountNumber() {
        return profitsAccountNumber;
    }

    /**
     * Sets the value of the profitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitsAccountNumber(String value) {
        this.profitsAccountNumber = value;
    }

    /**
     * Gets the value of the profitsAccountCd property.
     * 
     */
    public short getProfitsAccountCd() {
        return profitsAccountCd;
    }

    /**
     * Sets the value of the profitsAccountCd property.
     * 
     */
    public void setProfitsAccountCd(short value) {
        this.profitsAccountCd = value;
    }

    /**
     * Gets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthorGrantedIefSuppliedFlag() {
        return inAuthorGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthorGrantedIefSuppliedFlag(String value) {
        this.inAuthorGrantedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inBlockTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInBlockTransactionAmount() {
        return inBlockTransactionAmount;
    }

    /**
     * Sets the value of the inBlockTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInBlockTransactionAmount(BigDecimal value) {
        this.inBlockTransactionAmount = value;
    }

    /**
     * Gets the value of the inBlockTransactionEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBlockTransactionEntryComments() {
        return inBlockTransactionEntryComments;
    }

    /**
     * Sets the value of the inBlockTransactionEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBlockTransactionEntryComments(String value) {
        this.inBlockTransactionEntryComments = value;
    }

    /**
     * Gets the value of the inBlockTransactionExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBlockTransactionExpiryDate() {
        return inBlockTransactionExpiryDate;
    }

    /**
     * Sets the value of the inBlockTransactionExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBlockTransactionExpiryDate(XMLGregorianCalendar value) {
        this.inBlockTransactionExpiryDate = value;
    }

    /**
     * Gets the value of the inBlockTransactionTrxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInBlockTransactionTrxDate() {
        return inBlockTransactionTrxDate;
    }

    /**
     * Sets the value of the inBlockTransactionTrxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInBlockTransactionTrxDate(XMLGregorianCalendar value) {
        this.inBlockTransactionTrxDate = value;
    }

    /**
     * Gets the value of the inBlockTransactionTrxUnit property.
     * 
     */
    public int getInBlockTransactionTrxUnit() {
        return inBlockTransactionTrxUnit;
    }

    /**
     * Sets the value of the inBlockTransactionTrxUnit property.
     * 
     */
    public void setInBlockTransactionTrxUnit(int value) {
        this.inBlockTransactionTrxUnit = value;
    }

    /**
     * Gets the value of the inBlockTransactionTrxUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBlockTransactionTrxUsr() {
        return inBlockTransactionTrxUsr;
    }

    /**
     * Sets the value of the inBlockTransactionTrxUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBlockTransactionTrxUsr(String value) {
        this.inBlockTransactionTrxUsr = value;
    }

    /**
     * Gets the value of the inBlockTransactionTrxUsrSn property.
     * 
     */
    public int getInBlockTransactionTrxUsrSn() {
        return inBlockTransactionTrxUsrSn;
    }

    /**
     * Sets the value of the inBlockTransactionTrxUsrSn property.
     * 
     */
    public void setInBlockTransactionTrxUsrSn(int value) {
        this.inBlockTransactionTrxUsrSn = value;
    }

    /**
     * Gets the value of the inPartialIefSuppliedPartial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPartialIefSuppliedPartial() {
        return inPartialIefSuppliedPartial;
    }

    /**
     * Sets the value of the inPartialIefSuppliedPartial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPartialIefSuppliedPartial(String value) {
        this.inPartialIefSuppliedPartial = value;
    }

    /**
     * Gets the value of the inJustificIdJustific property.
     * 
     */
    public int getInJustificIdJustific() {
        return inJustificIdJustific;
    }

    /**
     * Sets the value of the inJustificIdJustific property.
     * 
     */
    public void setInJustificIdJustific(int value) {
        this.inJustificIdJustific = value;
    }

    /**
     * Gets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public int getInPrftTransactionIdTransact() {
        return inPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public void setInPrftTransactionIdTransact(int value) {
        this.inPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInTerminalTerminalNumber() {
        return inParametersInTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInTerminalTerminalNumber(String value) {
        this.inParametersInTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inSupervisorsTeamInformationSuper1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSupervisorsTeamInformationSuper1Code() {
        return inSupervisorsTeamInformationSuper1Code;
    }

    /**
     * Sets the value of the inSupervisorsTeamInformationSuper1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSupervisorsTeamInformationSuper1Code(String value) {
        this.inSupervisorsTeamInformationSuper1Code = value;
    }

    /**
     * Gets the value of the inSupervisorsTeamInformationSuper2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSupervisorsTeamInformationSuper2Code() {
        return inSupervisorsTeamInformationSuper2Code;
    }

    /**
     * Sets the value of the inSupervisorsTeamInformationSuper2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSupervisorsTeamInformationSuper2Code(String value) {
        this.inSupervisorsTeamInformationSuper2Code = value;
    }

    /**
     * Gets the value of the inUsedInputCharSuppliedChar37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUsedInputCharSuppliedChar37() {
        return inUsedInputCharSuppliedChar37;
    }

    /**
     * Sets the value of the inUsedInputCharSuppliedChar37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUsedInputCharSuppliedChar37(String value) {
        this.inUsedInputCharSuppliedChar37 = value;
    }

    /**
     * Gets the value of the inWebRefNoIefSuppliedText40 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInWebRefNoIefSuppliedText40() {
        return inWebRefNoIefSuppliedText40;
    }

    /**
     * Sets the value of the inWebRefNoIefSuppliedText40 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInWebRefNoIefSuppliedText40(String value) {
        this.inWebRefNoIefSuppliedText40 = value;
    }

}
