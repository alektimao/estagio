/**
 * WSAPIEduLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WSAPIEduLocator extends org.apache.axis.client.Service implements br.net.sponteeducacional.api.WSAPIEdu {

    public WSAPIEduLocator() {
    }


    public WSAPIEduLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSAPIEduLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSAPIEduSoap
    private java.lang.String WSAPIEduSoap_address = "http://api.sponteeducacional.net.br/WSAPIEdu.asmx";

    public java.lang.String getWSAPIEduSoapAddress() {
        return WSAPIEduSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSAPIEduSoapWSDDServiceName = "WSAPIEduSoap";

    public java.lang.String getWSAPIEduSoapWSDDServiceName() {
        return WSAPIEduSoapWSDDServiceName;
    }

    public void setWSAPIEduSoapWSDDServiceName(java.lang.String name) {
        WSAPIEduSoapWSDDServiceName = name;
    }

    public br.net.sponteeducacional.api.WSAPIEduSoap getWSAPIEduSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSAPIEduSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSAPIEduSoap(endpoint);
    }

    public br.net.sponteeducacional.api.WSAPIEduSoap getWSAPIEduSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.net.sponteeducacional.api.WSAPIEduSoapStub _stub = new br.net.sponteeducacional.api.WSAPIEduSoapStub(portAddress, this);
            _stub.setPortName(getWSAPIEduSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSAPIEduSoapEndpointAddress(java.lang.String address) {
        WSAPIEduSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.net.sponteeducacional.api.WSAPIEduSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                br.net.sponteeducacional.api.WSAPIEduSoapStub _stub = new br.net.sponteeducacional.api.WSAPIEduSoapStub(new java.net.URL(WSAPIEduSoap_address), this);
                _stub.setPortName(getWSAPIEduSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WSAPIEduSoap".equals(inputPortName)) {
            return getWSAPIEduSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "WSAPIEdu");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "WSAPIEduSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSAPIEduSoap".equals(portName)) {
            setWSAPIEduSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
