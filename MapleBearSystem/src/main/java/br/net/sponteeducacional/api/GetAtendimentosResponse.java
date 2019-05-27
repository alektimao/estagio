/**
 * GetAtendimentosResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetAtendimentosResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsAtendimentos[] getAtendimentosResult;

    public GetAtendimentosResponse() {
    }

    public GetAtendimentosResponse(
           br.net.sponteeducacional.api.WsAtendimentos[] getAtendimentosResult) {
           this.getAtendimentosResult = getAtendimentosResult;
    }


    /**
     * Gets the getAtendimentosResult value for this GetAtendimentosResponse.
     * 
     * @return getAtendimentosResult
     */
    public br.net.sponteeducacional.api.WsAtendimentos[] getGetAtendimentosResult() {
        return getAtendimentosResult;
    }


    /**
     * Sets the getAtendimentosResult value for this GetAtendimentosResponse.
     * 
     * @param getAtendimentosResult
     */
    public void setGetAtendimentosResult(br.net.sponteeducacional.api.WsAtendimentos[] getAtendimentosResult) {
        this.getAtendimentosResult = getAtendimentosResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAtendimentosResponse)) return false;
        GetAtendimentosResponse other = (GetAtendimentosResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAtendimentosResult==null && other.getGetAtendimentosResult()==null) || 
             (this.getAtendimentosResult!=null &&
              java.util.Arrays.equals(this.getAtendimentosResult, other.getGetAtendimentosResult())));
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
        if (getGetAtendimentosResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAtendimentosResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAtendimentosResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetAtendimentosResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetAtendimentosResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAtendimentosResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetAtendimentosResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAtendimentos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAtendimentos"));
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
