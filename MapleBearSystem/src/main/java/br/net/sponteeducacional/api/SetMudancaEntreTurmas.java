/**
 * SetMudancaEntreTurmas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class SetMudancaEntreTurmas  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private int alunoID;

    private int turmaOrigemID;

    private int turmaDestinoID;

    private java.lang.String observacoes;

    private int nSituacaoAlunoTurmaID;

    public SetMudancaEntreTurmas() {
    }

    public SetMudancaEntreTurmas(
           int nCodigoCliente,
           java.lang.String sToken,
           int alunoID,
           int turmaOrigemID,
           int turmaDestinoID,
           java.lang.String observacoes,
           int nSituacaoAlunoTurmaID) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.alunoID = alunoID;
           this.turmaOrigemID = turmaOrigemID;
           this.turmaDestinoID = turmaDestinoID;
           this.observacoes = observacoes;
           this.nSituacaoAlunoTurmaID = nSituacaoAlunoTurmaID;
    }


    /**
     * Gets the nCodigoCliente value for this SetMudancaEntreTurmas.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this SetMudancaEntreTurmas.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this SetMudancaEntreTurmas.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this SetMudancaEntreTurmas.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the alunoID value for this SetMudancaEntreTurmas.
     * 
     * @return alunoID
     */
    public int getAlunoID() {
        return alunoID;
    }


    /**
     * Sets the alunoID value for this SetMudancaEntreTurmas.
     * 
     * @param alunoID
     */
    public void setAlunoID(int alunoID) {
        this.alunoID = alunoID;
    }


    /**
     * Gets the turmaOrigemID value for this SetMudancaEntreTurmas.
     * 
     * @return turmaOrigemID
     */
    public int getTurmaOrigemID() {
        return turmaOrigemID;
    }


    /**
     * Sets the turmaOrigemID value for this SetMudancaEntreTurmas.
     * 
     * @param turmaOrigemID
     */
    public void setTurmaOrigemID(int turmaOrigemID) {
        this.turmaOrigemID = turmaOrigemID;
    }


    /**
     * Gets the turmaDestinoID value for this SetMudancaEntreTurmas.
     * 
     * @return turmaDestinoID
     */
    public int getTurmaDestinoID() {
        return turmaDestinoID;
    }


    /**
     * Sets the turmaDestinoID value for this SetMudancaEntreTurmas.
     * 
     * @param turmaDestinoID
     */
    public void setTurmaDestinoID(int turmaDestinoID) {
        this.turmaDestinoID = turmaDestinoID;
    }


    /**
     * Gets the observacoes value for this SetMudancaEntreTurmas.
     * 
     * @return observacoes
     */
    public java.lang.String getObservacoes() {
        return observacoes;
    }


    /**
     * Sets the observacoes value for this SetMudancaEntreTurmas.
     * 
     * @param observacoes
     */
    public void setObservacoes(java.lang.String observacoes) {
        this.observacoes = observacoes;
    }


    /**
     * Gets the nSituacaoAlunoTurmaID value for this SetMudancaEntreTurmas.
     * 
     * @return nSituacaoAlunoTurmaID
     */
    public int getNSituacaoAlunoTurmaID() {
        return nSituacaoAlunoTurmaID;
    }


    /**
     * Sets the nSituacaoAlunoTurmaID value for this SetMudancaEntreTurmas.
     * 
     * @param nSituacaoAlunoTurmaID
     */
    public void setNSituacaoAlunoTurmaID(int nSituacaoAlunoTurmaID) {
        this.nSituacaoAlunoTurmaID = nSituacaoAlunoTurmaID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetMudancaEntreTurmas)) return false;
        SetMudancaEntreTurmas other = (SetMudancaEntreTurmas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.nCodigoCliente == other.getNCodigoCliente() &&
            ((this.sToken==null && other.getSToken()==null) || 
             (this.sToken!=null &&
              this.sToken.equals(other.getSToken()))) &&
            this.alunoID == other.getAlunoID() &&
            this.turmaOrigemID == other.getTurmaOrigemID() &&
            this.turmaDestinoID == other.getTurmaDestinoID() &&
            ((this.observacoes==null && other.getObservacoes()==null) || 
             (this.observacoes!=null &&
              this.observacoes.equals(other.getObservacoes()))) &&
            this.nSituacaoAlunoTurmaID == other.getNSituacaoAlunoTurmaID();
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
        _hashCode += getNCodigoCliente();
        if (getSToken() != null) {
            _hashCode += getSToken().hashCode();
        }
        _hashCode += getAlunoID();
        _hashCode += getTurmaOrigemID();
        _hashCode += getTurmaDestinoID();
        if (getObservacoes() != null) {
            _hashCode += getObservacoes().hashCode();
        }
        _hashCode += getNSituacaoAlunoTurmaID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetMudancaEntreTurmas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">SetMudancaEntreTurmas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NCodigoCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"));
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
        elemField.setFieldName("turmaOrigemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TurmaOrigemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("turmaDestinoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TurmaDestinoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacoes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Observacoes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NSituacaoAlunoTurmaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nSituacaoAlunoTurmaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
