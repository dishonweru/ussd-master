
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInGrpCustcatC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInGrpCustcatC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpCustcatC" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}InGrpCustcatC" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInGrpCustcatC", propOrder = {
    "inGrpCustcatC"
})
public class ArrayOfInGrpCustcatC {

    @XmlElement(name = "InGrpCustcatC")
    protected List<InGrpCustcatC> inGrpCustcatC;

    /**
     * Gets the value of the inGrpCustcatC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inGrpCustcatC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInGrpCustcatC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InGrpCustcatC }
     * 
     * 
     */
    public List<InGrpCustcatC> getInGrpCustcatC() {
        if (inGrpCustcatC == null) {
            inGrpCustcatC = new ArrayList<InGrpCustcatC>();
        }
        return this.inGrpCustcatC;
    }

}
