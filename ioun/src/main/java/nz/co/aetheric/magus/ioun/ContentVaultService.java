
package nz.co.aetheric.magus.ioun;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ContentVaultService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://ioun.wizards.com/ContentVault.svc?wsdl")
public class ContentVaultService
    extends Service
{

    private final static URL CONTENTVAULTSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONTENTVAULTSERVICE_EXCEPTION;
    private final static QName CONTENTVAULTSERVICE_QNAME = new QName("http://tempuri.org/", "ContentVaultService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ioun.wizards.com/ContentVault.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONTENTVAULTSERVICE_WSDL_LOCATION = url;
        CONTENTVAULTSERVICE_EXCEPTION = e;
    }

    public ContentVaultService() {
        super(__getWsdlLocation(), CONTENTVAULTSERVICE_QNAME);
    }

    public ContentVaultService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONTENTVAULTSERVICE_QNAME, features);
    }

    public ContentVaultService(URL wsdlLocation) {
        super(wsdlLocation, CONTENTVAULTSERVICE_QNAME);
    }

    public ContentVaultService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONTENTVAULTSERVICE_QNAME, features);
    }

    public ContentVaultService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ContentVaultService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IContentVaultService
     */
    @WebEndpoint(name = "CustomBinding_IContentVaultService")
    public IContentVaultService getCustomBindingIContentVaultService() {
        return super.getPort(new QName("http://tempuri.org/", "CustomBinding_IContentVaultService"), IContentVaultService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IContentVaultService
     */
    @WebEndpoint(name = "CustomBinding_IContentVaultService")
    public IContentVaultService getCustomBindingIContentVaultService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "CustomBinding_IContentVaultService"), IContentVaultService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONTENTVAULTSERVICE_EXCEPTION!= null) {
            throw CONTENTVAULTSERVICE_EXCEPTION;
        }
        return CONTENTVAULTSERVICE_WSDL_LOCATION;
    }

}
