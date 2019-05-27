/**
 * WsSistemaAvaliacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsSistemaAvaliacao  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int sistemaAvaliacaoID;

    private java.lang.String nomeSistemaAvaliacao;

    private java.lang.String formaAvaliacao;

    private java.lang.String tipoAvaliacao;

    private java.lang.String descricaoPeriodo;

    private double mediaMinima;

    private double frequenciaMinima;

    private java.lang.String formaRecuperacao;

    private int usaExameFinal;

    private int usaHabilidadeDescritiva;

    private java.lang.String formaLancamentoHabDesc;

    private java.lang.String sintese;

    private int padrao;

    private br.net.sponteeducacional.api.WsConceito[] conceitos;

    public WsSistemaAvaliacao() {
    }

    public WsSistemaAvaliacao(
           java.lang.String retornoOperacao,
           int sistemaAvaliacaoID,
           java.lang.String nomeSistemaAvaliacao,
           java.lang.String formaAvaliacao,
           java.lang.String tipoAvaliacao,
           java.lang.String descricaoPeriodo,
           double mediaMinima,
           double frequenciaMinima,
           java.lang.String formaRecuperacao,
           int usaExameFinal,
           int usaHabilidadeDescritiva,
           java.lang.String formaLancamentoHabDesc,
           java.lang.String sintese,
           int padrao,
           br.net.sponteeducacional.api.WsConceito[] conceitos) {
           this.retornoOperacao = retornoOperacao;
           this.sistemaAvaliacaoID = sistemaAvaliacaoID;
           this.nomeSistemaAvaliacao = nomeSistemaAvaliacao;
           this.formaAvaliacao = formaAvaliacao;
           this.tipoAvaliacao = tipoAvaliacao;
           this.descricaoPeriodo = descricaoPeriodo;
           this.mediaMinima = mediaMinima;
           this.frequenciaMinima = frequenciaMinima;
           this.formaRecuperacao = formaRecuperacao;
           this.usaExameFinal = usaExameFinal;
           this.usaHabilidadeDescritiva = usaHabilidadeDescritiva;
           this.formaLancamentoHabDesc = formaLancamentoHabDesc;
           this.sintese = sintese;
           this.padrao = padrao;
           this.conceitos = conceitos;
    }


    /**
     * Gets the retornoOperacao value for this WsSistemaAvaliacao.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsSistemaAvaliacao.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the sistemaAvaliacaoID value for this WsSistemaAvaliacao.
     * 
     * @return sistemaAvaliacaoID
     */
    public int getSistemaAvaliacaoID() {
        return sistemaAvaliacaoID;
    }


    /**
     * Sets the sistemaAvaliacaoID value for this WsSistemaAvaliacao.
     * 
     * @param sistemaAvaliacaoID
     */
    public void setSistemaAvaliacaoID(int sistemaAvaliacaoID) {
        this.sistemaAvaliacaoID = sistemaAvaliacaoID;
    }


    /**
     * Gets the nomeSistemaAvaliacao value for this WsSistemaAvaliacao.
     * 
     * @return nomeSistemaAvaliacao
     */
    public java.lang.String getNomeSistemaAvaliacao() {
        return nomeSistemaAvaliacao;
    }


    /**
     * Sets the nomeSistemaAvaliacao value for this WsSistemaAvaliacao.
     * 
     * @param nomeSistemaAvaliacao
     */
    public void setNomeSistemaAvaliacao(java.lang.String nomeSistemaAvaliacao) {
        this.nomeSistemaAvaliacao = nomeSistemaAvaliacao;
    }


    /**
     * Gets the formaAvaliacao value for this WsSistemaAvaliacao.
     * 
     * @return formaAvaliacao
     */
    public java.lang.String getFormaAvaliacao() {
        return formaAvaliacao;
    }


    /**
     * Sets the formaAvaliacao value for this WsSistemaAvaliacao.
     * 
     * @param formaAvaliacao
     */
    public void setFormaAvaliacao(java.lang.String formaAvaliacao) {
        this.formaAvaliacao = formaAvaliacao;
    }


    /**
     * Gets the tipoAvaliacao value for this WsSistemaAvaliacao.
     * 
     * @return tipoAvaliacao
     */
    public java.lang.String getTipoAvaliacao() {
        return tipoAvaliacao;
    }


    /**
     * Sets the tipoAvaliacao value for this WsSistemaAvaliacao.
     * 
     * @param tipoAvaliacao
     */
    public void setTipoAvaliacao(java.lang.String tipoAvaliacao) {
        this.tipoAvaliacao = tipoAvaliacao;
    }


    /**
     * Gets the descricaoPeriodo value for this WsSistemaAvaliacao.
     * 
     * @return descricaoPeriodo
     */
    public java.lang.String getDescricaoPeriodo() {
        return descricaoPeriodo;
    }


    /**
     * Sets the descricaoPeriodo value for this WsSistemaAvaliacao.
     * 
     * @param descricaoPeriodo
     */
    public void setDescricaoPeriodo(java.lang.String descricaoPeriodo) {
        this.descricaoPeriodo = descricaoPeriodo;
    }


    /**
     * Gets the mediaMinima value for this WsSistemaAvaliacao.
     * 
     * @return mediaMinima
     */
    public double getMediaMinima() {
        return mediaMinima;
    }


    /**
     * Sets the mediaMinima value for this WsSistemaAvaliacao.
     * 
     * @param mediaMinima
     */
    public void setMediaMinima(double mediaMinima) {
        this.mediaMinima = mediaMinima;
    }


    /**
     * Gets the frequenciaMinima value for this WsSistemaAvaliacao.
     * 
     * @return frequenciaMinima
     */
    public double getFrequenciaMinima() {
        return frequenciaMinima;
    }


    /**
     * Sets the frequenciaMinima value for this WsSistemaAvaliacao.
     * 
     * @param frequenciaMinima
     */
    public void setFrequenciaMinima(double frequenciaMinima) {
        this.frequenciaMinima = frequenciaMinima;
    }


    /**
     * Gets the formaRecuperacao value for this WsSistemaAvaliacao.
     * 
     * @return formaRecuperacao
     */
    public java.lang.String getFormaRecuperacao() {
        return formaRecuperacao;
    }


    /**
     * Sets the formaRecuperacao value for this WsSistemaAvaliacao.
     * 
     * @param formaRecuperacao
     */
    public void setFormaRecuperacao(java.lang.String formaRecuperacao) {
        this.formaRecuperacao = formaRecuperacao;
    }


    /**
     * Gets the usaExameFinal value for this WsSistemaAvaliacao.
     * 
     * @return usaExameFinal
     */
    public int getUsaExameFinal() {
        return usaExameFinal;
    }


    /**
     * Sets the usaExameFinal value for this WsSistemaAvaliacao.
     * 
     * @param usaExameFinal
     */
    public void setUsaExameFinal(int usaExameFinal) {
        this.usaExameFinal = usaExameFinal;
    }


    /**
     * Gets the usaHabilidadeDescritiva value for this WsSistemaAvaliacao.
     * 
     * @return usaHabilidadeDescritiva
     */
    public int getUsaHabilidadeDescritiva() {
        return usaHabilidadeDescritiva;
    }


    /**
     * Sets the usaHabilidadeDescritiva value for this WsSistemaAvaliacao.
     * 
     * @param usaHabilidadeDescritiva
     */
    public void setUsaHabilidadeDescritiva(int usaHabilidadeDescritiva) {
        this.usaHabilidadeDescritiva = usaHabilidadeDescritiva;
    }


    /**
     * Gets the formaLancamentoHabDesc value for this WsSistemaAvaliacao.
     * 
     * @return formaLancamentoHabDesc
     */
    public java.lang.String getFormaLancamentoHabDesc() {
        return formaLancamentoHabDesc;
    }


    /**
     * Sets the formaLancamentoHabDesc value for this WsSistemaAvaliacao.
     * 
     * @param formaLancamentoHabDesc
     */
    public void setFormaLancamentoHabDesc(java.lang.String formaLancamentoHabDesc) {
        this.formaLancamentoHabDesc = formaLancamentoHabDesc;
    }


    /**
     * Gets the sintese value for this WsSistemaAvaliacao.
     * 
     * @return sintese
     */
    public java.lang.String getSintese() {
        return sintese;
    }


    /**
     * Sets the sintese value for this WsSistemaAvaliacao.
     * 
     * @param sintese
     */
    public void setSintese(java.lang.String sintese) {
        this.sintese = sintese;
    }


    /**
     * Gets the padrao value for this WsSistemaAvaliacao.
     * 
     * @return padrao
     */
    public int getPadrao() {
        return padrao;
    }


    /**
     * Sets the padrao value for this WsSistemaAvaliacao.
     * 
     * @param padrao
     */
    public void setPadrao(int padrao) {
        this.padrao = padrao;
    }


    /**
     * Gets the conceitos value for this WsSistemaAvaliacao.
     * 
     * @return conceitos
     */
    public br.net.sponteeducacional.api.WsConceito[] getConceitos() {
        return conceitos;
    }


    /**
     * Sets the conceitos value for this WsSistemaAvaliacao.
     * 
     * @param conceitos
     */
    public void setConceitos(br.net.sponteeducacional.api.WsConceito[] conceitos) {
        this.conceitos = conceitos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsSistemaAvaliacao)) return false;
        WsSistemaAvaliacao other = (WsSistemaAvaliacao) obj;
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
            this.sistemaAvaliacaoID == other.getSistemaAvaliacaoID() &&
            ((this.nomeSistemaAvaliacao==null && other.getNomeSistemaAvaliacao()==null) || 
             (this.nomeSistemaAvaliacao!=null &&
              this.nomeSistemaAvaliacao.equals(other.getNomeSistemaAvaliacao()))) &&
            ((this.formaAvaliacao==null && other.getFormaAvaliacao()==null) || 
             (this.formaAvaliacao!=null &&
              this.formaAvaliacao.equals(other.getFormaAvaliacao()))) &&
            ((this.tipoAvaliacao==null && other.getTipoAvaliacao()==null) || 
             (this.tipoAvaliacao!=null &&
              this.tipoAvaliacao.equals(other.getTipoAvaliacao()))) &&
            ((this.descricaoPeriodo==null && other.getDescricaoPeriodo()==null) || 
             (this.descricaoPeriodo!=null &&
              this.descricaoPeriodo.equals(other.getDescricaoPeriodo()))) &&
            this.mediaMinima == other.getMediaMinima() &&
            this.frequenciaMinima == other.getFrequenciaMinima() &&
            ((this.formaRecuperacao==null && other.getFormaRecuperacao()==null) || 
             (this.formaRecuperacao!=null &&
              this.formaRecuperacao.equals(other.getFormaRecuperacao()))) &&
            this.usaExameFinal == other.getUsaExameFinal() &&
            this.usaHabilidadeDescritiva == other.getUsaHabilidadeDescritiva() &&
            ((this.formaLancamentoHabDesc==null && other.getFormaLancamentoHabDesc()==null) || 
             (this.formaLancamentoHabDesc!=null &&
              this.formaLancamentoHabDesc.equals(other.getFormaLancamentoHabDesc()))) &&
            ((this.sintese==null && other.getSintese()==null) || 
             (this.sintese!=null &&
              this.sintese.equals(other.getSintese()))) &&
            this.padrao == other.getPadrao() &&
            ((this.conceitos==null && other.getConceitos()==null) || 
             (this.conceitos!=null &&
              java.util.Arrays.equals(this.conceitos, other.getConceitos())));
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
        _hashCode += getSistemaAvaliacaoID();
        if (getNomeSistemaAvaliacao() != null) {
            _hashCode += getNomeSistemaAvaliacao().hashCode();
        }
        if (getFormaAvaliacao() != null) {
            _hashCode += getFormaAvaliacao().hashCode();
        }
        if (getTipoAvaliacao() != null) {
            _hashCode += getTipoAvaliacao().hashCode();
        }
        if (getDescricaoPeriodo() != null) {
            _hashCode += getDescricaoPeriodo().hashCode();
        }
        _hashCode += new Double(getMediaMinima()).hashCode();
        _hashCode += new Double(getFrequenciaMinima()).hashCode();
        if (getFormaRecuperacao() != null) {
            _hashCode += getFormaRecuperacao().hashCode();
        }
        _hashCode += getUsaExameFinal();
        _hashCode += getUsaHabilidadeDescritiva();
        if (getFormaLancamentoHabDesc() != null) {
            _hashCode += getFormaLancamentoHabDesc().hashCode();
        }
        if (getSintese() != null) {
            _hashCode += getSintese().hashCode();
        }
        _hashCode += getPadrao();
        if (getConceitos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConceitos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConceitos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsSistemaAvaliacao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsSistemaAvaliacao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemaAvaliacaoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SistemaAvaliacaoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeSistemaAvaliacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeSistemaAvaliacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaAvaliacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "FormaAvaliacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoAvaliacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TipoAvaliacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoPeriodo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DescricaoPeriodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaMinima");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "MediaMinima"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequenciaMinima");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "FrequenciaMinima"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaRecuperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "FormaRecuperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usaExameFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UsaExameFinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usaHabilidadeDescritiva");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UsaHabilidadeDescritiva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaLancamentoHabDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "FormaLancamentoHabDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sintese");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Sintese"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("padrao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Padrao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conceitos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Conceitos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsConceito"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsConceito"));
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
