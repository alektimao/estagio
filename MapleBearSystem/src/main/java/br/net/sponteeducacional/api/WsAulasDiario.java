/**
 * WsAulasDiario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsAulasDiario  implements java.io.Serializable {
    private int diarioClasseID;

    private int numeroAula;

    private java.lang.String dataAula;

    private java.lang.String horarioInicial;

    private java.lang.String horarioFinal;

    private java.lang.String semana;

    private int professorID;

    private java.lang.String professor;

    private java.lang.String conteudo;

    private java.lang.String situacao;

    public WsAulasDiario() {
    }

    public WsAulasDiario(
           int diarioClasseID,
           int numeroAula,
           java.lang.String dataAula,
           java.lang.String horarioInicial,
           java.lang.String horarioFinal,
           java.lang.String semana,
           int professorID,
           java.lang.String professor,
           java.lang.String conteudo,
           java.lang.String situacao) {
           this.diarioClasseID = diarioClasseID;
           this.numeroAula = numeroAula;
           this.dataAula = dataAula;
           this.horarioInicial = horarioInicial;
           this.horarioFinal = horarioFinal;
           this.semana = semana;
           this.professorID = professorID;
           this.professor = professor;
           this.conteudo = conteudo;
           this.situacao = situacao;
    }


    /**
     * Gets the diarioClasseID value for this WsAulasDiario.
     * 
     * @return diarioClasseID
     */
    public int getDiarioClasseID() {
        return diarioClasseID;
    }


    /**
     * Sets the diarioClasseID value for this WsAulasDiario.
     * 
     * @param diarioClasseID
     */
    public void setDiarioClasseID(int diarioClasseID) {
        this.diarioClasseID = diarioClasseID;
    }


    /**
     * Gets the numeroAula value for this WsAulasDiario.
     * 
     * @return numeroAula
     */
    public int getNumeroAula() {
        return numeroAula;
    }


    /**
     * Sets the numeroAula value for this WsAulasDiario.
     * 
     * @param numeroAula
     */
    public void setNumeroAula(int numeroAula) {
        this.numeroAula = numeroAula;
    }


    /**
     * Gets the dataAula value for this WsAulasDiario.
     * 
     * @return dataAula
     */
    public java.lang.String getDataAula() {
        return dataAula;
    }


    /**
     * Sets the dataAula value for this WsAulasDiario.
     * 
     * @param dataAula
     */
    public void setDataAula(java.lang.String dataAula) {
        this.dataAula = dataAula;
    }


    /**
     * Gets the horarioInicial value for this WsAulasDiario.
     * 
     * @return horarioInicial
     */
    public java.lang.String getHorarioInicial() {
        return horarioInicial;
    }


    /**
     * Sets the horarioInicial value for this WsAulasDiario.
     * 
     * @param horarioInicial
     */
    public void setHorarioInicial(java.lang.String horarioInicial) {
        this.horarioInicial = horarioInicial;
    }


    /**
     * Gets the horarioFinal value for this WsAulasDiario.
     * 
     * @return horarioFinal
     */
    public java.lang.String getHorarioFinal() {
        return horarioFinal;
    }


    /**
     * Sets the horarioFinal value for this WsAulasDiario.
     * 
     * @param horarioFinal
     */
    public void setHorarioFinal(java.lang.String horarioFinal) {
        this.horarioFinal = horarioFinal;
    }


    /**
     * Gets the semana value for this WsAulasDiario.
     * 
     * @return semana
     */
    public java.lang.String getSemana() {
        return semana;
    }


    /**
     * Sets the semana value for this WsAulasDiario.
     * 
     * @param semana
     */
    public void setSemana(java.lang.String semana) {
        this.semana = semana;
    }


    /**
     * Gets the professorID value for this WsAulasDiario.
     * 
     * @return professorID
     */
    public int getProfessorID() {
        return professorID;
    }


    /**
     * Sets the professorID value for this WsAulasDiario.
     * 
     * @param professorID
     */
    public void setProfessorID(int professorID) {
        this.professorID = professorID;
    }


    /**
     * Gets the professor value for this WsAulasDiario.
     * 
     * @return professor
     */
    public java.lang.String getProfessor() {
        return professor;
    }


    /**
     * Sets the professor value for this WsAulasDiario.
     * 
     * @param professor
     */
    public void setProfessor(java.lang.String professor) {
        this.professor = professor;
    }


    /**
     * Gets the conteudo value for this WsAulasDiario.
     * 
     * @return conteudo
     */
    public java.lang.String getConteudo() {
        return conteudo;
    }


    /**
     * Sets the conteudo value for this WsAulasDiario.
     * 
     * @param conteudo
     */
    public void setConteudo(java.lang.String conteudo) {
        this.conteudo = conteudo;
    }


    /**
     * Gets the situacao value for this WsAulasDiario.
     * 
     * @return situacao
     */
    public java.lang.String getSituacao() {
        return situacao;
    }


    /**
     * Sets the situacao value for this WsAulasDiario.
     * 
     * @param situacao
     */
    public void setSituacao(java.lang.String situacao) {
        this.situacao = situacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsAulasDiario)) return false;
        WsAulasDiario other = (WsAulasDiario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.diarioClasseID == other.getDiarioClasseID() &&
            this.numeroAula == other.getNumeroAula() &&
            ((this.dataAula==null && other.getDataAula()==null) || 
             (this.dataAula!=null &&
              this.dataAula.equals(other.getDataAula()))) &&
            ((this.horarioInicial==null && other.getHorarioInicial()==null) || 
             (this.horarioInicial!=null &&
              this.horarioInicial.equals(other.getHorarioInicial()))) &&
            ((this.horarioFinal==null && other.getHorarioFinal()==null) || 
             (this.horarioFinal!=null &&
              this.horarioFinal.equals(other.getHorarioFinal()))) &&
            ((this.semana==null && other.getSemana()==null) || 
             (this.semana!=null &&
              this.semana.equals(other.getSemana()))) &&
            this.professorID == other.getProfessorID() &&
            ((this.professor==null && other.getProfessor()==null) || 
             (this.professor!=null &&
              this.professor.equals(other.getProfessor()))) &&
            ((this.conteudo==null && other.getConteudo()==null) || 
             (this.conteudo!=null &&
              this.conteudo.equals(other.getConteudo()))) &&
            ((this.situacao==null && other.getSituacao()==null) || 
             (this.situacao!=null &&
              this.situacao.equals(other.getSituacao())));
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
        _hashCode += getNumeroAula();
        if (getDataAula() != null) {
            _hashCode += getDataAula().hashCode();
        }
        if (getHorarioInicial() != null) {
            _hashCode += getHorarioInicial().hashCode();
        }
        if (getHorarioFinal() != null) {
            _hashCode += getHorarioFinal().hashCode();
        }
        if (getSemana() != null) {
            _hashCode += getSemana().hashCode();
        }
        _hashCode += getProfessorID();
        if (getProfessor() != null) {
            _hashCode += getProfessor().hashCode();
        }
        if (getConteudo() != null) {
            _hashCode += getConteudo().hashCode();
        }
        if (getSituacao() != null) {
            _hashCode += getSituacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsAulasDiario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAulasDiario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diarioClasseID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DiarioClasseID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroAula"));
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
        elemField.setFieldName("semana");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Semana"));
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
        elemField.setFieldName("professor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Professor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conteudo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Conteudo"));
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
