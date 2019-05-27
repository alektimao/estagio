/**
 * WsOperadoraCartaoPlanos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsOperadoraCartaoPlanos  implements java.io.Serializable {
    private int operadoraPlanoID;

    private java.lang.String nomeOperadoraPlano;

    private java.lang.String tipoCartao;

    private java.lang.String bandeira;

    private int quantidadeVezesParcelamento;

    public WsOperadoraCartaoPlanos() {
    }

    public WsOperadoraCartaoPlanos(
           int operadoraPlanoID,
           java.lang.String nomeOperadoraPlano,
           java.lang.String tipoCartao,
           java.lang.String bandeira,
           int quantidadeVezesParcelamento) {
           this.operadoraPlanoID = operadoraPlanoID;
           this.nomeOperadoraPlano = nomeOperadoraPlano;
           this.tipoCartao = tipoCartao;
           this.bandeira = bandeira;
           this.quantidadeVezesParcelamento = quantidadeVezesParcelamento;
    }


    /**
     * Gets the operadoraPlanoID value for this WsOperadoraCartaoPlanos.
     * 
     * @return operadoraPlanoID
     */
    public int getOperadoraPlanoID() {
        return operadoraPlanoID;
    }


    /**
     * Sets the operadoraPlanoID value for this WsOperadoraCartaoPlanos.
     * 
     * @param operadoraPlanoID
     */
    public void setOperadoraPlanoID(int operadoraPlanoID) {
        this.operadoraPlanoID = operadoraPlanoID;
    }


    /**
     * Gets the nomeOperadoraPlano value for this WsOperadoraCartaoPlanos.
     * 
     * @return nomeOperadoraPlano
     */
    public java.lang.String getNomeOperadoraPlano() {
        return nomeOperadoraPlano;
    }


    /**
     * Sets the nomeOperadoraPlano value for this WsOperadoraCartaoPlanos.
     * 
     * @param nomeOperadoraPlano
     */
    public void setNomeOperadoraPlano(java.lang.String nomeOperadoraPlano) {
        this.nomeOperadoraPlano = nomeOperadoraPlano;
    }


    /**
     * Gets the tipoCartao value for this WsOperadoraCartaoPlanos.
     * 
     * @return tipoCartao
     */
    public java.lang.String getTipoCartao() {
        return tipoCartao;
    }


    /**
     * Sets the tipoCartao value for this WsOperadoraCartaoPlanos.
     * 
     * @param tipoCartao
     */
    public void setTipoCartao(java.lang.String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }


    /**
     * Gets the bandeira value for this WsOperadoraCartaoPlanos.
     * 
     * @return bandeira
     */
    public java.lang.String getBandeira() {
        return bandeira;
    }


    /**
     * Sets the bandeira value for this WsOperadoraCartaoPlanos.
     * 
     * @param bandeira
     */
    public void setBandeira(java.lang.String bandeira) {
        this.bandeira = bandeira;
    }


    /**
     * Gets the quantidadeVezesParcelamento value for this WsOperadoraCartaoPlanos.
     * 
     * @return quantidadeVezesParcelamento
     */
    public int getQuantidadeVezesParcelamento() {
        return quantidadeVezesParcelamento;
    }


    /**
     * Sets the quantidadeVezesParcelamento value for this WsOperadoraCartaoPlanos.
     * 
     * @param quantidadeVezesParcelamento
     */
    public void setQuantidadeVezesParcelamento(int quantidadeVezesParcelamento) {
        this.quantidadeVezesParcelamento = quantidadeVezesParcelamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsOperadoraCartaoPlanos)) return false;
        WsOperadoraCartaoPlanos other = (WsOperadoraCartaoPlanos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.operadoraPlanoID == other.getOperadoraPlanoID() &&
            ((this.nomeOperadoraPlano==null && other.getNomeOperadoraPlano()==null) || 
             (this.nomeOperadoraPlano!=null &&
              this.nomeOperadoraPlano.equals(other.getNomeOperadoraPlano()))) &&
            ((this.tipoCartao==null && other.getTipoCartao()==null) || 
             (this.tipoCartao!=null &&
              this.tipoCartao.equals(other.getTipoCartao()))) &&
            ((this.bandeira==null && other.getBandeira()==null) || 
             (this.bandeira!=null &&
              this.bandeira.equals(other.getBandeira()))) &&
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
        _hashCode += getOperadoraPlanoID();
        if (getNomeOperadoraPlano() != null) {
            _hashCode += getNomeOperadoraPlano().hashCode();
        }
        if (getTipoCartao() != null) {
            _hashCode += getTipoCartao().hashCode();
        }
        if (getBandeira() != null) {
            _hashCode += getBandeira().hashCode();
        }
        _hashCode += getQuantidadeVezesParcelamento();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsOperadoraCartaoPlanos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOperadoraCartaoPlanos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operadoraPlanoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "OperadoraPlanoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeOperadoraPlano");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeOperadoraPlano"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCartao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TipoCartao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandeira");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Bandeira"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
