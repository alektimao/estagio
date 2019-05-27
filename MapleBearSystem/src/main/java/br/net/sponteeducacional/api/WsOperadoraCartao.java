/**
 * WsOperadoraCartao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsOperadoraCartao  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int operadoraCartaoID;

    private java.lang.String nomeOperadora;

    private br.net.sponteeducacional.api.WsOperadoraCartaoPlanos[] operadorasPlanos;

    public WsOperadoraCartao() {
    }

    public WsOperadoraCartao(
           java.lang.String retornoOperacao,
           int operadoraCartaoID,
           java.lang.String nomeOperadora,
           br.net.sponteeducacional.api.WsOperadoraCartaoPlanos[] operadorasPlanos) {
           this.retornoOperacao = retornoOperacao;
           this.operadoraCartaoID = operadoraCartaoID;
           this.nomeOperadora = nomeOperadora;
           this.operadorasPlanos = operadorasPlanos;
    }


    /**
     * Gets the retornoOperacao value for this WsOperadoraCartao.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsOperadoraCartao.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the operadoraCartaoID value for this WsOperadoraCartao.
     * 
     * @return operadoraCartaoID
     */
    public int getOperadoraCartaoID() {
        return operadoraCartaoID;
    }


    /**
     * Sets the operadoraCartaoID value for this WsOperadoraCartao.
     * 
     * @param operadoraCartaoID
     */
    public void setOperadoraCartaoID(int operadoraCartaoID) {
        this.operadoraCartaoID = operadoraCartaoID;
    }


    /**
     * Gets the nomeOperadora value for this WsOperadoraCartao.
     * 
     * @return nomeOperadora
     */
    public java.lang.String getNomeOperadora() {
        return nomeOperadora;
    }


    /**
     * Sets the nomeOperadora value for this WsOperadoraCartao.
     * 
     * @param nomeOperadora
     */
    public void setNomeOperadora(java.lang.String nomeOperadora) {
        this.nomeOperadora = nomeOperadora;
    }


    /**
     * Gets the operadorasPlanos value for this WsOperadoraCartao.
     * 
     * @return operadorasPlanos
     */
    public br.net.sponteeducacional.api.WsOperadoraCartaoPlanos[] getOperadorasPlanos() {
        return operadorasPlanos;
    }


    /**
     * Sets the operadorasPlanos value for this WsOperadoraCartao.
     * 
     * @param operadorasPlanos
     */
    public void setOperadorasPlanos(br.net.sponteeducacional.api.WsOperadoraCartaoPlanos[] operadorasPlanos) {
        this.operadorasPlanos = operadorasPlanos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsOperadoraCartao)) return false;
        WsOperadoraCartao other = (WsOperadoraCartao) obj;
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
            this.operadoraCartaoID == other.getOperadoraCartaoID() &&
            ((this.nomeOperadora==null && other.getNomeOperadora()==null) || 
             (this.nomeOperadora!=null &&
              this.nomeOperadora.equals(other.getNomeOperadora()))) &&
            ((this.operadorasPlanos==null && other.getOperadorasPlanos()==null) || 
             (this.operadorasPlanos!=null &&
              java.util.Arrays.equals(this.operadorasPlanos, other.getOperadorasPlanos())));
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
        _hashCode += getOperadoraCartaoID();
        if (getNomeOperadora() != null) {
            _hashCode += getNomeOperadora().hashCode();
        }
        if (getOperadorasPlanos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperadorasPlanos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperadorasPlanos(), i);
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
        new org.apache.axis.description.TypeDesc(WsOperadoraCartao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOperadoraCartao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operadoraCartaoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "OperadoraCartaoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeOperadora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeOperadora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operadorasPlanos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "OperadorasPlanos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOperadoraCartaoPlanos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOperadoraCartaoPlanos"));
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
