/**
 * WsMudancaEntreTurmas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsMudancaEntreTurmas  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int mudancaID;

    private java.lang.String alunoID;

    private java.lang.String nomeAluno;

    private java.lang.String situacaoDestino;

    private java.lang.String contratoId;

    private br.net.sponteeducacional.api.WsInfoTurma[] turmaOrigem;

    private br.net.sponteeducacional.api.WsInfoTurma[] turmaDestino;

    private java.lang.String data;

    private java.lang.String observacao;

    public WsMudancaEntreTurmas() {
    }

    public WsMudancaEntreTurmas(
           java.lang.String retornoOperacao,
           int mudancaID,
           java.lang.String alunoID,
           java.lang.String nomeAluno,
           java.lang.String situacaoDestino,
           java.lang.String contratoId,
           br.net.sponteeducacional.api.WsInfoTurma[] turmaOrigem,
           br.net.sponteeducacional.api.WsInfoTurma[] turmaDestino,
           java.lang.String data,
           java.lang.String observacao) {
           this.retornoOperacao = retornoOperacao;
           this.mudancaID = mudancaID;
           this.alunoID = alunoID;
           this.nomeAluno = nomeAluno;
           this.situacaoDestino = situacaoDestino;
           this.contratoId = contratoId;
           this.turmaOrigem = turmaOrigem;
           this.turmaDestino = turmaDestino;
           this.data = data;
           this.observacao = observacao;
    }


    /**
     * Gets the retornoOperacao value for this WsMudancaEntreTurmas.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsMudancaEntreTurmas.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the mudancaID value for this WsMudancaEntreTurmas.
     * 
     * @return mudancaID
     */
    public int getMudancaID() {
        return mudancaID;
    }


    /**
     * Sets the mudancaID value for this WsMudancaEntreTurmas.
     * 
     * @param mudancaID
     */
    public void setMudancaID(int mudancaID) {
        this.mudancaID = mudancaID;
    }


    /**
     * Gets the alunoID value for this WsMudancaEntreTurmas.
     * 
     * @return alunoID
     */
    public java.lang.String getAlunoID() {
        return alunoID;
    }


    /**
     * Sets the alunoID value for this WsMudancaEntreTurmas.
     * 
     * @param alunoID
     */
    public void setAlunoID(java.lang.String alunoID) {
        this.alunoID = alunoID;
    }


    /**
     * Gets the nomeAluno value for this WsMudancaEntreTurmas.
     * 
     * @return nomeAluno
     */
    public java.lang.String getNomeAluno() {
        return nomeAluno;
    }


    /**
     * Sets the nomeAluno value for this WsMudancaEntreTurmas.
     * 
     * @param nomeAluno
     */
    public void setNomeAluno(java.lang.String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }


    /**
     * Gets the situacaoDestino value for this WsMudancaEntreTurmas.
     * 
     * @return situacaoDestino
     */
    public java.lang.String getSituacaoDestino() {
        return situacaoDestino;
    }


    /**
     * Sets the situacaoDestino value for this WsMudancaEntreTurmas.
     * 
     * @param situacaoDestino
     */
    public void setSituacaoDestino(java.lang.String situacaoDestino) {
        this.situacaoDestino = situacaoDestino;
    }


    /**
     * Gets the contratoId value for this WsMudancaEntreTurmas.
     * 
     * @return contratoId
     */
    public java.lang.String getContratoId() {
        return contratoId;
    }


    /**
     * Sets the contratoId value for this WsMudancaEntreTurmas.
     * 
     * @param contratoId
     */
    public void setContratoId(java.lang.String contratoId) {
        this.contratoId = contratoId;
    }


    /**
     * Gets the turmaOrigem value for this WsMudancaEntreTurmas.
     * 
     * @return turmaOrigem
     */
    public br.net.sponteeducacional.api.WsInfoTurma[] getTurmaOrigem() {
        return turmaOrigem;
    }


    /**
     * Sets the turmaOrigem value for this WsMudancaEntreTurmas.
     * 
     * @param turmaOrigem
     */
    public void setTurmaOrigem(br.net.sponteeducacional.api.WsInfoTurma[] turmaOrigem) {
        this.turmaOrigem = turmaOrigem;
    }


    /**
     * Gets the turmaDestino value for this WsMudancaEntreTurmas.
     * 
     * @return turmaDestino
     */
    public br.net.sponteeducacional.api.WsInfoTurma[] getTurmaDestino() {
        return turmaDestino;
    }


    /**
     * Sets the turmaDestino value for this WsMudancaEntreTurmas.
     * 
     * @param turmaDestino
     */
    public void setTurmaDestino(br.net.sponteeducacional.api.WsInfoTurma[] turmaDestino) {
        this.turmaDestino = turmaDestino;
    }


    /**
     * Gets the data value for this WsMudancaEntreTurmas.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this WsMudancaEntreTurmas.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the observacao value for this WsMudancaEntreTurmas.
     * 
     * @return observacao
     */
    public java.lang.String getObservacao() {
        return observacao;
    }


    /**
     * Sets the observacao value for this WsMudancaEntreTurmas.
     * 
     * @param observacao
     */
    public void setObservacao(java.lang.String observacao) {
        this.observacao = observacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsMudancaEntreTurmas)) return false;
        WsMudancaEntreTurmas other = (WsMudancaEntreTurmas) obj;
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
            this.mudancaID == other.getMudancaID() &&
            ((this.alunoID==null && other.getAlunoID()==null) || 
             (this.alunoID!=null &&
              this.alunoID.equals(other.getAlunoID()))) &&
            ((this.nomeAluno==null && other.getNomeAluno()==null) || 
             (this.nomeAluno!=null &&
              this.nomeAluno.equals(other.getNomeAluno()))) &&
            ((this.situacaoDestino==null && other.getSituacaoDestino()==null) || 
             (this.situacaoDestino!=null &&
              this.situacaoDestino.equals(other.getSituacaoDestino()))) &&
            ((this.contratoId==null && other.getContratoId()==null) || 
             (this.contratoId!=null &&
              this.contratoId.equals(other.getContratoId()))) &&
            ((this.turmaOrigem==null && other.getTurmaOrigem()==null) || 
             (this.turmaOrigem!=null &&
              java.util.Arrays.equals(this.turmaOrigem, other.getTurmaOrigem()))) &&
            ((this.turmaDestino==null && other.getTurmaDestino()==null) || 
             (this.turmaDestino!=null &&
              java.util.Arrays.equals(this.turmaDestino, other.getTurmaDestino()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.observacao==null && other.getObservacao()==null) || 
             (this.observacao!=null &&
              this.observacao.equals(other.getObservacao())));
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
        _hashCode += getMudancaID();
        if (getAlunoID() != null) {
            _hashCode += getAlunoID().hashCode();
        }
        if (getNomeAluno() != null) {
            _hashCode += getNomeAluno().hashCode();
        }
        if (getSituacaoDestino() != null) {
            _hashCode += getSituacaoDestino().hashCode();
        }
        if (getContratoId() != null) {
            _hashCode += getContratoId().hashCode();
        }
        if (getTurmaOrigem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTurmaOrigem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTurmaOrigem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTurmaDestino() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTurmaDestino());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTurmaDestino(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getObservacao() != null) {
            _hashCode += getObservacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsMudancaEntreTurmas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMudancaEntreTurmas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mudancaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "MudancaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alunoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AlunoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeAluno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeAluno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacaoDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SituacaoDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contratoId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ContratoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("turmaOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TurmaOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsInfoTurma"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsInfoTurma"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("turmaDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TurmaDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsInfoTurma"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsInfoTurma"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Observacao"));
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
