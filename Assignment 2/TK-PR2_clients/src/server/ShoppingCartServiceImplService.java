
package server;

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
@WebServiceClient(name = "ShoppingCartServiceImplService", targetNamespace = "http://server/", wsdlLocation = "http://localhost:8090/ws/cart/?wsdl")
public class ShoppingCartServiceImplService
    extends Service
{

    private final static URL SHOPPINGCARTSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SHOPPINGCARTSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName SHOPPINGCARTSERVICEIMPLSERVICE_QNAME = new QName("http://server/", "ShoppingCartServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8090/ws/cart/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SHOPPINGCARTSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        SHOPPINGCARTSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public ShoppingCartServiceImplService() {
        super(__getWsdlLocation(), SHOPPINGCARTSERVICEIMPLSERVICE_QNAME);
    }

    public ShoppingCartServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SHOPPINGCARTSERVICEIMPLSERVICE_QNAME, features);
    }

    public ShoppingCartServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SHOPPINGCARTSERVICEIMPLSERVICE_QNAME);
    }

    public ShoppingCartServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SHOPPINGCARTSERVICEIMPLSERVICE_QNAME, features);
    }

    public ShoppingCartServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ShoppingCartServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ShoppingCartService
     */
    @WebEndpoint(name = "ShoppingCartServiceImplPort")
    public ShoppingCartService getShoppingCartServiceImplPort() {
        return super.getPort(new QName("http://server/", "ShoppingCartServiceImplPort"), ShoppingCartService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ShoppingCartService
     */
    @WebEndpoint(name = "ShoppingCartServiceImplPort")
    public ShoppingCartService getShoppingCartServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server/", "ShoppingCartServiceImplPort"), ShoppingCartService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SHOPPINGCARTSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw SHOPPINGCARTSERVICEIMPLSERVICE_EXCEPTION;
        }
        return SHOPPINGCARTSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
