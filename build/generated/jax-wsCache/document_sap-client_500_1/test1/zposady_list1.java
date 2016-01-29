
package test1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "zposady_list", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface zposady_list1 {


    /**
     * 
     * @param posadyList
     * @return
     *     returns test1.Bapiret2
     */
    @WebMethod(operationName = "ZPosadyList")
    @WebResult(name = "Return", targetNamespace = "")
    @RequestWrapper(localName = "ZPosadyList", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style", className = "test1.ZPosadyList")
    @ResponseWrapper(localName = "ZPosadyListResponse", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style", className = "test1.ZPosadyListResponse")
    public Bapiret2 zPosadyList(
        @WebParam(name = "PosadyList", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<TableOfBapiObjec> posadyList);

}