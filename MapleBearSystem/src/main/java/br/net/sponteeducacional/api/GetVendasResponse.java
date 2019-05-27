/**
 * GetVendasResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetVendasResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsVendas[] getVendasResult;

    public GetVendasResponse() {
    }

    public GetVendasResponse(
           br.net.sponteeducacional.api.WsVendas[] getVendasResult) {
           this.getVendasResult = getVendasResult;
    }


    /**
     * Gets the getVendasResult value for this GetVendasResponse.
     * 
     * @return getVendasResult
     */
    public br.net.sponteeducacional.api.WsVendas[] getGetVendasResult() {
        return getVendasResult;
    }


    /**
     * Sets the getVendasResult value for this GetVendasResponse.
     * 
     * @param getVendasResult
     */
    public void setGetVendasResult(br.net.sponteeducacional.api.WsVendas[] getVendasResult) {
        this.getVendasResult = getVendasResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetVendasResponse)) return false;
        GetVendasResponse other = (GetVendasResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getVendasResult==null && other.getGetVendasResult()==null) || 
             (this.getVendasResult!=null &&
              java.util.Arrays.equals(this.getVendasResult, other.getGetVendasResult())));
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
        if (getGetVendasResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetVendasResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetVendasResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetVendasResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetVendasResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getVendasResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetVendasResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsVendas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsVendas"));
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
