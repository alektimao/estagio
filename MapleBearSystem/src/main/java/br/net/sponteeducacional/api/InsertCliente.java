/**
 * InsertCliente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertCliente  implements java.io.Serializable {
    private int nCodigoCliente;

    private java.lang.String sToken;

    private java.lang.String sNome;

    private org.apache.axis.types.UnsignedByte nSituacao;

    private org.apache.axis.types.UnsignedByte nTipo;

    private java.lang.String sCPF;

    private java.lang.String sRG;

    private java.lang.String sCNPJ;

    private java.lang.String sRazaoSocial;

    private java.lang.String sCEP;

    private java.lang.String sEndereco;

    private java.lang.String sNumeroEndereco;

    private java.lang.String sComplementoEndereco;

    private java.lang.String sEmail;

    private java.lang.String sInscricaoEstadual;

    private java.lang.String sInscricaoMunicipal;

    private java.lang.String sObservacao;

    private java.lang.String sTelefone;

    private java.lang.String sRamal;

    private java.lang.String sCelular;

    private java.lang.String sTelefoneFax;

    private java.lang.String sCidade;

    private java.lang.String sBairro;

    private java.lang.String sAgencia;

    private java.lang.String sConta;

    private java.lang.String sCodigoClienteBanco;

    private org.apache.axis.types.UnsignedByte nCliente;

    private org.apache.axis.types.UnsignedByte nFornecedor;

    private org.apache.axis.types.UnsignedByte nEscolaAluno;

    private org.apache.axis.types.UnsignedByte nEmpresaAluno;

    private java.lang.String sContato;

    public InsertCliente() {
    }

    public InsertCliente(
           int nCodigoCliente,
           java.lang.String sToken,
           java.lang.String sNome,
           org.apache.axis.types.UnsignedByte nSituacao,
           org.apache.axis.types.UnsignedByte nTipo,
           java.lang.String sCPF,
           java.lang.String sRG,
           java.lang.String sCNPJ,
           java.lang.String sRazaoSocial,
           java.lang.String sCEP,
           java.lang.String sEndereco,
           java.lang.String sNumeroEndereco,
           java.lang.String sComplementoEndereco,
           java.lang.String sEmail,
           java.lang.String sInscricaoEstadual,
           java.lang.String sInscricaoMunicipal,
           java.lang.String sObservacao,
           java.lang.String sTelefone,
           java.lang.String sRamal,
           java.lang.String sCelular,
           java.lang.String sTelefoneFax,
           java.lang.String sCidade,
           java.lang.String sBairro,
           java.lang.String sAgencia,
           java.lang.String sConta,
           java.lang.String sCodigoClienteBanco,
           org.apache.axis.types.UnsignedByte nCliente,
           org.apache.axis.types.UnsignedByte nFornecedor,
           org.apache.axis.types.UnsignedByte nEscolaAluno,
           org.apache.axis.types.UnsignedByte nEmpresaAluno,
           java.lang.String sContato) {
           this.nCodigoCliente = nCodigoCliente;
           this.sToken = sToken;
           this.sNome = sNome;
           this.nSituacao = nSituacao;
           this.nTipo = nTipo;
           this.sCPF = sCPF;
           this.sRG = sRG;
           this.sCNPJ = sCNPJ;
           this.sRazaoSocial = sRazaoSocial;
           this.sCEP = sCEP;
           this.sEndereco = sEndereco;
           this.sNumeroEndereco = sNumeroEndereco;
           this.sComplementoEndereco = sComplementoEndereco;
           this.sEmail = sEmail;
           this.sInscricaoEstadual = sInscricaoEstadual;
           this.sInscricaoMunicipal = sInscricaoMunicipal;
           this.sObservacao = sObservacao;
           this.sTelefone = sTelefone;
           this.sRamal = sRamal;
           this.sCelular = sCelular;
           this.sTelefoneFax = sTelefoneFax;
           this.sCidade = sCidade;
           this.sBairro = sBairro;
           this.sAgencia = sAgencia;
           this.sConta = sConta;
           this.sCodigoClienteBanco = sCodigoClienteBanco;
           this.nCliente = nCliente;
           this.nFornecedor = nFornecedor;
           this.nEscolaAluno = nEscolaAluno;
           this.nEmpresaAluno = nEmpresaAluno;
           this.sContato = sContato;
    }


    /**
     * Gets the nCodigoCliente value for this InsertCliente.
     * 
     * @return nCodigoCliente
     */
    public int getNCodigoCliente() {
        return nCodigoCliente;
    }


    /**
     * Sets the nCodigoCliente value for this InsertCliente.
     * 
     * @param nCodigoCliente
     */
    public void setNCodigoCliente(int nCodigoCliente) {
        this.nCodigoCliente = nCodigoCliente;
    }


    /**
     * Gets the sToken value for this InsertCliente.
     * 
     * @return sToken
     */
    public java.lang.String getSToken() {
        return sToken;
    }


    /**
     * Sets the sToken value for this InsertCliente.
     * 
     * @param sToken
     */
    public void setSToken(java.lang.String sToken) {
        this.sToken = sToken;
    }


    /**
     * Gets the sNome value for this InsertCliente.
     * 
     * @return sNome
     */
    public java.lang.String getSNome() {
        return sNome;
    }


    /**
     * Sets the sNome value for this InsertCliente.
     * 
     * @param sNome
     */
    public void setSNome(java.lang.String sNome) {
        this.sNome = sNome;
    }


    /**
     * Gets the nSituacao value for this InsertCliente.
     * 
     * @return nSituacao
     */
    public org.apache.axis.types.UnsignedByte getNSituacao() {
        return nSituacao;
    }


    /**
     * Sets the nSituacao value for this InsertCliente.
     * 
     * @param nSituacao
     */
    public void setNSituacao(org.apache.axis.types.UnsignedByte nSituacao) {
        this.nSituacao = nSituacao;
    }


    /**
     * Gets the nTipo value for this InsertCliente.
     * 
     * @return nTipo
     */
    public org.apache.axis.types.UnsignedByte getNTipo() {
        return nTipo;
    }


    /**
     * Sets the nTipo value for this InsertCliente.
     * 
     * @param nTipo
     */
    public void setNTipo(org.apache.axis.types.UnsignedByte nTipo) {
        this.nTipo = nTipo;
    }


    /**
     * Gets the sCPF value for this InsertCliente.
     * 
     * @return sCPF
     */
    public java.lang.String getSCPF() {
        return sCPF;
    }


    /**
     * Sets the sCPF value for this InsertCliente.
     * 
     * @param sCPF
     */
    public void setSCPF(java.lang.String sCPF) {
        this.sCPF = sCPF;
    }


    /**
     * Gets the sRG value for this InsertCliente.
     * 
     * @return sRG
     */
    public java.lang.String getSRG() {
        return sRG;
    }


    /**
     * Sets the sRG value for this InsertCliente.
     * 
     * @param sRG
     */
    public void setSRG(java.lang.String sRG) {
        this.sRG = sRG;
    }


    /**
     * Gets the sCNPJ value for this InsertCliente.
     * 
     * @return sCNPJ
     */
    public java.lang.String getSCNPJ() {
        return sCNPJ;
    }


    /**
     * Sets the sCNPJ value for this InsertCliente.
     * 
     * @param sCNPJ
     */
    public void setSCNPJ(java.lang.String sCNPJ) {
        this.sCNPJ = sCNPJ;
    }


    /**
     * Gets the sRazaoSocial value for this InsertCliente.
     * 
     * @return sRazaoSocial
     */
    public java.lang.String getSRazaoSocial() {
        return sRazaoSocial;
    }


    /**
     * Sets the sRazaoSocial value for this InsertCliente.
     * 
     * @param sRazaoSocial
     */
    public void setSRazaoSocial(java.lang.String sRazaoSocial) {
        this.sRazaoSocial = sRazaoSocial;
    }


    /**
     * Gets the sCEP value for this InsertCliente.
     * 
     * @return sCEP
     */
    public java.lang.String getSCEP() {
        return sCEP;
    }


    /**
     * Sets the sCEP value for this InsertCliente.
     * 
     * @param sCEP
     */
    public void setSCEP(java.lang.String sCEP) {
        this.sCEP = sCEP;
    }


    /**
     * Gets the sEndereco value for this InsertCliente.
     * 
     * @return sEndereco
     */
    public java.lang.String getSEndereco() {
        return sEndereco;
    }


    /**
     * Sets the sEndereco value for this InsertCliente.
     * 
     * @param sEndereco
     */
    public void setSEndereco(java.lang.String sEndereco) {
        this.sEndereco = sEndereco;
    }


    /**
     * Gets the sNumeroEndereco value for this InsertCliente.
     * 
     * @return sNumeroEndereco
     */
    public java.lang.String getSNumeroEndereco() {
        return sNumeroEndereco;
    }


    /**
     * Sets the sNumeroEndereco value for this InsertCliente.
     * 
     * @param sNumeroEndereco
     */
    public void setSNumeroEndereco(java.lang.String sNumeroEndereco) {
        this.sNumeroEndereco = sNumeroEndereco;
    }


    /**
     * Gets the sComplementoEndereco value for this InsertCliente.
     * 
     * @return sComplementoEndereco
     */
    public java.lang.String getSComplementoEndereco() {
        return sComplementoEndereco;
    }


    /**
     * Sets the sComplementoEndereco value for this InsertCliente.
     * 
     * @param sComplementoEndereco
     */
    public void setSComplementoEndereco(java.lang.String sComplementoEndereco) {
        this.sComplementoEndereco = sComplementoEndereco;
    }


    /**
     * Gets the sEmail value for this InsertCliente.
     * 
     * @return sEmail
     */
    public java.lang.String getSEmail() {
        return sEmail;
    }


    /**
     * Sets the sEmail value for this InsertCliente.
     * 
     * @param sEmail
     */
    public void setSEmail(java.lang.String sEmail) {
        this.sEmail = sEmail;
    }


    /**
     * Gets the sInscricaoEstadual value for this InsertCliente.
     * 
     * @return sInscricaoEstadual
     */
    public java.lang.String getSInscricaoEstadual() {
        return sInscricaoEstadual;
    }


    /**
     * Sets the sInscricaoEstadual value for this InsertCliente.
     * 
     * @param sInscricaoEstadual
     */
    public void setSInscricaoEstadual(java.lang.String sInscricaoEstadual) {
        this.sInscricaoEstadual = sInscricaoEstadual;
    }


    /**
     * Gets the sInscricaoMunicipal value for this InsertCliente.
     * 
     * @return sInscricaoMunicipal
     */
    public java.lang.String getSInscricaoMunicipal() {
        return sInscricaoMunicipal;
    }


    /**
     * Sets the sInscricaoMunicipal value for this InsertCliente.
     * 
     * @param sInscricaoMunicipal
     */
    public void setSInscricaoMunicipal(java.lang.String sInscricaoMunicipal) {
        this.sInscricaoMunicipal = sInscricaoMunicipal;
    }


    /**
     * Gets the sObservacao value for this InsertCliente.
     * 
     * @return sObservacao
     */
    public java.lang.String getSObservacao() {
        return sObservacao;
    }


    /**
     * Sets the sObservacao value for this InsertCliente.
     * 
     * @param sObservacao
     */
    public void setSObservacao(java.lang.String sObservacao) {
        this.sObservacao = sObservacao;
    }


    /**
     * Gets the sTelefone value for this InsertCliente.
     * 
     * @return sTelefone
     */
    public java.lang.String getSTelefone() {
        return sTelefone;
    }


    /**
     * Sets the sTelefone value for this InsertCliente.
     * 
     * @param sTelefone
     */
    public void setSTelefone(java.lang.String sTelefone) {
        this.sTelefone = sTelefone;
    }


    /**
     * Gets the sRamal value for this InsertCliente.
     * 
     * @return sRamal
     */
    public java.lang.String getSRamal() {
        return sRamal;
    }


    /**
     * Sets the sRamal value for this InsertCliente.
     * 
     * @param sRamal
     */
    public void setSRamal(java.lang.String sRamal) {
        this.sRamal = sRamal;
    }


    /**
     * Gets the sCelular value for this InsertCliente.
     * 
     * @return sCelular
     */
    public java.lang.String getSCelular() {
        return sCelular;
    }


    /**
     * Sets the sCelular value for this InsertCliente.
     * 
     * @param sCelular
     */
    public void setSCelular(java.lang.String sCelular) {
        this.sCelular = sCelular;
    }


    /**
     * Gets the sTelefoneFax value for this InsertCliente.
     * 
     * @return sTelefoneFax
     */
    public java.lang.String getSTelefoneFax() {
        return sTelefoneFax;
    }


    /**
     * Sets the sTelefoneFax value for this InsertCliente.
     * 
     * @param sTelefoneFax
     */
    public void setSTelefoneFax(java.lang.String sTelefoneFax) {
        this.sTelefoneFax = sTelefoneFax;
    }


    /**
     * Gets the sCidade value for this InsertCliente.
     * 
     * @return sCidade
     */
    public java.lang.String getSCidade() {
        return sCidade;
    }


    /**
     * Sets the sCidade value for this InsertCliente.
     * 
     * @param sCidade
     */
    public void setSCidade(java.lang.String sCidade) {
        this.sCidade = sCidade;
    }


    /**
     * Gets the sBairro value for this InsertCliente.
     * 
     * @return sBairro
     */
    public java.lang.String getSBairro() {
        return sBairro;
    }


    /**
     * Sets the sBairro value for this InsertCliente.
     * 
     * @param sBairro
     */
    public void setSBairro(java.lang.String sBairro) {
        this.sBairro = sBairro;
    }


    /**
     * Gets the sAgencia value for this InsertCliente.
     * 
     * @return sAgencia
     */
    public java.lang.String getSAgencia() {
        return sAgencia;
    }


    /**
     * Sets the sAgencia value for this InsertCliente.
     * 
     * @param sAgencia
     */
    public void setSAgencia(java.lang.String sAgencia) {
        this.sAgencia = sAgencia;
    }


    /**
     * Gets the sConta value for this InsertCliente.
     * 
     * @return sConta
     */
    public java.lang.String getSConta() {
        return sConta;
    }


    /**
     * Sets the sConta value for this InsertCliente.
     * 
     * @param sConta
     */
    public void setSConta(java.lang.String sConta) {
        this.sConta = sConta;
    }


    /**
     * Gets the sCodigoClienteBanco value for this InsertCliente.
     * 
     * @return sCodigoClienteBanco
     */
    public java.lang.String getSCodigoClienteBanco() {
        return sCodigoClienteBanco;
    }


    /**
     * Sets the sCodigoClienteBanco value for this InsertCliente.
     * 
     * @param sCodigoClienteBanco
     */
    public void setSCodigoClienteBanco(java.lang.String sCodigoClienteBanco) {
        this.sCodigoClienteBanco = sCodigoClienteBanco;
    }


    /**
     * Gets the nCliente value for this InsertCliente.
     * 
     * @return nCliente
     */
    public org.apache.axis.types.UnsignedByte getNCliente() {
        return nCliente;
    }


    /**
     * Sets the nCliente value for this InsertCliente.
     * 
     * @param nCliente
     */
    public void setNCliente(org.apache.axis.types.UnsignedByte nCliente) {
        this.nCliente = nCliente;
    }


    /**
     * Gets the nFornecedor value for this InsertCliente.
     * 
     * @return nFornecedor
     */
    public org.apache.axis.types.UnsignedByte getNFornecedor() {
        return nFornecedor;
    }


    /**
     * Sets the nFornecedor value for this InsertCliente.
     * 
     * @param nFornecedor
     */
    public void setNFornecedor(org.apache.axis.types.UnsignedByte nFornecedor) {
        this.nFornecedor = nFornecedor;
    }


    /**
     * Gets the nEscolaAluno value for this InsertCliente.
     * 
     * @return nEscolaAluno
     */
    public org.apache.axis.types.UnsignedByte getNEscolaAluno() {
        return nEscolaAluno;
    }


    /**
     * Sets the nEscolaAluno value for this InsertCliente.
     * 
     * @param nEscolaAluno
     */
    public void setNEscolaAluno(org.apache.axis.types.UnsignedByte nEscolaAluno) {
        this.nEscolaAluno = nEscolaAluno;
    }


    /**
     * Gets the nEmpresaAluno value for this InsertCliente.
     * 
     * @return nEmpresaAluno
     */
    public org.apache.axis.types.UnsignedByte getNEmpresaAluno() {
        return nEmpresaAluno;
    }


    /**
     * Sets the nEmpresaAluno value for this InsertCliente.
     * 
     * @param nEmpresaAluno
     */
    public void setNEmpresaAluno(org.apache.axis.types.UnsignedByte nEmpresaAluno) {
        this.nEmpresaAluno = nEmpresaAluno;
    }


    /**
     * Gets the sContato value for this InsertCliente.
     * 
     * @return sContato
     */
    public java.lang.String getSContato() {
        return sContato;
    }


    /**
     * Sets the sContato value for this InsertCliente.
     * 
     * @param sContato
     */
    public void setSContato(java.lang.String sContato) {
        this.sContato = sContato;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertCliente)) return false;
        InsertCliente other = (InsertCliente) obj;
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
            ((this.nSituacao==null && other.getNSituacao()==null) || 
             (this.nSituacao!=null &&
              this.nSituacao.equals(other.getNSituacao()))) &&
            ((this.nTipo==null && other.getNTipo()==null) || 
             (this.nTipo!=null &&
              this.nTipo.equals(other.getNTipo()))) &&
            ((this.sCPF==null && other.getSCPF()==null) || 
             (this.sCPF!=null &&
              this.sCPF.equals(other.getSCPF()))) &&
            ((this.sRG==null && other.getSRG()==null) || 
             (this.sRG!=null &&
              this.sRG.equals(other.getSRG()))) &&
            ((this.sCNPJ==null && other.getSCNPJ()==null) || 
             (this.sCNPJ!=null &&
              this.sCNPJ.equals(other.getSCNPJ()))) &&
            ((this.sRazaoSocial==null && other.getSRazaoSocial()==null) || 
             (this.sRazaoSocial!=null &&
              this.sRazaoSocial.equals(other.getSRazaoSocial()))) &&
            ((this.sCEP==null && other.getSCEP()==null) || 
             (this.sCEP!=null &&
              this.sCEP.equals(other.getSCEP()))) &&
            ((this.sEndereco==null && other.getSEndereco()==null) || 
             (this.sEndereco!=null &&
              this.sEndereco.equals(other.getSEndereco()))) &&
            ((this.sNumeroEndereco==null && other.getSNumeroEndereco()==null) || 
             (this.sNumeroEndereco!=null &&
              this.sNumeroEndereco.equals(other.getSNumeroEndereco()))) &&
            ((this.sComplementoEndereco==null && other.getSComplementoEndereco()==null) || 
             (this.sComplementoEndereco!=null &&
              this.sComplementoEndereco.equals(other.getSComplementoEndereco()))) &&
            ((this.sEmail==null && other.getSEmail()==null) || 
             (this.sEmail!=null &&
              this.sEmail.equals(other.getSEmail()))) &&
            ((this.sInscricaoEstadual==null && other.getSInscricaoEstadual()==null) || 
             (this.sInscricaoEstadual!=null &&
              this.sInscricaoEstadual.equals(other.getSInscricaoEstadual()))) &&
            ((this.sInscricaoMunicipal==null && other.getSInscricaoMunicipal()==null) || 
             (this.sInscricaoMunicipal!=null &&
              this.sInscricaoMunicipal.equals(other.getSInscricaoMunicipal()))) &&
            ((this.sObservacao==null && other.getSObservacao()==null) || 
             (this.sObservacao!=null &&
              this.sObservacao.equals(other.getSObservacao()))) &&
            ((this.sTelefone==null && other.getSTelefone()==null) || 
             (this.sTelefone!=null &&
              this.sTelefone.equals(other.getSTelefone()))) &&
            ((this.sRamal==null && other.getSRamal()==null) || 
             (this.sRamal!=null &&
              this.sRamal.equals(other.getSRamal()))) &&
            ((this.sCelular==null && other.getSCelular()==null) || 
             (this.sCelular!=null &&
              this.sCelular.equals(other.getSCelular()))) &&
            ((this.sTelefoneFax==null && other.getSTelefoneFax()==null) || 
             (this.sTelefoneFax!=null &&
              this.sTelefoneFax.equals(other.getSTelefoneFax()))) &&
            ((this.sCidade==null && other.getSCidade()==null) || 
             (this.sCidade!=null &&
              this.sCidade.equals(other.getSCidade()))) &&
            ((this.sBairro==null && other.getSBairro()==null) || 
             (this.sBairro!=null &&
              this.sBairro.equals(other.getSBairro()))) &&
            ((this.sAgencia==null && other.getSAgencia()==null) || 
             (this.sAgencia!=null &&
              this.sAgencia.equals(other.getSAgencia()))) &&
            ((this.sConta==null && other.getSConta()==null) || 
             (this.sConta!=null &&
              this.sConta.equals(other.getSConta()))) &&
            ((this.sCodigoClienteBanco==null && other.getSCodigoClienteBanco()==null) || 
             (this.sCodigoClienteBanco!=null &&
              this.sCodigoClienteBanco.equals(other.getSCodigoClienteBanco()))) &&
            ((this.nCliente==null && other.getNCliente()==null) || 
             (this.nCliente!=null &&
              this.nCliente.equals(other.getNCliente()))) &&
            ((this.nFornecedor==null && other.getNFornecedor()==null) || 
             (this.nFornecedor!=null &&
              this.nFornecedor.equals(other.getNFornecedor()))) &&
            ((this.nEscolaAluno==null && other.getNEscolaAluno()==null) || 
             (this.nEscolaAluno!=null &&
              this.nEscolaAluno.equals(other.getNEscolaAluno()))) &&
            ((this.nEmpresaAluno==null && other.getNEmpresaAluno()==null) || 
             (this.nEmpresaAluno!=null &&
              this.nEmpresaAluno.equals(other.getNEmpresaAluno()))) &&
            ((this.sContato==null && other.getSContato()==null) || 
             (this.sContato!=null &&
              this.sContato.equals(other.getSContato())));
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
        if (getNSituacao() != null) {
            _hashCode += getNSituacao().hashCode();
        }
        if (getNTipo() != null) {
            _hashCode += getNTipo().hashCode();
        }
        if (getSCPF() != null) {
            _hashCode += getSCPF().hashCode();
        }
        if (getSRG() != null) {
            _hashCode += getSRG().hashCode();
        }
        if (getSCNPJ() != null) {
            _hashCode += getSCNPJ().hashCode();
        }
        if (getSRazaoSocial() != null) {
            _hashCode += getSRazaoSocial().hashCode();
        }
        if (getSCEP() != null) {
            _hashCode += getSCEP().hashCode();
        }
        if (getSEndereco() != null) {
            _hashCode += getSEndereco().hashCode();
        }
        if (getSNumeroEndereco() != null) {
            _hashCode += getSNumeroEndereco().hashCode();
        }
        if (getSComplementoEndereco() != null) {
            _hashCode += getSComplementoEndereco().hashCode();
        }
        if (getSEmail() != null) {
            _hashCode += getSEmail().hashCode();
        }
        if (getSInscricaoEstadual() != null) {
            _hashCode += getSInscricaoEstadual().hashCode();
        }
        if (getSInscricaoMunicipal() != null) {
            _hashCode += getSInscricaoMunicipal().hashCode();
        }
        if (getSObservacao() != null) {
            _hashCode += getSObservacao().hashCode();
        }
        if (getSTelefone() != null) {
            _hashCode += getSTelefone().hashCode();
        }
        if (getSRamal() != null) {
            _hashCode += getSRamal().hashCode();
        }
        if (getSCelular() != null) {
            _hashCode += getSCelular().hashCode();
        }
        if (getSTelefoneFax() != null) {
            _hashCode += getSTelefoneFax().hashCode();
        }
        if (getSCidade() != null) {
            _hashCode += getSCidade().hashCode();
        }
        if (getSBairro() != null) {
            _hashCode += getSBairro().hashCode();
        }
        if (getSAgencia() != null) {
            _hashCode += getSAgencia().hashCode();
        }
        if (getSConta() != null) {
            _hashCode += getSConta().hashCode();
        }
        if (getSCodigoClienteBanco() != null) {
            _hashCode += getSCodigoClienteBanco().hashCode();
        }
        if (getNCliente() != null) {
            _hashCode += getNCliente().hashCode();
        }
        if (getNFornecedor() != null) {
            _hashCode += getNFornecedor().hashCode();
        }
        if (getNEscolaAluno() != null) {
            _hashCode += getNEscolaAluno().hashCode();
        }
        if (getNEmpresaAluno() != null) {
            _hashCode += getNEmpresaAluno().hashCode();
        }
        if (getSContato() != null) {
            _hashCode += getSContato().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertCliente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertCliente"));
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
        elemField.setFieldName("NSituacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nSituacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCPF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCPF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("SCNPJ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCNPJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SRazaoSocial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sRazaoSocial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("SNumeroEndereco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNumeroEndereco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SComplementoEndereco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sComplementoEndereco"));
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
        elemField.setFieldName("SInscricaoEstadual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sInscricaoEstadual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SInscricaoMunicipal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sInscricaoMunicipal"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STelefone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sTelefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SRamal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sRamal"));
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
        elemField.setFieldName("STelefoneFax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sTelefoneFax"));
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
        elemField.setFieldName("SAgencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sAgencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SConta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sConta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCodigoClienteBanco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCodigoClienteBanco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NFornecedor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFornecedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NEscolaAluno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nEscolaAluno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NEmpresaAluno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nEmpresaAluno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SContato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sContato"));
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
