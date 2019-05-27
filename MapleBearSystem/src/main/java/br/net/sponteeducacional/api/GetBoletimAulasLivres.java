/**
 * GetBoletimAulasLivres.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetBoletimAulasLivres  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private int nContratoAulaLivreID;

    private int nDisciplinaID;

    public GetBoletimAulasLivres() {
    }

    public GetBoletimAulasLivres(
           int nCodigoCliente,
           java.lang.String sToken,
           int nContratoAulaLivreID,
           int nDisciplinaID) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nContratoAulaLivreID = nContratoAulaLivreID;
           this.nDisciplinaID = nDisciplinaID;
    }


    /**
     * Gets the nCodigoCliente value for this GetBoletimAulasLivres.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this GetBoletimAulasLivres.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this GetBoletimAulasLivres.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this GetBoletimAulasLivres.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nContratoAulaLivreID value for this GetBoletimAulasLivres.
     * 
     * @return nContratoAulaLivreID
     */
    public int getNContratoAulaLivreID() {
        return nContratoAulaLivreID;
    }


    /**
     * Sets the nContratoAulaLivreID value for this GetBoletimAulasLivres.
     * 
     * @param nContratoAulaLivreID
     */
    public void setNContratoAulaLivreID(int nContratoAulaLivreID) {
        this.nContratoAulaLivreID = nContratoAulaLivreID;
    }


    /**
     * Gets the nDisciplinaID value for this GetBoletimAulasLivres.
     * 
     * @return nDisciplinaID
     */
    public int getNDisciplinaID() {
        return nDisciplinaID;
    }


    /**
     * Sets the nDisciplinaID value for this GetBoletimAulasLivres.
     * 
     * @param nDisciplinaID
     */
    public void setNDisciplinaID(int nDisciplinaID) {
        this.nDisciplinaID = nDisciplinaID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBoletimAulasLivres)) return false;
        GetBoletimAulasLivres other = (GetBoletimAulasLivres) obj;
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
            this.nContratoAulaLivreID == other.getNContratoAulaLivreID() &&
            this.nDisciplinaID == other.getNDisciplinaID();
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
        _hashCode += getNContratoAulaLivreID();
        _hashCode += getNDisciplinaID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBoletimAulasLivres.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetBoletimAulasLivres"));
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
        elemField.setFieldName("NContratoAulaLivreID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContratoAulaLivreID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NDisciplinaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nDisciplinaID"));
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
