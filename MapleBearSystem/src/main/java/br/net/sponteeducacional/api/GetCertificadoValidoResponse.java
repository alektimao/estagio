/**
 * GetCertificadoValidoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetCertificadoValidoResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WSCertificado getCertificadoValidoResult;

    public GetCertificadoValidoResponse() {
    }

    public GetCertificadoValidoResponse(
           br.net.sponteeducacional.api.WSCertificado getCertificadoValidoResult) {
           this.getCertificadoValidoResult = getCertificadoValidoResult;
    }


    /**
     * Gets the getCertificadoValidoResult value for this GetCertificadoValidoResponse.
     * 
     * @return getCertificadoValidoResult
     */
    public br.net.sponteeducacional.api.WSCertificado getGetCertificadoValidoResult() {
        return getCertificadoValidoResult;
    }


    /**
     * Sets the getCertificadoValidoResult value for this GetCertificadoValidoResponse.
     * 
     * @param getCertificadoValidoResult
     */
    public void setGetCertificadoValidoResult(br.net.sponteeducacional.api.WSCertificado getCertificadoValidoResult) {
        this.getCertificadoValidoResult = getCertificadoValidoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCertificadoValidoResponse)) return false;
        GetCertificadoValidoResponse other = (GetCertificadoValidoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCertificadoValidoResult==null && other.getGetCertificadoValidoResult()==null) || 
             (this.getCertificadoValidoResult!=null &&
              this.getCertificadoValidoResult.equals(other.getGetCertificadoValidoResult())));
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
        if (getGetCertificadoValidoResult() != null) {
            _hashCode += getGetCertificadoValidoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCertificadoValidoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetCertificadoValidoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCertificadoValidoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetCertificadoValidoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "WSCertificado"));
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
