/**
 * WsResponsavel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsResponsavel  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int responsavelID;

    private java.lang.String nome;

    private java.lang.String CPFCNPJ;

    private java.lang.String RG;

    private java.lang.String dataNascimento;

    private java.lang.String CEP;

    private java.lang.String endereco;

    private java.lang.String numeroEndereco;

    private java.lang.String email;

    private java.lang.String loginPortal;

    private java.lang.String senhaPortal;

    private java.lang.String observacao;

    private java.lang.String telefone;

    private java.lang.String celular;

    private java.lang.String sexo;

    private java.lang.String cidade;

    private java.lang.String bairro;

    private java.lang.String tipoPessoa;

    private br.net.sponteeducacional.api.WsAlunos[] alunos;

    public WsResponsavel() {
    }

    public WsResponsavel(
           java.lang.String retornoOperacao,
           int responsavelID,
           java.lang.String nome,
           java.lang.String CPFCNPJ,
           java.lang.String RG,
           java.lang.String dataNascimento,
           java.lang.String CEP,
           java.lang.String endereco,
           java.lang.String numeroEndereco,
           java.lang.String email,
           java.lang.String loginPortal,
           java.lang.String senhaPortal,
           java.lang.String observacao,
           java.lang.String telefone,
           java.lang.String celular,
           java.lang.String sexo,
           java.lang.String cidade,
           java.lang.String bairro,
           java.lang.String tipoPessoa,
           br.net.sponteeducacional.api.WsAlunos[] alunos) {
           this.retornoOperacao = retornoOperacao;
           this.responsavelID = responsavelID;
           this.nome = nome;
           this.CPFCNPJ = CPFCNPJ;
           this.RG = RG;
           this.dataNascimento = dataNascimento;
           this.CEP = CEP;
           this.endereco = endereco;
           this.numeroEndereco = numeroEndereco;
           this.email = email;
           this.loginPortal = loginPortal;
           this.senhaPortal = senhaPortal;
           this.observacao = observacao;
           this.telefone = telefone;
           this.celular = celular;
           this.sexo = sexo;
           this.cidade = cidade;
           this.bairro = bairro;
           this.tipoPessoa = tipoPessoa;
           this.alunos = alunos;
    }


    /**
     * Gets the retornoOperacao value for this WsResponsavel.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsResponsavel.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the responsavelID value for this WsResponsavel.
     * 
     * @return responsavelID
     */
    public int getResponsavelID() {
        return responsavelID;
    }


    /**
     * Sets the responsavelID value for this WsResponsavel.
     * 
     * @param responsavelID
     */
    public void setResponsavelID(int responsavelID) {
        this.responsavelID = responsavelID;
    }


    /**
     * Gets the nome value for this WsResponsavel.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this WsResponsavel.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the CPFCNPJ value for this WsResponsavel.
     * 
     * @return CPFCNPJ
     */
    public java.lang.String getCPFCNPJ() {
        return CPFCNPJ;
    }


    /**
     * Sets the CPFCNPJ value for this WsResponsavel.
     * 
     * @param CPFCNPJ
     */
    public void setCPFCNPJ(java.lang.String CPFCNPJ) {
        this.CPFCNPJ = CPFCNPJ;
    }


    /**
     * Gets the RG value for this WsResponsavel.
     * 
     * @return RG
     */
    public java.lang.String getRG() {
        return RG;
    }


    /**
     * Sets the RG value for this WsResponsavel.
     * 
     * @param RG
     */
    public void setRG(java.lang.String RG) {
        this.RG = RG;
    }


    /**
     * Gets the dataNascimento value for this WsResponsavel.
     * 
     * @return dataNascimento
     */
    public java.lang.String getDataNascimento() {
        return dataNascimento;
    }


    /**
     * Sets the dataNascimento value for this WsResponsavel.
     * 
     * @param dataNascimento
     */
    public void setDataNascimento(java.lang.String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    /**
     * Gets the CEP value for this WsResponsavel.
     * 
     * @return CEP
     */
    public java.lang.String getCEP() {
        return CEP;
    }


    /**
     * Sets the CEP value for this WsResponsavel.
     * 
     * @param CEP
     */
    public void setCEP(java.lang.String CEP) {
        this.CEP = CEP;
    }


    /**
     * Gets the endereco value for this WsResponsavel.
     * 
     * @return endereco
     */
    public java.lang.String getEndereco() {
        return endereco;
    }


    /**
     * Sets the endereco value for this WsResponsavel.
     * 
     * @param endereco
     */
    public void setEndereco(java.lang.String endereco) {
        this.endereco = endereco;
    }


    /**
     * Gets the numeroEndereco value for this WsResponsavel.
     * 
     * @return numeroEndereco
     */
    public java.lang.String getNumeroEndereco() {
        return numeroEndereco;
    }


    /**
     * Sets the numeroEndereco value for this WsResponsavel.
     * 
     * @param numeroEndereco
     */
    public void setNumeroEndereco(java.lang.String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }


    /**
     * Gets the email value for this WsResponsavel.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this WsResponsavel.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the loginPortal value for this WsResponsavel.
     * 
     * @return loginPortal
     */
    public java.lang.String getLoginPortal() {
        return loginPortal;
    }


    /**
     * Sets the loginPortal value for this WsResponsavel.
     * 
     * @param loginPortal
     */
    public void setLoginPortal(java.lang.String loginPortal) {
        this.loginPortal = loginPortal;
    }


    /**
     * Gets the senhaPortal value for this WsResponsavel.
     * 
     * @return senhaPortal
     */
    public java.lang.String getSenhaPortal() {
        return senhaPortal;
    }


    /**
     * Sets the senhaPortal value for this WsResponsavel.
     * 
     * @param senhaPortal
     */
    public void setSenhaPortal(java.lang.String senhaPortal) {
        this.senhaPortal = senhaPortal;
    }


    /**
     * Gets the observacao value for this WsResponsavel.
     * 
     * @return observacao
     */
    public java.lang.String getObservacao() {
        return observacao;
    }


    /**
     * Sets the observacao value for this WsResponsavel.
     * 
     * @param observacao
     */
    public void setObservacao(java.lang.String observacao) {
        this.observacao = observacao;
    }


    /**
     * Gets the telefone value for this WsResponsavel.
     * 
     * @return telefone
     */
    public java.lang.String getTelefone() {
        return telefone;
    }


    /**
     * Sets the telefone value for this WsResponsavel.
     * 
     * @param telefone
     */
    public void setTelefone(java.lang.String telefone) {
        this.telefone = telefone;
    }


    /**
     * Gets the celular value for this WsResponsavel.
     * 
     * @return celular
     */
    public java.lang.String getCelular() {
        return celular;
    }


    /**
     * Sets the celular value for this WsResponsavel.
     * 
     * @param celular
     */
    public void setCelular(java.lang.String celular) {
        this.celular = celular;
    }


    /**
     * Gets the sexo value for this WsResponsavel.
     * 
     * @return sexo
     */
    public java.lang.String getSexo() {
        return sexo;
    }


    /**
     * Sets the sexo value for this WsResponsavel.
     * 
     * @param sexo
     */
    public void setSexo(java.lang.String sexo) {
        this.sexo = sexo;
    }


    /**
     * Gets the cidade value for this WsResponsavel.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this WsResponsavel.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the bairro value for this WsResponsavel.
     * 
     * @return bairro
     */
    public java.lang.String getBairro() {
        return bairro;
    }


    /**
     * Sets the bairro value for this WsResponsavel.
     * 
     * @param bairro
     */
    public void setBairro(java.lang.String bairro) {
        this.bairro = bairro;
    }


    /**
     * Gets the tipoPessoa value for this WsResponsavel.
     * 
     * @return tipoPessoa
     */
    public java.lang.String getTipoPessoa() {
        return tipoPessoa;
    }


    /**
     * Sets the tipoPessoa value for this WsResponsavel.
     * 
     * @param tipoPessoa
     */
    public void setTipoPessoa(java.lang.String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }


    /**
     * Gets the alunos value for this WsResponsavel.
     * 
     * @return alunos
     */
    public br.net.sponteeducacional.api.WsAlunos[] getAlunos() {
        return alunos;
    }


    /**
     * Sets the alunos value for this WsResponsavel.
     * 
     * @param alunos
     */
    public void setAlunos(br.net.sponteeducacional.api.WsAlunos[] alunos) {
        this.alunos = alunos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsResponsavel)) return false;
        WsResponsavel other = (WsResponsavel) obj;
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
            this.responsavelID == other.getResponsavelID() &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.CPFCNPJ==null && other.getCPFCNPJ()==null) || 
             (this.CPFCNPJ!=null &&
              this.CPFCNPJ.equals(other.getCPFCNPJ()))) &&
            ((this.RG==null && other.getRG()==null) || 
             (this.RG!=null &&
              this.RG.equals(other.getRG()))) &&
            ((this.dataNascimento==null && other.getDataNascimento()==null) || 
             (this.dataNascimento!=null &&
              this.dataNascimento.equals(other.getDataNascimento()))) &&
            ((this.CEP==null && other.getCEP()==null) || 
             (this.CEP!=null &&
              this.CEP.equals(other.getCEP()))) &&
            ((this.endereco==null && other.getEndereco()==null) || 
             (this.endereco!=null &&
              this.endereco.equals(other.getEndereco()))) &&
            ((this.numeroEndereco==null && other.getNumeroEndereco()==null) || 
             (this.numeroEndereco!=null &&
              this.numeroEndereco.equals(other.getNumeroEndereco()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.loginPortal==null && other.getLoginPortal()==null) || 
             (this.loginPortal!=null &&
              this.loginPortal.equals(other.getLoginPortal()))) &&
            ((this.senhaPortal==null && other.getSenhaPortal()==null) || 
             (this.senhaPortal!=null &&
              this.senhaPortal.equals(other.getSenhaPortal()))) &&
            ((this.observacao==null && other.getObservacao()==null) || 
             (this.observacao!=null &&
              this.observacao.equals(other.getObservacao()))) &&
            ((this.telefone==null && other.getTelefone()==null) || 
             (this.telefone!=null &&
              this.telefone.equals(other.getTelefone()))) &&
            ((this.celular==null && other.getCelular()==null) || 
             (this.celular!=null &&
              this.celular.equals(other.getCelular()))) &&
            ((this.sexo==null && other.getSexo()==null) || 
             (this.sexo!=null &&
              this.sexo.equals(other.getSexo()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.bairro==null && other.getBairro()==null) || 
             (this.bairro!=null &&
              this.bairro.equals(other.getBairro()))) &&
            ((this.tipoPessoa==null && other.getTipoPessoa()==null) || 
             (this.tipoPessoa!=null &&
              this.tipoPessoa.equals(other.getTipoPessoa()))) &&
            ((this.alunos==null && other.getAlunos()==null) || 
             (this.alunos!=null &&
              java.util.Arrays.equals(this.alunos, other.getAlunos())));
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
        _hashCode += getResponsavelID();
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getCPFCNPJ() != null) {
            _hashCode += getCPFCNPJ().hashCode();
        }
        if (getRG() != null) {
            _hashCode += getRG().hashCode();
        }
        if (getDataNascimento() != null) {
            _hashCode += getDataNascimento().hashCode();
        }
        if (getCEP() != null) {
            _hashCode += getCEP().hashCode();
        }
        if (getEndereco() != null) {
            _hashCode += getEndereco().hashCode();
        }
        if (getNumeroEndereco() != null) {
            _hashCode += getNumeroEndereco().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getLoginPortal() != null) {
            _hashCode += getLoginPortal().hashCode();
        }
        if (getSenhaPortal() != null) {
            _hashCode += getSenhaPortal().hashCode();
        }
        if (getObservacao() != null) {
            _hashCode += getObservacao().hashCode();
        }
        if (getTelefone() != null) {
            _hashCode += getTelefone().hashCode();
        }
        if (getCelular() != null) {
            _hashCode += getCelular().hashCode();
        }
        if (getSexo() != null) {
            _hashCode += getSexo().hashCode();
        }
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getBairro() != null) {
            _hashCode += getBairro().hashCode();
        }
        if (getTipoPessoa() != null) {
            _hashCode += getTipoPessoa().hashCode();
        }
        if (getAlunos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlunos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlunos(), i);
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
        new org.apache.axis.description.TypeDesc(WsResponsavel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsResponsavel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsavelID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ResponsavelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("CPFCNPJ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CPFCNPJ"));
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
        elemField.setFieldName("dataNascimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataNascimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CEP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CEP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endereco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Endereco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroEndereco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroEndereco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginPortal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "LoginPortal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senhaPortal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SenhaPortal"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Telefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("celular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Celular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Sexo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bairro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Bairro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPessoa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TipoPessoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alunos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Alunos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAlunos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAlunos"));
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
