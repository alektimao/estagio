/**
 * InsertFrequenciaDiario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertFrequenciaDiario  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private int nTurmaID;

    private int nDisciplinaID;

    private int nModulo;

    private java.lang.String sDataAula;

    private int sNumAula;

    private java.lang.String sAlunosFaltantes;

    public InsertFrequenciaDiario() {
    }

    public InsertFrequenciaDiario(
           int nCodigoCliente,
           java.lang.String sToken,
           int nTurmaID,
           int nDisciplinaID,
           int nModulo,
           java.lang.String sDataAula,
           int sNumAula,
           java.lang.String sAlunosFaltantes) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nTurmaID = nTurmaID;
           this.nDisciplinaID = nDisciplinaID;
           this.nModulo = nModulo;
           this.sDataAula = sDataAula;
           this.sNumAula = sNumAula;
           this.sAlunosFaltantes = sAlunosFaltantes;
    }


    /**
     * Gets the nCodigoCliente value for this InsertFrequenciaDiario.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this InsertFrequenciaDiario.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this InsertFrequenciaDiario.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this InsertFrequenciaDiario.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nTurmaID value for this InsertFrequenciaDiario.
     * 
     * @return nTurmaID
     */
    public int getNTurmaID() {
        return nTurmaID;
    }


    /**
     * Sets the nTurmaID value for this InsertFrequenciaDiario.
     * 
     * @param nTurmaID
     */
    public void setNTurmaID(int nTurmaID) {
        this.nTurmaID = nTurmaID;
    }


    /**
     * Gets the nDisciplinaID value for this InsertFrequenciaDiario.
     * 
     * @return nDisciplinaID
     */
    public int getNDisciplinaID() {
        return nDisciplinaID;
    }


    /**
     * Sets the nDisciplinaID value for this InsertFrequenciaDiario.
     * 
     * @param nDisciplinaID
     */
    public void setNDisciplinaID(int nDisciplinaID) {
        this.nDisciplinaID = nDisciplinaID;
    }


    /**
     * Gets the nModulo value for this InsertFrequenciaDiario.
     * 
     * @return nModulo
     */
    public int getNModulo() {
        return nModulo;
    }


    /**
     * Sets the nModulo value for this InsertFrequenciaDiario.
     * 
     * @param nModulo
     */
    public void setNModulo(int nModulo) {
        this.nModulo = nModulo;
    }


    /**
     * Gets the sDataAula value for this InsertFrequenciaDiario.
     * 
     * @return sDataAula
     */
    public java.lang.String getSDataAula() {
        return sDataAula;
    }


    /**
     * Sets the sDataAula value for this InsertFrequenciaDiario.
     * 
     * @param sDataAula
     */
    public void setSDataAula(java.lang.String sDataAula) {
        this.sDataAula = sDataAula;
    }


    /**
     * Gets the sNumAula value for this InsertFrequenciaDiario.
     * 
     * @return sNumAula
     */
    public int getSNumAula() {
        return sNumAula;
    }


    /**
     * Sets the sNumAula value for this InsertFrequenciaDiario.
     * 
     * @param sNumAula
     */
    public void setSNumAula(int sNumAula) {
        this.sNumAula = sNumAula;
    }


    /**
     * Gets the sAlunosFaltantes value for this InsertFrequenciaDiario.
     * 
     * @return sAlunosFaltantes
     */
    public java.lang.String getSAlunosFaltantes() {
        return sAlunosFaltantes;
    }


    /**
     * Sets the sAlunosFaltantes value for this InsertFrequenciaDiario.
     * 
     * @param sAlunosFaltantes
     */
    public void setSAlunosFaltantes(java.lang.String sAlunosFaltantes) {
        this.sAlunosFaltantes = sAlunosFaltantes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertFrequenciaDiario)) return false;
        InsertFrequenciaDiario other = (InsertFrequenciaDiario) obj;
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
            this.nModulo == other.getNModulo() &&
            ((this.sDataAula==null && other.getSDataAula()==null) || 
             (this.sDataAula!=null &&
              this.sDataAula.equals(other.getSDataAula()))) &&
            this.sNumAula == other.getSNumAula() &&
            ((this.sAlunosFaltantes==null && other.getSAlunosFaltantes()==null) || 
             (this.sAlunosFaltantes!=null &&
              this.sAlunosFaltantes.equals(other.getSAlunosFaltantes())));
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
        _hashCode += getNModulo();
        if (getSDataAula() != null) {
            _hashCode += getSDataAula().hashCode();
        }
        _hashCode += getSNumAula();
        if (getSAlunosFaltantes() != null) {
            _hashCode += getSAlunosFaltantes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertFrequenciaDiario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertFrequenciaDiario"));
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
        elemField.setFieldName("NModulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDataAula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDataAula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SNumAula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNumAula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAlunosFaltantes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sAlunosFaltantes"));
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
