
package nz.co.aetheric.magus.ioun;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UriContentBlob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UriContentBlob">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WotC.ContentVault}ContentBlob">
 *       &lt;sequence>
 *         &lt;element name="ContentUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UriContentBlob", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", propOrder = {
    "contentUri"
})
public class UriContentBlob
    extends ContentBlob
{

    @XmlElementRef(name = "ContentUri", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contentUri;

    /**
     * Gets the value of the contentUri property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContentUri() {
        return contentUri;
    }

    /**
     * Sets the value of the contentUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContentUri(JAXBElement<String> value) {
        this.contentUri = value;
    }

}
