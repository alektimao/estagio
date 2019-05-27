/**
 * GetSituacoesAlunosResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetSituacoesAlunosResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsSituacoesAlunos[] getSituacoesAlunosResult;

    public GetSituacoesAlunosResponse() {
    }

    public GetSituacoesAlunosResponse(
           br.net.sponteeducacional.api.WsSituacoesAlunos[] getSituacoesAlunosResult) {
           this.getSituacoesAlunosResult = getSituacoesAlunosResult;
    }


    /**
     * Gets the getSituacoesAlunosResult value for this GetSituacoesAlunosResponse.
     * 
     * @return getSituacoesAlunosResult
     */
    public br.net.sponteeducacional.api.WsSituacoesAlunos[] getGetSituacoesAlunosResult() {
        return getSituacoesAlunosResult;
    }


    /**
     * Sets the getSituacoesAlunosResult value for this GetSituacoesAlunosResponse.
     * 
     * @param getSituacoesAlunosResult
     */
    public void setGetSituacoesAlunosResult(br.net.sponteeducacional.api.WsSituacoesAlunos[] getSituacoesAlunosResult) {
        this.getSituacoesAlunosResult = getSituacoesAlunosResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSituacoesAlunosResponse)) return false;
        GetSituacoesAlunosResponse other = (GetSituacoesAlunosResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSituacoesAlunosResult==null && other.getGetSituacoesAlunosResult()==null) || 
             (this.getSituacoesAlunosResult!=null &&
              java.util.Arrays.equals(this.getSituacoesAlunosResult, other.getGetSituacoesAlunosResult())));
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
        if (getGetSituacoesAlunosResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetSituacoesAlunosResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetSituacoesAlunosResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetSituacoesAlunosResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetSituacoesAlunosResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSituacoesAlunosResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetSituacoesAlunosResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsSituacoesAlunos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsSituacoesAlunos"));
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
