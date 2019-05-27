/**
 * GetMediaFinalResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetMediaFinalResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsMediaFinal getMediaFinalResult;

    public GetMediaFinalResponse() {
    }

    public GetMediaFinalResponse(
           br.net.sponteeducacional.api.WsMediaFinal getMediaFinalResult) {
           this.getMediaFinalResult = getMediaFinalResult;
    }


    /**
     * Gets the getMediaFinalResult value for this GetMediaFinalResponse.
     * 
     * @return getMediaFinalResult
     */
    public br.net.sponteeducacional.api.WsMediaFinal getGetMediaFinalResult() {
        return getMediaFinalResult;
    }


    /**
     * Sets the getMediaFinalResult value for this GetMediaFinalResponse.
     * 
     * @param getMediaFinalResult
     */
    public void setGetMediaFinalResult(br.net.sponteeducacional.api.WsMediaFinal getMediaFinalResult) {
        this.getMediaFinalResult = getMediaFinalResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMediaFinalResponse)) return false;
        GetMediaFinalResponse other = (GetMediaFinalResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMediaFinalResult==null && other.getGetMediaFinalResult()==null) || 
             (this.getMediaFinalResult!=null &&
              this.getMediaFinalResult.equals(other.getGetMediaFinalResult())));
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
        if (getGetMediaFinalResult() != null) {
            _hashCode += getGetMediaFinalResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMediaFinalResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetMediaFinalResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMediaFinalResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetMediaFinalResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMediaFinal"));
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
