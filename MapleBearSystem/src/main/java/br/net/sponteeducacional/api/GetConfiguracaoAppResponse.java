/**
 * GetConfiguracaoAppResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetConfiguracaoAppResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsAppPortalNotas[] getConfiguracaoAppResult;

    public GetConfiguracaoAppResponse() {
    }

    public GetConfiguracaoAppResponse(
           br.net.sponteeducacional.api.WsAppPortalNotas[] getConfiguracaoAppResult) {
           this.getConfiguracaoAppResult = getConfiguracaoAppResult;
    }


    /**
     * Gets the getConfiguracaoAppResult value for this GetConfiguracaoAppResponse.
     * 
     * @return getConfiguracaoAppResult
     */
    public br.net.sponteeducacional.api.WsAppPortalNotas[] getGetConfiguracaoAppResult() {
        return getConfiguracaoAppResult;
    }


    /**
     * Sets the getConfiguracaoAppResult value for this GetConfiguracaoAppResponse.
     * 
     * @param getConfiguracaoAppResult
     */
    public void setGetConfiguracaoAppResult(br.net.sponteeducacional.api.WsAppPortalNotas[] getConfiguracaoAppResult) {
        this.getConfiguracaoAppResult = getConfiguracaoAppResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetConfiguracaoAppResponse)) return false;
        GetConfiguracaoAppResponse other = (GetConfiguracaoAppResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getConfiguracaoAppResult==null && other.getGetConfiguracaoAppResult()==null) || 
             (this.getConfiguracaoAppResult!=null &&
              java.util.Arrays.equals(this.getConfiguracaoAppResult, other.getGetConfiguracaoAppResult())));
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
        if (getGetConfiguracaoAppResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetConfiguracaoAppResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetConfiguracaoAppResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetConfiguracaoAppResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetConfiguracaoAppResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getConfiguracaoAppResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetConfiguracaoAppResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAppPortalNotas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAppPortalNotas"));
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
