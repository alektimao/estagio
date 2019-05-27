/**
 * GetLinhaDigitavelBoletos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetLinhaDigitavelBoletos  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private int nContaReceberID;

    private java.lang.String nNumeroParcela;

    public GetLinhaDigitavelBoletos() {
    }

    public GetLinhaDigitavelBoletos(
           int nCodigoCliente,
           java.lang.String sToken,
           int nContaReceberID,
           java.lang.String nNumeroParcela) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nContaReceberID = nContaReceberID;
           this.nNumeroParcela = nNumeroParcela;
    }


    /**
     * Gets the nCodigoCliente value for this GetLinhaDigitavelBoletos.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this GetLinhaDigitavelBoletos.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this GetLinhaDigitavelBoletos.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this GetLinhaDigitavelBoletos.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nContaReceberID value for this GetLinhaDigitavelBoletos.
     * 
     * @return nContaReceberID
     */
    public int getNContaReceberID() {
        return nContaReceberID;
    }


    /**
     * Sets the nContaReceberID value for this GetLinhaDigitavelBoletos.
     * 
     * @param nContaReceberID
     */
    public void setNContaReceberID(int nContaReceberID) {
        this.nContaReceberID = nContaReceberID;
    }


    /**
     * Gets the nNumeroParcela value for this GetLinhaDigitavelBoletos.
     * 
     * @return nNumeroParcela
     */
    public java.lang.String getNNumeroParcela() {
        return nNumeroParcela;
    }


    /**
     * Sets the nNumeroParcela value for this GetLinhaDigitavelBoletos.
     * 
     * @param nNumeroParcela
     */
    public void setNNumeroParcela(java.lang.String nNumeroParcela) {
        this.nNumeroParcela = nNumeroParcela;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLinhaDigitavelBoletos)) return false;
        GetLinhaDigitavelBoletos other = (GetLinhaDigitavelBoletos) obj;
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
            this.nContaReceberID == other.getNContaReceberID() &&
            ((this.nNumeroParcela==null && other.getNNumeroParcela()==null) || 
             (this.nNumeroParcela!=null &&
              this.nNumeroParcela.equals(other.getNNumeroParcela())));
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
        _hashCode += getNContaReceberID();
        if (getNNumeroParcela() != null) {
            _hashCode += getNNumeroParcela().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLinhaDigitavelBoletos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetLinhaDigitavelBoletos"));
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
        elemField.setFieldName("NContaReceberID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContaReceberID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NNumeroParcela");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroParcela"));
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
