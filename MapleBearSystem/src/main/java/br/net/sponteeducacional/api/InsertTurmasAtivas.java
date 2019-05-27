/**
 * InsertTurmasAtivas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertTurmasAtivas  implements java.io.Serializable {
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

    private int nOrdem;

    private int nModalidadeID;

    private java.util.Calendar dDataTermino;

    private int nSituacao;

    private int nMinAlunos;

    private int nHorarioID;

    public InsertTurmasAtivas() {
    }

    public InsertTurmasAtivas(
           int nCodigoCliente,
           java.lang.String sToken,
           java.lang.String sNome,
           int nCursoId,
           int nAnoLetivo,
           java.lang.String sSigla,
           int nModulo,
           java.util.Calendar dDataInicio,
           int nTipoTurma,
           int nTurno,
           int nOrdem,
           int nModalidadeID,
           java.util.Calendar dDataTermino,
           int nSituacao,
           int nMinAlunos,
           int nHorarioID) {
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
           this.nOrdem = nOrdem;
           this.nModalidadeID = nModalidadeID;
           this.dDataTermino = dDataTermino;
           this.nSituacao = nSituacao;
           this.nMinAlunos = nMinAlunos;
           this.nHorarioID = nHorarioID;
    }


    /**
     * Gets the nCodigoCliente value for this InsertTurmasAtivas.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this InsertTurmasAtivas.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this InsertTurmasAtivas.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this InsertTurmasAtivas.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the sNome value for this InsertTurmasAtivas.
     * 
     * @return sNome
     */
    public java.lang.String getSNome() {
        return sNome;
    }


    /**
     * Sets the sNome value for this InsertTurmasAtivas.
     * 
     * @param sNome
     */
    public void setSNome(java.lang.String sNome) {
        this.sNome = sNome;
    }


    /**
     * Gets the nCursoId value for this InsertTurmasAtivas.
     * 
     * @return nCursoId
     */
    public int getNCursoId() {
        return nCursoId;
    }


    /**
     * Sets the nCursoId value for this InsertTurmasAtivas.
     * 
     * @param nCursoId
     */
    public void setNCursoId(int nCursoId) {
        this.nCursoId = nCursoId;
    }


    /**
     * Gets the nAnoLetivo value for this InsertTurmasAtivas.
     * 
     * @return nAnoLetivo
     */
    public int getNAnoLetivo() {
        return nAnoLetivo;
    }


    /**
     * Sets the nAnoLetivo value for this InsertTurmasAtivas.
     * 
     * @param nAnoLetivo
     */
    public void setNAnoLetivo(int nAnoLetivo) {
        this.nAnoLetivo = nAnoLetivo;
    }


    /**
     * Gets the sSigla value for this InsertTurmasAtivas.
     * 
     * @return sSigla
     */
    public java.lang.String getSSigla() {
        return sSigla;
    }


    /**
     * Sets the sSigla value for this InsertTurmasAtivas.
     * 
     * @param sSigla
     */
    public void setSSigla(java.lang.String sSigla) {
        this.sSigla = sSigla;
    }


    /**
     * Gets the nModulo value for this InsertTurmasAtivas.
     * 
     * @return nModulo
     */
    public int getNModulo() {
        return nModulo;
    }


    /**
     * Sets the nModulo value for this InsertTurmasAtivas.
     * 
     * @param nModulo
     */
    public void setNModulo(int nModulo) {
        this.nModulo = nModulo;
    }


    /**
     * Gets the dDataInicio value for this InsertTurmasAtivas.
     * 
     * @return dDataInicio
     */
    public java.util.Calendar getDDataInicio() {
        return dDataInicio;
    }


    /**
     * Sets the dDataInicio value for this InsertTurmasAtivas.
     * 
     * @param dDataInicio
     */
    public void setDDataInicio(java.util.Calendar dDataInicio) {
        this.dDataInicio = dDataInicio;
    }


    /**
     * Gets the nTipoTurma value for this InsertTurmasAtivas.
     * 
     * @return nTipoTurma
     */
    public int getNTipoTurma() {
        return nTipoTurma;
    }


    /**
     * Sets the nTipoTurma value for this InsertTurmasAtivas.
     * 
     * @param nTipoTurma
     */
    public void setNTipoTurma(int nTipoTurma) {
        this.nTipoTurma = nTipoTurma;
    }


    /**
     * Gets the nTurno value for this InsertTurmasAtivas.
     * 
     * @return nTurno
     */
    public int getNTurno() {
        return nTurno;
    }


    /**
     * Sets the nTurno value for this InsertTurmasAtivas.
     * 
     * @param nTurno
     */
    public void setNTurno(int nTurno) {
        this.nTurno = nTurno;
    }


    /**
     * Gets the nOrdem value for this InsertTurmasAtivas.
     * 
     * @return nOrdem
     */
    public int getNOrdem() {
        return nOrdem;
    }


    /**
     * Sets the nOrdem value for this InsertTurmasAtivas.
     * 
     * @param nOrdem
     */
    public void setNOrdem(int nOrdem) {
        this.nOrdem = nOrdem;
    }


    /**
     * Gets the nModalidadeID value for this InsertTurmasAtivas.
     * 
     * @return nModalidadeID
     */
    public int getNModalidadeID() {
        return nModalidadeID;
    }


    /**
     * Sets the nModalidadeID value for this InsertTurmasAtivas.
     * 
     * @param nModalidadeID
     */
    public void setNModalidadeID(int nModalidadeID) {
        this.nModalidadeID = nModalidadeID;
    }


    /**
     * Gets the dDataTermino value for this InsertTurmasAtivas.
     * 
     * @return dDataTermino
     */
    public java.util.Calendar getDDataTermino() {
        return dDataTermino;
    }


    /**
     * Sets the dDataTermino value for this InsertTurmasAtivas.
     * 
     * @param dDataTermino
     */
    public void setDDataTermino(java.util.Calendar dDataTermino) {
        this.dDataTermino = dDataTermino;
    }


    /**
     * Gets the nSituacao value for this InsertTurmasAtivas.
     * 
     * @return nSituacao
     */
    public int getNSituacao() {
        return nSituacao;
    }


    /**
     * Sets the nSituacao value for this InsertTurmasAtivas.
     * 
     * @param nSituacao
     */
    public void setNSituacao(int nSituacao) {
        this.nSituacao = nSituacao;
    }


    /**
     * Gets the nMinAlunos value for this InsertTurmasAtivas.
     * 
     * @return nMinAlunos
     */
    public int getNMinAlunos() {
        return nMinAlunos;
    }


    /**
     * Sets the nMinAlunos value for this InsertTurmasAtivas.
     * 
     * @param nMinAlunos
     */
    public void setNMinAlunos(int nMinAlunos) {
        this.nMinAlunos = nMinAlunos;
    }


    /**
     * Gets the nHorarioID value for this InsertTurmasAtivas.
     * 
     * @return nHorarioID
     */
    public int getNHorarioID() {
        return nHorarioID;
    }


    /**
     * Sets the nHorarioID value for this InsertTurmasAtivas.
     * 
     * @param nHorarioID
     */
    public void setNHorarioID(int nHorarioID) {
        this.nHorarioID = nHorarioID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertTurmasAtivas)) return false;
        InsertTurmasAtivas other = (InsertTurmasAtivas) obj;
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
            this.nTurno == other.getNTurno() &&
            this.nOrdem == other.getNOrdem() &&
            this.nModalidadeID == other.getNModalidadeID() &&
            ((this.dDataTermino==null && other.getDDataTermino()==null) || 
             (this.dDataTermino!=null &&
              this.dDataTermino.equals(other.getDDataTermino()))) &&
            this.nSituacao == other.getNSituacao() &&
            this.nMinAlunos == other.getNMinAlunos() &&
            this.nHorarioID == other.getNHorarioID();
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
        _hashCode += getNOrdem();
        _hashCode += getNModalidadeID();
        if (getDDataTermino() != null) {
            _hashCode += getDDataTermino().hashCode();
        }
        _hashCode += getNSituacao();
        _hashCode += getNMinAlunos();
        _hashCode += getNHorarioID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertTurmasAtivas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertTurmasAtivas"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOrdem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nOrdem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NModalidadeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModalidadeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DDataTermino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataTermino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NSituacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nSituacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NMinAlunos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nMinAlunos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NHorarioID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nHorarioID"));
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
