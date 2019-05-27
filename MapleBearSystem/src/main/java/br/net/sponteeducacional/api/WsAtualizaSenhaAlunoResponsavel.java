/**
 * WsAtualizaSenhaAlunoResponsavel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsAtualizaSenhaAlunoResponsavel  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int alunoID;

    private int responsavelID;

    private java.lang.String senhaSponteNet;

    public WsAtualizaSenhaAlunoResponsavel() {
    }

    public WsAtualizaSenhaAlunoResponsavel(
           java.lang.String retornoOperacao,
           int alunoID,
           int responsavelID,
           java.lang.String senhaSponteNet) {
           this.retornoOperacao = retornoOperacao;
           this.alunoID = alunoID;
           this.responsavelID = responsavelID;
           this.senhaSponteNet = senhaSponteNet;
    }


    /**
     * Gets the retornoOperacao value for this WsAtualizaSenhaAlunoResponsavel.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsAtualizaSenhaAlunoResponsavel.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the alunoID value for this WsAtualizaSenhaAlunoResponsavel.
     * 
     * @return alunoID
     */
    public int getAlunoID() {
        return alunoID;
    }


    /**
     * Sets the alunoID value for this WsAtualizaSenhaAlunoResponsavel.
     * 
     * @param alunoID
     */
    public void setAlunoID(int alunoID) {
        this.alunoID = alunoID;
    }


    /**
     * Gets the responsavelID value for this WsAtualizaSenhaAlunoResponsavel.
     * 
     * @return responsavelID
     */
    public int getResponsavelID() {
        return responsavelID;
    }


    /**
     * Sets the responsavelID value for this WsAtualizaSenhaAlunoResponsavel.
     * 
     * @param responsavelID
     */
    public void setResponsavelID(int responsavelID) {
        this.responsavelID = responsavelID;
    }


    /**
     * Gets the senhaSponteNet value for this WsAtualizaSenhaAlunoResponsavel.
     * 
     * @return senhaSponteNet
     */
    public java.lang.String getSenhaSponteNet() {
        return senhaSponteNet;
    }


    /**
     * Sets the senhaSponteNet value for this WsAtualizaSenhaAlunoResponsavel.
     * 
     * @param senhaSponteNet
     */
    public void setSenhaSponteNet(java.lang.String senhaSponteNet) {
        this.senhaSponteNet = senhaSponteNet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsAtualizaSenhaAlunoResponsavel)) return false;
        WsAtualizaSenhaAlunoResponsavel other = (WsAtualizaSenhaAlunoResponsavel) obj;
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
            this.alunoID == other.getAlunoID() &&
            this.responsavelID == other.getResponsavelID() &&
            ((this.senhaSponteNet==null && other.getSenhaSponteNet()==null) || 
             (this.senhaSponteNet!=null &&
              this.senhaSponteNet.equals(other.getSenhaSponteNet())));
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
        _hashCode += getAlunoID();
        _hashCode += getResponsavelID();
        if (getSenhaSponteNet() != null) {
            _hashCode += getSenhaSponteNet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsAtualizaSenhaAlunoResponsavel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAtualizaSenhaAlunoResponsavel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alunoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AlunoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsavelID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ResponsavelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senhaSponteNet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SenhaSponteNet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
