/**
 * WsAtualizaSituacaoComunicado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsAtualizaSituacaoComunicado  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int comunicadoID;

    private int alunoID;

    private int responsavelID;

    private org.apache.axis.types.UnsignedByte lido;

    public WsAtualizaSituacaoComunicado() {
    }

    public WsAtualizaSituacaoComunicado(
           java.lang.String retornoOperacao,
           int comunicadoID,
           int alunoID,
           int responsavelID,
           org.apache.axis.types.UnsignedByte lido) {
           this.retornoOperacao = retornoOperacao;
           this.comunicadoID = comunicadoID;
           this.alunoID = alunoID;
           this.responsavelID = responsavelID;
           this.lido = lido;
    }


    /**
     * Gets the retornoOperacao value for this WsAtualizaSituacaoComunicado.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsAtualizaSituacaoComunicado.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the comunicadoID value for this WsAtualizaSituacaoComunicado.
     * 
     * @return comunicadoID
     */
    public int getComunicadoID() {
        return comunicadoID;
    }


    /**
     * Sets the comunicadoID value for this WsAtualizaSituacaoComunicado.
     * 
     * @param comunicadoID
     */
    public void setComunicadoID(int comunicadoID) {
        this.comunicadoID = comunicadoID;
    }


    /**
     * Gets the alunoID value for this WsAtualizaSituacaoComunicado.
     * 
     * @return alunoID
     */
    public int getAlunoID() {
        return alunoID;
    }


    /**
     * Sets the alunoID value for this WsAtualizaSituacaoComunicado.
     * 
     * @param alunoID
     */
    public void setAlunoID(int alunoID) {
        this.alunoID = alunoID;
    }


    /**
     * Gets the responsavelID value for this WsAtualizaSituacaoComunicado.
     * 
     * @return responsavelID
     */
    public int getResponsavelID() {
        return responsavelID;
    }


    /**
     * Sets the responsavelID value for this WsAtualizaSituacaoComunicado.
     * 
     * @param responsavelID
     */
    public void setResponsavelID(int responsavelID) {
        this.responsavelID = responsavelID;
    }


    /**
     * Gets the lido value for this WsAtualizaSituacaoComunicado.
     * 
     * @return lido
     */
    public org.apache.axis.types.UnsignedByte getLido() {
        return lido;
    }


    /**
     * Sets the lido value for this WsAtualizaSituacaoComunicado.
     * 
     * @param lido
     */
    public void setLido(org.apache.axis.types.UnsignedByte lido) {
        this.lido = lido;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsAtualizaSituacaoComunicado)) return false;
        WsAtualizaSituacaoComunicado other = (WsAtualizaSituacaoComunicado) obj;
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
            this.comunicadoID == other.getComunicadoID() &&
            this.alunoID == other.getAlunoID() &&
            this.responsavelID == other.getResponsavelID() &&
            ((this.lido==null && other.getLido()==null) || 
             (this.lido!=null &&
              this.lido.equals(other.getLido())));
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
        _hashCode += getComunicadoID();
        _hashCode += getAlunoID();
        _hashCode += getResponsavelID();
        if (getLido() != null) {
            _hashCode += getLido().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsAtualizaSituacaoComunicado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAtualizaSituacaoComunicado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comunicadoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ComunicadoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("lido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Lido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
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
