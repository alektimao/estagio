/**
 * WsMensagensAPP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsMensagensAPP  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int mensagemID;

    private java.lang.String mensagemInicial;

    private java.lang.String dataUltimaResposta;

    private java.lang.String funcionario;

    private java.lang.String origemDestino;

    private java.lang.String ultimaMensagem;

    public WsMensagensAPP() {
    }

    public WsMensagensAPP(
           java.lang.String retornoOperacao,
           int mensagemID,
           java.lang.String mensagemInicial,
           java.lang.String dataUltimaResposta,
           java.lang.String funcionario,
           java.lang.String origemDestino,
           java.lang.String ultimaMensagem) {
           this.retornoOperacao = retornoOperacao;
           this.mensagemID = mensagemID;
           this.mensagemInicial = mensagemInicial;
           this.dataUltimaResposta = dataUltimaResposta;
           this.funcionario = funcionario;
           this.origemDestino = origemDestino;
           this.ultimaMensagem = ultimaMensagem;
    }


    /**
     * Gets the retornoOperacao value for this WsMensagensAPP.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsMensagensAPP.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the mensagemID value for this WsMensagensAPP.
     * 
     * @return mensagemID
     */
    public int getMensagemID() {
        return mensagemID;
    }


    /**
     * Sets the mensagemID value for this WsMensagensAPP.
     * 
     * @param mensagemID
     */
    public void setMensagemID(int mensagemID) {
        this.mensagemID = mensagemID;
    }


    /**
     * Gets the mensagemInicial value for this WsMensagensAPP.
     * 
     * @return mensagemInicial
     */
    public java.lang.String getMensagemInicial() {
        return mensagemInicial;
    }


    /**
     * Sets the mensagemInicial value for this WsMensagensAPP.
     * 
     * @param mensagemInicial
     */
    public void setMensagemInicial(java.lang.String mensagemInicial) {
        this.mensagemInicial = mensagemInicial;
    }


    /**
     * Gets the dataUltimaResposta value for this WsMensagensAPP.
     * 
     * @return dataUltimaResposta
     */
    public java.lang.String getDataUltimaResposta() {
        return dataUltimaResposta;
    }


    /**
     * Sets the dataUltimaResposta value for this WsMensagensAPP.
     * 
     * @param dataUltimaResposta
     */
    public void setDataUltimaResposta(java.lang.String dataUltimaResposta) {
        this.dataUltimaResposta = dataUltimaResposta;
    }


    /**
     * Gets the funcionario value for this WsMensagensAPP.
     * 
     * @return funcionario
     */
    public java.lang.String getFuncionario() {
        return funcionario;
    }


    /**
     * Sets the funcionario value for this WsMensagensAPP.
     * 
     * @param funcionario
     */
    public void setFuncionario(java.lang.String funcionario) {
        this.funcionario = funcionario;
    }


    /**
     * Gets the origemDestino value for this WsMensagensAPP.
     * 
     * @return origemDestino
     */
    public java.lang.String getOrigemDestino() {
        return origemDestino;
    }


    /**
     * Sets the origemDestino value for this WsMensagensAPP.
     * 
     * @param origemDestino
     */
    public void setOrigemDestino(java.lang.String origemDestino) {
        this.origemDestino = origemDestino;
    }


    /**
     * Gets the ultimaMensagem value for this WsMensagensAPP.
     * 
     * @return ultimaMensagem
     */
    public java.lang.String getUltimaMensagem() {
        return ultimaMensagem;
    }


    /**
     * Sets the ultimaMensagem value for this WsMensagensAPP.
     * 
     * @param ultimaMensagem
     */
    public void setUltimaMensagem(java.lang.String ultimaMensagem) {
        this.ultimaMensagem = ultimaMensagem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsMensagensAPP)) return false;
        WsMensagensAPP other = (WsMensagensAPP) obj;
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
            this.mensagemID == other.getMensagemID() &&
            ((this.mensagemInicial==null && other.getMensagemInicial()==null) || 
             (this.mensagemInicial!=null &&
              this.mensagemInicial.equals(other.getMensagemInicial()))) &&
            ((this.dataUltimaResposta==null && other.getDataUltimaResposta()==null) || 
             (this.dataUltimaResposta!=null &&
              this.dataUltimaResposta.equals(other.getDataUltimaResposta()))) &&
            ((this.funcionario==null && other.getFuncionario()==null) || 
             (this.funcionario!=null &&
              this.funcionario.equals(other.getFuncionario()))) &&
            ((this.origemDestino==null && other.getOrigemDestino()==null) || 
             (this.origemDestino!=null &&
              this.origemDestino.equals(other.getOrigemDestino()))) &&
            ((this.ultimaMensagem==null && other.getUltimaMensagem()==null) || 
             (this.ultimaMensagem!=null &&
              this.ultimaMensagem.equals(other.getUltimaMensagem())));
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
        _hashCode += getMensagemID();
        if (getMensagemInicial() != null) {
            _hashCode += getMensagemInicial().hashCode();
        }
        if (getDataUltimaResposta() != null) {
            _hashCode += getDataUltimaResposta().hashCode();
        }
        if (getFuncionario() != null) {
            _hashCode += getFuncionario().hashCode();
        }
        if (getOrigemDestino() != null) {
            _hashCode += getOrigemDestino().hashCode();
        }
        if (getUltimaMensagem() != null) {
            _hashCode += getUltimaMensagem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsMensagensAPP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMensagensAPP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "MensagemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagemInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "MensagemInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataUltimaResposta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataUltimaResposta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funcionario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Funcionario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origemDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "OrigemDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ultimaMensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UltimaMensagem"));
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
