/**
 * GetAtendimentos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetAtendimentos  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private java.lang.String nCodigoFuncionario;

    private java.lang.String sDataInicial;

    private java.lang.String sDataFinal;

    public GetAtendimentos() {
    }

    public GetAtendimentos(
           int nCodigoCliente,
           java.lang.String sToken,
           java.lang.String nCodigoFuncionario,
           java.lang.String sDataInicial,
           java.lang.String sDataFinal) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nCodigoFuncionario = nCodigoFuncionario;
           this.sDataInicial = sDataInicial;
           this.sDataFinal = sDataFinal;
    }


    /**
     * Gets the nCodigoCliente value for this GetAtendimentos.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this GetAtendimentos.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this GetAtendimentos.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this GetAtendimentos.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nCodigoFuncionario value for this GetAtendimentos.
     * 
     * @return nCodigoFuncionario
     */
    public java.lang.String getNCodigoFuncionario() {
        return nCodigoFuncionario;
    }


    /**
     * Sets the nCodigoFuncionario value for this GetAtendimentos.
     * 
     * @param nCodigoFuncionario
     */
    public void setNCodigoFuncionario(java.lang.String nCodigoFuncionario) {
        this.nCodigoFuncionario = nCodigoFuncionario;
    }


    /**
     * Gets the sDataInicial value for this GetAtendimentos.
     * 
     * @return sDataInicial
     */
    public java.lang.String getSDataInicial() {
        return sDataInicial;
    }


    /**
     * Sets the sDataInicial value for this GetAtendimentos.
     * 
     * @param sDataInicial
     */
    public void setSDataInicial(java.lang.String sDataInicial) {
        this.sDataInicial = sDataInicial;
    }


    /**
     * Gets the sDataFinal value for this GetAtendimentos.
     * 
     * @return sDataFinal
     */
    public java.lang.String getSDataFinal() {
        return sDataFinal;
    }


    /**
     * Sets the sDataFinal value for this GetAtendimentos.
     * 
     * @param sDataFinal
     */
    public void setSDataFinal(java.lang.String sDataFinal) {
        this.sDataFinal = sDataFinal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAtendimentos)) return false;
        GetAtendimentos other = (GetAtendimentos) obj;
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
            ((this.nCodigoFuncionario==null && other.getNCodigoFuncionario()==null) || 
             (this.nCodigoFuncionario!=null &&
              this.nCodigoFuncionario.equals(other.getNCodigoFuncionario()))) &&
            ((this.sDataInicial==null && other.getSDataInicial()==null) || 
             (this.sDataInicial!=null &&
              this.sDataInicial.equals(other.getSDataInicial()))) &&
            ((this.sDataFinal==null && other.getSDataFinal()==null) || 
             (this.sDataFinal!=null &&
              this.sDataFinal.equals(other.getSDataFinal())));
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
        if (getNCodigoFuncionario() != null) {
            _hashCode += getNCodigoFuncionario().hashCode();
        }
        if (getSDataInicial() != null) {
            _hashCode += getSDataInicial().hashCode();
        }
        if (getSDataFinal() != null) {
            _hashCode += getSDataFinal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAtendimentos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetAtendimentos"));
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
        elemField.setFieldName("NCodigoFuncionario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoFuncionario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDataInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDataInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDataFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDataFinal"));
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
