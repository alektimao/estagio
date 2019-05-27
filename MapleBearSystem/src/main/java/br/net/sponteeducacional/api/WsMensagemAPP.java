/**
 * WsMensagemAPP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsMensagemAPP  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int mensagemID;

    private java.lang.String mensagemInicial;

    private java.lang.String funcionario;

    private java.lang.String origemDestino;

    private int alunoID;

    private int responsavelID;

    private int tipoInclusao;

    private br.net.sponteeducacional.api.WsMensagemResposta[] mensagemResposta;

    public WsMensagemAPP() {
    }

    public WsMensagemAPP(
           java.lang.String retornoOperacao,
           int mensagemID,
           java.lang.String mensagemInicial,
           java.lang.String funcionario,
           java.lang.String origemDestino,
           int alunoID,
           int responsavelID,
           int tipoInclusao,
           br.net.sponteeducacional.api.WsMensagemResposta[] mensagemResposta) {
           this.retornoOperacao = retornoOperacao;
           this.mensagemID = mensagemID;
           this.mensagemInicial = mensagemInicial;
           this.funcionario = funcionario;
           this.origemDestino = origemDestino;
           this.alunoID = alunoID;
           this.responsavelID = responsavelID;
           this.tipoInclusao = tipoInclusao;
           this.mensagemResposta = mensagemResposta;
    }


    /**
     * Gets the retornoOperacao value for this WsMensagemAPP.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsMensagemAPP.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the mensagemID value for this WsMensagemAPP.
     * 
     * @return mensagemID
     */
    public int getMensagemID() {
        return mensagemID;
    }


    /**
     * Sets the mensagemID value for this WsMensagemAPP.
     * 
     * @param mensagemID
     */
    public void setMensagemID(int mensagemID) {
        this.mensagemID = mensagemID;
    }


    /**
     * Gets the mensagemInicial value for this WsMensagemAPP.
     * 
     * @return mensagemInicial
     */
    public java.lang.String getMensagemInicial() {
        return mensagemInicial;
    }


    /**
     * Sets the mensagemInicial value for this WsMensagemAPP.
     * 
     * @param mensagemInicial
     */
    public void setMensagemInicial(java.lang.String mensagemInicial) {
        this.mensagemInicial = mensagemInicial;
    }


    /**
     * Gets the funcionario value for this WsMensagemAPP.
     * 
     * @return funcionario
     */
    public java.lang.String getFuncionario() {
        return funcionario;
    }


    /**
     * Sets the funcionario value for this WsMensagemAPP.
     * 
     * @param funcionario
     */
    public void setFuncionario(java.lang.String funcionario) {
        this.funcionario = funcionario;
    }


    /**
     * Gets the origemDestino value for this WsMensagemAPP.
     * 
     * @return origemDestino
     */
    public java.lang.String getOrigemDestino() {
        return origemDestino;
    }


    /**
     * Sets the origemDestino value for this WsMensagemAPP.
     * 
     * @param origemDestino
     */
    public void setOrigemDestino(java.lang.String origemDestino) {
        this.origemDestino = origemDestino;
    }


    /**
     * Gets the alunoID value for this WsMensagemAPP.
     * 
     * @return alunoID
     */
    public int getAlunoID() {
        return alunoID;
    }


    /**
     * Sets the alunoID value for this WsMensagemAPP.
     * 
     * @param alunoID
     */
    public void setAlunoID(int alunoID) {
        this.alunoID = alunoID;
    }


    /**
     * Gets the responsavelID value for this WsMensagemAPP.
     * 
     * @return responsavelID
     */
    public int getResponsavelID() {
        return responsavelID;
    }


    /**
     * Sets the responsavelID value for this WsMensagemAPP.
     * 
     * @param responsavelID
     */
    public void setResponsavelID(int responsavelID) {
        this.responsavelID = responsavelID;
    }


    /**
     * Gets the tipoInclusao value for this WsMensagemAPP.
     * 
     * @return tipoInclusao
     */
    public int getTipoInclusao() {
        return tipoInclusao;
    }


    /**
     * Sets the tipoInclusao value for this WsMensagemAPP.
     * 
     * @param tipoInclusao
     */
    public void setTipoInclusao(int tipoInclusao) {
        this.tipoInclusao = tipoInclusao;
    }


    /**
     * Gets the mensagemResposta value for this WsMensagemAPP.
     * 
     * @return mensagemResposta
     */
    public br.net.sponteeducacional.api.WsMensagemResposta[] getMensagemResposta() {
        return mensagemResposta;
    }


    /**
     * Sets the mensagemResposta value for this WsMensagemAPP.
     * 
     * @param mensagemResposta
     */
    public void setMensagemResposta(br.net.sponteeducacional.api.WsMensagemResposta[] mensagemResposta) {
        this.mensagemResposta = mensagemResposta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsMensagemAPP)) return false;
        WsMensagemAPP other = (WsMensagemAPP) obj;
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
            ((this.funcionario==null && other.getFuncionario()==null) || 
             (this.funcionario!=null &&
              this.funcionario.equals(other.getFuncionario()))) &&
            ((this.origemDestino==null && other.getOrigemDestino()==null) || 
             (this.origemDestino!=null &&
              this.origemDestino.equals(other.getOrigemDestino()))) &&
            this.alunoID == other.getAlunoID() &&
            this.responsavelID == other.getResponsavelID() &&
            this.tipoInclusao == other.getTipoInclusao() &&
            ((this.mensagemResposta==null && other.getMensagemResposta()==null) || 
             (this.mensagemResposta!=null &&
              java.util.Arrays.equals(this.mensagemResposta, other.getMensagemResposta())));
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
        if (getFuncionario() != null) {
            _hashCode += getFuncionario().hashCode();
        }
        if (getOrigemDestino() != null) {
            _hashCode += getOrigemDestino().hashCode();
        }
        _hashCode += getAlunoID();
        _hashCode += getResponsavelID();
        _hashCode += getTipoInclusao();
        if (getMensagemResposta() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMensagemResposta());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMensagemResposta(), i);
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
        new org.apache.axis.description.TypeDesc(WsMensagemAPP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMensagemAPP"));
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
        elemField.setFieldName("tipoInclusao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TipoInclusao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagemResposta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "MensagemResposta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMensagemResposta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMensagemResposta"));
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
