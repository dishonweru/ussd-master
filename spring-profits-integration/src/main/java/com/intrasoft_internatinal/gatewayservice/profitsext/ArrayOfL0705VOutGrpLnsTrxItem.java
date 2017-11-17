
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfL0705VOutGrpLnsTrxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfL0705VOutGrpLnsTrxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="L0705VOutGrpLnsTrxItem" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0705VOutGrpLnsTrxItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfL0705VOutGrpLnsTrxItem", propOrder = {
    "l0705VOutGrpLnsTrxItem"
})
public class ArrayOfL0705VOutGrpLnsTrxItem {

    @XmlElement(name = "L0705VOutGrpLnsTrxItem")
    protected List<L0705VOutGrpLnsTrxItem> l0705VOutGrpLnsTrxItem;

    /**
     * Gets the value of the l0705VOutGrpLnsTrxItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the l0705VOutGrpLnsTrxItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL0705VOutGrpLnsTrxItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L0705VOutGrpLnsTrxItem }
     * 
     * 
     */
    public List<L0705VOutGrpLnsTrxItem> getL0705VOutGrpLnsTrxItem() {
        if (l0705VOutGrpLnsTrxItem == null) {
            l0705VOutGrpLnsTrxItem = new ArrayList<L0705VOutGrpLnsTrxItem>();
        }
        return this.l0705VOutGrpLnsTrxItem;
    }

}
