/**
 * GetMediaFinal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetMediaFinal  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private int nAlunoID;

    private int nTurmaID;

    private int nDisciplinaID;

    private java.lang.String nModulo;

    public GetMediaFinal() {
    }

    public GetMediaFinal(
           int nCodigoCliente,
           java.lang.String sToken,
           int nAlunoID,
           int nTurmaID,
           int nDisciplinaID,
           java.lang.String nModulo) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nAlunoID = nAlunoID;
           this.nTurmaID = nTurmaID;
           this.nDisciplinaID = nDisciplinaID;
           this.nModulo = nModulo;
    }


    /**
     * Gets the nCodigoCliente value for this GetMediaFinal.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this GetMediaFinal.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this GetMediaFinal.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this GetMediaFinal.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nAlunoID value for this GetMediaFinal.
     * 
     * @return nAlunoID
     */
    public int getNAlunoID() {
        return nAlunoID;
    }


    /**
     * Sets the nAlunoID value for this GetMediaFinal.
     * 
     * @param nAlunoID
     */
    public void setNAlunoID(int nAlunoID) {
        this.nAlunoID = nAlunoID;
    }


    /**
     * Gets the nTurmaID value for this GetMediaFinal.
     * 
     * @return nTurmaID
     */
    public int getNTurmaID() {
        return nTurmaID;
    }


    /**
     * Sets the nTurmaID value for this GetMediaFinal.
     * 
     * @param nTurmaID
     */
    public void setNTurmaID(int nTurmaID) {
        this.nTurmaID = nTurmaID;
    }


    /**
     * Gets the nDisciplinaID value for this GetMediaFinal.
     * 
     * @return nDisciplinaID
     */
    public int getNDisciplinaID() {
        return nDisciplinaID;
    }


    /**
     * Sets the nDisciplinaID value for this GetMediaFinal.
     * 
     * @param nDisciplinaID
     */
    public void setNDisciplinaID(int nDisciplinaID) {
        this.nDisciplinaID = nDisciplinaID;
    }


    /**
     * Gets the nModulo value for this GetMediaFinal.
     * 
     * @return nModulo
     */
    public java.lang.String getNModulo() {
        return nModulo;
    }


    /**
     * Sets the nModulo value for this GetMediaFinal.
     * 
     * @param nModulo
     */
    public void setNModulo(java.lang.String nModulo) {
        this.nModulo = nModulo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMediaFinal)) return false;
        GetMediaFinal other = (GetMediaFinal) obj;
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
            this.nAlunoID == other.getNAlunoID() &&
            this.nTurmaID == other.getNTurmaID() &&
            this.nDisciplinaID == other.getNDisciplinaID() &&
            ((this.nModulo==null && other.getNModulo()==null) || 
             (this.nModulo!=null &&
              this.nModulo.equals(other.getNModulo())));
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
        _hashCode += getNAlunoID();
        _hashCode += getNTurmaID();
        _hashCode += getNDisciplinaID();
        if (getNModulo() != null) {
            _hashCode += getNModulo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMediaFinal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetMediaFinal"));
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
        elemField.setFieldName("NAlunoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("NModulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModulo"));
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
