/**
 * InsertConteudoDiario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertConteudoDiario  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private int nDiarioClasseID;

    private java.lang.String sConteudo;

    private java.lang.String sObservacao;

    private java.lang.String sSituacao;

    public InsertConteudoDiario() {
    }

    public InsertConteudoDiario(
           int nCodigoCliente,
           java.lang.String sToken,
           int nDiarioClasseID,
           java.lang.String sConteudo,
           java.lang.String sObservacao,
           java.lang.String sSituacao) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nDiarioClasseID = nDiarioClasseID;
           this.sConteudo = sConteudo;
           this.sObservacao = sObservacao;
           this.sSituacao = sSituacao;
    }


    /**
     * Gets the nCodigoCliente value for this InsertConteudoDiario.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this InsertConteudoDiario.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this InsertConteudoDiario.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this InsertConteudoDiario.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nDiarioClasseID value for this InsertConteudoDiario.
     * 
     * @return nDiarioClasseID
     */
    public int getNDiarioClasseID() {
        return nDiarioClasseID;
    }


    /**
     * Sets the nDiarioClasseID value for this InsertConteudoDiario.
     * 
     * @param nDiarioClasseID
     */
    public void setNDiarioClasseID(int nDiarioClasseID) {
        this.nDiarioClasseID = nDiarioClasseID;
    }


    /**
     * Gets the sConteudo value for this InsertConteudoDiario.
     * 
     * @return sConteudo
     */
    public java.lang.String getSConteudo() {
        return sConteudo;
    }


    /**
     * Sets the sConteudo value for this InsertConteudoDiario.
     * 
     * @param sConteudo
     */
    public void setSConteudo(java.lang.String sConteudo) {
        this.sConteudo = sConteudo;
    }


    /**
     * Gets the sObservacao value for this InsertConteudoDiario.
     * 
     * @return sObservacao
     */
    public java.lang.String getSObservacao() {
        return sObservacao;
    }


    /**
     * Sets the sObservacao value for this InsertConteudoDiario.
     * 
     * @param sObservacao
     */
    public void setSObservacao(java.lang.String sObservacao) {
        this.sObservacao = sObservacao;
    }


    /**
     * Gets the sSituacao value for this InsertConteudoDiario.
     * 
     * @return sSituacao
     */
    public java.lang.String getSSituacao() {
        return sSituacao;
    }


    /**
     * Sets the sSituacao value for this InsertConteudoDiario.
     * 
     * @param sSituacao
     */
    public void setSSituacao(java.lang.String sSituacao) {
        this.sSituacao = sSituacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertConteudoDiario)) return false;
        InsertConteudoDiario other = (InsertConteudoDiario) obj;
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
            this.nDiarioClasseID == other.getNDiarioClasseID() &&
            ((this.sConteudo==null && other.getSConteudo()==null) || 
             (this.sConteudo!=null &&
              this.sConteudo.equals(other.getSConteudo()))) &&
            ((this.sObservacao==null && other.getSObservacao()==null) || 
             (this.sObservacao!=null &&
              this.sObservacao.equals(other.getSObservacao()))) &&
            ((this.sSituacao==null && other.getSSituacao()==null) || 
             (this.sSituacao!=null &&
              this.sSituacao.equals(other.getSSituacao())));
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
        _hashCode += getNDiarioClasseID();
        if (getSConteudo() != null) {
            _hashCode += getSConteudo().hashCode();
        }
        if (getSObservacao() != null) {
            _hashCode += getSObservacao().hashCode();
        }
        if (getSSituacao() != null) {
            _hashCode += getSSituacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertConteudoDiario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertConteudoDiario"));
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
        elemField.setFieldName("NDiarioClasseID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nDiarioClasseID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SConteudo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sConteudo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SObservacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSituacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSituacao"));
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
