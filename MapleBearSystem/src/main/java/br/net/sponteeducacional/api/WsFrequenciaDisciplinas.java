/**
 * WsFrequenciaDisciplinas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsFrequenciaDisciplinas  implements java.io.Serializable {
    private int modulo;

    private int disciplinaID;

    private java.lang.String nomeDisciplina;

    private int professorID;

    private java.lang.String nomeProfessor;

    private java.lang.String CHTotal;

    private int numeroAulas;

    private br.net.sponteeducacional.api.WsFrequenciaAluno[] alunos;

    public WsFrequenciaDisciplinas() {
    }

    public WsFrequenciaDisciplinas(
           int modulo,
           int disciplinaID,
           java.lang.String nomeDisciplina,
           int professorID,
           java.lang.String nomeProfessor,
           java.lang.String CHTotal,
           int numeroAulas,
           br.net.sponteeducacional.api.WsFrequenciaAluno[] alunos) {
           this.modulo = modulo;
           this.disciplinaID = disciplinaID;
           this.nomeDisciplina = nomeDisciplina;
           this.professorID = professorID;
           this.nomeProfessor = nomeProfessor;
           this.CHTotal = CHTotal;
           this.numeroAulas = numeroAulas;
           this.alunos = alunos;
    }


    /**
     * Gets the modulo value for this WsFrequenciaDisciplinas.
     * 
     * @return modulo
     */
    public int getModulo() {
        return modulo;
    }


    /**
     * Sets the modulo value for this WsFrequenciaDisciplinas.
     * 
     * @param modulo
     */
    public void setModulo(int modulo) {
        this.modulo = modulo;
    }


    /**
     * Gets the disciplinaID value for this WsFrequenciaDisciplinas.
     * 
     * @return disciplinaID
     */
    public int getDisciplinaID() {
        return disciplinaID;
    }


    /**
     * Sets the disciplinaID value for this WsFrequenciaDisciplinas.
     * 
     * @param disciplinaID
     */
    public void setDisciplinaID(int disciplinaID) {
        this.disciplinaID = disciplinaID;
    }


    /**
     * Gets the nomeDisciplina value for this WsFrequenciaDisciplinas.
     * 
     * @return nomeDisciplina
     */
    public java.lang.String getNomeDisciplina() {
        return nomeDisciplina;
    }


    /**
     * Sets the nomeDisciplina value for this WsFrequenciaDisciplinas.
     * 
     * @param nomeDisciplina
     */
    public void setNomeDisciplina(java.lang.String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }


    /**
     * Gets the professorID value for this WsFrequenciaDisciplinas.
     * 
     * @return professorID
     */
    public int getProfessorID() {
        return professorID;
    }


    /**
     * Sets the professorID value for this WsFrequenciaDisciplinas.
     * 
     * @param professorID
     */
    public void setProfessorID(int professorID) {
        this.professorID = professorID;
    }


    /**
     * Gets the nomeProfessor value for this WsFrequenciaDisciplinas.
     * 
     * @return nomeProfessor
     */
    public java.lang.String getNomeProfessor() {
        return nomeProfessor;
    }


    /**
     * Sets the nomeProfessor value for this WsFrequenciaDisciplinas.
     * 
     * @param nomeProfessor
     */
    public void setNomeProfessor(java.lang.String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }


    /**
     * Gets the CHTotal value for this WsFrequenciaDisciplinas.
     * 
     * @return CHTotal
     */
    public java.lang.String getCHTotal() {
        return CHTotal;
    }


    /**
     * Sets the CHTotal value for this WsFrequenciaDisciplinas.
     * 
     * @param CHTotal
     */
    public void setCHTotal(java.lang.String CHTotal) {
        this.CHTotal = CHTotal;
    }


    /**
     * Gets the numeroAulas value for this WsFrequenciaDisciplinas.
     * 
     * @return numeroAulas
     */
    public int getNumeroAulas() {
        return numeroAulas;
    }


    /**
     * Sets the numeroAulas value for this WsFrequenciaDisciplinas.
     * 
     * @param numeroAulas
     */
    public void setNumeroAulas(int numeroAulas) {
        this.numeroAulas = numeroAulas;
    }


    /**
     * Gets the alunos value for this WsFrequenciaDisciplinas.
     * 
     * @return alunos
     */
    public br.net.sponteeducacional.api.WsFrequenciaAluno[] getAlunos() {
        return alunos;
    }


    /**
     * Sets the alunos value for this WsFrequenciaDisciplinas.
     * 
     * @param alunos
     */
    public void setAlunos(br.net.sponteeducacional.api.WsFrequenciaAluno[] alunos) {
        this.alunos = alunos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsFrequenciaDisciplinas)) return false;
        WsFrequenciaDisciplinas other = (WsFrequenciaDisciplinas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.modulo == other.getModulo() &&
            this.disciplinaID == other.getDisciplinaID() &&
            ((this.nomeDisciplina==null && other.getNomeDisciplina()==null) || 
             (this.nomeDisciplina!=null &&
              this.nomeDisciplina.equals(other.getNomeDisciplina()))) &&
            this.professorID == other.getProfessorID() &&
            ((this.nomeProfessor==null && other.getNomeProfessor()==null) || 
             (this.nomeProfessor!=null &&
              this.nomeProfessor.equals(other.getNomeProfessor()))) &&
            ((this.CHTotal==null && other.getCHTotal()==null) || 
             (this.CHTotal!=null &&
              this.CHTotal.equals(other.getCHTotal()))) &&
            this.numeroAulas == other.getNumeroAulas() &&
            ((this.alunos==null && other.getAlunos()==null) || 
             (this.alunos!=null &&
              java.util.Arrays.equals(this.alunos, other.getAlunos())));
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
        _hashCode += getModulo();
        _hashCode += getDisciplinaID();
        if (getNomeDisciplina() != null) {
            _hashCode += getNomeDisciplina().hashCode();
        }
        _hashCode += getProfessorID();
        if (getNomeProfessor() != null) {
            _hashCode += getNomeProfessor().hashCode();
        }
        if (getCHTotal() != null) {
            _hashCode += getCHTotal().hashCode();
        }
        _hashCode += getNumeroAulas();
        if (getAlunos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlunos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlunos(), i);
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
        new org.apache.axis.description.TypeDesc(WsFrequenciaDisciplinas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaDisciplinas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Modulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("CHTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CHTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAulas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroAulas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alunos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Alunos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaAluno"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaAluno"));
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
