/**
 * ValidaLoginPortalResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class ValidaLoginPortalResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsLoginPortal validaLoginPortalResult;

    public ValidaLoginPortalResponse() {
    }

    public ValidaLoginPortalResponse(
           br.net.sponteeducacional.api.WsLoginPortal validaLoginPortalResult) {
           this.validaLoginPortalResult = validaLoginPortalResult;
    }


    /**
     * Gets the validaLoginPortalResult value for this ValidaLoginPortalResponse.
     * 
     * @return validaLoginPortalResult
     */
    public br.net.sponteeducacional.api.WsLoginPortal getValidaLoginPortalResult() {
        return validaLoginPortalResult;
    }


    /**
     * Sets the validaLoginPortalResult value for this ValidaLoginPortalResponse.
     * 
     * @param validaLoginPortalResult
     */
    public void setValidaLoginPortalResult(br.net.sponteeducacional.api.WsLoginPortal validaLoginPortalResult) {
        this.validaLoginPortalResult = validaLoginPortalResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidaLoginPortalResponse)) return false;
        ValidaLoginPortalResponse other = (ValidaLoginPortalResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.validaLoginPortalResult==null && other.getValidaLoginPortalResult()==null) || 
             (this.validaLoginPortalResult!=null &&
              this.validaLoginPortalResult.equals(other.getValidaLoginPortalResult())));
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
        if (getValidaLoginPortalResult() != null) {
            _hashCode += getValidaLoginPortalResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidaLoginPortalResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">ValidaLoginPortalResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validaLoginPortalResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ValidaLoginPortalResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsLoginPortal"));
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
