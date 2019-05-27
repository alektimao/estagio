/**
 * WsAtendimentos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsAtendimentos  implements java.io.Serializable {
    private int alunoID;

    private java.lang.String nomeAluno;

    private int funcionarioID;

    private java.lang.String nomeFuncionario;

    private int resultadoID;

    private java.lang.String descricaoResultado;

    private int tipoAtendimentoID;

    private java.lang.String nomeTipoAtendimento;

    private java.lang.String dataAtendimento;

    private java.lang.String retornoOperacao;

    private br.net.sponteeducacional.api.WsCursosAtendimentos[] cursos;

    public WsAtendimentos() {
    }

    public WsAtendimentos(
           int alunoID,
           java.lang.String nomeAluno,
           int funcionarioID,
           java.lang.String nomeFuncionario,
           int resultadoID,
           java.lang.String descricaoResultado,
           int tipoAtendimentoID,
           java.lang.String nomeTipoAtendimento,
           java.lang.String dataAtendimento,
           java.lang.String retornoOperacao,
           br.net.sponteeducacional.api.WsCursosAtendimentos[] cursos) {
           this.alunoID = alunoID;
           this.nomeAluno = nomeAluno;
           this.funcionarioID = funcionarioID;
           this.nomeFuncionario = nomeFuncionario;
           this.resultadoID = resultadoID;
           this.descricaoResultado = descricaoResultado;
           this.tipoAtendimentoID = tipoAtendimentoID;
           this.nomeTipoAtendimento = nomeTipoAtendimento;
           this.dataAtendimento = dataAtendimento;
           this.retornoOperacao = retornoOperacao;
           this.cursos = cursos;
    }


    /**
     * Gets the alunoID value for this WsAtendimentos.
     * 
     * @return alunoID
     */
    public int getAlunoID() {
        return alunoID;
    }


    /**
     * Sets the alunoID value for this WsAtendimentos.
     * 
     * @param alunoID
     */
    public void setAlunoID(int alunoID) {
        this.alunoID = alunoID;
    }


    /**
     * Gets the nomeAluno value for this WsAtendimentos.
     * 
     * @return nomeAluno
     */
    public java.lang.String getNomeAluno() {
        return nomeAluno;
    }


    /**
     * Sets the nomeAluno value for this WsAtendimentos.
     * 
     * @param nomeAluno
     */
    public void setNomeAluno(java.lang.String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }


    /**
     * Gets the funcionarioID value for this WsAtendimentos.
     * 
     * @return funcionarioID
     */
    public int getFuncionarioID() {
        return funcionarioID;
    }


    /**
     * Sets the funcionarioID value for this WsAtendimentos.
     * 
     * @param funcionarioID
     */
    public void setFuncionarioID(int funcionarioID) {
        this.funcionarioID = funcionarioID;
    }


    /**
     * Gets the nomeFuncionario value for this WsAtendimentos.
     * 
     * @return nomeFuncionario
     */
    public java.lang.String getNomeFuncionario() {
        return nomeFuncionario;
    }


    /**
     * Sets the nomeFuncionario value for this WsAtendimentos.
     * 
     * @param nomeFuncionario
     */
    public void setNomeFuncionario(java.lang.String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }


    /**
     * Gets the resultadoID value for this WsAtendimentos.
     * 
     * @return resultadoID
     */
    public int getResultadoID() {
        return resultadoID;
    }


    /**
     * Sets the resultadoID value for this WsAtendimentos.
     * 
     * @param resultadoID
     */
    public void setResultadoID(int resultadoID) {
        this.resultadoID = resultadoID;
    }


    /**
     * Gets the descricaoResultado value for this WsAtendimentos.
     * 
     * @return descricaoResultado
     */
    public java.lang.String getDescricaoResultado() {
        return descricaoResultado;
    }


    /**
     * Sets the descricaoResultado value for this WsAtendimentos.
     * 
     * @param descricaoResultado
     */
    public void setDescricaoResultado(java.lang.String descricaoResultado) {
        this.descricaoResultado = descricaoResultado;
    }


    /**
     * Gets the tipoAtendimentoID value for this WsAtendimentos.
     * 
     * @return tipoAtendimentoID
     */
    public int getTipoAtendimentoID() {
        return tipoAtendimentoID;
    }


    /**
     * Sets the tipoAtendimentoID value for this WsAtendimentos.
     * 
     * @param tipoAtendimentoID
     */
    public void setTipoAtendimentoID(int tipoAtendimentoID) {
        this.tipoAtendimentoID = tipoAtendimentoID;
    }


    /**
     * Gets the nomeTipoAtendimento value for this WsAtendimentos.
     * 
     * @return nomeTipoAtendimento
     */
    public java.lang.String getNomeTipoAtendimento() {
        return nomeTipoAtendimento;
    }


    /**
     * Sets the nomeTipoAtendimento value for this WsAtendimentos.
     * 
     * @param nomeTipoAtendimento
     */
    public void setNomeTipoAtendimento(java.lang.String nomeTipoAtendimento) {
        this.nomeTipoAtendimento = nomeTipoAtendimento;
    }


    /**
     * Gets the dataAtendimento value for this WsAtendimentos.
     * 
     * @return dataAtendimento
     */
    public java.lang.String getDataAtendimento() {
        return dataAtendimento;
    }


    /**
     * Sets the dataAtendimento value for this WsAtendimentos.
     * 
     * @param dataAtendimento
     */
    public void setDataAtendimento(java.lang.String dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }


    /**
     * Gets the retornoOperacao value for this WsAtendimentos.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsAtendimentos.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the cursos value for this WsAtendimentos.
     * 
     * @return cursos
     */
    public br.net.sponteeducacional.api.WsCursosAtendimentos[] getCursos() {
        return cursos;
    }


    /**
     * Sets the cursos value for this WsAtendimentos.
     * 
     * @param cursos
     */
    public void setCursos(br.net.sponteeducacional.api.WsCursosAtendimentos[] cursos) {
        this.cursos = cursos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsAtendimentos)) return false;
        WsAtendimentos other = (WsAtendimentos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.alunoID == other.getAlunoID() &&
            ((this.nomeAluno==null && other.getNomeAluno()==null) || 
             (this.nomeAluno!=null &&
              this.nomeAluno.equals(other.getNomeAluno()))) &&
            this.funcionarioID == other.getFuncionarioID() &&
            ((this.nomeFuncionario==null && other.getNomeFuncionario()==null) || 
             (this.nomeFuncionario!=null &&
              this.nomeFuncionario.equals(other.getNomeFuncionario()))) &&
            this.resultadoID == other.getResultadoID() &&
            ((this.descricaoResultado==null && other.getDescricaoResultado()==null) || 
             (this.descricaoResultado!=null &&
              this.descricaoResultado.equals(other.getDescricaoResultado()))) &&
            this.tipoAtendimentoID == other.getTipoAtendimentoID() &&
            ((this.nomeTipoAtendimento==null && other.getNomeTipoAtendimento()==null) || 
             (this.nomeTipoAtendimento!=null &&
              this.nomeTipoAtendimento.equals(other.getNomeTipoAtendimento()))) &&
            ((this.dataAtendimento==null && other.getDataAtendimento()==null) || 
             (this.dataAtendimento!=null &&
              this.dataAtendimento.equals(other.getDataAtendimento()))) &&
            ((this.retornoOperacao==null && other.getRetornoOperacao()==null) || 
             (this.retornoOperacao!=null &&
              this.retornoOperacao.equals(other.getRetornoOperacao()))) &&
            ((this.cursos==null && other.getCursos()==null) || 
             (this.cursos!=null &&
              java.util.Arrays.equals(this.cursos, other.getCursos())));
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
        _hashCode += getAlunoID();
        if (getNomeAluno() != null) {
            _hashCode += getNomeAluno().hashCode();
        }
        _hashCode += getFuncionarioID();
        if (getNomeFuncionario() != null) {
            _hashCode += getNomeFuncionario().hashCode();
        }
        _hashCode += getResultadoID();
        if (getDescricaoResultado() != null) {
            _hashCode += getDescricaoResultado().hashCode();
        }
        _hashCode += getTipoAtendimentoID();
        if (getNomeTipoAtendimento() != null) {
            _hashCode += getNomeTipoAtendimento().hashCode();
        }
        if (getDataAtendimento() != null) {
            _hashCode += getDataAtendimento().hashCode();
        }
        if (getRetornoOperacao() != null) {
            _hashCode += getRetornoOperacao().hashCode();
        }
        if (getCursos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCursos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCursos(), i);
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
        new org.apache.axis.description.TypeDesc(WsAtendimentos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAtendimentos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alunoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AlunoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeAluno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeAluno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funcionarioID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "FuncionarioID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeFuncionario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeFuncionario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultadoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ResultadoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoResultado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DescricaoResultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoAtendimentoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TipoAtendimentoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeTipoAtendimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeTipoAtendimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAtendimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataAtendimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cursos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Cursos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCursosAtendimentos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCursosAtendimentos"));
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
