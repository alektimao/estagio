/**
 * UpdateMatriculaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class UpdateMatriculaResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.UpdateMatriculaResponseUpdateMatriculaResult updateMatriculaResult;

    public UpdateMatriculaResponse() {
    }

    public UpdateMatriculaResponse(
           br.net.sponteeducacional.api.UpdateMatriculaResponseUpdateMatriculaResult updateMatriculaResult) {
           this.updateMatriculaResult = updateMatriculaResult;
    }


    /**
     * Gets the updateMatriculaResult value for this UpdateMatriculaResponse.
     * 
     * @return updateMatriculaResult
     */
    public br.net.sponteeducacional.api.UpdateMatriculaResponseUpdateMatriculaResult getUpdateMatriculaResult() {
        return updateMatriculaResult;
    }


    /**
     * Sets the updateMatriculaResult value for this UpdateMatriculaResponse.
     * 
     * @param updateMatriculaResult
     */
    public void setUpdateMatriculaResult(br.net.sponteeducacional.api.UpdateMatriculaResponseUpdateMatriculaResult updateMatriculaResult) {
        this.updateMatriculaResult = updateMatriculaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateMatriculaResponse)) return false;
        UpdateMatriculaResponse other = (UpdateMatriculaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateMatriculaResult==null && other.getUpdateMatriculaResult()==null) || 
             (this.updateMatriculaResult!=null &&
              this.updateMatriculaResult.equals(other.getUpdateMatriculaResult())));
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
        if (getUpdateMatriculaResult() != null) {
            _hashCode += getUpdateMatriculaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateMatriculaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateMatriculaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateMatriculaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateMatriculaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>UpdateMatriculaResponse>UpdateMatriculaResult"));
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
