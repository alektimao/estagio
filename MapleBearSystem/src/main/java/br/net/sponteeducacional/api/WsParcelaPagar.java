/**
 * WsParcelaPagar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsParcelaPagar  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int contaPagarID;

    private java.lang.String numeroParcela;

    private java.lang.String sacado;

    private java.lang.String situacaoParcela;

    private java.lang.String vencimento;

    private java.lang.String valorParcela;

    private java.lang.String categoria;

    private int contaID;

    private java.lang.String tipoRecebimento;

    private java.lang.String formaCobranca;

    private java.lang.String dataPagamento;

    private java.lang.String valorPago;

    public WsParcelaPagar() {
    }

    public WsParcelaPagar(
           java.lang.String retornoOperacao,
           int contaPagarID,
           java.lang.String numeroParcela,
           java.lang.String sacado,
           java.lang.String situacaoParcela,
           java.lang.String vencimento,
           java.lang.String valorParcela,
           java.lang.String categoria,
           int contaID,
           java.lang.String tipoRecebimento,
           java.lang.String formaCobranca,
           java.lang.String dataPagamento,
           java.lang.String valorPago) {
           this.retornoOperacao = retornoOperacao;
           this.contaPagarID = contaPagarID;
           this.numeroParcela = numeroParcela;
           this.sacado = sacado;
           this.situacaoParcela = situacaoParcela;
           this.vencimento = vencimento;
           this.valorParcela = valorParcela;
           this.categoria = categoria;
           this.contaID = contaID;
           this.tipoRecebimento = tipoRecebimento;
           this.formaCobranca = formaCobranca;
           this.dataPagamento = dataPagamento;
           this.valorPago = valorPago;
    }


    /**
     * Gets the retornoOperacao value for this WsParcelaPagar.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsParcelaPagar.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the contaPagarID value for this WsParcelaPagar.
     * 
     * @return contaPagarID
     */
    public int getContaPagarID() {
        return contaPagarID;
    }


    /**
     * Sets the contaPagarID value for this WsParcelaPagar.
     * 
     * @param contaPagarID
     */
    public void setContaPagarID(int contaPagarID) {
        this.contaPagarID = contaPagarID;
    }


    /**
     * Gets the numeroParcela value for this WsParcelaPagar.
     * 
     * @return numeroParcela
     */
    public java.lang.String getNumeroParcela() {
        return numeroParcela;
    }


    /**
     * Sets the numeroParcela value for this WsParcelaPagar.
     * 
     * @param numeroParcela
     */
    public void setNumeroParcela(java.lang.String numeroParcela) {
        this.numeroParcela = numeroParcela;
    }


    /**
     * Gets the sacado value for this WsParcelaPagar.
     * 
     * @return sacado
     */
    public java.lang.String getSacado() {
        return sacado;
    }


    /**
     * Sets the sacado value for this WsParcelaPagar.
     * 
     * @param sacado
     */
    public void setSacado(java.lang.String sacado) {
        this.sacado = sacado;
    }


    /**
     * Gets the situacaoParcela value for this WsParcelaPagar.
     * 
     * @return situacaoParcela
     */
    public java.lang.String getSituacaoParcela() {
        return situacaoParcela;
    }


    /**
     * Sets the situacaoParcela value for this WsParcelaPagar.
     * 
     * @param situacaoParcela
     */
    public void setSituacaoParcela(java.lang.String situacaoParcela) {
        this.situacaoParcela = situacaoParcela;
    }


    /**
     * Gets the vencimento value for this WsParcelaPagar.
     * 
     * @return vencimento
     */
    public java.lang.String getVencimento() {
        return vencimento;
    }


    /**
     * Sets the vencimento value for this WsParcelaPagar.
     * 
     * @param vencimento
     */
    public void setVencimento(java.lang.String vencimento) {
        this.vencimento = vencimento;
    }


    /**
     * Gets the valorParcela value for this WsParcelaPagar.
     * 
     * @return valorParcela
     */
    public java.lang.String getValorParcela() {
        return valorParcela;
    }


    /**
     * Sets the valorParcela value for this WsParcelaPagar.
     * 
     * @param valorParcela
     */
    public void setValorParcela(java.lang.String valorParcela) {
        this.valorParcela = valorParcela;
    }


    /**
     * Gets the categoria value for this WsParcelaPagar.
     * 
     * @return categoria
     */
    public java.lang.String getCategoria() {
        return categoria;
    }


    /**
     * Sets the categoria value for this WsParcelaPagar.
     * 
     * @param categoria
     */
    public void setCategoria(java.lang.String categoria) {
        this.categoria = categoria;
    }


    /**
     * Gets the contaID value for this WsParcelaPagar.
     * 
     * @return contaID
     */
    public int getContaID() {
        return contaID;
    }


    /**
     * Sets the contaID value for this WsParcelaPagar.
     * 
     * @param contaID
     */
    public void setContaID(int contaID) {
        this.contaID = contaID;
    }


    /**
     * Gets the tipoRecebimento value for this WsParcelaPagar.
     * 
     * @return tipoRecebimento
     */
    public java.lang.String getTipoRecebimento() {
        return tipoRecebimento;
    }


    /**
     * Sets the tipoRecebimento value for this WsParcelaPagar.
     * 
     * @param tipoRecebimento
     */
    public void setTipoRecebimento(java.lang.String tipoRecebimento) {
        this.tipoRecebimento = tipoRecebimento;
    }


    /**
     * Gets the formaCobranca value for this WsParcelaPagar.
     * 
     * @return formaCobranca
     */
    public java.lang.String getFormaCobranca() {
        return formaCobranca;
    }


    /**
     * Sets the formaCobranca value for this WsParcelaPagar.
     * 
     * @param formaCobranca
     */
    public void setFormaCobranca(java.lang.String formaCobranca) {
        this.formaCobranca = formaCobranca;
    }


    /**
     * Gets the dataPagamento value for this WsParcelaPagar.
     * 
     * @return dataPagamento
     */
    public java.lang.String getDataPagamento() {
        return dataPagamento;
    }


    /**
     * Sets the dataPagamento value for this WsParcelaPagar.
     * 
     * @param dataPagamento
     */
    public void setDataPagamento(java.lang.String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }


    /**
     * Gets the valorPago value for this WsParcelaPagar.
     * 
     * @return valorPago
     */
    public java.lang.String getValorPago() {
        return valorPago;
    }


    /**
     * Sets the valorPago value for this WsParcelaPagar.
     * 
     * @param valorPago
     */
    public void setValorPago(java.lang.String valorPago) {
        this.valorPago = valorPago;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsParcelaPagar)) return false;
        WsParcelaPagar other = (WsParcelaPagar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.retornoOperacao==null && other.getRetornoOperacao()==null) || 
             (this.retornoOperacao!=null &&
              this.retornoOperacao.equals(other.getRetornoOperacao()))) &&
            this.contaPagarID == other.getContaPagarID() &&
            ((this.numeroParcela==null && other.getNumeroParcela()==null) || 
             (this.numeroParcela!=null &&
              this.numeroParcela.equals(other.getNumeroParcela()))) &&
            ((this.sacado==null && other.getSacado()==null) || 
             (this.sacado!=null &&
              this.sacado.equals(other.getSacado()))) &&
            ((this.situacaoParcela==null && other.getSituacaoParcela()==null) || 
             (this.situacaoParcela!=null &&
              this.situacaoParcela.equals(other.getSituacaoParcela()))) &&
            ((this.vencimento==null && other.getVencimento()==null) || 
             (this.vencimento!=null &&
              this.vencimento.equals(other.getVencimento()))) &&
            ((this.valorParcela==null && other.getValorParcela()==null) || 
             (this.valorParcela!=null &&
              this.valorParcela.equals(other.getValorParcela()))) &&
            ((this.categoria==null && other.getCategoria()==null) || 
             (this.categoria!=null &&
              this.categoria.equals(other.getCategoria()))) &&
            this.contaID == other.getContaID() &&
            ((this.tipoRecebimento==null && other.getTipoRecebimento()==null) || 
             (this.tipoRecebimento!=null &&
              this.tipoRecebimento.equals(other.getTipoRecebimento()))) &&
            ((this.formaCobranca==null && other.getFormaCobranca()==null) || 
             (this.formaCobranca!=null &&
              this.formaCobranca.equals(other.getFormaCobranca()))) &&
            ((this.dataPagamento==null && other.getDataPagamento()==null) || 
             (this.dataPagamento!=null &&
              this.dataPagamento.equals(other.getDataPagamento()))) &&
            ((this.valorPago==null && other.getValorPago()==null) || 
             (this.valorPago!=null &&
              this.valorPago.equals(other.getValorPago())));
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
        if (getRetornoOperacao() != null) {
            _hashCode += getRetornoOperacao().hashCode();
        }
        _hashCode += getContaPagarID();
        if (getNumeroParcela() != null) {
            _hashCode += getNumeroParcela().hashCode();
        }
        if (getSacado() != null) {
            _hashCode += getSacado().hashCode();
        }
        if (getSituacaoParcela() != null) {
            _hashCode += getSituacaoParcela().hashCode();
        }
        if (getVencimento() != null) {
            _hashCode += getVencimento().hashCode();
        }
        if (getValorParcela() != null) {
            _hashCode += getValorParcela().hashCode();
        }
        if (getCategoria() != null) {
            _hashCode += getCategoria().hashCode();
        }
        _hashCode += getContaID();
        if (getTipoRecebimento() != null) {
            _hashCode += getTipoRecebimento().hashCode();
        }
        if (getFormaCobranca() != null) {
            _hashCode += getFormaCobranca().hashCode();
        }
        if (getDataPagamento() != null) {
            _hashCode += getDataPagamento().hashCode();
        }
        if (getValorPago() != null) {
            _hashCode += getValorPago().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsParcelaPagar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcelaPagar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaPagarID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ContaPagarID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroParcela");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroParcela"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sacado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Sacado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacaoParcela");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SituacaoParcela"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vencimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Vencimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorParcela");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ValorParcela"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Categoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ContaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoRecebimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TipoRecebimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaCobranca");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "FormaCobranca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorPago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ValorPago"));
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
