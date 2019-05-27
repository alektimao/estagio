/**
 * GetClientesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetClientesResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsCliente[] getClientesResult;

    public GetClientesResponse() {
    }

    public GetClientesResponse(
           br.net.sponteeducacional.api.WsCliente[] getClientesResult) {
           this.getClientesResult = getClientesResult;
    }


    /**
     * Gets the getClientesResult value for this GetClientesResponse.
     * 
     * @return getClientesResult
     */
    public br.net.sponteeducacional.api.WsCliente[] getGetClientesResult() {
        return getClientesResult;
    }


    /**
     * Sets the getClientesResult value for this GetClientesResponse.
     * 
     * @param getClientesResult
     */
    public void setGetClientesResult(br.net.sponteeducacional.api.WsCliente[] getClientesResult) {
        this.getClientesResult = getClientesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetClientesResponse)) return false;
        GetClientesResponse other = (GetClientesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getClientesResult==null && other.getGetClientesResult()==null) || 
             (this.getClientesResult!=null &&
              java.util.Arrays.equals(this.getClientesResult, other.getGetClientesResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetClientesResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetClientesResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetClientesResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetClientesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetClientesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getClientesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetClientesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCliente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCliente"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
