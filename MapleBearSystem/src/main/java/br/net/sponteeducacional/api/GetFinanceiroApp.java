/**
 * GetFinanceiroApp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetFinanceiroApp  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private java.lang.String sParametrosBusca;

    private short nNumeroPagina;

    public GetFinanceiroApp() {
    }

    public GetFinanceiroApp(
           int nCodigoCliente,
           java.lang.String sToken,
           java.lang.String sParametrosBusca,
           short nNumeroPagina) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.sParametrosBusca = sParametrosBusca;
           this.nNumeroPagina = nNumeroPagina;
    }


    /**
     * Gets the nCodigoCliente value for this GetFinanceiroApp.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this GetFinanceiroApp.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this GetFinanceiroApp.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this GetFinanceiroApp.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the sParametrosBusca value for this GetFinanceiroApp.
     * 
     * @return sParametrosBusca
     */
    public java.lang.String getSParametrosBusca() {
        return sParametrosBusca;
    }


    /**
     * Sets the sParametrosBusca value for this GetFinanceiroApp.
     * 
     * @param sParametrosBusca
     */
    public void setSParametrosBusca(java.lang.String sParametrosBusca) {
        this.sParametrosBusca = sParametrosBusca;
    }


    /**
     * Gets the nNumeroPagina value for this GetFinanceiroApp.
     * 
     * @return nNumeroPagina
     */
    public short getNNumeroPagina() {
        return nNumeroPagina;
    }


    /**
     * Sets the nNumeroPagina value for this GetFinanceiroApp.
     * 
     * @param nNumeroPagina
     */
    public void setNNumeroPagina(short nNumeroPagina) {
        this.nNumeroPagina = nNumeroPagina;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFinanceiroApp)) return false;
        GetFinanceiroApp other = (GetFinanceiroApp) obj;
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
            ((this.sParametrosBusca==null && other.getSParametrosBusca()==null) || 
             (this.sParametrosBusca!=null &&
              this.sParametrosBusca.equals(other.getSParametrosBusca()))) &&
            this.nNumeroPagina == other.getNNumeroPagina();
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
        if (getSParametrosBusca() != null) {
            _hashCode += getSParametrosBusca().hashCode();
        }
        _hashCode += getNNumeroPagina();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFinanceiroApp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetFinanceiroApp"));
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
        elemField.setFieldName("SParametrosBusca");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NNumeroPagina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroPagina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
