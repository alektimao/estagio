/**
 * InsertMatriculaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertMatriculaResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.InsertMatriculaResponseInsertMatriculaResult insertMatriculaResult;

    public InsertMatriculaResponse() {
    }

    public InsertMatriculaResponse(
           br.net.sponteeducacional.api.InsertMatriculaResponseInsertMatriculaResult insertMatriculaResult) {
           this.insertMatriculaResult = insertMatriculaResult;
    }


    /**
     * Gets the insertMatriculaResult value for this InsertMatriculaResponse.
     * 
     * @return insertMatriculaResult
     */
    public br.net.sponteeducacional.api.InsertMatriculaResponseInsertMatriculaResult getInsertMatriculaResult() {
        return insertMatriculaResult;
    }


    /**
     * Sets the insertMatriculaResult value for this InsertMatriculaResponse.
     * 
     * @param insertMatriculaResult
     */
    public void setInsertMatriculaResult(br.net.sponteeducacional.api.InsertMatriculaResponseInsertMatriculaResult insertMatriculaResult) {
        this.insertMatriculaResult = insertMatriculaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertMatriculaResponse)) return false;
        InsertMatriculaResponse other = (InsertMatriculaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertMatriculaResult==null && other.getInsertMatriculaResult()==null) || 
             (this.insertMatriculaResult!=null &&
              this.insertMatriculaResult.equals(other.getInsertMatriculaResult())));
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
        if (getInsertMatriculaResult() != null) {
            _hashCode += getInsertMatriculaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertMatriculaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertMatriculaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertMatriculaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertMatriculaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertMatriculaResponse>InsertMatriculaResult"));
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
