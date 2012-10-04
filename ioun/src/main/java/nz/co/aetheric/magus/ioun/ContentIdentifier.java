
package nz.co.aetheric.magus.ioun;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Official" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OfficialTypeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScratchID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TypeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentIdentifier", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", propOrder = {
    "contentID",
    "official",
    "officialTypeID",
    "scratchID",
    "typeID"
})
public class ContentIdentifier {

    @XmlElementRef(name = "ContentID", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> contentID;
    @XmlElement(name = "Official")
    protected Boolean official;
    @XmlElementRef(name = "OfficialTypeID", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> officialTypeID;
    @XmlElementRef(name = "ScratchID", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scratchID;
    @XmlElement(name = "TypeID")
    protected Integer typeID;

    /**
     * Gets the value of the contentID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getContentID() {
        return contentID;
    }

    /**
     * Sets the value of the contentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setContentID(JAXBElement<Integer> value) {
        this.contentID = value;
    }

    /**
     * Gets the value of the official property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfficial() {
        return official;
    }

    /**
     * Sets the value of the official property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfficial(Boolean value) {
        this.official = value;
    }

    /**
     * Gets the value of the officialTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOfficialTypeID() {
        return officialTypeID;
    }

    /**
     * Sets the value of the officialTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOfficialTypeID(JAXBElement<Integer> value) {
        this.officialTypeID = value;
    }

    /**
     * Gets the value of the scratchID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScratchID() {
        return scratchID;
    }

    /**
     * Sets the value of the scratchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScratchID(JAXBElement<Integer> value) {
        this.scratchID = value;
    }

    /**
     * Gets the value of the typeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeID() {
        return typeID;
    }

    /**
     * Sets the value of the typeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeID(Integer value) {
        this.typeID = value;
    }

}
