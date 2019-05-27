/**
 * WsRetornoBoletos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsRetornoBoletos  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private java.lang.String emailEnviado;

    private java.lang.String enderecoEmailEnviado;

    private br.net.sponteeducacional.api.WsBoletos[] dadosBoletos;

    public WsRetornoBoletos() {
    }

    public WsRetornoBoletos(
           java.lang.String retornoOperacao,
           java.lang.String emailEnviado,
           java.lang.String enderecoEmailEnviado,
           br.net.sponteeducacional.api.WsBoletos[] dadosBoletos) {
           this.retornoOperacao = retornoOperacao;
           this.emailEnviado = emailEnviado;
           this.enderecoEmailEnviado = enderecoEmailEnviado;
           this.dadosBoletos = dadosBoletos;
    }


    /**
     * Gets the retornoOperacao value for this WsRetornoBoletos.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsRetornoBoletos.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the emailEnviado value for this WsRetornoBoletos.
     * 
     * @return emailEnviado
     */
    public java.lang.String getEmailEnviado() {
        return emailEnviado;
    }


    /**
     * Sets the emailEnviado value for this WsRetornoBoletos.
     * 
     * @param emailEnviado
     */
    public void setEmailEnviado(java.lang.String emailEnviado) {
        this.emailEnviado = emailEnviado;
    }


    /**
     * Gets the enderecoEmailEnviado value for this WsRetornoBoletos.
     * 
     * @return enderecoEmailEnviado
     */
    public java.lang.String getEnderecoEmailEnviado() {
        return enderecoEmailEnviado;
    }


    /**
     * Sets the enderecoEmailEnviado value for this WsRetornoBoletos.
     * 
     * @param enderecoEmailEnviado
     */
    public void setEnderecoEmailEnviado(java.lang.String enderecoEmailEnviado) {
        this.enderecoEmailEnviado = enderecoEmailEnviado;
    }


    /**
     * Gets the dadosBoletos value for this WsRetornoBoletos.
     * 
     * @return dadosBoletos
     */
    public br.net.sponteeducacional.api.WsBoletos[] getDadosBoletos() {
        return dadosBoletos;
    }


    /**
     * Sets the dadosBoletos value for this WsRetornoBoletos.
     * 
     * @param dadosBoletos
     */
    public void setDadosBoletos(br.net.sponteeducacional.api.WsBoletos[] dadosBoletos) {
        this.dadosBoletos = dadosBoletos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsRetornoBoletos)) return false;
        WsRetornoBoletos other = (WsRetornoBoletos) obj;
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
            ((this.emailEnviado==null && other.getEmailEnviado()==null) || 
             (this.emailEnviado!=null &&
              this.emailEnviado.equals(other.getEmailEnviado()))) &&
            ((this.enderecoEmailEnviado==null && other.getEnderecoEmailEnviado()==null) || 
             (this.enderecoEmailEnviado!=null &&
              this.enderecoEmailEnviado.equals(other.getEnderecoEmailEnviado()))) &&
            ((this.dadosBoletos==null && other.getDadosBoletos()==null) || 
             (this.dadosBoletos!=null &&
              java.util.Arrays.equals(this.dadosBoletos, other.getDadosBoletos())));
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
        if (getEmailEnviado() != null) {
            _hashCode += getEmailEnviado().hashCode();
        }
        if (getEnderecoEmailEnviado() != null) {
            _hashCode += getEnderecoEmailEnviado().hashCode();
        }
        if (getDadosBoletos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDadosBoletos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDadosBoletos(), i);
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
        new org.apache.axis.description.TypeDesc(WsRetornoBoletos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoBoletos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailEnviado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "EmailEnviado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enderecoEmailEnviado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "EnderecoEmailEnviado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dadosBoletos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DadosBoletos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBoletos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBoletos"));
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
