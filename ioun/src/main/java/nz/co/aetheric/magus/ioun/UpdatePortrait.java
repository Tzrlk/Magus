
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
 *         &lt;element name="id" type="{http://schemas.datacontract.org/2004/07/WotC.ContentVault}ContentIdentifier" minOccurs="0"/>
 *         &lt;element name="portrait" type="{http://schemas.datacontract.org/2004/07/WotC.ContentVault}ContentBlob" minOccurs="0"/>
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
    "id",
    "portrait"
})
@XmlRootElement(name = "UpdatePortrait")
public class UpdatePortrait {

    @XmlElementRef(name = "id", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ContentIdentifier> id;
    @XmlElementRef(name = "portrait", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ContentBlob> portrait;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}
     *     
     */
    public JAXBElement<ContentIdentifier> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}
     *     
     */
    public void setId(JAXBElement<ContentIdentifier> value) {
        this.id = value;
    }

    /**
     * Gets the value of the portrait property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentBlob }{@code >}
     *     
     */
    public JAXBElement<ContentBlob> getPortrait() {
        return portrait;
    }

    /**
     * Sets the value of the portrait property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentBlob }{@code >}
     *     
     */
    public void setPortrait(JAXBElement<ContentBlob> value) {
        this.portrait = value;
    }

}
