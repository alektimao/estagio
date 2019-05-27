/**
 * GetFrequenciaTurmaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetFrequenciaTurmaResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsFrequenciaTurma[] getFrequenciaTurmaResult;

    public GetFrequenciaTurmaResponse() {
    }

    public GetFrequenciaTurmaResponse(
           br.net.sponteeducacional.api.WsFrequenciaTurma[] getFrequenciaTurmaResult) {
           this.getFrequenciaTurmaResult = getFrequenciaTurmaResult;
    }


    /**
     * Gets the getFrequenciaTurmaResult value for this GetFrequenciaTurmaResponse.
     * 
     * @return getFrequenciaTurmaResult
     */
    public br.net.sponteeducacional.api.WsFrequenciaTurma[] getGetFrequenciaTurmaResult() {
        return getFrequenciaTurmaResult;
    }


    /**
     * Sets the getFrequenciaTurmaResult value for this GetFrequenciaTurmaResponse.
     * 
     * @param getFrequenciaTurmaResult
     */
    public void setGetFrequenciaTurmaResult(br.net.sponteeducacional.api.WsFrequenciaTurma[] getFrequenciaTurmaResult) {
        this.getFrequenciaTurmaResult = getFrequenciaTurmaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFrequenciaTurmaResponse)) return false;
        GetFrequenciaTurmaResponse other = (GetFrequenciaTurmaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFrequenciaTurmaResult==null && other.getGetFrequenciaTurmaResult()==null) || 
             (this.getFrequenciaTurmaResult!=null &&
              java.util.Arrays.equals(this.getFrequenciaTurmaResult, other.getGetFrequenciaTurmaResult())));
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
        if (getGetFrequenciaTurmaResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetFrequenciaTurmaResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetFrequenciaTurmaResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetFrequenciaTurmaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetFrequenciaTurmaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFrequenciaTurmaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetFrequenciaTurmaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaTurma"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaTurma"));
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
