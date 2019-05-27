/**
 * GetCartoesCatraca.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetCartoesCatraca  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private int nAlunoID;

    private int nResponsavelID;

    private int nVisitanteID;

    private int nFuncionarioID;

    public GetCartoesCatraca() {
    }

    public GetCartoesCatraca(
           int nCodigoCliente,
           java.lang.String sToken,
           int nAlunoID,
           int nResponsavelID,
           int nVisitanteID,
           int nFuncionarioID) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nAlunoID = nAlunoID;
           this.nResponsavelID = nResponsavelID;
           this.nVisitanteID = nVisitanteID;
           this.nFuncionarioID = nFuncionarioID;
    }


    /**
     * Gets the nCodigoCliente value for this GetCartoesCatraca.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this GetCartoesCatraca.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this GetCartoesCatraca.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this GetCartoesCatraca.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nAlunoID value for this GetCartoesCatraca.
     * 
     * @return nAlunoID
     */
    public int getNAlunoID() {
        return nAlunoID;
    }


    /**
     * Sets the nAlunoID value for this GetCartoesCatraca.
     * 
     * @param nAlunoID
     */
    public void setNAlunoID(int nAlunoID) {
        this.nAlunoID = nAlunoID;
    }


    /**
     * Gets the nResponsavelID value for this GetCartoesCatraca.
     * 
     * @return nResponsavelID
     */
    public int getNResponsavelID() {
        return nResponsavelID;
    }


    /**
     * Sets the nResponsavelID value for this GetCartoesCatraca.
     * 
     * @param nResponsavelID
     */
    public void setNResponsavelID(int nResponsavelID) {
        this.nResponsavelID = nResponsavelID;
    }


    /**
     * Gets the nVisitanteID value for this GetCartoesCatraca.
     * 
     * @return nVisitanteID
     */
    public int getNVisitanteID() {
        return nVisitanteID;
    }


    /**
     * Sets the nVisitanteID value for this GetCartoesCatraca.
     * 
     * @param nVisitanteID
     */
    public void setNVisitanteID(int nVisitanteID) {
        this.nVisitanteID = nVisitanteID;
    }


    /**
     * Gets the nFuncionarioID value for this GetCartoesCatraca.
     * 
     * @return nFuncionarioID
     */
    public int getNFuncionarioID() {
        return nFuncionarioID;
    }


    /**
     * Sets the nFuncionarioID value for this GetCartoesCatraca.
     * 
     * @param nFuncionarioID
     */
    public void setNFuncionarioID(int nFuncionarioID) {
        this.nFuncionarioID = nFuncionarioID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCartoesCatraca)) return false;
        GetCartoesCatraca other = (GetCartoesCatraca) obj;
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
            this.nResponsavelID == other.getNResponsavelID() &&
            this.nVisitanteID == other.getNVisitanteID() &&
            this.nFuncionarioID == other.getNFuncionarioID();
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
        _hashCode += getNResponsavelID();
        _hashCode += getNVisitanteID();
        _hashCode += getNFuncionarioID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCartoesCatraca.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetCartoesCatraca"));
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
        elemField.setFieldName("NResponsavelID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nResponsavelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NVisitanteID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nVisitanteID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NFuncionarioID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFuncionarioID"));
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
