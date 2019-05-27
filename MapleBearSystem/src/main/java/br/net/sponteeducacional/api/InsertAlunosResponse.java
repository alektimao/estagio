/**
 * InsertAlunosResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertAlunosResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.InsertAlunosResponseInsertAlunosResult insertAlunosResult;

    public InsertAlunosResponse() {
    }

    public InsertAlunosResponse(
           br.net.sponteeducacional.api.InsertAlunosResponseInsertAlunosResult insertAlunosResult) {
           this.insertAlunosResult = insertAlunosResult;
    }


    /**
     * Gets the insertAlunosResult value for this InsertAlunosResponse.
     * 
     * @return insertAlunosResult
     */
    public br.net.sponteeducacional.api.InsertAlunosResponseInsertAlunosResult getInsertAlunosResult() {
        return insertAlunosResult;
    }


    /**
     * Sets the insertAlunosResult value for this InsertAlunosResponse.
     * 
     * @param insertAlunosResult
     */
    public void setInsertAlunosResult(br.net.sponteeducacional.api.InsertAlunosResponseInsertAlunosResult insertAlunosResult) {
        this.insertAlunosResult = insertAlunosResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertAlunosResponse)) return false;
        InsertAlunosResponse other = (InsertAlunosResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertAlunosResult==null && other.getInsertAlunosResult()==null) || 
             (this.insertAlunosResult!=null &&
              this.insertAlunosResult.equals(other.getInsertAlunosResult())));
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
        if (getInsertAlunosResult() != null) {
            _hashCode += getInsertAlunosResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertAlunosResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertAlunosResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertAlunosResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertAlunosResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertAlunosResponse>InsertAlunosResult"));
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
