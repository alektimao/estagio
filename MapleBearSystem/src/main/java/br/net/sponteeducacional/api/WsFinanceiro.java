/**
 * WsFinanceiro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsFinanceiro  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private java.lang.String codigoUnidade;

    private java.lang.String contaReceberID;

    private br.net.sponteeducacional.api.WsInfoAluno[] aluno;

    private java.lang.String numeroParcelas;

    private java.lang.String numeroContrato;

    private java.lang.String situacaoContrato;

    private java.lang.String curso;

    private java.lang.String serie;

    private java.lang.String turma;

    private java.lang.String totalValorBruto;

    private java.lang.String totalValorLiquido;

    private java.lang.String totalDescontoReais;

    private java.lang.String totalDescontoPercentual;

    private java.lang.String categoria;

    private java.lang.String tipoPlano;

    private br.net.sponteeducacional.api.WsParcela[] parcelas;

    public WsFinanceiro() {
    }

    public WsFinanceiro(
           java.lang.String retornoOperacao,
           java.lang.String codigoUnidade,
           java.lang.String contaReceberID,
           br.net.sponteeducacional.api.WsInfoAluno[] aluno,
           java.lang.String numeroParcelas,
           java.lang.String numeroContrato,
           java.lang.String situacaoContrato,
           java.lang.String curso,
           java.lang.String serie,
           java.lang.String turma,
           java.lang.String totalValorBruto,
           java.lang.String totalValorLiquido,
           java.lang.String totalDescontoReais,
           java.lang.String totalDescontoPercentual,
           java.lang.String categoria,
           java.lang.String tipoPlano,
           br.net.sponteeducacional.api.WsParcela[] parcelas) {
           this.retornoOperacao = retornoOperacao;
           this.codigoUnidade = codigoUnidade;
           this.contaReceberID = contaReceberID;
           this.aluno = aluno;
           this.numeroParcelas = numeroParcelas;
           this.numeroContrato = numeroContrato;
           this.situacaoContrato = situacaoContrato;
           this.curso = curso;
           this.serie = serie;
           this.turma = turma;
           this.totalValorBruto = totalValorBruto;
           this.totalValorLiquido = totalValorLiquido;
           this.totalDescontoReais = totalDescontoReais;
           this.totalDescontoPercentual = totalDescontoPercentual;
           this.categoria = categoria;
           this.tipoPlano = tipoPlano;
           this.parcelas = parcelas;
    }


    /**
     * Gets the retornoOperacao value for this WsFinanceiro.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsFinanceiro.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the codigoUnidade value for this WsFinanceiro.
     * 
     * @return codigoUnidade
     */
    public java.lang.String getCodigoUnidade() {
        return codigoUnidade;
    }


    /**
     * Sets the codigoUnidade value for this WsFinanceiro.
     * 
     * @param codigoUnidade
     */
    public void setCodigoUnidade(java.lang.String codigoUnidade) {
        this.codigoUnidade = codigoUnidade;
    }


    /**
     * Gets the contaReceberID value for this WsFinanceiro.
     * 
     * @return contaReceberID
     */
    public java.lang.String getContaReceberID() {
        return contaReceberID;
    }


    /**
     * Sets the contaReceberID value for this WsFinanceiro.
     * 
     * @param contaReceberID
     */
    public void setContaReceberID(java.lang.String contaReceberID) {
        this.contaReceberID = contaReceberID;
    }


    /**
     * Gets the aluno value for this WsFinanceiro.
     * 
     * @return aluno
     */
    public br.net.sponteeducacional.api.WsInfoAluno[] getAluno() {
        return aluno;
    }


    /**
     * Sets the aluno value for this WsFinanceiro.
     * 
     * @param aluno
     */
    public void setAluno(br.net.sponteeducacional.api.WsInfoAluno[] aluno) {
        this.aluno = aluno;
    }


    /**
     * Gets the numeroParcelas value for this WsFinanceiro.
     * 
     * @return numeroParcelas
     */
    public java.lang.String getNumeroParcelas() {
        return numeroParcelas;
    }


    /**
     * Sets the numeroParcelas value for this WsFinanceiro.
     * 
     * @param numeroParcelas
     */
    public void setNumeroParcelas(java.lang.String numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }


    /**
     * Gets the numeroContrato value for this WsFinanceiro.
     * 
     * @return numeroContrato
     */
    public java.lang.String getNumeroContrato() {
        return numeroContrato;
    }


    /**
     * Sets the numeroContrato value for this WsFinanceiro.
     * 
     * @param numeroContrato
     */
    public void setNumeroContrato(java.lang.String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }


    /**
     * Gets the situacaoContrato value for this WsFinanceiro.
     * 
     * @return situacaoContrato
     */
    public java.lang.String getSituacaoContrato() {
        return situacaoContrato;
    }


    /**
     * Sets the situacaoContrato value for this WsFinanceiro.
     * 
     * @param situacaoContrato
     */
    public void setSituacaoContrato(java.lang.String situacaoContrato) {
        this.situacaoContrato = situacaoContrato;
    }


    /**
     * Gets the curso value for this WsFinanceiro.
     * 
     * @return curso
     */
    public java.lang.String getCurso() {
        return curso;
    }


    /**
     * Sets the curso value for this WsFinanceiro.
     * 
     * @param curso
     */
    public void setCurso(java.lang.String curso) {
        this.curso = curso;
    }


    /**
     * Gets the serie value for this WsFinanceiro.
     * 
     * @return serie
     */
    public java.lang.String getSerie() {
        return serie;
    }


    /**
     * Sets the serie value for this WsFinanceiro.
     * 
     * @param serie
     */
    public void setSerie(java.lang.String serie) {
        this.serie = serie;
    }


    /**
     * Gets the turma value for this WsFinanceiro.
     * 
     * @return turma
     */
    public java.lang.String getTurma() {
        return turma;
    }


    /**
     * Sets the turma value for this WsFinanceiro.
     * 
     * @param turma
     */
    public void setTurma(java.lang.String turma) {
        this.turma = turma;
    }


    /**
     * Gets the totalValorBruto value for this WsFinanceiro.
     * 
     * @return totalValorBruto
     */
    public java.lang.String getTotalValorBruto() {
        return totalValorBruto;
    }


    /**
     * Sets the totalValorBruto value for this WsFinanceiro.
     * 
     * @param totalValorBruto
     */
    public void setTotalValorBruto(java.lang.String totalValorBruto) {
        this.totalValorBruto = totalValorBruto;
    }


    /**
     * Gets the totalValorLiquido value for this WsFinanceiro.
     * 
     * @return totalValorLiquido
     */
    public java.lang.String getTotalValorLiquido() {
        return totalValorLiquido;
    }


    /**
     * Sets the totalValorLiquido value for this WsFinanceiro.
     * 
     * @param totalValorLiquido
     */
    public void setTotalValorLiquido(java.lang.String totalValorLiquido) {
        this.totalValorLiquido = totalValorLiquido;
    }


    /**
     * Gets the totalDescontoReais value for this WsFinanceiro.
     * 
     * @return totalDescontoReais
     */
    public java.lang.String getTotalDescontoReais() {
        return totalDescontoReais;
    }


    /**
     * Sets the totalDescontoReais value for this WsFinanceiro.
     * 
     * @param totalDescontoReais
     */
    public void setTotalDescontoReais(java.lang.String totalDescontoReais) {
        this.totalDescontoReais = totalDescontoReais;
    }


    /**
     * Gets the totalDescontoPercentual value for this WsFinanceiro.
     * 
     * @return totalDescontoPercentual
     */
    public java.lang.String getTotalDescontoPercentual() {
        return totalDescontoPercentual;
    }


    /**
     * Sets the totalDescontoPercentual value for this WsFinanceiro.
     * 
     * @param totalDescontoPercentual
     */
    public void setTotalDescontoPercentual(java.lang.String totalDescontoPercentual) {
        this.totalDescontoPercentual = totalDescontoPercentual;
    }


    /**
     * Gets the categoria value for this WsFinanceiro.
     * 
     * @return categoria
     */
    public java.lang.String getCategoria() {
        return categoria;
    }


    /**
     * Sets the categoria value for this WsFinanceiro.
     * 
     * @param categoria
     */
    public void setCategoria(java.lang.String categoria) {
        this.categoria = categoria;
    }


    /**
     * Gets the tipoPlano value for this WsFinanceiro.
     * 
     * @return tipoPlano
     */
    public java.lang.String getTipoPlano() {
        return tipoPlano;
    }


    /**
     * Sets the tipoPlano value for this WsFinanceiro.
     * 
     * @param tipoPlano
     */
    public void setTipoPlano(java.lang.String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }


    /**
     * Gets the parcelas value for this WsFinanceiro.
     * 
     * @return parcelas
     */
    public br.net.sponteeducacional.api.WsParcela[] getParcelas() {
        return parcelas;
    }


    /**
     * Sets the parcelas value for this WsFinanceiro.
     * 
     * @param parcelas
     */
    public void setParcelas(br.net.sponteeducacional.api.WsParcela[] parcelas) {
        this.parcelas = parcelas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsFinanceiro)) return false;
        WsFinanceiro other = (WsFinanceiro) obj;
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
            ((this.codigoUnidade==null && other.getCodigoUnidade()==null) || 
             (this.codigoUnidade!=null &&
              this.codigoUnidade.equals(other.getCodigoUnidade()))) &&
            ((this.contaReceberID==null && other.getContaReceberID()==null) || 
             (this.contaReceberID!=null &&
              this.contaReceberID.equals(other.getContaReceberID()))) &&
            ((this.aluno==null && other.getAluno()==null) || 
             (this.aluno!=null &&
              java.util.Arrays.equals(this.aluno, other.getAluno()))) &&
            ((this.numeroParcelas==null && other.getNumeroParcelas()==null) || 
             (this.numeroParcelas!=null &&
              this.numeroParcelas.equals(other.getNumeroParcelas()))) &&
            ((this.numeroContrato==null && other.getNumeroContrato()==null) || 
             (this.numeroContrato!=null &&
              this.numeroContrato.equals(other.getNumeroContrato()))) &&
            ((this.situacaoContrato==null && other.getSituacaoContrato()==null) || 
             (this.situacaoContrato!=null &&
              this.situacaoContrato.equals(other.getSituacaoContrato()))) &&
            ((this.curso==null && other.getCurso()==null) || 
             (this.curso!=null &&
              this.curso.equals(other.getCurso()))) &&
            ((this.serie==null && other.getSerie()==null) || 
             (this.serie!=null &&
              this.serie.equals(other.getSerie()))) &&
            ((this.turma==null && other.getTurma()==null) || 
             (this.turma!=null &&
              this.turma.equals(other.getTurma()))) &&
            ((this.totalValorBruto==null && other.getTotalValorBruto()==null) || 
             (this.totalValorBruto!=null &&
              this.totalValorBruto.equals(other.getTotalValorBruto()))) &&
            ((this.totalValorLiquido==null && other.getTotalValorLiquido()==null) || 
             (this.totalValorLiquido!=null &&
              this.totalValorLiquido.equals(other.getTotalValorLiquido()))) &&
            ((this.totalDescontoReais==null && other.getTotalDescontoReais()==null) || 
             (this.totalDescontoReais!=null &&
              this.totalDescontoReais.equals(other.getTotalDescontoReais()))) &&
            ((this.totalDescontoPercentual==null && other.getTotalDescontoPercentual()==null) || 
             (this.totalDescontoPercentual!=null &&
              this.totalDescontoPercentual.equals(other.getTotalDescontoPercentual()))) &&
            ((this.categoria==null && other.getCategoria()==null) || 
             (this.categoria!=null &&
              this.categoria.equals(other.getCategoria()))) &&
            ((this.tipoPlano==null && other.getTipoPlano()==null) || 
             (this.tipoPlano!=null &&
              this.tipoPlano.equals(other.getTipoPlano()))) &&
            ((this.parcelas==null && other.getParcelas()==null) || 
             (this.parcelas!=null &&
              java.util.Arrays.equals(this.parcelas, other.getParcelas())));
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
        if (getCodigoUnidade() != null) {
            _hashCode += getCodigoUnidade().hashCode();
        }
        if (getContaReceberID() != null) {
            _hashCode += getContaReceberID().hashCode();
        }
        if (getAluno() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAluno());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAluno(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumeroParcelas() != null) {
            _hashCode += getNumeroParcelas().hashCode();
        }
        if (getNumeroContrato() != null) {
            _hashCode += getNumeroContrato().hashCode();
        }
        if (getSituacaoContrato() != null) {
            _hashCode += getSituacaoContrato().hashCode();
        }
        if (getCurso() != null) {
            _hashCode += getCurso().hashCode();
        }
        if (getSerie() != null) {
            _hashCode += getSerie().hashCode();
        }
        if (getTurma() != null) {
            _hashCode += getTurma().hashCode();
        }
        if (getTotalValorBruto() != null) {
            _hashCode += getTotalValorBruto().hashCode();
        }
        if (getTotalValorLiquido() != null) {
            _hashCode += getTotalValorLiquido().hashCode();
        }
        if (getTotalDescontoReais() != null) {
            _hashCode += getTotalDescontoReais().hashCode();
        }
        if (getTotalDescontoPercentual() != null) {
            _hashCode += getTotalDescontoPercentual().hashCode();
        }
        if (getCategoria() != null) {
            _hashCode += getCategoria().hashCode();
        }
        if (getTipoPlano() != null) {
            _hashCode += getTipoPlano().hashCode();
        }
        if (getParcelas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParcelas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParcelas(), i);
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
        new org.apache.axis.description.TypeDesc(WsFinanceiro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFinanceiro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoUnidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CodigoUnidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaReceberID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ContaReceberID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aluno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Aluno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsInfoAluno"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsInfoAluno"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroParcelas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroParcelas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroContrato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroContrato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacaoContrato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SituacaoContrato"));
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
        elemField.setFieldName("serie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Serie"));
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
        elemField.setFieldName("totalValorBruto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TotalValorBruto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalValorLiquido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TotalValorLiquido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDescontoReais");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TotalDescontoReais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDescontoPercentual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TotalDescontoPercentual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Categoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPlano");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TipoPlano"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Parcelas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcela"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcela"));
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
