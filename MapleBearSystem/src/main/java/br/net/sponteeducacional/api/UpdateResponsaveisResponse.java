/**
 * UpdateResponsaveisResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class UpdateResponsaveisResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.UpdateResponsaveisResponseUpdateResponsaveisResult updateResponsaveisResult;

    public UpdateResponsaveisResponse() {
    }

    public UpdateResponsaveisResponse(
           br.net.sponteeducacional.api.UpdateResponsaveisResponseUpdateResponsaveisResult updateResponsaveisResult) {
           this.updateResponsaveisResult = updateResponsaveisResult;
    }


    /**
     * Gets the updateResponsaveisResult value for this UpdateResponsaveisResponse.
     * 
     * @return updateResponsaveisResult
     */
    public br.net.sponteeducacional.api.UpdateResponsaveisResponseUpdateResponsaveisResult getUpdateResponsaveisResult() {
        return updateResponsaveisResult;
    }


    /**
     * Sets the updateResponsaveisResult value for this UpdateResponsaveisResponse.
     * 
     * @param updateResponsaveisResult
     */
    public void setUpdateResponsaveisResult(br.net.sponteeducacional.api.UpdateResponsaveisResponseUpdateResponsaveisResult updateResponsaveisResult) {
        this.updateResponsaveisResult = updateResponsaveisResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateResponsaveisResponse)) return false;
        UpdateResponsaveisResponse other = (UpdateResponsaveisResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateResponsaveisResult==null && other.getUpdateResponsaveisResult()==null) || 
             (this.updateResponsaveisResult!=null &&
              this.updateResponsaveisResult.equals(other.getUpdateResponsaveisResult())));
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
        if (getUpdateResponsaveisResult() != null) {
            _hashCode += getUpdateResponsaveisResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateResponsaveisResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateResponsaveisResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateResponsaveisResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateResponsaveisResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>UpdateResponsaveisResponse>UpdateResponsaveisResult"));
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
