/**
 * WsConta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsConta  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private br.net.sponteeducacional.api.Contas[] contas;

    public WsConta() {
    }

    public WsConta(
           java.lang.String retornoOperacao,
           br.net.sponteeducacional.api.Contas[] contas) {
           this.retornoOperacao = retornoOperacao;
           this.contas = contas;
    }


    /**
     * Gets the retornoOperacao value for this WsConta.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsConta.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the contas value for this WsConta.
     * 
     * @return contas
     */
    public br.net.sponteeducacional.api.Contas[] getContas() {
        return contas;
    }


    /**
     * Sets the contas value for this WsConta.
     * 
     * @param contas
     */
    public void setContas(br.net.sponteeducacional.api.Contas[] contas) {
        this.contas = contas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsConta)) return false;
        WsConta other = (WsConta) obj;
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
            ((this.contas==null && other.getContas()==null) || 
             (this.contas!=null &&
              java.util.Arrays.equals(this.contas, other.getContas())));
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
        if (getContas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContas(), i);
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
        new org.apache.axis.description.TypeDesc(WsConta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsConta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Contas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Contas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Contas"));
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
