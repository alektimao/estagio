/**
 * WsFotoApp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsFotoApp  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int alunoID;

    private int responsavelID;

    private java.lang.String foto;

    private java.lang.String fotoPortal;

    public WsFotoApp() {
    }

    public WsFotoApp(
           java.lang.String retornoOperacao,
           int alunoID,
           int responsavelID,
           java.lang.String foto,
           java.lang.String fotoPortal) {
           this.retornoOperacao = retornoOperacao;
           this.alunoID = alunoID;
           this.responsavelID = responsavelID;
           this.foto = foto;
           this.fotoPortal = fotoPortal;
    }


    /**
     * Gets the retornoOperacao value for this WsFotoApp.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsFotoApp.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the alunoID value for this WsFotoApp.
     * 
     * @return alunoID
     */
    public int getAlunoID() {
        return alunoID;
    }


    /**
     * Sets the alunoID value for this WsFotoApp.
     * 
     * @param alunoID
     */
    public void setAlunoID(int alunoID) {
        this.alunoID = alunoID;
    }


    /**
     * Gets the responsavelID value for this WsFotoApp.
     * 
     * @return responsavelID
     */
    public int getResponsavelID() {
        return responsavelID;
    }


    /**
     * Sets the responsavelID value for this WsFotoApp.
     * 
     * @param responsavelID
     */
    public void setResponsavelID(int responsavelID) {
        this.responsavelID = responsavelID;
    }


    /**
     * Gets the foto value for this WsFotoApp.
     * 
     * @return foto
     */
    public java.lang.String getFoto() {
        return foto;
    }


    /**
     * Sets the foto value for this WsFotoApp.
     * 
     * @param foto
     */
    public void setFoto(java.lang.String foto) {
        this.foto = foto;
    }


    /**
     * Gets the fotoPortal value for this WsFotoApp.
     * 
     * @return fotoPortal
     */
    public java.lang.String getFotoPortal() {
        return fotoPortal;
    }


    /**
     * Sets the fotoPortal value for this WsFotoApp.
     * 
     * @param fotoPortal
     */
    public void setFotoPortal(java.lang.String fotoPortal) {
        this.fotoPortal = fotoPortal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsFotoApp)) return false;
        WsFotoApp other = (WsFotoApp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.retornoOperacao==null && other.getRetornoOperacao()==null) || 
             (this.retornoOperacao!=null &&
              this.retornoOperacao.equals(other.getRetornoOperacao()))) &&
            this.alunoID == other.getAlunoID() &&
            this.responsavelID == other.getResponsavelID() &&
            ((this.foto==null && other.getFoto()==null) || 
             (this.foto!=null &&
              this.foto.equals(other.getFoto()))) &&
            ((this.fotoPortal==null && other.getFotoPortal()==null) || 
             (this.fotoPortal!=null &&
              this.fotoPortal.equals(other.getFotoPortal())));
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
        if (getRetornoOperacao() != null) {
            _hashCode += getRetornoOperacao().hashCode();
        }
        _hashCode += getAlunoID();
        _hashCode += getResponsavelID();
        if (getFoto() != null) {
            _hashCode += getFoto().hashCode();
        }
        if (getFotoPortal() != null) {
            _hashCode += getFotoPortal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsFotoApp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFotoApp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alunoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AlunoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsavelID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ResponsavelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Foto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fotoPortal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "FotoPortal"));
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
