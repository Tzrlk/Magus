
package nz.co.aetheric.magus.ioun;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentTypeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DateModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Identifier" type="{http://schemas.datacontract.org/2004/07/WotC.ContentVault}ContentIdentifier" minOccurs="0"/>
 *         &lt;element name="Portrait" type="{http://schemas.datacontract.org/2004/07/WotC.ContentVault}ContentBlob" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentDetails", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", propOrder = {
    "contentTypeID",
    "dateCreated",
    "dateModified",
    "details",
    "identifier",
    "portrait"
})
public class ContentDetails {

    @XmlElement(name = "ContentTypeID")
    protected Integer contentTypeID;
    @XmlElement(name = "DateCreated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlElement(name = "DateModified")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateModified;
    @XmlElementRef(name = "Details", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", type = JAXBElement.class, required = false)
    protected JAXBElement<String> details;
    @XmlElementRef(name = "Identifier", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", type = JAXBElement.class, required = false)
    protected JAXBElement<ContentIdentifier> identifier;
    @XmlElementRef(name = "Portrait", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", type = JAXBElement.class, required = false)
    protected JAXBElement<ContentBlob> portrait;

    /**
     * Gets the value of the contentTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContentTypeID() {
        return contentTypeID;
    }

    /**
     * Sets the value of the contentTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContentTypeID(Integer value) {
        this.contentTypeID = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the dateModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateModified() {
        return dateModified;
    }

    /**
     * Sets the value of the dateModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateModified(XMLGregorianCalendar value) {
        this.dateModified = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDetails(JAXBElement<String> value) {
        this.details = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}
     *     
     */
    public JAXBElement<ContentIdentifier> getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentIdentifier }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<ContentIdentifier> value) {
        this.identifier = value;
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
