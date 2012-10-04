
package nz.co.aetheric.magus.ioun;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="GetOfficialContentResult" type="{http://schemas.datacontract.org/2004/07/WotC.ContentVault}ArrayOfContentInfo" minOccurs="0"/>
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
    "getOfficialContentResult"
})
@XmlRootElement(name = "GetOfficialContentResponse")
public class GetOfficialContentResponse {

    @XmlElementRef(name = "GetOfficialContentResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfContentInfo> getOfficialContentResult;

    /**
     * Gets the value of the getOfficialContentResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContentInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfContentInfo> getGetOfficialContentResult() {
        return getOfficialContentResult;
    }

    /**
     * Sets the value of the getOfficialContentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContentInfo }{@code >}
     *     
     */
    public void setGetOfficialContentResult(JAXBElement<ArrayOfContentInfo> value) {
        this.getOfficialContentResult = value;
    }

}
