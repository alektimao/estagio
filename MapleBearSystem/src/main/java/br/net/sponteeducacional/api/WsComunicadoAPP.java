/**
 * WsComunicadoAPP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsComunicadoAPP  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int comunicadoID;

    private java.lang.String comunicado;

    private java.lang.String data;

    private java.lang.String funcionario;

    private org.apache.axis.types.UnsignedByte lido;

    private java.lang.String descricao;

    private int alunoID;

    private br.net.sponteeducacional.api.WsAnexosComunicados[] anexos;

    public WsComunicadoAPP() {
    }

    public WsComunicadoAPP(
           java.lang.String retornoOperacao,
           int comunicadoID,
           java.lang.String comunicado,
           java.lang.String data,
           java.lang.String funcionario,
           org.apache.axis.types.UnsignedByte lido,
           java.lang.String descricao,
           int alunoID,
           br.net.sponteeducacional.api.WsAnexosComunicados[] anexos) {
           this.retornoOperacao = retornoOperacao;
           this.comunicadoID = comunicadoID;
           this.comunicado = comunicado;
           this.data = data;
           this.funcionario = funcionario;
           this.lido = lido;
           this.descricao = descricao;
           this.alunoID = alunoID;
           this.anexos = anexos;
    }


    /**
     * Gets the retornoOperacao value for this WsComunicadoAPP.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsComunicadoAPP.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the comunicadoID value for this WsComunicadoAPP.
     * 
     * @return comunicadoID
     */
    public int getComunicadoID() {
        return comunicadoID;
    }


    /**
     * Sets the comunicadoID value for this WsComunicadoAPP.
     * 
     * @param comunicadoID
     */
    public void setComunicadoID(int comunicadoID) {
        this.comunicadoID = comunicadoID;
    }


    /**
     * Gets the comunicado value for this WsComunicadoAPP.
     * 
     * @return comunicado
     */
    public java.lang.String getComunicado() {
        return comunicado;
    }


    /**
     * Sets the comunicado value for this WsComunicadoAPP.
     * 
     * @param comunicado
     */
    public void setComunicado(java.lang.String comunicado) {
        this.comunicado = comunicado;
    }


    /**
     * Gets the data value for this WsComunicadoAPP.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this WsComunicadoAPP.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the funcionario value for this WsComunicadoAPP.
     * 
     * @return funcionario
     */
    public java.lang.String getFuncionario() {
        return funcionario;
    }


    /**
     * Sets the funcionario value for this WsComunicadoAPP.
     * 
     * @param funcionario
     */
    public void setFuncionario(java.lang.String funcionario) {
        this.funcionario = funcionario;
    }


    /**
     * Gets the lido value for this WsComunicadoAPP.
     * 
     * @return lido
     */
    public org.apache.axis.types.UnsignedByte getLido() {
        return lido;
    }


    /**
     * Sets the lido value for this WsComunicadoAPP.
     * 
     * @param lido
     */
    public void setLido(org.apache.axis.types.UnsignedByte lido) {
        this.lido = lido;
    }


    /**
     * Gets the descricao value for this WsComunicadoAPP.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this WsComunicadoAPP.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the alunoID value for this WsComunicadoAPP.
     * 
     * @return alunoID
     */
    public int getAlunoID() {
        return alunoID;
    }


    /**
     * Sets the alunoID value for this WsComunicadoAPP.
     * 
     * @param alunoID
     */
    public void setAlunoID(int alunoID) {
        this.alunoID = alunoID;
    }


    /**
     * Gets the anexos value for this WsComunicadoAPP.
     * 
     * @return anexos
     */
    public br.net.sponteeducacional.api.WsAnexosComunicados[] getAnexos() {
        return anexos;
    }


    /**
     * Sets the anexos value for this WsComunicadoAPP.
     * 
     * @param anexos
     */
    public void setAnexos(br.net.sponteeducacional.api.WsAnexosComunicados[] anexos) {
        this.anexos = anexos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsComunicadoAPP)) return false;
        WsComunicadoAPP other = (WsComunicadoAPP) obj;
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
            ((this.comunicado==null && other.getComunicado()==null) || 
             (this.comunicado!=null &&
              this.comunicado.equals(other.getComunicado()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.funcionario==null && other.getFuncionario()==null) || 
             (this.funcionario!=null &&
              this.funcionario.equals(other.getFuncionario()))) &&
            ((this.lido==null && other.getLido()==null) || 
             (this.lido!=null &&
              this.lido.equals(other.getLido()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            this.alunoID == other.getAlunoID() &&
            ((this.anexos==null && other.getAnexos()==null) || 
             (this.anexos!=null &&
              java.util.Arrays.equals(this.anexos, other.getAnexos())));
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
        if (getComunicado() != null) {
            _hashCode += getComunicado().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getFuncionario() != null) {
            _hashCode += getFuncionario().hashCode();
        }
        if (getLido() != null) {
            _hashCode += getLido().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        _hashCode += getAlunoID();
        if (getAnexos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnexos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnexos(), i);
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
        new org.apache.axis.description.TypeDesc(WsComunicadoAPP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsComunicadoAPP"));
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
        elemField.setFieldName("comunicado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Comunicado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Data"));
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
        elemField.setFieldName("lido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Lido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Descricao"));
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
        elemField.setFieldName("anexos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Anexos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAnexosComunicados"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAnexosComunicados"));
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
