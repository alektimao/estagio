/**
 * WsNotaParcial.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsNotaParcial  implements java.io.Serializable {
    private int notaParcialID;

    private int avaliacaoID;

    private java.lang.String nomeAvaliacao;

    private double peso;

    private int ordem;

    private int grupoAvaliacaoID;

    private java.lang.String nomeGrupoAvaliacao;

    private java.lang.String nota;

    public WsNotaParcial() {
    }

    public WsNotaParcial(
           int notaParcialID,
           int avaliacaoID,
           java.lang.String nomeAvaliacao,
           double peso,
           int ordem,
           int grupoAvaliacaoID,
           java.lang.String nomeGrupoAvaliacao,
           java.lang.String nota) {
           this.notaParcialID = notaParcialID;
           this.avaliacaoID = avaliacaoID;
           this.nomeAvaliacao = nomeAvaliacao;
           this.peso = peso;
           this.ordem = ordem;
           this.grupoAvaliacaoID = grupoAvaliacaoID;
           this.nomeGrupoAvaliacao = nomeGrupoAvaliacao;
           this.nota = nota;
    }


    /**
     * Gets the notaParcialID value for this WsNotaParcial.
     * 
     * @return notaParcialID
     */
    public int getNotaParcialID() {
        return notaParcialID;
    }


    /**
     * Sets the notaParcialID value for this WsNotaParcial.
     * 
     * @param notaParcialID
     */
    public void setNotaParcialID(int notaParcialID) {
        this.notaParcialID = notaParcialID;
    }


    /**
     * Gets the avaliacaoID value for this WsNotaParcial.
     * 
     * @return avaliacaoID
     */
    public int getAvaliacaoID() {
        return avaliacaoID;
    }


    /**
     * Sets the avaliacaoID value for this WsNotaParcial.
     * 
     * @param avaliacaoID
     */
    public void setAvaliacaoID(int avaliacaoID) {
        this.avaliacaoID = avaliacaoID;
    }


    /**
     * Gets the nomeAvaliacao value for this WsNotaParcial.
     * 
     * @return nomeAvaliacao
     */
    public java.lang.String getNomeAvaliacao() {
        return nomeAvaliacao;
    }


    /**
     * Sets the nomeAvaliacao value for this WsNotaParcial.
     * 
     * @param nomeAvaliacao
     */
    public void setNomeAvaliacao(java.lang.String nomeAvaliacao) {
        this.nomeAvaliacao = nomeAvaliacao;
    }


    /**
     * Gets the peso value for this WsNotaParcial.
     * 
     * @return peso
     */
    public double getPeso() {
        return peso;
    }


    /**
     * Sets the peso value for this WsNotaParcial.
     * 
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }


    /**
     * Gets the ordem value for this WsNotaParcial.
     * 
     * @return ordem
     */
    public int getOrdem() {
        return ordem;
    }


    /**
     * Sets the ordem value for this WsNotaParcial.
     * 
     * @param ordem
     */
    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }


    /**
     * Gets the grupoAvaliacaoID value for this WsNotaParcial.
     * 
     * @return grupoAvaliacaoID
     */
    public int getGrupoAvaliacaoID() {
        return grupoAvaliacaoID;
    }


    /**
     * Sets the grupoAvaliacaoID value for this WsNotaParcial.
     * 
     * @param grupoAvaliacaoID
     */
    public void setGrupoAvaliacaoID(int grupoAvaliacaoID) {
        this.grupoAvaliacaoID = grupoAvaliacaoID;
    }


    /**
     * Gets the nomeGrupoAvaliacao value for this WsNotaParcial.
     * 
     * @return nomeGrupoAvaliacao
     */
    public java.lang.String getNomeGrupoAvaliacao() {
        return nomeGrupoAvaliacao;
    }


    /**
     * Sets the nomeGrupoAvaliacao value for this WsNotaParcial.
     * 
     * @param nomeGrupoAvaliacao
     */
    public void setNomeGrupoAvaliacao(java.lang.String nomeGrupoAvaliacao) {
        this.nomeGrupoAvaliacao = nomeGrupoAvaliacao;
    }


    /**
     * Gets the nota value for this WsNotaParcial.
     * 
     * @return nota
     */
    public java.lang.String getNota() {
        return nota;
    }


    /**
     * Sets the nota value for this WsNotaParcial.
     * 
     * @param nota
     */
    public void setNota(java.lang.String nota) {
        this.nota = nota;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsNotaParcial)) return false;
        WsNotaParcial other = (WsNotaParcial) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.notaParcialID == other.getNotaParcialID() &&
            this.avaliacaoID == other.getAvaliacaoID() &&
            ((this.nomeAvaliacao==null && other.getNomeAvaliacao()==null) || 
             (this.nomeAvaliacao!=null &&
              this.nomeAvaliacao.equals(other.getNomeAvaliacao()))) &&
            this.peso == other.getPeso() &&
            this.ordem == other.getOrdem() &&
            this.grupoAvaliacaoID == other.getGrupoAvaliacaoID() &&
            ((this.nomeGrupoAvaliacao==null && other.getNomeGrupoAvaliacao()==null) || 
             (this.nomeGrupoAvaliacao!=null &&
              this.nomeGrupoAvaliacao.equals(other.getNomeGrupoAvaliacao()))) &&
            ((this.nota==null && other.getNota()==null) || 
             (this.nota!=null &&
              this.nota.equals(other.getNota())));
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
        _hashCode += getNotaParcialID();
        _hashCode += getAvaliacaoID();
        if (getNomeAvaliacao() != null) {
            _hashCode += getNomeAvaliacao().hashCode();
        }
        _hashCode += new Double(getPeso()).hashCode();
        _hashCode += getOrdem();
        _hashCode += getGrupoAvaliacaoID();
        if (getNomeGrupoAvaliacao() != null) {
            _hashCode += getNomeGrupoAvaliacao().hashCode();
        }
        if (getNota() != null) {
            _hashCode += getNota().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsNotaParcial.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsNotaParcial"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notaParcialID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NotaParcialID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avaliacaoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AvaliacaoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeAvaliacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeAvaliacao"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Ordem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grupoAvaliacaoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GrupoAvaliacaoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeGrupoAvaliacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeGrupoAvaliacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Nota"));
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
