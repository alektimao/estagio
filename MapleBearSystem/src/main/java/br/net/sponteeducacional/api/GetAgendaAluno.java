/**
 * GetAgendaAluno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetAgendaAluno  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private int nAlunoID;

    private java.lang.String sTurmaID;

    private java.lang.String sCursoID;

    private java.lang.String dDataInicio;

    private java.lang.String dDataTermino;

    public GetAgendaAluno() {
    }

    public GetAgendaAluno(
           int nCodigoCliente,
           java.lang.String sToken,
           int nAlunoID,
           java.lang.String sTurmaID,
           java.lang.String sCursoID,
           java.lang.String dDataInicio,
           java.lang.String dDataTermino) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nAlunoID = nAlunoID;
           this.sTurmaID = sTurmaID;
           this.sCursoID = sCursoID;
           this.dDataInicio = dDataInicio;
           this.dDataTermino = dDataTermino;
    }


    /**
     * Gets the nCodigoCliente value for this GetAgendaAluno.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this GetAgendaAluno.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this GetAgendaAluno.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this GetAgendaAluno.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nAlunoID value for this GetAgendaAluno.
     * 
     * @return nAlunoID
     */
    public int getNAlunoID() {
        return nAlunoID;
    }


    /**
     * Sets the nAlunoID value for this GetAgendaAluno.
     * 
     * @param nAlunoID
     */
    public void setNAlunoID(int nAlunoID) {
        this.nAlunoID = nAlunoID;
    }


    /**
     * Gets the sTurmaID value for this GetAgendaAluno.
     * 
     * @return sTurmaID
     */
    public java.lang.String getSTurmaID() {
        return sTurmaID;
    }


    /**
     * Sets the sTurmaID value for this GetAgendaAluno.
     * 
     * @param sTurmaID
     */
    public void setSTurmaID(java.lang.String sTurmaID) {
        this.sTurmaID = sTurmaID;
    }


    /**
     * Gets the sCursoID value for this GetAgendaAluno.
     * 
     * @return sCursoID
     */
    public java.lang.String getSCursoID() {
        return sCursoID;
    }


    /**
     * Sets the sCursoID value for this GetAgendaAluno.
     * 
     * @param sCursoID
     */
    public void setSCursoID(java.lang.String sCursoID) {
        this.sCursoID = sCursoID;
    }


    /**
     * Gets the dDataInicio value for this GetAgendaAluno.
     * 
     * @return dDataInicio
     */
    public java.lang.String getDDataInicio() {
        return dDataInicio;
    }


    /**
     * Sets the dDataInicio value for this GetAgendaAluno.
     * 
     * @param dDataInicio
     */
    public void setDDataInicio(java.lang.String dDataInicio) {
        this.dDataInicio = dDataInicio;
    }


    /**
     * Gets the dDataTermino value for this GetAgendaAluno.
     * 
     * @return dDataTermino
     */
    public java.lang.String getDDataTermino() {
        return dDataTermino;
    }


    /**
     * Sets the dDataTermino value for this GetAgendaAluno.
     * 
     * @param dDataTermino
     */
    public void setDDataTermino(java.lang.String dDataTermino) {
        this.dDataTermino = dDataTermino;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAgendaAluno)) return false;
        GetAgendaAluno other = (GetAgendaAluno) obj;
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
            this.nAlunoID == other.getNAlunoID() &&
            ((this.sTurmaID==null && other.getSTurmaID()==null) || 
             (this.sTurmaID!=null &&
              this.sTurmaID.equals(other.getSTurmaID()))) &&
            ((this.sCursoID==null && other.getSCursoID()==null) || 
             (this.sCursoID!=null &&
              this.sCursoID.equals(other.getSCursoID()))) &&
            ((this.dDataInicio==null && other.getDDataInicio()==null) || 
             (this.dDataInicio!=null &&
              this.dDataInicio.equals(other.getDDataInicio()))) &&
            ((this.dDataTermino==null && other.getDDataTermino()==null) || 
             (this.dDataTermino!=null &&
              this.dDataTermino.equals(other.getDDataTermino())));
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
        _hashCode += getNAlunoID();
        if (getSTurmaID() != null) {
            _hashCode += getSTurmaID().hashCode();
        }
        if (getSCursoID() != null) {
            _hashCode += getSCursoID().hashCode();
        }
        if (getDDataInicio() != null) {
            _hashCode += getDDataInicio().hashCode();
        }
        if (getDDataTermino() != null) {
            _hashCode += getDDataTermino().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAgendaAluno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetAgendaAluno"));
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
        elemField.setFieldName("NAlunoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STurmaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sTurmaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCursoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCursoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
