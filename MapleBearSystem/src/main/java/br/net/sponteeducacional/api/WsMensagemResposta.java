/**
 * WsMensagemResposta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsMensagemResposta  implements java.io.Serializable {
    private int mensagemRespostaID;

    private java.lang.String resposta;

    private java.lang.String dataResposta;

    private org.apache.axis.types.UnsignedByte lido;

    private java.lang.String origemDestino;

    private int alunoID;

    private int responsavelID;

    private int funcionarioID;

    private java.lang.String foto;

    public WsMensagemResposta() {
    }

    public WsMensagemResposta(
           int mensagemRespostaID,
           java.lang.String resposta,
           java.lang.String dataResposta,
           org.apache.axis.types.UnsignedByte lido,
           java.lang.String origemDestino,
           int alunoID,
           int responsavelID,
           int funcionarioID,
           java.lang.String foto) {
           this.mensagemRespostaID = mensagemRespostaID;
           this.resposta = resposta;
           this.dataResposta = dataResposta;
           this.lido = lido;
           this.origemDestino = origemDestino;
           this.alunoID = alunoID;
           this.responsavelID = responsavelID;
           this.funcionarioID = funcionarioID;
           this.foto = foto;
    }


    /**
     * Gets the mensagemRespostaID value for this WsMensagemResposta.
     * 
     * @return mensagemRespostaID
     */
    public int getMensagemRespostaID() {
        return mensagemRespostaID;
    }


    /**
     * Sets the mensagemRespostaID value for this WsMensagemResposta.
     * 
     * @param mensagemRespostaID
     */
    public void setMensagemRespostaID(int mensagemRespostaID) {
        this.mensagemRespostaID = mensagemRespostaID;
    }


    /**
     * Gets the resposta value for this WsMensagemResposta.
     * 
     * @return resposta
     */
    public java.lang.String getResposta() {
        return resposta;
    }


    /**
     * Sets the resposta value for this WsMensagemResposta.
     * 
     * @param resposta
     */
    public void setResposta(java.lang.String resposta) {
        this.resposta = resposta;
    }


    /**
     * Gets the dataResposta value for this WsMensagemResposta.
     * 
     * @return dataResposta
     */
    public java.lang.String getDataResposta() {
        return dataResposta;
    }


    /**
     * Sets the dataResposta value for this WsMensagemResposta.
     * 
     * @param dataResposta
     */
    public void setDataResposta(java.lang.String dataResposta) {
        this.dataResposta = dataResposta;
    }


    /**
     * Gets the lido value for this WsMensagemResposta.
     * 
     * @return lido
     */
    public org.apache.axis.types.UnsignedByte getLido() {
        return lido;
    }


    /**
     * Sets the lido value for this WsMensagemResposta.
     * 
     * @param lido
     */
    public void setLido(org.apache.axis.types.UnsignedByte lido) {
        this.lido = lido;
    }


    /**
     * Gets the origemDestino value for this WsMensagemResposta.
     * 
     * @return origemDestino
     */
    public java.lang.String getOrigemDestino() {
        return origemDestino;
    }


    /**
     * Sets the origemDestino value for this WsMensagemResposta.
     * 
     * @param origemDestino
     */
    public void setOrigemDestino(java.lang.String origemDestino) {
        this.origemDestino = origemDestino;
    }


    /**
     * Gets the alunoID value for this WsMensagemResposta.
     * 
     * @return alunoID
     */
    public int getAlunoID() {
        return alunoID;
    }


    /**
     * Sets the alunoID value for this WsMensagemResposta.
     * 
     * @param alunoID
     */
    public void setAlunoID(int alunoID) {
        this.alunoID = alunoID;
    }


    /**
     * Gets the responsavelID value for this WsMensagemResposta.
     * 
     * @return responsavelID
     */
    public int getResponsavelID() {
        return responsavelID;
    }


    /**
     * Sets the responsavelID value for this WsMensagemResposta.
     * 
     * @param responsavelID
     */
    public void setResponsavelID(int responsavelID) {
        this.responsavelID = responsavelID;
    }


    /**
     * Gets the funcionarioID value for this WsMensagemResposta.
     * 
     * @return funcionarioID
     */
    public int getFuncionarioID() {
        return funcionarioID;
    }


    /**
     * Sets the funcionarioID value for this WsMensagemResposta.
     * 
     * @param funcionarioID
     */
    public void setFuncionarioID(int funcionarioID) {
        this.funcionarioID = funcionarioID;
    }


    /**
     * Gets the foto value for this WsMensagemResposta.
     * 
     * @return foto
     */
    public java.lang.String getFoto() {
        return foto;
    }


    /**
     * Sets the foto value for this WsMensagemResposta.
     * 
     * @param foto
     */
    public void setFoto(java.lang.String foto) {
        this.foto = foto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsMensagemResposta)) return false;
        WsMensagemResposta other = (WsMensagemResposta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.mensagemRespostaID == other.getMensagemRespostaID() &&
            ((this.resposta==null && other.getResposta()==null) || 
             (this.resposta!=null &&
              this.resposta.equals(other.getResposta()))) &&
            ((this.dataResposta==null && other.getDataResposta()==null) || 
             (this.dataResposta!=null &&
              this.dataResposta.equals(other.getDataResposta()))) &&
            ((this.lido==null && other.getLido()==null) || 
             (this.lido!=null &&
              this.lido.equals(other.getLido()))) &&
            ((this.origemDestino==null && other.getOrigemDestino()==null) || 
             (this.origemDestino!=null &&
              this.origemDestino.equals(other.getOrigemDestino()))) &&
            this.alunoID == other.getAlunoID() &&
            this.responsavelID == other.getResponsavelID() &&
            this.funcionarioID == other.getFuncionarioID() &&
            ((this.foto==null && other.getFoto()==null) || 
             (this.foto!=null &&
              this.foto.equals(other.getFoto())));
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
        _hashCode += getMensagemRespostaID();
        if (getResposta() != null) {
            _hashCode += getResposta().hashCode();
        }
        if (getDataResposta() != null) {
            _hashCode += getDataResposta().hashCode();
        }
        if (getLido() != null) {
            _hashCode += getLido().hashCode();
        }
        if (getOrigemDestino() != null) {
            _hashCode += getOrigemDestino().hashCode();
        }
        _hashCode += getAlunoID();
        _hashCode += getResponsavelID();
        _hashCode += getFuncionarioID();
        if (getFoto() != null) {
            _hashCode += getFoto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsMensagemResposta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMensagemResposta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagemRespostaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "MensagemRespostaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resposta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Resposta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataResposta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataResposta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Lido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
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
        elemField.setFieldName("funcionarioID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "FuncionarioID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Foto"));
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
