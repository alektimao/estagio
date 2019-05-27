/**
 * SetNotaParcial.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class SetNotaParcial  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private int nTurmaID;

    private int nDisciplinaID;

    private int nAlunoId;

    private java.lang.String sNomeAvaliacao;

    private java.lang.String nNota;

    private java.lang.String nPesoAvaliacao;

    private int nModulo;

    private int nPeriodo;

    public SetNotaParcial() {
    }

    public SetNotaParcial(
           int nCodigoCliente,
           java.lang.String sToken,
           int nTurmaID,
           int nDisciplinaID,
           int nAlunoId,
           java.lang.String sNomeAvaliacao,
           java.lang.String nNota,
           java.lang.String nPesoAvaliacao,
           int nModulo,
           int nPeriodo) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nTurmaID = nTurmaID;
           this.nDisciplinaID = nDisciplinaID;
           this.nAlunoId = nAlunoId;
           this.sNomeAvaliacao = sNomeAvaliacao;
           this.nNota = nNota;
           this.nPesoAvaliacao = nPesoAvaliacao;
           this.nModulo = nModulo;
           this.nPeriodo = nPeriodo;
    }


    /**
     * Gets the nCodigoCliente value for this SetNotaParcial.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this SetNotaParcial.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this SetNotaParcial.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this SetNotaParcial.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nTurmaID value for this SetNotaParcial.
     * 
     * @return nTurmaID
     */
    public int getNTurmaID() {
        return nTurmaID;
    }


    /**
     * Sets the nTurmaID value for this SetNotaParcial.
     * 
     * @param nTurmaID
     */
    public void setNTurmaID(int nTurmaID) {
        this.nTurmaID = nTurmaID;
    }


    /**
     * Gets the nDisciplinaID value for this SetNotaParcial.
     * 
     * @return nDisciplinaID
     */
    public int getNDisciplinaID() {
        return nDisciplinaID;
    }


    /**
     * Sets the nDisciplinaID value for this SetNotaParcial.
     * 
     * @param nDisciplinaID
     */
    public void setNDisciplinaID(int nDisciplinaID) {
        this.nDisciplinaID = nDisciplinaID;
    }


    /**
     * Gets the nAlunoId value for this SetNotaParcial.
     * 
     * @return nAlunoId
     */
    public int getNAlunoId() {
        return nAlunoId;
    }


    /**
     * Sets the nAlunoId value for this SetNotaParcial.
     * 
     * @param nAlunoId
     */
    public void setNAlunoId(int nAlunoId) {
        this.nAlunoId = nAlunoId;
    }


    /**
     * Gets the sNomeAvaliacao value for this SetNotaParcial.
     * 
     * @return sNomeAvaliacao
     */
    public java.lang.String getSNomeAvaliacao() {
        return sNomeAvaliacao;
    }


    /**
     * Sets the sNomeAvaliacao value for this SetNotaParcial.
     * 
     * @param sNomeAvaliacao
     */
    public void setSNomeAvaliacao(java.lang.String sNomeAvaliacao) {
        this.sNomeAvaliacao = sNomeAvaliacao;
    }


    /**
     * Gets the nNota value for this SetNotaParcial.
     * 
     * @return nNota
     */
    public java.lang.String getNNota() {
        return nNota;
    }


    /**
     * Sets the nNota value for this SetNotaParcial.
     * 
     * @param nNota
     */
    public void setNNota(java.lang.String nNota) {
        this.nNota = nNota;
    }


    /**
     * Gets the nPesoAvaliacao value for this SetNotaParcial.
     * 
     * @return nPesoAvaliacao
     */
    public java.lang.String getNPesoAvaliacao() {
        return nPesoAvaliacao;
    }


    /**
     * Sets the nPesoAvaliacao value for this SetNotaParcial.
     * 
     * @param nPesoAvaliacao
     */
    public void setNPesoAvaliacao(java.lang.String nPesoAvaliacao) {
        this.nPesoAvaliacao = nPesoAvaliacao;
    }


    /**
     * Gets the nModulo value for this SetNotaParcial.
     * 
     * @return nModulo
     */
    public int getNModulo() {
        return nModulo;
    }


    /**
     * Sets the nModulo value for this SetNotaParcial.
     * 
     * @param nModulo
     */
    public void setNModulo(int nModulo) {
        this.nModulo = nModulo;
    }


    /**
     * Gets the nPeriodo value for this SetNotaParcial.
     * 
     * @return nPeriodo
     */
    public int getNPeriodo() {
        return nPeriodo;
    }


    /**
     * Sets the nPeriodo value for this SetNotaParcial.
     * 
     * @param nPeriodo
     */
    public void setNPeriodo(int nPeriodo) {
        this.nPeriodo = nPeriodo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetNotaParcial)) return false;
        SetNotaParcial other = (SetNotaParcial) obj;
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
            this.nTurmaID == other.getNTurmaID() &&
            this.nDisciplinaID == other.getNDisciplinaID() &&
            this.nAlunoId == other.getNAlunoId() &&
            ((this.sNomeAvaliacao==null && other.getSNomeAvaliacao()==null) || 
             (this.sNomeAvaliacao!=null &&
              this.sNomeAvaliacao.equals(other.getSNomeAvaliacao()))) &&
            ((this.nNota==null && other.getNNota()==null) || 
             (this.nNota!=null &&
              this.nNota.equals(other.getNNota()))) &&
            ((this.nPesoAvaliacao==null && other.getNPesoAvaliacao()==null) || 
             (this.nPesoAvaliacao!=null &&
              this.nPesoAvaliacao.equals(other.getNPesoAvaliacao()))) &&
            this.nModulo == other.getNModulo() &&
            this.nPeriodo == other.getNPeriodo();
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
        _hashCode += getNTurmaID();
        _hashCode += getNDisciplinaID();
        _hashCode += getNAlunoId();
        if (getSNomeAvaliacao() != null) {
            _hashCode += getSNomeAvaliacao().hashCode();
        }
        if (getNNota() != null) {
            _hashCode += getNNota().hashCode();
        }
        if (getNPesoAvaliacao() != null) {
            _hashCode += getNPesoAvaliacao().hashCode();
        }
        _hashCode += getNModulo();
        _hashCode += getNPeriodo();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetNotaParcial.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">SetNotaParcial"));
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
        elemField.setFieldName("NTurmaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurmaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NDisciplinaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nDisciplinaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NAlunoId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SNomeAvaliacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNomeAvaliacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NNota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NPesoAvaliacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nPesoAvaliacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NModulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NPeriodo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nPeriodo"));
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
