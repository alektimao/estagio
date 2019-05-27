/**
 * WsMatricula.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsMatricula  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int contratoID;

    private int contratoAulaLivreID;

    private int situacaoID;

    private java.lang.String situacao;

    private java.lang.String aluno;

    private int alunoID;

    private java.lang.String cursoID;

    private int turmaID;

    private java.lang.String nomeTurma;

    private java.lang.String nomeCurso;

    private int tipoContratoID;

    private java.lang.String dataInicio;

    private java.lang.String dataTermino;

    private java.lang.String dataMatricula;

    private int tipo;

    private java.lang.String contratante;

    private java.lang.String nomeMatrizCurricular;

    private java.lang.String financeiroLancado;

    private java.lang.String numeroContrato;

    private java.lang.String dataEncerramento;

    private br.net.sponteeducacional.api.WsDisciplinas[] disciplinas;

    private br.net.sponteeducacional.api.WsDisciplinasComTurma[] disciplinasComTurma;

    public WsMatricula() {
    }

    public WsMatricula(
           java.lang.String retornoOperacao,
           int contratoID,
           int contratoAulaLivreID,
           int situacaoID,
           java.lang.String situacao,
           java.lang.String aluno,
           int alunoID,
           java.lang.String cursoID,
           int turmaID,
           java.lang.String nomeTurma,
           java.lang.String nomeCurso,
           int tipoContratoID,
           java.lang.String dataInicio,
           java.lang.String dataTermino,
           java.lang.String dataMatricula,
           int tipo,
           java.lang.String contratante,
           java.lang.String nomeMatrizCurricular,
           java.lang.String financeiroLancado,
           java.lang.String numeroContrato,
           java.lang.String dataEncerramento,
           br.net.sponteeducacional.api.WsDisciplinas[] disciplinas,
           br.net.sponteeducacional.api.WsDisciplinasComTurma[] disciplinasComTurma) {
           this.retornoOperacao = retornoOperacao;
           this.contratoID = contratoID;
           this.contratoAulaLivreID = contratoAulaLivreID;
           this.situacaoID = situacaoID;
           this.situacao = situacao;
           this.aluno = aluno;
           this.alunoID = alunoID;
           this.cursoID = cursoID;
           this.turmaID = turmaID;
           this.nomeTurma = nomeTurma;
           this.nomeCurso = nomeCurso;
           this.tipoContratoID = tipoContratoID;
           this.dataInicio = dataInicio;
           this.dataTermino = dataTermino;
           this.dataMatricula = dataMatricula;
           this.tipo = tipo;
           this.contratante = contratante;
           this.nomeMatrizCurricular = nomeMatrizCurricular;
           this.financeiroLancado = financeiroLancado;
           this.numeroContrato = numeroContrato;
           this.dataEncerramento = dataEncerramento;
           this.disciplinas = disciplinas;
           this.disciplinasComTurma = disciplinasComTurma;
    }


    /**
     * Gets the retornoOperacao value for this WsMatricula.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsMatricula.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the contratoID value for this WsMatricula.
     * 
     * @return contratoID
     */
    public int getContratoID() {
        return contratoID;
    }


    /**
     * Sets the contratoID value for this WsMatricula.
     * 
     * @param contratoID
     */
    public void setContratoID(int contratoID) {
        this.contratoID = contratoID;
    }


    /**
     * Gets the contratoAulaLivreID value for this WsMatricula.
     * 
     * @return contratoAulaLivreID
     */
    public int getContratoAulaLivreID() {
        return contratoAulaLivreID;
    }


    /**
     * Sets the contratoAulaLivreID value for this WsMatricula.
     * 
     * @param contratoAulaLivreID
     */
    public void setContratoAulaLivreID(int contratoAulaLivreID) {
        this.contratoAulaLivreID = contratoAulaLivreID;
    }


    /**
     * Gets the situacaoID value for this WsMatricula.
     * 
     * @return situacaoID
     */
    public int getSituacaoID() {
        return situacaoID;
    }


    /**
     * Sets the situacaoID value for this WsMatricula.
     * 
     * @param situacaoID
     */
    public void setSituacaoID(int situacaoID) {
        this.situacaoID = situacaoID;
    }


    /**
     * Gets the situacao value for this WsMatricula.
     * 
     * @return situacao
     */
    public java.lang.String getSituacao() {
        return situacao;
    }


    /**
     * Sets the situacao value for this WsMatricula.
     * 
     * @param situacao
     */
    public void setSituacao(java.lang.String situacao) {
        this.situacao = situacao;
    }


    /**
     * Gets the aluno value for this WsMatricula.
     * 
     * @return aluno
     */
    public java.lang.String getAluno() {
        return aluno;
    }


    /**
     * Sets the aluno value for this WsMatricula.
     * 
     * @param aluno
     */
    public void setAluno(java.lang.String aluno) {
        this.aluno = aluno;
    }


    /**
     * Gets the alunoID value for this WsMatricula.
     * 
     * @return alunoID
     */
    public int getAlunoID() {
        return alunoID;
    }


    /**
     * Sets the alunoID value for this WsMatricula.
     * 
     * @param alunoID
     */
    public void setAlunoID(int alunoID) {
        this.alunoID = alunoID;
    }


    /**
     * Gets the cursoID value for this WsMatricula.
     * 
     * @return cursoID
     */
    public java.lang.String getCursoID() {
        return cursoID;
    }


    /**
     * Sets the cursoID value for this WsMatricula.
     * 
     * @param cursoID
     */
    public void setCursoID(java.lang.String cursoID) {
        this.cursoID = cursoID;
    }


    /**
     * Gets the turmaID value for this WsMatricula.
     * 
     * @return turmaID
     */
    public int getTurmaID() {
        return turmaID;
    }


    /**
     * Sets the turmaID value for this WsMatricula.
     * 
     * @param turmaID
     */
    public void setTurmaID(int turmaID) {
        this.turmaID = turmaID;
    }


    /**
     * Gets the nomeTurma value for this WsMatricula.
     * 
     * @return nomeTurma
     */
    public java.lang.String getNomeTurma() {
        return nomeTurma;
    }


    /**
     * Sets the nomeTurma value for this WsMatricula.
     * 
     * @param nomeTurma
     */
    public void setNomeTurma(java.lang.String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }


    /**
     * Gets the nomeCurso value for this WsMatricula.
     * 
     * @return nomeCurso
     */
    public java.lang.String getNomeCurso() {
        return nomeCurso;
    }


    /**
     * Sets the nomeCurso value for this WsMatricula.
     * 
     * @param nomeCurso
     */
    public void setNomeCurso(java.lang.String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }


    /**
     * Gets the tipoContratoID value for this WsMatricula.
     * 
     * @return tipoContratoID
     */
    public int getTipoContratoID() {
        return tipoContratoID;
    }


    /**
     * Sets the tipoContratoID value for this WsMatricula.
     * 
     * @param tipoContratoID
     */
    public void setTipoContratoID(int tipoContratoID) {
        this.tipoContratoID = tipoContratoID;
    }


    /**
     * Gets the dataInicio value for this WsMatricula.
     * 
     * @return dataInicio
     */
    public java.lang.String getDataInicio() {
        return dataInicio;
    }


    /**
     * Sets the dataInicio value for this WsMatricula.
     * 
     * @param dataInicio
     */
    public void setDataInicio(java.lang.String dataInicio) {
        this.dataInicio = dataInicio;
    }


    /**
     * Gets the dataTermino value for this WsMatricula.
     * 
     * @return dataTermino
     */
    public java.lang.String getDataTermino() {
        return dataTermino;
    }


    /**
     * Sets the dataTermino value for this WsMatricula.
     * 
     * @param dataTermino
     */
    public void setDataTermino(java.lang.String dataTermino) {
        this.dataTermino = dataTermino;
    }


    /**
     * Gets the dataMatricula value for this WsMatricula.
     * 
     * @return dataMatricula
     */
    public java.lang.String getDataMatricula() {
        return dataMatricula;
    }


    /**
     * Sets the dataMatricula value for this WsMatricula.
     * 
     * @param dataMatricula
     */
    public void setDataMatricula(java.lang.String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }


    /**
     * Gets the tipo value for this WsMatricula.
     * 
     * @return tipo
     */
    public int getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this WsMatricula.
     * 
     * @param tipo
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the contratante value for this WsMatricula.
     * 
     * @return contratante
     */
    public java.lang.String getContratante() {
        return contratante;
    }


    /**
     * Sets the contratante value for this WsMatricula.
     * 
     * @param contratante
     */
    public void setContratante(java.lang.String contratante) {
        this.contratante = contratante;
    }


    /**
     * Gets the nomeMatrizCurricular value for this WsMatricula.
     * 
     * @return nomeMatrizCurricular
     */
    public java.lang.String getNomeMatrizCurricular() {
        return nomeMatrizCurricular;
    }


    /**
     * Sets the nomeMatrizCurricular value for this WsMatricula.
     * 
     * @param nomeMatrizCurricular
     */
    public void setNomeMatrizCurricular(java.lang.String nomeMatrizCurricular) {
        this.nomeMatrizCurricular = nomeMatrizCurricular;
    }


    /**
     * Gets the financeiroLancado value for this WsMatricula.
     * 
     * @return financeiroLancado
     */
    public java.lang.String getFinanceiroLancado() {
        return financeiroLancado;
    }


    /**
     * Sets the financeiroLancado value for this WsMatricula.
     * 
     * @param financeiroLancado
     */
    public void setFinanceiroLancado(java.lang.String financeiroLancado) {
        this.financeiroLancado = financeiroLancado;
    }


    /**
     * Gets the numeroContrato value for this WsMatricula.
     * 
     * @return numeroContrato
     */
    public java.lang.String getNumeroContrato() {
        return numeroContrato;
    }


    /**
     * Sets the numeroContrato value for this WsMatricula.
     * 
     * @param numeroContrato
     */
    public void setNumeroContrato(java.lang.String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }


    /**
     * Gets the dataEncerramento value for this WsMatricula.
     * 
     * @return dataEncerramento
     */
    public java.lang.String getDataEncerramento() {
        return dataEncerramento;
    }


    /**
     * Sets the dataEncerramento value for this WsMatricula.
     * 
     * @param dataEncerramento
     */
    public void setDataEncerramento(java.lang.String dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }


    /**
     * Gets the disciplinas value for this WsMatricula.
     * 
     * @return disciplinas
     */
    public br.net.sponteeducacional.api.WsDisciplinas[] getDisciplinas() {
        return disciplinas;
    }


    /**
     * Sets the disciplinas value for this WsMatricula.
     * 
     * @param disciplinas
     */
    public void setDisciplinas(br.net.sponteeducacional.api.WsDisciplinas[] disciplinas) {
        this.disciplinas = disciplinas;
    }


    /**
     * Gets the disciplinasComTurma value for this WsMatricula.
     * 
     * @return disciplinasComTurma
     */
    public br.net.sponteeducacional.api.WsDisciplinasComTurma[] getDisciplinasComTurma() {
        return disciplinasComTurma;
    }


    /**
     * Sets the disciplinasComTurma value for this WsMatricula.
     * 
     * @param disciplinasComTurma
     */
    public void setDisciplinasComTurma(br.net.sponteeducacional.api.WsDisciplinasComTurma[] disciplinasComTurma) {
        this.disciplinasComTurma = disciplinasComTurma;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsMatricula)) return false;
        WsMatricula other = (WsMatricula) obj;
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
            this.contratoID == other.getContratoID() &&
            this.contratoAulaLivreID == other.getContratoAulaLivreID() &&
            this.situacaoID == other.getSituacaoID() &&
            ((this.situacao==null && other.getSituacao()==null) || 
             (this.situacao!=null &&
              this.situacao.equals(other.getSituacao()))) &&
            ((this.aluno==null && other.getAluno()==null) || 
             (this.aluno!=null &&
              this.aluno.equals(other.getAluno()))) &&
            this.alunoID == other.getAlunoID() &&
            ((this.cursoID==null && other.getCursoID()==null) || 
             (this.cursoID!=null &&
              this.cursoID.equals(other.getCursoID()))) &&
            this.turmaID == other.getTurmaID() &&
            ((this.nomeTurma==null && other.getNomeTurma()==null) || 
             (this.nomeTurma!=null &&
              this.nomeTurma.equals(other.getNomeTurma()))) &&
            ((this.nomeCurso==null && other.getNomeCurso()==null) || 
             (this.nomeCurso!=null &&
              this.nomeCurso.equals(other.getNomeCurso()))) &&
            this.tipoContratoID == other.getTipoContratoID() &&
            ((this.dataInicio==null && other.getDataInicio()==null) || 
             (this.dataInicio!=null &&
              this.dataInicio.equals(other.getDataInicio()))) &&
            ((this.dataTermino==null && other.getDataTermino()==null) || 
             (this.dataTermino!=null &&
              this.dataTermino.equals(other.getDataTermino()))) &&
            ((this.dataMatricula==null && other.getDataMatricula()==null) || 
             (this.dataMatricula!=null &&
              this.dataMatricula.equals(other.getDataMatricula()))) &&
            this.tipo == other.getTipo() &&
            ((this.contratante==null && other.getContratante()==null) || 
             (this.contratante!=null &&
              this.contratante.equals(other.getContratante()))) &&
            ((this.nomeMatrizCurricular==null && other.getNomeMatrizCurricular()==null) || 
             (this.nomeMatrizCurricular!=null &&
              this.nomeMatrizCurricular.equals(other.getNomeMatrizCurricular()))) &&
            ((this.financeiroLancado==null && other.getFinanceiroLancado()==null) || 
             (this.financeiroLancado!=null &&
              this.financeiroLancado.equals(other.getFinanceiroLancado()))) &&
            ((this.numeroContrato==null && other.getNumeroContrato()==null) || 
             (this.numeroContrato!=null &&
              this.numeroContrato.equals(other.getNumeroContrato()))) &&
            ((this.dataEncerramento==null && other.getDataEncerramento()==null) || 
             (this.dataEncerramento!=null &&
              this.dataEncerramento.equals(other.getDataEncerramento()))) &&
            ((this.disciplinas==null && other.getDisciplinas()==null) || 
             (this.disciplinas!=null &&
              java.util.Arrays.equals(this.disciplinas, other.getDisciplinas()))) &&
            ((this.disciplinasComTurma==null && other.getDisciplinasComTurma()==null) || 
             (this.disciplinasComTurma!=null &&
              java.util.Arrays.equals(this.disciplinasComTurma, other.getDisciplinasComTurma())));
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
        _hashCode += getContratoID();
        _hashCode += getContratoAulaLivreID();
        _hashCode += getSituacaoID();
        if (getSituacao() != null) {
            _hashCode += getSituacao().hashCode();
        }
        if (getAluno() != null) {
            _hashCode += getAluno().hashCode();
        }
        _hashCode += getAlunoID();
        if (getCursoID() != null) {
            _hashCode += getCursoID().hashCode();
        }
        _hashCode += getTurmaID();
        if (getNomeTurma() != null) {
            _hashCode += getNomeTurma().hashCode();
        }
        if (getNomeCurso() != null) {
            _hashCode += getNomeCurso().hashCode();
        }
        _hashCode += getTipoContratoID();
        if (getDataInicio() != null) {
            _hashCode += getDataInicio().hashCode();
        }
        if (getDataTermino() != null) {
            _hashCode += getDataTermino().hashCode();
        }
        if (getDataMatricula() != null) {
            _hashCode += getDataMatricula().hashCode();
        }
        _hashCode += getTipo();
        if (getContratante() != null) {
            _hashCode += getContratante().hashCode();
        }
        if (getNomeMatrizCurricular() != null) {
            _hashCode += getNomeMatrizCurricular().hashCode();
        }
        if (getFinanceiroLancado() != null) {
            _hashCode += getFinanceiroLancado().hashCode();
        }
        if (getNumeroContrato() != null) {
            _hashCode += getNumeroContrato().hashCode();
        }
        if (getDataEncerramento() != null) {
            _hashCode += getDataEncerramento().hashCode();
        }
        if (getDisciplinas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisciplinas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisciplinas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisciplinasComTurma() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisciplinasComTurma());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisciplinasComTurma(), i);
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
        new org.apache.axis.description.TypeDesc(WsMatricula.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMatricula"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contratoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ContratoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contratoAulaLivreID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ContratoAulaLivreID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacaoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SituacaoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("aluno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Aluno"));
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
        elemField.setFieldName("cursoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CursoID"));
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
        elemField.setFieldName("nomeCurso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeCurso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoContratoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TipoContratoID"));
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
        elemField.setFieldName("dataMatricula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataMatricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contratante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Contratante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeMatrizCurricular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeMatrizCurricular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financeiroLancado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "FinanceiroLancado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroContrato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroContrato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataEncerramento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataEncerramento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disciplinas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Disciplinas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplinas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplinas"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disciplinasComTurma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DisciplinasComTurma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplinasComTurma"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplinasComTurma"));
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
