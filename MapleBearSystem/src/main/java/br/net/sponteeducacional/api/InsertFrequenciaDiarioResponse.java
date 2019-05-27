/**
 * InsertFrequenciaDiarioResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertFrequenciaDiarioResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.InsertFrequenciaDiarioResponseInsertFrequenciaDiarioResult insertFrequenciaDiarioResult;

    public InsertFrequenciaDiarioResponse() {
    }

    public InsertFrequenciaDiarioResponse(
           br.net.sponteeducacional.api.InsertFrequenciaDiarioResponseInsertFrequenciaDiarioResult insertFrequenciaDiarioResult) {
           this.insertFrequenciaDiarioResult = insertFrequenciaDiarioResult;
    }


    /**
     * Gets the insertFrequenciaDiarioResult value for this InsertFrequenciaDiarioResponse.
     * 
     * @return insertFrequenciaDiarioResult
     */
    public br.net.sponteeducacional.api.InsertFrequenciaDiarioResponseInsertFrequenciaDiarioResult getInsertFrequenciaDiarioResult() {
        return insertFrequenciaDiarioResult;
    }


    /**
     * Sets the insertFrequenciaDiarioResult value for this InsertFrequenciaDiarioResponse.
     * 
     * @param insertFrequenciaDiarioResult
     */
    public void setInsertFrequenciaDiarioResult(br.net.sponteeducacional.api.InsertFrequenciaDiarioResponseInsertFrequenciaDiarioResult insertFrequenciaDiarioResult) {
        this.insertFrequenciaDiarioResult = insertFrequenciaDiarioResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertFrequenciaDiarioResponse)) return false;
        InsertFrequenciaDiarioResponse other = (InsertFrequenciaDiarioResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertFrequenciaDiarioResult==null && other.getInsertFrequenciaDiarioResult()==null) || 
             (this.insertFrequenciaDiarioResult!=null &&
              this.insertFrequenciaDiarioResult.equals(other.getInsertFrequenciaDiarioResult())));
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
        if (getInsertFrequenciaDiarioResult() != null) {
            _hashCode += getInsertFrequenciaDiarioResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertFrequenciaDiarioResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertFrequenciaDiarioResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertFrequenciaDiarioResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertFrequenciaDiarioResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertFrequenciaDiarioResponse>InsertFrequenciaDiarioResult"));
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
