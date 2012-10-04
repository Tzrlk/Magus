
package nz.co.aetheric.magus.ioun;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataWithVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataWithVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Data" type="{http://schemas.datacontract.org/2004/07/WotC.ContentVault}ContentBlob" minOccurs="0"/>
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
@XmlType(name = "DataWithVersion", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", propOrder = {
    "data",
    "version"
})
public class DataWithVersion {

    @XmlElementRef(name = "Data", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", type = JAXBElement.class, required = false)
    protected JAXBElement<ContentBlob> data;
    @XmlElementRef(name = "Version", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentVault", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> version;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContentBlob }{@code >}
     *     
     */
    public JAXBElement<ContentBlob> getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContentBlob }{@code >}
     *     
     */
    public void setData(JAXBElement<ContentBlob> value) {
        this.data = value;
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
