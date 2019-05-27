/**
 * InsertPlanoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertPlanoResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsRetornoParcelas[] insertPlanoResult;

    public InsertPlanoResponse() {
    }

    public InsertPlanoResponse(
           br.net.sponteeducacional.api.WsRetornoParcelas[] insertPlanoResult) {
           this.insertPlanoResult = insertPlanoResult;
    }


    /**
     * Gets the insertPlanoResult value for this InsertPlanoResponse.
     * 
     * @return insertPlanoResult
     */
    public br.net.sponteeducacional.api.WsRetornoParcelas[] getInsertPlanoResult() {
        return insertPlanoResult;
    }


    /**
     * Sets the insertPlanoResult value for this InsertPlanoResponse.
     * 
     * @param insertPlanoResult
     */
    public void setInsertPlanoResult(br.net.sponteeducacional.api.WsRetornoParcelas[] insertPlanoResult) {
        this.insertPlanoResult = insertPlanoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertPlanoResponse)) return false;
        InsertPlanoResponse other = (InsertPlanoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertPlanoResult==null && other.getInsertPlanoResult()==null) || 
             (this.insertPlanoResult!=null &&
              java.util.Arrays.equals(this.insertPlanoResult, other.getInsertPlanoResult())));
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
        if (getInsertPlanoResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInsertPlanoResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInsertPlanoResult(), i);
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
        new org.apache.axis.description.TypeDesc(InsertPlanoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertPlanoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertPlanoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertPlanoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelas"));
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
