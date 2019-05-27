/**
 * WsRetornoParcelas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsRetornoParcelas  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int contaReceberID;

    private br.net.sponteeducacional.api.WsParcelas[] parcelas;

    public WsRetornoParcelas() {
    }

    public WsRetornoParcelas(
           java.lang.String retornoOperacao,
           int contaReceberID,
           br.net.sponteeducacional.api.WsParcelas[] parcelas) {
           this.retornoOperacao = retornoOperacao;
           this.contaReceberID = contaReceberID;
           this.parcelas = parcelas;
    }


    /**
     * Gets the retornoOperacao value for this WsRetornoParcelas.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsRetornoParcelas.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the contaReceberID value for this WsRetornoParcelas.
     * 
     * @return contaReceberID
     */
    public int getContaReceberID() {
        return contaReceberID;
    }


    /**
     * Sets the contaReceberID value for this WsRetornoParcelas.
     * 
     * @param contaReceberID
     */
    public void setContaReceberID(int contaReceberID) {
        this.contaReceberID = contaReceberID;
    }


    /**
     * Gets the parcelas value for this WsRetornoParcelas.
     * 
     * @return parcelas
     */
    public br.net.sponteeducacional.api.WsParcelas[] getParcelas() {
        return parcelas;
    }


    /**
     * Sets the parcelas value for this WsRetornoParcelas.
     * 
     * @param parcelas
     */
    public void setParcelas(br.net.sponteeducacional.api.WsParcelas[] parcelas) {
        this.parcelas = parcelas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsRetornoParcelas)) return false;
        WsRetornoParcelas other = (WsRetornoParcelas) obj;
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
            this.contaReceberID == other.getContaReceberID() &&
            ((this.parcelas==null && other.getParcelas()==null) || 
             (this.parcelas!=null &&
              java.util.Arrays.equals(this.parcelas, other.getParcelas())));
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
        _hashCode += getContaReceberID();
        if (getParcelas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParcelas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParcelas(), i);
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
        new org.apache.axis.description.TypeDesc(WsRetornoParcelas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaReceberID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ContaReceberID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Parcelas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcelas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcelas"));
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
