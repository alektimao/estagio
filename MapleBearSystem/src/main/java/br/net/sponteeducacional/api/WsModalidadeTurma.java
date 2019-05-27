/**
 * WsModalidadeTurma.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsModalidadeTurma  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private br.net.sponteeducacional.api.ModalidadeTurma[] modalidadesTurmas;

    public WsModalidadeTurma() {
    }

    public WsModalidadeTurma(
           java.lang.String retornoOperacao,
           br.net.sponteeducacional.api.ModalidadeTurma[] modalidadesTurmas) {
           this.retornoOperacao = retornoOperacao;
           this.modalidadesTurmas = modalidadesTurmas;
    }


    /**
     * Gets the retornoOperacao value for this WsModalidadeTurma.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsModalidadeTurma.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the modalidadesTurmas value for this WsModalidadeTurma.
     * 
     * @return modalidadesTurmas
     */
    public br.net.sponteeducacional.api.ModalidadeTurma[] getModalidadesTurmas() {
        return modalidadesTurmas;
    }


    /**
     * Sets the modalidadesTurmas value for this WsModalidadeTurma.
     * 
     * @param modalidadesTurmas
     */
    public void setModalidadesTurmas(br.net.sponteeducacional.api.ModalidadeTurma[] modalidadesTurmas) {
        this.modalidadesTurmas = modalidadesTurmas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsModalidadeTurma)) return false;
        WsModalidadeTurma other = (WsModalidadeTurma) obj;
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
            ((this.modalidadesTurmas==null && other.getModalidadesTurmas()==null) || 
             (this.modalidadesTurmas!=null &&
              java.util.Arrays.equals(this.modalidadesTurmas, other.getModalidadesTurmas())));
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
        if (getModalidadesTurmas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModalidadesTurmas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModalidadesTurmas(), i);
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
        new org.apache.axis.description.TypeDesc(WsModalidadeTurma.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsModalidadeTurma"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modalidadesTurmas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ModalidadesTurmas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ModalidadeTurma"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ModalidadeTurma"));
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
