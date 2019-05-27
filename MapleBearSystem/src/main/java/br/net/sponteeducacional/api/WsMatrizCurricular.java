/**
 * WsMatrizCurricular.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsMatrizCurricular  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int matrizCurricularID;

    private java.lang.String nome;

    private br.net.sponteeducacional.api.Disciplinas[] disciplinas;

    public WsMatrizCurricular() {
    }

    public WsMatrizCurricular(
           java.lang.String retornoOperacao,
           int matrizCurricularID,
           java.lang.String nome,
           br.net.sponteeducacional.api.Disciplinas[] disciplinas) {
           this.retornoOperacao = retornoOperacao;
           this.matrizCurricularID = matrizCurricularID;
           this.nome = nome;
           this.disciplinas = disciplinas;
    }


    /**
     * Gets the retornoOperacao value for this WsMatrizCurricular.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsMatrizCurricular.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the matrizCurricularID value for this WsMatrizCurricular.
     * 
     * @return matrizCurricularID
     */
    public int getMatrizCurricularID() {
        return matrizCurricularID;
    }


    /**
     * Sets the matrizCurricularID value for this WsMatrizCurricular.
     * 
     * @param matrizCurricularID
     */
    public void setMatrizCurricularID(int matrizCurricularID) {
        this.matrizCurricularID = matrizCurricularID;
    }


    /**
     * Gets the nome value for this WsMatrizCurricular.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this WsMatrizCurricular.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the disciplinas value for this WsMatrizCurricular.
     * 
     * @return disciplinas
     */
    public br.net.sponteeducacional.api.Disciplinas[] getDisciplinas() {
        return disciplinas;
    }


    /**
     * Sets the disciplinas value for this WsMatrizCurricular.
     * 
     * @param disciplinas
     */
    public void setDisciplinas(br.net.sponteeducacional.api.Disciplinas[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsMatrizCurricular)) return false;
        WsMatrizCurricular other = (WsMatrizCurricular) obj;
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
            this.matrizCurricularID == other.getMatrizCurricularID() &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
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
        _hashCode += getMatrizCurricularID();
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
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
        new org.apache.axis.description.TypeDesc(WsMatrizCurricular.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMatrizCurricular"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrizCurricularID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "MatrizCurricularID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("disciplinas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Disciplinas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Disciplinas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Disciplinas"));
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
