/**
 * GetBoletimResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetBoletimResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsBoletim getBoletimResult;

    public GetBoletimResponse() {
    }

    public GetBoletimResponse(
           br.net.sponteeducacional.api.WsBoletim getBoletimResult) {
           this.getBoletimResult = getBoletimResult;
    }


    /**
     * Gets the getBoletimResult value for this GetBoletimResponse.
     * 
     * @return getBoletimResult
     */
    public br.net.sponteeducacional.api.WsBoletim getGetBoletimResult() {
        return getBoletimResult;
    }


    /**
     * Sets the getBoletimResult value for this GetBoletimResponse.
     * 
     * @param getBoletimResult
     */
    public void setGetBoletimResult(br.net.sponteeducacional.api.WsBoletim getBoletimResult) {
        this.getBoletimResult = getBoletimResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBoletimResponse)) return false;
        GetBoletimResponse other = (GetBoletimResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getBoletimResult==null && other.getGetBoletimResult()==null) || 
             (this.getBoletimResult!=null &&
              this.getBoletimResult.equals(other.getGetBoletimResult())));
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
        if (getGetBoletimResult() != null) {
            _hashCode += getGetBoletimResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBoletimResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetBoletimResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBoletimResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetBoletimResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBoletim"));
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
