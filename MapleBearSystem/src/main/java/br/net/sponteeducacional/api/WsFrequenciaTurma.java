/**
 * WsFrequenciaTurma.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsFrequenciaTurma  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int turmaID;

    private java.lang.String nomeTurma;

    private br.net.sponteeducacional.api.WsFrequenciaDisciplinas[] disciplinas;

    public WsFrequenciaTurma() {
    }

    public WsFrequenciaTurma(
           java.lang.String retornoOperacao,
           int turmaID,
           java.lang.String nomeTurma,
           br.net.sponteeducacional.api.WsFrequenciaDisciplinas[] disciplinas) {
           this.retornoOperacao = retornoOperacao;
           this.turmaID = turmaID;
           this.nomeTurma = nomeTurma;
           this.disciplinas = disciplinas;
    }


    /**
     * Gets the retornoOperacao value for this WsFrequenciaTurma.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsFrequenciaTurma.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the turmaID value for this WsFrequenciaTurma.
     * 
     * @return turmaID
     */
    public int getTurmaID() {
        return turmaID;
    }


    /**
     * Sets the turmaID value for this WsFrequenciaTurma.
     * 
     * @param turmaID
     */
    public void setTurmaID(int turmaID) {
        this.turmaID = turmaID;
    }


    /**
     * Gets the nomeTurma value for this WsFrequenciaTurma.
     * 
     * @return nomeTurma
     */
    public java.lang.String getNomeTurma() {
        return nomeTurma;
    }


    /**
     * Sets the nomeTurma value for this WsFrequenciaTurma.
     * 
     * @param nomeTurma
     */
    public void setNomeTurma(java.lang.String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }


    /**
     * Gets the disciplinas value for this WsFrequenciaTurma.
     * 
     * @return disciplinas
     */
    public br.net.sponteeducacional.api.WsFrequenciaDisciplinas[] getDisciplinas() {
        return disciplinas;
    }


    /**
     * Sets the disciplinas value for this WsFrequenciaTurma.
     * 
     * @param disciplinas
     */
    public void setDisciplinas(br.net.sponteeducacional.api.WsFrequenciaDisciplinas[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsFrequenciaTurma)) return false;
        WsFrequenciaTurma other = (WsFrequenciaTurma) obj;
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
            ((this.nomeTurma==null && other.getNomeTurma()==null) || 
             (this.nomeTurma!=null &&
              this.nomeTurma.equals(other.getNomeTurma()))) &&
            ((this.disciplinas==null && other.getDisciplinas()==null) || 
             (this.disciplinas!=null &&
              java.util.Arrays.equals(this.disciplinas, other.getDisciplinas())));
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
        if (getNomeTurma() != null) {
            _hashCode += getNomeTurma().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsFrequenciaTurma.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaTurma"));
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
        elemField.setFieldName("nomeTurma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeTurma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disciplinas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Disciplinas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaDisciplinas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaDisciplinas"));
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
