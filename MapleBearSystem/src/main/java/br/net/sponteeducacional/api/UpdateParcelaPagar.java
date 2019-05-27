/**
 * UpdateParcelaPagar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class UpdateParcelaPagar  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private int nContaPagarID;

    private int nNumeroParcela;

    private java.lang.String dDataVencimento;

    private java.lang.String nValor;

    private java.lang.String nFormaCobrancaID;

    private java.lang.String nContaID;

    private java.lang.String nCategoriaID;

    private java.lang.String sObservacao;

    public UpdateParcelaPagar() {
    }

    public UpdateParcelaPagar(
           int nCodigoCliente,
           java.lang.String sToken,
           int nContaPagarID,
           int nNumeroParcela,
           java.lang.String dDataVencimento,
           java.lang.String nValor,
           java.lang.String nFormaCobrancaID,
           java.lang.String nContaID,
           java.lang.String nCategoriaID,
           java.lang.String sObservacao) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nContaPagarID = nContaPagarID;
           this.nNumeroParcela = nNumeroParcela;
           this.dDataVencimento = dDataVencimento;
           this.nValor = nValor;
           this.nFormaCobrancaID = nFormaCobrancaID;
           this.nContaID = nContaID;
           this.nCategoriaID = nCategoriaID;
           this.sObservacao = sObservacao;
    }


    /**
     * Gets the nCodigoCliente value for this UpdateParcelaPagar.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this UpdateParcelaPagar.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this UpdateParcelaPagar.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this UpdateParcelaPagar.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nContaPagarID value for this UpdateParcelaPagar.
     * 
     * @return nContaPagarID
     */
    public int getNContaPagarID() {
        return nContaPagarID;
    }


    /**
     * Sets the nContaPagarID value for this UpdateParcelaPagar.
     * 
     * @param nContaPagarID
     */
    public void setNContaPagarID(int nContaPagarID) {
        this.nContaPagarID = nContaPagarID;
    }


    /**
     * Gets the nNumeroParcela value for this UpdateParcelaPagar.
     * 
     * @return nNumeroParcela
     */
    public int getNNumeroParcela() {
        return nNumeroParcela;
    }


    /**
     * Sets the nNumeroParcela value for this UpdateParcelaPagar.
     * 
     * @param nNumeroParcela
     */
    public void setNNumeroParcela(int nNumeroParcela) {
        this.nNumeroParcela = nNumeroParcela;
    }


    /**
     * Gets the dDataVencimento value for this UpdateParcelaPagar.
     * 
     * @return dDataVencimento
     */
    public java.lang.String getDDataVencimento() {
        return dDataVencimento;
    }


    /**
     * Sets the dDataVencimento value for this UpdateParcelaPagar.
     * 
     * @param dDataVencimento
     */
    public void setDDataVencimento(java.lang.String dDataVencimento) {
        this.dDataVencimento = dDataVencimento;
    }


    /**
     * Gets the nValor value for this UpdateParcelaPagar.
     * 
     * @return nValor
     */
    public java.lang.String getNValor() {
        return nValor;
    }


    /**
     * Sets the nValor value for this UpdateParcelaPagar.
     * 
     * @param nValor
     */
    public void setNValor(java.lang.String nValor) {
        this.nValor = nValor;
    }


    /**
     * Gets the nFormaCobrancaID value for this UpdateParcelaPagar.
     * 
     * @return nFormaCobrancaID
     */
    public java.lang.String getNFormaCobrancaID() {
        return nFormaCobrancaID;
    }


    /**
     * Sets the nFormaCobrancaID value for this UpdateParcelaPagar.
     * 
     * @param nFormaCobrancaID
     */
    public void setNFormaCobrancaID(java.lang.String nFormaCobrancaID) {
        this.nFormaCobrancaID = nFormaCobrancaID;
    }


    /**
     * Gets the nContaID value for this UpdateParcelaPagar.
     * 
     * @return nContaID
     */
    public java.lang.String getNContaID() {
        return nContaID;
    }


    /**
     * Sets the nContaID value for this UpdateParcelaPagar.
     * 
     * @param nContaID
     */
    public void setNContaID(java.lang.String nContaID) {
        this.nContaID = nContaID;
    }


    /**
     * Gets the nCategoriaID value for this UpdateParcelaPagar.
     * 
     * @return nCategoriaID
     */
    public java.lang.String getNCategoriaID() {
        return nCategoriaID;
    }


    /**
     * Sets the nCategoriaID value for this UpdateParcelaPagar.
     * 
     * @param nCategoriaID
     */
    public void setNCategoriaID(java.lang.String nCategoriaID) {
        this.nCategoriaID = nCategoriaID;
    }


    /**
     * Gets the sObservacao value for this UpdateParcelaPagar.
     * 
     * @return sObservacao
     */
    public java.lang.String getSObservacao() {
        return sObservacao;
    }


    /**
     * Sets the sObservacao value for this UpdateParcelaPagar.
     * 
     * @param sObservacao
     */
    public void setSObservacao(java.lang.String sObservacao) {
        this.sObservacao = sObservacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateParcelaPagar)) return false;
        UpdateParcelaPagar other = (UpdateParcelaPagar) obj;
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
            this.nContaPagarID == other.getNContaPagarID() &&
            this.nNumeroParcela == other.getNNumeroParcela() &&
            ((this.dDataVencimento==null && other.getDDataVencimento()==null) || 
             (this.dDataVencimento!=null &&
              this.dDataVencimento.equals(other.getDDataVencimento()))) &&
            ((this.nValor==null && other.getNValor()==null) || 
             (this.nValor!=null &&
              this.nValor.equals(other.getNValor()))) &&
            ((this.nFormaCobrancaID==null && other.getNFormaCobrancaID()==null) || 
             (this.nFormaCobrancaID!=null &&
              this.nFormaCobrancaID.equals(other.getNFormaCobrancaID()))) &&
            ((this.nContaID==null && other.getNContaID()==null) || 
             (this.nContaID!=null &&
              this.nContaID.equals(other.getNContaID()))) &&
            ((this.nCategoriaID==null && other.getNCategoriaID()==null) || 
             (this.nCategoriaID!=null &&
              this.nCategoriaID.equals(other.getNCategoriaID()))) &&
            ((this.sObservacao==null && other.getSObservacao()==null) || 
             (this.sObservacao!=null &&
              this.sObservacao.equals(other.getSObservacao())));
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
        _hashCode += getNContaPagarID();
        _hashCode += getNNumeroParcela();
        if (getDDataVencimento() != null) {
            _hashCode += getDDataVencimento().hashCode();
        }
        if (getNValor() != null) {
            _hashCode += getNValor().hashCode();
        }
        if (getNFormaCobrancaID() != null) {
            _hashCode += getNFormaCobrancaID().hashCode();
        }
        if (getNContaID() != null) {
            _hashCode += getNContaID().hashCode();
        }
        if (getNCategoriaID() != null) {
            _hashCode += getNCategoriaID().hashCode();
        }
        if (getSObservacao() != null) {
            _hashCode += getSObservacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateParcelaPagar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateParcelaPagar"));
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
        elemField.setFieldName("NContaPagarID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContaPagarID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NNumeroParcela");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroParcela"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DDataVencimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataVencimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NValor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nValor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NFormaCobrancaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFormaCobrancaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NContaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NCategoriaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCategoriaID"));
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
