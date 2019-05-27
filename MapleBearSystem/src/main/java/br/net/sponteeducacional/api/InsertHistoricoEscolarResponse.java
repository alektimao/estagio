/**
 * InsertHistoricoEscolarResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertHistoricoEscolarResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.InsertHistoricoEscolarResponseInsertHistoricoEscolarResult insertHistoricoEscolarResult;

    public InsertHistoricoEscolarResponse() {
    }

    public InsertHistoricoEscolarResponse(
           br.net.sponteeducacional.api.InsertHistoricoEscolarResponseInsertHistoricoEscolarResult insertHistoricoEscolarResult) {
           this.insertHistoricoEscolarResult = insertHistoricoEscolarResult;
    }


    /**
     * Gets the insertHistoricoEscolarResult value for this InsertHistoricoEscolarResponse.
     * 
     * @return insertHistoricoEscolarResult
     */
    public br.net.sponteeducacional.api.InsertHistoricoEscolarResponseInsertHistoricoEscolarResult getInsertHistoricoEscolarResult() {
        return insertHistoricoEscolarResult;
    }


    /**
     * Sets the insertHistoricoEscolarResult value for this InsertHistoricoEscolarResponse.
     * 
     * @param insertHistoricoEscolarResult
     */
    public void setInsertHistoricoEscolarResult(br.net.sponteeducacional.api.InsertHistoricoEscolarResponseInsertHistoricoEscolarResult insertHistoricoEscolarResult) {
        this.insertHistoricoEscolarResult = insertHistoricoEscolarResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertHistoricoEscolarResponse)) return false;
        InsertHistoricoEscolarResponse other = (InsertHistoricoEscolarResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertHistoricoEscolarResult==null && other.getInsertHistoricoEscolarResult()==null) || 
             (this.insertHistoricoEscolarResult!=null &&
              this.insertHistoricoEscolarResult.equals(other.getInsertHistoricoEscolarResult())));
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
        if (getInsertHistoricoEscolarResult() != null) {
            _hashCode += getInsertHistoricoEscolarResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertHistoricoEscolarResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertHistoricoEscolarResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertHistoricoEscolarResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertHistoricoEscolarResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertHistoricoEscolarResponse>InsertHistoricoEscolarResult"));
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
