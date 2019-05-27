/**
 * WsConceito.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsConceito  implements java.io.Serializable {
    private int conceitoID;

    private java.lang.String nomeConceito;

    private java.lang.String descricao;

    private double valorEquivalente;

    public WsConceito() {
    }

    public WsConceito(
           int conceitoID,
           java.lang.String nomeConceito,
           java.lang.String descricao,
           double valorEquivalente) {
           this.conceitoID = conceitoID;
           this.nomeConceito = nomeConceito;
           this.descricao = descricao;
           this.valorEquivalente = valorEquivalente;
    }


    /**
     * Gets the conceitoID value for this WsConceito.
     * 
     * @return conceitoID
     */
    public int getConceitoID() {
        return conceitoID;
    }


    /**
     * Sets the conceitoID value for this WsConceito.
     * 
     * @param conceitoID
     */
    public void setConceitoID(int conceitoID) {
        this.conceitoID = conceitoID;
    }


    /**
     * Gets the nomeConceito value for this WsConceito.
     * 
     * @return nomeConceito
     */
    public java.lang.String getNomeConceito() {
        return nomeConceito;
    }


    /**
     * Sets the nomeConceito value for this WsConceito.
     * 
     * @param nomeConceito
     */
    public void setNomeConceito(java.lang.String nomeConceito) {
        this.nomeConceito = nomeConceito;
    }


    /**
     * Gets the descricao value for this WsConceito.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this WsConceito.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the valorEquivalente value for this WsConceito.
     * 
     * @return valorEquivalente
     */
    public double getValorEquivalente() {
        return valorEquivalente;
    }


    /**
     * Sets the valorEquivalente value for this WsConceito.
     * 
     * @param valorEquivalente
     */
    public void setValorEquivalente(double valorEquivalente) {
        this.valorEquivalente = valorEquivalente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsConceito)) return false;
        WsConceito other = (WsConceito) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.conceitoID == other.getConceitoID() &&
            ((this.nomeConceito==null && other.getNomeConceito()==null) || 
             (this.nomeConceito!=null &&
              this.nomeConceito.equals(other.getNomeConceito()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            this.valorEquivalente == other.getValorEquivalente();
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
        _hashCode += getConceitoID();
        if (getNomeConceito() != null) {
            _hashCode += getNomeConceito().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        _hashCode += new Double(getValorEquivalente()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsConceito.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsConceito"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conceitoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ConceitoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeConceito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeConceito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorEquivalente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ValorEquivalente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
