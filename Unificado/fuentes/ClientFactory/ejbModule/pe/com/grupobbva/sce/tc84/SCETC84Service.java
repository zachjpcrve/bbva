//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:27 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:17 AM(foreman)-)
//


package pe.com.grupobbva.sce.tc84;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "SCE_TC84_Service", targetNamespace = "http://grupobbva.com.pe/sce/tc84/", wsdlLocation = "META-INF/wsdl/SCE_TC84Service.wsdl")
public class SCETC84Service
    extends Service
{

    private final static URL SCETC84SERVICE_WSDL_LOCATION;
    private final static WebServiceException SCETC84SERVICE_EXCEPTION;
    private final static QName SCETC84SERVICE_QNAME = new QName("http://grupobbva.com.pe/sce/tc84/", "SCE_TC84_Service");

    static {
            SCETC84SERVICE_WSDL_LOCATION = pe.com.grupobbva.sce.tc84.SCETC84Service.class.getResource("/META-INF/wsdl/SCE_TC84Service.wsdl");
        WebServiceException e = null;
        if (SCETC84SERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/wsdl/SCE_TC84Service.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        SCETC84SERVICE_EXCEPTION = e;
    }

    public SCETC84Service() {
        super(__getWsdlLocation(), SCETC84SERVICE_QNAME);
    }

    public SCETC84Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SCETC84SERVICE_QNAME, features);
    }

    public SCETC84Service(URL wsdlLocation) {
        super(wsdlLocation, SCETC84SERVICE_QNAME);
    }

    public SCETC84Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SCETC84SERVICE_QNAME, features);
    }

    public SCETC84Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SCETC84Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SCETC84PortType
     */
    @WebEndpoint(name = "SCE_TC84_Port")
    public SCETC84PortType getSCETC84Port() {
        return super.getPort(new QName("http://grupobbva.com.pe/sce/tc84/", "SCE_TC84_Port"), SCETC84PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SCETC84PortType
     */
    @WebEndpoint(name = "SCE_TC84_Port")
    public SCETC84PortType getSCETC84Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://grupobbva.com.pe/sce/tc84/", "SCE_TC84_Port"), SCETC84PortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SCETC84SERVICE_EXCEPTION!= null) {
            throw SCETC84SERVICE_EXCEPTION;
        }
        return SCETC84SERVICE_WSDL_LOCATION;
    }

}
