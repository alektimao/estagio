/**
 * WsFaltasAluno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsFaltasAluno  implements java.io.Serializable {
    private java.lang.String dataAula;

    private java.lang.String horarioInicial;

    private java.lang.String horarioFinal;

    private java.lang.String duracaoAula;

    public WsFaltasAluno() {
    }

    public WsFaltasAluno(
           java.lang.String dataAula,
           java.lang.String horarioInicial,
           java.lang.String horarioFinal,
           java.lang.String duracaoAula) {
           this.dataAula = dataAula;
           this.horarioInicial = horarioInicial;
           this.horarioFinal = horarioFinal;
           this.duracaoAula = duracaoAula;
    }


    /**
     * Gets the dataAula value for this WsFaltasAluno.
     * 
     * @return dataAula
     */
    public java.lang.String getDataAula() {
        return dataAula;
    }


    /**
     * Sets the dataAula value for this WsFaltasAluno.
     * 
     * @param dataAula
     */
    public void setDataAula(java.lang.String dataAula) {
        this.dataAula = dataAula;
    }


    /**
     * Gets the horarioInicial value for this WsFaltasAluno.
     * 
     * @return horarioInicial
     */
    public java.lang.String getHorarioInicial() {
        return horarioInicial;
    }


    /**
     * Sets the horarioInicial value for this WsFaltasAluno.
     * 
     * @param horarioInicial
     */
    public void setHorarioInicial(java.lang.String horarioInicial) {
        this.horarioInicial = horarioInicial;
    }


    /**
     * Gets the horarioFinal value for this WsFaltasAluno.
     * 
     * @return horarioFinal
     */
    public java.lang.String getHorarioFinal() {
        return horarioFinal;
    }


    /**
     * Sets the horarioFinal value for this WsFaltasAluno.
     * 
     * @param horarioFinal
     */
    public void setHorarioFinal(java.lang.String horarioFinal) {
        this.horarioFinal = horarioFinal;
    }


    /**
     * Gets the duracaoAula value for this WsFaltasAluno.
     * 
     * @return duracaoAula
     */
    public java.lang.String getDuracaoAula() {
        return duracaoAula;
    }


    /**
     * Sets the duracaoAula value for this WsFaltasAluno.
     * 
     * @param duracaoAula
     */
    public void setDuracaoAula(java.lang.String duracaoAula) {
        this.duracaoAula = duracaoAula;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsFaltasAluno)) return false;
        WsFaltasAluno other = (WsFaltasAluno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataAula==null && other.getDataAula()==null) || 
             (this.dataAula!=null &&
              this.dataAula.equals(other.getDataAula()))) &&
            ((this.horarioInicial==null && other.getHorarioInicial()==null) || 
             (this.horarioInicial!=null &&
              this.horarioInicial.equals(other.getHorarioInicial()))) &&
            ((this.horarioFinal==null && other.getHorarioFinal()==null) || 
             (this.horarioFinal!=null &&
              this.horarioFinal.equals(other.getHorarioFinal()))) &&
            ((this.duracaoAula==null && other.getDuracaoAula()==null) || 
             (this.duracaoAula!=null &&
              this.duracaoAula.equals(other.getDuracaoAula())));
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
        if (getDataAula() != null) {
            _hashCode += getDataAula().hashCode();
        }
        if (getHorarioInicial() != null) {
            _hashCode += getHorarioInicial().hashCode();
        }
        if (getHorarioFinal() != null) {
            _hashCode += getHorarioFinal().hashCode();
        }
        if (getDuracaoAula() != null) {
            _hashCode += getDuracaoAula().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsFaltasAluno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFaltasAluno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataAula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "HorarioInicial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "HorarioFinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duracaoAula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DuracaoAula"));
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
