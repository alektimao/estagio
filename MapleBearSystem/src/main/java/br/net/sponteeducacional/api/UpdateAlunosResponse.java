/**
 * UpdateAlunosResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class UpdateAlunosResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.UpdateAlunosResponseUpdateAlunosResult updateAlunosResult;

    public UpdateAlunosResponse() {
    }

    public UpdateAlunosResponse(
           br.net.sponteeducacional.api.UpdateAlunosResponseUpdateAlunosResult updateAlunosResult) {
           this.updateAlunosResult = updateAlunosResult;
    }


    /**
     * Gets the updateAlunosResult value for this UpdateAlunosResponse.
     * 
     * @return updateAlunosResult
     */
    public br.net.sponteeducacional.api.UpdateAlunosResponseUpdateAlunosResult getUpdateAlunosResult() {
        return updateAlunosResult;
    }


    /**
     * Sets the updateAlunosResult value for this UpdateAlunosResponse.
     * 
     * @param updateAlunosResult
     */
    public void setUpdateAlunosResult(br.net.sponteeducacional.api.UpdateAlunosResponseUpdateAlunosResult updateAlunosResult) {
        this.updateAlunosResult = updateAlunosResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateAlunosResponse)) return false;
        UpdateAlunosResponse other = (UpdateAlunosResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateAlunosResult==null && other.getUpdateAlunosResult()==null) || 
             (this.updateAlunosResult!=null &&
              this.updateAlunosResult.equals(other.getUpdateAlunosResult())));
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
        if (getUpdateAlunosResult() != null) {
            _hashCode += getUpdateAlunosResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateAlunosResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateAlunosResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateAlunosResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateAlunosResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>UpdateAlunosResponse>UpdateAlunosResult"));
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
