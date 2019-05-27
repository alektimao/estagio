/**
 * WsBoletos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsBoletos  implements java.io.Serializable {
    private int CNABID;

    private int numeroBoleto;

    private double valor;

    private java.lang.String vencimento;

    private java.lang.String linhaDigitavel;

    public WsBoletos() {
    }

    public WsBoletos(
           int CNABID,
           int numeroBoleto,
           double valor,
           java.lang.String vencimento,
           java.lang.String linhaDigitavel) {
           this.CNABID = CNABID;
           this.numeroBoleto = numeroBoleto;
           this.valor = valor;
           this.vencimento = vencimento;
           this.linhaDigitavel = linhaDigitavel;
    }


    /**
     * Gets the CNABID value for this WsBoletos.
     * 
     * @return CNABID
     */
    public int getCNABID() {
        return CNABID;
    }


    /**
     * Sets the CNABID value for this WsBoletos.
     * 
     * @param CNABID
     */
    public void setCNABID(int CNABID) {
        this.CNABID = CNABID;
    }


    /**
     * Gets the numeroBoleto value for this WsBoletos.
     * 
     * @return numeroBoleto
     */
    public int getNumeroBoleto() {
        return numeroBoleto;
    }


    /**
     * Sets the numeroBoleto value for this WsBoletos.
     * 
     * @param numeroBoleto
     */
    public void setNumeroBoleto(int numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }


    /**
     * Gets the valor value for this WsBoletos.
     * 
     * @return valor
     */
    public double getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this WsBoletos.
     * 
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }


    /**
     * Gets the vencimento value for this WsBoletos.
     * 
     * @return vencimento
     */
    public java.lang.String getVencimento() {
        return vencimento;
    }


    /**
     * Sets the vencimento value for this WsBoletos.
     * 
     * @param vencimento
     */
    public void setVencimento(java.lang.String vencimento) {
        this.vencimento = vencimento;
    }


    /**
     * Gets the linhaDigitavel value for this WsBoletos.
     * 
     * @return linhaDigitavel
     */
    public java.lang.String getLinhaDigitavel() {
        return linhaDigitavel;
    }


    /**
     * Sets the linhaDigitavel value for this WsBoletos.
     * 
     * @param linhaDigitavel
     */
    public void setLinhaDigitavel(java.lang.String linhaDigitavel) {
        this.linhaDigitavel = linhaDigitavel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsBoletos)) return false;
        WsBoletos other = (WsBoletos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.CNABID == other.getCNABID() &&
            this.numeroBoleto == other.getNumeroBoleto() &&
            this.valor == other.getValor() &&
            ((this.vencimento==null && other.getVencimento()==null) || 
             (this.vencimento!=null &&
              this.vencimento.equals(other.getVencimento()))) &&
            ((this.linhaDigitavel==null && other.getLinhaDigitavel()==null) || 
             (this.linhaDigitavel!=null &&
              this.linhaDigitavel.equals(other.getLinhaDigitavel())));
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
        _hashCode += getNumeroBoleto();
        _hashCode += new Double(getValor()).hashCode();
        if (getVencimento() != null) {
            _hashCode += getVencimento().hashCode();
        }
        if (getLinhaDigitavel() != null) {
            _hashCode += getLinhaDigitavel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsBoletos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBoletos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CNABID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CNABID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroBoleto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroBoleto"));
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
        elemField.setFieldName("linhaDigitavel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "LinhaDigitavel"));
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
