/**
 * QuitarParcelas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class QuitarParcelas  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private java.lang.String sContaReceberID;

    private java.lang.String sContaPagarID;

    private java.lang.String sNumeroParcela;

    private int nContaID;

    private java.lang.String dDataPagamento;

    private java.lang.String nValorPago;

    private int nFormaPagamentoID;

    private java.lang.String sOperadoraID;

    private java.lang.String sBandeiraCartao;

    private java.lang.String sQuantidadeVezesParcelamento;

    private java.lang.String sNumeroCartao;

    private boolean lQuitarTodasPendentesPlano;

    public QuitarParcelas() {
    }

    public QuitarParcelas(
           int nCodigoCliente,
           java.lang.String sToken,
           java.lang.String sContaReceberID,
           java.lang.String sContaPagarID,
           java.lang.String sNumeroParcela,
           int nContaID,
           java.lang.String dDataPagamento,
           java.lang.String nValorPago,
           int nFormaPagamentoID,
           java.lang.String sOperadoraID,
           java.lang.String sBandeiraCartao,
           java.lang.String sQuantidadeVezesParcelamento,
           java.lang.String sNumeroCartao,
           boolean lQuitarTodasPendentesPlano) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.sContaReceberID = sContaReceberID;
           this.sContaPagarID = sContaPagarID;
           this.sNumeroParcela = sNumeroParcela;
           this.nContaID = nContaID;
           this.dDataPagamento = dDataPagamento;
           this.nValorPago = nValorPago;
           this.nFormaPagamentoID = nFormaPagamentoID;
           this.sOperadoraID = sOperadoraID;
           this.sBandeiraCartao = sBandeiraCartao;
           this.sQuantidadeVezesParcelamento = sQuantidadeVezesParcelamento;
           this.sNumeroCartao = sNumeroCartao;
           this.lQuitarTodasPendentesPlano = lQuitarTodasPendentesPlano;
    }


    /**
     * Gets the nCodigoCliente value for this QuitarParcelas.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this QuitarParcelas.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this QuitarParcelas.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this QuitarParcelas.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the sContaReceberID value for this QuitarParcelas.
     * 
     * @return sContaReceberID
     */
    public java.lang.String getSContaReceberID() {
        return sContaReceberID;
    }


    /**
     * Sets the sContaReceberID value for this QuitarParcelas.
     * 
     * @param sContaReceberID
     */
    public void setSContaReceberID(java.lang.String sContaReceberID) {
        this.sContaReceberID = sContaReceberID;
    }


    /**
     * Gets the sContaPagarID value for this QuitarParcelas.
     * 
     * @return sContaPagarID
     */
    public java.lang.String getSContaPagarID() {
        return sContaPagarID;
    }


    /**
     * Sets the sContaPagarID value for this QuitarParcelas.
     * 
     * @param sContaPagarID
     */
    public void setSContaPagarID(java.lang.String sContaPagarID) {
        this.sContaPagarID = sContaPagarID;
    }


    /**
     * Gets the sNumeroParcela value for this QuitarParcelas.
     * 
     * @return sNumeroParcela
     */
    public java.lang.String getSNumeroParcela() {
        return sNumeroParcela;
    }


    /**
     * Sets the sNumeroParcela value for this QuitarParcelas.
     * 
     * @param sNumeroParcela
     */
    public void setSNumeroParcela(java.lang.String sNumeroParcela) {
        this.sNumeroParcela = sNumeroParcela;
    }


    /**
     * Gets the nContaID value for this QuitarParcelas.
     * 
     * @return nContaID
     */
    public int getNContaID() {
        return nContaID;
    }


    /**
     * Sets the nContaID value for this QuitarParcelas.
     * 
     * @param nContaID
     */
    public void setNContaID(int nContaID) {
        this.nContaID = nContaID;
    }


    /**
     * Gets the dDataPagamento value for this QuitarParcelas.
     * 
     * @return dDataPagamento
     */
    public java.lang.String getDDataPagamento() {
        return dDataPagamento;
    }


    /**
     * Sets the dDataPagamento value for this QuitarParcelas.
     * 
     * @param dDataPagamento
     */
    public void setDDataPagamento(java.lang.String dDataPagamento) {
        this.dDataPagamento = dDataPagamento;
    }


    /**
     * Gets the nValorPago value for this QuitarParcelas.
     * 
     * @return nValorPago
     */
    public java.lang.String getNValorPago() {
        return nValorPago;
    }


    /**
     * Sets the nValorPago value for this QuitarParcelas.
     * 
     * @param nValorPago
     */
    public void setNValorPago(java.lang.String nValorPago) {
        this.nValorPago = nValorPago;
    }


    /**
     * Gets the nFormaPagamentoID value for this QuitarParcelas.
     * 
     * @return nFormaPagamentoID
     */
    public int getNFormaPagamentoID() {
        return nFormaPagamentoID;
    }


    /**
     * Sets the nFormaPagamentoID value for this QuitarParcelas.
     * 
     * @param nFormaPagamentoID
     */
    public void setNFormaPagamentoID(int nFormaPagamentoID) {
        this.nFormaPagamentoID = nFormaPagamentoID;
    }


    /**
     * Gets the sOperadoraID value for this QuitarParcelas.
     * 
     * @return sOperadoraID
     */
    public java.lang.String getSOperadoraID() {
        return sOperadoraID;
    }


    /**
     * Sets the sOperadoraID value for this QuitarParcelas.
     * 
     * @param sOperadoraID
     */
    public void setSOperadoraID(java.lang.String sOperadoraID) {
        this.sOperadoraID = sOperadoraID;
    }


    /**
     * Gets the sBandeiraCartao value for this QuitarParcelas.
     * 
     * @return sBandeiraCartao
     */
    public java.lang.String getSBandeiraCartao() {
        return sBandeiraCartao;
    }


    /**
     * Sets the sBandeiraCartao value for this QuitarParcelas.
     * 
     * @param sBandeiraCartao
     */
    public void setSBandeiraCartao(java.lang.String sBandeiraCartao) {
        this.sBandeiraCartao = sBandeiraCartao;
    }


    /**
     * Gets the sQuantidadeVezesParcelamento value for this QuitarParcelas.
     * 
     * @return sQuantidadeVezesParcelamento
     */
    public java.lang.String getSQuantidadeVezesParcelamento() {
        return sQuantidadeVezesParcelamento;
    }


    /**
     * Sets the sQuantidadeVezesParcelamento value for this QuitarParcelas.
     * 
     * @param sQuantidadeVezesParcelamento
     */
    public void setSQuantidadeVezesParcelamento(java.lang.String sQuantidadeVezesParcelamento) {
        this.sQuantidadeVezesParcelamento = sQuantidadeVezesParcelamento;
    }


    /**
     * Gets the sNumeroCartao value for this QuitarParcelas.
     * 
     * @return sNumeroCartao
     */
    public java.lang.String getSNumeroCartao() {
        return sNumeroCartao;
    }


    /**
     * Sets the sNumeroCartao value for this QuitarParcelas.
     * 
     * @param sNumeroCartao
     */
    public void setSNumeroCartao(java.lang.String sNumeroCartao) {
        this.sNumeroCartao = sNumeroCartao;
    }


    /**
     * Gets the lQuitarTodasPendentesPlano value for this QuitarParcelas.
     * 
     * @return lQuitarTodasPendentesPlano
     */
    public boolean isLQuitarTodasPendentesPlano() {
        return lQuitarTodasPendentesPlano;
    }


    /**
     * Sets the lQuitarTodasPendentesPlano value for this QuitarParcelas.
     * 
     * @param lQuitarTodasPendentesPlano
     */
    public void setLQuitarTodasPendentesPlano(boolean lQuitarTodasPendentesPlano) {
        this.lQuitarTodasPendentesPlano = lQuitarTodasPendentesPlano;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuitarParcelas)) return false;
        QuitarParcelas other = (QuitarParcelas) obj;
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
            ((this.sContaReceberID==null && other.getSContaReceberID()==null) || 
             (this.sContaReceberID!=null &&
              this.sContaReceberID.equals(other.getSContaReceberID()))) &&
            ((this.sContaPagarID==null && other.getSContaPagarID()==null) || 
             (this.sContaPagarID!=null &&
              this.sContaPagarID.equals(other.getSContaPagarID()))) &&
            ((this.sNumeroParcela==null && other.getSNumeroParcela()==null) || 
             (this.sNumeroParcela!=null &&
              this.sNumeroParcela.equals(other.getSNumeroParcela()))) &&
            this.nContaID == other.getNContaID() &&
            ((this.dDataPagamento==null && other.getDDataPagamento()==null) || 
             (this.dDataPagamento!=null &&
              this.dDataPagamento.equals(other.getDDataPagamento()))) &&
            ((this.nValorPago==null && other.getNValorPago()==null) || 
             (this.nValorPago!=null &&
              this.nValorPago.equals(other.getNValorPago()))) &&
            this.nFormaPagamentoID == other.getNFormaPagamentoID() &&
            ((this.sOperadoraID==null && other.getSOperadoraID()==null) || 
             (this.sOperadoraID!=null &&
              this.sOperadoraID.equals(other.getSOperadoraID()))) &&
            ((this.sBandeiraCartao==null && other.getSBandeiraCartao()==null) || 
             (this.sBandeiraCartao!=null &&
              this.sBandeiraCartao.equals(other.getSBandeiraCartao()))) &&
            ((this.sQuantidadeVezesParcelamento==null && other.getSQuantidadeVezesParcelamento()==null) || 
             (this.sQuantidadeVezesParcelamento!=null &&
              this.sQuantidadeVezesParcelamento.equals(other.getSQuantidadeVezesParcelamento()))) &&
            ((this.sNumeroCartao==null && other.getSNumeroCartao()==null) || 
             (this.sNumeroCartao!=null &&
              this.sNumeroCartao.equals(other.getSNumeroCartao()))) &&
            this.lQuitarTodasPendentesPlano == other.isLQuitarTodasPendentesPlano();
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
        if (getSContaReceberID() != null) {
            _hashCode += getSContaReceberID().hashCode();
        }
        if (getSContaPagarID() != null) {
            _hashCode += getSContaPagarID().hashCode();
        }
        if (getSNumeroParcela() != null) {
            _hashCode += getSNumeroParcela().hashCode();
        }
        _hashCode += getNContaID();
        if (getDDataPagamento() != null) {
            _hashCode += getDDataPagamento().hashCode();
        }
        if (getNValorPago() != null) {
            _hashCode += getNValorPago().hashCode();
        }
        _hashCode += getNFormaPagamentoID();
        if (getSOperadoraID() != null) {
            _hashCode += getSOperadoraID().hashCode();
        }
        if (getSBandeiraCartao() != null) {
            _hashCode += getSBandeiraCartao().hashCode();
        }
        if (getSQuantidadeVezesParcelamento() != null) {
            _hashCode += getSQuantidadeVezesParcelamento().hashCode();
        }
        if (getSNumeroCartao() != null) {
            _hashCode += getSNumeroCartao().hashCode();
        }
        _hashCode += (isLQuitarTodasPendentesPlano() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuitarParcelas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">QuitarParcelas"));
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
        elemField.setFieldName("SContaReceberID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sContaReceberID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SContaPagarID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sContaPagarID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SNumeroParcela");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNumeroParcela"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NContaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DDataPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NValorPago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nValorPago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NFormaPagamentoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFormaPagamentoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SOperadoraID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sOperadoraID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SBandeiraCartao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sBandeiraCartao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SQuantidadeVezesParcelamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sQuantidadeVezesParcelamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SNumeroCartao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNumeroCartao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LQuitarTodasPendentesPlano");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "lQuitarTodasPendentesPlano"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
