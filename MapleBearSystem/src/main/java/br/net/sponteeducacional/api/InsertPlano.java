/**
 * InsertPlano.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertPlano  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private java.lang.String nContratoID;

    private java.lang.String nContratoAulaLivreID;

    private java.lang.String nAlunoID;

    private java.lang.String nTipoPlano;

    private java.lang.String nBolsaID;

    private java.util.Calendar dDataPrimeiroVencimento;

    private int nNumeroParcelas;

    private double nValorParcelas;

    private int nFormaCobrancaID;

    private int nCategoriaID;

    private java.lang.String sObservacao;

    private java.lang.String nClienteID;

    private java.lang.String nContaID;

    public InsertPlano() {
    }

    public InsertPlano(
           int nCodigoCliente,
           java.lang.String sToken,
           java.lang.String nContratoID,
           java.lang.String nContratoAulaLivreID,
           java.lang.String nAlunoID,
           java.lang.String nTipoPlano,
           java.lang.String nBolsaID,
           java.util.Calendar dDataPrimeiroVencimento,
           int nNumeroParcelas,
           double nValorParcelas,
           int nFormaCobrancaID,
           int nCategoriaID,
           java.lang.String sObservacao,
           java.lang.String nClienteID,
           java.lang.String nContaID) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nContratoID = nContratoID;
           this.nContratoAulaLivreID = nContratoAulaLivreID;
           this.nAlunoID = nAlunoID;
           this.nTipoPlano = nTipoPlano;
           this.nBolsaID = nBolsaID;
           this.dDataPrimeiroVencimento = dDataPrimeiroVencimento;
           this.nNumeroParcelas = nNumeroParcelas;
           this.nValorParcelas = nValorParcelas;
           this.nFormaCobrancaID = nFormaCobrancaID;
           this.nCategoriaID = nCategoriaID;
           this.sObservacao = sObservacao;
           this.nClienteID = nClienteID;
           this.nContaID = nContaID;
    }


    /**
     * Gets the nCodigoCliente value for this InsertPlano.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this InsertPlano.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this InsertPlano.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this InsertPlano.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nContratoID value for this InsertPlano.
     * 
     * @return nContratoID
     */
    public java.lang.String getNContratoID() {
        return nContratoID;
    }


    /**
     * Sets the nContratoID value for this InsertPlano.
     * 
     * @param nContratoID
     */
    public void setNContratoID(java.lang.String nContratoID) {
        this.nContratoID = nContratoID;
    }


    /**
     * Gets the nContratoAulaLivreID value for this InsertPlano.
     * 
     * @return nContratoAulaLivreID
     */
    public java.lang.String getNContratoAulaLivreID() {
        return nContratoAulaLivreID;
    }


    /**
     * Sets the nContratoAulaLivreID value for this InsertPlano.
     * 
     * @param nContratoAulaLivreID
     */
    public void setNContratoAulaLivreID(java.lang.String nContratoAulaLivreID) {
        this.nContratoAulaLivreID = nContratoAulaLivreID;
    }


    /**
     * Gets the nAlunoID value for this InsertPlano.
     * 
     * @return nAlunoID
     */
    public java.lang.String getNAlunoID() {
        return nAlunoID;
    }


    /**
     * Sets the nAlunoID value for this InsertPlano.
     * 
     * @param nAlunoID
     */
    public void setNAlunoID(java.lang.String nAlunoID) {
        this.nAlunoID = nAlunoID;
    }


    /**
     * Gets the nTipoPlano value for this InsertPlano.
     * 
     * @return nTipoPlano
     */
    public java.lang.String getNTipoPlano() {
        return nTipoPlano;
    }


    /**
     * Sets the nTipoPlano value for this InsertPlano.
     * 
     * @param nTipoPlano
     */
    public void setNTipoPlano(java.lang.String nTipoPlano) {
        this.nTipoPlano = nTipoPlano;
    }


    /**
     * Gets the nBolsaID value for this InsertPlano.
     * 
     * @return nBolsaID
     */
    public java.lang.String getNBolsaID() {
        return nBolsaID;
    }


    /**
     * Sets the nBolsaID value for this InsertPlano.
     * 
     * @param nBolsaID
     */
    public void setNBolsaID(java.lang.String nBolsaID) {
        this.nBolsaID = nBolsaID;
    }


    /**
     * Gets the dDataPrimeiroVencimento value for this InsertPlano.
     * 
     * @return dDataPrimeiroVencimento
     */
    public java.util.Calendar getDDataPrimeiroVencimento() {
        return dDataPrimeiroVencimento;
    }


    /**
     * Sets the dDataPrimeiroVencimento value for this InsertPlano.
     * 
     * @param dDataPrimeiroVencimento
     */
    public void setDDataPrimeiroVencimento(java.util.Calendar dDataPrimeiroVencimento) {
        this.dDataPrimeiroVencimento = dDataPrimeiroVencimento;
    }


    /**
     * Gets the nNumeroParcelas value for this InsertPlano.
     * 
     * @return nNumeroParcelas
     */
    public int getNNumeroParcelas() {
        return nNumeroParcelas;
    }


    /**
     * Sets the nNumeroParcelas value for this InsertPlano.
     * 
     * @param nNumeroParcelas
     */
    public void setNNumeroParcelas(int nNumeroParcelas) {
        this.nNumeroParcelas = nNumeroParcelas;
    }


    /**
     * Gets the nValorParcelas value for this InsertPlano.
     * 
     * @return nValorParcelas
     */
    public double getNValorParcelas() {
        return nValorParcelas;
    }


    /**
     * Sets the nValorParcelas value for this InsertPlano.
     * 
     * @param nValorParcelas
     */
    public void setNValorParcelas(double nValorParcelas) {
        this.nValorParcelas = nValorParcelas;
    }


    /**
     * Gets the nFormaCobrancaID value for this InsertPlano.
     * 
     * @return nFormaCobrancaID
     */
    public int getNFormaCobrancaID() {
        return nFormaCobrancaID;
    }


    /**
     * Sets the nFormaCobrancaID value for this InsertPlano.
     * 
     * @param nFormaCobrancaID
     */
    public void setNFormaCobrancaID(int nFormaCobrancaID) {
        this.nFormaCobrancaID = nFormaCobrancaID;
    }


    /**
     * Gets the nCategoriaID value for this InsertPlano.
     * 
     * @return nCategoriaID
     */
    public int getNCategoriaID() {
        return nCategoriaID;
    }


    /**
     * Sets the nCategoriaID value for this InsertPlano.
     * 
     * @param nCategoriaID
     */
    public void setNCategoriaID(int nCategoriaID) {
        this.nCategoriaID = nCategoriaID;
    }


    /**
     * Gets the sObservacao value for this InsertPlano.
     * 
     * @return sObservacao
     */
    public java.lang.String getSObservacao() {
        return sObservacao;
    }


    /**
     * Sets the sObservacao value for this InsertPlano.
     * 
     * @param sObservacao
     */
    public void setSObservacao(java.lang.String sObservacao) {
        this.sObservacao = sObservacao;
    }


    /**
     * Gets the nClienteID value for this InsertPlano.
     * 
     * @return nClienteID
     */
    public java.lang.String getNClienteID() {
        return nClienteID;
    }


    /**
     * Sets the nClienteID value for this InsertPlano.
     * 
     * @param nClienteID
     */
    public void setNClienteID(java.lang.String nClienteID) {
        this.nClienteID = nClienteID;
    }


    /**
     * Gets the nContaID value for this InsertPlano.
     * 
     * @return nContaID
     */
    public java.lang.String getNContaID() {
        return nContaID;
    }


    /**
     * Sets the nContaID value for this InsertPlano.
     * 
     * @param nContaID
     */
    public void setNContaID(java.lang.String nContaID) {
        this.nContaID = nContaID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertPlano)) return false;
        InsertPlano other = (InsertPlano) obj;
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
            ((this.nAlunoID==null && other.getNAlunoID()==null) || 
             (this.nAlunoID!=null &&
              this.nAlunoID.equals(other.getNAlunoID()))) &&
            ((this.nTipoPlano==null && other.getNTipoPlano()==null) || 
             (this.nTipoPlano!=null &&
              this.nTipoPlano.equals(other.getNTipoPlano()))) &&
            ((this.nBolsaID==null && other.getNBolsaID()==null) || 
             (this.nBolsaID!=null &&
              this.nBolsaID.equals(other.getNBolsaID()))) &&
            ((this.dDataPrimeiroVencimento==null && other.getDDataPrimeiroVencimento()==null) || 
             (this.dDataPrimeiroVencimento!=null &&
              this.dDataPrimeiroVencimento.equals(other.getDDataPrimeiroVencimento()))) &&
            this.nNumeroParcelas == other.getNNumeroParcelas() &&
            this.nValorParcelas == other.getNValorParcelas() &&
            this.nFormaCobrancaID == other.getNFormaCobrancaID() &&
            this.nCategoriaID == other.getNCategoriaID() &&
            ((this.sObservacao==null && other.getSObservacao()==null) || 
             (this.sObservacao!=null &&
              this.sObservacao.equals(other.getSObservacao()))) &&
            ((this.nClienteID==null && other.getNClienteID()==null) || 
             (this.nClienteID!=null &&
              this.nClienteID.equals(other.getNClienteID()))) &&
            ((this.nContaID==null && other.getNContaID()==null) || 
             (this.nContaID!=null &&
              this.nContaID.equals(other.getNContaID())));
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
        if (getNAlunoID() != null) {
            _hashCode += getNAlunoID().hashCode();
        }
        if (getNTipoPlano() != null) {
            _hashCode += getNTipoPlano().hashCode();
        }
        if (getNBolsaID() != null) {
            _hashCode += getNBolsaID().hashCode();
        }
        if (getDDataPrimeiroVencimento() != null) {
            _hashCode += getDDataPrimeiroVencimento().hashCode();
        }
        _hashCode += getNNumeroParcelas();
        _hashCode += new Double(getNValorParcelas()).hashCode();
        _hashCode += getNFormaCobrancaID();
        _hashCode += getNCategoriaID();
        if (getSObservacao() != null) {
            _hashCode += getSObservacao().hashCode();
        }
        if (getNClienteID() != null) {
            _hashCode += getNClienteID().hashCode();
        }
        if (getNContaID() != null) {
            _hashCode += getNContaID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertPlano.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertPlano"));
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
        elemField.setFieldName("NAlunoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NTipoPlano");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipoPlano"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("DDataPrimeiroVencimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataPrimeiroVencimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NNumeroParcelas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroParcelas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NValorParcelas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nValorParcelas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NFormaCobrancaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFormaCobrancaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NCategoriaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCategoriaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("NClienteID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nClienteID"));
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
