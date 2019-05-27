/**
 * Indicador.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class Indicador  implements java.io.Serializable {
    private java.lang.String nomeIndicador;

    private int meta;

    private int real;

    private double performance;

    public Indicador() {
    }

    public Indicador(
           java.lang.String nomeIndicador,
           int meta,
           int real,
           double performance) {
           this.nomeIndicador = nomeIndicador;
           this.meta = meta;
           this.real = real;
           this.performance = performance;
    }


    /**
     * Gets the nomeIndicador value for this Indicador.
     * 
     * @return nomeIndicador
     */
    public java.lang.String getNomeIndicador() {
        return nomeIndicador;
    }


    /**
     * Sets the nomeIndicador value for this Indicador.
     * 
     * @param nomeIndicador
     */
    public void setNomeIndicador(java.lang.String nomeIndicador) {
        this.nomeIndicador = nomeIndicador;
    }


    /**
     * Gets the meta value for this Indicador.
     * 
     * @return meta
     */
    public int getMeta() {
        return meta;
    }


    /**
     * Sets the meta value for this Indicador.
     * 
     * @param meta
     */
    public void setMeta(int meta) {
        this.meta = meta;
    }


    /**
     * Gets the real value for this Indicador.
     * 
     * @return real
     */
    public int getReal() {
        return real;
    }


    /**
     * Sets the real value for this Indicador.
     * 
     * @param real
     */
    public void setReal(int real) {
        this.real = real;
    }


    /**
     * Gets the performance value for this Indicador.
     * 
     * @return performance
     */
    public double getPerformance() {
        return performance;
    }


    /**
     * Sets the performance value for this Indicador.
     * 
     * @param performance
     */
    public void setPerformance(double performance) {
        this.performance = performance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Indicador)) return false;
        Indicador other = (Indicador) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nomeIndicador==null && other.getNomeIndicador()==null) || 
             (this.nomeIndicador!=null &&
              this.nomeIndicador.equals(other.getNomeIndicador()))) &&
            this.meta == other.getMeta() &&
            this.real == other.getReal() &&
            this.performance == other.getPerformance();
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
        if (getNomeIndicador() != null) {
            _hashCode += getNomeIndicador().hashCode();
        }
        _hashCode += getMeta();
        _hashCode += getReal();
        _hashCode += new Double(getPerformance()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Indicador.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Indicador"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeIndicador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeIndicador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Meta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("real");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Real"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Performance"));
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
