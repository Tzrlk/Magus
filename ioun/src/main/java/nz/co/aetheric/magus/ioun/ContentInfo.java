
package nz.co.aetheric.magus.ioun;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommittedContent" type="{http://schemas.datacontract.org/2004/07/WotC.ContentVault}ContentDetails" minOccurs="0"/>
 *         &lt;element name="OwnerID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="Rights" type="{http://schemas.datacontract.org/2004/07/WotC.ContentManagement}UserContentRights" minOccurs="0"/>
 *         &lt;element name="ScratchContents" type="{http://schemas.datacontract.org/2004/07/WotC.ContentVault}ArrayOfContentDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentInfo", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", propOrder = {
    "committedContent",
    "ownerID",
    "rights",
    "scratchContents"
})
public class ContentInfo {

    @XmlElementRef(name = "CommittedContent", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", type = JAXBElement.class, required = false)
    protected JAXBElement<ContentDetails> committedContent;
    @XmlElement(name = "OwnerID")
    protected String ownerID;
    @XmlElement(name = "Rights")
    protected UserContentRights rights;
    @XmlElementRef(name = "ScratchContents", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfContentDetails> scratchContents;

    /**
     * Gets the value of the committedContent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentDetails }{@code >}
     *     
     */
    public JAXBElement<ContentDetails> getCommittedContent() {
        return committedContent;
    }

    /**
     * Sets the value of the committedContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentDetails }{@code >}
     *     
     */
    public void setCommittedContent(JAXBElement<ContentDetails> value) {
        this.committedContent = value;
    }

    /**
     * Gets the value of the ownerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerID() {
        return ownerID;
    }

    /**
     * Sets the value of the ownerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerID(String value) {
        this.ownerID = value;
    }

    /**
     * Gets the value of the rights property.
     * 
     * @return
     *     possible object is
     *     {@link UserContentRights }
     *     
     */
    public UserContentRights getRights() {
        return rights;
    }

    /**
     * Sets the value of the rights property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserContentRights }
     *     
     */
    public void setRights(UserContentRights value) {
        this.rights = value;
    }

    /**
     * Gets the value of the scratchContents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContentDetails }{@code >}
     *     
     */
    public JAXBElement<ArrayOfContentDetails> getScratchContents() {
        return scratchContents;
    }

    /**
     * Sets the value of the scratchContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfContentDetails }{@code >}
     *     
     */
    public void setScratchContents(JAXBElement<ArrayOfContentDetails> value) {
        this.scratchContents = value;
    }

}
