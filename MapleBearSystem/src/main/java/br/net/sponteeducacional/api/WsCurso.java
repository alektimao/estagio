/**
 * WsCurso.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsCurso  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private java.lang.String nome;

    private int cursoID;

    private java.lang.String sigla;

    private java.lang.String situacao;

    private java.lang.String serie;

    private java.lang.String tipoCurso;

    private int numeroModulos;

    private int tipoCursoID;

    private java.lang.String modular;

    private br.net.sponteeducacional.api.WsDisciplinas[] disciplinas;

    public WsCurso() {
    }

    public WsCurso(
           java.lang.String retornoOperacao,
           java.lang.String nome,
           int cursoID,
           java.lang.String sigla,
           java.lang.String situacao,
           java.lang.String serie,
           java.lang.String tipoCurso,
           int numeroModulos,
           int tipoCursoID,
           java.lang.String modular,
           br.net.sponteeducacional.api.WsDisciplinas[] disciplinas) {
           this.retornoOperacao = retornoOperacao;
           this.nome = nome;
           this.cursoID = cursoID;
           this.sigla = sigla;
           this.situacao = situacao;
           this.serie = serie;
           this.tipoCurso = tipoCurso;
           this.numeroModulos = numeroModulos;
           this.tipoCursoID = tipoCursoID;
           this.modular = modular;
           this.disciplinas = disciplinas;
    }


    /**
     * Gets the retornoOperacao value for this WsCurso.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsCurso.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the nome value for this WsCurso.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this WsCurso.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the cursoID value for this WsCurso.
     * 
     * @return cursoID
     */
    public int getCursoID() {
        return cursoID;
    }


    /**
     * Sets the cursoID value for this WsCurso.
     * 
     * @param cursoID
     */
    public void setCursoID(int cursoID) {
        this.cursoID = cursoID;
    }


    /**
     * Gets the sigla value for this WsCurso.
     * 
     * @return sigla
     */
    public java.lang.String getSigla() {
        return sigla;
    }


    /**
     * Sets the sigla value for this WsCurso.
     * 
     * @param sigla
     */
    public void setSigla(java.lang.String sigla) {
        this.sigla = sigla;
    }


    /**
     * Gets the situacao value for this WsCurso.
     * 
     * @return situacao
     */
    public java.lang.String getSituacao() {
        return situacao;
    }


    /**
     * Sets the situacao value for this WsCurso.
     * 
     * @param situacao
     */
    public void setSituacao(java.lang.String situacao) {
        this.situacao = situacao;
    }


    /**
     * Gets the serie value for this WsCurso.
     * 
     * @return serie
     */
    public java.lang.String getSerie() {
        return serie;
    }


    /**
     * Sets the serie value for this WsCurso.
     * 
     * @param serie
     */
    public void setSerie(java.lang.String serie) {
        this.serie = serie;
    }


    /**
     * Gets the tipoCurso value for this WsCurso.
     * 
     * @return tipoCurso
     */
    public java.lang.String getTipoCurso() {
        return tipoCurso;
    }


    /**
     * Sets the tipoCurso value for this WsCurso.
     * 
     * @param tipoCurso
     */
    public void setTipoCurso(java.lang.String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }


    /**
     * Gets the numeroModulos value for this WsCurso.
     * 
     * @return numeroModulos
     */
    public int getNumeroModulos() {
        return numeroModulos;
    }


    /**
     * Sets the numeroModulos value for this WsCurso.
     * 
     * @param numeroModulos
     */
    public void setNumeroModulos(int numeroModulos) {
        this.numeroModulos = numeroModulos;
    }


    /**
     * Gets the tipoCursoID value for this WsCurso.
     * 
     * @return tipoCursoID
     */
    public int getTipoCursoID() {
        return tipoCursoID;
    }


    /**
     * Sets the tipoCursoID value for this WsCurso.
     * 
     * @param tipoCursoID
     */
    public void setTipoCursoID(int tipoCursoID) {
        this.tipoCursoID = tipoCursoID;
    }


    /**
     * Gets the modular value for this WsCurso.
     * 
     * @return modular
     */
    public java.lang.String getModular() {
        return modular;
    }


    /**
     * Sets the modular value for this WsCurso.
     * 
     * @param modular
     */
    public void setModular(java.lang.String modular) {
        this.modular = modular;
    }


    /**
     * Gets the disciplinas value for this WsCurso.
     * 
     * @return disciplinas
     */
    public br.net.sponteeducacional.api.WsDisciplinas[] getDisciplinas() {
        return disciplinas;
    }


    /**
     * Sets the disciplinas value for this WsCurso.
     * 
     * @param disciplinas
     */
    public void setDisciplinas(br.net.sponteeducacional.api.WsDisciplinas[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsCurso)) return false;
        WsCurso other = (WsCurso) obj;
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
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            this.cursoID == other.getCursoID() &&
            ((this.sigla==null && other.getSigla()==null) || 
             (this.sigla!=null &&
              this.sigla.equals(other.getSigla()))) &&
            ((this.situacao==null && other.getSituacao()==null) || 
             (this.situacao!=null &&
              this.situacao.equals(other.getSituacao()))) &&
            ((this.serie==null && other.getSerie()==null) || 
             (this.serie!=null &&
              this.serie.equals(other.getSerie()))) &&
            ((this.tipoCurso==null && other.getTipoCurso()==null) || 
             (this.tipoCurso!=null &&
              this.tipoCurso.equals(other.getTipoCurso()))) &&
            this.numeroModulos == other.getNumeroModulos() &&
            this.tipoCursoID == other.getTipoCursoID() &&
            ((this.modular==null && other.getModular()==null) || 
             (this.modular!=null &&
              this.modular.equals(other.getModular()))) &&
            ((this.disciplinas==null && other.getDisciplinas()==null) || 
             (this.disciplinas!=null &&
              java.util.Arrays.equals(this.disciplinas, other.getDisciplinas())));
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        _hashCode += getCursoID();
        if (getSigla() != null) {
            _hashCode += getSigla().hashCode();
        }
        if (getSituacao() != null) {
            _hashCode += getSituacao().hashCode();
        }
        if (getSerie() != null) {
            _hashCode += getSerie().hashCode();
        }
        if (getTipoCurso() != null) {
            _hashCode += getTipoCurso().hashCode();
        }
        _hashCode += getNumeroModulos();
        _hashCode += getTipoCursoID();
        if (getModular() != null) {
            _hashCode += getModular().hashCode();
        }
        if (getDisciplinas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisciplinas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisciplinas(), i);
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
        new org.apache.axis.description.TypeDesc(WsCurso.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCurso"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cursoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CursoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigla");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Sigla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Situacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Serie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCurso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TipoCurso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroModulos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroModulos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCursoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TipoCursoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Modular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disciplinas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Disciplinas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplinas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplinas"));
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
