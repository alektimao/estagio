/**
 * GetFormasCobrancasResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetFormasCobrancasResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsFormasCobrancas[] getFormasCobrancasResult;

    public GetFormasCobrancasResponse() {
    }

    public GetFormasCobrancasResponse(
           br.net.sponteeducacional.api.WsFormasCobrancas[] getFormasCobrancasResult) {
           this.getFormasCobrancasResult = getFormasCobrancasResult;
    }


    /**
     * Gets the getFormasCobrancasResult value for this GetFormasCobrancasResponse.
     * 
     * @return getFormasCobrancasResult
     */
    public br.net.sponteeducacional.api.WsFormasCobrancas[] getGetFormasCobrancasResult() {
        return getFormasCobrancasResult;
    }


    /**
     * Sets the getFormasCobrancasResult value for this GetFormasCobrancasResponse.
     * 
     * @param getFormasCobrancasResult
     */
    public void setGetFormasCobrancasResult(br.net.sponteeducacional.api.WsFormasCobrancas[] getFormasCobrancasResult) {
        this.getFormasCobrancasResult = getFormasCobrancasResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFormasCobrancasResponse)) return false;
        GetFormasCobrancasResponse other = (GetFormasCobrancasResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFormasCobrancasResult==null && other.getGetFormasCobrancasResult()==null) || 
             (this.getFormasCobrancasResult!=null &&
              java.util.Arrays.equals(this.getFormasCobrancasResult, other.getGetFormasCobrancasResult())));
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
        if (getGetFormasCobrancasResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetFormasCobrancasResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetFormasCobrancasResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetFormasCobrancasResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetFormasCobrancasResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFormasCobrancasResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetFormasCobrancasResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFormasCobrancas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFormasCobrancas"));
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
