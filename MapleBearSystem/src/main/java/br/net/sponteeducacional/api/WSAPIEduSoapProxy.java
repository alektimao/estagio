package br.net.sponteeducacional.api;

public class WSAPIEduSoapProxy implements br.net.sponteeducacional.api.WSAPIEduSoap {
  private String _endpoint = null;
  private br.net.sponteeducacional.api.WSAPIEduSoap wSAPIEduSoap = null;
  
  public WSAPIEduSoapProxy() {
    _initWSAPIEduSoapProxy();
  }
  
  public WSAPIEduSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSAPIEduSoapProxy();
  }
  
  private void _initWSAPIEduSoapProxy() {
    try {
      wSAPIEduSoap = (new br.net.sponteeducacional.api.WSAPIEduLocator()).getWSAPIEduSoap();
      if (wSAPIEduSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSAPIEduSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSAPIEduSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSAPIEduSoap != null)
      ((javax.xml.rpc.Stub)wSAPIEduSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.net.sponteeducacional.api.WSAPIEduSoap getWSAPIEduSoap() {
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap;
  }
  
  public br.net.sponteeducacional.api.TokenMobile[] updateOpcoesNotificacaoApp(int nCodigoCliente, int nAlunoID, int nResponsavelID, int nNotificaAgenda, int nNotificaAtendimento, int nNotificaNota, int nNotificaFinanceiro, int nNotificaComunicados, int nNotificaMensagem, java.lang.String sTokenMobile, java.lang.String sToken) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.updateOpcoesNotificacaoApp(nCodigoCliente, nAlunoID, nResponsavelID, nNotificaAgenda, nNotificaAtendimento, nNotificaNota, nNotificaFinanceiro, nNotificaComunicados, nNotificaMensagem, sTokenMobile, sToken);
  }
  
  public br.net.sponteeducacional.api.TokenMobile[] insertOrDeleteTokenApp(int nCodigoCliente, int nAlunoID, int nResponsavelID, java.lang.String sSistemaOperacional, java.lang.String sTokenMobile, java.lang.String sToken, int nAcao) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.insertOrDeleteTokenApp(nCodigoCliente, nAlunoID, nResponsavelID, sSistemaOperacional, sTokenMobile, sToken, nAcao);
  }
  
  public br.net.sponteeducacional.api.WsFotoApp[] updateImageApp(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nResponsavelID, java.lang.String sFoto) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.updateImageApp(nCodigoCliente, sToken, nAlunoID, nResponsavelID, sFoto);
  }
  
  public br.net.sponteeducacional.api.WsAtualizaSenhaAlunoResponsavel[] updateSenhaPortal(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nResponsavelID, java.lang.String sNovaSenha) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.updateSenhaPortal(nCodigoCliente, sToken, nAlunoID, nResponsavelID, sNovaSenha);
  }
  
  public br.net.sponteeducacional.api.WsFotoApp[] getImageApp(int nCodigoCliente, int nAlunoID, int nResponsavelID, java.lang.String sToken) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getImageApp(nCodigoCliente, nAlunoID, nResponsavelID, sToken);
  }
  
  public br.net.sponteeducacional.api.WsResponsavel[] getResponsaveisApp(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getResponsaveisApp(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public boolean insertTimeline(java.lang.String token, int codCliSponte, java.lang.String title, java.lang.String subtitle, java.lang.String type, java.util.Calendar record_date, int student_id, int responsible_id) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.insertTimeline(token, codCliSponte, title, subtitle, type, record_date, student_id, responsible_id);
  }
  
  public br.net.sponteeducacional.api.Timeline[] getTimeline(java.lang.String token, int codCliSponte, int student_id, int responsible_id, int pagenumber) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getTimeline(token, codCliSponte, student_id, responsible_id, pagenumber);
  }
  
  public boolean updateReadTimeline(java.lang.String token, int codCliSponte, java.lang.String timeline_id, boolean read) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.updateReadTimeline(token, codCliSponte, timeline_id, read);
  }
  
  public br.net.sponteeducacional.api.WsAtualizaSituacaoComunicado updateSituacaoComunicadoApp(int nCodigoCliente, java.lang.String sToken, int nComunicadoID, int nAlunoID, int nResponsavelID, org.apache.axis.types.UnsignedByte nLido) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.updateSituacaoComunicadoApp(nCodigoCliente, sToken, nComunicadoID, nAlunoID, nResponsavelID, nLido);
  }
  
  public br.net.sponteeducacional.api.WsComunicadoAPP getComunicadoAPP(int nCodigoCliente, java.lang.String sToken, int nComunicadoID, int nAlunoID, int nResponsavelID) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getComunicadoAPP(nCodigoCliente, sToken, nComunicadoID, nAlunoID, nResponsavelID);
  }
  
  public br.net.sponteeducacional.api.WsComunicadoAPP[] getComunicadosAPP(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca, int nNumeroPagina) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getComunicadosAPP(nCodigoCliente, sToken, sParametrosBusca, nNumeroPagina);
  }
  
  public br.net.sponteeducacional.api.WsMensagemAPP getMensagemRespostasAPP(int nCodigoCliente, java.lang.String sToken, int nMensagemID) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getMensagemRespostasAPP(nCodigoCliente, sToken, nMensagemID);
  }
  
  public br.net.sponteeducacional.api.WsMensagensAPP[] getMensagensAPP(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nResponsavelID, int nNumeroPagina) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getMensagensAPP(nCodigoCliente, sToken, nAlunoID, nResponsavelID, nNumeroPagina);
  }
  
  public br.net.sponteeducacional.api.WsRetNovaRespostaMensagem novaRespostaMensagemApp(int nCodigoCliente, java.lang.String sToken, int nMensagemID, java.lang.String sMensagem, int nAlunoID, int nResponsavelID) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.novaRespostaMensagemApp(nCodigoCliente, sToken, nMensagemID, sMensagem, nAlunoID, nResponsavelID);
  }
  
  public br.net.sponteeducacional.api.WsMovimentacoesAlunos[] getMovimentacaoAluno(int nCodigoCliente, java.lang.String sToken, int nAlunoID, java.lang.String dDataInicio, java.lang.String dDataTermino) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getMovimentacaoAluno(nCodigoCliente, sToken, nAlunoID, dDataInicio, dDataTermino);
  }
  
  public br.net.sponteeducacional.api.InsertMovimentacaoResponseInsertMovimentacaoResult insertMovimentacao(int nCodigoCliente, java.lang.String sToken, java.lang.String sJsonMovimentacao) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.insertMovimentacao(nCodigoCliente, sToken, sJsonMovimentacao);
  }
  
  public br.net.sponteeducacional.api.WsCartoesCatraca[] getCartoesCatraca(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nResponsavelID, int nVisitanteID, int nFuncionarioID) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getCartoesCatraca(nCodigoCliente, sToken, nAlunoID, nResponsavelID, nVisitanteID, nFuncionarioID);
  }
  
  public br.net.sponteeducacional.api.WsQuadroHorarios[] getQuadroHorarios(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getQuadroHorarios(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.WsHorariosAula[] getHorariosAulas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getHorariosAulas(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.WsDiarioAulas[] getDiarioAulas(int nCodigoCliente, java.lang.String sToken, int nTurmaID, int nDisciplinaID, java.lang.String dDataInicio, java.lang.String dDataTermino, int nModulo, java.lang.String sSemana) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getDiarioAulas(nCodigoCliente, sToken, nTurmaID, nDisciplinaID, dDataInicio, dDataTermino, nModulo, sSemana);
  }
  
  public br.net.sponteeducacional.api.InsertFrequenciaDiarioResponseInsertFrequenciaDiarioResult insertFrequenciaDiario(int nCodigoCliente, java.lang.String sToken, int nTurmaID, int nDisciplinaID, int nModulo, java.lang.String sDataAula, int sNumAula, java.lang.String sAlunosFaltantes) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.insertFrequenciaDiario(nCodigoCliente, sToken, nTurmaID, nDisciplinaID, nModulo, sDataAula, sNumAula, sAlunosFaltantes);
  }
  
  public br.net.sponteeducacional.api.InsertConteudoDiarioResponseInsertConteudoDiarioResult insertConteudoDiario(int nCodigoCliente, java.lang.String sToken, int nDiarioClasseID, java.lang.String sConteudo, java.lang.String sObservacao, java.lang.String sSituacao) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.insertConteudoDiario(nCodigoCliente, sToken, nDiarioClasseID, sConteudo, sObservacao, sSituacao);
  }
  
  public br.net.sponteeducacional.api.InsertHistoricoEscolarResponseInsertHistoricoEscolarResult insertHistoricoEscolar(int nCodigoCliente, java.lang.String sToken, java.lang.String sJsonHistoricoEscolar) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.insertHistoricoEscolar(nCodigoCliente, sToken, sJsonHistoricoEscolar);
  }
  
  public br.net.sponteeducacional.api.WsAluno[] getAlunos(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getAlunos(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.InsertAlunosResponseInsertAlunosResult insertAlunos(int nCodigoCliente, java.lang.String sToken, java.lang.String sNome, java.lang.String sMidia, java.util.Calendar dDataNascimento, java.lang.String sCidade, java.lang.String sBairro, java.lang.String sCEP, java.lang.String sEndereco, java.lang.String nNumeroEndereco, java.lang.String sEmail, java.lang.String sTelefone, java.lang.String sCPF, java.lang.String sRG, java.lang.String sCelular, java.lang.String sObservacao, java.lang.String sSexo, java.lang.String sProfissao, java.lang.String sCidadeNatal, java.lang.String sRa, java.lang.String sNumeroMatricula, java.lang.String sSituacao, java.lang.String sCursoInteresse) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.insertAlunos(nCodigoCliente, sToken, sNome, sMidia, dDataNascimento, sCidade, sBairro, sCEP, sEndereco, nNumeroEndereco, sEmail, sTelefone, sCPF, sRG, sCelular, sObservacao, sSexo, sProfissao, sCidadeNatal, sRa, sNumeroMatricula, sSituacao, sCursoInteresse);
  }
  
  public br.net.sponteeducacional.api.UpdateAlunosResponseUpdateAlunosResult updateAlunos(int nCodigoCliente, java.lang.String sToken, int nAlunoID, java.lang.String sNome, java.lang.String sMidia, java.lang.String dDataNascimento, java.lang.String sCidade, java.lang.String sBairro, java.lang.String sCEP, java.lang.String sEndereco, java.lang.String nNumeroEndereco, java.lang.String sCPF, java.lang.String sRG, java.lang.String nResponsavelFinanceiroID, java.lang.String nResponsavelDidaticoID, java.lang.String sEmail, java.lang.String sTelefone, java.lang.String sCelular, java.lang.String sObservacao, java.lang.String sSexo, java.lang.String sProfissao, java.lang.String sCidadeNatal, java.lang.String sRa, java.lang.String sNumeroMatricula, java.lang.String sSituacao, java.lang.String sCursoInteresse) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.updateAlunos(nCodigoCliente, sToken, nAlunoID, sNome, sMidia, dDataNascimento, sCidade, sBairro, sCEP, sEndereco, nNumeroEndereco, sCPF, sRG, nResponsavelFinanceiroID, nResponsavelDidaticoID, sEmail, sTelefone, sCelular, sObservacao, sSexo, sProfissao, sCidadeNatal, sRa, sNumeroMatricula, sSituacao, sCursoInteresse);
  }
  
  public br.net.sponteeducacional.api.SetInadimplenteResponseSetInadimplenteResult setInadimplente(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nInadimplente) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.setInadimplente(nCodigoCliente, sToken, nAlunoID, nInadimplente);
  }
  
  public br.net.sponteeducacional.api.WsRetornoAlunosAlterados[] getAlunosAlterados(int nCodigoCliente, java.lang.String sToken, java.lang.String nQtdDias) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getAlunosAlterados(nCodigoCliente, sToken, nQtdDias);
  }
  
  public br.net.sponteeducacional.api.WsSituacoesAlunos[] getSituacoesAlunos(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getSituacoesAlunos(nCodigoCliente, sToken);
  }
  
  public br.net.sponteeducacional.api.WsOrigensAlunos[] getOrigensAlunos(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getOrigensAlunos(nCodigoCliente, sToken);
  }
  
  public br.net.sponteeducacional.api.WsOcorrencias[] getOcorrenciasAluno(int nCodigoCliente, java.lang.String sToken, int nAlunoID, java.lang.String dDataInicial, java.lang.String dDataFinal) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getOcorrenciasAluno(nCodigoCliente, sToken, nAlunoID, dDataInicial, dDataFinal);
  }
  
  public br.net.sponteeducacional.api.WsCliente[] getClientes(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getClientes(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.InsertClienteResponseInsertClienteResult insertCliente(int nCodigoCliente, java.lang.String sToken, java.lang.String sNome, org.apache.axis.types.UnsignedByte nSituacao, org.apache.axis.types.UnsignedByte nTipo, java.lang.String sCPF, java.lang.String sRG, java.lang.String sCNPJ, java.lang.String sRazaoSocial, java.lang.String sCEP, java.lang.String sEndereco, java.lang.String sNumeroEndereco, java.lang.String sComplementoEndereco, java.lang.String sEmail, java.lang.String sInscricaoEstadual, java.lang.String sInscricaoMunicipal, java.lang.String sObservacao, java.lang.String sTelefone, java.lang.String sRamal, java.lang.String sCelular, java.lang.String sTelefoneFax, java.lang.String sCidade, java.lang.String sBairro, java.lang.String sAgencia, java.lang.String sConta, java.lang.String sCodigoClienteBanco, org.apache.axis.types.UnsignedByte nCliente, org.apache.axis.types.UnsignedByte nFornecedor, org.apache.axis.types.UnsignedByte nEscolaAluno, org.apache.axis.types.UnsignedByte nEmpresaAluno, java.lang.String sContato) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.insertCliente(nCodigoCliente, sToken, sNome, nSituacao, nTipo, sCPF, sRG, sCNPJ, sRazaoSocial, sCEP, sEndereco, sNumeroEndereco, sComplementoEndereco, sEmail, sInscricaoEstadual, sInscricaoMunicipal, sObservacao, sTelefone, sRamal, sCelular, sTelefoneFax, sCidade, sBairro, sAgencia, sConta, sCodigoClienteBanco, nCliente, nFornecedor, nEscolaAluno, nEmpresaAluno, sContato);
  }
  
  public br.net.sponteeducacional.api.UpdateClienteResponseUpdateClienteResult updateCliente(int nCodigoCliente, java.lang.String sToken, int nClienteID, java.lang.String sNome, java.lang.String nSituacao, java.lang.String nTipo, java.lang.String sCPF, java.lang.String sRG, java.lang.String sCNPJ, java.lang.String sRazaoSocial, java.lang.String sCEP, java.lang.String sEndereco, java.lang.String sNumeroEndereco, java.lang.String sComplementoEndereco, java.lang.String sEmail, java.lang.String sInscricaoEstadual, java.lang.String sInscricaoMunicipal, java.lang.String sObservacao, java.lang.String sTelefone, java.lang.String sRamal, java.lang.String sCelular, java.lang.String sTelefoneFax, java.lang.String sCidade, java.lang.String sBairro, java.lang.String sAgencia, java.lang.String sConta, java.lang.String sCodigoClienteBanco, java.lang.String nCliente, java.lang.String nFornecedor, java.lang.String nEscolaAluno, java.lang.String nEmpresaAluno, java.lang.String sContato) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.updateCliente(nCodigoCliente, sToken, nClienteID, sNome, nSituacao, nTipo, sCPF, sRG, sCNPJ, sRazaoSocial, sCEP, sEndereco, sNumeroEndereco, sComplementoEndereco, sEmail, sInscricaoEstadual, sInscricaoMunicipal, sObservacao, sTelefone, sRamal, sCelular, sTelefoneFax, sCidade, sBairro, sAgencia, sConta, sCodigoClienteBanco, nCliente, nFornecedor, nEscolaAluno, nEmpresaAluno, sContato);
  }
  
  public br.net.sponteeducacional.api.WsConta[] getContas(int nCodigoCliente, java.lang.String sToken, java.lang.String nContaID) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getContas(nCodigoCliente, sToken, nContaID);
  }
  
  public br.net.sponteeducacional.api.WsResponsavel[] getResponsaveis(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getResponsaveis(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.InsertResponsaveisResponseInsertResponsaveisResult insertResponsaveis(int nCodigoCliente, java.lang.String sToken, java.lang.String sNome, java.util.Calendar dDataNascimento, int nParentesco, java.lang.String sCEP, java.lang.String sEndereco, int nNumeroEndereco, java.lang.String sRG, java.lang.String sCPFCNPJ, java.lang.String sCidade, java.lang.String sBairro, java.lang.String sEmail, java.lang.String sTelefone, java.lang.String sCelular, int nAlunoID, boolean lResponsavelFinanceiro, boolean lResponsavelDidatico, java.lang.String sObservacao, java.lang.String sSexo, java.lang.String sProfissao, org.apache.axis.types.UnsignedByte nTipoPessoa) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.insertResponsaveis(nCodigoCliente, sToken, sNome, dDataNascimento, nParentesco, sCEP, sEndereco, nNumeroEndereco, sRG, sCPFCNPJ, sCidade, sBairro, sEmail, sTelefone, sCelular, nAlunoID, lResponsavelFinanceiro, lResponsavelDidatico, sObservacao, sSexo, sProfissao, nTipoPessoa);
  }
  
  public br.net.sponteeducacional.api.UpdateResponsaveisResponseUpdateResponsaveisResult updateResponsaveis(int nCodigoCliente, java.lang.String sToken, int nResponsavelID, java.lang.String sNome, java.lang.String dDataNascimento, java.lang.String nParentesco, java.lang.String sCEP, java.lang.String sEndereco, java.lang.String nNumeroEndereco, java.lang.String sRG, java.lang.String sCPFCNPJ, java.lang.String sCidade, java.lang.String sBairro, java.lang.String sEmail, java.lang.String sTelefone, java.lang.String sCelular, java.lang.String nAlunoID, java.lang.String lResponsavelFinanceiro, java.lang.String lResponsavelDidatico, java.lang.String sObservacao, java.lang.String sSexo, java.lang.String sProfissao, java.lang.String nTipoPessoa) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.updateResponsaveis(nCodigoCliente, sToken, nResponsavelID, sNome, dDataNascimento, nParentesco, sCEP, sEndereco, nNumeroEndereco, sRG, sCPFCNPJ, sCidade, sBairro, sEmail, sTelefone, sCelular, nAlunoID, lResponsavelFinanceiro, lResponsavelDidatico, sObservacao, sSexo, sProfissao, nTipoPessoa);
  }
  
  public br.net.sponteeducacional.api.WsMatrizCurricular[] getMatrizCurricular(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getMatrizCurricular(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.WsDisciplina[] getDisciplina(int nCodigoCliente, java.lang.String sToken, int nDisciplinaID) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getDisciplina(nCodigoCliente, sToken, nDisciplinaID);
  }
  
  public br.net.sponteeducacional.api.WsCurso[] getCursos(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getCursos(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.InsertTurmaResponseInsertTurmaResult insertTurma(int nCodigoCliente, java.lang.String sToken, java.lang.String sNome, int nCursoId, int nAnoLetivo, java.lang.String sSigla, int nModulo, java.util.Calendar dDataInicio, int nTipoTurma, int nTurno) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.insertTurma(nCodigoCliente, sToken, sNome, nCursoId, nAnoLetivo, sSigla, nModulo, dDataInicio, nTipoTurma, nTurno);
  }
  
  public br.net.sponteeducacional.api.InsertTurmasAtivasResponseInsertTurmasAtivasResult insertTurmasAtivas(int nCodigoCliente, java.lang.String sToken, java.lang.String sNome, int nCursoId, int nAnoLetivo, java.lang.String sSigla, int nModulo, java.util.Calendar dDataInicio, int nTipoTurma, int nTurno, int nOrdem, int nModalidadeID, java.util.Calendar dDataTermino, int nSituacao, int nMinAlunos, int nHorarioID) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.insertTurmasAtivas(nCodigoCliente, sToken, sNome, nCursoId, nAnoLetivo, sSigla, nModulo, dDataInicio, nTipoTurma, nTurno, nOrdem, nModalidadeID, dDataTermino, nSituacao, nMinAlunos, nHorarioID);
  }
  
  public br.net.sponteeducacional.api.UpdateTurmasResponseUpdateTurmasResult updateTurmas(int nCodigoCliente, java.lang.String sToken, int nTurmaID, java.lang.String sNome, java.lang.String sSigla, java.lang.String nOrdem, java.lang.String nModalidadeID, java.lang.String sDataInicio, java.lang.String sDataTermino, java.lang.String nSituacao, java.lang.String nMinimoAlunos, java.lang.String nMaximoAlunos, java.lang.String nTurnoID, java.lang.String nHorarioID) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.updateTurmas(nCodigoCliente, sToken, nTurmaID, sNome, sSigla, nOrdem, nModalidadeID, sDataInicio, sDataTermino, nSituacao, nMinimoAlunos, nMaximoAlunos, nTurnoID, nHorarioID);
  }
  
  public br.net.sponteeducacional.api.WsTurma[] getTurmas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getTurmas(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.InsertMatriculaResponseInsertMatriculaResult insertMatricula(int nCodigoCliente, java.lang.String sToken, int nSituacao, int nAlunoID, int nCursoID, java.lang.String nTurmaID, int nTipoContratoID, java.lang.String dDataInicio, java.lang.String dDataTermino, java.util.Calendar dDataMatricula, org.apache.axis.types.UnsignedByte nTipo, java.lang.String sDisciplinas, java.lang.String nModulo, java.lang.String nContratante, java.lang.String nNumeroHoras, java.lang.String sObservacao) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.insertMatricula(nCodigoCliente, sToken, nSituacao, nAlunoID, nCursoID, nTurmaID, nTipoContratoID, dDataInicio, dDataTermino, dDataMatricula, nTipo, sDisciplinas, nModulo, nContratante, nNumeroHoras, sObservacao);
  }
  
  public br.net.sponteeducacional.api.UpdateMatriculaResponseUpdateMatriculaResult updateMatricula(int nCodigoCliente, java.lang.String sToken, java.lang.String nContratoID, java.lang.String nContratoAulaLivreID, java.lang.String nSituacao, java.lang.String nCursoID, java.lang.String nTipoContratoID, java.lang.String dDataInicio, java.lang.String nContratante, java.lang.String dDataTermino, java.lang.String dDataMatricula, java.lang.String nModulo, java.lang.String sDisciplinasMatricular, java.lang.String sDisciplinasRemover, java.lang.String sObservacao) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.updateMatricula(nCodigoCliente, sToken, nContratoID, nContratoAulaLivreID, nSituacao, nCursoID, nTipoContratoID, dDataInicio, nContratante, dDataTermino, dDataMatricula, nModulo, sDisciplinasMatricular, sDisciplinasRemover, sObservacao);
  }
  
  public br.net.sponteeducacional.api.WsMatricula[] getMatriculas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getMatriculas(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.WsIntegrantesTurma[] getIntegrantesTurmas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getIntegrantesTurmas(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.WsMudancaEntreTurmas setMudancaEntreTurmas(int nCodigoCliente, java.lang.String sToken, int alunoID, int turmaOrigemID, int turmaDestinoID, java.lang.String observacoes, int nSituacaoAlunoTurmaID) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.setMudancaEntreTurmas(nCodigoCliente, sToken, alunoID, turmaOrigemID, turmaDestinoID, observacoes, nSituacaoAlunoTurmaID);
  }
  
  public br.net.sponteeducacional.api.WsModalidadeTurma[] getModalidadeDasTurmas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getModalidadeDasTurmas(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.WsSituacoesAlunosTurma[] getSituacoesAlunosTurma(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getSituacoesAlunosTurma(nCodigoCliente, sToken);
  }
  
  public br.net.sponteeducacional.api.WsBolsa[] getBolsas(int nCodigoCliente, java.lang.String sToken, java.lang.String sTipoDesconto) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getBolsas(nCodigoCliente, sToken, sTipoDesconto);
  }
  
  public br.net.sponteeducacional.api.WsFormasCobrancas[] getFormasCobrancas(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getFormasCobrancas(nCodigoCliente, sToken);
  }
  
  public br.net.sponteeducacional.api.WsCategorias[] getCategorias(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getCategorias(nCodigoCliente, sToken);
  }
  
  public br.net.sponteeducacional.api.WsItens[] getItens(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getItens(nCodigoCliente, sToken);
  }
  
  public br.net.sponteeducacional.api.WsLayouts[] getLayouts(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getLayouts(nCodigoCliente, sToken);
  }
  
  public br.net.sponteeducacional.api.WsRetornoParcelas[] insertPlano(int nCodigoCliente, java.lang.String sToken, java.lang.String nContratoID, java.lang.String nContratoAulaLivreID, java.lang.String nAlunoID, java.lang.String nTipoPlano, java.lang.String nBolsaID, java.util.Calendar dDataPrimeiroVencimento, int nNumeroParcelas, double nValorParcelas, int nFormaCobrancaID, int nCategoriaID, java.lang.String sObservacao, java.lang.String nClienteID, java.lang.String nContaID) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.insertPlano(nCodigoCliente, sToken, nContratoID, nContratoAulaLivreID, nAlunoID, nTipoPlano, nBolsaID, dDataPrimeiroVencimento, nNumeroParcelas, nValorParcelas, nFormaCobrancaID, nCategoriaID, sObservacao, nClienteID, nContaID);
  }
  
  public br.net.sponteeducacional.api.WsRetornoParcelas[] updatePlano(int nCodigoCliente, java.lang.String sToken, int nContaReceberID, java.lang.String nContratoID, java.lang.String nContratoAulaLivreID, java.lang.String nTipoPlano, java.lang.String nBolsaID, java.lang.String dDataPrimeiroVencimento, java.lang.String nNumeroParcelas, java.lang.String nValorParcelas, java.lang.String nFormaCobrancaID, java.lang.String nCategoriaID, java.lang.String sObservacao, java.lang.String nContaID) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.updatePlano(nCodigoCliente, sToken, nContaReceberID, nContratoID, nContratoAulaLivreID, nTipoPlano, nBolsaID, dDataPrimeiroVencimento, nNumeroParcelas, nValorParcelas, nFormaCobrancaID, nCategoriaID, sObservacao, nContaID);
  }
  
  public br.net.sponteeducacional.api.WsRetornoParcela[] updateParcela(int nCodigoCliente, java.lang.String sToken, int nContaReceberID, int nNumeroParcela, java.lang.String nBolsaID, java.lang.String dDataVencimento, java.lang.String nValor, java.lang.String nFormaCobrancaID, java.lang.String nCategoriaID, java.lang.String sObservacao) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.updateParcela(nCodigoCliente, sToken, nContaReceberID, nNumeroParcela, nBolsaID, dDataVencimento, nValor, nFormaCobrancaID, nCategoriaID, sObservacao);
  }
  
  public br.net.sponteeducacional.api.WsParcela[] getParcelas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getParcelas(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.InsertVendasResponseInsertVendasResult insertVendas(int nCodigoCliente, java.lang.String sToken, java.lang.String nContratoID, java.lang.String nContratoAulaLivreID, java.util.Calendar dDataVenda, java.lang.String nBolsaID, java.lang.String sItens, int nCategoriaID, int nNumeroParcelas, double nValorParcela, java.util.Calendar dDataPrimeiroVencimento, int nFormaCobrancaID, int nEntregue, java.lang.String sNumeroDocumento, java.lang.String sObservacao) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.insertVendas(nCodigoCliente, sToken, nContratoID, nContratoAulaLivreID, dDataVenda, nBolsaID, sItens, nCategoriaID, nNumeroParcelas, nValorParcela, dDataPrimeiroVencimento, nFormaCobrancaID, nEntregue, sNumeroDocumento, sObservacao);
  }
  
  public br.net.sponteeducacional.api.WsVendas[] getVendas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getVendas(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.WsRetornoBoletos[] getBoletos(int nCodigoCliente, java.lang.String sToken, int nContaReceberID, java.lang.String nNumeroParcela, int nCNABID, boolean lSobrescrever) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getBoletos(nCodigoCliente, sToken, nContaReceberID, nNumeroParcela, nCNABID, lSobrescrever);
  }
  
  public br.net.sponteeducacional.api.WsDadosFaturaVindi[] getDadosFaturaVindi(int nCodigoCliente, java.lang.String sToken, long nFaturaID) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getDadosFaturaVindi(nCodigoCliente, sToken, nFaturaID);
  }
  
  public br.net.sponteeducacional.api.WsFinanceiro[] getFinanceiro(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getFinanceiro(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.WsPlanoCurso[] getPlanosCursos(int nCodigoCliente, java.lang.String sToken, int nCursoID, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getPlanosCursos(nCodigoCliente, sToken, nCursoID, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.GetLinhaDigitavelBoletosResponseGetLinhaDigitavelBoletosResult getLinhaDigitavelBoletos(int nCodigoCliente, java.lang.String sToken, int nContaReceberID, java.lang.String nNumeroParcela) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getLinhaDigitavelBoletos(nCodigoCliente, sToken, nContaReceberID, nNumeroParcela);
  }
  
  public br.net.sponteeducacional.api.SetNotaParcialResponseSetNotaParcialResult setNotaParcial(int nCodigoCliente, java.lang.String sToken, int nTurmaID, int nDisciplinaID, int nAlunoId, java.lang.String sNomeAvaliacao, java.lang.String nNota, java.lang.String nPesoAvaliacao, int nModulo, int nPeriodo) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.setNotaParcial(nCodigoCliente, sToken, nTurmaID, nDisciplinaID, nAlunoId, sNomeAvaliacao, nNota, nPesoAvaliacao, nModulo, nPeriodo);
  }
  
  public br.net.sponteeducacional.api.SetNotaResponseSetNotaResult setNota(int nCodigoCliente, java.lang.String sToken, int nTurmaID, int nDisciplinaID, int nAlunoId, java.lang.String nNota, int nModulo, int nPeriodo) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.setNota(nCodigoCliente, sToken, nTurmaID, nDisciplinaID, nAlunoId, nNota, nModulo, nPeriodo);
  }
  
  public br.net.sponteeducacional.api.WsMediaFinal getMediaFinal(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nTurmaID, int nDisciplinaID, java.lang.String nModulo) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getMediaFinal(nCodigoCliente, sToken, nAlunoID, nTurmaID, nDisciplinaID, nModulo);
  }
  
  public br.net.sponteeducacional.api.WsBoletim getBoletim(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nTurmaID, int nDisciplinaID, int nModulo) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getBoletim(nCodigoCliente, sToken, nAlunoID, nTurmaID, nDisciplinaID, nModulo);
  }
  
  public br.net.sponteeducacional.api.WsBoletimAulasLivres getBoletimAulasLivres(int nCodigoCliente, java.lang.String sToken, int nContratoAulaLivreID, int nDisciplinaID) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getBoletimAulasLivres(nCodigoCliente, sToken, nContratoAulaLivreID, nDisciplinaID);
  }
  
  public br.net.sponteeducacional.api.WSCertificado getCertificadoValido(int nCodigoCliente, java.lang.String sNumeroCertificado) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getCertificadoValido(nCodigoCliente, sNumeroCertificado);
  }
  
  public br.net.sponteeducacional.api.WsFuncionario[] getFuncionarios(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getFuncionarios(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.WsMidias[] getMidias(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getMidias(nCodigoCliente, sToken);
  }
  
  public br.net.sponteeducacional.api.WsGestaoComercial[] getIndicesGestaoComercial(int nCodigoCliente, java.lang.String sToken, java.lang.String sDataInicial, java.lang.String sDataFinal) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getIndicesGestaoComercial(nCodigoCliente, sToken, sDataInicial, sDataFinal);
  }
  
  public br.net.sponteeducacional.api.WsAtendimentos[] getAtendimentos(int nCodigoCliente, java.lang.String sToken, java.lang.String nCodigoFuncionario, java.lang.String sDataInicial, java.lang.String sDataFinal) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getAtendimentos(nCodigoCliente, sToken, nCodigoFuncionario, sDataInicial, sDataFinal);
  }
  
  public br.net.sponteeducacional.api.WsQuitacao quitarParcelas(int nCodigoCliente, java.lang.String sToken, java.lang.String sContaReceberID, java.lang.String sContaPagarID, java.lang.String sNumeroParcela, int nContaID, java.lang.String dDataPagamento, java.lang.String nValorPago, int nFormaPagamentoID, java.lang.String sOperadoraID, java.lang.String sBandeiraCartao, java.lang.String sQuantidadeVezesParcelamento, java.lang.String sNumeroCartao, boolean lQuitarTodasPendentesPlano) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.quitarParcelas(nCodigoCliente, sToken, sContaReceberID, sContaPagarID, sNumeroParcela, nContaID, dDataPagamento, nValorPago, nFormaPagamentoID, sOperadoraID, sBandeiraCartao, sQuantidadeVezesParcelamento, sNumeroCartao, lQuitarTodasPendentesPlano);
  }
  
  public br.net.sponteeducacional.api.WsOperadoraCartao[] getOperadorasCartao(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getOperadorasCartao(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.WsAgendaAluno[] getAgendaAluno(int nCodigoCliente, java.lang.String sToken, int nAlunoID, java.lang.String sTurmaID, java.lang.String sCursoID, java.lang.String dDataInicio, java.lang.String dDataTermino) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getAgendaAluno(nCodigoCliente, sToken, nAlunoID, sTurmaID, sCursoID, dDataInicio, dDataTermino);
  }
  
  public br.net.sponteeducacional.api.WsCalendario[] getCalendarioDidatico(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getCalendarioDidatico(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.WsRetornoParcelasPagar[] insertPlanoContaPagar(int nCodigoCliente, java.lang.String sToken, java.lang.String nAlunoID, java.lang.String nFornecedorID, java.lang.String nFuncionarioID, java.util.Calendar dDataPrimeiroVencimento, int nNumeroParcelas, double nValorParcelas, java.lang.String nContaID, int nFormaCobrancaID, int nCategoriaID, java.lang.String sObservacao, java.lang.String sComplemento, java.lang.String sDocumento) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.insertPlanoContaPagar(nCodigoCliente, sToken, nAlunoID, nFornecedorID, nFuncionarioID, dDataPrimeiroVencimento, nNumeroParcelas, nValorParcelas, nContaID, nFormaCobrancaID, nCategoriaID, sObservacao, sComplemento, sDocumento);
  }
  
  public br.net.sponteeducacional.api.WsRetornoParcelasPagar[] updatePlanoPagar(int nCodigoCliente, java.lang.String sToken, int nContaPagarID, java.lang.String dDataPrimeiroVencimento, java.lang.String nNumeroParcelas, java.lang.String nValorParcelas, java.lang.String nFormaCobrancaID, java.lang.String nCategoriaID, java.lang.String nContaID, java.lang.String sObservacao, java.lang.String sComplemento, java.lang.String sDocumento) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.updatePlanoPagar(nCodigoCliente, sToken, nContaPagarID, dDataPrimeiroVencimento, nNumeroParcelas, nValorParcelas, nFormaCobrancaID, nCategoriaID, nContaID, sObservacao, sComplemento, sDocumento);
  }
  
  public br.net.sponteeducacional.api.WsRetornoParcelaPagar[] updateParcelaPagar(int nCodigoCliente, java.lang.String sToken, int nContaPagarID, int nNumeroParcela, java.lang.String dDataVencimento, java.lang.String nValor, java.lang.String nFormaCobrancaID, java.lang.String nContaID, java.lang.String nCategoriaID, java.lang.String sObservacao) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.updateParcelaPagar(nCodigoCliente, sToken, nContaPagarID, nNumeroParcela, dDataVencimento, nValor, nFormaCobrancaID, nContaID, nCategoriaID, sObservacao);
  }
  
  public br.net.sponteeducacional.api.WsParcelaPagar[] getParcelasPagar(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getParcelasPagar(nCodigoCliente, sToken, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.WsSistemaAvaliacao[] getSistemaAvaliacao(int nCodigoCliente, java.lang.String sToken, java.lang.String nTurmaID, java.lang.String nDisciplinaID, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getSistemaAvaliacao(nCodigoCliente, sToken, nTurmaID, nDisciplinaID, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.WsAvaliacoesParciais[] getAvaliacaoParcial(int nCodigoCliente, java.lang.String sToken, int nTurmaID, int nDisciplinaID) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getAvaliacaoParcial(nCodigoCliente, sToken, nTurmaID, nDisciplinaID);
  }
  
  public br.net.sponteeducacional.api.WsFrequenciaTurma[] getFrequenciaTurma(int nCodigoCliente, java.lang.String sToken, int nTurmaID, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getFrequenciaTurma(nCodigoCliente, sToken, nTurmaID, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.WsNotasParciais getNotaParcial(int nCodigoCliente, java.lang.String sToken, int nCursoID, int nTurmaID, int nAlunoID, java.lang.String sParametrosBusca) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getNotaParcial(nCodigoCliente, sToken, nCursoID, nTurmaID, nAlunoID, sParametrosBusca);
  }
  
  public br.net.sponteeducacional.api.WsLoginPortal validaLoginPortal(java.lang.String sLogin, java.lang.String sSenha, java.lang.String sEmpresa, int nTipoUsuario) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.validaLoginPortal(sLogin, sSenha, sEmpresa, nTipoUsuario);
  }
  
  public br.net.sponteeducacional.api.WsFinanceiro[] getFinanceiroApp(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca, short nNumeroPagina) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getFinanceiroApp(nCodigoCliente, sToken, sParametrosBusca, nNumeroPagina);
  }
  
  public br.net.sponteeducacional.api.WsLoginApp validaLoginApp(java.lang.String sLogin, java.lang.String sSenha, java.lang.String sEmpresa, int nTipoUsuario, java.lang.String sTokenApp) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.validaLoginApp(sLogin, sSenha, sEmpresa, nTipoUsuario, sTokenApp);
  }
  
  public br.net.sponteeducacional.api.WsAppPortalNotas[] getConfiguracaoApp(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getConfiguracaoApp(nCodigoCliente, sToken);
  }
  
  public br.net.sponteeducacional.api.WsAppPortalNotasNotificacao[] getOpcoesNotificacao(int nCodigoCliente, int nAlunoID, int nResponsavelID, java.lang.String sToken) throws java.rmi.RemoteException{
    if (wSAPIEduSoap == null)
      _initWSAPIEduSoapProxy();
    return wSAPIEduSoap.getOpcoesNotificacao(nCodigoCliente, nAlunoID, nResponsavelID, sToken);
  }
  
  
}