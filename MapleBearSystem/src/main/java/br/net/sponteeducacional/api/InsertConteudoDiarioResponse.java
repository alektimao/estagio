/**
 * InsertConteudoDiarioResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertConteudoDiarioResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.InsertConteudoDiarioResponseInsertConteudoDiarioResult insertConteudoDiarioResult;

    public InsertConteudoDiarioResponse() {
    }

    public InsertConteudoDiarioResponse(
           br.net.sponteeducacional.api.InsertConteudoDiarioResponseInsertConteudoDiarioResult insertConteudoDiarioResult) {
           this.insertConteudoDiarioResult = insertConteudoDiarioResult;
    }


    /**
     * Gets the insertConteudoDiarioResult value for this InsertConteudoDiarioResponse.
     * 
     * @return insertConteudoDiarioResult
     */
    public br.net.sponteeducacional.api.InsertConteudoDiarioResponseInsertConteudoDiarioResult getInsertConteudoDiarioResult() {
        return insertConteudoDiarioResult;
    }


    /**
     * Sets the insertConteudoDiarioResult value for this InsertConteudoDiarioResponse.
     * 
     * @param insertConteudoDiarioResult
     */
    public void setInsertConteudoDiarioResult(br.net.sponteeducacional.api.InsertConteudoDiarioResponseInsertConteudoDiarioResult insertConteudoDiarioResult) {
        this.insertConteudoDiarioResult = insertConteudoDiarioResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertConteudoDiarioResponse)) return false;
        InsertConteudoDiarioResponse other = (InsertConteudoDiarioResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertConteudoDiarioResult==null && other.getInsertConteudoDiarioResult()==null) || 
             (this.insertConteudoDiarioResult!=null &&
              this.insertConteudoDiarioResult.equals(other.getInsertConteudoDiarioResult())));
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
        if (getInsertConteudoDiarioResult() != null) {
            _hashCode += getInsertConteudoDiarioResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertConteudoDiarioResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertConteudoDiarioResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertConteudoDiarioResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertConteudoDiarioResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertConteudoDiarioResponse>InsertConteudoDiarioResult"));
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
