/**
 * InsertTurma.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertTurma  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private java.lang.String sNome;

    private int nCursoId;

    private int nAnoLetivo;

    private java.lang.String sSigla;

    private int nModulo;

    private java.util.Calendar dDataInicio;

    private int nTipoTurma;

    private int nTurno;

    public InsertTurma() {
    }

    public InsertTurma(
           int nCodigoCliente,
           java.lang.String sToken,
           java.lang.String sNome,
           int nCursoId,
           int nAnoLetivo,
           java.lang.String sSigla,
           int nModulo,
           java.util.Calendar dDataInicio,
           int nTipoTurma,
           int nTurno) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.sNome = sNome;
           this.nCursoId = nCursoId;
           this.nAnoLetivo = nAnoLetivo;
           this.sSigla = sSigla;
           this.nModulo = nModulo;
           this.dDataInicio = dDataInicio;
           this.nTipoTurma = nTipoTurma;
           this.nTurno = nTurno;
    }


    /**
     * Gets the nCodigoCliente value for this InsertTurma.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this InsertTurma.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this InsertTurma.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this InsertTurma.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the sNome value for this InsertTurma.
     * 
     * @return sNome
     */
    public java.lang.String getSNome() {
        return sNome;
    }


    /**
     * Sets the sNome value for this InsertTurma.
     * 
     * @param sNome
     */
    public void setSNome(java.lang.String sNome) {
        this.sNome = sNome;
    }


    /**
     * Gets the nCursoId value for this InsertTurma.
     * 
     * @return nCursoId
     */
    public int getNCursoId() {
        return nCursoId;
    }


    /**
     * Sets the nCursoId value for this InsertTurma.
     * 
     * @param nCursoId
     */
    public void setNCursoId(int nCursoId) {
        this.nCursoId = nCursoId;
    }


    /**
     * Gets the nAnoLetivo value for this InsertTurma.
     * 
     * @return nAnoLetivo
     */
    public int getNAnoLetivo() {
        return nAnoLetivo;
    }


    /**
     * Sets the nAnoLetivo value for this InsertTurma.
     * 
     * @param nAnoLetivo
     */
    public void setNAnoLetivo(int nAnoLetivo) {
        this.nAnoLetivo = nAnoLetivo;
    }


    /**
     * Gets the sSigla value for this InsertTurma.
     * 
     * @return sSigla
     */
    public java.lang.String getSSigla() {
        return sSigla;
    }


    /**
     * Sets the sSigla value for this InsertTurma.
     * 
     * @param sSigla
     */
    public void setSSigla(java.lang.String sSigla) {
        this.sSigla = sSigla;
    }


    /**
     * Gets the nModulo value for this InsertTurma.
     * 
     * @return nModulo
     */
    public int getNModulo() {
        return nModulo;
    }


    /**
     * Sets the nModulo value for this InsertTurma.
     * 
     * @param nModulo
     */
    public void setNModulo(int nModulo) {
        this.nModulo = nModulo;
    }


    /**
     * Gets the dDataInicio value for this InsertTurma.
     * 
     * @return dDataInicio
     */
    public java.util.Calendar getDDataInicio() {
        return dDataInicio;
    }


    /**
     * Sets the dDataInicio value for this InsertTurma.
     * 
     * @param dDataInicio
     */
    public void setDDataInicio(java.util.Calendar dDataInicio) {
        this.dDataInicio = dDataInicio;
    }


    /**
     * Gets the nTipoTurma value for this InsertTurma.
     * 
     * @return nTipoTurma
     */
    public int getNTipoTurma() {
        return nTipoTurma;
    }


    /**
     * Sets the nTipoTurma value for this InsertTurma.
     * 
     * @param nTipoTurma
     */
    public void setNTipoTurma(int nTipoTurma) {
        this.nTipoTurma = nTipoTurma;
    }


    /**
     * Gets the nTurno value for this InsertTurma.
     * 
     * @return nTurno
     */
    public int getNTurno() {
        return nTurno;
    }


    /**
     * Sets the nTurno value for this InsertTurma.
     * 
     * @param nTurno
     */
    public void setNTurno(int nTurno) {
        this.nTurno = nTurno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertTurma)) return false;
        InsertTurma other = (InsertTurma) obj;
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
            ((this.sNome==null && other.getSNome()==null) || 
             (this.sNome!=null &&
              this.sNome.equals(other.getSNome()))) &&
            this.nCursoId == other.getNCursoId() &&
            this.nAnoLetivo == other.getNAnoLetivo() &&
            ((this.sSigla==null && other.getSSigla()==null) || 
             (this.sSigla!=null &&
              this.sSigla.equals(other.getSSigla()))) &&
            this.nModulo == other.getNModulo() &&
            ((this.dDataInicio==null && other.getDDataInicio()==null) || 
             (this.dDataInicio!=null &&
              this.dDataInicio.equals(other.getDDataInicio()))) &&
            this.nTipoTurma == other.getNTipoTurma() &&
            this.nTurno == other.getNTurno();
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
        if (getSNome() != null) {
            _hashCode += getSNome().hashCode();
        }
        _hashCode += getNCursoId();
        _hashCode += getNAnoLetivo();
        if (getSSigla() != null) {
            _hashCode += getSSigla().hashCode();
        }
        _hashCode += getNModulo();
        if (getDDataInicio() != null) {
            _hashCode += getDDataInicio().hashCode();
        }
        _hashCode += getNTipoTurma();
        _hashCode += getNTurno();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertTurma.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertTurma"));
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
        elemField.setFieldName("SNome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NCursoId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCursoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NAnoLetivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAnoLetivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSigla");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSigla"));
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
        elemField.setFieldName("DDataInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NTipoTurma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipoTurma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NTurno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurno"));
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
