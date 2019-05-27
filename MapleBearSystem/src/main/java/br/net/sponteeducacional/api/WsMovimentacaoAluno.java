/**
 * WsMovimentacaoAluno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsMovimentacaoAluno  implements java.io.Serializable {
    private int alunoID;

    private java.lang.String dataEntrada;

    private java.lang.String dataSaida;

    private java.lang.String horaEntrada;

    private java.lang.String horaSaida;

    public WsMovimentacaoAluno() {
    }

    public WsMovimentacaoAluno(
           int alunoID,
           java.lang.String dataEntrada,
           java.lang.String dataSaida,
           java.lang.String horaEntrada,
           java.lang.String horaSaida) {
           this.alunoID = alunoID;
           this.dataEntrada = dataEntrada;
           this.dataSaida = dataSaida;
           this.horaEntrada = horaEntrada;
           this.horaSaida = horaSaida;
    }


    /**
     * Gets the alunoID value for this WsMovimentacaoAluno.
     * 
     * @return alunoID
     */
    public int getAlunoID() {
        return alunoID;
    }


    /**
     * Sets the alunoID value for this WsMovimentacaoAluno.
     * 
     * @param alunoID
     */
    public void setAlunoID(int alunoID) {
        this.alunoID = alunoID;
    }


    /**
     * Gets the dataEntrada value for this WsMovimentacaoAluno.
     * 
     * @return dataEntrada
     */
    public java.lang.String getDataEntrada() {
        return dataEntrada;
    }


    /**
     * Sets the dataEntrada value for this WsMovimentacaoAluno.
     * 
     * @param dataEntrada
     */
    public void setDataEntrada(java.lang.String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }


    /**
     * Gets the dataSaida value for this WsMovimentacaoAluno.
     * 
     * @return dataSaida
     */
    public java.lang.String getDataSaida() {
        return dataSaida;
    }


    /**
     * Sets the dataSaida value for this WsMovimentacaoAluno.
     * 
     * @param dataSaida
     */
    public void setDataSaida(java.lang.String dataSaida) {
        this.dataSaida = dataSaida;
    }


    /**
     * Gets the horaEntrada value for this WsMovimentacaoAluno.
     * 
     * @return horaEntrada
     */
    public java.lang.String getHoraEntrada() {
        return horaEntrada;
    }


    /**
     * Sets the horaEntrada value for this WsMovimentacaoAluno.
     * 
     * @param horaEntrada
     */
    public void setHoraEntrada(java.lang.String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }


    /**
     * Gets the horaSaida value for this WsMovimentacaoAluno.
     * 
     * @return horaSaida
     */
    public java.lang.String getHoraSaida() {
        return horaSaida;
    }


    /**
     * Sets the horaSaida value for this WsMovimentacaoAluno.
     * 
     * @param horaSaida
     */
    public void setHoraSaida(java.lang.String horaSaida) {
        this.horaSaida = horaSaida;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsMovimentacaoAluno)) return false;
        WsMovimentacaoAluno other = (WsMovimentacaoAluno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.alunoID == other.getAlunoID() &&
            ((this.dataEntrada==null && other.getDataEntrada()==null) || 
             (this.dataEntrada!=null &&
              this.dataEntrada.equals(other.getDataEntrada()))) &&
            ((this.dataSaida==null && other.getDataSaida()==null) || 
             (this.dataSaida!=null &&
              this.dataSaida.equals(other.getDataSaida()))) &&
            ((this.horaEntrada==null && other.getHoraEntrada()==null) || 
             (this.horaEntrada!=null &&
              this.horaEntrada.equals(other.getHoraEntrada()))) &&
            ((this.horaSaida==null && other.getHoraSaida()==null) || 
             (this.horaSaida!=null &&
              this.horaSaida.equals(other.getHoraSaida())));
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
        _hashCode += getAlunoID();
        if (getDataEntrada() != null) {
            _hashCode += getDataEntrada().hashCode();
        }
        if (getDataSaida() != null) {
            _hashCode += getDataSaida().hashCode();
        }
        if (getHoraEntrada() != null) {
            _hashCode += getHoraEntrada().hashCode();
        }
        if (getHoraSaida() != null) {
            _hashCode += getHoraSaida().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsMovimentacaoAluno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMovimentacaoAluno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alunoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AlunoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataEntrada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataEntrada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSaida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataSaida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horaEntrada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "HoraEntrada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horaSaida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "HoraSaida"));
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
