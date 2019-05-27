/**
 * WsVendas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsVendas  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int saidaID;

    private java.lang.String contratoID;

    private java.lang.String contratoAulaLivreID;

    private java.lang.String dataVenda;

    private java.lang.String situacaoEntrega;

    private java.lang.String numeroDocumento;

    private java.lang.String observacao;

    private br.net.sponteeducacional.api.WsParcelas[] parcelas;

    private br.net.sponteeducacional.api.WsItensVenda[] itens;

    public WsVendas() {
    }

    public WsVendas(
           java.lang.String retornoOperacao,
           int saidaID,
           java.lang.String contratoID,
           java.lang.String contratoAulaLivreID,
           java.lang.String dataVenda,
           java.lang.String situacaoEntrega,
           java.lang.String numeroDocumento,
           java.lang.String observacao,
           br.net.sponteeducacional.api.WsParcelas[] parcelas,
           br.net.sponteeducacional.api.WsItensVenda[] itens) {
           this.retornoOperacao = retornoOperacao;
           this.saidaID = saidaID;
           this.contratoID = contratoID;
           this.contratoAulaLivreID = contratoAulaLivreID;
           this.dataVenda = dataVenda;
           this.situacaoEntrega = situacaoEntrega;
           this.numeroDocumento = numeroDocumento;
           this.observacao = observacao;
           this.parcelas = parcelas;
           this.itens = itens;
    }


    /**
     * Gets the retornoOperacao value for this WsVendas.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsVendas.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the saidaID value for this WsVendas.
     * 
     * @return saidaID
     */
    public int getSaidaID() {
        return saidaID;
    }


    /**
     * Sets the saidaID value for this WsVendas.
     * 
     * @param saidaID
     */
    public void setSaidaID(int saidaID) {
        this.saidaID = saidaID;
    }


    /**
     * Gets the contratoID value for this WsVendas.
     * 
     * @return contratoID
     */
    public java.lang.String getContratoID() {
        return contratoID;
    }


    /**
     * Sets the contratoID value for this WsVendas.
     * 
     * @param contratoID
     */
    public void setContratoID(java.lang.String contratoID) {
        this.contratoID = contratoID;
    }


    /**
     * Gets the contratoAulaLivreID value for this WsVendas.
     * 
     * @return contratoAulaLivreID
     */
    public java.lang.String getContratoAulaLivreID() {
        return contratoAulaLivreID;
    }


    /**
     * Sets the contratoAulaLivreID value for this WsVendas.
     * 
     * @param contratoAulaLivreID
     */
    public void setContratoAulaLivreID(java.lang.String contratoAulaLivreID) {
        this.contratoAulaLivreID = contratoAulaLivreID;
    }


    /**
     * Gets the dataVenda value for this WsVendas.
     * 
     * @return dataVenda
     */
    public java.lang.String getDataVenda() {
        return dataVenda;
    }


    /**
     * Sets the dataVenda value for this WsVendas.
     * 
     * @param dataVenda
     */
    public void setDataVenda(java.lang.String dataVenda) {
        this.dataVenda = dataVenda;
    }


    /**
     * Gets the situacaoEntrega value for this WsVendas.
     * 
     * @return situacaoEntrega
     */
    public java.lang.String getSituacaoEntrega() {
        return situacaoEntrega;
    }


    /**
     * Sets the situacaoEntrega value for this WsVendas.
     * 
     * @param situacaoEntrega
     */
    public void setSituacaoEntrega(java.lang.String situacaoEntrega) {
        this.situacaoEntrega = situacaoEntrega;
    }


    /**
     * Gets the numeroDocumento value for this WsVendas.
     * 
     * @return numeroDocumento
     */
    public java.lang.String getNumeroDocumento() {
        return numeroDocumento;
    }


    /**
     * Sets the numeroDocumento value for this WsVendas.
     * 
     * @param numeroDocumento
     */
    public void setNumeroDocumento(java.lang.String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    /**
     * Gets the observacao value for this WsVendas.
     * 
     * @return observacao
     */
    public java.lang.String getObservacao() {
        return observacao;
    }


    /**
     * Sets the observacao value for this WsVendas.
     * 
     * @param observacao
     */
    public void setObservacao(java.lang.String observacao) {
        this.observacao = observacao;
    }


    /**
     * Gets the parcelas value for this WsVendas.
     * 
     * @return parcelas
     */
    public br.net.sponteeducacional.api.WsParcelas[] getParcelas() {
        return parcelas;
    }


    /**
     * Sets the parcelas value for this WsVendas.
     * 
     * @param parcelas
     */
    public void setParcelas(br.net.sponteeducacional.api.WsParcelas[] parcelas) {
        this.parcelas = parcelas;
    }


    /**
     * Gets the itens value for this WsVendas.
     * 
     * @return itens
     */
    public br.net.sponteeducacional.api.WsItensVenda[] getItens() {
        return itens;
    }


    /**
     * Sets the itens value for this WsVendas.
     * 
     * @param itens
     */
    public void setItens(br.net.sponteeducacional.api.WsItensVenda[] itens) {
        this.itens = itens;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsVendas)) return false;
        WsVendas other = (WsVendas) obj;
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
            this.saidaID == other.getSaidaID() &&
            ((this.contratoID==null && other.getContratoID()==null) || 
             (this.contratoID!=null &&
              this.contratoID.equals(other.getContratoID()))) &&
            ((this.contratoAulaLivreID==null && other.getContratoAulaLivreID()==null) || 
             (this.contratoAulaLivreID!=null &&
              this.contratoAulaLivreID.equals(other.getContratoAulaLivreID()))) &&
            ((this.dataVenda==null && other.getDataVenda()==null) || 
             (this.dataVenda!=null &&
              this.dataVenda.equals(other.getDataVenda()))) &&
            ((this.situacaoEntrega==null && other.getSituacaoEntrega()==null) || 
             (this.situacaoEntrega!=null &&
              this.situacaoEntrega.equals(other.getSituacaoEntrega()))) &&
            ((this.numeroDocumento==null && other.getNumeroDocumento()==null) || 
             (this.numeroDocumento!=null &&
              this.numeroDocumento.equals(other.getNumeroDocumento()))) &&
            ((this.observacao==null && other.getObservacao()==null) || 
             (this.observacao!=null &&
              this.observacao.equals(other.getObservacao()))) &&
            ((this.parcelas==null && other.getParcelas()==null) || 
             (this.parcelas!=null &&
              java.util.Arrays.equals(this.parcelas, other.getParcelas()))) &&
            ((this.itens==null && other.getItens()==null) || 
             (this.itens!=null &&
              java.util.Arrays.equals(this.itens, other.getItens())));
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
        _hashCode += getSaidaID();
        if (getContratoID() != null) {
            _hashCode += getContratoID().hashCode();
        }
        if (getContratoAulaLivreID() != null) {
            _hashCode += getContratoAulaLivreID().hashCode();
        }
        if (getDataVenda() != null) {
            _hashCode += getDataVenda().hashCode();
        }
        if (getSituacaoEntrega() != null) {
            _hashCode += getSituacaoEntrega().hashCode();
        }
        if (getNumeroDocumento() != null) {
            _hashCode += getNumeroDocumento().hashCode();
        }
        if (getObservacao() != null) {
            _hashCode += getObservacao().hashCode();
        }
        if (getParcelas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParcelas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParcelas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItens() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItens());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItens(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsVendas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsVendas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saidaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SaidaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contratoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ContratoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contratoAulaLivreID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ContratoAulaLivreID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataVenda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataVenda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacaoEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SituacaoEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Observacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Parcelas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcelas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcelas"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itens");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Itens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsItensVenda"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsItensVenda"));
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
