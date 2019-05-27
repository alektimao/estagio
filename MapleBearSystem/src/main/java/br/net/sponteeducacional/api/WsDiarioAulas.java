/**
 * WsDiarioAulas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsDiarioAulas  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int turmaID;

    private java.lang.String turma;

    private int disciplinaID;

    private java.lang.String disciplina;

    private int modulo;

    private br.net.sponteeducacional.api.WsAulasDiario[] aulasDiario;

    public WsDiarioAulas() {
    }

    public WsDiarioAulas(
           java.lang.String retornoOperacao,
           int turmaID,
           java.lang.String turma,
           int disciplinaID,
           java.lang.String disciplina,
           int modulo,
           br.net.sponteeducacional.api.WsAulasDiario[] aulasDiario) {
           this.retornoOperacao = retornoOperacao;
           this.turmaID = turmaID;
           this.turma = turma;
           this.disciplinaID = disciplinaID;
           this.disciplina = disciplina;
           this.modulo = modulo;
           this.aulasDiario = aulasDiario;
    }


    /**
     * Gets the retornoOperacao value for this WsDiarioAulas.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsDiarioAulas.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the turmaID value for this WsDiarioAulas.
     * 
     * @return turmaID
     */
    public int getTurmaID() {
        return turmaID;
    }


    /**
     * Sets the turmaID value for this WsDiarioAulas.
     * 
     * @param turmaID
     */
    public void setTurmaID(int turmaID) {
        this.turmaID = turmaID;
    }


    /**
     * Gets the turma value for this WsDiarioAulas.
     * 
     * @return turma
     */
    public java.lang.String getTurma() {
        return turma;
    }


    /**
     * Sets the turma value for this WsDiarioAulas.
     * 
     * @param turma
     */
    public void setTurma(java.lang.String turma) {
        this.turma = turma;
    }


    /**
     * Gets the disciplinaID value for this WsDiarioAulas.
     * 
     * @return disciplinaID
     */
    public int getDisciplinaID() {
        return disciplinaID;
    }


    /**
     * Sets the disciplinaID value for this WsDiarioAulas.
     * 
     * @param disciplinaID
     */
    public void setDisciplinaID(int disciplinaID) {
        this.disciplinaID = disciplinaID;
    }


    /**
     * Gets the disciplina value for this WsDiarioAulas.
     * 
     * @return disciplina
     */
    public java.lang.String getDisciplina() {
        return disciplina;
    }


    /**
     * Sets the disciplina value for this WsDiarioAulas.
     * 
     * @param disciplina
     */
    public void setDisciplina(java.lang.String disciplina) {
        this.disciplina = disciplina;
    }


    /**
     * Gets the modulo value for this WsDiarioAulas.
     * 
     * @return modulo
     */
    public int getModulo() {
        return modulo;
    }


    /**
     * Sets the modulo value for this WsDiarioAulas.
     * 
     * @param modulo
     */
    public void setModulo(int modulo) {
        this.modulo = modulo;
    }


    /**
     * Gets the aulasDiario value for this WsDiarioAulas.
     * 
     * @return aulasDiario
     */
    public br.net.sponteeducacional.api.WsAulasDiario[] getAulasDiario() {
        return aulasDiario;
    }


    /**
     * Sets the aulasDiario value for this WsDiarioAulas.
     * 
     * @param aulasDiario
     */
    public void setAulasDiario(br.net.sponteeducacional.api.WsAulasDiario[] aulasDiario) {
        this.aulasDiario = aulasDiario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsDiarioAulas)) return false;
        WsDiarioAulas other = (WsDiarioAulas) obj;
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
            this.turmaID == other.getTurmaID() &&
            ((this.turma==null && other.getTurma()==null) || 
             (this.turma!=null &&
              this.turma.equals(other.getTurma()))) &&
            this.disciplinaID == other.getDisciplinaID() &&
            ((this.disciplina==null && other.getDisciplina()==null) || 
             (this.disciplina!=null &&
              this.disciplina.equals(other.getDisciplina()))) &&
            this.modulo == other.getModulo() &&
            ((this.aulasDiario==null && other.getAulasDiario()==null) || 
             (this.aulasDiario!=null &&
              java.util.Arrays.equals(this.aulasDiario, other.getAulasDiario())));
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
        _hashCode += getTurmaID();
        if (getTurma() != null) {
            _hashCode += getTurma().hashCode();
        }
        _hashCode += getDisciplinaID();
        if (getDisciplina() != null) {
            _hashCode += getDisciplina().hashCode();
        }
        _hashCode += getModulo();
        if (getAulasDiario() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAulasDiario());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAulasDiario(), i);
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
        new org.apache.axis.description.TypeDesc(WsDiarioAulas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDiarioAulas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
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
        elemField.setFieldName("turma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Turma"));
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
        elemField.setFieldName("disciplina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Disciplina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Modulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aulasDiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AulasDiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAulasDiario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAulasDiario"));
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
