/**
 * GetAvaliacaoParcialResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetAvaliacaoParcialResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsAvaliacoesParciais[] getAvaliacaoParcialResult;

    public GetAvaliacaoParcialResponse() {
    }

    public GetAvaliacaoParcialResponse(
           br.net.sponteeducacional.api.WsAvaliacoesParciais[] getAvaliacaoParcialResult) {
           this.getAvaliacaoParcialResult = getAvaliacaoParcialResult;
    }


    /**
     * Gets the getAvaliacaoParcialResult value for this GetAvaliacaoParcialResponse.
     * 
     * @return getAvaliacaoParcialResult
     */
    public br.net.sponteeducacional.api.WsAvaliacoesParciais[] getGetAvaliacaoParcialResult() {
        return getAvaliacaoParcialResult;
    }


    /**
     * Sets the getAvaliacaoParcialResult value for this GetAvaliacaoParcialResponse.
     * 
     * @param getAvaliacaoParcialResult
     */
    public void setGetAvaliacaoParcialResult(br.net.sponteeducacional.api.WsAvaliacoesParciais[] getAvaliacaoParcialResult) {
        this.getAvaliacaoParcialResult = getAvaliacaoParcialResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAvaliacaoParcialResponse)) return false;
        GetAvaliacaoParcialResponse other = (GetAvaliacaoParcialResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAvaliacaoParcialResult==null && other.getGetAvaliacaoParcialResult()==null) || 
             (this.getAvaliacaoParcialResult!=null &&
              java.util.Arrays.equals(this.getAvaliacaoParcialResult, other.getGetAvaliacaoParcialResult())));
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
        if (getGetAvaliacaoParcialResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAvaliacaoParcialResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAvaliacaoParcialResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetAvaliacaoParcialResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetAvaliacaoParcialResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAvaliacaoParcialResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetAvaliacaoParcialResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAvaliacoesParciais"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAvaliacoesParciais"));
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
