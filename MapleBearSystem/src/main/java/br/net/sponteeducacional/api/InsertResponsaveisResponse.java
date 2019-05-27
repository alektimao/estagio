/**
 * InsertResponsaveisResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertResponsaveisResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.InsertResponsaveisResponseInsertResponsaveisResult insertResponsaveisResult;

    public InsertResponsaveisResponse() {
    }

    public InsertResponsaveisResponse(
           br.net.sponteeducacional.api.InsertResponsaveisResponseInsertResponsaveisResult insertResponsaveisResult) {
           this.insertResponsaveisResult = insertResponsaveisResult;
    }


    /**
     * Gets the insertResponsaveisResult value for this InsertResponsaveisResponse.
     * 
     * @return insertResponsaveisResult
     */
    public br.net.sponteeducacional.api.InsertResponsaveisResponseInsertResponsaveisResult getInsertResponsaveisResult() {
        return insertResponsaveisResult;
    }


    /**
     * Sets the insertResponsaveisResult value for this InsertResponsaveisResponse.
     * 
     * @param insertResponsaveisResult
     */
    public void setInsertResponsaveisResult(br.net.sponteeducacional.api.InsertResponsaveisResponseInsertResponsaveisResult insertResponsaveisResult) {
        this.insertResponsaveisResult = insertResponsaveisResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertResponsaveisResponse)) return false;
        InsertResponsaveisResponse other = (InsertResponsaveisResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertResponsaveisResult==null && other.getInsertResponsaveisResult()==null) || 
             (this.insertResponsaveisResult!=null &&
              this.insertResponsaveisResult.equals(other.getInsertResponsaveisResult())));
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
        if (getInsertResponsaveisResult() != null) {
            _hashCode += getInsertResponsaveisResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertResponsaveisResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertResponsaveisResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertResponsaveisResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertResponsaveisResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertResponsaveisResponse>InsertResponsaveisResult"));
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
