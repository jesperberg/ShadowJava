package localhost;

public class ShadowServiceSoapProxy implements localhost.ShadowServiceSoap {
  private String _endpoint = null;
  private localhost.ShadowServiceSoap shadowServiceSoap = null;
  
  public ShadowServiceSoapProxy() {
    _initForestServiceSoapProxy();
  }
  
  public ShadowServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initForestServiceSoapProxy();
  }
  
  private void _initForestServiceSoapProxy() {
    try {
      shadowServiceSoap = (new localhost.ShadowServiceLocator()).getForestServiceSoap();
      if (shadowServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)shadowServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)shadowServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (shadowServiceSoap != null)
      ((javax.xml.rpc.Stub)shadowServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public localhost.ShadowServiceSoap getForestServiceSoap() {
    if (shadowServiceSoap == null)
      _initForestServiceSoapProxy();
    return shadowServiceSoap;
  }
  
  public java.lang.String readFile(java.lang.String fileName) throws java.rmi.RemoteException{
    if (shadowServiceSoap == null)
      _initForestServiceSoapProxy();
    return shadowServiceSoap.readFile(fileName);
  }
  
  public java.lang.String allFileNames() throws java.rmi.RemoteException{
    if (shadowServiceSoap == null)
      _initForestServiceSoapProxy();
    return shadowServiceSoap.allFileNames();
  }
  
  
}