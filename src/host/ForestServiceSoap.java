/**
 * ForestServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package host;

public interface ForestServiceSoap extends java.rmi.Remote {
    public java.lang.String readFile(java.lang.String fileName) throws java.rmi.RemoteException;
    public host.Account[] readAccounts() throws java.rmi.RemoteException;
    public java.lang.String[] getAvailableFiles() throws java.rmi.RemoteException;
    public java.lang.String getFileText(java.lang.String filePath) throws java.rmi.RemoteException;
    public java.lang.String[][] allColumnsEmployeeOne() throws java.rmi.RemoteException;
    public java.lang.String[][] allColumnsEmployeeTwo() throws java.rmi.RemoteException;
    public java.lang.String[][] allConstraints() throws java.rmi.RemoteException;
    public java.lang.String[][] allIndexs() throws java.rmi.RemoteException;
    public java.lang.String[][] allKeys() throws java.rmi.RemoteException;
    public java.lang.String[][] allTabelTwo() throws java.rmi.RemoteException;
    public java.lang.String[][] allTablesOne() throws java.rmi.RemoteException;
    public java.lang.String[][] firstNameOfSickPeople() throws java.rmi.RemoteException;
    public java.lang.String[][] personalAndRelatives() throws java.rmi.RemoteException;
    public java.lang.String[][] sickLeave() throws java.rmi.RemoteException;
    public void addEmployee(java.lang.String no_, java.lang.String firstName) throws java.rmi.RemoteException;
    public void updateEmployee(java.lang.String no_, java.lang.String firstName) throws java.rmi.RemoteException;
    public void deleteEmployee(java.lang.String no_) throws java.rmi.RemoteException;
    public java.lang.String[][] allEmployees() throws java.rmi.RemoteException;
    public java.lang.String[][] metaAllEmployees() throws java.rmi.RemoteException;
    public java.lang.String[][] metaReadAllAbsences() throws java.rmi.RemoteException;
    public java.lang.String[][] metaReadAllPortals() throws java.rmi.RemoteException;
    public java.lang.String[][] metaReadAllQualifications() throws java.rmi.RemoteException;
    public java.lang.String[][] metaReadAllRelatives() throws java.rmi.RemoteException;
    public java.lang.String[][] metaReadAllStatistics() throws java.rmi.RemoteException;
    public java.lang.String[][] metaReadAllContracts() throws java.rmi.RemoteException;
    public java.lang.String[][] readAllContracts() throws java.rmi.RemoteException;
    public java.lang.String[][] readAllStatistics() throws java.rmi.RemoteException;
    public java.lang.String[][] readAllRelative() throws java.rmi.RemoteException;
    public java.lang.String[][] readAllQualifications() throws java.rmi.RemoteException;
    public java.lang.String[][] readAllPortals() throws java.rmi.RemoteException;
    public java.lang.String[][] readAllAbsences() throws java.rmi.RemoteException;
}
