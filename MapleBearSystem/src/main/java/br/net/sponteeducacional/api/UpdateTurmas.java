/**
 * UpdateTurmas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class UpdateTurmas  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private int nTurmaID;

    private java.lang.String sNome;

    private java.lang.String sSigla;

    private java.lang.String nOrdem;

    private java.lang.String nModalidadeID;

    private java.lang.String sDataInicio;

    private java.lang.String sDataTermino;

    private java.lang.String nSituacao;

    private java.lang.String nMinimoAlunos;

    private java.lang.String nMaximoAlunos;

    private java.lang.String nTurnoID;

    private java.lang.String nHorarioID;

    public UpdateTurmas() {
    }

    public UpdateTurmas(
           int nCodigoCliente,
           java.lang.String sToken,
           int nTurmaID,
           java.lang.String sNome,
           java.lang.String sSigla,
           java.lang.String nOrdem,
           java.lang.String nModalidadeID,
           java.lang.String sDataInicio,
           java.lang.String sDataTermino,
           java.lang.String nSituacao,
           java.lang.String nMinimoAlunos,
           java.lang.String nMaximoAlunos,
           java.lang.String nTurnoID,
           java.lang.String nHorarioID) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.nTurmaID = nTurmaID;
           this.sNome = sNome;
           this.sSigla = sSigla;
           this.nOrdem = nOrdem;
           this.nModalidadeID = nModalidadeID;
           this.sDataInicio = sDataInicio;
           this.sDataTermino = sDataTermino;
           this.nSituacao = nSituacao;
           this.nMinimoAlunos = nMinimoAlunos;
           this.nMaximoAlunos = nMaximoAlunos;
           this.nTurnoID = nTurnoID;
           this.nHorarioID = nHorarioID;
    }


    /**
     * Gets the nCodigoCliente value for this UpdateTurmas.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this UpdateTurmas.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this UpdateTurmas.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this UpdateTurmas.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the nTurmaID value for this UpdateTurmas.
     * 
     * @return nTurmaID
     */
    public int getNTurmaID() {
        return nTurmaID;
    }


    /**
     * Sets the nTurmaID value for this UpdateTurmas.
     * 
     * @param nTurmaID
     */
    public void setNTurmaID(int nTurmaID) {
        this.nTurmaID = nTurmaID;
    }


    /**
     * Gets the sNome value for this UpdateTurmas.
     * 
     * @return sNome
     */
    public java.lang.String getSNome() {
        return sNome;
    }


    /**
     * Sets the sNome value for this UpdateTurmas.
     * 
     * @param sNome
     */
    public void setSNome(java.lang.String sNome) {
        this.sNome = sNome;
    }


    /**
     * Gets the sSigla value for this UpdateTurmas.
     * 
     * @return sSigla
     */
    public java.lang.String getSSigla() {
        return sSigla;
    }


    /**
     * Sets the sSigla value for this UpdateTurmas.
     * 
     * @param sSigla
     */
    public void setSSigla(java.lang.String sSigla) {
        this.sSigla = sSigla;
    }


    /**
     * Gets the nOrdem value for this UpdateTurmas.
     * 
     * @return nOrdem
     */
    public java.lang.String getNOrdem() {
        return nOrdem;
    }


    /**
     * Sets the nOrdem value for this UpdateTurmas.
     * 
     * @param nOrdem
     */
    public void setNOrdem(java.lang.String nOrdem) {
        this.nOrdem = nOrdem;
    }


    /**
     * Gets the nModalidadeID value for this UpdateTurmas.
     * 
     * @return nModalidadeID
     */
    public java.lang.String getNModalidadeID() {
        return nModalidadeID;
    }


    /**
     * Sets the nModalidadeID value for this UpdateTurmas.
     * 
     * @param nModalidadeID
     */
    public void setNModalidadeID(java.lang.String nModalidadeID) {
        this.nModalidadeID = nModalidadeID;
    }


    /**
     * Gets the sDataInicio value for this UpdateTurmas.
     * 
     * @return sDataInicio
     */
    public java.lang.String getSDataInicio() {
        return sDataInicio;
    }


    /**
     * Sets the sDataInicio value for this UpdateTurmas.
     * 
     * @param sDataInicio
     */
    public void setSDataInicio(java.lang.String sDataInicio) {
        this.sDataInicio = sDataInicio;
    }


    /**
     * Gets the sDataTermino value for this UpdateTurmas.
     * 
     * @return sDataTermino
     */
    public java.lang.String getSDataTermino() {
        return sDataTermino;
    }


    /**
     * Sets the sDataTermino value for this UpdateTurmas.
     * 
     * @param sDataTermino
     */
    public void setSDataTermino(java.lang.String sDataTermino) {
        this.sDataTermino = sDataTermino;
    }


    /**
     * Gets the nSituacao value for this UpdateTurmas.
     * 
     * @return nSituacao
     */
    public java.lang.String getNSituacao() {
        return nSituacao;
    }


    /**
     * Sets the nSituacao value for this UpdateTurmas.
     * 
     * @param nSituacao
     */
    public void setNSituacao(java.lang.String nSituacao) {
        this.nSituacao = nSituacao;
    }


    /**
     * Gets the nMinimoAlunos value for this UpdateTurmas.
     * 
     * @return nMinimoAlunos
     */
    public java.lang.String getNMinimoAlunos() {
        return nMinimoAlunos;
    }


    /**
     * Sets the nMinimoAlunos value for this UpdateTurmas.
     * 
     * @param nMinimoAlunos
     */
    public void setNMinimoAlunos(java.lang.String nMinimoAlunos) {
        this.nMinimoAlunos = nMinimoAlunos;
    }


    /**
     * Gets the nMaximoAlunos value for this UpdateTurmas.
     * 
     * @return nMaximoAlunos
     */
    public java.lang.String getNMaximoAlunos() {
        return nMaximoAlunos;
    }


    /**
     * Sets the nMaximoAlunos value for this UpdateTurmas.
     * 
     * @param nMaximoAlunos
     */
    public void setNMaximoAlunos(java.lang.String nMaximoAlunos) {
        this.nMaximoAlunos = nMaximoAlunos;
    }


    /**
     * Gets the nTurnoID value for this UpdateTurmas.
     * 
     * @return nTurnoID
     */
    public java.lang.String getNTurnoID() {
        return nTurnoID;
    }


    /**
     * Sets the nTurnoID value for this UpdateTurmas.
     * 
     * @param nTurnoID
     */
    public void setNTurnoID(java.lang.String nTurnoID) {
        this.nTurnoID = nTurnoID;
    }


    /**
     * Gets the nHorarioID value for this UpdateTurmas.
     * 
     * @return nHorarioID
     */
    public java.lang.String getNHorarioID() {
        return nHorarioID;
    }


    /**
     * Sets the nHorarioID value for this UpdateTurmas.
     * 
     * @param nHorarioID
     */
    public void setNHorarioID(java.lang.String nHorarioID) {
        this.nHorarioID = nHorarioID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateTurmas)) return false;
        UpdateTurmas other = (UpdateTurmas) obj;
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
            ((this.sNome==null && other.getSNome()==null) || 
             (this.sNome!=null &&
              this.sNome.equals(other.getSNome()))) &&
            ((this.sSigla==null && other.getSSigla()==null) || 
             (this.sSigla!=null &&
              this.sSigla.equals(other.getSSigla()))) &&
            ((this.nOrdem==null && other.getNOrdem()==null) || 
             (this.nOrdem!=null &&
              this.nOrdem.equals(other.getNOrdem()))) &&
            ((this.nModalidadeID==null && other.getNModalidadeID()==null) || 
             (this.nModalidadeID!=null &&
              this.nModalidadeID.equals(other.getNModalidadeID()))) &&
            ((this.sDataInicio==null && other.getSDataInicio()==null) || 
             (this.sDataInicio!=null &&
              this.sDataInicio.equals(other.getSDataInicio()))) &&
            ((this.sDataTermino==null && other.getSDataTermino()==null) || 
             (this.sDataTermino!=null &&
              this.sDataTermino.equals(other.getSDataTermino()))) &&
            ((this.nSituacao==null && other.getNSituacao()==null) || 
             (this.nSituacao!=null &&
              this.nSituacao.equals(other.getNSituacao()))) &&
            ((this.nMinimoAlunos==null && other.getNMinimoAlunos()==null) || 
             (this.nMinimoAlunos!=null &&
              this.nMinimoAlunos.equals(other.getNMinimoAlunos()))) &&
            ((this.nMaximoAlunos==null && other.getNMaximoAlunos()==null) || 
             (this.nMaximoAlunos!=null &&
              this.nMaximoAlunos.equals(other.getNMaximoAlunos()))) &&
            ((this.nTurnoID==null && other.getNTurnoID()==null) || 
             (this.nTurnoID!=null &&
              this.nTurnoID.equals(other.getNTurnoID()))) &&
            ((this.nHorarioID==null && other.getNHorarioID()==null) || 
             (this.nHorarioID!=null &&
              this.nHorarioID.equals(other.getNHorarioID())));
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
        if (getSNome() != null) {
            _hashCode += getSNome().hashCode();
        }
        if (getSSigla() != null) {
            _hashCode += getSSigla().hashCode();
        }
        if (getNOrdem() != null) {
            _hashCode += getNOrdem().hashCode();
        }
        if (getNModalidadeID() != null) {
            _hashCode += getNModalidadeID().hashCode();
        }
        if (getSDataInicio() != null) {
            _hashCode += getSDataInicio().hashCode();
        }
        if (getSDataTermino() != null) {
            _hashCode += getSDataTermino().hashCode();
        }
        if (getNSituacao() != null) {
            _hashCode += getNSituacao().hashCode();
        }
        if (getNMinimoAlunos() != null) {
            _hashCode += getNMinimoAlunos().hashCode();
        }
        if (getNMaximoAlunos() != null) {
            _hashCode += getNMaximoAlunos().hashCode();
        }
        if (getNTurnoID() != null) {
            _hashCode += getNTurnoID().hashCode();
        }
        if (getNHorarioID() != null) {
            _hashCode += getNHorarioID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateTurmas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateTurmas"));
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
        elemField.setFieldName("SNome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("NOrdem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nOrdem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NModalidadeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModalidadeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDataInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDataInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDataTermino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDataTermino"));
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
        elemField.setFieldName("NMinimoAlunos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nMinimoAlunos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NMaximoAlunos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nMaximoAlunos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NTurnoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurnoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NHorarioID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nHorarioID"));
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
