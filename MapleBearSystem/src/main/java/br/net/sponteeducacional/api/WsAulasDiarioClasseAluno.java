/**
 * WsAulasDiarioClasseAluno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsAulasDiarioClasseAluno  implements java.io.Serializable {
    private int diarioClasseID;

    private java.lang.String dataAula;

    private java.lang.String horarioInicial;

    private java.lang.String horarioFinal;

    private int turmaID;

    private java.lang.String nomeTurma;

    private int disciplinaID;

    private java.lang.String nomeDisciplina;

    private int professorID;

    private java.lang.String nomeProfessor;

    private java.lang.String sala;

    public WsAulasDiarioClasseAluno() {
    }

    public WsAulasDiarioClasseAluno(
           int diarioClasseID,
           java.lang.String dataAula,
           java.lang.String horarioInicial,
           java.lang.String horarioFinal,
           int turmaID,
           java.lang.String nomeTurma,
           int disciplinaID,
           java.lang.String nomeDisciplina,
           int professorID,
           java.lang.String nomeProfessor,
           java.lang.String sala) {
           this.diarioClasseID = diarioClasseID;
           this.dataAula = dataAula;
           this.horarioInicial = horarioInicial;
           this.horarioFinal = horarioFinal;
           this.turmaID = turmaID;
           this.nomeTurma = nomeTurma;
           this.disciplinaID = disciplinaID;
           this.nomeDisciplina = nomeDisciplina;
           this.professorID = professorID;
           this.nomeProfessor = nomeProfessor;
           this.sala = sala;
    }


    /**
     * Gets the diarioClasseID value for this WsAulasDiarioClasseAluno.
     * 
     * @return diarioClasseID
     */
    public int getDiarioClasseID() {
        return diarioClasseID;
    }


    /**
     * Sets the diarioClasseID value for this WsAulasDiarioClasseAluno.
     * 
     * @param diarioClasseID
     */
    public void setDiarioClasseID(int diarioClasseID) {
        this.diarioClasseID = diarioClasseID;
    }


    /**
     * Gets the dataAula value for this WsAulasDiarioClasseAluno.
     * 
     * @return dataAula
     */
    public java.lang.String getDataAula() {
        return dataAula;
    }


    /**
     * Sets the dataAula value for this WsAulasDiarioClasseAluno.
     * 
     * @param dataAula
     */
    public void setDataAula(java.lang.String dataAula) {
        this.dataAula = dataAula;
    }


    /**
     * Gets the horarioInicial value for this WsAulasDiarioClasseAluno.
     * 
     * @return horarioInicial
     */
    public java.lang.String getHorarioInicial() {
        return horarioInicial;
    }


    /**
     * Sets the horarioInicial value for this WsAulasDiarioClasseAluno.
     * 
     * @param horarioInicial
     */
    public void setHorarioInicial(java.lang.String horarioInicial) {
        this.horarioInicial = horarioInicial;
    }


    /**
     * Gets the horarioFinal value for this WsAulasDiarioClasseAluno.
     * 
     * @return horarioFinal
     */
    public java.lang.String getHorarioFinal() {
        return horarioFinal;
    }


    /**
     * Sets the horarioFinal value for this WsAulasDiarioClasseAluno.
     * 
     * @param horarioFinal
     */
    public void setHorarioFinal(java.lang.String horarioFinal) {
        this.horarioFinal = horarioFinal;
    }


    /**
     * Gets the turmaID value for this WsAulasDiarioClasseAluno.
     * 
     * @return turmaID
     */
    public int getTurmaID() {
        return turmaID;
    }


    /**
     * Sets the turmaID value for this WsAulasDiarioClasseAluno.
     * 
     * @param turmaID
     */
    public void setTurmaID(int turmaID) {
        this.turmaID = turmaID;
    }


    /**
     * Gets the nomeTurma value for this WsAulasDiarioClasseAluno.
     * 
     * @return nomeTurma
     */
    public java.lang.String getNomeTurma() {
        return nomeTurma;
    }


    /**
     * Sets the nomeTurma value for this WsAulasDiarioClasseAluno.
     * 
     * @param nomeTurma
     */
    public void setNomeTurma(java.lang.String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }


    /**
     * Gets the disciplinaID value for this WsAulasDiarioClasseAluno.
     * 
     * @return disciplinaID
     */
    public int getDisciplinaID() {
        return disciplinaID;
    }


    /**
     * Sets the disciplinaID value for this WsAulasDiarioClasseAluno.
     * 
     * @param disciplinaID
     */
    public void setDisciplinaID(int disciplinaID) {
        this.disciplinaID = disciplinaID;
    }


    /**
     * Gets the nomeDisciplina value for this WsAulasDiarioClasseAluno.
     * 
     * @return nomeDisciplina
     */
    public java.lang.String getNomeDisciplina() {
        return nomeDisciplina;
    }


    /**
     * Sets the nomeDisciplina value for this WsAulasDiarioClasseAluno.
     * 
     * @param nomeDisciplina
     */
    public void setNomeDisciplina(java.lang.String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }


    /**
     * Gets the professorID value for this WsAulasDiarioClasseAluno.
     * 
     * @return professorID
     */
    public int getProfessorID() {
        return professorID;
    }


    /**
     * Sets the professorID value for this WsAulasDiarioClasseAluno.
     * 
     * @param professorID
     */
    public void setProfessorID(int professorID) {
        this.professorID = professorID;
    }


    /**
     * Gets the nomeProfessor value for this WsAulasDiarioClasseAluno.
     * 
     * @return nomeProfessor
     */
    public java.lang.String getNomeProfessor() {
        return nomeProfessor;
    }


    /**
     * Sets the nomeProfessor value for this WsAulasDiarioClasseAluno.
     * 
     * @param nomeProfessor
     */
    public void setNomeProfessor(java.lang.String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }


    /**
     * Gets the sala value for this WsAulasDiarioClasseAluno.
     * 
     * @return sala
     */
    public java.lang.String getSala() {
        return sala;
    }


    /**
     * Sets the sala value for this WsAulasDiarioClasseAluno.
     * 
     * @param sala
     */
    public void setSala(java.lang.String sala) {
        this.sala = sala;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsAulasDiarioClasseAluno)) return false;
        WsAulasDiarioClasseAluno other = (WsAulasDiarioClasseAluno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.diarioClasseID == other.getDiarioClasseID() &&
            ((this.dataAula==null && other.getDataAula()==null) || 
             (this.dataAula!=null &&
              this.dataAula.equals(other.getDataAula()))) &&
            ((this.horarioInicial==null && other.getHorarioInicial()==null) || 
             (this.horarioInicial!=null &&
              this.horarioInicial.equals(other.getHorarioInicial()))) &&
            ((this.horarioFinal==null && other.getHorarioFinal()==null) || 
             (this.horarioFinal!=null &&
              this.horarioFinal.equals(other.getHorarioFinal()))) &&
            this.turmaID == other.getTurmaID() &&
            ((this.nomeTurma==null && other.getNomeTurma()==null) || 
             (this.nomeTurma!=null &&
              this.nomeTurma.equals(other.getNomeTurma()))) &&
            this.disciplinaID == other.getDisciplinaID() &&
            ((this.nomeDisciplina==null && other.getNomeDisciplina()==null) || 
             (this.nomeDisciplina!=null &&
              this.nomeDisciplina.equals(other.getNomeDisciplina()))) &&
            this.professorID == other.getProfessorID() &&
            ((this.nomeProfessor==null && other.getNomeProfessor()==null) || 
             (this.nomeProfessor!=null &&
              this.nomeProfessor.equals(other.getNomeProfessor()))) &&
            ((this.sala==null && other.getSala()==null) || 
             (this.sala!=null &&
              this.sala.equals(other.getSala())));
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
        _hashCode += getDiarioClasseID();
        if (getDataAula() != null) {
            _hashCode += getDataAula().hashCode();
        }
        if (getHorarioInicial() != null) {
            _hashCode += getHorarioInicial().hashCode();
        }
        if (getHorarioFinal() != null) {
            _hashCode += getHorarioFinal().hashCode();
        }
        _hashCode += getTurmaID();
        if (getNomeTurma() != null) {
            _hashCode += getNomeTurma().hashCode();
        }
        _hashCode += getDisciplinaID();
        if (getNomeDisciplina() != null) {
            _hashCode += getNomeDisciplina().hashCode();
        }
        _hashCode += getProfessorID();
        if (getNomeProfessor() != null) {
            _hashCode += getNomeProfessor().hashCode();
        }
        if (getSala() != null) {
            _hashCode += getSala().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsAulasDiarioClasseAluno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAulasDiarioClasseAluno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diarioClasseID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DiarioClasseID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataAula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "HorarioInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "HorarioFinal"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("professorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ProfessorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeProfessor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeProfessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sala");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Sala"));
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
