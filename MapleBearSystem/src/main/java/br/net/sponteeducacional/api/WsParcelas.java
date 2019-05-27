/**
 * WsParcelas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsParcelas  implements java.io.Serializable {
    private int contaReceberID;

    private int numeroParcela;

    private double valor;

    private java.lang.String vencimento;

    private int numeroBoleto;

    public WsParcelas() {
    }

    public WsParcelas(
           int contaReceberID,
           int numeroParcela,
           double valor,
           java.lang.String vencimento,
           int numeroBoleto) {
           this.contaReceberID = contaReceberID;
           this.numeroParcela = numeroParcela;
           this.valor = valor;
           this.vencimento = vencimento;
           this.numeroBoleto = numeroBoleto;
    }


    /**
     * Gets the contaReceberID value for this WsParcelas.
     * 
     * @return contaReceberID
     */
    public int getContaReceberID() {
        return contaReceberID;
    }


    /**
     * Sets the contaReceberID value for this WsParcelas.
     * 
     * @param contaReceberID
     */
    public void setContaReceberID(int contaReceberID) {
        this.contaReceberID = contaReceberID;
    }


    /**
     * Gets the numeroParcela value for this WsParcelas.
     * 
     * @return numeroParcela
     */
    public int getNumeroParcela() {
        return numeroParcela;
    }


    /**
     * Sets the numeroParcela value for this WsParcelas.
     * 
     * @param numeroParcela
     */
    public void setNumeroParcela(int numeroParcela) {
        this.numeroParcela = numeroParcela;
    }


    /**
     * Gets the valor value for this WsParcelas.
     * 
     * @return valor
     */
    public double getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this WsParcelas.
     * 
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }


    /**
     * Gets the vencimento value for this WsParcelas.
     * 
     * @return vencimento
     */
    public java.lang.String getVencimento() {
        return vencimento;
    }


    /**
     * Sets the vencimento value for this WsParcelas.
     * 
     * @param vencimento
     */
    public void setVencimento(java.lang.String vencimento) {
        this.vencimento = vencimento;
    }


    /**
     * Gets the numeroBoleto value for this WsParcelas.
     * 
     * @return numeroBoleto
     */
    public int getNumeroBoleto() {
        return numeroBoleto;
    }


    /**
     * Sets the numeroBoleto value for this WsParcelas.
     * 
     * @param numeroBoleto
     */
    public void setNumeroBoleto(int numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsParcelas)) return false;
        WsParcelas other = (WsParcelas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.contaReceberID == other.getContaReceberID() &&
            this.numeroParcela == other.getNumeroParcela() &&
            this.valor == other.getValor() &&
            ((this.vencimento==null && other.getVencimento()==null) || 
             (this.vencimento!=null &&
              this.vencimento.equals(other.getVencimento()))) &&
            this.numeroBoleto == other.getNumeroBoleto();
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
        _hashCode += getContaReceberID();
        _hashCode += getNumeroParcela();
        _hashCode += new Double(getValor()).hashCode();
        if (getVencimento() != null) {
            _hashCode += getVencimento().hashCode();
        }
        _hashCode += getNumeroBoleto();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsParcelas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcelas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaReceberID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ContaReceberID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroParcela");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroParcela"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("numeroBoleto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroBoleto"));
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
