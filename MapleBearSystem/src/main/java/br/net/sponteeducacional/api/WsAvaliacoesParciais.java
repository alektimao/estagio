/**
 * WsAvaliacoesParciais.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsAvaliacoesParciais  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int avaliacaoID;

    private java.lang.String nomeAvaliacao;

    private double peso;

    private int ordem;

    private int turmaID;

    private java.lang.String nomeTurma;

    private int disciplinaID;

    private java.lang.String nomeDisciplina;

    private int periodo;

    private java.lang.String nomePeriodo;

    private java.lang.String formulaCalculoLivre;

    private br.net.sponteeducacional.api.WsGrupoAvaliacao grupo;

    public WsAvaliacoesParciais() {
    }

    public WsAvaliacoesParciais(
           java.lang.String retornoOperacao,
           int avaliacaoID,
           java.lang.String nomeAvaliacao,
           double peso,
           int ordem,
           int turmaID,
           java.lang.String nomeTurma,
           int disciplinaID,
           java.lang.String nomeDisciplina,
           int periodo,
           java.lang.String nomePeriodo,
           java.lang.String formulaCalculoLivre,
           br.net.sponteeducacional.api.WsGrupoAvaliacao grupo) {
           this.retornoOperacao = retornoOperacao;
           this.avaliacaoID = avaliacaoID;
           this.nomeAvaliacao = nomeAvaliacao;
           this.peso = peso;
           this.ordem = ordem;
           this.turmaID = turmaID;
           this.nomeTurma = nomeTurma;
           this.disciplinaID = disciplinaID;
           this.nomeDisciplina = nomeDisciplina;
           this.periodo = periodo;
           this.nomePeriodo = nomePeriodo;
           this.formulaCalculoLivre = formulaCalculoLivre;
           this.grupo = grupo;
    }


    /**
     * Gets the retornoOperacao value for this WsAvaliacoesParciais.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsAvaliacoesParciais.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the avaliacaoID value for this WsAvaliacoesParciais.
     * 
     * @return avaliacaoID
     */
    public int getAvaliacaoID() {
        return avaliacaoID;
    }


    /**
     * Sets the avaliacaoID value for this WsAvaliacoesParciais.
     * 
     * @param avaliacaoID
     */
    public void setAvaliacaoID(int avaliacaoID) {
        this.avaliacaoID = avaliacaoID;
    }


    /**
     * Gets the nomeAvaliacao value for this WsAvaliacoesParciais.
     * 
     * @return nomeAvaliacao
     */
    public java.lang.String getNomeAvaliacao() {
        return nomeAvaliacao;
    }


    /**
     * Sets the nomeAvaliacao value for this WsAvaliacoesParciais.
     * 
     * @param nomeAvaliacao
     */
    public void setNomeAvaliacao(java.lang.String nomeAvaliacao) {
        this.nomeAvaliacao = nomeAvaliacao;
    }


    /**
     * Gets the peso value for this WsAvaliacoesParciais.
     * 
     * @return peso
     */
    public double getPeso() {
        return peso;
    }


    /**
     * Sets the peso value for this WsAvaliacoesParciais.
     * 
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }


    /**
     * Gets the ordem value for this WsAvaliacoesParciais.
     * 
     * @return ordem
     */
    public int getOrdem() {
        return ordem;
    }


    /**
     * Sets the ordem value for this WsAvaliacoesParciais.
     * 
     * @param ordem
     */
    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }


    /**
     * Gets the turmaID value for this WsAvaliacoesParciais.
     * 
     * @return turmaID
     */
    public int getTurmaID() {
        return turmaID;
    }


    /**
     * Sets the turmaID value for this WsAvaliacoesParciais.
     * 
     * @param turmaID
     */
    public void setTurmaID(int turmaID) {
        this.turmaID = turmaID;
    }


    /**
     * Gets the nomeTurma value for this WsAvaliacoesParciais.
     * 
     * @return nomeTurma
     */
    public java.lang.String getNomeTurma() {
        return nomeTurma;
    }


    /**
     * Sets the nomeTurma value for this WsAvaliacoesParciais.
     * 
     * @param nomeTurma
     */
    public void setNomeTurma(java.lang.String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }


    /**
     * Gets the disciplinaID value for this WsAvaliacoesParciais.
     * 
     * @return disciplinaID
     */
    public int getDisciplinaID() {
        return disciplinaID;
    }


    /**
     * Sets the disciplinaID value for this WsAvaliacoesParciais.
     * 
     * @param disciplinaID
     */
    public void setDisciplinaID(int disciplinaID) {
        this.disciplinaID = disciplinaID;
    }


    /**
     * Gets the nomeDisciplina value for this WsAvaliacoesParciais.
     * 
     * @return nomeDisciplina
     */
    public java.lang.String getNomeDisciplina() {
        return nomeDisciplina;
    }


    /**
     * Sets the nomeDisciplina value for this WsAvaliacoesParciais.
     * 
     * @param nomeDisciplina
     */
    public void setNomeDisciplina(java.lang.String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }


    /**
     * Gets the periodo value for this WsAvaliacoesParciais.
     * 
     * @return periodo
     */
    public int getPeriodo() {
        return periodo;
    }


    /**
     * Sets the periodo value for this WsAvaliacoesParciais.
     * 
     * @param periodo
     */
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }


    /**
     * Gets the nomePeriodo value for this WsAvaliacoesParciais.
     * 
     * @return nomePeriodo
     */
    public java.lang.String getNomePeriodo() {
        return nomePeriodo;
    }


    /**
     * Sets the nomePeriodo value for this WsAvaliacoesParciais.
     * 
     * @param nomePeriodo
     */
    public void setNomePeriodo(java.lang.String nomePeriodo) {
        this.nomePeriodo = nomePeriodo;
    }


    /**
     * Gets the formulaCalculoLivre value for this WsAvaliacoesParciais.
     * 
     * @return formulaCalculoLivre
     */
    public java.lang.String getFormulaCalculoLivre() {
        return formulaCalculoLivre;
    }


    /**
     * Sets the formulaCalculoLivre value for this WsAvaliacoesParciais.
     * 
     * @param formulaCalculoLivre
     */
    public void setFormulaCalculoLivre(java.lang.String formulaCalculoLivre) {
        this.formulaCalculoLivre = formulaCalculoLivre;
    }


    /**
     * Gets the grupo value for this WsAvaliacoesParciais.
     * 
     * @return grupo
     */
    public br.net.sponteeducacional.api.WsGrupoAvaliacao getGrupo() {
        return grupo;
    }


    /**
     * Sets the grupo value for this WsAvaliacoesParciais.
     * 
     * @param grupo
     */
    public void setGrupo(br.net.sponteeducacional.api.WsGrupoAvaliacao grupo) {
        this.grupo = grupo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsAvaliacoesParciais)) return false;
        WsAvaliacoesParciais other = (WsAvaliacoesParciais) obj;
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
            this.avaliacaoID == other.getAvaliacaoID() &&
            ((this.nomeAvaliacao==null && other.getNomeAvaliacao()==null) || 
             (this.nomeAvaliacao!=null &&
              this.nomeAvaliacao.equals(other.getNomeAvaliacao()))) &&
            this.peso == other.getPeso() &&
            this.ordem == other.getOrdem() &&
            this.turmaID == other.getTurmaID() &&
            ((this.nomeTurma==null && other.getNomeTurma()==null) || 
             (this.nomeTurma!=null &&
              this.nomeTurma.equals(other.getNomeTurma()))) &&
            this.disciplinaID == other.getDisciplinaID() &&
            ((this.nomeDisciplina==null && other.getNomeDisciplina()==null) || 
             (this.nomeDisciplina!=null &&
              this.nomeDisciplina.equals(other.getNomeDisciplina()))) &&
            this.periodo == other.getPeriodo() &&
            ((this.nomePeriodo==null && other.getNomePeriodo()==null) || 
             (this.nomePeriodo!=null &&
              this.nomePeriodo.equals(other.getNomePeriodo()))) &&
            ((this.formulaCalculoLivre==null && other.getFormulaCalculoLivre()==null) || 
             (this.formulaCalculoLivre!=null &&
              this.formulaCalculoLivre.equals(other.getFormulaCalculoLivre()))) &&
            ((this.grupo==null && other.getGrupo()==null) || 
             (this.grupo!=null &&
              this.grupo.equals(other.getGrupo())));
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
        _hashCode += getAvaliacaoID();
        if (getNomeAvaliacao() != null) {
            _hashCode += getNomeAvaliacao().hashCode();
        }
        _hashCode += new Double(getPeso()).hashCode();
        _hashCode += getOrdem();
        _hashCode += getTurmaID();
        if (getNomeTurma() != null) {
            _hashCode += getNomeTurma().hashCode();
        }
        _hashCode += getDisciplinaID();
        if (getNomeDisciplina() != null) {
            _hashCode += getNomeDisciplina().hashCode();
        }
        _hashCode += getPeriodo();
        if (getNomePeriodo() != null) {
            _hashCode += getNomePeriodo().hashCode();
        }
        if (getFormulaCalculoLivre() != null) {
            _hashCode += getFormulaCalculoLivre().hashCode();
        }
        if (getGrupo() != null) {
            _hashCode += getGrupo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsAvaliacoesParciais.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAvaliacoesParciais"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avaliacaoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AvaliacaoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeAvaliacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeAvaliacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Peso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Ordem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Periodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomePeriodo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomePeriodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formulaCalculoLivre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "FormulaCalculoLivre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grupo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Grupo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsGrupoAvaliacao"));
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
