/**
 * SetNota.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class SetNota  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private int nTurmaID;

    private int nDisciplinaID;

    private int nAlunoId;

    private java.lang.String nNota;

    private int nModulo;

    private int nPeriodo;

    public SetNota() {
    }

    public SetNota(
           int nCodigoCliente,
           java.lang.String sToken,
           int nTurmaID,
           int nDisciplinaID,
           int nAlunoId,
           java.lang.String nNota,
           int nModulo,
           int nPeriodo) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nTurmaID = nTurmaID;
           this.nDisciplinaID = nDisciplinaID;
           this.nAlunoId = nAlunoId;
           this.nNota = nNota;
           this.nModulo = nModulo;
           this.nPeriodo = nPeriodo;
    }


    /**
     * Gets the nCodigoCliente value for this SetNota.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this SetNota.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this SetNota.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this SetNota.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nTurmaID value for this SetNota.
     * 
     * @return nTurmaID
     */
    public int getNTurmaID() {
        return nTurmaID;
    }


    /**
     * Sets the nTurmaID value for this SetNota.
     * 
     * @param nTurmaID
     */
    public void setNTurmaID(int nTurmaID) {
        this.nTurmaID = nTurmaID;
    }


    /**
     * Gets the nDisciplinaID value for this SetNota.
     * 
     * @return nDisciplinaID
     */
    public int getNDisciplinaID() {
        return nDisciplinaID;
    }


    /**
     * Sets the nDisciplinaID value for this SetNota.
     * 
     * @param nDisciplinaID
     */
    public void setNDisciplinaID(int nDisciplinaID) {
        this.nDisciplinaID = nDisciplinaID;
    }


    /**
     * Gets the nAlunoId value for this SetNota.
     * 
     * @return nAlunoId
     */
    public int getNAlunoId() {
        return nAlunoId;
    }


    /**
     * Sets the nAlunoId value for this SetNota.
     * 
     * @param nAlunoId
     */
    public void setNAlunoId(int nAlunoId) {
        this.nAlunoId = nAlunoId;
    }


    /**
     * Gets the nNota value for this SetNota.
     * 
     * @return nNota
     */
    public java.lang.String getNNota() {
        return nNota;
    }


    /**
     * Sets the nNota value for this SetNota.
     * 
     * @param nNota
     */
    public void setNNota(java.lang.String nNota) {
        this.nNota = nNota;
    }


    /**
     * Gets the nModulo value for this SetNota.
     * 
     * @return nModulo
     */
    public int getNModulo() {
        return nModulo;
    }


    /**
     * Sets the nModulo value for this SetNota.
     * 
     * @param nModulo
     */
    public void setNModulo(int nModulo) {
        this.nModulo = nModulo;
    }


    /**
     * Gets the nPeriodo value for this SetNota.
     * 
     * @return nPeriodo
     */
    public int getNPeriodo() {
        return nPeriodo;
    }


    /**
     * Sets the nPeriodo value for this SetNota.
     * 
     * @param nPeriodo
     */
    public void setNPeriodo(int nPeriodo) {
        this.nPeriodo = nPeriodo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetNota)) return false;
        SetNota other = (SetNota) obj;
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
            ((this.nNota==null && other.getNNota()==null) || 
             (this.nNota!=null &&
              this.nNota.equals(other.getNNota()))) &&
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
        if (getNNota() != null) {
            _hashCode += getNNota().hashCode();
        }
        _hashCode += getNModulo();
        _hashCode += getNPeriodo();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetNota.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">SetNota"));
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
        elemField.setFieldName("NNota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNota"));
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
