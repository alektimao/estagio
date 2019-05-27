/**
 * UpdateMatricula.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class UpdateMatricula  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private java.lang.String nContratoID;

    private java.lang.String nContratoAulaLivreID;

    private java.lang.String nSituacao;

    private java.lang.String nCursoID;

    private java.lang.String nTipoContratoID;

    private java.lang.String dDataInicio;

    private java.lang.String nContratante;

    private java.lang.String dDataTermino;

    private java.lang.String dDataMatricula;

    private java.lang.String nModulo;

    private java.lang.String sDisciplinasMatricular;

    private java.lang.String sDisciplinasRemover;

    private java.lang.String sObservacao;

    public UpdateMatricula() {
    }

    public UpdateMatricula(
           int nCodigoCliente,
           java.lang.String sToken,
           java.lang.String nContratoID,
           java.lang.String nContratoAulaLivreID,
           java.lang.String nSituacao,
           java.lang.String nCursoID,
           java.lang.String nTipoContratoID,
           java.lang.String dDataInicio,
           java.lang.String nContratante,
           java.lang.String dDataTermino,
           java.lang.String dDataMatricula,
           java.lang.String nModulo,
           java.lang.String sDisciplinasMatricular,
           java.lang.String sDisciplinasRemover,
           java.lang.String sObservacao) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nContratoID = nContratoID;
           this.nContratoAulaLivreID = nContratoAulaLivreID;
           this.nSituacao = nSituacao;
           this.nCursoID = nCursoID;
           this.nTipoContratoID = nTipoContratoID;
           this.dDataInicio = dDataInicio;
           this.nContratante = nContratante;
           this.dDataTermino = dDataTermino;
           this.dDataMatricula = dDataMatricula;
           this.nModulo = nModulo;
           this.sDisciplinasMatricular = sDisciplinasMatricular;
           this.sDisciplinasRemover = sDisciplinasRemover;
           this.sObservacao = sObservacao;
    }


    /**
     * Gets the nCodigoCliente value for this UpdateMatricula.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this UpdateMatricula.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this UpdateMatricula.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this UpdateMatricula.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nContratoID value for this UpdateMatricula.
     * 
     * @return nContratoID
     */
    public java.lang.String getNContratoID() {
        return nContratoID;
    }


    /**
     * Sets the nContratoID value for this UpdateMatricula.
     * 
     * @param nContratoID
     */
    public void setNContratoID(java.lang.String nContratoID) {
        this.nContratoID = nContratoID;
    }


    /**
     * Gets the nContratoAulaLivreID value for this UpdateMatricula.
     * 
     * @return nContratoAulaLivreID
     */
    public java.lang.String getNContratoAulaLivreID() {
        return nContratoAulaLivreID;
    }


    /**
     * Sets the nContratoAulaLivreID value for this UpdateMatricula.
     * 
     * @param nContratoAulaLivreID
     */
    public void setNContratoAulaLivreID(java.lang.String nContratoAulaLivreID) {
        this.nContratoAulaLivreID = nContratoAulaLivreID;
    }


    /**
     * Gets the nSituacao value for this UpdateMatricula.
     * 
     * @return nSituacao
     */
    public java.lang.String getNSituacao() {
        return nSituacao;
    }


    /**
     * Sets the nSituacao value for this UpdateMatricula.
     * 
     * @param nSituacao
     */
    public void setNSituacao(java.lang.String nSituacao) {
        this.nSituacao = nSituacao;
    }


    /**
     * Gets the nCursoID value for this UpdateMatricula.
     * 
     * @return nCursoID
     */
    public java.lang.String getNCursoID() {
        return nCursoID;
    }


    /**
     * Sets the nCursoID value for this UpdateMatricula.
     * 
     * @param nCursoID
     */
    public void setNCursoID(java.lang.String nCursoID) {
        this.nCursoID = nCursoID;
    }


    /**
     * Gets the nTipoContratoID value for this UpdateMatricula.
     * 
     * @return nTipoContratoID
     */
    public java.lang.String getNTipoContratoID() {
        return nTipoContratoID;
    }


    /**
     * Sets the nTipoContratoID value for this UpdateMatricula.
     * 
     * @param nTipoContratoID
     */
    public void setNTipoContratoID(java.lang.String nTipoContratoID) {
        this.nTipoContratoID = nTipoContratoID;
    }


    /**
     * Gets the dDataInicio value for this UpdateMatricula.
     * 
     * @return dDataInicio
     */
    public java.lang.String getDDataInicio() {
        return dDataInicio;
    }


    /**
     * Sets the dDataInicio value for this UpdateMatricula.
     * 
     * @param dDataInicio
     */
    public void setDDataInicio(java.lang.String dDataInicio) {
        this.dDataInicio = dDataInicio;
    }


    /**
     * Gets the nContratante value for this UpdateMatricula.
     * 
     * @return nContratante
     */
    public java.lang.String getNContratante() {
        return nContratante;
    }


    /**
     * Sets the nContratante value for this UpdateMatricula.
     * 
     * @param nContratante
     */
    public void setNContratante(java.lang.String nContratante) {
        this.nContratante = nContratante;
    }


    /**
     * Gets the dDataTermino value for this UpdateMatricula.
     * 
     * @return dDataTermino
     */
    public java.lang.String getDDataTermino() {
        return dDataTermino;
    }


    /**
     * Sets the dDataTermino value for this UpdateMatricula.
     * 
     * @param dDataTermino
     */
    public void setDDataTermino(java.lang.String dDataTermino) {
        this.dDataTermino = dDataTermino;
    }


    /**
     * Gets the dDataMatricula value for this UpdateMatricula.
     * 
     * @return dDataMatricula
     */
    public java.lang.String getDDataMatricula() {
        return dDataMatricula;
    }


    /**
     * Sets the dDataMatricula value for this UpdateMatricula.
     * 
     * @param dDataMatricula
     */
    public void setDDataMatricula(java.lang.String dDataMatricula) {
        this.dDataMatricula = dDataMatricula;
    }


    /**
     * Gets the nModulo value for this UpdateMatricula.
     * 
     * @return nModulo
     */
    public java.lang.String getNModulo() {
        return nModulo;
    }


    /**
     * Sets the nModulo value for this UpdateMatricula.
     * 
     * @param nModulo
     */
    public void setNModulo(java.lang.String nModulo) {
        this.nModulo = nModulo;
    }


    /**
     * Gets the sDisciplinasMatricular value for this UpdateMatricula.
     * 
     * @return sDisciplinasMatricular
     */
    public java.lang.String getSDisciplinasMatricular() {
        return sDisciplinasMatricular;
    }


    /**
     * Sets the sDisciplinasMatricular value for this UpdateMatricula.
     * 
     * @param sDisciplinasMatricular
     */
    public void setSDisciplinasMatricular(java.lang.String sDisciplinasMatricular) {
        this.sDisciplinasMatricular = sDisciplinasMatricular;
    }


    /**
     * Gets the sDisciplinasRemover value for this UpdateMatricula.
     * 
     * @return sDisciplinasRemover
     */
    public java.lang.String getSDisciplinasRemover() {
        return sDisciplinasRemover;
    }


    /**
     * Sets the sDisciplinasRemover value for this UpdateMatricula.
     * 
     * @param sDisciplinasRemover
     */
    public void setSDisciplinasRemover(java.lang.String sDisciplinasRemover) {
        this.sDisciplinasRemover = sDisciplinasRemover;
    }


    /**
     * Gets the sObservacao value for this UpdateMatricula.
     * 
     * @return sObservacao
     */
    public java.lang.String getSObservacao() {
        return sObservacao;
    }


    /**
     * Sets the sObservacao value for this UpdateMatricula.
     * 
     * @param sObservacao
     */
    public void setSObservacao(java.lang.String sObservacao) {
        this.sObservacao = sObservacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateMatricula)) return false;
        UpdateMatricula other = (UpdateMatricula) obj;
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
            ((this.nContratoID==null && other.getNContratoID()==null) || 
             (this.nContratoID!=null &&
              this.nContratoID.equals(other.getNContratoID()))) &&
            ((this.nContratoAulaLivreID==null && other.getNContratoAulaLivreID()==null) || 
             (this.nContratoAulaLivreID!=null &&
              this.nContratoAulaLivreID.equals(other.getNContratoAulaLivreID()))) &&
            ((this.nSituacao==null && other.getNSituacao()==null) || 
             (this.nSituacao!=null &&
              this.nSituacao.equals(other.getNSituacao()))) &&
            ((this.nCursoID==null && other.getNCursoID()==null) || 
             (this.nCursoID!=null &&
              this.nCursoID.equals(other.getNCursoID()))) &&
            ((this.nTipoContratoID==null && other.getNTipoContratoID()==null) || 
             (this.nTipoContratoID!=null &&
              this.nTipoContratoID.equals(other.getNTipoContratoID()))) &&
            ((this.dDataInicio==null && other.getDDataInicio()==null) || 
             (this.dDataInicio!=null &&
              this.dDataInicio.equals(other.getDDataInicio()))) &&
            ((this.nContratante==null && other.getNContratante()==null) || 
             (this.nContratante!=null &&
              this.nContratante.equals(other.getNContratante()))) &&
            ((this.dDataTermino==null && other.getDDataTermino()==null) || 
             (this.dDataTermino!=null &&
              this.dDataTermino.equals(other.getDDataTermino()))) &&
            ((this.dDataMatricula==null && other.getDDataMatricula()==null) || 
             (this.dDataMatricula!=null &&
              this.dDataMatricula.equals(other.getDDataMatricula()))) &&
            ((this.nModulo==null && other.getNModulo()==null) || 
             (this.nModulo!=null &&
              this.nModulo.equals(other.getNModulo()))) &&
            ((this.sDisciplinasMatricular==null && other.getSDisciplinasMatricular()==null) || 
             (this.sDisciplinasMatricular!=null &&
              this.sDisciplinasMatricular.equals(other.getSDisciplinasMatricular()))) &&
            ((this.sDisciplinasRemover==null && other.getSDisciplinasRemover()==null) || 
             (this.sDisciplinasRemover!=null &&
              this.sDisciplinasRemover.equals(other.getSDisciplinasRemover()))) &&
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
        if (getNContratoID() != null) {
            _hashCode += getNContratoID().hashCode();
        }
        if (getNContratoAulaLivreID() != null) {
            _hashCode += getNContratoAulaLivreID().hashCode();
        }
        if (getNSituacao() != null) {
            _hashCode += getNSituacao().hashCode();
        }
        if (getNCursoID() != null) {
            _hashCode += getNCursoID().hashCode();
        }
        if (getNTipoContratoID() != null) {
            _hashCode += getNTipoContratoID().hashCode();
        }
        if (getDDataInicio() != null) {
            _hashCode += getDDataInicio().hashCode();
        }
        if (getNContratante() != null) {
            _hashCode += getNContratante().hashCode();
        }
        if (getDDataTermino() != null) {
            _hashCode += getDDataTermino().hashCode();
        }
        if (getDDataMatricula() != null) {
            _hashCode += getDDataMatricula().hashCode();
        }
        if (getNModulo() != null) {
            _hashCode += getNModulo().hashCode();
        }
        if (getSDisciplinasMatricular() != null) {
            _hashCode += getSDisciplinasMatricular().hashCode();
        }
        if (getSDisciplinasRemover() != null) {
            _hashCode += getSDisciplinasRemover().hashCode();
        }
        if (getSObservacao() != null) {
            _hashCode += getSObservacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateMatricula.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateMatricula"));
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
        elemField.setFieldName("NContratoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContratoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NContratoAulaLivreID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContratoAulaLivreID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NSituacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nSituacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NCursoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCursoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NTipoContratoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipoContratoID"));
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
        elemField.setFieldName("NContratante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContratante"));
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
        elemField.setFieldName("SDisciplinasMatricular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDisciplinasMatricular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDisciplinasRemover");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDisciplinasRemover"));
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
