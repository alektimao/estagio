/**
 * UpdateParcela.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class UpdateParcela  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private int nContaReceberID;

    private int nNumeroParcela;

    private java.lang.String nBolsaID;

    private java.lang.String dDataVencimento;

    private java.lang.String nValor;

    private java.lang.String nFormaCobrancaID;

    private java.lang.String nCategoriaID;

    private java.lang.String sObservacao;

    public UpdateParcela() {
    }

    public UpdateParcela(
           int nCodigoCliente,
           java.lang.String sToken,
           int nContaReceberID,
           int nNumeroParcela,
           java.lang.String nBolsaID,
           java.lang.String dDataVencimento,
           java.lang.String nValor,
           java.lang.String nFormaCobrancaID,
           java.lang.String nCategoriaID,
           java.lang.String sObservacao) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nContaReceberID = nContaReceberID;
           this.nNumeroParcela = nNumeroParcela;
           this.nBolsaID = nBolsaID;
           this.dDataVencimento = dDataVencimento;
           this.nValor = nValor;
           this.nFormaCobrancaID = nFormaCobrancaID;
           this.nCategoriaID = nCategoriaID;
           this.sObservacao = sObservacao;
    }


    /**
     * Gets the nCodigoCliente value for this UpdateParcela.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this UpdateParcela.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this UpdateParcela.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this UpdateParcela.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nContaReceberID value for this UpdateParcela.
     * 
     * @return nContaReceberID
     */
    public int getNContaReceberID() {
        return nContaReceberID;
    }


    /**
     * Sets the nContaReceberID value for this UpdateParcela.
     * 
     * @param nContaReceberID
     */
    public void setNContaReceberID(int nContaReceberID) {
        this.nContaReceberID = nContaReceberID;
    }


    /**
     * Gets the nNumeroParcela value for this UpdateParcela.
     * 
     * @return nNumeroParcela
     */
    public int getNNumeroParcela() {
        return nNumeroParcela;
    }


    /**
     * Sets the nNumeroParcela value for this UpdateParcela.
     * 
     * @param nNumeroParcela
     */
    public void setNNumeroParcela(int nNumeroParcela) {
        this.nNumeroParcela = nNumeroParcela;
    }


    /**
     * Gets the nBolsaID value for this UpdateParcela.
     * 
     * @return nBolsaID
     */
    public java.lang.String getNBolsaID() {
        return nBolsaID;
    }


    /**
     * Sets the nBolsaID value for this UpdateParcela.
     * 
     * @param nBolsaID
     */
    public void setNBolsaID(java.lang.String nBolsaID) {
        this.nBolsaID = nBolsaID;
    }


    /**
     * Gets the dDataVencimento value for this UpdateParcela.
     * 
     * @return dDataVencimento
     */
    public java.lang.String getDDataVencimento() {
        return dDataVencimento;
    }


    /**
     * Sets the dDataVencimento value for this UpdateParcela.
     * 
     * @param dDataVencimento
     */
    public void setDDataVencimento(java.lang.String dDataVencimento) {
        this.dDataVencimento = dDataVencimento;
    }


    /**
     * Gets the nValor value for this UpdateParcela.
     * 
     * @return nValor
     */
    public java.lang.String getNValor() {
        return nValor;
    }


    /**
     * Sets the nValor value for this UpdateParcela.
     * 
     * @param nValor
     */
    public void setNValor(java.lang.String nValor) {
        this.nValor = nValor;
    }


    /**
     * Gets the nFormaCobrancaID value for this UpdateParcela.
     * 
     * @return nFormaCobrancaID
     */
    public java.lang.String getNFormaCobrancaID() {
        return nFormaCobrancaID;
    }


    /**
     * Sets the nFormaCobrancaID value for this UpdateParcela.
     * 
     * @param nFormaCobrancaID
     */
    public void setNFormaCobrancaID(java.lang.String nFormaCobrancaID) {
        this.nFormaCobrancaID = nFormaCobrancaID;
    }


    /**
     * Gets the nCategoriaID value for this UpdateParcela.
     * 
     * @return nCategoriaID
     */
    public java.lang.String getNCategoriaID() {
        return nCategoriaID;
    }


    /**
     * Sets the nCategoriaID value for this UpdateParcela.
     * 
     * @param nCategoriaID
     */
    public void setNCategoriaID(java.lang.String nCategoriaID) {
        this.nCategoriaID = nCategoriaID;
    }


    /**
     * Gets the sObservacao value for this UpdateParcela.
     * 
     * @return sObservacao
     */
    public java.lang.String getSObservacao() {
        return sObservacao;
    }


    /**
     * Sets the sObservacao value for this UpdateParcela.
     * 
     * @param sObservacao
     */
    public void setSObservacao(java.lang.String sObservacao) {
        this.sObservacao = sObservacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateParcela)) return false;
        UpdateParcela other = (UpdateParcela) obj;
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
            this.nNumeroParcela == other.getNNumeroParcela() &&
            ((this.nBolsaID==null && other.getNBolsaID()==null) || 
             (this.nBolsaID!=null &&
              this.nBolsaID.equals(other.getNBolsaID()))) &&
            ((this.dDataVencimento==null && other.getDDataVencimento()==null) || 
             (this.dDataVencimento!=null &&
              this.dDataVencimento.equals(other.getDDataVencimento()))) &&
            ((this.nValor==null && other.getNValor()==null) || 
             (this.nValor!=null &&
              this.nValor.equals(other.getNValor()))) &&
            ((this.nFormaCobrancaID==null && other.getNFormaCobrancaID()==null) || 
             (this.nFormaCobrancaID!=null &&
              this.nFormaCobrancaID.equals(other.getNFormaCobrancaID()))) &&
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
        _hashCode += getNContaReceberID();
        _hashCode += getNNumeroParcela();
        if (getNBolsaID() != null) {
            _hashCode += getNBolsaID().hashCode();
        }
        if (getDDataVencimento() != null) {
            _hashCode += getDDataVencimento().hashCode();
        }
        if (getNValor() != null) {
            _hashCode += getNValor().hashCode();
        }
        if (getNFormaCobrancaID() != null) {
            _hashCode += getNFormaCobrancaID().hashCode();
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
        new org.apache.axis.description.TypeDesc(UpdateParcela.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateParcela"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NBolsaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nBolsaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
