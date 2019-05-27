/**
 * WsAulasLivresAluno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsAulasLivresAluno  implements java.io.Serializable {
    private int aulaLivreID;

    private java.lang.String dataAula;

    private java.lang.String horarioInicial;

    private java.lang.String horarioFinal;

    private int cursoID;

    private java.lang.String nomeCurso;

    private int disciplinaID;

    private java.lang.String nomeDisciplina;

    private int professorID;

    private java.lang.String nomeProfessor;

    private java.lang.String sala;

    public WsAulasLivresAluno() {
    }

    public WsAulasLivresAluno(
           int aulaLivreID,
           java.lang.String dataAula,
           java.lang.String horarioInicial,
           java.lang.String horarioFinal,
           int cursoID,
           java.lang.String nomeCurso,
           int disciplinaID,
           java.lang.String nomeDisciplina,
           int professorID,
           java.lang.String nomeProfessor,
           java.lang.String sala) {
           this.aulaLivreID = aulaLivreID;
           this.dataAula = dataAula;
           this.horarioInicial = horarioInicial;
           this.horarioFinal = horarioFinal;
           this.cursoID = cursoID;
           this.nomeCurso = nomeCurso;
           this.disciplinaID = disciplinaID;
           this.nomeDisciplina = nomeDisciplina;
           this.professorID = professorID;
           this.nomeProfessor = nomeProfessor;
           this.sala = sala;
    }


    /**
     * Gets the aulaLivreID value for this WsAulasLivresAluno.
     * 
     * @return aulaLivreID
     */
    public int getAulaLivreID() {
        return aulaLivreID;
    }


    /**
     * Sets the aulaLivreID value for this WsAulasLivresAluno.
     * 
     * @param aulaLivreID
     */
    public void setAulaLivreID(int aulaLivreID) {
        this.aulaLivreID = aulaLivreID;
    }


    /**
     * Gets the dataAula value for this WsAulasLivresAluno.
     * 
     * @return dataAula
     */
    public java.lang.String getDataAula() {
        return dataAula;
    }


    /**
     * Sets the dataAula value for this WsAulasLivresAluno.
     * 
     * @param dataAula
     */
    public void setDataAula(java.lang.String dataAula) {
        this.dataAula = dataAula;
    }


    /**
     * Gets the horarioInicial value for this WsAulasLivresAluno.
     * 
     * @return horarioInicial
     */
    public java.lang.String getHorarioInicial() {
        return horarioInicial;
    }


    /**
     * Sets the horarioInicial value for this WsAulasLivresAluno.
     * 
     * @param horarioInicial
     */
    public void setHorarioInicial(java.lang.String horarioInicial) {
        this.horarioInicial = horarioInicial;
    }


    /**
     * Gets the horarioFinal value for this WsAulasLivresAluno.
     * 
     * @return horarioFinal
     */
    public java.lang.String getHorarioFinal() {
        return horarioFinal;
    }


    /**
     * Sets the horarioFinal value for this WsAulasLivresAluno.
     * 
     * @param horarioFinal
     */
    public void setHorarioFinal(java.lang.String horarioFinal) {
        this.horarioFinal = horarioFinal;
    }


    /**
     * Gets the cursoID value for this WsAulasLivresAluno.
     * 
     * @return cursoID
     */
    public int getCursoID() {
        return cursoID;
    }


    /**
     * Sets the cursoID value for this WsAulasLivresAluno.
     * 
     * @param cursoID
     */
    public void setCursoID(int cursoID) {
        this.cursoID = cursoID;
    }


    /**
     * Gets the nomeCurso value for this WsAulasLivresAluno.
     * 
     * @return nomeCurso
     */
    public java.lang.String getNomeCurso() {
        return nomeCurso;
    }


    /**
     * Sets the nomeCurso value for this WsAulasLivresAluno.
     * 
     * @param nomeCurso
     */
    public void setNomeCurso(java.lang.String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }


    /**
     * Gets the disciplinaID value for this WsAulasLivresAluno.
     * 
     * @return disciplinaID
     */
    public int getDisciplinaID() {
        return disciplinaID;
    }


    /**
     * Sets the disciplinaID value for this WsAulasLivresAluno.
     * 
     * @param disciplinaID
     */
    public void setDisciplinaID(int disciplinaID) {
        this.disciplinaID = disciplinaID;
    }


    /**
     * Gets the nomeDisciplina value for this WsAulasLivresAluno.
     * 
     * @return nomeDisciplina
     */
    public java.lang.String getNomeDisciplina() {
        return nomeDisciplina;
    }


    /**
     * Sets the nomeDisciplina value for this WsAulasLivresAluno.
     * 
     * @param nomeDisciplina
     */
    public void setNomeDisciplina(java.lang.String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }


    /**
     * Gets the professorID value for this WsAulasLivresAluno.
     * 
     * @return professorID
     */
    public int getProfessorID() {
        return professorID;
    }


    /**
     * Sets the professorID value for this WsAulasLivresAluno.
     * 
     * @param professorID
     */
    public void setProfessorID(int professorID) {
        this.professorID = professorID;
    }


    /**
     * Gets the nomeProfessor value for this WsAulasLivresAluno.
     * 
     * @return nomeProfessor
     */
    public java.lang.String getNomeProfessor() {
        return nomeProfessor;
    }


    /**
     * Sets the nomeProfessor value for this WsAulasLivresAluno.
     * 
     * @param nomeProfessor
     */
    public void setNomeProfessor(java.lang.String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }


    /**
     * Gets the sala value for this WsAulasLivresAluno.
     * 
     * @return sala
     */
    public java.lang.String getSala() {
        return sala;
    }


    /**
     * Sets the sala value for this WsAulasLivresAluno.
     * 
     * @param sala
     */
    public void setSala(java.lang.String sala) {
        this.sala = sala;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsAulasLivresAluno)) return false;
        WsAulasLivresAluno other = (WsAulasLivresAluno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.aulaLivreID == other.getAulaLivreID() &&
            ((this.dataAula==null && other.getDataAula()==null) || 
             (this.dataAula!=null &&
              this.dataAula.equals(other.getDataAula()))) &&
            ((this.horarioInicial==null && other.getHorarioInicial()==null) || 
             (this.horarioInicial!=null &&
              this.horarioInicial.equals(other.getHorarioInicial()))) &&
            ((this.horarioFinal==null && other.getHorarioFinal()==null) || 
             (this.horarioFinal!=null &&
              this.horarioFinal.equals(other.getHorarioFinal()))) &&
            this.cursoID == other.getCursoID() &&
            ((this.nomeCurso==null && other.getNomeCurso()==null) || 
             (this.nomeCurso!=null &&
              this.nomeCurso.equals(other.getNomeCurso()))) &&
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
        _hashCode += getAulaLivreID();
        if (getDataAula() != null) {
            _hashCode += getDataAula().hashCode();
        }
        if (getHorarioInicial() != null) {
            _hashCode += getHorarioInicial().hashCode();
        }
        if (getHorarioFinal() != null) {
            _hashCode += getHorarioFinal().hashCode();
        }
        _hashCode += getCursoID();
        if (getNomeCurso() != null) {
            _hashCode += getNomeCurso().hashCode();
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
        new org.apache.axis.description.TypeDesc(WsAulasLivresAluno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAulasLivresAluno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aulaLivreID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AulaLivreID"));
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
