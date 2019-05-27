/**
 * GetOcorrenciasAluno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetOcorrenciasAluno  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private int nAlunoID;

    private java.lang.String dDataInicial;

    private java.lang.String dDataFinal;

    public GetOcorrenciasAluno() {
    }

    public GetOcorrenciasAluno(
           int nCodigoCliente,
           java.lang.String sToken,
           int nAlunoID,
           java.lang.String dDataInicial,
           java.lang.String dDataFinal) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nAlunoID = nAlunoID;
           this.dDataInicial = dDataInicial;
           this.dDataFinal = dDataFinal;
    }


    /**
     * Gets the nCodigoCliente value for this GetOcorrenciasAluno.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this GetOcorrenciasAluno.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this GetOcorrenciasAluno.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this GetOcorrenciasAluno.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nAlunoID value for this GetOcorrenciasAluno.
     * 
     * @return nAlunoID
     */
    public int getNAlunoID() {
        return nAlunoID;
    }


    /**
     * Sets the nAlunoID value for this GetOcorrenciasAluno.
     * 
     * @param nAlunoID
     */
    public void setNAlunoID(int nAlunoID) {
        this.nAlunoID = nAlunoID;
    }


    /**
     * Gets the dDataInicial value for this GetOcorrenciasAluno.
     * 
     * @return dDataInicial
     */
    public java.lang.String getDDataInicial() {
        return dDataInicial;
    }


    /**
     * Sets the dDataInicial value for this GetOcorrenciasAluno.
     * 
     * @param dDataInicial
     */
    public void setDDataInicial(java.lang.String dDataInicial) {
        this.dDataInicial = dDataInicial;
    }


    /**
     * Gets the dDataFinal value for this GetOcorrenciasAluno.
     * 
     * @return dDataFinal
     */
    public java.lang.String getDDataFinal() {
        return dDataFinal;
    }


    /**
     * Sets the dDataFinal value for this GetOcorrenciasAluno.
     * 
     * @param dDataFinal
     */
    public void setDDataFinal(java.lang.String dDataFinal) {
        this.dDataFinal = dDataFinal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOcorrenciasAluno)) return false;
        GetOcorrenciasAluno other = (GetOcorrenciasAluno) obj;
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
            ((this.dDataInicial==null && other.getDDataInicial()==null) || 
             (this.dDataInicial!=null &&
              this.dDataInicial.equals(other.getDDataInicial()))) &&
            ((this.dDataFinal==null && other.getDDataFinal()==null) || 
             (this.dDataFinal!=null &&
              this.dDataFinal.equals(other.getDDataFinal())));
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
        if (getDDataInicial() != null) {
            _hashCode += getDDataInicial().hashCode();
        }
        if (getDDataFinal() != null) {
            _hashCode += getDDataFinal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOcorrenciasAluno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetOcorrenciasAluno"));
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
        elemField.setFieldName("DDataInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DDataFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataFinal"));
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
