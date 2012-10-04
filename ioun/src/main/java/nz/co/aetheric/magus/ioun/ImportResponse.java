
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
 *         &lt;element name="ImportResult" type="{http://schemas.datacontract.org/2004/07/WotC.ContentVault}IdentifierWithVersion" minOccurs="0"/>
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
    "importResult"
})
@XmlRootElement(name = "ImportResponse")
public class ImportResponse {

    @XmlElementRef(name = "ImportResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<IdentifierWithVersion> importResult;

    /**
     * Gets the value of the importResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdentifierWithVersion }{@code >}
     *     
     */
    public JAXBElement<IdentifierWithVersion> getImportResult() {
        return importResult;
    }

    /**
     * Sets the value of the importResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdentifierWithVersion }{@code >}
     *     
     */
    public void setImportResult(JAXBElement<IdentifierWithVersion> value) {
        this.importResult = value;
    }

}
