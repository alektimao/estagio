/**
 * GetDiarioAulas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetDiarioAulas  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private int nTurmaID;

    private int nDisciplinaID;

    private java.lang.String dDataInicio;

    private java.lang.String dDataTermino;

    private int nModulo;

    private java.lang.String sSemana;

    public GetDiarioAulas() {
    }

    public GetDiarioAulas(
           int nCodigoCliente,
           java.lang.String sToken,
           int nTurmaID,
           int nDisciplinaID,
           java.lang.String dDataInicio,
           java.lang.String dDataTermino,
           int nModulo,
           java.lang.String sSemana) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nTurmaID = nTurmaID;
           this.nDisciplinaID = nDisciplinaID;
           this.dDataInicio = dDataInicio;
           this.dDataTermino = dDataTermino;
           this.nModulo = nModulo;
           this.sSemana = sSemana;
    }


    /**
     * Gets the nCodigoCliente value for this GetDiarioAulas.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this GetDiarioAulas.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this GetDiarioAulas.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this GetDiarioAulas.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nTurmaID value for this GetDiarioAulas.
     * 
     * @return nTurmaID
     */
    public int getNTurmaID() {
        return nTurmaID;
    }


    /**
     * Sets the nTurmaID value for this GetDiarioAulas.
     * 
     * @param nTurmaID
     */
    public void setNTurmaID(int nTurmaID) {
        this.nTurmaID = nTurmaID;
    }


    /**
     * Gets the nDisciplinaID value for this GetDiarioAulas.
     * 
     * @return nDisciplinaID
     */
    public int getNDisciplinaID() {
        return nDisciplinaID;
    }


    /**
     * Sets the nDisciplinaID value for this GetDiarioAulas.
     * 
     * @param nDisciplinaID
     */
    public void setNDisciplinaID(int nDisciplinaID) {
        this.nDisciplinaID = nDisciplinaID;
    }


    /**
     * Gets the dDataInicio value for this GetDiarioAulas.
     * 
     * @return dDataInicio
     */
    public java.lang.String getDDataInicio() {
        return dDataInicio;
    }


    /**
     * Sets the dDataInicio value for this GetDiarioAulas.
     * 
     * @param dDataInicio
     */
    public void setDDataInicio(java.lang.String dDataInicio) {
        this.dDataInicio = dDataInicio;
    }


    /**
     * Gets the dDataTermino value for this GetDiarioAulas.
     * 
     * @return dDataTermino
     */
    public java.lang.String getDDataTermino() {
        return dDataTermino;
    }


    /**
     * Sets the dDataTermino value for this GetDiarioAulas.
     * 
     * @param dDataTermino
     */
    public void setDDataTermino(java.lang.String dDataTermino) {
        this.dDataTermino = dDataTermino;
    }


    /**
     * Gets the nModulo value for this GetDiarioAulas.
     * 
     * @return nModulo
     */
    public int getNModulo() {
        return nModulo;
    }


    /**
     * Sets the nModulo value for this GetDiarioAulas.
     * 
     * @param nModulo
     */
    public void setNModulo(int nModulo) {
        this.nModulo = nModulo;
    }


    /**
     * Gets the sSemana value for this GetDiarioAulas.
     * 
     * @return sSemana
     */
    public java.lang.String getSSemana() {
        return sSemana;
    }


    /**
     * Sets the sSemana value for this GetDiarioAulas.
     * 
     * @param sSemana
     */
    public void setSSemana(java.lang.String sSemana) {
        this.sSemana = sSemana;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDiarioAulas)) return false;
        GetDiarioAulas other = (GetDiarioAulas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.nCodigoCliente == other.getNCodigoCliente() &&
            ((this.sToken==null && other.getSToken()==null) || 
             (this.sToken!=null &&
              this.sToken.equals(other.getSToken()))) &&
            this.nTurmaID == other.getNTurmaID() &&
            this.nDisciplinaID == other.getNDisciplinaID() &&
            ((this.dDataInicio==null && other.getDDataInicio()==null) || 
             (this.dDataInicio!=null &&
              this.dDataInicio.equals(other.getDDataInicio()))) &&
            ((this.dDataTermino==null && other.getDDataTermino()==null) || 
             (this.dDataTermino!=null &&
              this.dDataTermino.equals(other.getDDataTermino()))) &&
            this.nModulo == other.getNModulo() &&
            ((this.sSemana==null && other.getSSemana()==null) || 
             (this.sSemana!=null &&
              this.sSemana.equals(other.getSSemana())));
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
        _hashCode += getNCodigoCliente();
        if (getSToken() != null) {
            _hashCode += getSToken().hashCode();
        }
        _hashCode += getNTurmaID();
        _hashCode += getNDisciplinaID();
        if (getDDataInicio() != null) {
            _hashCode += getDDataInicio().hashCode();
        }
        if (getDDataTermino() != null) {
            _hashCode += getDDataTermino().hashCode();
        }
        _hashCode += getNModulo();
        if (getSSemana() != null) {
            _hashCode += getSSemana().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDiarioAulas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetDiarioAulas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NCodigoCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NTurmaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurmaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NDisciplinaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nDisciplinaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DDataInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DDataTermino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataTermino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NModulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSemana");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSemana"));
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
