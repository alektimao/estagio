/**
 * InsertPlanoContaPagar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertPlanoContaPagar  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private java.lang.String nAlunoID;

    private java.lang.String nFornecedorID;

    private java.lang.String nFuncionarioID;

    private java.util.Calendar dDataPrimeiroVencimento;

    private int nNumeroParcelas;

    private double nValorParcelas;

    private java.lang.String nContaID;

    private int nFormaCobrancaID;

    private int nCategoriaID;

    private java.lang.String sObservacao;

    private java.lang.String sComplemento;

    private java.lang.String sDocumento;

    public InsertPlanoContaPagar() {
    }

    public InsertPlanoContaPagar(
           int nCodigoCliente,
           java.lang.String sToken,
           java.lang.String nAlunoID,
           java.lang.String nFornecedorID,
           java.lang.String nFuncionarioID,
           java.util.Calendar dDataPrimeiroVencimento,
           int nNumeroParcelas,
           double nValorParcelas,
           java.lang.String nContaID,
           int nFormaCobrancaID,
           int nCategoriaID,
           java.lang.String sObservacao,
           java.lang.String sComplemento,
           java.lang.String sDocumento) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nAlunoID = nAlunoID;
           this.nFornecedorID = nFornecedorID;
           this.nFuncionarioID = nFuncionarioID;
           this.dDataPrimeiroVencimento = dDataPrimeiroVencimento;
           this.nNumeroParcelas = nNumeroParcelas;
           this.nValorParcelas = nValorParcelas;
           this.nContaID = nContaID;
           this.nFormaCobrancaID = nFormaCobrancaID;
           this.nCategoriaID = nCategoriaID;
           this.sObservacao = sObservacao;
           this.sComplemento = sComplemento;
           this.sDocumento = sDocumento;
    }


    /**
     * Gets the nCodigoCliente value for this InsertPlanoContaPagar.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this InsertPlanoContaPagar.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this InsertPlanoContaPagar.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this InsertPlanoContaPagar.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nAlunoID value for this InsertPlanoContaPagar.
     * 
     * @return nAlunoID
     */
    public java.lang.String getNAlunoID() {
        return nAlunoID;
    }


    /**
     * Sets the nAlunoID value for this InsertPlanoContaPagar.
     * 
     * @param nAlunoID
     */
    public void setNAlunoID(java.lang.String nAlunoID) {
        this.nAlunoID = nAlunoID;
    }


    /**
     * Gets the nFornecedorID value for this InsertPlanoContaPagar.
     * 
     * @return nFornecedorID
     */
    public java.lang.String getNFornecedorID() {
        return nFornecedorID;
    }


    /**
     * Sets the nFornecedorID value for this InsertPlanoContaPagar.
     * 
     * @param nFornecedorID
     */
    public void setNFornecedorID(java.lang.String nFornecedorID) {
        this.nFornecedorID = nFornecedorID;
    }


    /**
     * Gets the nFuncionarioID value for this InsertPlanoContaPagar.
     * 
     * @return nFuncionarioID
     */
    public java.lang.String getNFuncionarioID() {
        return nFuncionarioID;
    }


    /**
     * Sets the nFuncionarioID value for this InsertPlanoContaPagar.
     * 
     * @param nFuncionarioID
     */
    public void setNFuncionarioID(java.lang.String nFuncionarioID) {
        this.nFuncionarioID = nFuncionarioID;
    }


    /**
     * Gets the dDataPrimeiroVencimento value for this InsertPlanoContaPagar.
     * 
     * @return dDataPrimeiroVencimento
     */
    public java.util.Calendar getDDataPrimeiroVencimento() {
        return dDataPrimeiroVencimento;
    }


    /**
     * Sets the dDataPrimeiroVencimento value for this InsertPlanoContaPagar.
     * 
     * @param dDataPrimeiroVencimento
     */
    public void setDDataPrimeiroVencimento(java.util.Calendar dDataPrimeiroVencimento) {
        this.dDataPrimeiroVencimento = dDataPrimeiroVencimento;
    }


    /**
     * Gets the nNumeroParcelas value for this InsertPlanoContaPagar.
     * 
     * @return nNumeroParcelas
     */
    public int getNNumeroParcelas() {
        return nNumeroParcelas;
    }


    /**
     * Sets the nNumeroParcelas value for this InsertPlanoContaPagar.
     * 
     * @param nNumeroParcelas
     */
    public void setNNumeroParcelas(int nNumeroParcelas) {
        this.nNumeroParcelas = nNumeroParcelas;
    }


    /**
     * Gets the nValorParcelas value for this InsertPlanoContaPagar.
     * 
     * @return nValorParcelas
     */
    public double getNValorParcelas() {
        return nValorParcelas;
    }


    /**
     * Sets the nValorParcelas value for this InsertPlanoContaPagar.
     * 
     * @param nValorParcelas
     */
    public void setNValorParcelas(double nValorParcelas) {
        this.nValorParcelas = nValorParcelas;
    }


    /**
     * Gets the nContaID value for this InsertPlanoContaPagar.
     * 
     * @return nContaID
     */
    public java.lang.String getNContaID() {
        return nContaID;
    }


    /**
     * Sets the nContaID value for this InsertPlanoContaPagar.
     * 
     * @param nContaID
     */
    public void setNContaID(java.lang.String nContaID) {
        this.nContaID = nContaID;
    }


    /**
     * Gets the nFormaCobrancaID value for this InsertPlanoContaPagar.
     * 
     * @return nFormaCobrancaID
     */
    public int getNFormaCobrancaID() {
        return nFormaCobrancaID;
    }


    /**
     * Sets the nFormaCobrancaID value for this InsertPlanoContaPagar.
     * 
     * @param nFormaCobrancaID
     */
    public void setNFormaCobrancaID(int nFormaCobrancaID) {
        this.nFormaCobrancaID = nFormaCobrancaID;
    }


    /**
     * Gets the nCategoriaID value for this InsertPlanoContaPagar.
     * 
     * @return nCategoriaID
     */
    public int getNCategoriaID() {
        return nCategoriaID;
    }


    /**
     * Sets the nCategoriaID value for this InsertPlanoContaPagar.
     * 
     * @param nCategoriaID
     */
    public void setNCategoriaID(int nCategoriaID) {
        this.nCategoriaID = nCategoriaID;
    }


    /**
     * Gets the sObservacao value for this InsertPlanoContaPagar.
     * 
     * @return sObservacao
     */
    public java.lang.String getSObservacao() {
        return sObservacao;
    }


    /**
     * Sets the sObservacao value for this InsertPlanoContaPagar.
     * 
     * @param sObservacao
     */
    public void setSObservacao(java.lang.String sObservacao) {
        this.sObservacao = sObservacao;
    }


    /**
     * Gets the sComplemento value for this InsertPlanoContaPagar.
     * 
     * @return sComplemento
     */
    public java.lang.String getSComplemento() {
        return sComplemento;
    }


    /**
     * Sets the sComplemento value for this InsertPlanoContaPagar.
     * 
     * @param sComplemento
     */
    public void setSComplemento(java.lang.String sComplemento) {
        this.sComplemento = sComplemento;
    }


    /**
     * Gets the sDocumento value for this InsertPlanoContaPagar.
     * 
     * @return sDocumento
     */
    public java.lang.String getSDocumento() {
        return sDocumento;
    }


    /**
     * Sets the sDocumento value for this InsertPlanoContaPagar.
     * 
     * @param sDocumento
     */
    public void setSDocumento(java.lang.String sDocumento) {
        this.sDocumento = sDocumento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertPlanoContaPagar)) return false;
        InsertPlanoContaPagar other = (InsertPlanoContaPagar) obj;
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
            ((this.nAlunoID==null && other.getNAlunoID()==null) || 
             (this.nAlunoID!=null &&
              this.nAlunoID.equals(other.getNAlunoID()))) &&
            ((this.nFornecedorID==null && other.getNFornecedorID()==null) || 
             (this.nFornecedorID!=null &&
              this.nFornecedorID.equals(other.getNFornecedorID()))) &&
            ((this.nFuncionarioID==null && other.getNFuncionarioID()==null) || 
             (this.nFuncionarioID!=null &&
              this.nFuncionarioID.equals(other.getNFuncionarioID()))) &&
            ((this.dDataPrimeiroVencimento==null && other.getDDataPrimeiroVencimento()==null) || 
             (this.dDataPrimeiroVencimento!=null &&
              this.dDataPrimeiroVencimento.equals(other.getDDataPrimeiroVencimento()))) &&
            this.nNumeroParcelas == other.getNNumeroParcelas() &&
            this.nValorParcelas == other.getNValorParcelas() &&
            ((this.nContaID==null && other.getNContaID()==null) || 
             (this.nContaID!=null &&
              this.nContaID.equals(other.getNContaID()))) &&
            this.nFormaCobrancaID == other.getNFormaCobrancaID() &&
            this.nCategoriaID == other.getNCategoriaID() &&
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
        if (getNAlunoID() != null) {
            _hashCode += getNAlunoID().hashCode();
        }
        if (getNFornecedorID() != null) {
            _hashCode += getNFornecedorID().hashCode();
        }
        if (getNFuncionarioID() != null) {
            _hashCode += getNFuncionarioID().hashCode();
        }
        if (getDDataPrimeiroVencimento() != null) {
            _hashCode += getDDataPrimeiroVencimento().hashCode();
        }
        _hashCode += getNNumeroParcelas();
        _hashCode += new Double(getNValorParcelas()).hashCode();
        if (getNContaID() != null) {
            _hashCode += getNContaID().hashCode();
        }
        _hashCode += getNFormaCobrancaID();
        _hashCode += getNCategoriaID();
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
        new org.apache.axis.description.TypeDesc(InsertPlanoContaPagar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertPlanoContaPagar"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NFornecedorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFornecedorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NFuncionarioID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFuncionarioID"));
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
        elemField.setFieldName("NContaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
