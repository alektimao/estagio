/**
 * CobrancasBancarias.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class CobrancasBancarias  implements java.io.Serializable {
    private int CNABID;

    private java.lang.String nome;

    private java.lang.String carteira;

    private java.lang.String agencia;

    private java.lang.String conta;

    public CobrancasBancarias() {
    }

    public CobrancasBancarias(
           int CNABID,
           java.lang.String nome,
           java.lang.String carteira,
           java.lang.String agencia,
           java.lang.String conta) {
           this.CNABID = CNABID;
           this.nome = nome;
           this.carteira = carteira;
           this.agencia = agencia;
           this.conta = conta;
    }


    /**
     * Gets the CNABID value for this CobrancasBancarias.
     * 
     * @return CNABID
     */
    public int getCNABID() {
        return CNABID;
    }


    /**
     * Sets the CNABID value for this CobrancasBancarias.
     * 
     * @param CNABID
     */
    public void setCNABID(int CNABID) {
        this.CNABID = CNABID;
    }


    /**
     * Gets the nome value for this CobrancasBancarias.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this CobrancasBancarias.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the carteira value for this CobrancasBancarias.
     * 
     * @return carteira
     */
    public java.lang.String getCarteira() {
        return carteira;
    }


    /**
     * Sets the carteira value for this CobrancasBancarias.
     * 
     * @param carteira
     */
    public void setCarteira(java.lang.String carteira) {
        this.carteira = carteira;
    }


    /**
     * Gets the agencia value for this CobrancasBancarias.
     * 
     * @return agencia
     */
    public java.lang.String getAgencia() {
        return agencia;
    }


    /**
     * Sets the agencia value for this CobrancasBancarias.
     * 
     * @param agencia
     */
    public void setAgencia(java.lang.String agencia) {
        this.agencia = agencia;
    }


    /**
     * Gets the conta value for this CobrancasBancarias.
     * 
     * @return conta
     */
    public java.lang.String getConta() {
        return conta;
    }


    /**
     * Sets the conta value for this CobrancasBancarias.
     * 
     * @param conta
     */
    public void setConta(java.lang.String conta) {
        this.conta = conta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CobrancasBancarias)) return false;
        CobrancasBancarias other = (CobrancasBancarias) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.CNABID == other.getCNABID() &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.carteira==null && other.getCarteira()==null) || 
             (this.carteira!=null &&
              this.carteira.equals(other.getCarteira()))) &&
            ((this.agencia==null && other.getAgencia()==null) || 
             (this.agencia!=null &&
              this.agencia.equals(other.getAgencia()))) &&
            ((this.conta==null && other.getConta()==null) || 
             (this.conta!=null &&
              this.conta.equals(other.getConta())));
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
        _hashCode += getCNABID();
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getCarteira() != null) {
            _hashCode += getCarteira().hashCode();
        }
        if (getAgencia() != null) {
            _hashCode += getAgencia().hashCode();
        }
        if (getConta() != null) {
            _hashCode += getConta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CobrancasBancarias.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CobrancasBancarias"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CNABID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CNABID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carteira");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Carteira"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Agencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Conta"));
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
