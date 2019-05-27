/**
 * WSAPIEduSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public interface WSAPIEduSoap extends java.rmi.Remote {
    public br.net.sponteeducacional.api.TokenMobile[] updateOpcoesNotificacaoApp(int nCodigoCliente, int nAlunoID, int nResponsavelID, int nNotificaAgenda, int nNotificaAtendimento, int nNotificaNota, int nNotificaFinanceiro, int nNotificaComunicados, int nNotificaMensagem, java.lang.String sTokenMobile, java.lang.String sToken) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.TokenMobile[] insertOrDeleteTokenApp(int nCodigoCliente, int nAlunoID, int nResponsavelID, java.lang.String sSistemaOperacional, java.lang.String sTokenMobile, java.lang.String sToken, int nAcao) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsFotoApp[] updateImageApp(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nResponsavelID, java.lang.String sFoto) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsAtualizaSenhaAlunoResponsavel[] updateSenhaPortal(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nResponsavelID, java.lang.String sNovaSenha) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsFotoApp[] getImageApp(int nCodigoCliente, int nAlunoID, int nResponsavelID, java.lang.String sToken) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsResponsavel[] getResponsaveisApp(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public boolean insertTimeline(java.lang.String token, int codCliSponte, java.lang.String title, java.lang.String subtitle, java.lang.String type, java.util.Calendar record_date, int student_id, int responsible_id) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.Timeline[] getTimeline(java.lang.String token, int codCliSponte, int student_id, int responsible_id, int pagenumber) throws java.rmi.RemoteException;
    public boolean updateReadTimeline(java.lang.String token, int codCliSponte, java.lang.String timeline_id, boolean read) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsAtualizaSituacaoComunicado updateSituacaoComunicadoApp(int nCodigoCliente, java.lang.String sToken, int nComunicadoID, int nAlunoID, int nResponsavelID, org.apache.axis.types.UnsignedByte nLido) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsComunicadoAPP getComunicadoAPP(int nCodigoCliente, java.lang.String sToken, int nComunicadoID, int nAlunoID, int nResponsavelID) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsComunicadoAPP[] getComunicadosAPP(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca, int nNumeroPagina) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsMensagemAPP getMensagemRespostasAPP(int nCodigoCliente, java.lang.String sToken, int nMensagemID) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsMensagensAPP[] getMensagensAPP(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nResponsavelID, int nNumeroPagina) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsRetNovaRespostaMensagem novaRespostaMensagemApp(int nCodigoCliente, java.lang.String sToken, int nMensagemID, java.lang.String sMensagem, int nAlunoID, int nResponsavelID) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsMovimentacoesAlunos[] getMovimentacaoAluno(int nCodigoCliente, java.lang.String sToken, int nAlunoID, java.lang.String dDataInicio, java.lang.String dDataTermino) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.InsertMovimentacaoResponseInsertMovimentacaoResult insertMovimentacao(int nCodigoCliente, java.lang.String sToken, java.lang.String sJsonMovimentacao) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsCartoesCatraca[] getCartoesCatraca(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nResponsavelID, int nVisitanteID, int nFuncionarioID) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsQuadroHorarios[] getQuadroHorarios(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsHorariosAula[] getHorariosAulas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsDiarioAulas[] getDiarioAulas(int nCodigoCliente, java.lang.String sToken, int nTurmaID, int nDisciplinaID, java.lang.String dDataInicio, java.lang.String dDataTermino, int nModulo, java.lang.String sSemana) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.InsertFrequenciaDiarioResponseInsertFrequenciaDiarioResult insertFrequenciaDiario(int nCodigoCliente, java.lang.String sToken, int nTurmaID, int nDisciplinaID, int nModulo, java.lang.String sDataAula, int sNumAula, java.lang.String sAlunosFaltantes) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.InsertConteudoDiarioResponseInsertConteudoDiarioResult insertConteudoDiario(int nCodigoCliente, java.lang.String sToken, int nDiarioClasseID, java.lang.String sConteudo, java.lang.String sObservacao, java.lang.String sSituacao) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.InsertHistoricoEscolarResponseInsertHistoricoEscolarResult insertHistoricoEscolar(int nCodigoCliente, java.lang.String sToken, java.lang.String sJsonHistoricoEscolar) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsAluno[] getAlunos(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.InsertAlunosResponseInsertAlunosResult insertAlunos(int nCodigoCliente, java.lang.String sToken, java.lang.String sNome, java.lang.String sMidia, java.util.Calendar dDataNascimento, java.lang.String sCidade, java.lang.String sBairro, java.lang.String sCEP, java.lang.String sEndereco, java.lang.String nNumeroEndereco, java.lang.String sEmail, java.lang.String sTelefone, java.lang.String sCPF, java.lang.String sRG, java.lang.String sCelular, java.lang.String sObservacao, java.lang.String sSexo, java.lang.String sProfissao, java.lang.String sCidadeNatal, java.lang.String sRa, java.lang.String sNumeroMatricula, java.lang.String sSituacao, java.lang.String sCursoInteresse) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.UpdateAlunosResponseUpdateAlunosResult updateAlunos(int nCodigoCliente, java.lang.String sToken, int nAlunoID, java.lang.String sNome, java.lang.String sMidia, java.lang.String dDataNascimento, java.lang.String sCidade, java.lang.String sBairro, java.lang.String sCEP, java.lang.String sEndereco, java.lang.String nNumeroEndereco, java.lang.String sCPF, java.lang.String sRG, java.lang.String nResponsavelFinanceiroID, java.lang.String nResponsavelDidaticoID, java.lang.String sEmail, java.lang.String sTelefone, java.lang.String sCelular, java.lang.String sObservacao, java.lang.String sSexo, java.lang.String sProfissao, java.lang.String sCidadeNatal, java.lang.String sRa, java.lang.String sNumeroMatricula, java.lang.String sSituacao, java.lang.String sCursoInteresse) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.SetInadimplenteResponseSetInadimplenteResult setInadimplente(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nInadimplente) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsRetornoAlunosAlterados[] getAlunosAlterados(int nCodigoCliente, java.lang.String sToken, java.lang.String nQtdDias) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsSituacoesAlunos[] getSituacoesAlunos(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsOrigensAlunos[] getOrigensAlunos(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsOcorrencias[] getOcorrenciasAluno(int nCodigoCliente, java.lang.String sToken, int nAlunoID, java.lang.String dDataInicial, java.lang.String dDataFinal) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsCliente[] getClientes(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.InsertClienteResponseInsertClienteResult insertCliente(int nCodigoCliente, java.lang.String sToken, java.lang.String sNome, org.apache.axis.types.UnsignedByte nSituacao, org.apache.axis.types.UnsignedByte nTipo, java.lang.String sCPF, java.lang.String sRG, java.lang.String sCNPJ, java.lang.String sRazaoSocial, java.lang.String sCEP, java.lang.String sEndereco, java.lang.String sNumeroEndereco, java.lang.String sComplementoEndereco, java.lang.String sEmail, java.lang.String sInscricaoEstadual, java.lang.String sInscricaoMunicipal, java.lang.String sObservacao, java.lang.String sTelefone, java.lang.String sRamal, java.lang.String sCelular, java.lang.String sTelefoneFax, java.lang.String sCidade, java.lang.String sBairro, java.lang.String sAgencia, java.lang.String sConta, java.lang.String sCodigoClienteBanco, org.apache.axis.types.UnsignedByte nCliente, org.apache.axis.types.UnsignedByte nFornecedor, org.apache.axis.types.UnsignedByte nEscolaAluno, org.apache.axis.types.UnsignedByte nEmpresaAluno, java.lang.String sContato) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.UpdateClienteResponseUpdateClienteResult updateCliente(int nCodigoCliente, java.lang.String sToken, int nClienteID, java.lang.String sNome, java.lang.String nSituacao, java.lang.String nTipo, java.lang.String sCPF, java.lang.String sRG, java.lang.String sCNPJ, java.lang.String sRazaoSocial, java.lang.String sCEP, java.lang.String sEndereco, java.lang.String sNumeroEndereco, java.lang.String sComplementoEndereco, java.lang.String sEmail, java.lang.String sInscricaoEstadual, java.lang.String sInscricaoMunicipal, java.lang.String sObservacao, java.lang.String sTelefone, java.lang.String sRamal, java.lang.String sCelular, java.lang.String sTelefoneFax, java.lang.String sCidade, java.lang.String sBairro, java.lang.String sAgencia, java.lang.String sConta, java.lang.String sCodigoClienteBanco, java.lang.String nCliente, java.lang.String nFornecedor, java.lang.String nEscolaAluno, java.lang.String nEmpresaAluno, java.lang.String sContato) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsConta[] getContas(int nCodigoCliente, java.lang.String sToken, java.lang.String nContaID) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsResponsavel[] getResponsaveis(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.InsertResponsaveisResponseInsertResponsaveisResult insertResponsaveis(int nCodigoCliente, java.lang.String sToken, java.lang.String sNome, java.util.Calendar dDataNascimento, int nParentesco, java.lang.String sCEP, java.lang.String sEndereco, int nNumeroEndereco, java.lang.String sRG, java.lang.String sCPFCNPJ, java.lang.String sCidade, java.lang.String sBairro, java.lang.String sEmail, java.lang.String sTelefone, java.lang.String sCelular, int nAlunoID, boolean lResponsavelFinanceiro, boolean lResponsavelDidatico, java.lang.String sObservacao, java.lang.String sSexo, java.lang.String sProfissao, org.apache.axis.types.UnsignedByte nTipoPessoa) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.UpdateResponsaveisResponseUpdateResponsaveisResult updateResponsaveis(int nCodigoCliente, java.lang.String sToken, int nResponsavelID, java.lang.String sNome, java.lang.String dDataNascimento, java.lang.String nParentesco, java.lang.String sCEP, java.lang.String sEndereco, java.lang.String nNumeroEndereco, java.lang.String sRG, java.lang.String sCPFCNPJ, java.lang.String sCidade, java.lang.String sBairro, java.lang.String sEmail, java.lang.String sTelefone, java.lang.String sCelular, java.lang.String nAlunoID, java.lang.String lResponsavelFinanceiro, java.lang.String lResponsavelDidatico, java.lang.String sObservacao, java.lang.String sSexo, java.lang.String sProfissao, java.lang.String nTipoPessoa) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsMatrizCurricular[] getMatrizCurricular(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsDisciplina[] getDisciplina(int nCodigoCliente, java.lang.String sToken, int nDisciplinaID) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsCurso[] getCursos(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.InsertTurmaResponseInsertTurmaResult insertTurma(int nCodigoCliente, java.lang.String sToken, java.lang.String sNome, int nCursoId, int nAnoLetivo, java.lang.String sSigla, int nModulo, java.util.Calendar dDataInicio, int nTipoTurma, int nTurno) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.InsertTurmasAtivasResponseInsertTurmasAtivasResult insertTurmasAtivas(int nCodigoCliente, java.lang.String sToken, java.lang.String sNome, int nCursoId, int nAnoLetivo, java.lang.String sSigla, int nModulo, java.util.Calendar dDataInicio, int nTipoTurma, int nTurno, int nOrdem, int nModalidadeID, java.util.Calendar dDataTermino, int nSituacao, int nMinAlunos, int nHorarioID) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.UpdateTurmasResponseUpdateTurmasResult updateTurmas(int nCodigoCliente, java.lang.String sToken, int nTurmaID, java.lang.String sNome, java.lang.String sSigla, java.lang.String nOrdem, java.lang.String nModalidadeID, java.lang.String sDataInicio, java.lang.String sDataTermino, java.lang.String nSituacao, java.lang.String nMinimoAlunos, java.lang.String nMaximoAlunos, java.lang.String nTurnoID, java.lang.String nHorarioID) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsTurma[] getTurmas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.InsertMatriculaResponseInsertMatriculaResult insertMatricula(int nCodigoCliente, java.lang.String sToken, int nSituacao, int nAlunoID, int nCursoID, java.lang.String nTurmaID, int nTipoContratoID, java.lang.String dDataInicio, java.lang.String dDataTermino, java.util.Calendar dDataMatricula, org.apache.axis.types.UnsignedByte nTipo, java.lang.String sDisciplinas, java.lang.String nModulo, java.lang.String nContratante, java.lang.String nNumeroHoras, java.lang.String sObservacao) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.UpdateMatriculaResponseUpdateMatriculaResult updateMatricula(int nCodigoCliente, java.lang.String sToken, java.lang.String nContratoID, java.lang.String nContratoAulaLivreID, java.lang.String nSituacao, java.lang.String nCursoID, java.lang.String nTipoContratoID, java.lang.String dDataInicio, java.lang.String nContratante, java.lang.String dDataTermino, java.lang.String dDataMatricula, java.lang.String nModulo, java.lang.String sDisciplinasMatricular, java.lang.String sDisciplinasRemover, java.lang.String sObservacao) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsMatricula[] getMatriculas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsIntegrantesTurma[] getIntegrantesTurmas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsMudancaEntreTurmas setMudancaEntreTurmas(int nCodigoCliente, java.lang.String sToken, int alunoID, int turmaOrigemID, int turmaDestinoID, java.lang.String observacoes, int nSituacaoAlunoTurmaID) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsModalidadeTurma[] getModalidadeDasTurmas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsSituacoesAlunosTurma[] getSituacoesAlunosTurma(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsBolsa[] getBolsas(int nCodigoCliente, java.lang.String sToken, java.lang.String sTipoDesconto) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsFormasCobrancas[] getFormasCobrancas(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsCategorias[] getCategorias(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsItens[] getItens(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsLayouts[] getLayouts(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsRetornoParcelas[] insertPlano(int nCodigoCliente, java.lang.String sToken, java.lang.String nContratoID, java.lang.String nContratoAulaLivreID, java.lang.String nAlunoID, java.lang.String nTipoPlano, java.lang.String nBolsaID, java.util.Calendar dDataPrimeiroVencimento, int nNumeroParcelas, double nValorParcelas, int nFormaCobrancaID, int nCategoriaID, java.lang.String sObservacao, java.lang.String nClienteID, java.lang.String nContaID) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsRetornoParcelas[] updatePlano(int nCodigoCliente, java.lang.String sToken, int nContaReceberID, java.lang.String nContratoID, java.lang.String nContratoAulaLivreID, java.lang.String nTipoPlano, java.lang.String nBolsaID, java.lang.String dDataPrimeiroVencimento, java.lang.String nNumeroParcelas, java.lang.String nValorParcelas, java.lang.String nFormaCobrancaID, java.lang.String nCategoriaID, java.lang.String sObservacao, java.lang.String nContaID) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsRetornoParcela[] updateParcela(int nCodigoCliente, java.lang.String sToken, int nContaReceberID, int nNumeroParcela, java.lang.String nBolsaID, java.lang.String dDataVencimento, java.lang.String nValor, java.lang.String nFormaCobrancaID, java.lang.String nCategoriaID, java.lang.String sObservacao) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsParcela[] getParcelas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.InsertVendasResponseInsertVendasResult insertVendas(int nCodigoCliente, java.lang.String sToken, java.lang.String nContratoID, java.lang.String nContratoAulaLivreID, java.util.Calendar dDataVenda, java.lang.String nBolsaID, java.lang.String sItens, int nCategoriaID, int nNumeroParcelas, double nValorParcela, java.util.Calendar dDataPrimeiroVencimento, int nFormaCobrancaID, int nEntregue, java.lang.String sNumeroDocumento, java.lang.String sObservacao) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsVendas[] getVendas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsRetornoBoletos[] getBoletos(int nCodigoCliente, java.lang.String sToken, int nContaReceberID, java.lang.String nNumeroParcela, int nCNABID, boolean lSobrescrever) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsDadosFaturaVindi[] getDadosFaturaVindi(int nCodigoCliente, java.lang.String sToken, long nFaturaID) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsFinanceiro[] getFinanceiro(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsPlanoCurso[] getPlanosCursos(int nCodigoCliente, java.lang.String sToken, int nCursoID, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.GetLinhaDigitavelBoletosResponseGetLinhaDigitavelBoletosResult getLinhaDigitavelBoletos(int nCodigoCliente, java.lang.String sToken, int nContaReceberID, java.lang.String nNumeroParcela) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.SetNotaParcialResponseSetNotaParcialResult setNotaParcial(int nCodigoCliente, java.lang.String sToken, int nTurmaID, int nDisciplinaID, int nAlunoId, java.lang.String sNomeAvaliacao, java.lang.String nNota, java.lang.String nPesoAvaliacao, int nModulo, int nPeriodo) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.SetNotaResponseSetNotaResult setNota(int nCodigoCliente, java.lang.String sToken, int nTurmaID, int nDisciplinaID, int nAlunoId, java.lang.String nNota, int nModulo, int nPeriodo) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsMediaFinal getMediaFinal(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nTurmaID, int nDisciplinaID, java.lang.String nModulo) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsBoletim getBoletim(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nTurmaID, int nDisciplinaID, int nModulo) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsBoletimAulasLivres getBoletimAulasLivres(int nCodigoCliente, java.lang.String sToken, int nContratoAulaLivreID, int nDisciplinaID) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WSCertificado getCertificadoValido(int nCodigoCliente, java.lang.String sNumeroCertificado) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsFuncionario[] getFuncionarios(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsMidias[] getMidias(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsGestaoComercial[] getIndicesGestaoComercial(int nCodigoCliente, java.lang.String sToken, java.lang.String sDataInicial, java.lang.String sDataFinal) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsAtendimentos[] getAtendimentos(int nCodigoCliente, java.lang.String sToken, java.lang.String nCodigoFuncionario, java.lang.String sDataInicial, java.lang.String sDataFinal) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsQuitacao quitarParcelas(int nCodigoCliente, java.lang.String sToken, java.lang.String sContaReceberID, java.lang.String sContaPagarID, java.lang.String sNumeroParcela, int nContaID, java.lang.String dDataPagamento, java.lang.String nValorPago, int nFormaPagamentoID, java.lang.String sOperadoraID, java.lang.String sBandeiraCartao, java.lang.String sQuantidadeVezesParcelamento, java.lang.String sNumeroCartao, boolean lQuitarTodasPendentesPlano) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsOperadoraCartao[] getOperadorasCartao(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsAgendaAluno[] getAgendaAluno(int nCodigoCliente, java.lang.String sToken, int nAlunoID, java.lang.String sTurmaID, java.lang.String sCursoID, java.lang.String dDataInicio, java.lang.String dDataTermino) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsCalendario[] getCalendarioDidatico(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsRetornoParcelasPagar[] insertPlanoContaPagar(int nCodigoCliente, java.lang.String sToken, java.lang.String nAlunoID, java.lang.String nFornecedorID, java.lang.String nFuncionarioID, java.util.Calendar dDataPrimeiroVencimento, int nNumeroParcelas, double nValorParcelas, java.lang.String nContaID, int nFormaCobrancaID, int nCategoriaID, java.lang.String sObservacao, java.lang.String sComplemento, java.lang.String sDocumento) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsRetornoParcelasPagar[] updatePlanoPagar(int nCodigoCliente, java.lang.String sToken, int nContaPagarID, java.lang.String dDataPrimeiroVencimento, java.lang.String nNumeroParcelas, java.lang.String nValorParcelas, java.lang.String nFormaCobrancaID, java.lang.String nCategoriaID, java.lang.String nContaID, java.lang.String sObservacao, java.lang.String sComplemento, java.lang.String sDocumento) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsRetornoParcelaPagar[] updateParcelaPagar(int nCodigoCliente, java.lang.String sToken, int nContaPagarID, int nNumeroParcela, java.lang.String dDataVencimento, java.lang.String nValor, java.lang.String nFormaCobrancaID, java.lang.String nContaID, java.lang.String nCategoriaID, java.lang.String sObservacao) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsParcelaPagar[] getParcelasPagar(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsSistemaAvaliacao[] getSistemaAvaliacao(int nCodigoCliente, java.lang.String sToken, java.lang.String nTurmaID, java.lang.String nDisciplinaID, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsAvaliacoesParciais[] getAvaliacaoParcial(int nCodigoCliente, java.lang.String sToken, int nTurmaID, int nDisciplinaID) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsFrequenciaTurma[] getFrequenciaTurma(int nCodigoCliente, java.lang.String sToken, int nTurmaID, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsNotasParciais getNotaParcial(int nCodigoCliente, java.lang.String sToken, int nCursoID, int nTurmaID, int nAlunoID, java.lang.String sParametrosBusca) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsLoginPortal validaLoginPortal(java.lang.String sLogin, java.lang.String sSenha, java.lang.String sEmpresa, int nTipoUsuario) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsFinanceiro[] getFinanceiroApp(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca, short nNumeroPagina) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsLoginApp validaLoginApp(java.lang.String sLogin, java.lang.String sSenha, java.lang.String sEmpresa, int nTipoUsuario, java.lang.String sTokenApp) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsAppPortalNotas[] getConfiguracaoApp(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException;
    public br.net.sponteeducacional.api.WsAppPortalNotasNotificacao[] getOpcoesNotificacao(int nCodigoCliente, int nAlunoID, int nResponsavelID, java.lang.String sToken) throws java.rmi.RemoteException;
}
