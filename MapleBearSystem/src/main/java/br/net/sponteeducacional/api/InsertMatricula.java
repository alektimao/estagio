/**
 * InsertMatricula.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertMatricula  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private int nSituacao;

    private int nAlunoID;

    private int nCursoID;

    private java.lang.String nTurmaID;

    private int nTipoContratoID;

    private java.lang.String dDataInicio;

    private java.lang.String dDataTermino;

    private java.util.Calendar dDataMatricula;

    private org.apache.axis.types.UnsignedByte nTipo;

    private java.lang.String sDisciplinas;

    private java.lang.String nModulo;

    private java.lang.String nContratante;

    private java.lang.String nNumeroHoras;

    private java.lang.String sObservacao;

    public InsertMatricula() {
    }

    public InsertMatricula(
           int nCodigoCliente,
           java.lang.String sToken,
           int nSituacao,
           int nAlunoID,
           int nCursoID,
           java.lang.String nTurmaID,
           int nTipoContratoID,
           java.lang.String dDataInicio,
           java.lang.String dDataTermino,
           java.util.Calendar dDataMatricula,
           org.apache.axis.types.UnsignedByte nTipo,
           java.lang.String sDisciplinas,
           java.lang.String nModulo,
           java.lang.String nContratante,
           java.lang.String nNumeroHoras,
           java.lang.String sObservacao) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nSituacao = nSituacao;
           this.nAlunoID = nAlunoID;
           this.nCursoID = nCursoID;
           this.nTurmaID = nTurmaID;
           this.nTipoContratoID = nTipoContratoID;
           this.dDataInicio = dDataInicio;
           this.dDataTermino = dDataTermino;
           this.dDataMatricula = dDataMatricula;
           this.nTipo = nTipo;
           this.sDisciplinas = sDisciplinas;
           this.nModulo = nModulo;
           this.nContratante = nContratante;
           this.nNumeroHoras = nNumeroHoras;
           this.sObservacao = sObservacao;
    }


    /**
     * Gets the nCodigoCliente value for this InsertMatricula.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this InsertMatricula.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this InsertMatricula.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this InsertMatricula.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nSituacao value for this InsertMatricula.
     * 
     * @return nSituacao
     */
    public int getNSituacao() {
        return nSituacao;
    }


    /**
     * Sets the nSituacao value for this InsertMatricula.
     * 
     * @param nSituacao
     */
    public void setNSituacao(int nSituacao) {
        this.nSituacao = nSituacao;
    }


    /**
     * Gets the nAlunoID value for this InsertMatricula.
     * 
     * @return nAlunoID
     */
    public int getNAlunoID() {
        return nAlunoID;
    }


    /**
     * Sets the nAlunoID value for this InsertMatricula.
     * 
     * @param nAlunoID
     */
    public void setNAlunoID(int nAlunoID) {
        this.nAlunoID = nAlunoID;
    }


    /**
     * Gets the nCursoID value for this InsertMatricula.
     * 
     * @return nCursoID
     */
    public int getNCursoID() {
        return nCursoID;
    }


    /**
     * Sets the nCursoID value for this InsertMatricula.
     * 
     * @param nCursoID
     */
    public void setNCursoID(int nCursoID) {
        this.nCursoID = nCursoID;
    }


    /**
     * Gets the nTurmaID value for this InsertMatricula.
     * 
     * @return nTurmaID
     */
    public java.lang.String getNTurmaID() {
        return nTurmaID;
    }


    /**
     * Sets the nTurmaID value for this InsertMatricula.
     * 
     * @param nTurmaID
     */
    public void setNTurmaID(java.lang.String nTurmaID) {
        this.nTurmaID = nTurmaID;
    }


    /**
     * Gets the nTipoContratoID value for this InsertMatricula.
     * 
     * @return nTipoContratoID
     */
    public int getNTipoContratoID() {
        return nTipoContratoID;
    }


    /**
     * Sets the nTipoContratoID value for this InsertMatricula.
     * 
     * @param nTipoContratoID
     */
    public void setNTipoContratoID(int nTipoContratoID) {
        this.nTipoContratoID = nTipoContratoID;
    }


    /**
     * Gets the dDataInicio value for this InsertMatricula.
     * 
     * @return dDataInicio
     */
    public java.lang.String getDDataInicio() {
        return dDataInicio;
    }


    /**
     * Sets the dDataInicio value for this InsertMatricula.
     * 
     * @param dDataInicio
     */
    public void setDDataInicio(java.lang.String dDataInicio) {
        this.dDataInicio = dDataInicio;
    }


    /**
     * Gets the dDataTermino value for this InsertMatricula.
     * 
     * @return dDataTermino
     */
    public java.lang.String getDDataTermino() {
        return dDataTermino;
    }


    /**
     * Sets the dDataTermino value for this InsertMatricula.
     * 
     * @param dDataTermino
     */
    public void setDDataTermino(java.lang.String dDataTermino) {
        this.dDataTermino = dDataTermino;
    }


    /**
     * Gets the dDataMatricula value for this InsertMatricula.
     * 
     * @return dDataMatricula
     */
    public java.util.Calendar getDDataMatricula() {
        return dDataMatricula;
    }


    /**
     * Sets the dDataMatricula value for this InsertMatricula.
     * 
     * @param dDataMatricula
     */
    public void setDDataMatricula(java.util.Calendar dDataMatricula) {
        this.dDataMatricula = dDataMatricula;
    }


    /**
     * Gets the nTipo value for this InsertMatricula.
     * 
     * @return nTipo
     */
    public org.apache.axis.types.UnsignedByte getNTipo() {
        return nTipo;
    }


    /**
     * Sets the nTipo value for this InsertMatricula.
     * 
     * @param nTipo
     */
    public void setNTipo(org.apache.axis.types.UnsignedByte nTipo) {
        this.nTipo = nTipo;
    }


    /**
     * Gets the sDisciplinas value for this InsertMatricula.
     * 
     * @return sDisciplinas
     */
    public java.lang.String getSDisciplinas() {
        return sDisciplinas;
    }


    /**
     * Sets the sDisciplinas value for this InsertMatricula.
     * 
     * @param sDisciplinas
     */
    public void setSDisciplinas(java.lang.String sDisciplinas) {
        this.sDisciplinas = sDisciplinas;
    }


    /**
     * Gets the nModulo value for this InsertMatricula.
     * 
     * @return nModulo
     */
    public java.lang.String getNModulo() {
        return nModulo;
    }


    /**
     * Sets the nModulo value for this InsertMatricula.
     * 
     * @param nModulo
     */
    public void setNModulo(java.lang.String nModulo) {
        this.nModulo = nModulo;
    }


    /**
     * Gets the nContratante value for this InsertMatricula.
     * 
     * @return nContratante
     */
    public java.lang.String getNContratante() {
        return nContratante;
    }


    /**
     * Sets the nContratante value for this InsertMatricula.
     * 
     * @param nContratante
     */
    public void setNContratante(java.lang.String nContratante) {
        this.nContratante = nContratante;
    }


    /**
     * Gets the nNumeroHoras value for this InsertMatricula.
     * 
     * @return nNumeroHoras
     */
    public java.lang.String getNNumeroHoras() {
        return nNumeroHoras;
    }


    /**
     * Sets the nNumeroHoras value for this InsertMatricula.
     * 
     * @param nNumeroHoras
     */
    public void setNNumeroHoras(java.lang.String nNumeroHoras) {
        this.nNumeroHoras = nNumeroHoras;
    }


    /**
     * Gets the sObservacao value for this InsertMatricula.
     * 
     * @return sObservacao
     */
    public java.lang.String getSObservacao() {
        return sObservacao;
    }


    /**
     * Sets the sObservacao value for this InsertMatricula.
     * 
     * @param sObservacao
     */
    public void setSObservacao(java.lang.String sObservacao) {
        this.sObservacao = sObservacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertMatricula)) return false;
        InsertMatricula other = (InsertMatricula) obj;
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
            this.nSituacao == other.getNSituacao() &&
            this.nAlunoID == other.getNAlunoID() &&
            this.nCursoID == other.getNCursoID() &&
            ((this.nTurmaID==null && other.getNTurmaID()==null) || 
             (this.nTurmaID!=null &&
              this.nTurmaID.equals(other.getNTurmaID()))) &&
            this.nTipoContratoID == other.getNTipoContratoID() &&
            ((this.dDataInicio==null && other.getDDataInicio()==null) || 
             (this.dDataInicio!=null &&
              this.dDataInicio.equals(other.getDDataInicio()))) &&
            ((this.dDataTermino==null && other.getDDataTermino()==null) || 
             (this.dDataTermino!=null &&
              this.dDataTermino.equals(other.getDDataTermino()))) &&
            ((this.dDataMatricula==null && other.getDDataMatricula()==null) || 
             (this.dDataMatricula!=null &&
              this.dDataMatricula.equals(other.getDDataMatricula()))) &&
            ((this.nTipo==null && other.getNTipo()==null) || 
             (this.nTipo!=null &&
              this.nTipo.equals(other.getNTipo()))) &&
            ((this.sDisciplinas==null && other.getSDisciplinas()==null) || 
             (this.sDisciplinas!=null &&
              this.sDisciplinas.equals(other.getSDisciplinas()))) &&
            ((this.nModulo==null && other.getNModulo()==null) || 
             (this.nModulo!=null &&
              this.nModulo.equals(other.getNModulo()))) &&
            ((this.nContratante==null && other.getNContratante()==null) || 
             (this.nContratante!=null &&
              this.nContratante.equals(other.getNContratante()))) &&
            ((this.nNumeroHoras==null && other.getNNumeroHoras()==null) || 
             (this.nNumeroHoras!=null &&
              this.nNumeroHoras.equals(other.getNNumeroHoras()))) &&
            ((this.sObservacao==null && other.getSObservacao()==null) || 
             (this.sObservacao!=null &&
              this.sObservacao.equals(other.getSObservacao())));
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
        _hashCode += getNSituacao();
        _hashCode += getNAlunoID();
        _hashCode += getNCursoID();
        if (getNTurmaID() != null) {
            _hashCode += getNTurmaID().hashCode();
        }
        _hashCode += getNTipoContratoID();
        if (getDDataInicio() != null) {
            _hashCode += getDDataInicio().hashCode();
        }
        if (getDDataTermino() != null) {
            _hashCode += getDDataTermino().hashCode();
        }
        if (getDDataMatricula() != null) {
            _hashCode += getDDataMatricula().hashCode();
        }
        if (getNTipo() != null) {
            _hashCode += getNTipo().hashCode();
        }
        if (getSDisciplinas() != null) {
            _hashCode += getSDisciplinas().hashCode();
        }
        if (getNModulo() != null) {
            _hashCode += getNModulo().hashCode();
        }
        if (getNContratante() != null) {
            _hashCode += getNContratante().hashCode();
        }
        if (getNNumeroHoras() != null) {
            _hashCode += getNNumeroHoras().hashCode();
        }
        if (getSObservacao() != null) {
            _hashCode += getSObservacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertMatricula.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertMatricula"));
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
        elemField.setFieldName("NSituacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nSituacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NAlunoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NCursoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCursoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NTurmaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurmaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NTipoContratoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipoContratoID"));
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
        elemField.setFieldName("DDataMatricula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataMatricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDisciplinas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDisciplinas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NModulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NContratante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContratante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NNumeroHoras");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroHoras"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SObservacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"));
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
