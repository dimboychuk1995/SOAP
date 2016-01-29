
package test;

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
@WebServiceClient(name = "ZPERSON_COMMUNIC", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style", wsdlLocation = "http://erp-prd:8000/sap/bc/srt/wsdl/bndg_E27B27B1F20843F180E3005056C00008/wsdl11/allinone/standard/document?sap-client=500")
public class ZPERSON_COMMUNIC2
    extends Service
{

    private final static URL ZPERSONCOMMUNIC_WSDL_LOCATION;
    private final static WebServiceException ZPERSONCOMMUNIC_EXCEPTION;
    private final static QName ZPERSONCOMMUNIC_QNAME = new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZPERSON_COMMUNIC");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://erp-prd:8000/sap/bc/srt/wsdl/bndg_E27B27B1F20843F180E3005056C00008/wsdl11/allinone/standard/document?sap-client=500");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ZPERSONCOMMUNIC_WSDL_LOCATION = url;
        ZPERSONCOMMUNIC_EXCEPTION = e;
    }

    public ZPERSON_COMMUNIC2() {
        super(__getWsdlLocation(), ZPERSONCOMMUNIC_QNAME);
    }

    public ZPERSON_COMMUNIC2(WebServiceFeature... features) {
        super(__getWsdlLocation(), ZPERSONCOMMUNIC_QNAME, features);
    }

    public ZPERSON_COMMUNIC2(URL wsdlLocation) {
        super(wsdlLocation, ZPERSONCOMMUNIC_QNAME);
    }

    public ZPERSON_COMMUNIC2(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ZPERSONCOMMUNIC_QNAME, features);
    }

    public ZPERSON_COMMUNIC2(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ZPERSON_COMMUNIC2(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ZpersonCommunic
     */
    @WebEndpoint(name = "ZPERSON_COMMUNIC")
    public ZpersonCommunic getZPERSONCOMMUNIC() {
        return super.getPort(new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZPERSON_COMMUNIC"), ZpersonCommunic.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ZpersonCommunic
     */
    @WebEndpoint(name = "ZPERSON_COMMUNIC")
    public ZpersonCommunic getZPERSONCOMMUNIC(WebServiceFeature... features) {
        return super.getPort(new QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZPERSON_COMMUNIC"), ZpersonCommunic.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ZPERSONCOMMUNIC_EXCEPTION!= null) {
            throw ZPERSONCOMMUNIC_EXCEPTION;
        }
        return ZPERSONCOMMUNIC_WSDL_LOCATION;
    }

}
