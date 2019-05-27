/**
 * WsSituacoesAlunos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsSituacoesAlunos  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private br.net.sponteeducacional.api.SituacoesAlunos[] situacoesAlunos;

    public WsSituacoesAlunos() {
    }

    public WsSituacoesAlunos(
           java.lang.String retornoOperacao,
           br.net.sponteeducacional.api.SituacoesAlunos[] situacoesAlunos) {
           this.retornoOperacao = retornoOperacao;
           this.situacoesAlunos = situacoesAlunos;
    }


    /**
     * Gets the retornoOperacao value for this WsSituacoesAlunos.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsSituacoesAlunos.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the situacoesAlunos value for this WsSituacoesAlunos.
     * 
     * @return situacoesAlunos
     */
    public br.net.sponteeducacional.api.SituacoesAlunos[] getSituacoesAlunos() {
        return situacoesAlunos;
    }


    /**
     * Sets the situacoesAlunos value for this WsSituacoesAlunos.
     * 
     * @param situacoesAlunos
     */
    public void setSituacoesAlunos(br.net.sponteeducacional.api.SituacoesAlunos[] situacoesAlunos) {
        this.situacoesAlunos = situacoesAlunos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsSituacoesAlunos)) return false;
        WsSituacoesAlunos other = (WsSituacoesAlunos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.retornoOperacao==null && other.getRetornoOperacao()==null) || 
             (this.retornoOperacao!=null &&
              this.retornoOperacao.equals(other.getRetornoOperacao()))) &&
            ((this.situacoesAlunos==null && other.getSituacoesAlunos()==null) || 
             (this.situacoesAlunos!=null &&
              java.util.Arrays.equals(this.situacoesAlunos, other.getSituacoesAlunos())));
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
        if (getRetornoOperacao() != null) {
            _hashCode += getRetornoOperacao().hashCode();
        }
        if (getSituacoesAlunos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSituacoesAlunos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSituacoesAlunos(), i);
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
        new org.apache.axis.description.TypeDesc(WsSituacoesAlunos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsSituacoesAlunos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacoesAlunos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SituacoesAlunos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SituacoesAlunos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SituacoesAlunos"));
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
