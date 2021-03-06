//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package pe.com.bbva.scepe20.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "SCE_PE20_Service", targetNamespace = "http://grupobbva.com.pe/sce/pe20/", wsdlLocation = "META-INF/wsdl/SCE_PE20Service.wsdl")
public class SCEPE20Service
    extends Service
{

    private final static URL SCEPE20SERVICE_WSDL_LOCATION;
    private final static WebServiceException SCEPE20SERVICE_EXCEPTION;
    private final static QName SCEPE20SERVICE_QNAME = new QName("http://grupobbva.com.pe/sce/pe20/", "SCE_PE20_Service");

    static {
            SCEPE20SERVICE_WSDL_LOCATION = pe.com.bbva.scepe20.client.SCEPE20Service.class.getResource("/META-INF/wsdl/SCE_PE20Service.wsdl");
        WebServiceException e = null;
        if (SCEPE20SERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/SCE_PE20Service.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        SCEPE20SERVICE_EXCEPTION = e;
    }

    public SCEPE20Service() {
        super(__getWsdlLocation(), SCEPE20SERVICE_QNAME);
    }

    public SCEPE20Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SCEPE20SERVICE_QNAME, features);
    }

    public SCEPE20Service(URL wsdlLocation) {
        super(wsdlLocation, SCEPE20SERVICE_QNAME);
    }

    public SCEPE20Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SCEPE20SERVICE_QNAME, features);
    }

    public SCEPE20Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SCEPE20Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SCEPE20PortType
     */
    @WebEndpoint(name = "SCE_PE20_Port")
    public SCEPE20PortType getSCEPE20Port() {
        return super.getPort(new QName("http://grupobbva.com.pe/sce/pe20/", "SCE_PE20_Port"), SCEPE20PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SCEPE20PortType
     */
    @WebEndpoint(name = "SCE_PE20_Port")
    public SCEPE20PortType getSCEPE20Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://grupobbva.com.pe/sce/pe20/", "SCE_PE20_Port"), SCEPE20PortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SCEPE20SERVICE_EXCEPTION!= null) {
            throw SCEPE20SERVICE_EXCEPTION;
        }
        return SCEPE20SERVICE_WSDL_LOCATION;
    }

}
