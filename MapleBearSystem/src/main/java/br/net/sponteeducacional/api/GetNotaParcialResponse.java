/**
 * GetNotaParcialResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetNotaParcialResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsNotasParciais getNotaParcialResult;

    public GetNotaParcialResponse() {
    }

    public GetNotaParcialResponse(
           br.net.sponteeducacional.api.WsNotasParciais getNotaParcialResult) {
           this.getNotaParcialResult = getNotaParcialResult;
    }


    /**
     * Gets the getNotaParcialResult value for this GetNotaParcialResponse.
     * 
     * @return getNotaParcialResult
     */
    public br.net.sponteeducacional.api.WsNotasParciais getGetNotaParcialResult() {
        return getNotaParcialResult;
    }


    /**
     * Sets the getNotaParcialResult value for this GetNotaParcialResponse.
     * 
     * @param getNotaParcialResult
     */
    public void setGetNotaParcialResult(br.net.sponteeducacional.api.WsNotasParciais getNotaParcialResult) {
        this.getNotaParcialResult = getNotaParcialResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetNotaParcialResponse)) return false;
        GetNotaParcialResponse other = (GetNotaParcialResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getNotaParcialResult==null && other.getGetNotaParcialResult()==null) || 
             (this.getNotaParcialResult!=null &&
              this.getNotaParcialResult.equals(other.getGetNotaParcialResult())));
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
        if (getGetNotaParcialResult() != null) {
            _hashCode += getGetNotaParcialResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNotaParcialResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetNotaParcialResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getNotaParcialResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetNotaParcialResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsNotasParciais"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
