
package test1;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ZPOSADY_LIST", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style", wsdlLocation = "http://erp-prd:8000/sap/bc/srt/wsdl/bndg_E27AAB81625B5EF180E3005056C00008/wsdl11/allinone/standard/document?sap-client=500")
public class ZPOSADY_LIST2
    extends Service
{

    private final static URL ZPOSADYLIST_WSDL_LOCATION;
    private final static WebServiceException ZPOSADYLIST_EXCEPTION;
    private final static QName ZPOSADYLIST_QNAME = new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZPOSADY_LIST");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://erp-prd:8000/sap/bc/srt/wsdl/bndg_E27AAB81625B5EF180E3005056C00008/wsdl11/allinone/standard/document?sap-client=500");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ZPOSADYLIST_WSDL_LOCATION = url;
        ZPOSADYLIST_EXCEPTION = e;
    }

    public ZPOSADY_LIST2() {
        super(__getWsdlLocation(), ZPOSADYLIST_QNAME);
    }

    public ZPOSADY_LIST2(WebServiceFeature... features) {
        super(__getWsdlLocation(), ZPOSADYLIST_QNAME, features);
    }

    public ZPOSADY_LIST2(URL wsdlLocation) {
        super(wsdlLocation, ZPOSADYLIST_QNAME);
    }

    public ZPOSADY_LIST2(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ZPOSADYLIST_QNAME, features);
    }

    public ZPOSADY_LIST2(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ZPOSADY_LIST2(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns zposady_list1
     */
    @WebEndpoint(name = "ZPOSADY_LIST")
    public zposady_list1 getZPOSADYLIST() {
        return super.getPort(new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZPOSADY_LIST"), zposady_list1.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns zposady_list1
     */
    @WebEndpoint(name = "ZPOSADY_LIST")
    public zposady_list1 getZPOSADYLIST(WebServiceFeature... features) {
        return super.getPort(new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZPOSADY_LIST"), zposady_list1.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ZPOSADYLIST_EXCEPTION!= null) {
            throw ZPOSADYLIST_EXCEPTION;
        }
        return ZPOSADYLIST_WSDL_LOCATION;
    }

}
