/**
 * UpdatePlanoPagar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class UpdatePlanoPagar  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private int nContaPagarID;

    private java.lang.String dDataPrimeiroVencimento;

    private java.lang.String nNumeroParcelas;

    private java.lang.String nValorParcelas;

    private java.lang.String nFormaCobrancaID;

    private java.lang.String nCategoriaID;

    private java.lang.String nContaID;

    private java.lang.String sObservacao;

    private java.lang.String sComplemento;

    private java.lang.String sDocumento;

    public UpdatePlanoPagar() {
    }

    public UpdatePlanoPagar(
           int nCodigoCliente,
           java.lang.String sToken,
           int nContaPagarID,
           java.lang.String dDataPrimeiroVencimento,
           java.lang.String nNumeroParcelas,
           java.lang.String nValorParcelas,
           java.lang.String nFormaCobrancaID,
           java.lang.String nCategoriaID,
           java.lang.String nContaID,
           java.lang.String sObservacao,
           java.lang.String sComplemento,
           java.lang.String sDocumento) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nContaPagarID = nContaPagarID;
           this.dDataPrimeiroVencimento = dDataPrimeiroVencimento;
           this.nNumeroParcelas = nNumeroParcelas;
           this.nValorParcelas = nValorParcelas;
           this.nFormaCobrancaID = nFormaCobrancaID;
           this.nCategoriaID = nCategoriaID;
           this.nContaID = nContaID;
           this.sObservacao = sObservacao;
           this.sComplemento = sComplemento;
           this.sDocumento = sDocumento;
    }


    /**
     * Gets the nCodigoCliente value for this UpdatePlanoPagar.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this UpdatePlanoPagar.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this UpdatePlanoPagar.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this UpdatePlanoPagar.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nContaPagarID value for this UpdatePlanoPagar.
     * 
     * @return nContaPagarID
     */
    public int getNContaPagarID() {
        return nContaPagarID;
    }


    /**
     * Sets the nContaPagarID value for this UpdatePlanoPagar.
     * 
     * @param nContaPagarID
     */
    public void setNContaPagarID(int nContaPagarID) {
        this.nContaPagarID = nContaPagarID;
    }


    /**
     * Gets the dDataPrimeiroVencimento value for this UpdatePlanoPagar.
     * 
     * @return dDataPrimeiroVencimento
     */
    public java.lang.String getDDataPrimeiroVencimento() {
        return dDataPrimeiroVencimento;
    }


    /**
     * Sets the dDataPrimeiroVencimento value for this UpdatePlanoPagar.
     * 
     * @param dDataPrimeiroVencimento
     */
    public void setDDataPrimeiroVencimento(java.lang.String dDataPrimeiroVencimento) {
        this.dDataPrimeiroVencimento = dDataPrimeiroVencimento;
    }


    /**
     * Gets the nNumeroParcelas value for this UpdatePlanoPagar.
     * 
     * @return nNumeroParcelas
     */
    public java.lang.String getNNumeroParcelas() {
        return nNumeroParcelas;
    }


    /**
     * Sets the nNumeroParcelas value for this UpdatePlanoPagar.
     * 
     * @param nNumeroParcelas
     */
    public void setNNumeroParcelas(java.lang.String nNumeroParcelas) {
        this.nNumeroParcelas = nNumeroParcelas;
    }


    /**
     * Gets the nValorParcelas value for this UpdatePlanoPagar.
     * 
     * @return nValorParcelas
     */
    public java.lang.String getNValorParcelas() {
        return nValorParcelas;
    }


    /**
     * Sets the nValorParcelas value for this UpdatePlanoPagar.
     * 
     * @param nValorParcelas
     */
    public void setNValorParcelas(java.lang.String nValorParcelas) {
        this.nValorParcelas = nValorParcelas;
    }


    /**
     * Gets the nFormaCobrancaID value for this UpdatePlanoPagar.
     * 
     * @return nFormaCobrancaID
     */
    public java.lang.String getNFormaCobrancaID() {
        return nFormaCobrancaID;
    }


    /**
     * Sets the nFormaCobrancaID value for this UpdatePlanoPagar.
     * 
     * @param nFormaCobrancaID
     */
    public void setNFormaCobrancaID(java.lang.String nFormaCobrancaID) {
        this.nFormaCobrancaID = nFormaCobrancaID;
    }


    /**
     * Gets the nCategoriaID value for this UpdatePlanoPagar.
     * 
     * @return nCategoriaID
     */
    public java.lang.String getNCategoriaID() {
        return nCategoriaID;
    }


    /**
     * Sets the nCategoriaID value for this UpdatePlanoPagar.
     * 
     * @param nCategoriaID
     */
    public void setNCategoriaID(java.lang.String nCategoriaID) {
        this.nCategoriaID = nCategoriaID;
    }


    /**
     * Gets the nContaID value for this UpdatePlanoPagar.
     * 
     * @return nContaID
     */
    public java.lang.String getNContaID() {
        return nContaID;
    }


    /**
     * Sets the nContaID value for this UpdatePlanoPagar.
     * 
     * @param nContaID
     */
    public void setNContaID(java.lang.String nContaID) {
        this.nContaID = nContaID;
    }


    /**
     * Gets the sObservacao value for this UpdatePlanoPagar.
     * 
     * @return sObservacao
     */
    public java.lang.String getSObservacao() {
        return sObservacao;
    }


    /**
     * Sets the sObservacao value for this UpdatePlanoPagar.
     * 
     * @param sObservacao
     */
    public void setSObservacao(java.lang.String sObservacao) {
        this.sObservacao = sObservacao;
    }


    /**
     * Gets the sComplemento value for this UpdatePlanoPagar.
     * 
     * @return sComplemento
     */
    public java.lang.String getSComplemento() {
        return sComplemento;
    }


    /**
     * Sets the sComplemento value for this UpdatePlanoPagar.
     * 
     * @param sComplemento
     */
    public void setSComplemento(java.lang.String sComplemento) {
        this.sComplemento = sComplemento;
    }


    /**
     * Gets the sDocumento value for this UpdatePlanoPagar.
     * 
     * @return sDocumento
     */
    public java.lang.String getSDocumento() {
        return sDocumento;
    }


    /**
     * Sets the sDocumento value for this UpdatePlanoPagar.
     * 
     * @param sDocumento
     */
    public void setSDocumento(java.lang.String sDocumento) {
        this.sDocumento = sDocumento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdatePlanoPagar)) return false;
        UpdatePlanoPagar other = (UpdatePlanoPagar) obj;
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
            ((this.dDataPrimeiroVencimento==null && other.getDDataPrimeiroVencimento()==null) || 
             (this.dDataPrimeiroVencimento!=null &&
              this.dDataPrimeiroVencimento.equals(other.getDDataPrimeiroVencimento()))) &&
            ((this.nNumeroParcelas==null && other.getNNumeroParcelas()==null) || 
             (this.nNumeroParcelas!=null &&
              this.nNumeroParcelas.equals(other.getNNumeroParcelas()))) &&
            ((this.nValorParcelas==null && other.getNValorParcelas()==null) || 
             (this.nValorParcelas!=null &&
              this.nValorParcelas.equals(other.getNValorParcelas()))) &&
            ((this.nFormaCobrancaID==null && other.getNFormaCobrancaID()==null) || 
             (this.nFormaCobrancaID!=null &&
              this.nFormaCobrancaID.equals(other.getNFormaCobrancaID()))) &&
            ((this.nCategoriaID==null && other.getNCategoriaID()==null) || 
             (this.nCategoriaID!=null &&
              this.nCategoriaID.equals(other.getNCategoriaID()))) &&
            ((this.nContaID==null && other.getNContaID()==null) || 
             (this.nContaID!=null &&
              this.nContaID.equals(other.getNContaID()))) &&
            ((this.sObservacao==null && other.getSObservacao()==null) || 
             (this.sObservacao!=null &&
              this.sObservacao.equals(other.getSObservacao()))) &&
            ((this.sComplemento==null && other.getSComplemento()==null) || 
             (this.sComplemento!=null &&
              this.sComplemento.equals(other.getSComplemento()))) &&
            ((this.sDocumento==null && other.getSDocumento()==null) || 
             (this.sDocumento!=null &&
              this.sDocumento.equals(other.getSDocumento())));
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
        if (getDDataPrimeiroVencimento() != null) {
            _hashCode += getDDataPrimeiroVencimento().hashCode();
        }
        if (getNNumeroParcelas() != null) {
            _hashCode += getNNumeroParcelas().hashCode();
        }
        if (getNValorParcelas() != null) {
            _hashCode += getNValorParcelas().hashCode();
        }
        if (getNFormaCobrancaID() != null) {
            _hashCode += getNFormaCobrancaID().hashCode();
        }
        if (getNCategoriaID() != null) {
            _hashCode += getNCategoriaID().hashCode();
        }
        if (getNContaID() != null) {
            _hashCode += getNContaID().hashCode();
        }
        if (getSObservacao() != null) {
            _hashCode += getSObservacao().hashCode();
        }
        if (getSComplemento() != null) {
            _hashCode += getSComplemento().hashCode();
        }
        if (getSDocumento() != null) {
            _hashCode += getSDocumento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdatePlanoPagar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdatePlanoPagar"));
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
        elemField.setFieldName("DDataPrimeiroVencimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataPrimeiroVencimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NNumeroParcelas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroParcelas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NValorParcelas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nValorParcelas"));
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
        elemField.setFieldName("NCategoriaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCategoriaID"));
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
        elemField.setFieldName("SObservacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SComplemento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sComplemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDocumento"));
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
