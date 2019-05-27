/**
 * WSAPIEduSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WSAPIEduSoapStub extends org.apache.axis.client.Stub implements br.net.sponteeducacional.api.WSAPIEduSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[96];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateOpcoesNotificacaoApp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nResponsavelID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNotificaAgenda"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNotificaAtendimento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNotificaNota"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNotificaFinanceiro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNotificaComunicados"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNotificaMensagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sTokenMobile"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfTokenMobile"));
        oper.setReturnClass(br.net.sponteeducacional.api.TokenMobile[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateOpcoesNotificacaoAppResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TokenMobile"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertOrDeleteTokenApp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nResponsavelID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSistemaOperacional"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sTokenMobile"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAcao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfTokenMobile"));
        oper.setReturnClass(br.net.sponteeducacional.api.TokenMobile[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertOrDeleteTokenAppResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TokenMobile"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateImageApp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nResponsavelID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sFoto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFotoApp"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsFotoApp[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateImageAppResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFotoApp"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateSenhaPortal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nResponsavelID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNovaSenha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAtualizaSenhaAlunoResponsavel"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsAtualizaSenhaAlunoResponsavel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateSenhaPortalResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAtualizaSenhaAlunoResponsavel"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetImageApp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nResponsavelID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFotoApp"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsFotoApp[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetImageAppResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFotoApp"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetResponsaveisApp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsResponsavel"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsResponsavel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetResponsaveisAppResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsResponsavel"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertTimeline");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "codCliSponte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "subtitle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "record_date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "student_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "responsible_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertTimelineResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTimeline");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "codCliSponte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "student_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "responsible_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "pagenumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfTimeline"));
        oper.setReturnClass(br.net.sponteeducacional.api.Timeline[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetTimelineResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Timeline"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateReadTimeline");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "codCliSponte"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "timeline_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "read"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateReadTimelineResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateSituacaoComunicadoApp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nComunicadoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nResponsavelID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nLido"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAtualizaSituacaoComunicado"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsAtualizaSituacaoComunicado.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateSituacaoComunicadoAppResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetComunicadoAPP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nComunicadoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nResponsavelID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsComunicadoAPP"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsComunicadoAPP.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetComunicadoAPPResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetComunicadosAPP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroPagina"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsComunicadoAPP"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsComunicadoAPP[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetComunicadosAPPResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsComunicadoAPP"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMensagemRespostasAPP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nMensagemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMensagemAPP"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsMensagemAPP.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetMensagemRespostasAPPResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMensagensAPP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nResponsavelID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroPagina"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsMensagensAPP"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsMensagensAPP[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetMensagensAPPResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMensagensAPP"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NovaRespostaMensagemApp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nMensagemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sMensagem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nResponsavelID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetNovaRespostaMensagem"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsRetNovaRespostaMensagem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NovaRespostaMensagemAppResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMovimentacaoAluno");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataInicio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataTermino"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsMovimentacoesAlunos"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsMovimentacoesAlunos[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetMovimentacaoAlunoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMovimentacoesAlunos"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertMovimentacao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sJsonMovimentacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertMovimentacaoResponse>InsertMovimentacaoResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.InsertMovimentacaoResponseInsertMovimentacaoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertMovimentacaoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCartoesCatraca");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nResponsavelID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nVisitanteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFuncionarioID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCartoesCatraca"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsCartoesCatraca[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetCartoesCatracaResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCartoesCatraca"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetQuadroHorarios");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsQuadroHorarios"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsQuadroHorarios[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetQuadroHorariosResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsQuadroHorarios"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetHorariosAulas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsHorariosAula"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsHorariosAula[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetHorariosAulasResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsHorariosAula"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDiarioAulas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurmaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nDisciplinaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataInicio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataTermino"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModulo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSemana"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsDiarioAulas"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsDiarioAulas[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetDiarioAulasResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDiarioAulas"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertFrequenciaDiario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurmaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nDisciplinaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModulo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDataAula"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNumAula"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sAlunosFaltantes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertFrequenciaDiarioResponse>InsertFrequenciaDiarioResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.InsertFrequenciaDiarioResponseInsertFrequenciaDiarioResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertFrequenciaDiarioResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertConteudoDiario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nDiarioClasseID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sConteudo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSituacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertConteudoDiarioResponse>InsertConteudoDiarioResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.InsertConteudoDiarioResponseInsertConteudoDiarioResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertConteudoDiarioResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertHistoricoEscolar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sJsonHistoricoEscolar"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertHistoricoEscolarResponse>InsertHistoricoEscolarResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.InsertHistoricoEscolarResponseInsertHistoricoEscolarResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertHistoricoEscolarResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAlunos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAluno"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsAluno[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetAlunosResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAluno"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertAlunos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNome"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sMidia"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataNascimento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCidade"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sBairro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCEP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sEndereco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroEndereco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sTelefone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCPF"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sRG"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCelular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSexo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sProfissao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCidadeNatal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sRa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNumeroMatricula"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSituacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCursoInteresse"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertAlunosResponse>InsertAlunosResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.InsertAlunosResponseInsertAlunosResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertAlunosResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAlunos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNome"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sMidia"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataNascimento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCidade"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sBairro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCEP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sEndereco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroEndereco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCPF"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sRG"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nResponsavelFinanceiroID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nResponsavelDidaticoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sTelefone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCelular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSexo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sProfissao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCidadeNatal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sRa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNumeroMatricula"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSituacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCursoInteresse"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>UpdateAlunosResponse>UpdateAlunosResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.UpdateAlunosResponseUpdateAlunosResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateAlunosResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetInadimplente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nInadimplente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>SetInadimplenteResponse>SetInadimplenteResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.SetInadimplenteResponseSetInadimplenteResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SetInadimplenteResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAlunosAlterados");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nQtdDias"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoAlunosAlterados"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsRetornoAlunosAlterados[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetAlunosAlteradosResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoAlunosAlterados"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSituacoesAlunos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsSituacoesAlunos"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsSituacoesAlunos[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetSituacoesAlunosResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsSituacoesAlunos"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOrigensAlunos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsOrigensAlunos"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsOrigensAlunos[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetOrigensAlunosResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOrigensAlunos"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOcorrenciasAluno");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataInicial"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataFinal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsOcorrencias"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsOcorrencias[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetOcorrenciasAlunoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOcorrencias"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetClientes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCliente"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsCliente[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetClientesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCliente"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertCliente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNome"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nSituacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCPF"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sRG"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCNPJ"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sRazaoSocial"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCEP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sEndereco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNumeroEndereco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sComplementoEndereco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sInscricaoEstadual"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sInscricaoMunicipal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sTelefone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sRamal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCelular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sTelefoneFax"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCidade"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sBairro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sAgencia"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sConta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCodigoClienteBanco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFornecedor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nEscolaAluno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nEmpresaAluno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sContato"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertClienteResponse>InsertClienteResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.InsertClienteResponseInsertClienteResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertClienteResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateCliente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nClienteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNome"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nSituacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCPF"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sRG"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCNPJ"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sRazaoSocial"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCEP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sEndereco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNumeroEndereco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sComplementoEndereco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sInscricaoEstadual"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sInscricaoMunicipal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sTelefone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sRamal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCelular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sTelefoneFax"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCidade"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sBairro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sAgencia"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sConta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCodigoClienteBanco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFornecedor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nEscolaAluno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nEmpresaAluno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sContato"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>UpdateClienteResponse>UpdateClienteResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.UpdateClienteResponseUpdateClienteResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateClienteResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetContas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsConta"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsConta[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetContasResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsConta"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetResponsaveis");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsResponsavel"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsResponsavel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetResponsaveisResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsResponsavel"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertResponsaveis");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNome"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataNascimento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nParentesco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCEP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sEndereco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroEndereco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sRG"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCPFCNPJ"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCidade"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sBairro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sTelefone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCelular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "lResponsavelFinanceiro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "lResponsavelDidatico"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSexo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sProfissao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipoPessoa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertResponsaveisResponse>InsertResponsaveisResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.InsertResponsaveisResponseInsertResponsaveisResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertResponsaveisResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateResponsaveis");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nResponsavelID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNome"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataNascimento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nParentesco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCEP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sEndereco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroEndereco"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sRG"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCPFCNPJ"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCidade"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sBairro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sTelefone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCelular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "lResponsavelFinanceiro"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "lResponsavelDidatico"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSexo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sProfissao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipoPessoa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>UpdateResponsaveisResponse>UpdateResponsaveisResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.UpdateResponsaveisResponseUpdateResponsaveisResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateResponsaveisResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMatrizCurricular");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsMatrizCurricular"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsMatrizCurricular[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetMatrizCurricularResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMatrizCurricular"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDisciplina");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nDisciplinaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsDisciplina"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsDisciplina[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetDisciplinaResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplina"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCursos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCurso"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsCurso[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetCursosResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCurso"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertTurma");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNome"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCursoId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAnoLetivo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSigla"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModulo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataInicio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipoTurma"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertTurmaResponse>InsertTurmaResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.InsertTurmaResponseInsertTurmaResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertTurmaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertTurmasAtivas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNome"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCursoId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAnoLetivo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSigla"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModulo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataInicio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipoTurma"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nOrdem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModalidadeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataTermino"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nSituacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nMinAlunos"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nHorarioID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertTurmasAtivasResponse>InsertTurmasAtivasResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.InsertTurmasAtivasResponseInsertTurmasAtivasResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertTurmasAtivasResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateTurmas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurmaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNome"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSigla"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nOrdem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModalidadeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDataInicio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDataTermino"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nSituacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nMinimoAlunos"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nMaximoAlunos"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurnoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nHorarioID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>UpdateTurmasResponse>UpdateTurmasResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.UpdateTurmasResponseUpdateTurmasResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateTurmasResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTurmas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsTurma"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsTurma[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetTurmasResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsTurma"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertMatricula");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nSituacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCursoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurmaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipoContratoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataInicio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataTermino"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataMatricula"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDisciplinas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModulo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContratante"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroHoras"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertMatriculaResponse>InsertMatriculaResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.InsertMatriculaResponseInsertMatriculaResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertMatriculaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateMatricula");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContratoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContratoAulaLivreID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nSituacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCursoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipoContratoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataInicio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContratante"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataTermino"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataMatricula"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModulo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDisciplinasMatricular"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDisciplinasRemover"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>UpdateMatriculaResponse>UpdateMatriculaResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.UpdateMatriculaResponseUpdateMatriculaResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateMatriculaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMatriculas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsMatricula"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsMatricula[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetMatriculasResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMatricula"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetIntegrantesTurmas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsIntegrantesTurma"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsIntegrantesTurma[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetIntegrantesTurmasResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsIntegrantesTurma"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetMudancaEntreTurmas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TurmaOrigemID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TurmaDestinoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Observacoes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nSituacaoAlunoTurmaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMudancaEntreTurmas"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsMudancaEntreTurmas.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SetMudancaEntreTurmasResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetModalidadeDasTurmas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsModalidadeTurma"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsModalidadeTurma[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetModalidadeDasTurmasResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsModalidadeTurma"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSituacoesAlunosTurma");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsSituacoesAlunosTurma"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsSituacoesAlunosTurma[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetSituacoesAlunosTurmaResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsSituacoesAlunosTurma"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBolsas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sTipoDesconto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsBolsa"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsBolsa[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetBolsasResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBolsa"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFormasCobrancas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFormasCobrancas"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsFormasCobrancas[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetFormasCobrancasResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFormasCobrancas"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCategorias");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCategorias"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsCategorias[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetCategoriasResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCategorias"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItens");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsItens"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsItens[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetItensResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsItens"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLayouts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsLayouts"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsLayouts[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetLayoutsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsLayouts"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertPlano");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContratoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContratoAulaLivreID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipoPlano"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nBolsaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataPrimeiroVencimento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroParcelas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nValorParcelas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFormaCobrancaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCategoriaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nClienteID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoParcelas"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsRetornoParcelas[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertPlanoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelas"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdatePlano");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContaReceberID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContratoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContratoAulaLivreID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipoPlano"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nBolsaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataPrimeiroVencimento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroParcelas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nValorParcelas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFormaCobrancaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCategoriaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoParcelas"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsRetornoParcelas[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdatePlanoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelas"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateParcela");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContaReceberID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroParcela"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nBolsaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataVencimento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nValor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFormaCobrancaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCategoriaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoParcela"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsRetornoParcela[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateParcelaResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcela"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetParcelas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsParcela"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsParcela[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetParcelasResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcela"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertVendas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContratoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContratoAulaLivreID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataVenda"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nBolsaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sItens"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCategoriaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroParcelas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nValorParcela"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataPrimeiroVencimento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFormaCobrancaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nEntregue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNumeroDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertVendasResponse>InsertVendasResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.InsertVendasResponseInsertVendasResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertVendasResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVendas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsVendas"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsVendas[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetVendasResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsVendas"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBoletos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContaReceberID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroParcela"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCNABID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "lSobrescrever"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoBoletos"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsRetornoBoletos[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetBoletosResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoBoletos"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDadosFaturaVindi");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFaturaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsDadosFaturaVindi"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsDadosFaturaVindi[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetDadosFaturaVindiResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDadosFaturaVindi"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFinanceiro");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFinanceiro"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsFinanceiro[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetFinanceiroResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFinanceiro"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPlanosCursos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCursoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsPlanoCurso"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsPlanoCurso[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetPlanosCursosResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsPlanoCurso"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLinhaDigitavelBoletos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContaReceberID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroParcela"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>GetLinhaDigitavelBoletosResponse>GetLinhaDigitavelBoletosResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.GetLinhaDigitavelBoletosResponseGetLinhaDigitavelBoletosResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetLinhaDigitavelBoletosResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetNotaParcial");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurmaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nDisciplinaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNomeAvaliacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNota"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nPesoAvaliacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModulo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nPeriodo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>SetNotaParcialResponse>SetNotaParcialResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.SetNotaParcialResponseSetNotaParcialResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SetNotaParcialResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetNota");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurmaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nDisciplinaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNota"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModulo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nPeriodo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>SetNotaResponse>SetNotaResult"));
        oper.setReturnClass(br.net.sponteeducacional.api.SetNotaResponseSetNotaResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SetNotaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMediaFinal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurmaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nDisciplinaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModulo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMediaFinal"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsMediaFinal.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetMediaFinalResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBoletim");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurmaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nDisciplinaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nModulo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBoletim"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsBoletim.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetBoletimResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBoletimAulasLivres");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContratoAulaLivreID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nDisciplinaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBoletimAulasLivres"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsBoletimAulasLivres.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetBoletimAulasLivresResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCertificadoValido");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNumeroCertificado"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "WSCertificado"));
        oper.setReturnClass(br.net.sponteeducacional.api.WSCertificado.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetCertificadoValidoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFuncionarios");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFuncionario"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsFuncionario[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetFuncionariosResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFuncionario"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMidias");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsMidias"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsMidias[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetMidiasResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMidias"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetIndicesGestaoComercial");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDataInicial"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDataFinal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsGestaoComercial"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsGestaoComercial[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetIndicesGestaoComercialResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsGestaoComercial"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAtendimentos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoFuncionario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDataInicial"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDataFinal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAtendimentos"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsAtendimentos[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetAtendimentosResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAtendimentos"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuitarParcelas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sContaReceberID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sContaPagarID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNumeroParcela"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataPagamento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nValorPago"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFormaPagamentoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sOperadoraID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sBandeiraCartao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sQuantidadeVezesParcelamento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sNumeroCartao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "lQuitarTodasPendentesPlano"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsQuitacao"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsQuitacao.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "QuitarParcelasResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOperadorasCartao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsOperadoraCartao"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsOperadoraCartao[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetOperadorasCartaoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOperadoraCartao"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAgendaAluno");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sTurmaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sCursoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataInicio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataTermino"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAgendaAluno"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsAgendaAluno[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetAgendaAlunoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAgendaAluno"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCalendarioDidatico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCalendario"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsCalendario[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetCalendarioDidaticoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCalendario"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertPlanoContaPagar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFornecedorID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFuncionarioID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataPrimeiroVencimento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroParcelas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nValorParcelas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFormaCobrancaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCategoriaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sComplemento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoParcelasPagar"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsRetornoParcelasPagar[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertPlanoContaPagarResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelasPagar"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdatePlanoPagar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContaPagarID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataPrimeiroVencimento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroParcelas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nValorParcelas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFormaCobrancaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCategoriaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sComplemento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sDocumento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoParcelasPagar"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsRetornoParcelasPagar[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdatePlanoPagarResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelasPagar"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateParcelaPagar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContaPagarID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroParcela"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "dDataVencimento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nValor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nFormaCobrancaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nContaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCategoriaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sObservacao"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoParcelaPagar"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsRetornoParcelaPagar[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateParcelaPagarResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelaPagar"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetParcelasPagar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsParcelaPagar"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsParcelaPagar[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetParcelasPagarResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcelaPagar"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSistemaAvaliacao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurmaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nDisciplinaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsSistemaAvaliacao"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsSistemaAvaliacao[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetSistemaAvaliacaoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsSistemaAvaliacao"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAvaliacaoParcial");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurmaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nDisciplinaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAvaliacoesParciais"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsAvaliacoesParciais[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetAvaliacaoParcialResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAvaliacoesParciais"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFrequenciaTurma");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurmaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFrequenciaTurma"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsFrequenciaTurma[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetFrequenciaTurmaResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaTurma"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNotaParcial");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCursoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTurmaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsNotasParciais"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsNotasParciais.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetNotaParcialResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ValidaLoginPortal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sLogin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSenha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sEmpresa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsLoginPortal"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsLoginPortal.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ValidaLoginPortalResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFinanceiroApp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sParametrosBusca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nNumeroPagina"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFinanceiro"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsFinanceiro[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetFinanceiroAppResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFinanceiro"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ValidaLoginApp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sLogin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSenha"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sEmpresa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipoUsuario"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sTokenApp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsLoginApp"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsLoginApp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ValidaLoginAppResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetConfiguracaoApp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAppPortalNotas"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsAppPortalNotas[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetConfiguracaoAppResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAppPortalNotas"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOpcoesNotificacao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nCodigoCliente"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nAlunoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nResponsavelID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAppPortalNotasNotificacao"));
        oper.setReturnClass(br.net.sponteeducacional.api.WsAppPortalNotasNotificacao[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetOpcoesNotificacaoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAppPortalNotasNotificacao"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[95] = oper;

    }

    public WSAPIEduSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WSAPIEduSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WSAPIEduSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>GetLinhaDigitavelBoletosResponse>GetLinhaDigitavelBoletosResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetLinhaDigitavelBoletosResponseGetLinhaDigitavelBoletosResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertAlunosResponse>InsertAlunosResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertAlunosResponseInsertAlunosResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertClienteResponse>InsertClienteResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertClienteResponseInsertClienteResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertConteudoDiarioResponse>InsertConteudoDiarioResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertConteudoDiarioResponseInsertConteudoDiarioResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertFrequenciaDiarioResponse>InsertFrequenciaDiarioResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertFrequenciaDiarioResponseInsertFrequenciaDiarioResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertHistoricoEscolarResponse>InsertHistoricoEscolarResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertHistoricoEscolarResponseInsertHistoricoEscolarResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertMatriculaResponse>InsertMatriculaResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertMatriculaResponseInsertMatriculaResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertMovimentacaoResponse>InsertMovimentacaoResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertMovimentacaoResponseInsertMovimentacaoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertResponsaveisResponse>InsertResponsaveisResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertResponsaveisResponseInsertResponsaveisResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertTurmaResponse>InsertTurmaResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertTurmaResponseInsertTurmaResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertTurmasAtivasResponse>InsertTurmasAtivasResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertTurmasAtivasResponseInsertTurmasAtivasResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertVendasResponse>InsertVendasResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertVendasResponseInsertVendasResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>SetInadimplenteResponse>SetInadimplenteResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.SetInadimplenteResponseSetInadimplenteResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>SetNotaParcialResponse>SetNotaParcialResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.SetNotaParcialResponseSetNotaParcialResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>SetNotaResponse>SetNotaResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.SetNotaResponseSetNotaResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>UpdateAlunosResponse>UpdateAlunosResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateAlunosResponseUpdateAlunosResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>UpdateClienteResponse>UpdateClienteResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateClienteResponseUpdateClienteResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>UpdateMatriculaResponse>UpdateMatriculaResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateMatriculaResponseUpdateMatriculaResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>UpdateResponsaveisResponse>UpdateResponsaveisResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateResponsaveisResponseUpdateResponsaveisResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>UpdateTurmasResponse>UpdateTurmasResult");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateTurmasResponseUpdateTurmasResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">DataTable");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.DataTable.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetAgendaAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetAgendaAluno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetAgendaAlunoResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetAgendaAlunoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetAlunos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetAlunos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetAlunosAlterados");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetAlunosAlterados.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetAlunosAlteradosResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetAlunosAlteradosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetAlunosResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetAlunosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetAtendimentos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetAtendimentos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetAtendimentosResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetAtendimentosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetAvaliacaoParcial");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetAvaliacaoParcial.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetAvaliacaoParcialResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetAvaliacaoParcialResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetBoletim");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetBoletim.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetBoletimAulasLivres");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetBoletimAulasLivres.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetBoletimAulasLivresResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetBoletimAulasLivresResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetBoletimResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetBoletimResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetBoletos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetBoletos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetBoletosResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetBoletosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetBolsas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetBolsas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetBolsasResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetBolsasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetCalendarioDidatico");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetCalendarioDidatico.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetCalendarioDidaticoResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetCalendarioDidaticoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetCartoesCatraca");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetCartoesCatraca.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetCartoesCatracaResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetCartoesCatracaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetCategorias");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetCategorias.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetCategoriasResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetCategoriasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetCertificadoValido");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetCertificadoValido.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetCertificadoValidoResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetCertificadoValidoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetClientes");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetClientes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetClientesResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetClientesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetConfiguracaoApp");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetConfiguracaoApp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetConfiguracaoAppResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetConfiguracaoAppResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetContas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetContas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetContasResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetContasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetCursos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetCursos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetCursosResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetCursosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetDadosFaturaVindi");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetDadosFaturaVindi.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetDadosFaturaVindiResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetDadosFaturaVindiResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetDiarioAulas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetDiarioAulas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetDiarioAulasResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetDiarioAulasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetDisciplina");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetDisciplina.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetDisciplinaResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetDisciplinaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetFinanceiro");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetFinanceiro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetFinanceiroApp");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetFinanceiroApp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetFinanceiroAppResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetFinanceiroAppResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetFinanceiroResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetFinanceiroResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetFormasCobrancas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetFormasCobrancas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetFormasCobrancasResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetFormasCobrancasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetFrequenciaTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetFrequenciaTurma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetFrequenciaTurmaResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetFrequenciaTurmaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetFuncionarios");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetFuncionarios.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetFuncionariosResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetFuncionariosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetHorariosAulas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetHorariosAulas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetHorariosAulasResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetHorariosAulasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetIndicesGestaoComercial");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetIndicesGestaoComercial.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetIndicesGestaoComercialResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetIndicesGestaoComercialResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetIntegrantesTurmas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetIntegrantesTurmas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetIntegrantesTurmasResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetIntegrantesTurmasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetItens");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetItens.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetItensResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetItensResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetLayouts");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetLayouts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetLayoutsResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetLayoutsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetLinhaDigitavelBoletos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetLinhaDigitavelBoletos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetLinhaDigitavelBoletosResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetLinhaDigitavelBoletosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetMatriculas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetMatriculas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetMatriculasResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetMatriculasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetMatrizCurricular");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetMatrizCurricular.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetMatrizCurricularResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetMatrizCurricularResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetMediaFinal");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetMediaFinal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetMediaFinalResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetMediaFinalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetMidias");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetMidias.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetMidiasResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetMidiasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetModalidadeDasTurmas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetModalidadeDasTurmas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetModalidadeDasTurmasResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetModalidadeDasTurmasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetNotaParcial");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetNotaParcial.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetNotaParcialResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetNotaParcialResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetOcorrenciasAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetOcorrenciasAluno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetOcorrenciasAlunoResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetOcorrenciasAlunoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetOpcoesNotificacao");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetOpcoesNotificacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetOpcoesNotificacaoResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetOpcoesNotificacaoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetOperadorasCartao");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetOperadorasCartao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetOperadorasCartaoResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetOperadorasCartaoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetOrigensAlunos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetOrigensAlunos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetOrigensAlunosResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetOrigensAlunosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetParcelas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetParcelas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetParcelasPagar");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetParcelasPagar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetParcelasPagarResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetParcelasPagarResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetParcelasResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetParcelasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetPlanosCursos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetPlanosCursos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetPlanosCursosResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetPlanosCursosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetQuadroHorarios");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetQuadroHorarios.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetQuadroHorariosResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetQuadroHorariosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetResponsaveis");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetResponsaveis.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetResponsaveisResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetResponsaveisResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetSistemaAvaliacao");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetSistemaAvaliacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetSistemaAvaliacaoResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetSistemaAvaliacaoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetSituacoesAlunos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetSituacoesAlunos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetSituacoesAlunosResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetSituacoesAlunosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetSituacoesAlunosTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetSituacoesAlunosTurma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetSituacoesAlunosTurmaResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetSituacoesAlunosTurmaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetTurmas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetTurmas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetTurmasResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetTurmasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetVendas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetVendas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetVendasResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.GetVendasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertAlunos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertAlunos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertAlunosResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertAlunosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertCliente");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertCliente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertClienteResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertClienteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertConteudoDiario");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertConteudoDiario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertConteudoDiarioResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertConteudoDiarioResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertFrequenciaDiario");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertFrequenciaDiario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertFrequenciaDiarioResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertFrequenciaDiarioResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertHistoricoEscolar");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertHistoricoEscolar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertHistoricoEscolarResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertHistoricoEscolarResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertMatricula");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertMatricula.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertMatriculaResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertMatriculaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertPlano");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertPlano.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertPlanoContaPagar");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertPlanoContaPagar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertPlanoContaPagarResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertPlanoContaPagarResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertPlanoResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertPlanoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertResponsaveis");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertResponsaveis.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertResponsaveisResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertResponsaveisResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertTurma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertTurmaResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertTurmaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertTurmasAtivas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertTurmasAtivas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertTurmasAtivasResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertTurmasAtivasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertVendas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertVendas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertVendasResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.InsertVendasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">QuitarParcelas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.QuitarParcelas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">QuitarParcelasResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.QuitarParcelasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">SetInadimplente");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.SetInadimplente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">SetInadimplenteResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.SetInadimplenteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">SetMudancaEntreTurmas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.SetMudancaEntreTurmas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">SetMudancaEntreTurmasResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.SetMudancaEntreTurmasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">SetNota");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.SetNota.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">SetNotaParcial");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.SetNotaParcial.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">SetNotaParcialResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.SetNotaParcialResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">SetNotaResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.SetNotaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateAlunos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateAlunos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateAlunosResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateAlunosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateCliente");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateCliente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateClienteResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateClienteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateMatricula");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateMatricula.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateMatriculaResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateMatriculaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateParcela");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateParcela.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateParcelaPagar");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateParcelaPagar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateParcelaPagarResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateParcelaPagarResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateParcelaResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateParcelaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdatePlano");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdatePlano.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdatePlanoPagar");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdatePlanoPagar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdatePlanoPagarResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdatePlanoPagarResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdatePlanoResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdatePlanoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateResponsaveis");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateResponsaveis.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateResponsaveisResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateResponsaveisResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateTurmas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateTurmas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">UpdateTurmasResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.UpdateTurmasResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">ValidaLoginApp");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.ValidaLoginApp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">ValidaLoginAppResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.ValidaLoginAppResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">ValidaLoginPortal");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.ValidaLoginPortal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">ValidaLoginPortalResponse");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.ValidaLoginPortalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfCategorias");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.Categorias[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Categorias");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Categorias");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfCobrancasBancarias");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.CobrancasBancarias[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CobrancasBancarias");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CobrancasBancarias");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfContas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.Contas[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Contas");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Contas");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfDisciplinas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.Disciplinas[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Disciplinas");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Disciplinas");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfFormasCobrancas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.FormasCobrancas[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "FormasCobrancas");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "FormasCobrancas");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfIndicador");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.Indicador[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Indicador");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Indicador");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfIndicesGestaoComercial");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.IndicesGestaoComercial[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "IndicesGestaoComercial");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "IndicesGestaoComercial");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfIntegrantes");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.Integrantes[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Integrantes");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Integrantes");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfItens");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.Itens[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Itens");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Itens");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfMidias");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.Midias[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Midias");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Midias");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfModalidadeTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.ModalidadeTurma[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ModalidadeTurma");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ModalidadeTurma");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfNotas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.Notas[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Notas");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Notas");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfNotasBoletim");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.NotasBoletim[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NotasBoletim");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NotasBoletim");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfNotasBoletimAulasLivres");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.NotasBoletimAulasLivres[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NotasBoletimAulasLivres");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NotasBoletimAulasLivres");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfOrigensAlunos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.OrigensAlunos[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "OrigensAlunos");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "OrigensAlunos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfPlanoCurso");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.PlanoCurso[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "PlanoCurso");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "PlanoCurso");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfSituacoesAlunos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.SituacoesAlunos[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SituacoesAlunos");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SituacoesAlunos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfSituacoesAlunosTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.SituacoesAlunosTurma[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SituacoesAlunosTurma");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SituacoesAlunosTurma");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfTimeline");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.Timeline[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Timeline");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Timeline");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfTokenMobile");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.TokenMobile[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TokenMobile");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TokenMobile");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAgendaAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAgendaAluno[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAgendaAluno");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAgendaAluno");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAluno[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAluno");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAluno");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAlunos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAlunos[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAlunos");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAlunos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAnexosComunicados");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAnexosComunicados[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAnexosComunicados");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAnexosComunicados");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAppPortalNotas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAppPortalNotas[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAppPortalNotas");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAppPortalNotas");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAppPortalNotasNotificacao");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAppPortalNotasNotificacao[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAppPortalNotasNotificacao");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAppPortalNotasNotificacao");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAtendimentos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAtendimentos[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAtendimentos");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAtendimentos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAtualizaSenhaAlunoResponsavel");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAtualizaSenhaAlunoResponsavel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAtualizaSenhaAlunoResponsavel");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAtualizaSenhaAlunoResponsavel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAulasDiario");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAulasDiario[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAulasDiario");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAulasDiario");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAulasDiarioClasseAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAulasDiarioClasseAluno[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAulasDiarioClasseAluno");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAulasDiarioClasseAluno");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAulasLivresAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAulasLivresAluno[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAulasLivresAluno");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAulasLivresAluno");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAvaliacoesParciais");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAvaliacoesParciais[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAvaliacoesParciais");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAvaliacoesParciais");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsAvaliacoesPortalAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAvaliacoesPortalAluno[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAvaliacoesPortalAluno");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAvaliacoesPortalAluno");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsBoletos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsBoletos[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBoletos");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBoletos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsBolsa");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsBolsa[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBolsa");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBolsa");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCalendario");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsCalendario[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCalendario");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCalendario");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCalendarioDetalhes");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsCalendarioDetalhes[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCalendarioDetalhes");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCalendarioDetalhes");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCartoes");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsCartoes[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCartoes");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCartoes");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCartoesCatraca");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsCartoesCatraca[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCartoesCatraca");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCartoesCatraca");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCategorias");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsCategorias[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCategorias");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCategorias");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCliente");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsCliente[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCliente");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCliente");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsComunicadoAPP");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsComunicadoAPP[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsComunicadoAPP");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsComunicadoAPP");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsConceito");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsConceito[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsConceito");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsConceito");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsConta");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsConta[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsConta");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsConta");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCurso");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsCurso[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCurso");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCurso");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsCursosAtendimentos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsCursosAtendimentos[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCursosAtendimentos");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCursosAtendimentos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsDadosFaturaVindi");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsDadosFaturaVindi[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDadosFaturaVindi");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDadosFaturaVindi");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsDescontos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsDescontos[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDescontos");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDescontos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsDiarioAulas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsDiarioAulas[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDiarioAulas");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDiarioAulas");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsDisciplina");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsDisciplina[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplina");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplina");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsDisciplinas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsDisciplinas[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplinas");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplinas");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsDisciplinasComTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsDisciplinasComTurma[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplinasComTurma");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplinasComTurma");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsDisciplinasNotasParciais");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsDisciplinasNotasParciais[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplinasNotasParciais");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplinasNotasParciais");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFaltasAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsFaltasAluno[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFaltasAluno");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFaltasAluno");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFinanceiro");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsFinanceiro[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFinanceiro");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFinanceiro");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFormasCobrancas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsFormasCobrancas[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFormasCobrancas");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFormasCobrancas");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFotoApp");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsFotoApp[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFotoApp");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFotoApp");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFrequenciaAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsFrequenciaAluno[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaAluno");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaAluno");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFrequenciaDisciplinas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsFrequenciaDisciplinas[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaDisciplinas");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaDisciplinas");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFrequenciaTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsFrequenciaTurma[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaTurma");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaTurma");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsFuncionario");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsFuncionario[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFuncionario");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFuncionario");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsGestaoComercial");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsGestaoComercial[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsGestaoComercial");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsGestaoComercial");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsHorarioDetalhes");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsHorarioDetalhes[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsHorarioDetalhes");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsHorarioDetalhes");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsHorarios");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsHorarios[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsHorarios");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsHorarios");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsHorariosAula");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsHorariosAula[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsHorariosAula");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsHorariosAula");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsInfoAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsInfoAluno[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsInfoAluno");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsInfoAluno");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsInfoTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsInfoTurma[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsInfoTurma");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsInfoTurma");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsIntegrantesTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsIntegrantesTurma[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsIntegrantesTurma");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsIntegrantesTurma");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsItens");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsItens[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsItens");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsItens");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsItensVenda");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsItensVenda[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsItensVenda");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsItensVenda");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsLayouts");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsLayouts[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsLayouts");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsLayouts");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsMatricula");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsMatricula[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMatricula");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMatricula");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsMatrizCurricular");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsMatrizCurricular[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMatrizCurricular");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMatrizCurricular");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsMensagemResposta");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsMensagemResposta[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMensagemResposta");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMensagemResposta");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsMensagensAPP");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsMensagensAPP[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMensagensAPP");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMensagensAPP");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsMidias");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsMidias[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMidias");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMidias");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsModalidadeTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsModalidadeTurma[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsModalidadeTurma");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsModalidadeTurma");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsMovimentacaoAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsMovimentacaoAluno[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMovimentacaoAluno");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMovimentacaoAluno");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsMovimentacoesAlunos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsMovimentacoesAlunos[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMovimentacoesAlunos");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMovimentacoesAlunos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsNotaParcial");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsNotaParcial[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsNotaParcial");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsNotaParcial");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsNotasPeriodos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsNotasPeriodos[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsNotasPeriodos");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsNotasPeriodos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsOcorrencias");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsOcorrencias[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOcorrencias");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOcorrencias");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsOperadoraCartao");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsOperadoraCartao[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOperadoraCartao");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOperadoraCartao");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsOperadoraCartaoPlanos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsOperadoraCartaoPlanos[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOperadoraCartaoPlanos");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOperadoraCartaoPlanos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsOrigensAlunos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsOrigensAlunos[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOrigensAlunos");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOrigensAlunos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsParcela");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsParcela[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcela");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcela");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsParcelaPagar");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsParcelaPagar[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcelaPagar");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcelaPagar");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsParcelas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsParcelas[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcelas");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcelas");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsParcelasPagar");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsParcelasPagar[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcelasPagar");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcelasPagar");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsPlanoCurso");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsPlanoCurso[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsPlanoCurso");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsPlanoCurso");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsQuadroHorarios");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsQuadroHorarios[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsQuadroHorarios");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsQuadroHorarios");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsResponsaveis");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsResponsaveis[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsResponsaveis");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsResponsaveis");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsResponsavel");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsResponsavel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsResponsavel");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsResponsavel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoAlunosAlterados");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsRetornoAlunosAlterados[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoAlunosAlterados");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoAlunosAlterados");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoBoletos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsRetornoBoletos[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoBoletos");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoBoletos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoParcela");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsRetornoParcela[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcela");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcela");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoParcelaPagar");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsRetornoParcelaPagar[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelaPagar");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelaPagar");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoParcelas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsRetornoParcelas[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelas");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelas");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsRetornoParcelasPagar");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsRetornoParcelasPagar[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelasPagar");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelasPagar");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsSistemaAvaliacao");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsSistemaAvaliacao[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsSistemaAvaliacao");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsSistemaAvaliacao");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsSituacoesAlunos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsSituacoesAlunos[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsSituacoesAlunos");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsSituacoesAlunos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsSituacoesAlunosTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsSituacoesAlunosTurma[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsSituacoesAlunosTurma");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsSituacoesAlunosTurma");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsTurma[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsTurma");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsTurma");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ArrayOfWsVendas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsVendas[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsVendas");
            qName2 = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsVendas");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Categorias");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.Categorias.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CobrancasBancarias");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.CobrancasBancarias.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Contas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.Contas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Disciplinas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.Disciplinas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "FormasCobrancas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.FormasCobrancas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Indicador");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.Indicador.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "IndicesGestaoComercial");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.IndicesGestaoComercial.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Integrantes");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.Integrantes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Itens");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.Itens.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Midias");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.Midias.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ModalidadeTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.ModalidadeTurma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Notas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.Notas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NotasBoletim");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.NotasBoletim.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NotasBoletimAulasLivres");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.NotasBoletimAulasLivres.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "OrigensAlunos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.OrigensAlunos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "PersistClass");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.PersistClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "PlanoCurso");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.PlanoCurso.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SituacoesAlunos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.SituacoesAlunos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SituacoesAlunosTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.SituacoesAlunosTurma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Timeline");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.Timeline.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TokenMobile");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.TokenMobile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAgendaAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAgendaAluno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAluno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAlunos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAlunos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAnexosComunicados");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAnexosComunicados.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAppPortalNotas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAppPortalNotas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAppPortalNotasNotificacao");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAppPortalNotasNotificacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAtendimentos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAtendimentos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAtualizaSenhaAlunoResponsavel");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAtualizaSenhaAlunoResponsavel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAtualizaSituacaoComunicado");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAtualizaSituacaoComunicado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAulasDiario");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAulasDiario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAulasDiarioClasseAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAulasDiarioClasseAluno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAulasLivresAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAulasLivresAluno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAvaliacoesParciais");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAvaliacoesParciais.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAvaliacoesPortalAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsAvaliacoesPortalAluno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBoletim");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsBoletim.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBoletimAulasLivres");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsBoletimAulasLivres.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBoletos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsBoletos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBolsa");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsBolsa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCalendario");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsCalendario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCalendarioDetalhes");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsCalendarioDetalhes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCartoes");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsCartoes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCartoesCatraca");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsCartoesCatraca.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCategorias");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsCategorias.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "WSCertificado");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WSCertificado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCliente");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsCliente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsComunicadoAPP");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsComunicadoAPP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsConceito");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsConceito.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsConta");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsConta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCurso");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsCurso.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCursosAtendimentos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsCursosAtendimentos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDadosFaturaVindi");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsDadosFaturaVindi.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDescontos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsDescontos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDiarioAulas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsDiarioAulas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplina");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsDisciplina.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplinas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsDisciplinas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplinasComTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsDisciplinasComTurma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplinasNotasParciais");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsDisciplinasNotasParciais.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFaltasAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsFaltasAluno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFinanceiro");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsFinanceiro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFormasCobrancas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsFormasCobrancas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFotoApp");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsFotoApp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsFrequenciaAluno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaDisciplinas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsFrequenciaDisciplinas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsFrequenciaTurma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFuncionario");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsFuncionario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsGestaoComercial");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsGestaoComercial.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsGrupoAvaliacao");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsGrupoAvaliacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsHorarioDetalhes");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsHorarioDetalhes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsHorarios");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsHorarios.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsHorariosAula");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsHorariosAula.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsInfoAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsInfoAluno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsInfoTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsInfoTurma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsIntegrantesTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsIntegrantesTurma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsItens");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsItens.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsItensVenda");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsItensVenda.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsLayouts");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsLayouts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsLoginApp");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsLoginApp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsLoginPortal");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsLoginPortal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMatricula");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsMatricula.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMatrizCurricular");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsMatrizCurricular.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMediaFinal");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsMediaFinal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMensagemAPP");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsMensagemAPP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMensagemResposta");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsMensagemResposta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMensagensAPP");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsMensagensAPP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMidias");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsMidias.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsModalidadeTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsModalidadeTurma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMovimentacaoAluno");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsMovimentacaoAluno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMovimentacoesAlunos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsMovimentacoesAlunos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMudancaEntreTurmas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsMudancaEntreTurmas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsNotaParcial");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsNotaParcial.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsNotasParciais");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsNotasParciais.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsNotasPeriodos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsNotasPeriodos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOcorrencias");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsOcorrencias.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOperadoraCartao");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsOperadoraCartao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOperadoraCartaoPlanos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsOperadoraCartaoPlanos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOrigensAlunos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsOrigensAlunos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcela");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsParcela.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcelaPagar");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsParcelaPagar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcelaQuitacao");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsParcelaQuitacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcelas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsParcelas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcelasPagar");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsParcelasPagar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsPlanoCurso");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsPlanoCurso.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsQuadroHorarios");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsQuadroHorarios.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsQuitacao");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsQuitacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsResponsaveis");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsResponsaveis.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsResponsavel");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsResponsavel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetNovaRespostaMensagem");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsRetNovaRespostaMensagem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoAlunosAlterados");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsRetornoAlunosAlterados.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoBoletos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsRetornoBoletos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcela");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsRetornoParcela.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelaPagar");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsRetornoParcelaPagar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsRetornoParcelas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetornoParcelasPagar");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsRetornoParcelasPagar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsSistemaAvaliacao");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsSistemaAvaliacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsSituacoesAlunos");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsSituacoesAlunos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsSituacoesAlunosTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsSituacoesAlunosTurma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsTurma");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsTurma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsVendas");
            cachedSerQNames.add(qName);
            cls = br.net.sponteeducacional.api.WsVendas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public br.net.sponteeducacional.api.TokenMobile[] updateOpcoesNotificacaoApp(int nCodigoCliente, int nAlunoID, int nResponsavelID, int nNotificaAgenda, int nNotificaAtendimento, int nNotificaNota, int nNotificaFinanceiro, int nNotificaComunicados, int nNotificaMensagem, java.lang.String sTokenMobile, java.lang.String sToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/UpdateOpcoesNotificacaoApp");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateOpcoesNotificacaoApp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), new java.lang.Integer(nAlunoID), new java.lang.Integer(nResponsavelID), new java.lang.Integer(nNotificaAgenda), new java.lang.Integer(nNotificaAtendimento), new java.lang.Integer(nNotificaNota), new java.lang.Integer(nNotificaFinanceiro), new java.lang.Integer(nNotificaComunicados), new java.lang.Integer(nNotificaMensagem), sTokenMobile, sToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.TokenMobile[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.TokenMobile[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.TokenMobile[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.TokenMobile[] insertOrDeleteTokenApp(int nCodigoCliente, int nAlunoID, int nResponsavelID, java.lang.String sSistemaOperacional, java.lang.String sTokenMobile, java.lang.String sToken, int nAcao) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/InsertOrDeleteTokenApp");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertOrDeleteTokenApp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), new java.lang.Integer(nAlunoID), new java.lang.Integer(nResponsavelID), sSistemaOperacional, sTokenMobile, sToken, new java.lang.Integer(nAcao)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.TokenMobile[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.TokenMobile[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.TokenMobile[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsFotoApp[] updateImageApp(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nResponsavelID, java.lang.String sFoto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/UpdateImageApp");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateImageApp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nAlunoID), new java.lang.Integer(nResponsavelID), sFoto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsFotoApp[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsFotoApp[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsFotoApp[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsAtualizaSenhaAlunoResponsavel[] updateSenhaPortal(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nResponsavelID, java.lang.String sNovaSenha) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/UpdateSenhaPortal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateSenhaPortal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nAlunoID), new java.lang.Integer(nResponsavelID), sNovaSenha});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsAtualizaSenhaAlunoResponsavel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsAtualizaSenhaAlunoResponsavel[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsAtualizaSenhaAlunoResponsavel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsFotoApp[] getImageApp(int nCodigoCliente, int nAlunoID, int nResponsavelID, java.lang.String sToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetImageApp");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetImageApp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), new java.lang.Integer(nAlunoID), new java.lang.Integer(nResponsavelID), sToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsFotoApp[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsFotoApp[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsFotoApp[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsResponsavel[] getResponsaveisApp(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetResponsaveisApp");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetResponsaveisApp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsResponsavel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsResponsavel[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsResponsavel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean insertTimeline(java.lang.String token, int codCliSponte, java.lang.String title, java.lang.String subtitle, java.lang.String type, java.util.Calendar record_date, int student_id, int responsible_id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/InsertTimeline");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertTimeline"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(codCliSponte), title, subtitle, type, record_date, new java.lang.Integer(student_id), new java.lang.Integer(responsible_id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.Timeline[] getTimeline(java.lang.String token, int codCliSponte, int student_id, int responsible_id, int pagenumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetTimeline");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetTimeline"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(codCliSponte), new java.lang.Integer(student_id), new java.lang.Integer(responsible_id), new java.lang.Integer(pagenumber)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.Timeline[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.Timeline[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.Timeline[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean updateReadTimeline(java.lang.String token, int codCliSponte, java.lang.String timeline_id, boolean read) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/UpdateReadTimeline");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateReadTimeline"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(codCliSponte), timeline_id, new java.lang.Boolean(read)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsAtualizaSituacaoComunicado updateSituacaoComunicadoApp(int nCodigoCliente, java.lang.String sToken, int nComunicadoID, int nAlunoID, int nResponsavelID, org.apache.axis.types.UnsignedByte nLido) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/UpdateSituacaoComunicadoApp");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateSituacaoComunicadoApp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nComunicadoID), new java.lang.Integer(nAlunoID), new java.lang.Integer(nResponsavelID), nLido});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsAtualizaSituacaoComunicado) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsAtualizaSituacaoComunicado) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsAtualizaSituacaoComunicado.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsComunicadoAPP getComunicadoAPP(int nCodigoCliente, java.lang.String sToken, int nComunicadoID, int nAlunoID, int nResponsavelID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetComunicadoAPP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetComunicadoAPP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nComunicadoID), new java.lang.Integer(nAlunoID), new java.lang.Integer(nResponsavelID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsComunicadoAPP) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsComunicadoAPP) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsComunicadoAPP.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsComunicadoAPP[] getComunicadosAPP(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca, int nNumeroPagina) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetComunicadosAPP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetComunicadosAPP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca, new java.lang.Integer(nNumeroPagina)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsComunicadoAPP[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsComunicadoAPP[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsComunicadoAPP[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsMensagemAPP getMensagemRespostasAPP(int nCodigoCliente, java.lang.String sToken, int nMensagemID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetMensagemRespostasAPP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetMensagemRespostasAPP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nMensagemID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsMensagemAPP) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsMensagemAPP) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsMensagemAPP.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsMensagensAPP[] getMensagensAPP(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nResponsavelID, int nNumeroPagina) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetMensagensAPP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetMensagensAPP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nAlunoID), new java.lang.Integer(nResponsavelID), new java.lang.Integer(nNumeroPagina)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsMensagensAPP[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsMensagensAPP[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsMensagensAPP[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsRetNovaRespostaMensagem novaRespostaMensagemApp(int nCodigoCliente, java.lang.String sToken, int nMensagemID, java.lang.String sMensagem, int nAlunoID, int nResponsavelID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/NovaRespostaMensagemApp");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NovaRespostaMensagemApp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nMensagemID), sMensagem, new java.lang.Integer(nAlunoID), new java.lang.Integer(nResponsavelID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsRetNovaRespostaMensagem) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsRetNovaRespostaMensagem) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsRetNovaRespostaMensagem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsMovimentacoesAlunos[] getMovimentacaoAluno(int nCodigoCliente, java.lang.String sToken, int nAlunoID, java.lang.String dDataInicio, java.lang.String dDataTermino) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetMovimentacaoAluno");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetMovimentacaoAluno"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nAlunoID), dDataInicio, dDataTermino});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsMovimentacoesAlunos[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsMovimentacoesAlunos[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsMovimentacoesAlunos[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.InsertMovimentacaoResponseInsertMovimentacaoResult insertMovimentacao(int nCodigoCliente, java.lang.String sToken, java.lang.String sJsonMovimentacao) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/InsertMovimentacao");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertMovimentacao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sJsonMovimentacao});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.InsertMovimentacaoResponseInsertMovimentacaoResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.InsertMovimentacaoResponseInsertMovimentacaoResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.InsertMovimentacaoResponseInsertMovimentacaoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsCartoesCatraca[] getCartoesCatraca(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nResponsavelID, int nVisitanteID, int nFuncionarioID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetCartoesCatraca");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetCartoesCatraca"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nAlunoID), new java.lang.Integer(nResponsavelID), new java.lang.Integer(nVisitanteID), new java.lang.Integer(nFuncionarioID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsCartoesCatraca[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsCartoesCatraca[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsCartoesCatraca[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsQuadroHorarios[] getQuadroHorarios(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetQuadroHorarios");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetQuadroHorarios"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsQuadroHorarios[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsQuadroHorarios[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsQuadroHorarios[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsHorariosAula[] getHorariosAulas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetHorariosAulas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetHorariosAulas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsHorariosAula[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsHorariosAula[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsHorariosAula[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsDiarioAulas[] getDiarioAulas(int nCodigoCliente, java.lang.String sToken, int nTurmaID, int nDisciplinaID, java.lang.String dDataInicio, java.lang.String dDataTermino, int nModulo, java.lang.String sSemana) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetDiarioAulas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetDiarioAulas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nTurmaID), new java.lang.Integer(nDisciplinaID), dDataInicio, dDataTermino, new java.lang.Integer(nModulo), sSemana});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsDiarioAulas[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsDiarioAulas[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsDiarioAulas[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.InsertFrequenciaDiarioResponseInsertFrequenciaDiarioResult insertFrequenciaDiario(int nCodigoCliente, java.lang.String sToken, int nTurmaID, int nDisciplinaID, int nModulo, java.lang.String sDataAula, int sNumAula, java.lang.String sAlunosFaltantes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/InsertFrequenciaDiario");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertFrequenciaDiario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nTurmaID), new java.lang.Integer(nDisciplinaID), new java.lang.Integer(nModulo), sDataAula, new java.lang.Integer(sNumAula), sAlunosFaltantes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.InsertFrequenciaDiarioResponseInsertFrequenciaDiarioResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.InsertFrequenciaDiarioResponseInsertFrequenciaDiarioResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.InsertFrequenciaDiarioResponseInsertFrequenciaDiarioResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.InsertConteudoDiarioResponseInsertConteudoDiarioResult insertConteudoDiario(int nCodigoCliente, java.lang.String sToken, int nDiarioClasseID, java.lang.String sConteudo, java.lang.String sObservacao, java.lang.String sSituacao) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/InsertConteudoDiario");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertConteudoDiario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nDiarioClasseID), sConteudo, sObservacao, sSituacao});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.InsertConteudoDiarioResponseInsertConteudoDiarioResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.InsertConteudoDiarioResponseInsertConteudoDiarioResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.InsertConteudoDiarioResponseInsertConteudoDiarioResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.InsertHistoricoEscolarResponseInsertHistoricoEscolarResult insertHistoricoEscolar(int nCodigoCliente, java.lang.String sToken, java.lang.String sJsonHistoricoEscolar) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/InsertHistoricoEscolar");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertHistoricoEscolar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sJsonHistoricoEscolar});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.InsertHistoricoEscolarResponseInsertHistoricoEscolarResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.InsertHistoricoEscolarResponseInsertHistoricoEscolarResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.InsertHistoricoEscolarResponseInsertHistoricoEscolarResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsAluno[] getAlunos(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetAlunos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetAlunos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsAluno[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsAluno[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsAluno[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.InsertAlunosResponseInsertAlunosResult insertAlunos(int nCodigoCliente, java.lang.String sToken, java.lang.String sNome, java.lang.String sMidia, java.util.Calendar dDataNascimento, java.lang.String sCidade, java.lang.String sBairro, java.lang.String sCEP, java.lang.String sEndereco, java.lang.String nNumeroEndereco, java.lang.String sEmail, java.lang.String sTelefone, java.lang.String sCPF, java.lang.String sRG, java.lang.String sCelular, java.lang.String sObservacao, java.lang.String sSexo, java.lang.String sProfissao, java.lang.String sCidadeNatal, java.lang.String sRa, java.lang.String sNumeroMatricula, java.lang.String sSituacao, java.lang.String sCursoInteresse) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/InsertAlunos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertAlunos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sNome, sMidia, dDataNascimento, sCidade, sBairro, sCEP, sEndereco, nNumeroEndereco, sEmail, sTelefone, sCPF, sRG, sCelular, sObservacao, sSexo, sProfissao, sCidadeNatal, sRa, sNumeroMatricula, sSituacao, sCursoInteresse});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.InsertAlunosResponseInsertAlunosResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.InsertAlunosResponseInsertAlunosResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.InsertAlunosResponseInsertAlunosResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.UpdateAlunosResponseUpdateAlunosResult updateAlunos(int nCodigoCliente, java.lang.String sToken, int nAlunoID, java.lang.String sNome, java.lang.String sMidia, java.lang.String dDataNascimento, java.lang.String sCidade, java.lang.String sBairro, java.lang.String sCEP, java.lang.String sEndereco, java.lang.String nNumeroEndereco, java.lang.String sCPF, java.lang.String sRG, java.lang.String nResponsavelFinanceiroID, java.lang.String nResponsavelDidaticoID, java.lang.String sEmail, java.lang.String sTelefone, java.lang.String sCelular, java.lang.String sObservacao, java.lang.String sSexo, java.lang.String sProfissao, java.lang.String sCidadeNatal, java.lang.String sRa, java.lang.String sNumeroMatricula, java.lang.String sSituacao, java.lang.String sCursoInteresse) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/UpdateAlunos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateAlunos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nAlunoID), sNome, sMidia, dDataNascimento, sCidade, sBairro, sCEP, sEndereco, nNumeroEndereco, sCPF, sRG, nResponsavelFinanceiroID, nResponsavelDidaticoID, sEmail, sTelefone, sCelular, sObservacao, sSexo, sProfissao, sCidadeNatal, sRa, sNumeroMatricula, sSituacao, sCursoInteresse});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.UpdateAlunosResponseUpdateAlunosResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.UpdateAlunosResponseUpdateAlunosResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.UpdateAlunosResponseUpdateAlunosResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.SetInadimplenteResponseSetInadimplenteResult setInadimplente(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nInadimplente) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/SetInadimplente");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SetInadimplente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nAlunoID), new java.lang.Integer(nInadimplente)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.SetInadimplenteResponseSetInadimplenteResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.SetInadimplenteResponseSetInadimplenteResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.SetInadimplenteResponseSetInadimplenteResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsRetornoAlunosAlterados[] getAlunosAlterados(int nCodigoCliente, java.lang.String sToken, java.lang.String nQtdDias) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetAlunosAlterados");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetAlunosAlterados"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, nQtdDias});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsRetornoAlunosAlterados[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsRetornoAlunosAlterados[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsRetornoAlunosAlterados[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsSituacoesAlunos[] getSituacoesAlunos(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetSituacoesAlunos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetSituacoesAlunos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsSituacoesAlunos[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsSituacoesAlunos[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsSituacoesAlunos[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsOrigensAlunos[] getOrigensAlunos(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetOrigensAlunos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetOrigensAlunos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsOrigensAlunos[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsOrigensAlunos[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsOrigensAlunos[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsOcorrencias[] getOcorrenciasAluno(int nCodigoCliente, java.lang.String sToken, int nAlunoID, java.lang.String dDataInicial, java.lang.String dDataFinal) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetOcorrenciasAluno");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetOcorrenciasAluno"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nAlunoID), dDataInicial, dDataFinal});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsOcorrencias[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsOcorrencias[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsOcorrencias[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsCliente[] getClientes(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetClientes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetClientes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsCliente[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsCliente[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsCliente[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.InsertClienteResponseInsertClienteResult insertCliente(int nCodigoCliente, java.lang.String sToken, java.lang.String sNome, org.apache.axis.types.UnsignedByte nSituacao, org.apache.axis.types.UnsignedByte nTipo, java.lang.String sCPF, java.lang.String sRG, java.lang.String sCNPJ, java.lang.String sRazaoSocial, java.lang.String sCEP, java.lang.String sEndereco, java.lang.String sNumeroEndereco, java.lang.String sComplementoEndereco, java.lang.String sEmail, java.lang.String sInscricaoEstadual, java.lang.String sInscricaoMunicipal, java.lang.String sObservacao, java.lang.String sTelefone, java.lang.String sRamal, java.lang.String sCelular, java.lang.String sTelefoneFax, java.lang.String sCidade, java.lang.String sBairro, java.lang.String sAgencia, java.lang.String sConta, java.lang.String sCodigoClienteBanco, org.apache.axis.types.UnsignedByte nCliente, org.apache.axis.types.UnsignedByte nFornecedor, org.apache.axis.types.UnsignedByte nEscolaAluno, org.apache.axis.types.UnsignedByte nEmpresaAluno, java.lang.String sContato) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/InsertCliente");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertCliente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sNome, nSituacao, nTipo, sCPF, sRG, sCNPJ, sRazaoSocial, sCEP, sEndereco, sNumeroEndereco, sComplementoEndereco, sEmail, sInscricaoEstadual, sInscricaoMunicipal, sObservacao, sTelefone, sRamal, sCelular, sTelefoneFax, sCidade, sBairro, sAgencia, sConta, sCodigoClienteBanco, nCliente, nFornecedor, nEscolaAluno, nEmpresaAluno, sContato});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.InsertClienteResponseInsertClienteResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.InsertClienteResponseInsertClienteResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.InsertClienteResponseInsertClienteResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.UpdateClienteResponseUpdateClienteResult updateCliente(int nCodigoCliente, java.lang.String sToken, int nClienteID, java.lang.String sNome, java.lang.String nSituacao, java.lang.String nTipo, java.lang.String sCPF, java.lang.String sRG, java.lang.String sCNPJ, java.lang.String sRazaoSocial, java.lang.String sCEP, java.lang.String sEndereco, java.lang.String sNumeroEndereco, java.lang.String sComplementoEndereco, java.lang.String sEmail, java.lang.String sInscricaoEstadual, java.lang.String sInscricaoMunicipal, java.lang.String sObservacao, java.lang.String sTelefone, java.lang.String sRamal, java.lang.String sCelular, java.lang.String sTelefoneFax, java.lang.String sCidade, java.lang.String sBairro, java.lang.String sAgencia, java.lang.String sConta, java.lang.String sCodigoClienteBanco, java.lang.String nCliente, java.lang.String nFornecedor, java.lang.String nEscolaAluno, java.lang.String nEmpresaAluno, java.lang.String sContato) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/UpdateCliente");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateCliente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nClienteID), sNome, nSituacao, nTipo, sCPF, sRG, sCNPJ, sRazaoSocial, sCEP, sEndereco, sNumeroEndereco, sComplementoEndereco, sEmail, sInscricaoEstadual, sInscricaoMunicipal, sObservacao, sTelefone, sRamal, sCelular, sTelefoneFax, sCidade, sBairro, sAgencia, sConta, sCodigoClienteBanco, nCliente, nFornecedor, nEscolaAluno, nEmpresaAluno, sContato});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.UpdateClienteResponseUpdateClienteResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.UpdateClienteResponseUpdateClienteResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.UpdateClienteResponseUpdateClienteResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsConta[] getContas(int nCodigoCliente, java.lang.String sToken, java.lang.String nContaID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetContas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetContas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, nContaID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsConta[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsConta[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsConta[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsResponsavel[] getResponsaveis(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetResponsaveis");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetResponsaveis"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsResponsavel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsResponsavel[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsResponsavel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.InsertResponsaveisResponseInsertResponsaveisResult insertResponsaveis(int nCodigoCliente, java.lang.String sToken, java.lang.String sNome, java.util.Calendar dDataNascimento, int nParentesco, java.lang.String sCEP, java.lang.String sEndereco, int nNumeroEndereco, java.lang.String sRG, java.lang.String sCPFCNPJ, java.lang.String sCidade, java.lang.String sBairro, java.lang.String sEmail, java.lang.String sTelefone, java.lang.String sCelular, int nAlunoID, boolean lResponsavelFinanceiro, boolean lResponsavelDidatico, java.lang.String sObservacao, java.lang.String sSexo, java.lang.String sProfissao, org.apache.axis.types.UnsignedByte nTipoPessoa) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/InsertResponsaveis");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertResponsaveis"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sNome, dDataNascimento, new java.lang.Integer(nParentesco), sCEP, sEndereco, new java.lang.Integer(nNumeroEndereco), sRG, sCPFCNPJ, sCidade, sBairro, sEmail, sTelefone, sCelular, new java.lang.Integer(nAlunoID), new java.lang.Boolean(lResponsavelFinanceiro), new java.lang.Boolean(lResponsavelDidatico), sObservacao, sSexo, sProfissao, nTipoPessoa});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.InsertResponsaveisResponseInsertResponsaveisResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.InsertResponsaveisResponseInsertResponsaveisResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.InsertResponsaveisResponseInsertResponsaveisResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.UpdateResponsaveisResponseUpdateResponsaveisResult updateResponsaveis(int nCodigoCliente, java.lang.String sToken, int nResponsavelID, java.lang.String sNome, java.lang.String dDataNascimento, java.lang.String nParentesco, java.lang.String sCEP, java.lang.String sEndereco, java.lang.String nNumeroEndereco, java.lang.String sRG, java.lang.String sCPFCNPJ, java.lang.String sCidade, java.lang.String sBairro, java.lang.String sEmail, java.lang.String sTelefone, java.lang.String sCelular, java.lang.String nAlunoID, java.lang.String lResponsavelFinanceiro, java.lang.String lResponsavelDidatico, java.lang.String sObservacao, java.lang.String sSexo, java.lang.String sProfissao, java.lang.String nTipoPessoa) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/UpdateResponsaveis");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateResponsaveis"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nResponsavelID), sNome, dDataNascimento, nParentesco, sCEP, sEndereco, nNumeroEndereco, sRG, sCPFCNPJ, sCidade, sBairro, sEmail, sTelefone, sCelular, nAlunoID, lResponsavelFinanceiro, lResponsavelDidatico, sObservacao, sSexo, sProfissao, nTipoPessoa});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.UpdateResponsaveisResponseUpdateResponsaveisResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.UpdateResponsaveisResponseUpdateResponsaveisResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.UpdateResponsaveisResponseUpdateResponsaveisResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsMatrizCurricular[] getMatrizCurricular(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetMatrizCurricular");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetMatrizCurricular"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsMatrizCurricular[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsMatrizCurricular[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsMatrizCurricular[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsDisciplina[] getDisciplina(int nCodigoCliente, java.lang.String sToken, int nDisciplinaID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetDisciplina");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetDisciplina"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nDisciplinaID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsDisciplina[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsDisciplina[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsDisciplina[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsCurso[] getCursos(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetCursos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetCursos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsCurso[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsCurso[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsCurso[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.InsertTurmaResponseInsertTurmaResult insertTurma(int nCodigoCliente, java.lang.String sToken, java.lang.String sNome, int nCursoId, int nAnoLetivo, java.lang.String sSigla, int nModulo, java.util.Calendar dDataInicio, int nTipoTurma, int nTurno) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/InsertTurma");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertTurma"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sNome, new java.lang.Integer(nCursoId), new java.lang.Integer(nAnoLetivo), sSigla, new java.lang.Integer(nModulo), dDataInicio, new java.lang.Integer(nTipoTurma), new java.lang.Integer(nTurno)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.InsertTurmaResponseInsertTurmaResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.InsertTurmaResponseInsertTurmaResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.InsertTurmaResponseInsertTurmaResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.InsertTurmasAtivasResponseInsertTurmasAtivasResult insertTurmasAtivas(int nCodigoCliente, java.lang.String sToken, java.lang.String sNome, int nCursoId, int nAnoLetivo, java.lang.String sSigla, int nModulo, java.util.Calendar dDataInicio, int nTipoTurma, int nTurno, int nOrdem, int nModalidadeID, java.util.Calendar dDataTermino, int nSituacao, int nMinAlunos, int nHorarioID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/InsertTurmasAtivas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertTurmasAtivas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sNome, new java.lang.Integer(nCursoId), new java.lang.Integer(nAnoLetivo), sSigla, new java.lang.Integer(nModulo), dDataInicio, new java.lang.Integer(nTipoTurma), new java.lang.Integer(nTurno), new java.lang.Integer(nOrdem), new java.lang.Integer(nModalidadeID), dDataTermino, new java.lang.Integer(nSituacao), new java.lang.Integer(nMinAlunos), new java.lang.Integer(nHorarioID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.InsertTurmasAtivasResponseInsertTurmasAtivasResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.InsertTurmasAtivasResponseInsertTurmasAtivasResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.InsertTurmasAtivasResponseInsertTurmasAtivasResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.UpdateTurmasResponseUpdateTurmasResult updateTurmas(int nCodigoCliente, java.lang.String sToken, int nTurmaID, java.lang.String sNome, java.lang.String sSigla, java.lang.String nOrdem, java.lang.String nModalidadeID, java.lang.String sDataInicio, java.lang.String sDataTermino, java.lang.String nSituacao, java.lang.String nMinimoAlunos, java.lang.String nMaximoAlunos, java.lang.String nTurnoID, java.lang.String nHorarioID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/UpdateTurmas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateTurmas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nTurmaID), sNome, sSigla, nOrdem, nModalidadeID, sDataInicio, sDataTermino, nSituacao, nMinimoAlunos, nMaximoAlunos, nTurnoID, nHorarioID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.UpdateTurmasResponseUpdateTurmasResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.UpdateTurmasResponseUpdateTurmasResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.UpdateTurmasResponseUpdateTurmasResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsTurma[] getTurmas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetTurmas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetTurmas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsTurma[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsTurma[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsTurma[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.InsertMatriculaResponseInsertMatriculaResult insertMatricula(int nCodigoCliente, java.lang.String sToken, int nSituacao, int nAlunoID, int nCursoID, java.lang.String nTurmaID, int nTipoContratoID, java.lang.String dDataInicio, java.lang.String dDataTermino, java.util.Calendar dDataMatricula, org.apache.axis.types.UnsignedByte nTipo, java.lang.String sDisciplinas, java.lang.String nModulo, java.lang.String nContratante, java.lang.String nNumeroHoras, java.lang.String sObservacao) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/InsertMatricula");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertMatricula"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nSituacao), new java.lang.Integer(nAlunoID), new java.lang.Integer(nCursoID), nTurmaID, new java.lang.Integer(nTipoContratoID), dDataInicio, dDataTermino, dDataMatricula, nTipo, sDisciplinas, nModulo, nContratante, nNumeroHoras, sObservacao});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.InsertMatriculaResponseInsertMatriculaResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.InsertMatriculaResponseInsertMatriculaResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.InsertMatriculaResponseInsertMatriculaResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.UpdateMatriculaResponseUpdateMatriculaResult updateMatricula(int nCodigoCliente, java.lang.String sToken, java.lang.String nContratoID, java.lang.String nContratoAulaLivreID, java.lang.String nSituacao, java.lang.String nCursoID, java.lang.String nTipoContratoID, java.lang.String dDataInicio, java.lang.String nContratante, java.lang.String dDataTermino, java.lang.String dDataMatricula, java.lang.String nModulo, java.lang.String sDisciplinasMatricular, java.lang.String sDisciplinasRemover, java.lang.String sObservacao) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/UpdateMatricula");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateMatricula"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, nContratoID, nContratoAulaLivreID, nSituacao, nCursoID, nTipoContratoID, dDataInicio, nContratante, dDataTermino, dDataMatricula, nModulo, sDisciplinasMatricular, sDisciplinasRemover, sObservacao});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.UpdateMatriculaResponseUpdateMatriculaResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.UpdateMatriculaResponseUpdateMatriculaResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.UpdateMatriculaResponseUpdateMatriculaResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsMatricula[] getMatriculas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetMatriculas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetMatriculas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsMatricula[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsMatricula[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsMatricula[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsIntegrantesTurma[] getIntegrantesTurmas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetIntegrantesTurmas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetIntegrantesTurmas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsIntegrantesTurma[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsIntegrantesTurma[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsIntegrantesTurma[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsMudancaEntreTurmas setMudancaEntreTurmas(int nCodigoCliente, java.lang.String sToken, int alunoID, int turmaOrigemID, int turmaDestinoID, java.lang.String observacoes, int nSituacaoAlunoTurmaID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/SetMudancaEntreTurmas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SetMudancaEntreTurmas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(alunoID), new java.lang.Integer(turmaOrigemID), new java.lang.Integer(turmaDestinoID), observacoes, new java.lang.Integer(nSituacaoAlunoTurmaID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsMudancaEntreTurmas) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsMudancaEntreTurmas) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsMudancaEntreTurmas.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsModalidadeTurma[] getModalidadeDasTurmas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetModalidadeDasTurmas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetModalidadeDasTurmas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsModalidadeTurma[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsModalidadeTurma[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsModalidadeTurma[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsSituacoesAlunosTurma[] getSituacoesAlunosTurma(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetSituacoesAlunosTurma");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetSituacoesAlunosTurma"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsSituacoesAlunosTurma[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsSituacoesAlunosTurma[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsSituacoesAlunosTurma[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsBolsa[] getBolsas(int nCodigoCliente, java.lang.String sToken, java.lang.String sTipoDesconto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetBolsas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetBolsas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sTipoDesconto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsBolsa[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsBolsa[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsBolsa[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsFormasCobrancas[] getFormasCobrancas(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetFormasCobrancas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetFormasCobrancas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsFormasCobrancas[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsFormasCobrancas[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsFormasCobrancas[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsCategorias[] getCategorias(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetCategorias");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetCategorias"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsCategorias[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsCategorias[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsCategorias[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsItens[] getItens(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetItens");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetItens"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsItens[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsItens[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsItens[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsLayouts[] getLayouts(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetLayouts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetLayouts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsLayouts[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsLayouts[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsLayouts[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsRetornoParcelas[] insertPlano(int nCodigoCliente, java.lang.String sToken, java.lang.String nContratoID, java.lang.String nContratoAulaLivreID, java.lang.String nAlunoID, java.lang.String nTipoPlano, java.lang.String nBolsaID, java.util.Calendar dDataPrimeiroVencimento, int nNumeroParcelas, double nValorParcelas, int nFormaCobrancaID, int nCategoriaID, java.lang.String sObservacao, java.lang.String nClienteID, java.lang.String nContaID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/InsertPlano");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertPlano"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, nContratoID, nContratoAulaLivreID, nAlunoID, nTipoPlano, nBolsaID, dDataPrimeiroVencimento, new java.lang.Integer(nNumeroParcelas), new java.lang.Double(nValorParcelas), new java.lang.Integer(nFormaCobrancaID), new java.lang.Integer(nCategoriaID), sObservacao, nClienteID, nContaID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsRetornoParcelas[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsRetornoParcelas[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsRetornoParcelas[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsRetornoParcelas[] updatePlano(int nCodigoCliente, java.lang.String sToken, int nContaReceberID, java.lang.String nContratoID, java.lang.String nContratoAulaLivreID, java.lang.String nTipoPlano, java.lang.String nBolsaID, java.lang.String dDataPrimeiroVencimento, java.lang.String nNumeroParcelas, java.lang.String nValorParcelas, java.lang.String nFormaCobrancaID, java.lang.String nCategoriaID, java.lang.String sObservacao, java.lang.String nContaID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/UpdatePlano");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdatePlano"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nContaReceberID), nContratoID, nContratoAulaLivreID, nTipoPlano, nBolsaID, dDataPrimeiroVencimento, nNumeroParcelas, nValorParcelas, nFormaCobrancaID, nCategoriaID, sObservacao, nContaID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsRetornoParcelas[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsRetornoParcelas[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsRetornoParcelas[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsRetornoParcela[] updateParcela(int nCodigoCliente, java.lang.String sToken, int nContaReceberID, int nNumeroParcela, java.lang.String nBolsaID, java.lang.String dDataVencimento, java.lang.String nValor, java.lang.String nFormaCobrancaID, java.lang.String nCategoriaID, java.lang.String sObservacao) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/UpdateParcela");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateParcela"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nContaReceberID), new java.lang.Integer(nNumeroParcela), nBolsaID, dDataVencimento, nValor, nFormaCobrancaID, nCategoriaID, sObservacao});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsRetornoParcela[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsRetornoParcela[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsRetornoParcela[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsParcela[] getParcelas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetParcelas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetParcelas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsParcela[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsParcela[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsParcela[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.InsertVendasResponseInsertVendasResult insertVendas(int nCodigoCliente, java.lang.String sToken, java.lang.String nContratoID, java.lang.String nContratoAulaLivreID, java.util.Calendar dDataVenda, java.lang.String nBolsaID, java.lang.String sItens, int nCategoriaID, int nNumeroParcelas, double nValorParcela, java.util.Calendar dDataPrimeiroVencimento, int nFormaCobrancaID, int nEntregue, java.lang.String sNumeroDocumento, java.lang.String sObservacao) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/InsertVendas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertVendas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, nContratoID, nContratoAulaLivreID, dDataVenda, nBolsaID, sItens, new java.lang.Integer(nCategoriaID), new java.lang.Integer(nNumeroParcelas), new java.lang.Double(nValorParcela), dDataPrimeiroVencimento, new java.lang.Integer(nFormaCobrancaID), new java.lang.Integer(nEntregue), sNumeroDocumento, sObservacao});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.InsertVendasResponseInsertVendasResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.InsertVendasResponseInsertVendasResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.InsertVendasResponseInsertVendasResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsVendas[] getVendas(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetVendas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetVendas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsVendas[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsVendas[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsVendas[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsRetornoBoletos[] getBoletos(int nCodigoCliente, java.lang.String sToken, int nContaReceberID, java.lang.String nNumeroParcela, int nCNABID, boolean lSobrescrever) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetBoletos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetBoletos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nContaReceberID), nNumeroParcela, new java.lang.Integer(nCNABID), new java.lang.Boolean(lSobrescrever)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsRetornoBoletos[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsRetornoBoletos[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsRetornoBoletos[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsDadosFaturaVindi[] getDadosFaturaVindi(int nCodigoCliente, java.lang.String sToken, long nFaturaID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetDadosFaturaVindi");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetDadosFaturaVindi"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Long(nFaturaID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsDadosFaturaVindi[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsDadosFaturaVindi[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsDadosFaturaVindi[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsFinanceiro[] getFinanceiro(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetFinanceiro");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetFinanceiro"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsFinanceiro[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsFinanceiro[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsFinanceiro[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsPlanoCurso[] getPlanosCursos(int nCodigoCliente, java.lang.String sToken, int nCursoID, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetPlanosCursos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetPlanosCursos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nCursoID), sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsPlanoCurso[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsPlanoCurso[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsPlanoCurso[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.GetLinhaDigitavelBoletosResponseGetLinhaDigitavelBoletosResult getLinhaDigitavelBoletos(int nCodigoCliente, java.lang.String sToken, int nContaReceberID, java.lang.String nNumeroParcela) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetLinhaDigitavelBoletos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetLinhaDigitavelBoletos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nContaReceberID), nNumeroParcela});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.GetLinhaDigitavelBoletosResponseGetLinhaDigitavelBoletosResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.GetLinhaDigitavelBoletosResponseGetLinhaDigitavelBoletosResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.GetLinhaDigitavelBoletosResponseGetLinhaDigitavelBoletosResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.SetNotaParcialResponseSetNotaParcialResult setNotaParcial(int nCodigoCliente, java.lang.String sToken, int nTurmaID, int nDisciplinaID, int nAlunoId, java.lang.String sNomeAvaliacao, java.lang.String nNota, java.lang.String nPesoAvaliacao, int nModulo, int nPeriodo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/SetNotaParcial");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SetNotaParcial"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nTurmaID), new java.lang.Integer(nDisciplinaID), new java.lang.Integer(nAlunoId), sNomeAvaliacao, nNota, nPesoAvaliacao, new java.lang.Integer(nModulo), new java.lang.Integer(nPeriodo)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.SetNotaParcialResponseSetNotaParcialResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.SetNotaParcialResponseSetNotaParcialResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.SetNotaParcialResponseSetNotaParcialResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.SetNotaResponseSetNotaResult setNota(int nCodigoCliente, java.lang.String sToken, int nTurmaID, int nDisciplinaID, int nAlunoId, java.lang.String nNota, int nModulo, int nPeriodo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/SetNota");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SetNota"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nTurmaID), new java.lang.Integer(nDisciplinaID), new java.lang.Integer(nAlunoId), nNota, new java.lang.Integer(nModulo), new java.lang.Integer(nPeriodo)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.SetNotaResponseSetNotaResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.SetNotaResponseSetNotaResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.SetNotaResponseSetNotaResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsMediaFinal getMediaFinal(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nTurmaID, int nDisciplinaID, java.lang.String nModulo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetMediaFinal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetMediaFinal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nAlunoID), new java.lang.Integer(nTurmaID), new java.lang.Integer(nDisciplinaID), nModulo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsMediaFinal) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsMediaFinal) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsMediaFinal.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsBoletim getBoletim(int nCodigoCliente, java.lang.String sToken, int nAlunoID, int nTurmaID, int nDisciplinaID, int nModulo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetBoletim");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetBoletim"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nAlunoID), new java.lang.Integer(nTurmaID), new java.lang.Integer(nDisciplinaID), new java.lang.Integer(nModulo)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsBoletim) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsBoletim) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsBoletim.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsBoletimAulasLivres getBoletimAulasLivres(int nCodigoCliente, java.lang.String sToken, int nContratoAulaLivreID, int nDisciplinaID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetBoletimAulasLivres");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetBoletimAulasLivres"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nContratoAulaLivreID), new java.lang.Integer(nDisciplinaID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsBoletimAulasLivres) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsBoletimAulasLivres) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsBoletimAulasLivres.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WSCertificado getCertificadoValido(int nCodigoCliente, java.lang.String sNumeroCertificado) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetCertificadoValido");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetCertificadoValido"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sNumeroCertificado});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WSCertificado) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WSCertificado) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WSCertificado.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsFuncionario[] getFuncionarios(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetFuncionarios");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetFuncionarios"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsFuncionario[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsFuncionario[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsFuncionario[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsMidias[] getMidias(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetMidias");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetMidias"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsMidias[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsMidias[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsMidias[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsGestaoComercial[] getIndicesGestaoComercial(int nCodigoCliente, java.lang.String sToken, java.lang.String sDataInicial, java.lang.String sDataFinal) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetIndicesGestaoComercial");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetIndicesGestaoComercial"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sDataInicial, sDataFinal});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsGestaoComercial[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsGestaoComercial[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsGestaoComercial[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsAtendimentos[] getAtendimentos(int nCodigoCliente, java.lang.String sToken, java.lang.String nCodigoFuncionario, java.lang.String sDataInicial, java.lang.String sDataFinal) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetAtendimentos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetAtendimentos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, nCodigoFuncionario, sDataInicial, sDataFinal});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsAtendimentos[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsAtendimentos[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsAtendimentos[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsQuitacao quitarParcelas(int nCodigoCliente, java.lang.String sToken, java.lang.String sContaReceberID, java.lang.String sContaPagarID, java.lang.String sNumeroParcela, int nContaID, java.lang.String dDataPagamento, java.lang.String nValorPago, int nFormaPagamentoID, java.lang.String sOperadoraID, java.lang.String sBandeiraCartao, java.lang.String sQuantidadeVezesParcelamento, java.lang.String sNumeroCartao, boolean lQuitarTodasPendentesPlano) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/QuitarParcelas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "QuitarParcelas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sContaReceberID, sContaPagarID, sNumeroParcela, new java.lang.Integer(nContaID), dDataPagamento, nValorPago, new java.lang.Integer(nFormaPagamentoID), sOperadoraID, sBandeiraCartao, sQuantidadeVezesParcelamento, sNumeroCartao, new java.lang.Boolean(lQuitarTodasPendentesPlano)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsQuitacao) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsQuitacao) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsQuitacao.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsOperadoraCartao[] getOperadorasCartao(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetOperadorasCartao");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetOperadorasCartao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsOperadoraCartao[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsOperadoraCartao[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsOperadoraCartao[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsAgendaAluno[] getAgendaAluno(int nCodigoCliente, java.lang.String sToken, int nAlunoID, java.lang.String sTurmaID, java.lang.String sCursoID, java.lang.String dDataInicio, java.lang.String dDataTermino) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetAgendaAluno");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetAgendaAluno"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nAlunoID), sTurmaID, sCursoID, dDataInicio, dDataTermino});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsAgendaAluno[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsAgendaAluno[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsAgendaAluno[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsCalendario[] getCalendarioDidatico(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetCalendarioDidatico");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetCalendarioDidatico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsCalendario[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsCalendario[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsCalendario[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsRetornoParcelasPagar[] insertPlanoContaPagar(int nCodigoCliente, java.lang.String sToken, java.lang.String nAlunoID, java.lang.String nFornecedorID, java.lang.String nFuncionarioID, java.util.Calendar dDataPrimeiroVencimento, int nNumeroParcelas, double nValorParcelas, java.lang.String nContaID, int nFormaCobrancaID, int nCategoriaID, java.lang.String sObservacao, java.lang.String sComplemento, java.lang.String sDocumento) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/InsertPlanoContaPagar");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertPlanoContaPagar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, nAlunoID, nFornecedorID, nFuncionarioID, dDataPrimeiroVencimento, new java.lang.Integer(nNumeroParcelas), new java.lang.Double(nValorParcelas), nContaID, new java.lang.Integer(nFormaCobrancaID), new java.lang.Integer(nCategoriaID), sObservacao, sComplemento, sDocumento});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsRetornoParcelasPagar[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsRetornoParcelasPagar[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsRetornoParcelasPagar[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsRetornoParcelasPagar[] updatePlanoPagar(int nCodigoCliente, java.lang.String sToken, int nContaPagarID, java.lang.String dDataPrimeiroVencimento, java.lang.String nNumeroParcelas, java.lang.String nValorParcelas, java.lang.String nFormaCobrancaID, java.lang.String nCategoriaID, java.lang.String nContaID, java.lang.String sObservacao, java.lang.String sComplemento, java.lang.String sDocumento) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/UpdatePlanoPagar");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdatePlanoPagar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nContaPagarID), dDataPrimeiroVencimento, nNumeroParcelas, nValorParcelas, nFormaCobrancaID, nCategoriaID, nContaID, sObservacao, sComplemento, sDocumento});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsRetornoParcelasPagar[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsRetornoParcelasPagar[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsRetornoParcelasPagar[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsRetornoParcelaPagar[] updateParcelaPagar(int nCodigoCliente, java.lang.String sToken, int nContaPagarID, int nNumeroParcela, java.lang.String dDataVencimento, java.lang.String nValor, java.lang.String nFormaCobrancaID, java.lang.String nContaID, java.lang.String nCategoriaID, java.lang.String sObservacao) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/UpdateParcelaPagar");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "UpdateParcelaPagar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nContaPagarID), new java.lang.Integer(nNumeroParcela), dDataVencimento, nValor, nFormaCobrancaID, nContaID, nCategoriaID, sObservacao});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsRetornoParcelaPagar[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsRetornoParcelaPagar[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsRetornoParcelaPagar[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsParcelaPagar[] getParcelasPagar(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetParcelasPagar");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetParcelasPagar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsParcelaPagar[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsParcelaPagar[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsParcelaPagar[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsSistemaAvaliacao[] getSistemaAvaliacao(int nCodigoCliente, java.lang.String sToken, java.lang.String nTurmaID, java.lang.String nDisciplinaID, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetSistemaAvaliacao");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetSistemaAvaliacao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, nTurmaID, nDisciplinaID, sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsSistemaAvaliacao[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsSistemaAvaliacao[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsSistemaAvaliacao[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsAvaliacoesParciais[] getAvaliacaoParcial(int nCodigoCliente, java.lang.String sToken, int nTurmaID, int nDisciplinaID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetAvaliacaoParcial");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetAvaliacaoParcial"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nTurmaID), new java.lang.Integer(nDisciplinaID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsAvaliacoesParciais[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsAvaliacoesParciais[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsAvaliacoesParciais[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsFrequenciaTurma[] getFrequenciaTurma(int nCodigoCliente, java.lang.String sToken, int nTurmaID, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetFrequenciaTurma");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetFrequenciaTurma"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nTurmaID), sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsFrequenciaTurma[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsFrequenciaTurma[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsFrequenciaTurma[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsNotasParciais getNotaParcial(int nCodigoCliente, java.lang.String sToken, int nCursoID, int nTurmaID, int nAlunoID, java.lang.String sParametrosBusca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetNotaParcial");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetNotaParcial"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, new java.lang.Integer(nCursoID), new java.lang.Integer(nTurmaID), new java.lang.Integer(nAlunoID), sParametrosBusca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsNotasParciais) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsNotasParciais) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsNotasParciais.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsLoginPortal validaLoginPortal(java.lang.String sLogin, java.lang.String sSenha, java.lang.String sEmpresa, int nTipoUsuario) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/ValidaLoginPortal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ValidaLoginPortal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sLogin, sSenha, sEmpresa, new java.lang.Integer(nTipoUsuario)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsLoginPortal) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsLoginPortal) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsLoginPortal.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsFinanceiro[] getFinanceiroApp(int nCodigoCliente, java.lang.String sToken, java.lang.String sParametrosBusca, short nNumeroPagina) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetFinanceiroApp");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetFinanceiroApp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken, sParametrosBusca, new java.lang.Short(nNumeroPagina)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsFinanceiro[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsFinanceiro[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsFinanceiro[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsLoginApp validaLoginApp(java.lang.String sLogin, java.lang.String sSenha, java.lang.String sEmpresa, int nTipoUsuario, java.lang.String sTokenApp) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/ValidaLoginApp");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ValidaLoginApp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sLogin, sSenha, sEmpresa, new java.lang.Integer(nTipoUsuario), sTokenApp});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsLoginApp) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsLoginApp) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsLoginApp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsAppPortalNotas[] getConfiguracaoApp(int nCodigoCliente, java.lang.String sToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetConfiguracaoApp");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetConfiguracaoApp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), sToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsAppPortalNotas[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsAppPortalNotas[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsAppPortalNotas[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.net.sponteeducacional.api.WsAppPortalNotasNotificacao[] getOpcoesNotificacao(int nCodigoCliente, int nAlunoID, int nResponsavelID, java.lang.String sToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://api.sponteeducacional.net.br/GetOpcoesNotificacao");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetOpcoesNotificacao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(nCodigoCliente), new java.lang.Integer(nAlunoID), new java.lang.Integer(nResponsavelID), sToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.net.sponteeducacional.api.WsAppPortalNotasNotificacao[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.net.sponteeducacional.api.WsAppPortalNotasNotificacao[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.net.sponteeducacional.api.WsAppPortalNotasNotificacao[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
