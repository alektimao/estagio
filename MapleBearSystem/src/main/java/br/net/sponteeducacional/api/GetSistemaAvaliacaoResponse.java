/**
 * GetSistemaAvaliacaoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetSistemaAvaliacaoResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsSistemaAvaliacao[] getSistemaAvaliacaoResult;

    public GetSistemaAvaliacaoResponse() {
    }

    public GetSistemaAvaliacaoResponse(
           br.net.sponteeducacional.api.WsSistemaAvaliacao[] getSistemaAvaliacaoResult) {
           this.getSistemaAvaliacaoResult = getSistemaAvaliacaoResult;
    }


    /**
     * Gets the getSistemaAvaliacaoResult value for this GetSistemaAvaliacaoResponse.
     * 
     * @return getSistemaAvaliacaoResult
     */
    public br.net.sponteeducacional.api.WsSistemaAvaliacao[] getGetSistemaAvaliacaoResult() {
        return getSistemaAvaliacaoResult;
    }


    /**
     * Sets the getSistemaAvaliacaoResult value for this GetSistemaAvaliacaoResponse.
     * 
     * @param getSistemaAvaliacaoResult
     */
    public void setGetSistemaAvaliacaoResult(br.net.sponteeducacional.api.WsSistemaAvaliacao[] getSistemaAvaliacaoResult) {
        this.getSistemaAvaliacaoResult = getSistemaAvaliacaoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSistemaAvaliacaoResponse)) return false;
        GetSistemaAvaliacaoResponse other = (GetSistemaAvaliacaoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSistemaAvaliacaoResult==null && other.getGetSistemaAvaliacaoResult()==null) || 
             (this.getSistemaAvaliacaoResult!=null &&
              java.util.Arrays.equals(this.getSistemaAvaliacaoResult, other.getGetSistemaAvaliacaoResult())));
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
        if (getGetSistemaAvaliacaoResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetSistemaAvaliacaoResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetSistemaAvaliacaoResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetSistemaAvaliacaoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetSistemaAvaliacaoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSistemaAvaliacaoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetSistemaAvaliacaoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsSistemaAvaliacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsSistemaAvaliacao"));
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
