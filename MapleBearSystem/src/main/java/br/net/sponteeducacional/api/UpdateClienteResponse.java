/**
 * UpdateClienteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class UpdateClienteResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.UpdateClienteResponseUpdateClienteResult updateClienteResult;

    public UpdateClienteResponse() {
    }

    public UpdateClienteResponse(
           br.net.sponteeducacional.api.UpdateClienteResponseUpdateClienteResult updateClienteResult) {
           this.updateClienteResult = updateClienteResult;
    }


    /**
     * Gets the updateClienteResult value for this UpdateClienteResponse.
     * 
     * @return updateClienteResult
     */
    public br.net.sponteeducacional.api.UpdateClienteResponseUpdateClienteResult getUpdateClienteResult() {
        return updateClienteResult;
    }


    /**
     * Sets the updateClienteResult value for this UpdateClienteResponse.
     * 
     * @param updateClienteResult
     */
    public void setUpdateClienteResult(br.net.sponteeducacional.api.UpdateClienteResponseUpdateClienteResult updateClienteResult) {
        this.updateClienteResult = updateClienteResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateClienteResponse)) return false;
        UpdateClienteResponse other = (UpdateClienteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateClienteResult==null && other.getUpdateClienteResult()==null) || 
             (this.updateClienteResult!=null &&
              this.updateClienteResult.equals(other.getUpdateClienteResult())));
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
        if (getUpdateClienteResult() != null) {
            _hashCode += getUpdateClienteResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateClienteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateClienteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateClienteResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateClienteResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>UpdateClienteResponse>UpdateClienteResult"));
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
