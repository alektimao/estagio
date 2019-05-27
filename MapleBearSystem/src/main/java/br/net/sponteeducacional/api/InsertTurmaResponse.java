/**
 * InsertTurmaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertTurmaResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.InsertTurmaResponseInsertTurmaResult insertTurmaResult;

    public InsertTurmaResponse() {
    }

    public InsertTurmaResponse(
           br.net.sponteeducacional.api.InsertTurmaResponseInsertTurmaResult insertTurmaResult) {
           this.insertTurmaResult = insertTurmaResult;
    }


    /**
     * Gets the insertTurmaResult value for this InsertTurmaResponse.
     * 
     * @return insertTurmaResult
     */
    public br.net.sponteeducacional.api.InsertTurmaResponseInsertTurmaResult getInsertTurmaResult() {
        return insertTurmaResult;
    }


    /**
     * Sets the insertTurmaResult value for this InsertTurmaResponse.
     * 
     * @param insertTurmaResult
     */
    public void setInsertTurmaResult(br.net.sponteeducacional.api.InsertTurmaResponseInsertTurmaResult insertTurmaResult) {
        this.insertTurmaResult = insertTurmaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertTurmaResponse)) return false;
        InsertTurmaResponse other = (InsertTurmaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertTurmaResult==null && other.getInsertTurmaResult()==null) || 
             (this.insertTurmaResult!=null &&
              this.insertTurmaResult.equals(other.getInsertTurmaResult())));
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
        if (getInsertTurmaResult() != null) {
            _hashCode += getInsertTurmaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertTurmaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertTurmaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertTurmaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertTurmaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertTurmaResponse>InsertTurmaResult"));
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
