
package nz.co.aetheric.magus.ioun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TooMuchScratchFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TooMuchScratchFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxAllowed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TooMuchScratchFault", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentManagement", propOrder = {
    "contentType",
    "maxAllowed"
})
public class TooMuchScratchFault {

    @XmlElement(name = "ContentType")
    protected Integer contentType;
    @XmlElement(name = "MaxAllowed")
    protected Integer maxAllowed;

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContentType(Integer value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the maxAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAllowed() {
        return maxAllowed;
    }

    /**
     * Sets the value of the maxAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAllowed(Integer value) {
        this.maxAllowed = value;
    }

}
