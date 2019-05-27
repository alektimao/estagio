/**
 * GetOperadorasCartaoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetOperadorasCartaoResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsOperadoraCartao[] getOperadorasCartaoResult;

    public GetOperadorasCartaoResponse() {
    }

    public GetOperadorasCartaoResponse(
           br.net.sponteeducacional.api.WsOperadoraCartao[] getOperadorasCartaoResult) {
           this.getOperadorasCartaoResult = getOperadorasCartaoResult;
    }


    /**
     * Gets the getOperadorasCartaoResult value for this GetOperadorasCartaoResponse.
     * 
     * @return getOperadorasCartaoResult
     */
    public br.net.sponteeducacional.api.WsOperadoraCartao[] getGetOperadorasCartaoResult() {
        return getOperadorasCartaoResult;
    }


    /**
     * Sets the getOperadorasCartaoResult value for this GetOperadorasCartaoResponse.
     * 
     * @param getOperadorasCartaoResult
     */
    public void setGetOperadorasCartaoResult(br.net.sponteeducacional.api.WsOperadoraCartao[] getOperadorasCartaoResult) {
        this.getOperadorasCartaoResult = getOperadorasCartaoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOperadorasCartaoResponse)) return false;
        GetOperadorasCartaoResponse other = (GetOperadorasCartaoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getOperadorasCartaoResult==null && other.getGetOperadorasCartaoResult()==null) || 
             (this.getOperadorasCartaoResult!=null &&
              java.util.Arrays.equals(this.getOperadorasCartaoResult, other.getGetOperadorasCartaoResult())));
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
        if (getGetOperadorasCartaoResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetOperadorasCartaoResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetOperadorasCartaoResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetOperadorasCartaoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetOperadorasCartaoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getOperadorasCartaoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetOperadorasCartaoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOperadoraCartao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOperadoraCartao"));
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
