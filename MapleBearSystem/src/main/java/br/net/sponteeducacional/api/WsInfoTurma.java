/**
 * WsInfoTurma.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsInfoTurma  implements java.io.Serializable {
    private int turmaId;

    private java.lang.String nome;

    private java.lang.String anoLetivo;

    private java.lang.String turno;

    private java.lang.String serie;

    public WsInfoTurma() {
    }

    public WsInfoTurma(
           int turmaId,
           java.lang.String nome,
           java.lang.String anoLetivo,
           java.lang.String turno,
           java.lang.String serie) {
           this.turmaId = turmaId;
           this.nome = nome;
           this.anoLetivo = anoLetivo;
           this.turno = turno;
           this.serie = serie;
    }


    /**
     * Gets the turmaId value for this WsInfoTurma.
     * 
     * @return turmaId
     */
    public int getTurmaId() {
        return turmaId;
    }


    /**
     * Sets the turmaId value for this WsInfoTurma.
     * 
     * @param turmaId
     */
    public void setTurmaId(int turmaId) {
        this.turmaId = turmaId;
    }


    /**
     * Gets the nome value for this WsInfoTurma.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this WsInfoTurma.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the anoLetivo value for this WsInfoTurma.
     * 
     * @return anoLetivo
     */
    public java.lang.String getAnoLetivo() {
        return anoLetivo;
    }


    /**
     * Sets the anoLetivo value for this WsInfoTurma.
     * 
     * @param anoLetivo
     */
    public void setAnoLetivo(java.lang.String anoLetivo) {
        this.anoLetivo = anoLetivo;
    }


    /**
     * Gets the turno value for this WsInfoTurma.
     * 
     * @return turno
     */
    public java.lang.String getTurno() {
        return turno;
    }


    /**
     * Sets the turno value for this WsInfoTurma.
     * 
     * @param turno
     */
    public void setTurno(java.lang.String turno) {
        this.turno = turno;
    }


    /**
     * Gets the serie value for this WsInfoTurma.
     * 
     * @return serie
     */
    public java.lang.String getSerie() {
        return serie;
    }


    /**
     * Sets the serie value for this WsInfoTurma.
     * 
     * @param serie
     */
    public void setSerie(java.lang.String serie) {
        this.serie = serie;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsInfoTurma)) return false;
        WsInfoTurma other = (WsInfoTurma) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.turmaId == other.getTurmaId() &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.anoLetivo==null && other.getAnoLetivo()==null) || 
             (this.anoLetivo!=null &&
              this.anoLetivo.equals(other.getAnoLetivo()))) &&
            ((this.turno==null && other.getTurno()==null) || 
             (this.turno!=null &&
              this.turno.equals(other.getTurno()))) &&
            ((this.serie==null && other.getSerie()==null) || 
             (this.serie!=null &&
              this.serie.equals(other.getSerie())));
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
        _hashCode += getTurmaId();
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getAnoLetivo() != null) {
            _hashCode += getAnoLetivo().hashCode();
        }
        if (getTurno() != null) {
            _hashCode += getTurno().hashCode();
        }
        if (getSerie() != null) {
            _hashCode += getSerie().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsInfoTurma.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsInfoTurma"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("turmaId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TurmaId"));
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
        elemField.setFieldName("anoLetivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AnoLetivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("turno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Turno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Serie"));
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
