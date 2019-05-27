/**
 * WSCertificado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WSCertificado  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private java.lang.String valido;

    private java.lang.String aluno;

    private java.lang.String cpf;

    private java.lang.String RG;

    private java.lang.String turma;

    private java.lang.String curso;

    private java.lang.String ano;

    private java.lang.String numeroCertificado;

    public WSCertificado() {
    }

    public WSCertificado(
           java.lang.String retornoOperacao,
           java.lang.String valido,
           java.lang.String aluno,
           java.lang.String cpf,
           java.lang.String RG,
           java.lang.String turma,
           java.lang.String curso,
           java.lang.String ano,
           java.lang.String numeroCertificado) {
           this.retornoOperacao = retornoOperacao;
           this.valido = valido;
           this.aluno = aluno;
           this.cpf = cpf;
           this.RG = RG;
           this.turma = turma;
           this.curso = curso;
           this.ano = ano;
           this.numeroCertificado = numeroCertificado;
    }


    /**
     * Gets the retornoOperacao value for this WSCertificado.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WSCertificado.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the valido value for this WSCertificado.
     * 
     * @return valido
     */
    public java.lang.String getValido() {
        return valido;
    }


    /**
     * Sets the valido value for this WSCertificado.
     * 
     * @param valido
     */
    public void setValido(java.lang.String valido) {
        this.valido = valido;
    }


    /**
     * Gets the aluno value for this WSCertificado.
     * 
     * @return aluno
     */
    public java.lang.String getAluno() {
        return aluno;
    }


    /**
     * Sets the aluno value for this WSCertificado.
     * 
     * @param aluno
     */
    public void setAluno(java.lang.String aluno) {
        this.aluno = aluno;
    }


    /**
     * Gets the cpf value for this WSCertificado.
     * 
     * @return cpf
     */
    public java.lang.String getCpf() {
        return cpf;
    }


    /**
     * Sets the cpf value for this WSCertificado.
     * 
     * @param cpf
     */
    public void setCpf(java.lang.String cpf) {
        this.cpf = cpf;
    }


    /**
     * Gets the RG value for this WSCertificado.
     * 
     * @return RG
     */
    public java.lang.String getRG() {
        return RG;
    }


    /**
     * Sets the RG value for this WSCertificado.
     * 
     * @param RG
     */
    public void setRG(java.lang.String RG) {
        this.RG = RG;
    }


    /**
     * Gets the turma value for this WSCertificado.
     * 
     * @return turma
     */
    public java.lang.String getTurma() {
        return turma;
    }


    /**
     * Sets the turma value for this WSCertificado.
     * 
     * @param turma
     */
    public void setTurma(java.lang.String turma) {
        this.turma = turma;
    }


    /**
     * Gets the curso value for this WSCertificado.
     * 
     * @return curso
     */
    public java.lang.String getCurso() {
        return curso;
    }


    /**
     * Sets the curso value for this WSCertificado.
     * 
     * @param curso
     */
    public void setCurso(java.lang.String curso) {
        this.curso = curso;
    }


    /**
     * Gets the ano value for this WSCertificado.
     * 
     * @return ano
     */
    public java.lang.String getAno() {
        return ano;
    }


    /**
     * Sets the ano value for this WSCertificado.
     * 
     * @param ano
     */
    public void setAno(java.lang.String ano) {
        this.ano = ano;
    }


    /**
     * Gets the numeroCertificado value for this WSCertificado.
     * 
     * @return numeroCertificado
     */
    public java.lang.String getNumeroCertificado() {
        return numeroCertificado;
    }


    /**
     * Sets the numeroCertificado value for this WSCertificado.
     * 
     * @param numeroCertificado
     */
    public void setNumeroCertificado(java.lang.String numeroCertificado) {
        this.numeroCertificado = numeroCertificado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSCertificado)) return false;
        WSCertificado other = (WSCertificado) obj;
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
            ((this.valido==null && other.getValido()==null) || 
             (this.valido!=null &&
              this.valido.equals(other.getValido()))) &&
            ((this.aluno==null && other.getAluno()==null) || 
             (this.aluno!=null &&
              this.aluno.equals(other.getAluno()))) &&
            ((this.cpf==null && other.getCpf()==null) || 
             (this.cpf!=null &&
              this.cpf.equals(other.getCpf()))) &&
            ((this.RG==null && other.getRG()==null) || 
             (this.RG!=null &&
              this.RG.equals(other.getRG()))) &&
            ((this.turma==null && other.getTurma()==null) || 
             (this.turma!=null &&
              this.turma.equals(other.getTurma()))) &&
            ((this.curso==null && other.getCurso()==null) || 
             (this.curso!=null &&
              this.curso.equals(other.getCurso()))) &&
            ((this.ano==null && other.getAno()==null) || 
             (this.ano!=null &&
              this.ano.equals(other.getAno()))) &&
            ((this.numeroCertificado==null && other.getNumeroCertificado()==null) || 
             (this.numeroCertificado!=null &&
              this.numeroCertificado.equals(other.getNumeroCertificado())));
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
        if (getValido() != null) {
            _hashCode += getValido().hashCode();
        }
        if (getAluno() != null) {
            _hashCode += getAluno().hashCode();
        }
        if (getCpf() != null) {
            _hashCode += getCpf().hashCode();
        }
        if (getRG() != null) {
            _hashCode += getRG().hashCode();
        }
        if (getTurma() != null) {
            _hashCode += getTurma().hashCode();
        }
        if (getCurso() != null) {
            _hashCode += getCurso().hashCode();
        }
        if (getAno() != null) {
            _hashCode += getAno().hashCode();
        }
        if (getNumeroCertificado() != null) {
            _hashCode += getNumeroCertificado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSCertificado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "WSCertificado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Valido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aluno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Aluno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "cpf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("turma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Turma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Curso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ano");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Ano"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCertificado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroCertificado"));
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
