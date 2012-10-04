
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
 *         &lt;element name="CommitResult" type="{http://schemas.datacontract.org/2004/07/WotC.ContentVault}IdentifierWithVersion" minOccurs="0"/>
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
    "commitResult"
})
@XmlRootElement(name = "CommitResponse")
public class CommitResponse {

    @XmlElementRef(name = "CommitResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<IdentifierWithVersion> commitResult;

    /**
     * Gets the value of the commitResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdentifierWithVersion }{@code >}
     *     
     */
    public JAXBElement<IdentifierWithVersion> getCommitResult() {
        return commitResult;
    }

    /**
     * Sets the value of the commitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdentifierWithVersion }{@code >}
     *     
     */
    public void setCommitResult(JAXBElement<IdentifierWithVersion> value) {
        this.commitResult = value;
    }

}
