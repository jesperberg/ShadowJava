package host;

public class ForestServiceSoapProxy implements host.ForestServiceSoap {
  private String _endpoint = null;
  private host.ForestServiceSoap forestServiceSoap = null;
  
  public ForestServiceSoapProxy() {
    _initForestServiceSoapProxy();
  }
  
  public ForestServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initForestServiceSoapProxy();
  }
  
  private void _initForestServiceSoapProxy() {
    try {
      forestServiceSoap = (new host.ForestServiceLocator()).getForestServiceSoap();
      if (forestServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)forestServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)forestServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (forestServiceSoap != null)
      ((javax.xml.rpc.Stub)forestServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public host.ForestServiceSoap getForestServiceSoap() {
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap;
  }
  
  public java.lang.String readFile(java.lang.String fileName) throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.readFile(fileName);
  }
  
  public host.Account[] readAccounts() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.readAccounts();
  }
  
  public java.lang.String[] getAvailableFiles() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.getAvailableFiles();
  }
  
  public java.lang.String getFileText(java.lang.String filePath) throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.getFileText(filePath);
  }
  
  public java.lang.String[][] allColumnsEmployeeOne() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.allColumnsEmployeeOne();
  }
  
  public java.lang.String[][] allColumnsEmployeeTwo() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.allColumnsEmployeeTwo();
  }
  
  public java.lang.String[][] allConstraints() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.allConstraints();
  }
  
  public java.lang.String[][] allIndexs() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.allIndexs();
  }
  
  public java.lang.String[][] allKeys() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.allKeys();
  }
  
  public java.lang.String[][] allTabelTwo() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.allTabelTwo();
  }
  
  public java.lang.String[][] allTablesOne() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.allTablesOne();
  }
  
  public java.lang.String[][] firstNameOfSickPeople() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.firstNameOfSickPeople();
  }
  
  public java.lang.String[][] personalAndRelatives() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.personalAndRelatives();
  }
  
  public java.lang.String[][] sickLeave() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.sickLeave();
  }
  
  public void addEmployee(java.lang.String no_, java.lang.String firstName) throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    forestServiceSoap.addEmployee(no_, firstName);
  }
  
  public void updateEmployee(java.lang.String no_, java.lang.String firstName) throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    forestServiceSoap.updateEmployee(no_, firstName);
  }
  
  public void deleteEmployee(java.lang.String no_) throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    forestServiceSoap.deleteEmployee(no_);
  }
  
  public java.lang.String[][] allEmployees() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.allEmployees();
  }
  
  public java.lang.String[][] metaAllEmployees() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.metaAllEmployees();
  }
  
  public java.lang.String[][] metaReadAllAbsences() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.metaReadAllAbsences();
  }
  
  public java.lang.String[][] metaReadAllPortals() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.metaReadAllPortals();
  }
  
  public java.lang.String[][] metaReadAllQualifications() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.metaReadAllQualifications();
  }
  
  public java.lang.String[][] metaReadAllRelatives() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.metaReadAllRelatives();
  }
  
  public java.lang.String[][] metaReadAllStatistics() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.metaReadAllStatistics();
  }
  
  public java.lang.String[][] metaReadAllContracts() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.metaReadAllContracts();
  }
  
  public java.lang.String[][] readAllContracts() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.readAllContracts();
  }
  
  public java.lang.String[][] readAllStatistics() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.readAllStatistics();
  }
  
  public java.lang.String[][] readAllRelative() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.readAllRelative();
  }
  
  public java.lang.String[][] readAllQualifications() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.readAllQualifications();
  }
  
  public java.lang.String[][] readAllPortals() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.readAllPortals();
  }
  
  public java.lang.String[][] readAllAbsences() throws java.rmi.RemoteException{
    if (forestServiceSoap == null)
      _initForestServiceSoapProxy();
    return forestServiceSoap.readAllAbsences();
  }
  
  
}