/**
 * WsAluno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsAluno  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int alunoID;

    private java.lang.String nome;

    private java.lang.String CPF;

    private java.lang.String RG;

    private java.lang.String midia;

    private java.lang.String dataNascimento;

    private java.lang.String CEP;

    private java.lang.String endereco;

    private java.lang.String numeroEndereco;

    private java.lang.String email;

    private java.lang.String dataCadastro;

    private java.lang.String RA;

    private java.lang.String loginPortal;

    private java.lang.String senhaPortal;

    private java.lang.String observacao;

    private java.lang.String telefone;

    private java.lang.String celular;

    private java.lang.String turmaAtual;

    private int responsavelFinanceiroID;

    private int responsavelDidaticoID;

    private java.lang.String numeroMatricula;

    private java.lang.String sexo;

    private java.lang.String situacao;

    private java.lang.String cidade;

    private java.lang.String bairro;

    private java.lang.String cidadeNatal;

    private java.lang.String inadimplente;

    private int origem;

    private java.lang.String nomeOrigem;

    private java.lang.String cursoInteresse;

    private br.net.sponteeducacional.api.WsResponsaveis[] responsaveis;

    public WsAluno() {
    }

    public WsAluno(
           java.lang.String retornoOperacao,
           int alunoID,
           java.lang.String nome,
           java.lang.String CPF,
           java.lang.String RG,
           java.lang.String midia,
           java.lang.String dataNascimento,
           java.lang.String CEP,
           java.lang.String endereco,
           java.lang.String numeroEndereco,
           java.lang.String email,
           java.lang.String dataCadastro,
           java.lang.String RA,
           java.lang.String loginPortal,
           java.lang.String senhaPortal,
           java.lang.String observacao,
           java.lang.String telefone,
           java.lang.String celular,
           java.lang.String turmaAtual,
           int responsavelFinanceiroID,
           int responsavelDidaticoID,
           java.lang.String numeroMatricula,
           java.lang.String sexo,
           java.lang.String situacao,
           java.lang.String cidade,
           java.lang.String bairro,
           java.lang.String cidadeNatal,
           java.lang.String inadimplente,
           int origem,
           java.lang.String nomeOrigem,
           java.lang.String cursoInteresse,
           br.net.sponteeducacional.api.WsResponsaveis[] responsaveis) {
           this.retornoOperacao = retornoOperacao;
           this.alunoID = alunoID;
           this.nome = nome;
           this.CPF = CPF;
           this.RG = RG;
           this.midia = midia;
           this.dataNascimento = dataNascimento;
           this.CEP = CEP;
           this.endereco = endereco;
           this.numeroEndereco = numeroEndereco;
           this.email = email;
           this.dataCadastro = dataCadastro;
           this.RA = RA;
           this.loginPortal = loginPortal;
           this.senhaPortal = senhaPortal;
           this.observacao = observacao;
           this.telefone = telefone;
           this.celular = celular;
           this.turmaAtual = turmaAtual;
           this.responsavelFinanceiroID = responsavelFinanceiroID;
           this.responsavelDidaticoID = responsavelDidaticoID;
           this.numeroMatricula = numeroMatricula;
           this.sexo = sexo;
           this.situacao = situacao;
           this.cidade = cidade;
           this.bairro = bairro;
           this.cidadeNatal = cidadeNatal;
           this.inadimplente = inadimplente;
           this.origem = origem;
           this.nomeOrigem = nomeOrigem;
           this.cursoInteresse = cursoInteresse;
           this.responsaveis = responsaveis;
    }


    /**
     * Gets the retornoOperacao value for this WsAluno.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsAluno.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the alunoID value for this WsAluno.
     * 
     * @return alunoID
     */
    public int getAlunoID() {
        return alunoID;
    }


    /**
     * Sets the alunoID value for this WsAluno.
     * 
     * @param alunoID
     */
    public void setAlunoID(int alunoID) {
        this.alunoID = alunoID;
    }


    /**
     * Gets the nome value for this WsAluno.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this WsAluno.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the CPF value for this WsAluno.
     * 
     * @return CPF
     */
    public java.lang.String getCPF() {
        return CPF;
    }


    /**
     * Sets the CPF value for this WsAluno.
     * 
     * @param CPF
     */
    public void setCPF(java.lang.String CPF) {
        this.CPF = CPF;
    }


    /**
     * Gets the RG value for this WsAluno.
     * 
     * @return RG
     */
    public java.lang.String getRG() {
        return RG;
    }


    /**
     * Sets the RG value for this WsAluno.
     * 
     * @param RG
     */
    public void setRG(java.lang.String RG) {
        this.RG = RG;
    }


    /**
     * Gets the midia value for this WsAluno.
     * 
     * @return midia
     */
    public java.lang.String getMidia() {
        return midia;
    }


    /**
     * Sets the midia value for this WsAluno.
     * 
     * @param midia
     */
    public void setMidia(java.lang.String midia) {
        this.midia = midia;
    }


    /**
     * Gets the dataNascimento value for this WsAluno.
     * 
     * @return dataNascimento
     */
    public java.lang.String getDataNascimento() {
        return dataNascimento;
    }


    /**
     * Sets the dataNascimento value for this WsAluno.
     * 
     * @param dataNascimento
     */
    public void setDataNascimento(java.lang.String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    /**
     * Gets the CEP value for this WsAluno.
     * 
     * @return CEP
     */
    public java.lang.String getCEP() {
        return CEP;
    }


    /**
     * Sets the CEP value for this WsAluno.
     * 
     * @param CEP
     */
    public void setCEP(java.lang.String CEP) {
        this.CEP = CEP;
    }


    /**
     * Gets the endereco value for this WsAluno.
     * 
     * @return endereco
     */
    public java.lang.String getEndereco() {
        return endereco;
    }


    /**
     * Sets the endereco value for this WsAluno.
     * 
     * @param endereco
     */
    public void setEndereco(java.lang.String endereco) {
        this.endereco = endereco;
    }


    /**
     * Gets the numeroEndereco value for this WsAluno.
     * 
     * @return numeroEndereco
     */
    public java.lang.String getNumeroEndereco() {
        return numeroEndereco;
    }


    /**
     * Sets the numeroEndereco value for this WsAluno.
     * 
     * @param numeroEndereco
     */
    public void setNumeroEndereco(java.lang.String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }


    /**
     * Gets the email value for this WsAluno.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this WsAluno.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the dataCadastro value for this WsAluno.
     * 
     * @return dataCadastro
     */
    public java.lang.String getDataCadastro() {
        return dataCadastro;
    }


    /**
     * Sets the dataCadastro value for this WsAluno.
     * 
     * @param dataCadastro
     */
    public void setDataCadastro(java.lang.String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }


    /**
     * Gets the RA value for this WsAluno.
     * 
     * @return RA
     */
    public java.lang.String getRA() {
        return RA;
    }


    /**
     * Sets the RA value for this WsAluno.
     * 
     * @param RA
     */
    public void setRA(java.lang.String RA) {
        this.RA = RA;
    }


    /**
     * Gets the loginPortal value for this WsAluno.
     * 
     * @return loginPortal
     */
    public java.lang.String getLoginPortal() {
        return loginPortal;
    }


    /**
     * Sets the loginPortal value for this WsAluno.
     * 
     * @param loginPortal
     */
    public void setLoginPortal(java.lang.String loginPortal) {
        this.loginPortal = loginPortal;
    }


    /**
     * Gets the senhaPortal value for this WsAluno.
     * 
     * @return senhaPortal
     */
    public java.lang.String getSenhaPortal() {
        return senhaPortal;
    }


    /**
     * Sets the senhaPortal value for this WsAluno.
     * 
     * @param senhaPortal
     */
    public void setSenhaPortal(java.lang.String senhaPortal) {
        this.senhaPortal = senhaPortal;
    }


    /**
     * Gets the observacao value for this WsAluno.
     * 
     * @return observacao
     */
    public java.lang.String getObservacao() {
        return observacao;
    }


    /**
     * Sets the observacao value for this WsAluno.
     * 
     * @param observacao
     */
    public void setObservacao(java.lang.String observacao) {
        this.observacao = observacao;
    }


    /**
     * Gets the telefone value for this WsAluno.
     * 
     * @return telefone
     */
    public java.lang.String getTelefone() {
        return telefone;
    }


    /**
     * Sets the telefone value for this WsAluno.
     * 
     * @param telefone
     */
    public void setTelefone(java.lang.String telefone) {
        this.telefone = telefone;
    }


    /**
     * Gets the celular value for this WsAluno.
     * 
     * @return celular
     */
    public java.lang.String getCelular() {
        return celular;
    }


    /**
     * Sets the celular value for this WsAluno.
     * 
     * @param celular
     */
    public void setCelular(java.lang.String celular) {
        this.celular = celular;
    }


    /**
     * Gets the turmaAtual value for this WsAluno.
     * 
     * @return turmaAtual
     */
    public java.lang.String getTurmaAtual() {
        return turmaAtual;
    }


    /**
     * Sets the turmaAtual value for this WsAluno.
     * 
     * @param turmaAtual
     */
    public void setTurmaAtual(java.lang.String turmaAtual) {
        this.turmaAtual = turmaAtual;
    }


    /**
     * Gets the responsavelFinanceiroID value for this WsAluno.
     * 
     * @return responsavelFinanceiroID
     */
    public int getResponsavelFinanceiroID() {
        return responsavelFinanceiroID;
    }


    /**
     * Sets the responsavelFinanceiroID value for this WsAluno.
     * 
     * @param responsavelFinanceiroID
     */
    public void setResponsavelFinanceiroID(int responsavelFinanceiroID) {
        this.responsavelFinanceiroID = responsavelFinanceiroID;
    }


    /**
     * Gets the responsavelDidaticoID value for this WsAluno.
     * 
     * @return responsavelDidaticoID
     */
    public int getResponsavelDidaticoID() {
        return responsavelDidaticoID;
    }


    /**
     * Sets the responsavelDidaticoID value for this WsAluno.
     * 
     * @param responsavelDidaticoID
     */
    public void setResponsavelDidaticoID(int responsavelDidaticoID) {
        this.responsavelDidaticoID = responsavelDidaticoID;
    }


    /**
     * Gets the numeroMatricula value for this WsAluno.
     * 
     * @return numeroMatricula
     */
    public java.lang.String getNumeroMatricula() {
        return numeroMatricula;
    }


    /**
     * Sets the numeroMatricula value for this WsAluno.
     * 
     * @param numeroMatricula
     */
    public void setNumeroMatricula(java.lang.String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }


    /**
     * Gets the sexo value for this WsAluno.
     * 
     * @return sexo
     */
    public java.lang.String getSexo() {
        return sexo;
    }


    /**
     * Sets the sexo value for this WsAluno.
     * 
     * @param sexo
     */
    public void setSexo(java.lang.String sexo) {
        this.sexo = sexo;
    }


    /**
     * Gets the situacao value for this WsAluno.
     * 
     * @return situacao
     */
    public java.lang.String getSituacao() {
        return situacao;
    }


    /**
     * Sets the situacao value for this WsAluno.
     * 
     * @param situacao
     */
    public void setSituacao(java.lang.String situacao) {
        this.situacao = situacao;
    }


    /**
     * Gets the cidade value for this WsAluno.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this WsAluno.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the bairro value for this WsAluno.
     * 
     * @return bairro
     */
    public java.lang.String getBairro() {
        return bairro;
    }


    /**
     * Sets the bairro value for this WsAluno.
     * 
     * @param bairro
     */
    public void setBairro(java.lang.String bairro) {
        this.bairro = bairro;
    }


    /**
     * Gets the cidadeNatal value for this WsAluno.
     * 
     * @return cidadeNatal
     */
    public java.lang.String getCidadeNatal() {
        return cidadeNatal;
    }


    /**
     * Sets the cidadeNatal value for this WsAluno.
     * 
     * @param cidadeNatal
     */
    public void setCidadeNatal(java.lang.String cidadeNatal) {
        this.cidadeNatal = cidadeNatal;
    }


    /**
     * Gets the inadimplente value for this WsAluno.
     * 
     * @return inadimplente
     */
    public java.lang.String getInadimplente() {
        return inadimplente;
    }


    /**
     * Sets the inadimplente value for this WsAluno.
     * 
     * @param inadimplente
     */
    public void setInadimplente(java.lang.String inadimplente) {
        this.inadimplente = inadimplente;
    }


    /**
     * Gets the origem value for this WsAluno.
     * 
     * @return origem
     */
    public int getOrigem() {
        return origem;
    }


    /**
     * Sets the origem value for this WsAluno.
     * 
     * @param origem
     */
    public void setOrigem(int origem) {
        this.origem = origem;
    }


    /**
     * Gets the nomeOrigem value for this WsAluno.
     * 
     * @return nomeOrigem
     */
    public java.lang.String getNomeOrigem() {
        return nomeOrigem;
    }


    /**
     * Sets the nomeOrigem value for this WsAluno.
     * 
     * @param nomeOrigem
     */
    public void setNomeOrigem(java.lang.String nomeOrigem) {
        this.nomeOrigem = nomeOrigem;
    }


    /**
     * Gets the cursoInteresse value for this WsAluno.
     * 
     * @return cursoInteresse
     */
    public java.lang.String getCursoInteresse() {
        return cursoInteresse;
    }


    /**
     * Sets the cursoInteresse value for this WsAluno.
     * 
     * @param cursoInteresse
     */
    public void setCursoInteresse(java.lang.String cursoInteresse) {
        this.cursoInteresse = cursoInteresse;
    }


    /**
     * Gets the responsaveis value for this WsAluno.
     * 
     * @return responsaveis
     */
    public br.net.sponteeducacional.api.WsResponsaveis[] getResponsaveis() {
        return responsaveis;
    }


    /**
     * Sets the responsaveis value for this WsAluno.
     * 
     * @param responsaveis
     */
    public void setResponsaveis(br.net.sponteeducacional.api.WsResponsaveis[] responsaveis) {
        this.responsaveis = responsaveis;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsAluno)) return false;
        WsAluno other = (WsAluno) obj;
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
            this.alunoID == other.getAlunoID() &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.CPF==null && other.getCPF()==null) || 
             (this.CPF!=null &&
              this.CPF.equals(other.getCPF()))) &&
            ((this.RG==null && other.getRG()==null) || 
             (this.RG!=null &&
              this.RG.equals(other.getRG()))) &&
            ((this.midia==null && other.getMidia()==null) || 
             (this.midia!=null &&
              this.midia.equals(other.getMidia()))) &&
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
            ((this.dataCadastro==null && other.getDataCadastro()==null) || 
             (this.dataCadastro!=null &&
              this.dataCadastro.equals(other.getDataCadastro()))) &&
            ((this.RA==null && other.getRA()==null) || 
             (this.RA!=null &&
              this.RA.equals(other.getRA()))) &&
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
            ((this.turmaAtual==null && other.getTurmaAtual()==null) || 
             (this.turmaAtual!=null &&
              this.turmaAtual.equals(other.getTurmaAtual()))) &&
            this.responsavelFinanceiroID == other.getResponsavelFinanceiroID() &&
            this.responsavelDidaticoID == other.getResponsavelDidaticoID() &&
            ((this.numeroMatricula==null && other.getNumeroMatricula()==null) || 
             (this.numeroMatricula!=null &&
              this.numeroMatricula.equals(other.getNumeroMatricula()))) &&
            ((this.sexo==null && other.getSexo()==null) || 
             (this.sexo!=null &&
              this.sexo.equals(other.getSexo()))) &&
            ((this.situacao==null && other.getSituacao()==null) || 
             (this.situacao!=null &&
              this.situacao.equals(other.getSituacao()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.bairro==null && other.getBairro()==null) || 
             (this.bairro!=null &&
              this.bairro.equals(other.getBairro()))) &&
            ((this.cidadeNatal==null && other.getCidadeNatal()==null) || 
             (this.cidadeNatal!=null &&
              this.cidadeNatal.equals(other.getCidadeNatal()))) &&
            ((this.inadimplente==null && other.getInadimplente()==null) || 
             (this.inadimplente!=null &&
              this.inadimplente.equals(other.getInadimplente()))) &&
            this.origem == other.getOrigem() &&
            ((this.nomeOrigem==null && other.getNomeOrigem()==null) || 
             (this.nomeOrigem!=null &&
              this.nomeOrigem.equals(other.getNomeOrigem()))) &&
            ((this.cursoInteresse==null && other.getCursoInteresse()==null) || 
             (this.cursoInteresse!=null &&
              this.cursoInteresse.equals(other.getCursoInteresse()))) &&
            ((this.responsaveis==null && other.getResponsaveis()==null) || 
             (this.responsaveis!=null &&
              java.util.Arrays.equals(this.responsaveis, other.getResponsaveis())));
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
        _hashCode += getAlunoID();
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getCPF() != null) {
            _hashCode += getCPF().hashCode();
        }
        if (getRG() != null) {
            _hashCode += getRG().hashCode();
        }
        if (getMidia() != null) {
            _hashCode += getMidia().hashCode();
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
        if (getDataCadastro() != null) {
            _hashCode += getDataCadastro().hashCode();
        }
        if (getRA() != null) {
            _hashCode += getRA().hashCode();
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
        if (getTurmaAtual() != null) {
            _hashCode += getTurmaAtual().hashCode();
        }
        _hashCode += getResponsavelFinanceiroID();
        _hashCode += getResponsavelDidaticoID();
        if (getNumeroMatricula() != null) {
            _hashCode += getNumeroMatricula().hashCode();
        }
        if (getSexo() != null) {
            _hashCode += getSexo().hashCode();
        }
        if (getSituacao() != null) {
            _hashCode += getSituacao().hashCode();
        }
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getBairro() != null) {
            _hashCode += getBairro().hashCode();
        }
        if (getCidadeNatal() != null) {
            _hashCode += getCidadeNatal().hashCode();
        }
        if (getInadimplente() != null) {
            _hashCode += getInadimplente().hashCode();
        }
        _hashCode += getOrigem();
        if (getNomeOrigem() != null) {
            _hashCode += getNomeOrigem().hashCode();
        }
        if (getCursoInteresse() != null) {
            _hashCode += getCursoInteresse().hashCode();
        }
        if (getResponsaveis() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponsaveis());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponsaveis(), i);
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
        new org.apache.axis.description.TypeDesc(WsAluno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAluno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alunoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AlunoID"));
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
        elemField.setFieldName("CPF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CPF"));
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
        elemField.setFieldName("midia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Midia"));
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
        elemField.setFieldName("dataCadastro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataCadastro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RA"));
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
        elemField.setFieldName("turmaAtual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TurmaAtual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsavelFinanceiroID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ResponsavelFinanceiroID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsavelDidaticoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ResponsavelDidaticoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroMatricula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroMatricula"));
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
        elemField.setFieldName("situacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Situacao"));
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
        elemField.setFieldName("cidadeNatal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CidadeNatal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inadimplente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Inadimplente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Origem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cursoInteresse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CursoInteresse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsaveis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Responsaveis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsResponsaveis"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsResponsaveis"));
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
