/**
 * WsTurma.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsTurma  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private java.lang.String nome;

    private int turmaID;

    private java.lang.String sigla;

    private java.lang.String situacao;

    private java.lang.String turno;

    private int moduloAtual;

    private int cursoID;

    private java.lang.String curso;

    private int anoLetivo;

    private java.lang.String dataInicio;

    private java.lang.String dataTermino;

    private int maxAlunos;

    private int vagasOcupadas;

    private java.lang.String matrizCurricular;

    private java.lang.String observacao;

    private java.lang.String horario;

    private java.lang.String professorRegente;

    private java.lang.String professorRegenteID;

    public WsTurma() {
    }

    public WsTurma(
           java.lang.String retornoOperacao,
           java.lang.String nome,
           int turmaID,
           java.lang.String sigla,
           java.lang.String situacao,
           java.lang.String turno,
           int moduloAtual,
           int cursoID,
           java.lang.String curso,
           int anoLetivo,
           java.lang.String dataInicio,
           java.lang.String dataTermino,
           int maxAlunos,
           int vagasOcupadas,
           java.lang.String matrizCurricular,
           java.lang.String observacao,
           java.lang.String horario,
           java.lang.String professorRegente,
           java.lang.String professorRegenteID) {
           this.retornoOperacao = retornoOperacao;
           this.nome = nome;
           this.turmaID = turmaID;
           this.sigla = sigla;
           this.situacao = situacao;
           this.turno = turno;
           this.moduloAtual = moduloAtual;
           this.cursoID = cursoID;
           this.curso = curso;
           this.anoLetivo = anoLetivo;
           this.dataInicio = dataInicio;
           this.dataTermino = dataTermino;
           this.maxAlunos = maxAlunos;
           this.vagasOcupadas = vagasOcupadas;
           this.matrizCurricular = matrizCurricular;
           this.observacao = observacao;
           this.horario = horario;
           this.professorRegente = professorRegente;
           this.professorRegenteID = professorRegenteID;
    }


    /**
     * Gets the retornoOperacao value for this WsTurma.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsTurma.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the nome value for this WsTurma.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this WsTurma.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the turmaID value for this WsTurma.
     * 
     * @return turmaID
     */
    public int getTurmaID() {
        return turmaID;
    }


    /**
     * Sets the turmaID value for this WsTurma.
     * 
     * @param turmaID
     */
    public void setTurmaID(int turmaID) {
        this.turmaID = turmaID;
    }


    /**
     * Gets the sigla value for this WsTurma.
     * 
     * @return sigla
     */
    public java.lang.String getSigla() {
        return sigla;
    }


    /**
     * Sets the sigla value for this WsTurma.
     * 
     * @param sigla
     */
    public void setSigla(java.lang.String sigla) {
        this.sigla = sigla;
    }


    /**
     * Gets the situacao value for this WsTurma.
     * 
     * @return situacao
     */
    public java.lang.String getSituacao() {
        return situacao;
    }


    /**
     * Sets the situacao value for this WsTurma.
     * 
     * @param situacao
     */
    public void setSituacao(java.lang.String situacao) {
        this.situacao = situacao;
    }


    /**
     * Gets the turno value for this WsTurma.
     * 
     * @return turno
     */
    public java.lang.String getTurno() {
        return turno;
    }


    /**
     * Sets the turno value for this WsTurma.
     * 
     * @param turno
     */
    public void setTurno(java.lang.String turno) {
        this.turno = turno;
    }


    /**
     * Gets the moduloAtual value for this WsTurma.
     * 
     * @return moduloAtual
     */
    public int getModuloAtual() {
        return moduloAtual;
    }


    /**
     * Sets the moduloAtual value for this WsTurma.
     * 
     * @param moduloAtual
     */
    public void setModuloAtual(int moduloAtual) {
        this.moduloAtual = moduloAtual;
    }


    /**
     * Gets the cursoID value for this WsTurma.
     * 
     * @return cursoID
     */
    public int getCursoID() {
        return cursoID;
    }


    /**
     * Sets the cursoID value for this WsTurma.
     * 
     * @param cursoID
     */
    public void setCursoID(int cursoID) {
        this.cursoID = cursoID;
    }


    /**
     * Gets the curso value for this WsTurma.
     * 
     * @return curso
     */
    public java.lang.String getCurso() {
        return curso;
    }


    /**
     * Sets the curso value for this WsTurma.
     * 
     * @param curso
     */
    public void setCurso(java.lang.String curso) {
        this.curso = curso;
    }


    /**
     * Gets the anoLetivo value for this WsTurma.
     * 
     * @return anoLetivo
     */
    public int getAnoLetivo() {
        return anoLetivo;
    }


    /**
     * Sets the anoLetivo value for this WsTurma.
     * 
     * @param anoLetivo
     */
    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }


    /**
     * Gets the dataInicio value for this WsTurma.
     * 
     * @return dataInicio
     */
    public java.lang.String getDataInicio() {
        return dataInicio;
    }


    /**
     * Sets the dataInicio value for this WsTurma.
     * 
     * @param dataInicio
     */
    public void setDataInicio(java.lang.String dataInicio) {
        this.dataInicio = dataInicio;
    }


    /**
     * Gets the dataTermino value for this WsTurma.
     * 
     * @return dataTermino
     */
    public java.lang.String getDataTermino() {
        return dataTermino;
    }


    /**
     * Sets the dataTermino value for this WsTurma.
     * 
     * @param dataTermino
     */
    public void setDataTermino(java.lang.String dataTermino) {
        this.dataTermino = dataTermino;
    }


    /**
     * Gets the maxAlunos value for this WsTurma.
     * 
     * @return maxAlunos
     */
    public int getMaxAlunos() {
        return maxAlunos;
    }


    /**
     * Sets the maxAlunos value for this WsTurma.
     * 
     * @param maxAlunos
     */
    public void setMaxAlunos(int maxAlunos) {
        this.maxAlunos = maxAlunos;
    }


    /**
     * Gets the vagasOcupadas value for this WsTurma.
     * 
     * @return vagasOcupadas
     */
    public int getVagasOcupadas() {
        return vagasOcupadas;
    }


    /**
     * Sets the vagasOcupadas value for this WsTurma.
     * 
     * @param vagasOcupadas
     */
    public void setVagasOcupadas(int vagasOcupadas) {
        this.vagasOcupadas = vagasOcupadas;
    }


    /**
     * Gets the matrizCurricular value for this WsTurma.
     * 
     * @return matrizCurricular
     */
    public java.lang.String getMatrizCurricular() {
        return matrizCurricular;
    }


    /**
     * Sets the matrizCurricular value for this WsTurma.
     * 
     * @param matrizCurricular
     */
    public void setMatrizCurricular(java.lang.String matrizCurricular) {
        this.matrizCurricular = matrizCurricular;
    }


    /**
     * Gets the observacao value for this WsTurma.
     * 
     * @return observacao
     */
    public java.lang.String getObservacao() {
        return observacao;
    }


    /**
     * Sets the observacao value for this WsTurma.
     * 
     * @param observacao
     */
    public void setObservacao(java.lang.String observacao) {
        this.observacao = observacao;
    }


    /**
     * Gets the horario value for this WsTurma.
     * 
     * @return horario
     */
    public java.lang.String getHorario() {
        return horario;
    }


    /**
     * Sets the horario value for this WsTurma.
     * 
     * @param horario
     */
    public void setHorario(java.lang.String horario) {
        this.horario = horario;
    }


    /**
     * Gets the professorRegente value for this WsTurma.
     * 
     * @return professorRegente
     */
    public java.lang.String getProfessorRegente() {
        return professorRegente;
    }


    /**
     * Sets the professorRegente value for this WsTurma.
     * 
     * @param professorRegente
     */
    public void setProfessorRegente(java.lang.String professorRegente) {
        this.professorRegente = professorRegente;
    }


    /**
     * Gets the professorRegenteID value for this WsTurma.
     * 
     * @return professorRegenteID
     */
    public java.lang.String getProfessorRegenteID() {
        return professorRegenteID;
    }


    /**
     * Sets the professorRegenteID value for this WsTurma.
     * 
     * @param professorRegenteID
     */
    public void setProfessorRegenteID(java.lang.String professorRegenteID) {
        this.professorRegenteID = professorRegenteID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsTurma)) return false;
        WsTurma other = (WsTurma) obj;
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
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            this.turmaID == other.getTurmaID() &&
            ((this.sigla==null && other.getSigla()==null) || 
             (this.sigla!=null &&
              this.sigla.equals(other.getSigla()))) &&
            ((this.situacao==null && other.getSituacao()==null) || 
             (this.situacao!=null &&
              this.situacao.equals(other.getSituacao()))) &&
            ((this.turno==null && other.getTurno()==null) || 
             (this.turno!=null &&
              this.turno.equals(other.getTurno()))) &&
            this.moduloAtual == other.getModuloAtual() &&
            this.cursoID == other.getCursoID() &&
            ((this.curso==null && other.getCurso()==null) || 
             (this.curso!=null &&
              this.curso.equals(other.getCurso()))) &&
            this.anoLetivo == other.getAnoLetivo() &&
            ((this.dataInicio==null && other.getDataInicio()==null) || 
             (this.dataInicio!=null &&
              this.dataInicio.equals(other.getDataInicio()))) &&
            ((this.dataTermino==null && other.getDataTermino()==null) || 
             (this.dataTermino!=null &&
              this.dataTermino.equals(other.getDataTermino()))) &&
            this.maxAlunos == other.getMaxAlunos() &&
            this.vagasOcupadas == other.getVagasOcupadas() &&
            ((this.matrizCurricular==null && other.getMatrizCurricular()==null) || 
             (this.matrizCurricular!=null &&
              this.matrizCurricular.equals(other.getMatrizCurricular()))) &&
            ((this.observacao==null && other.getObservacao()==null) || 
             (this.observacao!=null &&
              this.observacao.equals(other.getObservacao()))) &&
            ((this.horario==null && other.getHorario()==null) || 
             (this.horario!=null &&
              this.horario.equals(other.getHorario()))) &&
            ((this.professorRegente==null && other.getProfessorRegente()==null) || 
             (this.professorRegente!=null &&
              this.professorRegente.equals(other.getProfessorRegente()))) &&
            ((this.professorRegenteID==null && other.getProfessorRegenteID()==null) || 
             (this.professorRegenteID!=null &&
              this.professorRegenteID.equals(other.getProfessorRegenteID())));
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        _hashCode += getTurmaID();
        if (getSigla() != null) {
            _hashCode += getSigla().hashCode();
        }
        if (getSituacao() != null) {
            _hashCode += getSituacao().hashCode();
        }
        if (getTurno() != null) {
            _hashCode += getTurno().hashCode();
        }
        _hashCode += getModuloAtual();
        _hashCode += getCursoID();
        if (getCurso() != null) {
            _hashCode += getCurso().hashCode();
        }
        _hashCode += getAnoLetivo();
        if (getDataInicio() != null) {
            _hashCode += getDataInicio().hashCode();
        }
        if (getDataTermino() != null) {
            _hashCode += getDataTermino().hashCode();
        }
        _hashCode += getMaxAlunos();
        _hashCode += getVagasOcupadas();
        if (getMatrizCurricular() != null) {
            _hashCode += getMatrizCurricular().hashCode();
        }
        if (getObservacao() != null) {
            _hashCode += getObservacao().hashCode();
        }
        if (getHorario() != null) {
            _hashCode += getHorario().hashCode();
        }
        if (getProfessorRegente() != null) {
            _hashCode += getProfessorRegente().hashCode();
        }
        if (getProfessorRegenteID() != null) {
            _hashCode += getProfessorRegenteID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsTurma.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsTurma"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Nome"));
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
        elemField.setFieldName("sigla");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Sigla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Situacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("turno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Turno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduloAtual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ModuloAtual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cursoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CursoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Curso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anoLetivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AnoLetivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataTermino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataTermino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAlunos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "MaxAlunos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vagasOcupadas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "VagasOcupadas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrizCurricular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "MatrizCurricular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Observacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Horario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("professorRegente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ProfessorRegente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("professorRegenteID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ProfessorRegenteID"));
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
