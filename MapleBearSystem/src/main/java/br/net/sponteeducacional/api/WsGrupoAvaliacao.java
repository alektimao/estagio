/**
 * WsGrupoAvaliacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsGrupoAvaliacao  implements java.io.Serializable {
    private int grupoAvaliacaoID;

    private java.lang.String nomeGrupo;

    private double peso;

    public WsGrupoAvaliacao() {
    }

    public WsGrupoAvaliacao(
           int grupoAvaliacaoID,
           java.lang.String nomeGrupo,
           double peso) {
           this.grupoAvaliacaoID = grupoAvaliacaoID;
           this.nomeGrupo = nomeGrupo;
           this.peso = peso;
    }


    /**
     * Gets the grupoAvaliacaoID value for this WsGrupoAvaliacao.
     * 
     * @return grupoAvaliacaoID
     */
    public int getGrupoAvaliacaoID() {
        return grupoAvaliacaoID;
    }


    /**
     * Sets the grupoAvaliacaoID value for this WsGrupoAvaliacao.
     * 
     * @param grupoAvaliacaoID
     */
    public void setGrupoAvaliacaoID(int grupoAvaliacaoID) {
        this.grupoAvaliacaoID = grupoAvaliacaoID;
    }


    /**
     * Gets the nomeGrupo value for this WsGrupoAvaliacao.
     * 
     * @return nomeGrupo
     */
    public java.lang.String getNomeGrupo() {
        return nomeGrupo;
    }


    /**
     * Sets the nomeGrupo value for this WsGrupoAvaliacao.
     * 
     * @param nomeGrupo
     */
    public void setNomeGrupo(java.lang.String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }


    /**
     * Gets the peso value for this WsGrupoAvaliacao.
     * 
     * @return peso
     */
    public double getPeso() {
        return peso;
    }


    /**
     * Sets the peso value for this WsGrupoAvaliacao.
     * 
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsGrupoAvaliacao)) return false;
        WsGrupoAvaliacao other = (WsGrupoAvaliacao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.grupoAvaliacaoID == other.getGrupoAvaliacaoID() &&
            ((this.nomeGrupo==null && other.getNomeGrupo()==null) || 
             (this.nomeGrupo!=null &&
              this.nomeGrupo.equals(other.getNomeGrupo()))) &&
            this.peso == other.getPeso();
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
        _hashCode += getGrupoAvaliacaoID();
        if (getNomeGrupo() != null) {
            _hashCode += getNomeGrupo().hashCode();
        }
        _hashCode += new Double(getPeso()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsGrupoAvaliacao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsGrupoAvaliacao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grupoAvaliacaoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GrupoAvaliacaoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeGrupo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeGrupo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Peso"));
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
