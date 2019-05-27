/**
 * InsertResponsaveis.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertResponsaveis  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private java.lang.String sNome;

    private java.util.Calendar dDataNascimento;

    private int nParentesco;

    private java.lang.String sCEP;

    private java.lang.String sEndereco;

    private int nNumeroEndereco;

    private java.lang.String sRG;

    private java.lang.String sCPFCNPJ;

    private java.lang.String sCidade;

    private java.lang.String sBairro;

    private java.lang.String sEmail;

    private java.lang.String sTelefone;

    private java.lang.String sCelular;

    private int nAlunoID;

    private boolean lResponsavelFinanceiro;

    private boolean lResponsavelDidatico;

    private java.lang.String sObservacao;

    private java.lang.String sSexo;

    private java.lang.String sProfissao;

    private org.apache.axis.types.UnsignedByte nTipoPessoa;

    public InsertResponsaveis() {
    }

    public InsertResponsaveis(
           int nCodigoCliente,
           java.lang.String sToken,
           java.lang.String sNome,
           java.util.Calendar dDataNascimento,
           int nParentesco,
           java.lang.String sCEP,
           java.lang.String sEndereco,
           int nNumeroEndereco,
           java.lang.String sRG,
           java.lang.String sCPFCNPJ,
           java.lang.String sCidade,
           java.lang.String sBairro,
           java.lang.String sEmail,
           java.lang.String sTelefone,
           java.lang.String sCelular,
           int nAlunoID,
           boolean lResponsavelFinanceiro,
           boolean lResponsavelDidatico,
           java.lang.String sObservacao,
           java.lang.String sSexo,
           java.lang.String sProfissao,
           org.apache.axis.types.UnsignedByte nTipoPessoa) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.sNome = sNome;
           this.dDataNascimento = dDataNascimento;
           this.nParentesco = nParentesco;
           this.sCEP = sCEP;
           this.sEndereco = sEndereco;
           this.nNumeroEndereco = nNumeroEndereco;
           this.sRG = sRG;
           this.sCPFCNPJ = sCPFCNPJ;
           this.sCidade = sCidade;
           this.sBairro = sBairro;
           this.sEmail = sEmail;
           this.sTelefone = sTelefone;
           this.sCelular = sCelular;
           this.nAlunoID = nAlunoID;
           this.lResponsavelFinanceiro = lResponsavelFinanceiro;
           this.lResponsavelDidatico = lResponsavelDidatico;
           this.sObservacao = sObservacao;
           this.sSexo = sSexo;
           this.sProfissao = sProfissao;
           this.nTipoPessoa = nTipoPessoa;
    }


    /**
     * Gets the nCodigoCliente value for this InsertResponsaveis.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this InsertResponsaveis.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this InsertResponsaveis.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this InsertResponsaveis.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the sNome value for this InsertResponsaveis.
     * 
     * @return sNome
     */
    public java.lang.String getSNome() {
        return sNome;
    }


    /**
     * Sets the sNome value for this InsertResponsaveis.
     * 
     * @param sNome
     */
    public void setSNome(java.lang.String sNome) {
        this.sNome = sNome;
    }


    /**
     * Gets the dDataNascimento value for this InsertResponsaveis.
     * 
     * @return dDataNascimento
     */
    public java.util.Calendar getDDataNascimento() {
        return dDataNascimento;
    }


    /**
     * Sets the dDataNascimento value for this InsertResponsaveis.
     * 
     * @param dDataNascimento
     */
    public void setDDataNascimento(java.util.Calendar dDataNascimento) {
        this.dDataNascimento = dDataNascimento;
    }


    /**
     * Gets the nParentesco value for this InsertResponsaveis.
     * 
     * @return nParentesco
     */
    public int getNParentesco() {
        return nParentesco;
    }


    /**
     * Sets the nParentesco value for this InsertResponsaveis.
     * 
     * @param nParentesco
     */
    public void setNParentesco(int nParentesco) {
        this.nParentesco = nParentesco;
    }


    /**
     * Gets the sCEP value for this InsertResponsaveis.
     * 
     * @return sCEP
     */
    public java.lang.String getSCEP() {
        return sCEP;
    }


    /**
     * Sets the sCEP value for this InsertResponsaveis.
     * 
     * @param sCEP
     */
    public void setSCEP(java.lang.String sCEP) {
        this.sCEP = sCEP;
    }


    /**
     * Gets the sEndereco value for this InsertResponsaveis.
     * 
     * @return sEndereco
     */
    public java.lang.String getSEndereco() {
        return sEndereco;
    }


    /**
     * Sets the sEndereco value for this InsertResponsaveis.
     * 
     * @param sEndereco
     */
    public void setSEndereco(java.lang.String sEndereco) {
        this.sEndereco = sEndereco;
    }


    /**
     * Gets the nNumeroEndereco value for this InsertResponsaveis.
     * 
     * @return nNumeroEndereco
     */
    public int getNNumeroEndereco() {
        return nNumeroEndereco;
    }


    /**
     * Sets the nNumeroEndereco value for this InsertResponsaveis.
     * 
     * @param nNumeroEndereco
     */
    public void setNNumeroEndereco(int nNumeroEndereco) {
        this.nNumeroEndereco = nNumeroEndereco;
    }


    /**
     * Gets the sRG value for this InsertResponsaveis.
     * 
     * @return sRG
     */
    public java.lang.String getSRG() {
        return sRG;
    }


    /**
     * Sets the sRG value for this InsertResponsaveis.
     * 
     * @param sRG
     */
    public void setSRG(java.lang.String sRG) {
        this.sRG = sRG;
    }


    /**
     * Gets the sCPFCNPJ value for this InsertResponsaveis.
     * 
     * @return sCPFCNPJ
     */
    public java.lang.String getSCPFCNPJ() {
        return sCPFCNPJ;
    }


    /**
     * Sets the sCPFCNPJ value for this InsertResponsaveis.
     * 
     * @param sCPFCNPJ
     */
    public void setSCPFCNPJ(java.lang.String sCPFCNPJ) {
        this.sCPFCNPJ = sCPFCNPJ;
    }


    /**
     * Gets the sCidade value for this InsertResponsaveis.
     * 
     * @return sCidade
     */
    public java.lang.String getSCidade() {
        return sCidade;
    }


    /**
     * Sets the sCidade value for this InsertResponsaveis.
     * 
     * @param sCidade
     */
    public void setSCidade(java.lang.String sCidade) {
        this.sCidade = sCidade;
    }


    /**
     * Gets the sBairro value for this InsertResponsaveis.
     * 
     * @return sBairro
     */
    public java.lang.String getSBairro() {
        return sBairro;
    }


    /**
     * Sets the sBairro value for this InsertResponsaveis.
     * 
     * @param sBairro
     */
    public void setSBairro(java.lang.String sBairro) {
        this.sBairro = sBairro;
    }


    /**
     * Gets the sEmail value for this InsertResponsaveis.
     * 
     * @return sEmail
     */
    public java.lang.String getSEmail() {
        return sEmail;
    }


    /**
     * Sets the sEmail value for this InsertResponsaveis.
     * 
     * @param sEmail
     */
    public void setSEmail(java.lang.String sEmail) {
        this.sEmail = sEmail;
    }


    /**
     * Gets the sTelefone value for this InsertResponsaveis.
     * 
     * @return sTelefone
     */
    public java.lang.String getSTelefone() {
        return sTelefone;
    }


    /**
     * Sets the sTelefone value for this InsertResponsaveis.
     * 
     * @param sTelefone
     */
    public void setSTelefone(java.lang.String sTelefone) {
        this.sTelefone = sTelefone;
    }


    /**
     * Gets the sCelular value for this InsertResponsaveis.
     * 
     * @return sCelular
     */
    public java.lang.String getSCelular() {
        return sCelular;
    }


    /**
     * Sets the sCelular value for this InsertResponsaveis.
     * 
     * @param sCelular
     */
    public void setSCelular(java.lang.String sCelular) {
        this.sCelular = sCelular;
    }


    /**
     * Gets the nAlunoID value for this InsertResponsaveis.
     * 
     * @return nAlunoID
     */
    public int getNAlunoID() {
        return nAlunoID;
    }


    /**
     * Sets the nAlunoID value for this InsertResponsaveis.
     * 
     * @param nAlunoID
     */
    public void setNAlunoID(int nAlunoID) {
        this.nAlunoID = nAlunoID;
    }


    /**
     * Gets the lResponsavelFinanceiro value for this InsertResponsaveis.
     * 
     * @return lResponsavelFinanceiro
     */
    public boolean isLResponsavelFinanceiro() {
        return lResponsavelFinanceiro;
    }


    /**
     * Sets the lResponsavelFinanceiro value for this InsertResponsaveis.
     * 
     * @param lResponsavelFinanceiro
     */
    public void setLResponsavelFinanceiro(boolean lResponsavelFinanceiro) {
        this.lResponsavelFinanceiro = lResponsavelFinanceiro;
    }


    /**
     * Gets the lResponsavelDidatico value for this InsertResponsaveis.
     * 
     * @return lResponsavelDidatico
     */
    public boolean isLResponsavelDidatico() {
        return lResponsavelDidatico;
    }


    /**
     * Sets the lResponsavelDidatico value for this InsertResponsaveis.
     * 
     * @param lResponsavelDidatico
     */
    public void setLResponsavelDidatico(boolean lResponsavelDidatico) {
        this.lResponsavelDidatico = lResponsavelDidatico;
    }


    /**
     * Gets the sObservacao value for this InsertResponsaveis.
     * 
     * @return sObservacao
     */
    public java.lang.String getSObservacao() {
        return sObservacao;
    }


    /**
     * Sets the sObservacao value for this InsertResponsaveis.
     * 
     * @param sObservacao
     */
    public void setSObservacao(java.lang.String sObservacao) {
        this.sObservacao = sObservacao;
    }


    /**
     * Gets the sSexo value for this InsertResponsaveis.
     * 
     * @return sSexo
     */
    public java.lang.String getSSexo() {
        return sSexo;
    }


    /**
     * Sets the sSexo value for this InsertResponsaveis.
     * 
     * @param sSexo
     */
    public void setSSexo(java.lang.String sSexo) {
        this.sSexo = sSexo;
    }


    /**
     * Gets the sProfissao value for this InsertResponsaveis.
     * 
     * @return sProfissao
     */
    public java.lang.String getSProfissao() {
        return sProfissao;
    }


    /**
     * Sets the sProfissao value for this InsertResponsaveis.
     * 
     * @param sProfissao
     */
    public void setSProfissao(java.lang.String sProfissao) {
        this.sProfissao = sProfissao;
    }


    /**
     * Gets the nTipoPessoa value for this InsertResponsaveis.
     * 
     * @return nTipoPessoa
     */
    public org.apache.axis.types.UnsignedByte getNTipoPessoa() {
        return nTipoPessoa;
    }


    /**
     * Sets the nTipoPessoa value for this InsertResponsaveis.
     * 
     * @param nTipoPessoa
     */
    public void setNTipoPessoa(org.apache.axis.types.UnsignedByte nTipoPessoa) {
        this.nTipoPessoa = nTipoPessoa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertResponsaveis)) return false;
        InsertResponsaveis other = (InsertResponsaveis) obj;
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
            ((this.dDataNascimento==null && other.getDDataNascimento()==null) || 
             (this.dDataNascimento!=null &&
              this.dDataNascimento.equals(other.getDDataNascimento()))) &&
            this.nParentesco == other.getNParentesco() &&
            ((this.sCEP==null && other.getSCEP()==null) || 
             (this.sCEP!=null &&
              this.sCEP.equals(other.getSCEP()))) &&
            ((this.sEndereco==null && other.getSEndereco()==null) || 
             (this.sEndereco!=null &&
              this.sEndereco.equals(other.getSEndereco()))) &&
            this.nNumeroEndereco == other.getNNumeroEndereco() &&
            ((this.sRG==null && other.getSRG()==null) || 
             (this.sRG!=null &&
              this.sRG.equals(other.getSRG()))) &&
            ((this.sCPFCNPJ==null && other.getSCPFCNPJ()==null) || 
             (this.sCPFCNPJ!=null &&
              this.sCPFCNPJ.equals(other.getSCPFCNPJ()))) &&
            ((this.sCidade==null && other.getSCidade()==null) || 
             (this.sCidade!=null &&
              this.sCidade.equals(other.getSCidade()))) &&
            ((this.sBairro==null && other.getSBairro()==null) || 
             (this.sBairro!=null &&
              this.sBairro.equals(other.getSBairro()))) &&
            ((this.sEmail==null && other.getSEmail()==null) || 
             (this.sEmail!=null &&
              this.sEmail.equals(other.getSEmail()))) &&
            ((this.sTelefone==null && other.getSTelefone()==null) || 
             (this.sTelefone!=null &&
              this.sTelefone.equals(other.getSTelefone()))) &&
            ((this.sCelular==null && other.getSCelular()==null) || 
             (this.sCelular!=null &&
              this.sCelular.equals(other.getSCelular()))) &&
            this.nAlunoID == other.getNAlunoID() &&
            this.lResponsavelFinanceiro == other.isLResponsavelFinanceiro() &&
            this.lResponsavelDidatico == other.isLResponsavelDidatico() &&
            ((this.sObservacao==null && other.getSObservacao()==null) || 
             (this.sObservacao!=null &&
              this.sObservacao.equals(other.getSObservacao()))) &&
            ((this.sSexo==null && other.getSSexo()==null) || 
             (this.sSexo!=null &&
              this.sSexo.equals(other.getSSexo()))) &&
            ((this.sProfissao==null && other.getSProfissao()==null) || 
             (this.sProfissao!=null &&
              this.sProfissao.equals(other.getSProfissao()))) &&
            ((this.nTipoPessoa==null && other.getNTipoPessoa()==null) || 
             (this.nTipoPessoa!=null &&
              this.nTipoPessoa.equals(other.getNTipoPessoa())));
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
        if (getDDataNascimento() != null) {
            _hashCode += getDDataNascimento().hashCode();
        }
        _hashCode += getNParentesco();
        if (getSCEP() != null) {
            _hashCode += getSCEP().hashCode();
        }
        if (getSEndereco() != null) {
            _hashCode += getSEndereco().hashCode();
        }
        _hashCode += getNNumeroEndereco();
        if (getSRG() != null) {
            _hashCode += getSRG().hashCode();
        }
        if (getSCPFCNPJ() != null) {
            _hashCode += getSCPFCNPJ().hashCode();
        }
        if (getSCidade() != null) {
            _hashCode += getSCidade().hashCode();
        }
        if (getSBairro() != null) {
            _hashCode += getSBairro().hashCode();
        }
        if (getSEmail() != null) {
            _hashCode += getSEmail().hashCode();
        }
        if (getSTelefone() != null) {
            _hashCode += getSTelefone().hashCode();
        }
        if (getSCelular() != null) {
            _hashCode += getSCelular().hashCode();
        }
        _hashCode += getNAlunoID();
        _hashCode += (isLResponsavelFinanceiro() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLResponsavelDidatico() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSObservacao() != null) {
            _hashCode += getSObservacao().hashCode();
        }
        if (getSSexo() != null) {
            _hashCode += getSSexo().hashCode();
        }
        if (getSProfissao() != null) {
            _hashCode += getSProfissao().hashCode();
        }
        if (getNTipoPessoa() != null) {
            _hashCode += getNTipoPessoa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertResponsaveis.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertResponsaveis"));
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
        elemField.setFieldName("DDataNascimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataNascimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NParentesco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nParentesco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCEP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCEP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SEndereco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sEndereco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NNumeroEndereco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroEndereco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SRG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sRG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCPFCNPJ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCPFCNPJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SBairro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sBairro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STelefone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sTelefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCelular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCelular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NAlunoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LResponsavelFinanceiro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "lResponsavelFinanceiro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LResponsavelDidatico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "lResponsavelDidatico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SObservacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSexo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSexo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SProfissao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sProfissao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NTipoPessoa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipoPessoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
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
