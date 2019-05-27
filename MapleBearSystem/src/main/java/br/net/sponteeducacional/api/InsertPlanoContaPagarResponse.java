/**
 * InsertPlanoContaPagarResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertPlanoContaPagarResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsRetornoParcelasPagar[] insertPlanoContaPagarResult;

    public InsertPlanoContaPagarResponse() {
    }

    public InsertPlanoContaPagarResponse(
           br.net.sponteeducacional.api.WsRetornoParcelasPagar[] insertPlanoContaPagarResult) {
           this.insertPlanoContaPagarResult = insertPlanoContaPagarResult;
    }


    /**
     * Gets the insertPlanoContaPagarResult value for this InsertPlanoContaPagarResponse.
     * 
     * @return insertPlanoContaPagarResult
     */
    public br.net.sponteeducacional.api.WsRetornoParcelasPagar[] getInsertPlanoContaPagarResult() {
        return insertPlanoContaPagarResult;
    }


    /**
     * Sets the insertPlanoContaPagarResult value for this InsertPlanoContaPagarResponse.
     * 
     * @param insertPlanoContaPagarResult
     */
    public void setInsertPlanoContaPagarResult(br.net.sponteeducacional.api.WsRetornoParcelasPagar[] insertPlanoContaPagarResult) {
        this.insertPlanoContaPagarResult = insertPlanoContaPagarResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertPlanoContaPagarResponse)) return false;
        InsertPlanoContaPagarResponse other = (InsertPlanoContaPagarResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertPlanoContaPagarResult==null && other.getInsertPlanoContaPagarResult()==null) || 
             (this.insertPlanoContaPagarResult!=null &&
              java.util.Arrays.equals(this.insertPlanoContaPagarResult, other.getInsertPlanoContaPagarResult())));
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
        if (getInsertPlanoContaPagarResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInsertPlanoContaPagarResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInsertPlanoContaPagarResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertPlanoContaPagarResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertPlanoContaPagarResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertPlanoContaPagarResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertPlanoContaPagarResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelasPagar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelasPagar"));
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
