/**
 * PlanoCurso.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class PlanoCurso  implements java.io.Serializable {
    private int cursoID;

    private int planoCursoID;

    private java.lang.String descricaoPlano;

    private int situacao;

    private int padrao;

    private double valorPrimeiraParcelaMensalidade;

    private java.lang.String dataPrimeiraParcelaMensalidade;

    private int numeroParcelasMensalidade;

    private double valorParcelaMensalidade;

    private java.lang.String dataInicialMensalidade;

    private int bolsaIDMensalidade;

    private java.lang.String descricaoBolsaMensalidade;

    private int planoContaIDMensalidade;

    private java.lang.String descricaoPlanoContaMensalidade;

    private int numeroParcelasMaterial;

    private double valorParcelaMaterial;

    private java.lang.String dataInicialMaterial;

    private int itemEstoqueIDMaterial;

    private java.lang.String descricaoItemMaterial;

    private int planoContaIDMaterial;

    private java.lang.String descricaoPlanoMaterial;

    private int numeroParcelasMatricula;

    private double valorParcelaMatricula;

    private java.lang.String dataInicialMatricula;

    private int planoContaIDMatricula;

    private java.lang.String descricaoPlanoMatricula;

    private int numeroParcelasOutros;

    private double valorParcelaOutros;

    private java.lang.String dataInicialOutros;

    private int planoContaIDOutros;

    private java.lang.String descricaoPlanoOutros;

    private int mesConsiderarAtual;

    public PlanoCurso() {
    }

    public PlanoCurso(
           int cursoID,
           int planoCursoID,
           java.lang.String descricaoPlano,
           int situacao,
           int padrao,
           double valorPrimeiraParcelaMensalidade,
           java.lang.String dataPrimeiraParcelaMensalidade,
           int numeroParcelasMensalidade,
           double valorParcelaMensalidade,
           java.lang.String dataInicialMensalidade,
           int bolsaIDMensalidade,
           java.lang.String descricaoBolsaMensalidade,
           int planoContaIDMensalidade,
           java.lang.String descricaoPlanoContaMensalidade,
           int numeroParcelasMaterial,
           double valorParcelaMaterial,
           java.lang.String dataInicialMaterial,
           int itemEstoqueIDMaterial,
           java.lang.String descricaoItemMaterial,
           int planoContaIDMaterial,
           java.lang.String descricaoPlanoMaterial,
           int numeroParcelasMatricula,
           double valorParcelaMatricula,
           java.lang.String dataInicialMatricula,
           int planoContaIDMatricula,
           java.lang.String descricaoPlanoMatricula,
           int numeroParcelasOutros,
           double valorParcelaOutros,
           java.lang.String dataInicialOutros,
           int planoContaIDOutros,
           java.lang.String descricaoPlanoOutros,
           int mesConsiderarAtual) {
           this.cursoID = cursoID;
           this.planoCursoID = planoCursoID;
           this.descricaoPlano = descricaoPlano;
           this.situacao = situacao;
           this.padrao = padrao;
           this.valorPrimeiraParcelaMensalidade = valorPrimeiraParcelaMensalidade;
           this.dataPrimeiraParcelaMensalidade = dataPrimeiraParcelaMensalidade;
           this.numeroParcelasMensalidade = numeroParcelasMensalidade;
           this.valorParcelaMensalidade = valorParcelaMensalidade;
           this.dataInicialMensalidade = dataInicialMensalidade;
           this.bolsaIDMensalidade = bolsaIDMensalidade;
           this.descricaoBolsaMensalidade = descricaoBolsaMensalidade;
           this.planoContaIDMensalidade = planoContaIDMensalidade;
           this.descricaoPlanoContaMensalidade = descricaoPlanoContaMensalidade;
           this.numeroParcelasMaterial = numeroParcelasMaterial;
           this.valorParcelaMaterial = valorParcelaMaterial;
           this.dataInicialMaterial = dataInicialMaterial;
           this.itemEstoqueIDMaterial = itemEstoqueIDMaterial;
           this.descricaoItemMaterial = descricaoItemMaterial;
           this.planoContaIDMaterial = planoContaIDMaterial;
           this.descricaoPlanoMaterial = descricaoPlanoMaterial;
           this.numeroParcelasMatricula = numeroParcelasMatricula;
           this.valorParcelaMatricula = valorParcelaMatricula;
           this.dataInicialMatricula = dataInicialMatricula;
           this.planoContaIDMatricula = planoContaIDMatricula;
           this.descricaoPlanoMatricula = descricaoPlanoMatricula;
           this.numeroParcelasOutros = numeroParcelasOutros;
           this.valorParcelaOutros = valorParcelaOutros;
           this.dataInicialOutros = dataInicialOutros;
           this.planoContaIDOutros = planoContaIDOutros;
           this.descricaoPlanoOutros = descricaoPlanoOutros;
           this.mesConsiderarAtual = mesConsiderarAtual;
    }


    /**
     * Gets the cursoID value for this PlanoCurso.
     * 
     * @return cursoID
     */
    public int getCursoID() {
        return cursoID;
    }


    /**
     * Sets the cursoID value for this PlanoCurso.
     * 
     * @param cursoID
     */
    public void setCursoID(int cursoID) {
        this.cursoID = cursoID;
    }


    /**
     * Gets the planoCursoID value for this PlanoCurso.
     * 
     * @return planoCursoID
     */
    public int getPlanoCursoID() {
        return planoCursoID;
    }


    /**
     * Sets the planoCursoID value for this PlanoCurso.
     * 
     * @param planoCursoID
     */
    public void setPlanoCursoID(int planoCursoID) {
        this.planoCursoID = planoCursoID;
    }


    /**
     * Gets the descricaoPlano value for this PlanoCurso.
     * 
     * @return descricaoPlano
     */
    public java.lang.String getDescricaoPlano() {
        return descricaoPlano;
    }


    /**
     * Sets the descricaoPlano value for this PlanoCurso.
     * 
     * @param descricaoPlano
     */
    public void setDescricaoPlano(java.lang.String descricaoPlano) {
        this.descricaoPlano = descricaoPlano;
    }


    /**
     * Gets the situacao value for this PlanoCurso.
     * 
     * @return situacao
     */
    public int getSituacao() {
        return situacao;
    }


    /**
     * Sets the situacao value for this PlanoCurso.
     * 
     * @param situacao
     */
    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }


    /**
     * Gets the padrao value for this PlanoCurso.
     * 
     * @return padrao
     */
    public int getPadrao() {
        return padrao;
    }


    /**
     * Sets the padrao value for this PlanoCurso.
     * 
     * @param padrao
     */
    public void setPadrao(int padrao) {
        this.padrao = padrao;
    }


    /**
     * Gets the valorPrimeiraParcelaMensalidade value for this PlanoCurso.
     * 
     * @return valorPrimeiraParcelaMensalidade
     */
    public double getValorPrimeiraParcelaMensalidade() {
        return valorPrimeiraParcelaMensalidade;
    }


    /**
     * Sets the valorPrimeiraParcelaMensalidade value for this PlanoCurso.
     * 
     * @param valorPrimeiraParcelaMensalidade
     */
    public void setValorPrimeiraParcelaMensalidade(double valorPrimeiraParcelaMensalidade) {
        this.valorPrimeiraParcelaMensalidade = valorPrimeiraParcelaMensalidade;
    }


    /**
     * Gets the dataPrimeiraParcelaMensalidade value for this PlanoCurso.
     * 
     * @return dataPrimeiraParcelaMensalidade
     */
    public java.lang.String getDataPrimeiraParcelaMensalidade() {
        return dataPrimeiraParcelaMensalidade;
    }


    /**
     * Sets the dataPrimeiraParcelaMensalidade value for this PlanoCurso.
     * 
     * @param dataPrimeiraParcelaMensalidade
     */
    public void setDataPrimeiraParcelaMensalidade(java.lang.String dataPrimeiraParcelaMensalidade) {
        this.dataPrimeiraParcelaMensalidade = dataPrimeiraParcelaMensalidade;
    }


    /**
     * Gets the numeroParcelasMensalidade value for this PlanoCurso.
     * 
     * @return numeroParcelasMensalidade
     */
    public int getNumeroParcelasMensalidade() {
        return numeroParcelasMensalidade;
    }


    /**
     * Sets the numeroParcelasMensalidade value for this PlanoCurso.
     * 
     * @param numeroParcelasMensalidade
     */
    public void setNumeroParcelasMensalidade(int numeroParcelasMensalidade) {
        this.numeroParcelasMensalidade = numeroParcelasMensalidade;
    }


    /**
     * Gets the valorParcelaMensalidade value for this PlanoCurso.
     * 
     * @return valorParcelaMensalidade
     */
    public double getValorParcelaMensalidade() {
        return valorParcelaMensalidade;
    }


    /**
     * Sets the valorParcelaMensalidade value for this PlanoCurso.
     * 
     * @param valorParcelaMensalidade
     */
    public void setValorParcelaMensalidade(double valorParcelaMensalidade) {
        this.valorParcelaMensalidade = valorParcelaMensalidade;
    }


    /**
     * Gets the dataInicialMensalidade value for this PlanoCurso.
     * 
     * @return dataInicialMensalidade
     */
    public java.lang.String getDataInicialMensalidade() {
        return dataInicialMensalidade;
    }


    /**
     * Sets the dataInicialMensalidade value for this PlanoCurso.
     * 
     * @param dataInicialMensalidade
     */
    public void setDataInicialMensalidade(java.lang.String dataInicialMensalidade) {
        this.dataInicialMensalidade = dataInicialMensalidade;
    }


    /**
     * Gets the bolsaIDMensalidade value for this PlanoCurso.
     * 
     * @return bolsaIDMensalidade
     */
    public int getBolsaIDMensalidade() {
        return bolsaIDMensalidade;
    }


    /**
     * Sets the bolsaIDMensalidade value for this PlanoCurso.
     * 
     * @param bolsaIDMensalidade
     */
    public void setBolsaIDMensalidade(int bolsaIDMensalidade) {
        this.bolsaIDMensalidade = bolsaIDMensalidade;
    }


    /**
     * Gets the descricaoBolsaMensalidade value for this PlanoCurso.
     * 
     * @return descricaoBolsaMensalidade
     */
    public java.lang.String getDescricaoBolsaMensalidade() {
        return descricaoBolsaMensalidade;
    }


    /**
     * Sets the descricaoBolsaMensalidade value for this PlanoCurso.
     * 
     * @param descricaoBolsaMensalidade
     */
    public void setDescricaoBolsaMensalidade(java.lang.String descricaoBolsaMensalidade) {
        this.descricaoBolsaMensalidade = descricaoBolsaMensalidade;
    }


    /**
     * Gets the planoContaIDMensalidade value for this PlanoCurso.
     * 
     * @return planoContaIDMensalidade
     */
    public int getPlanoContaIDMensalidade() {
        return planoContaIDMensalidade;
    }


    /**
     * Sets the planoContaIDMensalidade value for this PlanoCurso.
     * 
     * @param planoContaIDMensalidade
     */
    public void setPlanoContaIDMensalidade(int planoContaIDMensalidade) {
        this.planoContaIDMensalidade = planoContaIDMensalidade;
    }


    /**
     * Gets the descricaoPlanoContaMensalidade value for this PlanoCurso.
     * 
     * @return descricaoPlanoContaMensalidade
     */
    public java.lang.String getDescricaoPlanoContaMensalidade() {
        return descricaoPlanoContaMensalidade;
    }


    /**
     * Sets the descricaoPlanoContaMensalidade value for this PlanoCurso.
     * 
     * @param descricaoPlanoContaMensalidade
     */
    public void setDescricaoPlanoContaMensalidade(java.lang.String descricaoPlanoContaMensalidade) {
        this.descricaoPlanoContaMensalidade = descricaoPlanoContaMensalidade;
    }


    /**
     * Gets the numeroParcelasMaterial value for this PlanoCurso.
     * 
     * @return numeroParcelasMaterial
     */
    public int getNumeroParcelasMaterial() {
        return numeroParcelasMaterial;
    }


    /**
     * Sets the numeroParcelasMaterial value for this PlanoCurso.
     * 
     * @param numeroParcelasMaterial
     */
    public void setNumeroParcelasMaterial(int numeroParcelasMaterial) {
        this.numeroParcelasMaterial = numeroParcelasMaterial;
    }


    /**
     * Gets the valorParcelaMaterial value for this PlanoCurso.
     * 
     * @return valorParcelaMaterial
     */
    public double getValorParcelaMaterial() {
        return valorParcelaMaterial;
    }


    /**
     * Sets the valorParcelaMaterial value for this PlanoCurso.
     * 
     * @param valorParcelaMaterial
     */
    public void setValorParcelaMaterial(double valorParcelaMaterial) {
        this.valorParcelaMaterial = valorParcelaMaterial;
    }


    /**
     * Gets the dataInicialMaterial value for this PlanoCurso.
     * 
     * @return dataInicialMaterial
     */
    public java.lang.String getDataInicialMaterial() {
        return dataInicialMaterial;
    }


    /**
     * Sets the dataInicialMaterial value for this PlanoCurso.
     * 
     * @param dataInicialMaterial
     */
    public void setDataInicialMaterial(java.lang.String dataInicialMaterial) {
        this.dataInicialMaterial = dataInicialMaterial;
    }


    /**
     * Gets the itemEstoqueIDMaterial value for this PlanoCurso.
     * 
     * @return itemEstoqueIDMaterial
     */
    public int getItemEstoqueIDMaterial() {
        return itemEstoqueIDMaterial;
    }


    /**
     * Sets the itemEstoqueIDMaterial value for this PlanoCurso.
     * 
     * @param itemEstoqueIDMaterial
     */
    public void setItemEstoqueIDMaterial(int itemEstoqueIDMaterial) {
        this.itemEstoqueIDMaterial = itemEstoqueIDMaterial;
    }


    /**
     * Gets the descricaoItemMaterial value for this PlanoCurso.
     * 
     * @return descricaoItemMaterial
     */
    public java.lang.String getDescricaoItemMaterial() {
        return descricaoItemMaterial;
    }


    /**
     * Sets the descricaoItemMaterial value for this PlanoCurso.
     * 
     * @param descricaoItemMaterial
     */
    public void setDescricaoItemMaterial(java.lang.String descricaoItemMaterial) {
        this.descricaoItemMaterial = descricaoItemMaterial;
    }


    /**
     * Gets the planoContaIDMaterial value for this PlanoCurso.
     * 
     * @return planoContaIDMaterial
     */
    public int getPlanoContaIDMaterial() {
        return planoContaIDMaterial;
    }


    /**
     * Sets the planoContaIDMaterial value for this PlanoCurso.
     * 
     * @param planoContaIDMaterial
     */
    public void setPlanoContaIDMaterial(int planoContaIDMaterial) {
        this.planoContaIDMaterial = planoContaIDMaterial;
    }


    /**
     * Gets the descricaoPlanoMaterial value for this PlanoCurso.
     * 
     * @return descricaoPlanoMaterial
     */
    public java.lang.String getDescricaoPlanoMaterial() {
        return descricaoPlanoMaterial;
    }


    /**
     * Sets the descricaoPlanoMaterial value for this PlanoCurso.
     * 
     * @param descricaoPlanoMaterial
     */
    public void setDescricaoPlanoMaterial(java.lang.String descricaoPlanoMaterial) {
        this.descricaoPlanoMaterial = descricaoPlanoMaterial;
    }


    /**
     * Gets the numeroParcelasMatricula value for this PlanoCurso.
     * 
     * @return numeroParcelasMatricula
     */
    public int getNumeroParcelasMatricula() {
        return numeroParcelasMatricula;
    }


    /**
     * Sets the numeroParcelasMatricula value for this PlanoCurso.
     * 
     * @param numeroParcelasMatricula
     */
    public void setNumeroParcelasMatricula(int numeroParcelasMatricula) {
        this.numeroParcelasMatricula = numeroParcelasMatricula;
    }


    /**
     * Gets the valorParcelaMatricula value for this PlanoCurso.
     * 
     * @return valorParcelaMatricula
     */
    public double getValorParcelaMatricula() {
        return valorParcelaMatricula;
    }


    /**
     * Sets the valorParcelaMatricula value for this PlanoCurso.
     * 
     * @param valorParcelaMatricula
     */
    public void setValorParcelaMatricula(double valorParcelaMatricula) {
        this.valorParcelaMatricula = valorParcelaMatricula;
    }


    /**
     * Gets the dataInicialMatricula value for this PlanoCurso.
     * 
     * @return dataInicialMatricula
     */
    public java.lang.String getDataInicialMatricula() {
        return dataInicialMatricula;
    }


    /**
     * Sets the dataInicialMatricula value for this PlanoCurso.
     * 
     * @param dataInicialMatricula
     */
    public void setDataInicialMatricula(java.lang.String dataInicialMatricula) {
        this.dataInicialMatricula = dataInicialMatricula;
    }


    /**
     * Gets the planoContaIDMatricula value for this PlanoCurso.
     * 
     * @return planoContaIDMatricula
     */
    public int getPlanoContaIDMatricula() {
        return planoContaIDMatricula;
    }


    /**
     * Sets the planoContaIDMatricula value for this PlanoCurso.
     * 
     * @param planoContaIDMatricula
     */
    public void setPlanoContaIDMatricula(int planoContaIDMatricula) {
        this.planoContaIDMatricula = planoContaIDMatricula;
    }


    /**
     * Gets the descricaoPlanoMatricula value for this PlanoCurso.
     * 
     * @return descricaoPlanoMatricula
     */
    public java.lang.String getDescricaoPlanoMatricula() {
        return descricaoPlanoMatricula;
    }


    /**
     * Sets the descricaoPlanoMatricula value for this PlanoCurso.
     * 
     * @param descricaoPlanoMatricula
     */
    public void setDescricaoPlanoMatricula(java.lang.String descricaoPlanoMatricula) {
        this.descricaoPlanoMatricula = descricaoPlanoMatricula;
    }


    /**
     * Gets the numeroParcelasOutros value for this PlanoCurso.
     * 
     * @return numeroParcelasOutros
     */
    public int getNumeroParcelasOutros() {
        return numeroParcelasOutros;
    }


    /**
     * Sets the numeroParcelasOutros value for this PlanoCurso.
     * 
     * @param numeroParcelasOutros
     */
    public void setNumeroParcelasOutros(int numeroParcelasOutros) {
        this.numeroParcelasOutros = numeroParcelasOutros;
    }


    /**
     * Gets the valorParcelaOutros value for this PlanoCurso.
     * 
     * @return valorParcelaOutros
     */
    public double getValorParcelaOutros() {
        return valorParcelaOutros;
    }


    /**
     * Sets the valorParcelaOutros value for this PlanoCurso.
     * 
     * @param valorParcelaOutros
     */
    public void setValorParcelaOutros(double valorParcelaOutros) {
        this.valorParcelaOutros = valorParcelaOutros;
    }


    /**
     * Gets the dataInicialOutros value for this PlanoCurso.
     * 
     * @return dataInicialOutros
     */
    public java.lang.String getDataInicialOutros() {
        return dataInicialOutros;
    }


    /**
     * Sets the dataInicialOutros value for this PlanoCurso.
     * 
     * @param dataInicialOutros
     */
    public void setDataInicialOutros(java.lang.String dataInicialOutros) {
        this.dataInicialOutros = dataInicialOutros;
    }


    /**
     * Gets the planoContaIDOutros value for this PlanoCurso.
     * 
     * @return planoContaIDOutros
     */
    public int getPlanoContaIDOutros() {
        return planoContaIDOutros;
    }


    /**
     * Sets the planoContaIDOutros value for this PlanoCurso.
     * 
     * @param planoContaIDOutros
     */
    public void setPlanoContaIDOutros(int planoContaIDOutros) {
        this.planoContaIDOutros = planoContaIDOutros;
    }


    /**
     * Gets the descricaoPlanoOutros value for this PlanoCurso.
     * 
     * @return descricaoPlanoOutros
     */
    public java.lang.String getDescricaoPlanoOutros() {
        return descricaoPlanoOutros;
    }


    /**
     * Sets the descricaoPlanoOutros value for this PlanoCurso.
     * 
     * @param descricaoPlanoOutros
     */
    public void setDescricaoPlanoOutros(java.lang.String descricaoPlanoOutros) {
        this.descricaoPlanoOutros = descricaoPlanoOutros;
    }


    /**
     * Gets the mesConsiderarAtual value for this PlanoCurso.
     * 
     * @return mesConsiderarAtual
     */
    public int getMesConsiderarAtual() {
        return mesConsiderarAtual;
    }


    /**
     * Sets the mesConsiderarAtual value for this PlanoCurso.
     * 
     * @param mesConsiderarAtual
     */
    public void setMesConsiderarAtual(int mesConsiderarAtual) {
        this.mesConsiderarAtual = mesConsiderarAtual;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlanoCurso)) return false;
        PlanoCurso other = (PlanoCurso) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cursoID == other.getCursoID() &&
            this.planoCursoID == other.getPlanoCursoID() &&
            ((this.descricaoPlano==null && other.getDescricaoPlano()==null) || 
             (this.descricaoPlano!=null &&
              this.descricaoPlano.equals(other.getDescricaoPlano()))) &&
            this.situacao == other.getSituacao() &&
            this.padrao == other.getPadrao() &&
            this.valorPrimeiraParcelaMensalidade == other.getValorPrimeiraParcelaMensalidade() &&
            ((this.dataPrimeiraParcelaMensalidade==null && other.getDataPrimeiraParcelaMensalidade()==null) || 
             (this.dataPrimeiraParcelaMensalidade!=null &&
              this.dataPrimeiraParcelaMensalidade.equals(other.getDataPrimeiraParcelaMensalidade()))) &&
            this.numeroParcelasMensalidade == other.getNumeroParcelasMensalidade() &&
            this.valorParcelaMensalidade == other.getValorParcelaMensalidade() &&
            ((this.dataInicialMensalidade==null && other.getDataInicialMensalidade()==null) || 
             (this.dataInicialMensalidade!=null &&
              this.dataInicialMensalidade.equals(other.getDataInicialMensalidade()))) &&
            this.bolsaIDMensalidade == other.getBolsaIDMensalidade() &&
            ((this.descricaoBolsaMensalidade==null && other.getDescricaoBolsaMensalidade()==null) || 
             (this.descricaoBolsaMensalidade!=null &&
              this.descricaoBolsaMensalidade.equals(other.getDescricaoBolsaMensalidade()))) &&
            this.planoContaIDMensalidade == other.getPlanoContaIDMensalidade() &&
            ((this.descricaoPlanoContaMensalidade==null && other.getDescricaoPlanoContaMensalidade()==null) || 
             (this.descricaoPlanoContaMensalidade!=null &&
              this.descricaoPlanoContaMensalidade.equals(other.getDescricaoPlanoContaMensalidade()))) &&
            this.numeroParcelasMaterial == other.getNumeroParcelasMaterial() &&
            this.valorParcelaMaterial == other.getValorParcelaMaterial() &&
            ((this.dataInicialMaterial==null && other.getDataInicialMaterial()==null) || 
             (this.dataInicialMaterial!=null &&
              this.dataInicialMaterial.equals(other.getDataInicialMaterial()))) &&
            this.itemEstoqueIDMaterial == other.getItemEstoqueIDMaterial() &&
            ((this.descricaoItemMaterial==null && other.getDescricaoItemMaterial()==null) || 
             (this.descricaoItemMaterial!=null &&
              this.descricaoItemMaterial.equals(other.getDescricaoItemMaterial()))) &&
            this.planoContaIDMaterial == other.getPlanoContaIDMaterial() &&
            ((this.descricaoPlanoMaterial==null && other.getDescricaoPlanoMaterial()==null) || 
             (this.descricaoPlanoMaterial!=null &&
              this.descricaoPlanoMaterial.equals(other.getDescricaoPlanoMaterial()))) &&
            this.numeroParcelasMatricula == other.getNumeroParcelasMatricula() &&
            this.valorParcelaMatricula == other.getValorParcelaMatricula() &&
            ((this.dataInicialMatricula==null && other.getDataInicialMatricula()==null) || 
             (this.dataInicialMatricula!=null &&
              this.dataInicialMatricula.equals(other.getDataInicialMatricula()))) &&
            this.planoContaIDMatricula == other.getPlanoContaIDMatricula() &&
            ((this.descricaoPlanoMatricula==null && other.getDescricaoPlanoMatricula()==null) || 
             (this.descricaoPlanoMatricula!=null &&
              this.descricaoPlanoMatricula.equals(other.getDescricaoPlanoMatricula()))) &&
            this.numeroParcelasOutros == other.getNumeroParcelasOutros() &&
            this.valorParcelaOutros == other.getValorParcelaOutros() &&
            ((this.dataInicialOutros==null && other.getDataInicialOutros()==null) || 
             (this.dataInicialOutros!=null &&
              this.dataInicialOutros.equals(other.getDataInicialOutros()))) &&
            this.planoContaIDOutros == other.getPlanoContaIDOutros() &&
            ((this.descricaoPlanoOutros==null && other.getDescricaoPlanoOutros()==null) || 
             (this.descricaoPlanoOutros!=null &&
              this.descricaoPlanoOutros.equals(other.getDescricaoPlanoOutros()))) &&
            this.mesConsiderarAtual == other.getMesConsiderarAtual();
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
        _hashCode += getCursoID();
        _hashCode += getPlanoCursoID();
        if (getDescricaoPlano() != null) {
            _hashCode += getDescricaoPlano().hashCode();
        }
        _hashCode += getSituacao();
        _hashCode += getPadrao();
        _hashCode += new Double(getValorPrimeiraParcelaMensalidade()).hashCode();
        if (getDataPrimeiraParcelaMensalidade() != null) {
            _hashCode += getDataPrimeiraParcelaMensalidade().hashCode();
        }
        _hashCode += getNumeroParcelasMensalidade();
        _hashCode += new Double(getValorParcelaMensalidade()).hashCode();
        if (getDataInicialMensalidade() != null) {
            _hashCode += getDataInicialMensalidade().hashCode();
        }
        _hashCode += getBolsaIDMensalidade();
        if (getDescricaoBolsaMensalidade() != null) {
            _hashCode += getDescricaoBolsaMensalidade().hashCode();
        }
        _hashCode += getPlanoContaIDMensalidade();
        if (getDescricaoPlanoContaMensalidade() != null) {
            _hashCode += getDescricaoPlanoContaMensalidade().hashCode();
        }
        _hashCode += getNumeroParcelasMaterial();
        _hashCode += new Double(getValorParcelaMaterial()).hashCode();
        if (getDataInicialMaterial() != null) {
            _hashCode += getDataInicialMaterial().hashCode();
        }
        _hashCode += getItemEstoqueIDMaterial();
        if (getDescricaoItemMaterial() != null) {
            _hashCode += getDescricaoItemMaterial().hashCode();
        }
        _hashCode += getPlanoContaIDMaterial();
        if (getDescricaoPlanoMaterial() != null) {
            _hashCode += getDescricaoPlanoMaterial().hashCode();
        }
        _hashCode += getNumeroParcelasMatricula();
        _hashCode += new Double(getValorParcelaMatricula()).hashCode();
        if (getDataInicialMatricula() != null) {
            _hashCode += getDataInicialMatricula().hashCode();
        }
        _hashCode += getPlanoContaIDMatricula();
        if (getDescricaoPlanoMatricula() != null) {
            _hashCode += getDescricaoPlanoMatricula().hashCode();
        }
        _hashCode += getNumeroParcelasOutros();
        _hashCode += new Double(getValorParcelaOutros()).hashCode();
        if (getDataInicialOutros() != null) {
            _hashCode += getDataInicialOutros().hashCode();
        }
        _hashCode += getPlanoContaIDOutros();
        if (getDescricaoPlanoOutros() != null) {
            _hashCode += getDescricaoPlanoOutros().hashCode();
        }
        _hashCode += getMesConsiderarAtual();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlanoCurso.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "PlanoCurso"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cursoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CursoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planoCursoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "PlanoCursoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoPlano");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DescricaoPlano"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Situacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("padrao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Padrao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorPrimeiraParcelaMensalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ValorPrimeiraParcelaMensalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPrimeiraParcelaMensalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataPrimeiraParcelaMensalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroParcelasMensalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroParcelasMensalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorParcelaMensalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ValorParcelaMensalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicialMensalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataInicialMensalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bolsaIDMensalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "BolsaIDMensalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoBolsaMensalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DescricaoBolsaMensalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planoContaIDMensalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "PlanoContaIDMensalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoPlanoContaMensalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DescricaoPlanoContaMensalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroParcelasMaterial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroParcelasMaterial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorParcelaMaterial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ValorParcelaMaterial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicialMaterial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataInicialMaterial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemEstoqueIDMaterial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ItemEstoqueIDMaterial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoItemMaterial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DescricaoItemMaterial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planoContaIDMaterial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "PlanoContaIDMaterial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoPlanoMaterial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DescricaoPlanoMaterial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroParcelasMatricula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroParcelasMatricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorParcelaMatricula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ValorParcelaMatricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicialMatricula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataInicialMatricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planoContaIDMatricula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "PlanoContaIDMatricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoPlanoMatricula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DescricaoPlanoMatricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroParcelasOutros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroParcelasOutros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorParcelaOutros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ValorParcelaOutros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicialOutros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DataInicialOutros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planoContaIDOutros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "PlanoContaIDOutros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoPlanoOutros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DescricaoPlanoOutros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mesConsiderarAtual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "MesConsiderarAtual"));
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
