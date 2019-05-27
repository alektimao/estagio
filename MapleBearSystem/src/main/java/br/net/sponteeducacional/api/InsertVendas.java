/**
 * InsertVendas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertVendas  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private java.lang.String nContratoID;

    private java.lang.String nContratoAulaLivreID;

    private java.util.Calendar dDataVenda;

    private java.lang.String nBolsaID;

    private java.lang.String sItens;

    private int nCategoriaID;

    private int nNumeroParcelas;

    private double nValorParcela;

    private java.util.Calendar dDataPrimeiroVencimento;

    private int nFormaCobrancaID;

    private int nEntregue;

    private java.lang.String sNumeroDocumento;

    private java.lang.String sObservacao;

    public InsertVendas() {
    }

    public InsertVendas(
           int nCodigoCliente,
           java.lang.String sToken,
           java.lang.String nContratoID,
           java.lang.String nContratoAulaLivreID,
           java.util.Calendar dDataVenda,
           java.lang.String nBolsaID,
           java.lang.String sItens,
           int nCategoriaID,
           int nNumeroParcelas,
           double nValorParcela,
           java.util.Calendar dDataPrimeiroVencimento,
           int nFormaCobrancaID,
           int nEntregue,
           java.lang.String sNumeroDocumento,
           java.lang.String sObservacao) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nContratoID = nContratoID;
           this.nContratoAulaLivreID = nContratoAulaLivreID;
           this.dDataVenda = dDataVenda;
           this.nBolsaID = nBolsaID;
           this.sItens = sItens;
           this.nCategoriaID = nCategoriaID;
           this.nNumeroParcelas = nNumeroParcelas;
           this.nValorParcela = nValorParcela;
           this.dDataPrimeiroVencimento = dDataPrimeiroVencimento;
           this.nFormaCobrancaID = nFormaCobrancaID;
           this.nEntregue = nEntregue;
           this.sNumeroDocumento = sNumeroDocumento;
           this.sObservacao = sObservacao;
    }


    /**
     * Gets the nCodigoCliente value for this InsertVendas.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this InsertVendas.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this InsertVendas.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this InsertVendas.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nContratoID value for this InsertVendas.
     * 
     * @return nContratoID
     */
    public java.lang.String getNContratoID() {
        return nContratoID;
    }


    /**
     * Sets the nContratoID value for this InsertVendas.
     * 
     * @param nContratoID
     */
    public void setNContratoID(java.lang.String nContratoID) {
        this.nContratoID = nContratoID;
    }


    /**
     * Gets the nContratoAulaLivreID value for this InsertVendas.
     * 
     * @return nContratoAulaLivreID
     */
    public java.lang.String getNContratoAulaLivreID() {
        return nContratoAulaLivreID;
    }


    /**
     * Sets the nContratoAulaLivreID value for this InsertVendas.
     * 
     * @param nContratoAulaLivreID
     */
    public void setNContratoAulaLivreID(java.lang.String nContratoAulaLivreID) {
        this.nContratoAulaLivreID = nContratoAulaLivreID;
    }


    /**
     * Gets the dDataVenda value for this InsertVendas.
     * 
     * @return dDataVenda
     */
    public java.util.Calendar getDDataVenda() {
        return dDataVenda;
    }


    /**
     * Sets the dDataVenda value for this InsertVendas.
     * 
     * @param dDataVenda
     */
    public void setDDataVenda(java.util.Calendar dDataVenda) {
        this.dDataVenda = dDataVenda;
    }


    /**
     * Gets the nBolsaID value for this InsertVendas.
     * 
     * @return nBolsaID
     */
    public java.lang.String getNBolsaID() {
        return nBolsaID;
    }


    /**
     * Sets the nBolsaID value for this InsertVendas.
     * 
     * @param nBolsaID
     */
    public void setNBolsaID(java.lang.String nBolsaID) {
        this.nBolsaID = nBolsaID;
    }


    /**
     * Gets the sItens value for this InsertVendas.
     * 
     * @return sItens
     */
    public java.lang.String getSItens() {
        return sItens;
    }


    /**
     * Sets the sItens value for this InsertVendas.
     * 
     * @param sItens
     */
    public void setSItens(java.lang.String sItens) {
        this.sItens = sItens;
    }


    /**
     * Gets the nCategoriaID value for this InsertVendas.
     * 
     * @return nCategoriaID
     */
    public int getNCategoriaID() {
        return nCategoriaID;
    }


    /**
     * Sets the nCategoriaID value for this InsertVendas.
     * 
     * @param nCategoriaID
     */
    public void setNCategoriaID(int nCategoriaID) {
        this.nCategoriaID = nCategoriaID;
    }


    /**
     * Gets the nNumeroParcelas value for this InsertVendas.
     * 
     * @return nNumeroParcelas
     */
    public int getNNumeroParcelas() {
        return nNumeroParcelas;
    }


    /**
     * Sets the nNumeroParcelas value for this InsertVendas.
     * 
     * @param nNumeroParcelas
     */
    public void setNNumeroParcelas(int nNumeroParcelas) {
        this.nNumeroParcelas = nNumeroParcelas;
    }


    /**
     * Gets the nValorParcela value for this InsertVendas.
     * 
     * @return nValorParcela
     */
    public double getNValorParcela() {
        return nValorParcela;
    }


    /**
     * Sets the nValorParcela value for this InsertVendas.
     * 
     * @param nValorParcela
     */
    public void setNValorParcela(double nValorParcela) {
        this.nValorParcela = nValorParcela;
    }


    /**
     * Gets the dDataPrimeiroVencimento value for this InsertVendas.
     * 
     * @return dDataPrimeiroVencimento
     */
    public java.util.Calendar getDDataPrimeiroVencimento() {
        return dDataPrimeiroVencimento;
    }


    /**
     * Sets the dDataPrimeiroVencimento value for this InsertVendas.
     * 
     * @param dDataPrimeiroVencimento
     */
    public void setDDataPrimeiroVencimento(java.util.Calendar dDataPrimeiroVencimento) {
        this.dDataPrimeiroVencimento = dDataPrimeiroVencimento;
    }


    /**
     * Gets the nFormaCobrancaID value for this InsertVendas.
     * 
     * @return nFormaCobrancaID
     */
    public int getNFormaCobrancaID() {
        return nFormaCobrancaID;
    }


    /**
     * Sets the nFormaCobrancaID value for this InsertVendas.
     * 
     * @param nFormaCobrancaID
     */
    public void setNFormaCobrancaID(int nFormaCobrancaID) {
        this.nFormaCobrancaID = nFormaCobrancaID;
    }


    /**
     * Gets the nEntregue value for this InsertVendas.
     * 
     * @return nEntregue
     */
    public int getNEntregue() {
        return nEntregue;
    }


    /**
     * Sets the nEntregue value for this InsertVendas.
     * 
     * @param nEntregue
     */
    public void setNEntregue(int nEntregue) {
        this.nEntregue = nEntregue;
    }


    /**
     * Gets the sNumeroDocumento value for this InsertVendas.
     * 
     * @return sNumeroDocumento
     */
    public java.lang.String getSNumeroDocumento() {
        return sNumeroDocumento;
    }


    /**
     * Sets the sNumeroDocumento value for this InsertVendas.
     * 
     * @param sNumeroDocumento
     */
    public void setSNumeroDocumento(java.lang.String sNumeroDocumento) {
        this.sNumeroDocumento = sNumeroDocumento;
    }


    /**
     * Gets the sObservacao value for this InsertVendas.
     * 
     * @return sObservacao
     */
    public java.lang.String getSObservacao() {
        return sObservacao;
    }


    /**
     * Sets the sObservacao value for this InsertVendas.
     * 
     * @param sObservacao
     */
    public void setSObservacao(java.lang.String sObservacao) {
        this.sObservacao = sObservacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertVendas)) return false;
        InsertVendas other = (InsertVendas) obj;
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
            ((this.nContratoID==null && other.getNContratoID()==null) || 
             (this.nContratoID!=null &&
              this.nContratoID.equals(other.getNContratoID()))) &&
            ((this.nContratoAulaLivreID==null && other.getNContratoAulaLivreID()==null) || 
             (this.nContratoAulaLivreID!=null &&
              this.nContratoAulaLivreID.equals(other.getNContratoAulaLivreID()))) &&
            ((this.dDataVenda==null && other.getDDataVenda()==null) || 
             (this.dDataVenda!=null &&
              this.dDataVenda.equals(other.getDDataVenda()))) &&
            ((this.nBolsaID==null && other.getNBolsaID()==null) || 
             (this.nBolsaID!=null &&
              this.nBolsaID.equals(other.getNBolsaID()))) &&
            ((this.sItens==null && other.getSItens()==null) || 
             (this.sItens!=null &&
              this.sItens.equals(other.getSItens()))) &&
            this.nCategoriaID == other.getNCategoriaID() &&
            this.nNumeroParcelas == other.getNNumeroParcelas() &&
            this.nValorParcela == other.getNValorParcela() &&
            ((this.dDataPrimeiroVencimento==null && other.getDDataPrimeiroVencimento()==null) || 
             (this.dDataPrimeiroVencimento!=null &&
              this.dDataPrimeiroVencimento.equals(other.getDDataPrimeiroVencimento()))) &&
            this.nFormaCobrancaID == other.getNFormaCobrancaID() &&
            this.nEntregue == other.getNEntregue() &&
            ((this.sNumeroDocumento==null && other.getSNumeroDocumento()==null) || 
             (this.sNumeroDocumento!=null &&
              this.sNumeroDocumento.equals(other.getSNumeroDocumento()))) &&
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
        if (getNContratoID() != null) {
            _hashCode += getNContratoID().hashCode();
        }
        if (getNContratoAulaLivreID() != null) {
            _hashCode += getNContratoAulaLivreID().hashCode();
        }
        if (getDDataVenda() != null) {
            _hashCode += getDDataVenda().hashCode();
        }
        if (getNBolsaID() != null) {
            _hashCode += getNBolsaID().hashCode();
        }
        if (getSItens() != null) {
            _hashCode += getSItens().hashCode();
        }
        _hashCode += getNCategoriaID();
        _hashCode += getNNumeroParcelas();
        _hashCode += new Double(getNValorParcela()).hashCode();
        if (getDDataPrimeiroVencimento() != null) {
            _hashCode += getDDataPrimeiroVencimento().hashCode();
        }
        _hashCode += getNFormaCobrancaID();
        _hashCode += getNEntregue();
        if (getSNumeroDocumento() != null) {
            _hashCode += getSNumeroDocumento().hashCode();
        }
        if (getSObservacao() != null) {
            _hashCode += getSObservacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertVendas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertVendas"));
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
        elemField.setFieldName("NContratoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContratoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NContratoAulaLivreID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContratoAulaLivreID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DDataVenda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataVenda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("SItens");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sItens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NCategoriaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCategoriaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NNumeroParcelas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroParcelas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NValorParcela");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nValorParcela"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DDataPrimeiroVencimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataPrimeiroVencimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NFormaCobrancaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFormaCobrancaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NEntregue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nEntregue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SNumeroDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNumeroDocumento"));
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
