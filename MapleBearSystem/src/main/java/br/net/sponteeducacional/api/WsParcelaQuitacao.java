/**
 * WsParcelaQuitacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsParcelaQuitacao  implements java.io.Serializable {
    private int recebimentoAPIID;

    private int contaReceberID;

    private int contaPagarID;

    private java.lang.String numeroParcelas;

    private java.lang.String valorPago;

    private java.lang.String dataPagamento;

    private int contaID;

    private int formaPagamento;

    private int operadoraID;

    private int quantidadeVezesParcelamento;

    public WsParcelaQuitacao() {
    }

    public WsParcelaQuitacao(
           int recebimentoAPIID,
           int contaReceberID,
           int contaPagarID,
           java.lang.String numeroParcelas,
           java.lang.String valorPago,
           java.lang.String dataPagamento,
           int contaID,
           int formaPagamento,
           int operadoraID,
           int quantidadeVezesParcelamento) {
           this.recebimentoAPIID = recebimentoAPIID;
           this.contaReceberID = contaReceberID;
           this.contaPagarID = contaPagarID;
           this.numeroParcelas = numeroParcelas;
           this.valorPago = valorPago;
           this.dataPagamento = dataPagamento;
           this.contaID = contaID;
           this.formaPagamento = formaPagamento;
           this.operadoraID = operadoraID;
           this.quantidadeVezesParcelamento = quantidadeVezesParcelamento;
    }


    /**
     * Gets the recebimentoAPIID value for this WsParcelaQuitacao.
     * 
     * @return recebimentoAPIID
     */
    public int getRecebimentoAPIID() {
        return recebimentoAPIID;
    }


    /**
     * Sets the recebimentoAPIID value for this WsParcelaQuitacao.
     * 
     * @param recebimentoAPIID
     */
    public void setRecebimentoAPIID(int recebimentoAPIID) {
        this.recebimentoAPIID = recebimentoAPIID;
    }


    /**
     * Gets the contaReceberID value for this WsParcelaQuitacao.
     * 
     * @return contaReceberID
     */
    public int getContaReceberID() {
        return contaReceberID;
    }


    /**
     * Sets the contaReceberID value for this WsParcelaQuitacao.
     * 
     * @param contaReceberID
     */
    public void setContaReceberID(int contaReceberID) {
        this.contaReceberID = contaReceberID;
    }


    /**
     * Gets the contaPagarID value for this WsParcelaQuitacao.
     * 
     * @return contaPagarID
     */
    public int getContaPagarID() {
        return contaPagarID;
    }


    /**
     * Sets the contaPagarID value for this WsParcelaQuitacao.
     * 
     * @param contaPagarID
     */
    public void setContaPagarID(int contaPagarID) {
        this.contaPagarID = contaPagarID;
    }


    /**
     * Gets the numeroParcelas value for this WsParcelaQuitacao.
     * 
     * @return numeroParcelas
     */
    public java.lang.String getNumeroParcelas() {
        return numeroParcelas;
    }


    /**
     * Sets the numeroParcelas value for this WsParcelaQuitacao.
     * 
     * @param numeroParcelas
     */
    public void setNumeroParcelas(java.lang.String numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }


    /**
     * Gets the valorPago value for this WsParcelaQuitacao.
     * 
     * @return valorPago
     */
    public java.lang.String getValorPago() {
        return valorPago;
    }


    /**
     * Sets the valorPago value for this WsParcelaQuitacao.
     * 
     * @param valorPago
     */
    public void setValorPago(java.lang.String valorPago) {
        this.valorPago = valorPago;
    }


    /**
     * Gets the dataPagamento value for this WsParcelaQuitacao.
     * 
     * @return dataPagamento
     */
    public java.lang.String getDataPagamento() {
        return dataPagamento;
    }


    /**
     * Sets the dataPagamento value for this WsParcelaQuitacao.
     * 
     * @param dataPagamento
     */
    public void setDataPagamento(java.lang.String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }


    /**
     * Gets the contaID value for this WsParcelaQuitacao.
     * 
     * @return contaID
     */
    public int getContaID() {
        return contaID;
    }


    /**
     * Sets the contaID value for this WsParcelaQuitacao.
     * 
     * @param contaID
     */
    public void setContaID(int contaID) {
        this.contaID = contaID;
    }


    /**
     * Gets the formaPagamento value for this WsParcelaQuitacao.
     * 
     * @return formaPagamento
     */
    public int getFormaPagamento() {
        return formaPagamento;
    }


    /**
     * Sets the formaPagamento value for this WsParcelaQuitacao.
     * 
     * @param formaPagamento
     */
    public void setFormaPagamento(int formaPagamento) {
        this.formaPagamento = formaPagamento;
    }


    /**
     * Gets the operadoraID value for this WsParcelaQuitacao.
     * 
     * @return operadoraID
     */
    public int getOperadoraID() {
        return operadoraID;
    }


    /**
     * Sets the operadoraID value for this WsParcelaQuitacao.
     * 
     * @param operadoraID
     */
    public void setOperadoraID(int operadoraID) {
        this.operadoraID = operadoraID;
    }


    /**
     * Gets the quantidadeVezesParcelamento value for this WsParcelaQuitacao.
     * 
     * @return quantidadeVezesParcelamento
     */
    public int getQuantidadeVezesParcelamento() {
        return quantidadeVezesParcelamento;
    }


    /**
     * Sets the quantidadeVezesParcelamento value for this WsParcelaQuitacao.
     * 
     * @param quantidadeVezesParcelamento
     */
    public void setQuantidadeVezesParcelamento(int quantidadeVezesParcelamento) {
        this.quantidadeVezesParcelamento = quantidadeVezesParcelamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsParcelaQuitacao)) return false;
        WsParcelaQuitacao other = (WsParcelaQuitacao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.recebimentoAPIID == other.getRecebimentoAPIID() &&
            this.contaReceberID == other.getContaReceberID() &&
            this.contaPagarID == other.getContaPagarID() &&
            ((this.numeroParcelas==null && other.getNumeroParcelas()==null) || 
             (this.numeroParcelas!=null &&
              this.numeroParcelas.equals(other.getNumeroParcelas()))) &&
            ((this.valorPago==null && other.getValorPago()==null) || 
             (this.valorPago!=null &&
              this.valorPago.equals(other.getValorPago()))) &&
            ((this.dataPagamento==null && other.getDataPagamento()==null) || 
             (this.dataPagamento!=null &&
              this.dataPagamento.equals(other.getDataPagamento()))) &&
            this.contaID == other.getContaID() &&
            this.formaPagamento == other.getFormaPagamento() &&
            this.operadoraID == other.getOperadoraID() &&
            this.quantidadeVezesParcelamento == other.getQuantidadeVezesParcelamento();
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
        _hashCode += getRecebimentoAPIID();
        _hashCode += getContaReceberID();
        _hashCode += getContaPagarID();
        if (getNumeroParcelas() != null) {
            _hashCode += getNumeroParcelas().hashCode();
        }
        if (getValorPago() != null) {
            _hashCode += getValorPago().hashCode();
        }
        if (getDataPagamento() != null) {
            _hashCode += getDataPagamento().hashCode();
        }
        _hashCode += getContaID();
        _hashCode += getFormaPagamento();
        _hashCode += getOperadoraID();
        _hashCode += getQuantidadeVezesParcelamento();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsParcelaQuitacao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcelaQuitacao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recebimentoAPIID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RecebimentoAPIID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaReceberID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ContaReceberID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaPagarID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ContaPagarID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroParcelas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroParcelas"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataPagamento"));
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
        elemField.setFieldName("formaPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "FormaPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operadoraID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "OperadoraID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidadeVezesParcelamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "QuantidadeVezesParcelamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
