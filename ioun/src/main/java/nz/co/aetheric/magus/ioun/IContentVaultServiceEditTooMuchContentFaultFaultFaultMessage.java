
package nz.co.aetheric.magus.ioun;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "TooMuchContentFault", targetNamespace = "http://schemas.datacontract.org/2004/07/WotC.ContentManagement")
public class IContentVaultServiceEditTooMuchContentFaultFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private TooMuchContentFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public IContentVaultServiceEditTooMuchContentFaultFaultFaultMessage(String message, TooMuchContentFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public IContentVaultServiceEditTooMuchContentFaultFaultFaultMessage(String message, TooMuchContentFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: nz.co.aetheric.magus.ioun.TooMuchContentFault
     */
    public TooMuchContentFault getFaultInfo() {
        return faultInfo;
    }

}
