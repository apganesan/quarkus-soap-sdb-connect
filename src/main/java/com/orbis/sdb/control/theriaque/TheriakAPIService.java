package com.orbis.sdb.control.theriaque;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;

/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 *
 */
@WebServiceClient(name = "theriakAPIService", targetNamespace = "http://www.ws-theriaque.localhost/server.php", wsdlLocation = "file:/home/orbisu/workspace/poc/quarkus-soap-sdb-connect/src/main/resources/theriaque.wsdl")
public class TheriakAPIService
        extends Service {

    private static final URL THERIAKAPISERVICE_WSDL_LOCATION;
    private static final WebServiceException THERIAKAPISERVICE_EXCEPTION;
    private static final QName THERIAKAPISERVICE_QNAME = new QName("http://www.ws-theriaque.localhost/server.php", "theriakAPIService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/orbisu/workspace/poc/quarkus-soap-sdb-connect/src/main/resources/theriaque.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        THERIAKAPISERVICE_WSDL_LOCATION = url;
        THERIAKAPISERVICE_EXCEPTION = e;
    }

    public TheriakAPIService() {
        super(__getWsdlLocation(), THERIAKAPISERVICE_QNAME);
    }

    public TheriakAPIService(WebServiceFeature... features) {
        super(__getWsdlLocation(), THERIAKAPISERVICE_QNAME, features);
    }

    public TheriakAPIService(URL wsdlLocation) {
        super(wsdlLocation, THERIAKAPISERVICE_QNAME);
    }

    public TheriakAPIService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, THERIAKAPISERVICE_QNAME, features);
    }

    public TheriakAPIService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TheriakAPIService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    private static URL __getWsdlLocation() {
        if (THERIAKAPISERVICE_EXCEPTION != null) {
            throw THERIAKAPISERVICE_EXCEPTION;
        }
        return THERIAKAPISERVICE_WSDL_LOCATION;
    }

    /**
     *
     * @return
     *     returns TheriakAPIPort
     */
    @WebEndpoint(name = "theriakAPIPort")
    public TheriakAPIPort getTheriakAPIPort() {
        return super.getPort(new QName("http://www.ws-theriaque.localhost/server.php", "theriakAPIPort"), TheriakAPIPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TheriakAPIPort
     */
    @WebEndpoint(name = "theriakAPIPort")
    public TheriakAPIPort getTheriakAPIPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.ws-theriaque.localhost/server.php", "theriakAPIPort"), TheriakAPIPort.class, features);
    }

}
