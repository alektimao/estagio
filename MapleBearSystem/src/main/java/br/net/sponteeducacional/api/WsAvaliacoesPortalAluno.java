/**
 * WsAvaliacoesPortalAluno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsAvaliacoesPortalAluno  implements java.io.Serializable {
    private int avaliacaoID;

    private java.lang.String dataInicial;

    private java.lang.String dataFinal;

    private int aulaLivre;

    private java.lang.String tipoAvaliacao;

    private java.lang.String descricao;

    private int cursoID;

    private java.lang.String nomeCurso;

    private int turmaID;

    private java.lang.String nomeTurma;

    private int disciplinaID;

    private java.lang.String nomeDisciplina;

    public WsAvaliacoesPortalAluno() {
    }

    public WsAvaliacoesPortalAluno(
           int avaliacaoID,
           java.lang.String dataInicial,
           java.lang.String dataFinal,
           int aulaLivre,
           java.lang.String tipoAvaliacao,
           java.lang.String descricao,
           int cursoID,
           java.lang.String nomeCurso,
           int turmaID,
           java.lang.String nomeTurma,
           int disciplinaID,
           java.lang.String nomeDisciplina) {
           this.avaliacaoID = avaliacaoID;
           this.dataInicial = dataInicial;
           this.dataFinal = dataFinal;
           this.aulaLivre = aulaLivre;
           this.tipoAvaliacao = tipoAvaliacao;
           this.descricao = descricao;
           this.cursoID = cursoID;
           this.nomeCurso = nomeCurso;
           this.turmaID = turmaID;
           this.nomeTurma = nomeTurma;
           this.disciplinaID = disciplinaID;
           this.nomeDisciplina = nomeDisciplina;
    }


    /**
     * Gets the avaliacaoID value for this WsAvaliacoesPortalAluno.
     * 
     * @return avaliacaoID
     */
    public int getAvaliacaoID() {
        return avaliacaoID;
    }


    /**
     * Sets the avaliacaoID value for this WsAvaliacoesPortalAluno.
     * 
     * @param avaliacaoID
     */
    public void setAvaliacaoID(int avaliacaoID) {
        this.avaliacaoID = avaliacaoID;
    }


    /**
     * Gets the dataInicial value for this WsAvaliacoesPortalAluno.
     * 
     * @return dataInicial
     */
    public java.lang.String getDataInicial() {
        return dataInicial;
    }


    /**
     * Sets the dataInicial value for this WsAvaliacoesPortalAluno.
     * 
     * @param dataInicial
     */
    public void setDataInicial(java.lang.String dataInicial) {
        this.dataInicial = dataInicial;
    }


    /**
     * Gets the dataFinal value for this WsAvaliacoesPortalAluno.
     * 
     * @return dataFinal
     */
    public java.lang.String getDataFinal() {
        return dataFinal;
    }


    /**
     * Sets the dataFinal value for this WsAvaliacoesPortalAluno.
     * 
     * @param dataFinal
     */
    public void setDataFinal(java.lang.String dataFinal) {
        this.dataFinal = dataFinal;
    }


    /**
     * Gets the aulaLivre value for this WsAvaliacoesPortalAluno.
     * 
     * @return aulaLivre
     */
    public int getAulaLivre() {
        return aulaLivre;
    }


    /**
     * Sets the aulaLivre value for this WsAvaliacoesPortalAluno.
     * 
     * @param aulaLivre
     */
    public void setAulaLivre(int aulaLivre) {
        this.aulaLivre = aulaLivre;
    }


    /**
     * Gets the tipoAvaliacao value for this WsAvaliacoesPortalAluno.
     * 
     * @return tipoAvaliacao
     */
    public java.lang.String getTipoAvaliacao() {
        return tipoAvaliacao;
    }


    /**
     * Sets the tipoAvaliacao value for this WsAvaliacoesPortalAluno.
     * 
     * @param tipoAvaliacao
     */
    public void setTipoAvaliacao(java.lang.String tipoAvaliacao) {
        this.tipoAvaliacao = tipoAvaliacao;
    }


    /**
     * Gets the descricao value for this WsAvaliacoesPortalAluno.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this WsAvaliacoesPortalAluno.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the cursoID value for this WsAvaliacoesPortalAluno.
     * 
     * @return cursoID
     */
    public int getCursoID() {
        return cursoID;
    }


    /**
     * Sets the cursoID value for this WsAvaliacoesPortalAluno.
     * 
     * @param cursoID
     */
    public void setCursoID(int cursoID) {
        this.cursoID = cursoID;
    }


    /**
     * Gets the nomeCurso value for this WsAvaliacoesPortalAluno.
     * 
     * @return nomeCurso
     */
    public java.lang.String getNomeCurso() {
        return nomeCurso;
    }


    /**
     * Sets the nomeCurso value for this WsAvaliacoesPortalAluno.
     * 
     * @param nomeCurso
     */
    public void setNomeCurso(java.lang.String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }


    /**
     * Gets the turmaID value for this WsAvaliacoesPortalAluno.
     * 
     * @return turmaID
     */
    public int getTurmaID() {
        return turmaID;
    }


    /**
     * Sets the turmaID value for this WsAvaliacoesPortalAluno.
     * 
     * @param turmaID
     */
    public void setTurmaID(int turmaID) {
        this.turmaID = turmaID;
    }


    /**
     * Gets the nomeTurma value for this WsAvaliacoesPortalAluno.
     * 
     * @return nomeTurma
     */
    public java.lang.String getNomeTurma() {
        return nomeTurma;
    }


    /**
     * Sets the nomeTurma value for this WsAvaliacoesPortalAluno.
     * 
     * @param nomeTurma
     */
    public void setNomeTurma(java.lang.String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }


    /**
     * Gets the disciplinaID value for this WsAvaliacoesPortalAluno.
     * 
     * @return disciplinaID
     */
    public int getDisciplinaID() {
        return disciplinaID;
    }


    /**
     * Sets the disciplinaID value for this WsAvaliacoesPortalAluno.
     * 
     * @param disciplinaID
     */
    public void setDisciplinaID(int disciplinaID) {
        this.disciplinaID = disciplinaID;
    }


    /**
     * Gets the nomeDisciplina value for this WsAvaliacoesPortalAluno.
     * 
     * @return nomeDisciplina
     */
    public java.lang.String getNomeDisciplina() {
        return nomeDisciplina;
    }


    /**
     * Sets the nomeDisciplina value for this WsAvaliacoesPortalAluno.
     * 
     * @param nomeDisciplina
     */
    public void setNomeDisciplina(java.lang.String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsAvaliacoesPortalAluno)) return false;
        WsAvaliacoesPortalAluno other = (WsAvaliacoesPortalAluno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.avaliacaoID == other.getAvaliacaoID() &&
            ((this.dataInicial==null && other.getDataInicial()==null) || 
             (this.dataInicial!=null &&
              this.dataInicial.equals(other.getDataInicial()))) &&
            ((this.dataFinal==null && other.getDataFinal()==null) || 
             (this.dataFinal!=null &&
              this.dataFinal.equals(other.getDataFinal()))) &&
            this.aulaLivre == other.getAulaLivre() &&
            ((this.tipoAvaliacao==null && other.getTipoAvaliacao()==null) || 
             (this.tipoAvaliacao!=null &&
              this.tipoAvaliacao.equals(other.getTipoAvaliacao()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            this.cursoID == other.getCursoID() &&
            ((this.nomeCurso==null && other.getNomeCurso()==null) || 
             (this.nomeCurso!=null &&
              this.nomeCurso.equals(other.getNomeCurso()))) &&
            this.turmaID == other.getTurmaID() &&
            ((this.nomeTurma==null && other.getNomeTurma()==null) || 
             (this.nomeTurma!=null &&
              this.nomeTurma.equals(other.getNomeTurma()))) &&
            this.disciplinaID == other.getDisciplinaID() &&
            ((this.nomeDisciplina==null && other.getNomeDisciplina()==null) || 
             (this.nomeDisciplina!=null &&
              this.nomeDisciplina.equals(other.getNomeDisciplina())));
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
        _hashCode += getAvaliacaoID();
        if (getDataInicial() != null) {
            _hashCode += getDataInicial().hashCode();
        }
        if (getDataFinal() != null) {
            _hashCode += getDataFinal().hashCode();
        }
        _hashCode += getAulaLivre();
        if (getTipoAvaliacao() != null) {
            _hashCode += getTipoAvaliacao().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        _hashCode += getCursoID();
        if (getNomeCurso() != null) {
            _hashCode += getNomeCurso().hashCode();
        }
        _hashCode += getTurmaID();
        if (getNomeTurma() != null) {
            _hashCode += getNomeTurma().hashCode();
        }
        _hashCode += getDisciplinaID();
        if (getNomeDisciplina() != null) {
            _hashCode += getNomeDisciplina().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsAvaliacoesPortalAluno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAvaliacoesPortalAluno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avaliacaoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AvaliacaoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataFinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aulaLivre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AulaLivre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoAvaliacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TipoAvaliacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("cursoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CursoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCurso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeCurso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("turmaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TurmaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeTurma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeTurma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disciplinaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DisciplinaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeDisciplina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeDisciplina"));
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
