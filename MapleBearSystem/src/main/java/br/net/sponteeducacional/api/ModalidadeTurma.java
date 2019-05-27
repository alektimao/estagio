/**
 * ModalidadeTurma.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class ModalidadeTurma  implements java.io.Serializable {
    private int modalidadeID;

    private java.lang.String descricaoModalidade;

    private int turmaID;

    private java.lang.String nomeTurma;

    public ModalidadeTurma() {
    }

    public ModalidadeTurma(
           int modalidadeID,
           java.lang.String descricaoModalidade,
           int turmaID,
           java.lang.String nomeTurma) {
           this.modalidadeID = modalidadeID;
           this.descricaoModalidade = descricaoModalidade;
           this.turmaID = turmaID;
           this.nomeTurma = nomeTurma;
    }


    /**
     * Gets the modalidadeID value for this ModalidadeTurma.
     * 
     * @return modalidadeID
     */
    public int getModalidadeID() {
        return modalidadeID;
    }


    /**
     * Sets the modalidadeID value for this ModalidadeTurma.
     * 
     * @param modalidadeID
     */
    public void setModalidadeID(int modalidadeID) {
        this.modalidadeID = modalidadeID;
    }


    /**
     * Gets the descricaoModalidade value for this ModalidadeTurma.
     * 
     * @return descricaoModalidade
     */
    public java.lang.String getDescricaoModalidade() {
        return descricaoModalidade;
    }


    /**
     * Sets the descricaoModalidade value for this ModalidadeTurma.
     * 
     * @param descricaoModalidade
     */
    public void setDescricaoModalidade(java.lang.String descricaoModalidade) {
        this.descricaoModalidade = descricaoModalidade;
    }


    /**
     * Gets the turmaID value for this ModalidadeTurma.
     * 
     * @return turmaID
     */
    public int getTurmaID() {
        return turmaID;
    }


    /**
     * Sets the turmaID value for this ModalidadeTurma.
     * 
     * @param turmaID
     */
    public void setTurmaID(int turmaID) {
        this.turmaID = turmaID;
    }


    /**
     * Gets the nomeTurma value for this ModalidadeTurma.
     * 
     * @return nomeTurma
     */
    public java.lang.String getNomeTurma() {
        return nomeTurma;
    }


    /**
     * Sets the nomeTurma value for this ModalidadeTurma.
     * 
     * @param nomeTurma
     */
    public void setNomeTurma(java.lang.String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModalidadeTurma)) return false;
        ModalidadeTurma other = (ModalidadeTurma) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.modalidadeID == other.getModalidadeID() &&
            ((this.descricaoModalidade==null && other.getDescricaoModalidade()==null) || 
             (this.descricaoModalidade!=null &&
              this.descricaoModalidade.equals(other.getDescricaoModalidade()))) &&
            this.turmaID == other.getTurmaID() &&
            ((this.nomeTurma==null && other.getNomeTurma()==null) || 
             (this.nomeTurma!=null &&
              this.nomeTurma.equals(other.getNomeTurma())));
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
        _hashCode += getModalidadeID();
        if (getDescricaoModalidade() != null) {
            _hashCode += getDescricaoModalidade().hashCode();
        }
        _hashCode += getTurmaID();
        if (getNomeTurma() != null) {
            _hashCode += getNomeTurma().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModalidadeTurma.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ModalidadeTurma"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modalidadeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ModalidadeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoModalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DescricaoModalidade"));
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
