
package nz.co.aetheric.magus.ioun;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentifierWithVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentifierWithVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://schemas.datacontract.org/2004/07/WotC.ContentVault}ContentIdentifier" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierWithVersion", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", propOrder = {
    "identifier",
    "version"
})
public class IdentifierWithVersion {

    @XmlElementRef(name = "Identifier", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", type = JAXBElement.class, required = false)
    protected JAXBElement<ContentIdentifier> identifier;
    @XmlElementRef(name = "Version", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> version;

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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setVersion(JAXBElement<byte[]> value) {
        this.version = value;
    }

}
