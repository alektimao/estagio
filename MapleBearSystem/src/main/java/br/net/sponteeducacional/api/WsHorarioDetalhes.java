/**
 * WsHorarioDetalhes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsHorarioDetalhes  implements java.io.Serializable {
    private java.lang.String diaSemana;

    private int numeroAula;

    private java.lang.String horarioInicial;

    private java.lang.String horarioFinal;

    public WsHorarioDetalhes() {
    }

    public WsHorarioDetalhes(
           java.lang.String diaSemana,
           int numeroAula,
           java.lang.String horarioInicial,
           java.lang.String horarioFinal) {
           this.diaSemana = diaSemana;
           this.numeroAula = numeroAula;
           this.horarioInicial = horarioInicial;
           this.horarioFinal = horarioFinal;
    }


    /**
     * Gets the diaSemana value for this WsHorarioDetalhes.
     * 
     * @return diaSemana
     */
    public java.lang.String getDiaSemana() {
        return diaSemana;
    }


    /**
     * Sets the diaSemana value for this WsHorarioDetalhes.
     * 
     * @param diaSemana
     */
    public void setDiaSemana(java.lang.String diaSemana) {
        this.diaSemana = diaSemana;
    }


    /**
     * Gets the numeroAula value for this WsHorarioDetalhes.
     * 
     * @return numeroAula
     */
    public int getNumeroAula() {
        return numeroAula;
    }


    /**
     * Sets the numeroAula value for this WsHorarioDetalhes.
     * 
     * @param numeroAula
     */
    public void setNumeroAula(int numeroAula) {
        this.numeroAula = numeroAula;
    }


    /**
     * Gets the horarioInicial value for this WsHorarioDetalhes.
     * 
     * @return horarioInicial
     */
    public java.lang.String getHorarioInicial() {
        return horarioInicial;
    }


    /**
     * Sets the horarioInicial value for this WsHorarioDetalhes.
     * 
     * @param horarioInicial
     */
    public void setHorarioInicial(java.lang.String horarioInicial) {
        this.horarioInicial = horarioInicial;
    }


    /**
     * Gets the horarioFinal value for this WsHorarioDetalhes.
     * 
     * @return horarioFinal
     */
    public java.lang.String getHorarioFinal() {
        return horarioFinal;
    }


    /**
     * Sets the horarioFinal value for this WsHorarioDetalhes.
     * 
     * @param horarioFinal
     */
    public void setHorarioFinal(java.lang.String horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsHorarioDetalhes)) return false;
        WsHorarioDetalhes other = (WsHorarioDetalhes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.diaSemana==null && other.getDiaSemana()==null) || 
             (this.diaSemana!=null &&
              this.diaSemana.equals(other.getDiaSemana()))) &&
            this.numeroAula == other.getNumeroAula() &&
            ((this.horarioInicial==null && other.getHorarioInicial()==null) || 
             (this.horarioInicial!=null &&
              this.horarioInicial.equals(other.getHorarioInicial()))) &&
            ((this.horarioFinal==null && other.getHorarioFinal()==null) || 
             (this.horarioFinal!=null &&
              this.horarioFinal.equals(other.getHorarioFinal())));
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
        if (getDiaSemana() != null) {
            _hashCode += getDiaSemana().hashCode();
        }
        _hashCode += getNumeroAula();
        if (getHorarioInicial() != null) {
            _hashCode += getHorarioInicial().hashCode();
        }
        if (getHorarioFinal() != null) {
            _hashCode += getHorarioFinal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsHorarioDetalhes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsHorarioDetalhes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diaSemana");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DiaSemana"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroAula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
