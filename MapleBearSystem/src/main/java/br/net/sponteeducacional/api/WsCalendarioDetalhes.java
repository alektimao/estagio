/**
 * WsCalendarioDetalhes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsCalendarioDetalhes  implements java.io.Serializable {
    private java.lang.String dataInicio;

    private java.lang.String dataTermino;

    private java.lang.String tipoData;

    private java.lang.String descricao;

    private int diaUtil;

    private java.lang.String cor;

    private int eventoAnual;

    public WsCalendarioDetalhes() {
    }

    public WsCalendarioDetalhes(
           java.lang.String dataInicio,
           java.lang.String dataTermino,
           java.lang.String tipoData,
           java.lang.String descricao,
           int diaUtil,
           java.lang.String cor,
           int eventoAnual) {
           this.dataInicio = dataInicio;
           this.dataTermino = dataTermino;
           this.tipoData = tipoData;
           this.descricao = descricao;
           this.diaUtil = diaUtil;
           this.cor = cor;
           this.eventoAnual = eventoAnual;
    }


    /**
     * Gets the dataInicio value for this WsCalendarioDetalhes.
     * 
     * @return dataInicio
     */
    public java.lang.String getDataInicio() {
        return dataInicio;
    }


    /**
     * Sets the dataInicio value for this WsCalendarioDetalhes.
     * 
     * @param dataInicio
     */
    public void setDataInicio(java.lang.String dataInicio) {
        this.dataInicio = dataInicio;
    }


    /**
     * Gets the dataTermino value for this WsCalendarioDetalhes.
     * 
     * @return dataTermino
     */
    public java.lang.String getDataTermino() {
        return dataTermino;
    }


    /**
     * Sets the dataTermino value for this WsCalendarioDetalhes.
     * 
     * @param dataTermino
     */
    public void setDataTermino(java.lang.String dataTermino) {
        this.dataTermino = dataTermino;
    }


    /**
     * Gets the tipoData value for this WsCalendarioDetalhes.
     * 
     * @return tipoData
     */
    public java.lang.String getTipoData() {
        return tipoData;
    }


    /**
     * Sets the tipoData value for this WsCalendarioDetalhes.
     * 
     * @param tipoData
     */
    public void setTipoData(java.lang.String tipoData) {
        this.tipoData = tipoData;
    }


    /**
     * Gets the descricao value for this WsCalendarioDetalhes.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this WsCalendarioDetalhes.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the diaUtil value for this WsCalendarioDetalhes.
     * 
     * @return diaUtil
     */
    public int getDiaUtil() {
        return diaUtil;
    }


    /**
     * Sets the diaUtil value for this WsCalendarioDetalhes.
     * 
     * @param diaUtil
     */
    public void setDiaUtil(int diaUtil) {
        this.diaUtil = diaUtil;
    }


    /**
     * Gets the cor value for this WsCalendarioDetalhes.
     * 
     * @return cor
     */
    public java.lang.String getCor() {
        return cor;
    }


    /**
     * Sets the cor value for this WsCalendarioDetalhes.
     * 
     * @param cor
     */
    public void setCor(java.lang.String cor) {
        this.cor = cor;
    }


    /**
     * Gets the eventoAnual value for this WsCalendarioDetalhes.
     * 
     * @return eventoAnual
     */
    public int getEventoAnual() {
        return eventoAnual;
    }


    /**
     * Sets the eventoAnual value for this WsCalendarioDetalhes.
     * 
     * @param eventoAnual
     */
    public void setEventoAnual(int eventoAnual) {
        this.eventoAnual = eventoAnual;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsCalendarioDetalhes)) return false;
        WsCalendarioDetalhes other = (WsCalendarioDetalhes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataInicio==null && other.getDataInicio()==null) || 
             (this.dataInicio!=null &&
              this.dataInicio.equals(other.getDataInicio()))) &&
            ((this.dataTermino==null && other.getDataTermino()==null) || 
             (this.dataTermino!=null &&
              this.dataTermino.equals(other.getDataTermino()))) &&
            ((this.tipoData==null && other.getTipoData()==null) || 
             (this.tipoData!=null &&
              this.tipoData.equals(other.getTipoData()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            this.diaUtil == other.getDiaUtil() &&
            ((this.cor==null && other.getCor()==null) || 
             (this.cor!=null &&
              this.cor.equals(other.getCor()))) &&
            this.eventoAnual == other.getEventoAnual();
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
        if (getDataInicio() != null) {
            _hashCode += getDataInicio().hashCode();
        }
        if (getDataTermino() != null) {
            _hashCode += getDataTermino().hashCode();
        }
        if (getTipoData() != null) {
            _hashCode += getTipoData().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        _hashCode += getDiaUtil();
        if (getCor() != null) {
            _hashCode += getCor().hashCode();
        }
        _hashCode += getEventoAnual();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsCalendarioDetalhes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCalendarioDetalhes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataTermino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataTermino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TipoData"));
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
        elemField.setFieldName("diaUtil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DiaUtil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Cor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventoAnual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "EventoAnual"));
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
