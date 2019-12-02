package br.com.maplebearsystem.view;

import java.io.FileOutputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.sun.glass.ui.Pixels.Format;

import br.com.maplebearsystem.controller.ContratoController;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.Contrato;
import br.com.maplebearsystem.model.constants.PessoaConstants;
import br.com.maplebearsystem.model.validators.FieldValidators;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.ui.util.TextFieldFormatterHelper;
import br.com.maplebearsystem.view.component.FXMLAlunoSearchController;
import br.com.maplebearsystem.view.component.FXMLContratoSearchController;
import br.com.maplebearsystem.view.util.FXUISetup;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLContratoController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootMenuPane;

	@FXML
	private StackPane rootPane;

	@FXML
	private VBox panelMain;

	@FXML
	private VBox vboxprodutos;

	@FXML
	private JFXTextField tfieldnome;

	@FXML
	private JFXDatePicker dtdianasc;

	@FXML
	private JFXTextField tfieldNacionalidade;

	@FXML
	private JFXTextField tfieldprofissao;

	@FXML
	private JFXTextField tfieldEstCivil;

	@FXML
	private JFXTextField tfieldCPF;

	@FXML
	private JFXTextField tfieldRG;

	@FXML
	private JFXTextField tfieldEnd;

	@FXML
	private JFXTextField tfieldNum;

	@FXML
	private JFXTextField tfieldComp;

	@FXML
	private JFXTextField tfieldCidade;

	@FXML
	private JFXTextField tfieldCep;

	@FXML
	private JFXTextField tfieldEstado;

	@FXML
	private VBox vboxprodutos3;

	@FXML
	private JFXTextField tfieldnome3;

	@FXML
	private JFXDatePicker dtdianasc2;

	@FXML
	private JFXTextField tfieldNacionalidade1;

	@FXML
	private JFXTextField tfieldprofissao1;

	@FXML
	private JFXTextField tfieldEstCivil1;

	@FXML
	private JFXTextField tfieldCPF1;

	@FXML
	private JFXTextField tfieldRG1;

	@FXML
	private JFXTextField tfieldEnd1;

	@FXML
	private JFXTextField tfieldNum1;

	@FXML
	private JFXTextField tfieldComp1;

	@FXML
	private JFXTextField tfieldCidade1;

	@FXML
	private JFXTextField tfieldCep1;

	@FXML
	private JFXTextField tfieldEstado1;

	@FXML
	private VBox vboxprodutos2;

	@FXML
	private JFXTextField tfieldAluno;

	@FXML
	private JFXTextField tfieldTurma;

	@FXML
	private JFXTextField tfieldTurno;

	@FXML
	private JFXTextField tfieldGuarda;

	@FXML
	private JFXTextField tfieldPreco;

	@FXML
	private JFXTextField tfieldParcela;

	@FXML
	private JFXButton btsalvar;

	@FXML
	private JFXDatePicker dtpagamento;

	@FXML
	private JFXButton btbuscaralu;

	@FXML
	private JFXButton btbuscarcon;

	private FXMLDefaultControllerInterface sourceController;
	private static ContratoController contratoController;
	private static String FILE = "c:/temp/FirstPdf.pdf";
	private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
	private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 11, Font.NORMAL);
	private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	// private static Font font = new Font(new BaseFont("c:/windows/fonts/Century
	// Gothic.ttf", BaseFont.WINANSI), 11f, Font.BOLD);

	@FXML
	void salvarpedido(ActionEvent event) {
		List<Exception> errorList = contratoController.validar(tfieldnome.getText(), dtdianasc.getValue(),
				tfieldNacionalidade.getText(), tfieldprofissao.getText(), tfieldEstCivil.getText(), tfieldCPF.getText(),
				tfieldRG.getText(), tfieldEnd.getText(), tfieldNum.getText(), tfieldComp.getText(),
				tfieldCidade.getText(), tfieldCep.getText(), tfieldEstado.getText(), tfieldnome3.getText(),
				dtdianasc2.getValue(), tfieldNacionalidade1.getText(), tfieldprofissao1.getText(),
				tfieldEstCivil1.getText(), tfieldCPF1.getText(), tfieldRG1.getText(), tfieldEnd1.getText(),
				tfieldNum1.getText(), tfieldComp1.getText(), tfieldCidade1.getText(), tfieldCep1.getText(),
				tfieldEstado1.getText(), tfieldAluno.getText(), tfieldTurma.getText(), tfieldTurno.getText(),
				tfieldGuarda.getText(), tfieldPreco.getText(), tfieldParcela.getText(),dtpagamento.getValue());

		if (errorList.isEmpty()) {
			FXUISetup.getInstance().clearTextInputs(rootPane);
			FXUISetup.getInstance().clearTableViews(rootPane);
			Alert alert = new Alert(Alert.AlertType.INFORMATION, "Salvo", ButtonType.OK);
			alert.showAndWait();
			gerarpdf();

		} else {
			String text = "";

			for (Exception e : errorList) {
				text = text + e.getMessage() + "\n";
			}

			Alert errAlert = new Alert(Alert.AlertType.WARNING, text, ButtonType.OK);
			errAlert.showAndWait();
		}
	}

	private void gerarpdf() {
		try {
			Document document = new Document();
			document.setPageSize(PageSize.A4);
			document.setMargins(50, 45, 50, 60);
			document.setMarginMirroring(false);
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(FILE));
			writer.setPageEvent(new HeaderFooterPageEvent());

			document.open();
			addContent(document);
			document.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void addContent(Document document) throws DocumentException {
		Paragraph preface = new Paragraph();
		// We add one empty line
		addEmptyLine(preface, 2);
		// Lets write a big header
		Paragraph p = new Paragraph("CONTRATO DE ADESÃO DE PRESTAÇÃO DE SERVIÇOS DE EDUCAÇÃO ESCOLAR", catFont);
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("CENTRO PRUDENTINO DE ENSINO LTDA – ME, inscrita no CNPJ/MF sob o nº 21.347.139/0001-86,"
				+ " entidade mantenedora da escola Maple Bear Canadian School Prudente, "
				+ "instituição de ensino com sede na Avenida Antonio Canheti, 441, Jardim Cambui, "
				+ "na cidade de Presidente Prudente-SP, CEP 19061-545, onde serão prestados os serviços de "
				+ "educação escolar, doravante denominada simplesmente CONTRATADO, e:", smallBold);
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("Nome do Responsável (1): " + contratoController.getContrato().getResponsavel(), smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("Nacionalidade: " + contratoController.getContrato().getNacionalidade() + "   Estado Civil:  "
				+ contratoController.getContrato().getEstadocivil(), smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("Profissão: " + contratoController.getContrato().getProfissao(), smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("Data de Nascimento: " + formatter.format(contratoController.getContrato().getDtnasc()) + "  CPF:  "
				+ contratoController.getContrato().getCpf(), smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("RG: " + contratoController.getContrato().getRg(), smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("End: " + contratoController.getContrato().getEnd() + "  No:  "
				+ contratoController.getContrato().getNum(), smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("Comp: " + contratoController.getContrato().getComp(), smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("Cep: " + contratoController.getContrato().getCep() + "  Cidade:  "
				+ contratoController.getContrato().getCidade() + "  Estado:  "
				+ contratoController.getContrato().getEstado(), smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("Doravante denominado (a) simplesmente de 1º Contratante.", smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("Nome do Responsável (2): " + contratoController.getContrato().getResponsavel2(), smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("Nacionalidade: " + contratoController.getContrato().getNacionalidade2()
				+ "   Estado Civil:  " + contratoController.getContrato().getEstadocivil2(), smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("Profissão: " + contratoController.getContrato().getProfissao2(), smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("Data de Nascimento: " + formatter.format(contratoController.getContrato().getDtnasc2()) + "  CPF:  "
				+ contratoController.getContrato().getCpf(), smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("RG: " + contratoController.getContrato().getRg2(), smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("End: " + contratoController.getContrato().getEnd2() + "  No:  "
				+ contratoController.getContrato().getNum2(), smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("Comp: " + contratoController.getContrato().getComp2(), smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("Cep: " + contratoController.getContrato().getCep2() + "  Cidade:  "
				+ contratoController.getContrato().getCidade2() + "  Estado:  "
				+ contratoController.getContrato().getEstado2(), smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("Doravante denominado (a) simplesmente de 2º Contratante.", smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("Cláusula 1ª - DO CONTRATO: ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk(
				"Pelo presente instrumento particular de CONTRATO DE ADESÃO DE PRESTAÇÃO DE SERVIÇOS EDUCACIONAIS,"
						+ " e na melhor forma de direito, de um lado o aluno, pai ou responsável, acima identificado, doravante denominado apenas CONTRATANTE,"
						+ " e de outro lado, MAPLE BEAR PRUDENTE, também já devidamente identificada acima, e daqui por diante denominado simplesmente de CONTRATADO,"
						+ " têm como justo e pactuado entre si, e seus sucessores, as condições e regras estabelecidas nas cláusulas seguintes, "
						+ "obrigando-se mutuamente a respeitar e cumprir o que nelas está contido.",
				smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("CLÁUSULA 2ª - BENEFICIÁRIO DOS SERVIÇOS DE EDUCAÇÃO ESCOLAR – ALUNO- ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("Os serviços de educação escolar contratados serão prestados ao ", smallBold)));
		p.add(new Phrase(new Chunk("BENEFICIÁRIO ", catFont)));
		p.add(new Phrase(new Chunk("a seguir indicado, filho (ou dependente) do(s) ", smallBold)));
		p.add(new Phrase(new Chunk("CONTRATANTE (s) ", catFont)));
		p.add(new Phrase(new Chunk("acima qualificado(s): ", smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph("NOME: " + contratoController.getContrato().getAluno(), smallBold);
		preface.add(p);
		p = new Paragraph("TURMA: " + contratoController.getContrato().getTurma() + "  TURNO:  "
				+ contratoController.getContrato().getTurno(), smallBold);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§1º –DA GUARDA E RESPONSABILIDADE DO BENEFICIÁRIO– ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("A guarda e responsabilidade do ", smallBold)));
		p.add(new Phrase(new Chunk("BENEFICIÁRIO ", catFont)));
		p.add(new Phrase(new Chunk("indicado na Cláusula 1ª, é do(s) ", smallBold)));
		p.add(new Phrase(new Chunk("CONTRATANTE (s) ", catFont)));
		preface.add(p);
		p = new Paragraph("NOME: " + contratoController.getContrato().getResponsavel(), smallBold);
		preface.add(p);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§2º - O(s) CONTRATANTE(s)", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("compromete(m)-se, ainda, a comunicar expressamente à ", smallBold)));
		p.add(new Phrase(new Chunk("CONTRATADA ", catFont)));
		p.add(new Phrase(new Chunk(
				"sobre a existência e o teor de decisões judiciais que venham a alterar o regime de guarda do ",
				smallBold)));
		p.add(new Phrase(new Chunk("BENEFICIÁRIO, ", catFont)));
		p.add(new Phrase(new Chunk("não responsabilizando o ", smallBold)));
		p.add(new Phrase(new Chunk("CONTRATADO ", catFont)));
		p.add(new Phrase(
				new Chunk("por quaisquer fatos que resultem da não observância do presente parágrafo. ", smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§1º –ESPECIFICIDADE DOS SERVIÇOS – ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk(
				"Entendem-se como serviços mencionados nesta cláusula os que objetivam ao cumprimento da proposta pedagógica/educacional,"
						+ " ministrando aulas em locais que o CONTRATADO indicar, de acordo com o planejamento do programa da Maple Bear,"
						+ " outras práticas pedagógicas que se fizerem necessárias e demais atividades escolares destinadas aos alunos,"
						+ " coletivamente, não incluídas as atividades facultativas, de caráter opcional ou em grupo específico ou especial. O(s) CONTRATANTE(S) declara(m), neste ato, que conhece(m) as instalações físicas do estabelecimento.",
				smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§2º –SERVIÇOS ESPECÍFICOS E/OU ESPECIAIS – ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("Não estão incluídos, neste contrato os serviços especiais de recuperação,"
				+ " 2ª chamada, dependência, exames especiais, reciclagem, transporte escolar, "
				+ "atividades de frequência facultativa para o aluno – NÃO ESTÃO incluídas as taxas de participação em eventos -,"
				+ " bem como uniformes, agendas escolares e,"
				+ " ainda, fornecimento de segundas vias de documentos escolares,"
				+ " como também aqueles que não integram a rotina da vida estudantil, os quais, quando disponíveis, terão os seus valores comunicados por circular da direção do ",
				smallBold)));
		p.add(new Phrase(new Chunk("CONTRATADO,", catFont)));
		p.add(new Phrase(new Chunk("à parte, se for o caso.", smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§3º - SERVIÇOS NÃO INCLUÍDOS - ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(
				new Chunk("Não estão incluídos neste contrato os serviços e despesas decorrentes de equipamentos;"
						+ " mão de obra de acompanhamento especializado para atendimento aos portadores de necessidades especiais e"
						+ " comportamentos que ofereçam risco ao próprio aluno ou a seus pares, pré-existentes ou supervenientes à"
						+ " assinatura deste.", smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§4º - DO LANCHE – ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk(
				"O lanche será fornecido pelo contratado durante o ano letivo mediante o pagamento da taxa de "
						+ "lanche no valor de 12 (doze) parcelas de R$ 142,61 cada para ½ período, este valor terá um acréscimo de 80%"
						+ " para período integral.",
				smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§5º - DO MATERIAL – ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk(
				"O material de sala de aula será fornecido pelo contratado durante o ano letivo mediante o pagamento da taxa"
						+ " de material no valor de 12 (doze) parcelas de R$ 118,85 cada, sendo que este material será de uso exclusivo dentro da escola,"
						+ " não tendo direito o aluno a reembolso. Não haverá lista de material a ser adquirida e entregue pelos contratantes a contratada.",
				smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("CLÁUSULA 4ª –EDUCAÇÃO ESCOLAR –O(S) CONTRATANTE(S)", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk(
				"declara(m) estar(em) ciente(s) que a educação abrange os processos formativos que se desenvolvem na vida familiar,"
						+ " na convivência humana, no trabalho, nas instituições de ensino e pesquisa,"
						+ " nos movimentos sociais e organizações da sociedade civil e nas manifestações culturais,"
						+ " nos termos do art. 1º da LDB – Lei nº 9.394, de 20 de dezembro de 1996.",
				smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§1º –OBJETIVO DA INSTITUIÇÃO EDUCACIONAL – ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(
				new Chunk("O contrato tem por objetivo a prestação de serviço de educação escolar, pelo ", smallBold)));
		p.add(new Phrase(new Chunk("CONTRATADO ", catFont)));
		p.add(new Phrase(new Chunk("ao(à) aluno(a)  ", smallBold)));
		p.add(new Phrase(new Chunk("BENEFICIÁRIO(a) ", catFont)));
		p.add(new Phrase(new Chunk("indicado pelo(a) ", smallBold)));
		p.add(new Phrase(new Chunk("CONTRATANTE(s),  ", catFont)));
		p.add(new Phrase(new Chunk(
				"nas condições previstas no presente contrato, no regimento escolar, no projeto político-pedagógico e no calendário escolar.",
				smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk(
				"§2º – NORMAS E ORIENTAÇÕES ESPECIAIS EMANADAS DA ADMINISTRAÇÃO OU DIRETORIA – O BENEFICIÁRIO ",
				catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk(
				"submete-se ao cumprimento das normas e orientações especiais emanadas da administração ou diretoria, as quais poderão ser, a qualquer tempo, alteradas, "
						+ "suprimidas ou acrescidas, mesmo no curso da execução do contrato. ",
				smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§3º - O(s) CONTRATANTE(s) ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk(
				"declara(m) especialmente que têm ciência e está(ão) de acordo que o aluno não deve transportar ou portar,"
						+ " nas dependências da escola, objetos estranhos ao material escolar, tais como equipamentos musicais,"
						+ " MP’s, games, telefone celular, câmera fotográfica, brinquedos, outros bens de valor afetivo e/ou econômico e"
						+ " alimentos exceto se previamente autorizado por escrito  pela escola. O ",
				smallBold)));
		p.add(new Phrase(new Chunk("CONTRATADO ", catFont)));
		p.add(new Phrase(
				new Chunk("não se responsabiliza por eventual perda ou danos ao(s) aparelho(s). ", smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("CLÁUSULA 5ª –PREÇO ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("– Pelos serviços de educação escolar ora contratados, o(s) ", smallBold)));
		p.add(new Phrase(new Chunk("CONTRATANTE(S) ", catFont)));
		p.add(new Phrase(new Chunk("pagará(ão) ao ", smallBold)));
		p.add(new Phrase(new Chunk("CONTRATADO ", catFont)));
		p.add(new Phrase(new Chunk("uma anuidade escolar, fixada na forma da lei, no valor de R$ "
				+ contratoController.getContrato().getPreco(), smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§1° - REVISÃO DO PREÇO– ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("Fica reservado à ", smallBold)));
		p.add(new Phrase(new Chunk("CONTRATADA ", catFont)));
		p.add(new Phrase(new Chunk(
				"o direito de revisão do preço estabelecido neste contrato, com a consequente alteração do valor "
						+ "das parcelas, no caso de vier a ser criado novo encargo, tributos e/ou custos, ou majorados os já existentes pelo "
						+ "poder competente, de modo a se manter, através daquela revisão, o equilíbrio econômico-financeiro deste contrato. "
						+ "Serão os valores contratuais corrigidos no mínimo mediante variação integral do INPC, ocorrida a partir da data "
						+ "da assinatura deste contrato e a data de sua respectiva e efetiva liquidação. Na ausência desse indicador ou "
						+ "impossibilidade de seu uso, deverão tais valores ser corrigidos de acordo com outro índice permitido e/ou indicado "
						+ "pelo Governo Federal e que efetivamente reflita a real desvalorização da moeda no período em questão, "
						+ "preferencialmente o IGP-M da Fundação Getúlio Vargas.",
				smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("CLÁUSULA  6ª – FORMA DE PAGAMENTO– ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk(
				"O valor da anuidade referido na cláusula anterior poderá ser pago à vista ou de forma parcelada em até "
						+ contratoController.getContrato().getFormaPagamento()
						+ " parcelas mensais e iguais, com vencimento no dia 5° (quinto) dia útil do mês.",
				smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§1º – ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk(
				"A primeira parcela será paga no dia "+ formatter.format(contratoController.getContrato().getPrimeiroVencimento())
						+ " e as demais deverão ser pagas até a data de vencimento correspondente, através de boleto bancário enviado ao(s) ",
				smallBold)));
		p.add(new Phrase(new Chunk("CONTRATANTE(S).", catFont)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§2º –DESISTÊNCIA DA MATRÍCULA – ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk(
				"Em caso de desistência de matrícula antes do início do ano letivo, será(ão) devido(s) pelo (s) CONTRATANTE (s) a título de multa,"
				+ " em virtude da reserva de vaga, o  valor referente a uma mensalidade vigente. Se a desistência ocorrer depois de iniciado o período de aulas,"
				+ " não será devolvido o valor até o momento pago, observando-se, ainda, o disposto na Cláusula 8ª.",
				smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§3º –VENCIMENTO DAS OBRIGAÇÕES –O não recebimento do carnê para o pagamento não exime o(s)CONTRATANTE(S) do mesmo, nem das penalidades pelo inadimplemento, ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk(
				"razão pela qual deverá, nesta hipótese, e no horário regular de atendimento da instituição, dirigir-se à tesouraria, "
				+ "com a devida antecedência, para providenciar a emissão da 2ª via do documento, "
				+ "de modo que possa cumprir a obrigação CONTRATADA.",
				smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§4º- ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk(
				"O CONTRATADO, em razão de convênio firmado com ......................................, "
				+ "da qual o(s) CONTRATANTE(s) é(são) filiado(s), concederá o desconto no percentual de .....% (...... por cento),"
				+ " a ser aplicado ao valor da mensalidade escolar, excluindo-se as despesas de alimentação e de material escolar.",
				smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§5º- ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk(
				"O desconto informado na cláusula anterior será válido enquanto vigente o convênio firmado entre o CONTRATADO"
				+ "e entidade representativa a que o(s) CONTRATANTE(s) é(são) filiado(s) e será mantido durante o ano letivo estabelecido neste contrato. ",
				smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§6º- ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk(
				"Conforme também especificado no manual de pais, o horário de tolerância tanto para entrada quanto para saída"
				+ " é de 30 minutos. Caso referido horário não seja respeitado,"
				+ " o CONTRATADO cobrará de forma adicional pelo tempo extra de permanência na escola 1% da mensalidade por dia.",
				smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("CLÁUSULA 7º – DO MATERIAL DIDÁTICO E METODOLOGIA DE ENSINO", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§1º- ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk(
				"O(s) CONTRATANTE(s), através deste ato, declara estar ciente que o CONTRATADO celebrou instrumento particular de fornecimento de material didático "
				+ "com a franqueadora MAPLE CANADA EDUCATION LTDA., sociedade limitada, com sede na Rua Verbo Divino, nº. 993-A, "
				+ "sala 01, Chácara Santo Antônio, São Paulo, SP, CEP 04719-001, inscrita no CNPJ/MF 22.267.948/0001-40, e-mail franquia@maplebear.com.br, "
				+ "o qual não estabelece qualquer solidariedade, vínculo societário, trabalhista ou de qualquer outra natureza entre as partes, ficando sob única "
				+ "e total responsabilidade do CONTRATADO o cumprimento das obrigações ora assumidas perante o(s) CONTRATANTE(s). ",
				smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§2º- ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("Com relação ao fornecimento do material didático de uso individualizado, especificado na cláusula anterior, o ",smallBold)));
		p.add(new Phrase(new Chunk("CONTRATANTE ",catFont)));
		p.add(new Phrase(new Chunk("pagará à franqueadora ",smallBold)));
		p.add(new Phrase(new Chunk("MAPLE CANADA EDUCATION LTDA, ",catFont)));
		p.add(new Phrase(new Chunk("sem a incidência de qualquer tipo de desconto sobre as parcelas decorrentes dessa natureza.",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§3º- ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("Fica estabelecido entre as partes que o material didático de uso individualizado,"
				+ " compatível ao segmento educacional e turma frequentados pelo ",	smallBold)));
		p.add(new Phrase(new Chunk("ALUNO/CONTRATANTE(s) ", catFont)));
		p.add(new Phrase(new Chunk("mencionado no parágrafo primeiro, não se encontra disponível no mercado de consumo em geral,"
				+ " por tratar-se de sistema de ensino específico, cujo conteúdo é exclusivo e decorre de Know-how específico,"
				+ " desenvolvido somente pela FRANQUEADORA. Deste modo, o material didático será fornecido ao ",smallBold)));
		p.add(new Phrase(new Chunk("ALUNO/CONTRATANTE(s) ", catFont)));
		p.add(new Phrase(new Chunk("por empresa homologada, sujeitando-se, pois, aos termos da estipulação em favor de terceiros prevista"
				+ " no artigo 436 a 438 do Código Civil. Considerando-se a natureza do referido material,"
				+ " bem como o fato de ser ele entregue ao ",	smallBold)));
		p.add(new Phrase(new Chunk("CONTRATANTE ", catFont)));
		p.add(new Phrase(new Chunk("no início do ano letivo em curso, haja vista a necessidade de sua utilização como meio de aprendizado,"
				+ " arcará(ão) o(s) CONTRATANTE(s) com os pagamentos integrais dos referidos materiais. ",	smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§4º- ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("A aquisição acima especificada deverá ser efetivada no ato da matrícula,"
				+ " diretamente por meio do sítio eletrônico: www.maplebearstore.com.br, conforme as condições "
				+ "de pagamento e valores estipulada pelo fornecedor, ocasião em que será gerado o "
				+ "respectivo comprovante de pagamento. ",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§5º- ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("O valor referente ao material didático de ensino exclusivo não inclui outros livros didáticos "
				+ "ou paradidáticos e materiais de uso individual dos alunos previstos neste instrumento. ",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§6º- ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("Fica desde já autorizado pelos signatários, em caso de inadimplemento em relação ao presente contrato,"
				+ " a cobrança dos valores pelo CONTRATADO ou, supletivamente, pela FRANQUEADORA MAPLE CANADA EDUCATION LTDA, da parcela que lhe compete,"
				+ " constituindo presente documento em título executivo extrajudicial, nos moldes do que preceitua o artigo 784,"
				+ " inciso III do Código de Processo Civil Brasileiro. ",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("CLÁUSULA 8ª  - DA MATRÍCULA ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("- Para efeitos de matrícula e sua efetivação, é necessário, além da comprovação"
				+ " de pagamento do material didático à FRANQUEADORA, a entrega dos documentos exigidos pelo CONTRATADO,"
				+ " informados previamente ao(s) CONTRATANTE(s).",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("CLÁUSULA 9ª –ATRASO/INADIMPLÊNCIA – ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("Havendo atraso no pagamento de qualquer das parcelas descritas na Cláusula 5ª,"
				+ " o(s) CONTRATANTE(s) pagará(ão) o valor em atraso acrescido de multa contratual de 2% (dois por cento) e 0,33 % juros ao dia.",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§1º –ATRASO SUPERIOR A 30 DIAS– ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("Se o atraso for superior a 30 (trinta) dias, o valor em atraso será devidamente ATUALIZADO"
				+ " e acrescido de juros moratórios de 1% (um por cento) ao mês, sem prejuízo da multa prevista no caput.",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§2º –ATRASO SUPERIOR A 90 DIAS– ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("Se o atraso for superior a 90 (noventa) dias, poderá a CONTRATADA:\n" + 
				"\n" + 
				"a– inscrever o devedor em cadastro ou serviços de proteção ao crédito, desde que precedido de notificação prévia e de que não exista discussão judicial do débito por parte do(s) CONTRATANTE(S);\n" + 
				"\n" + 
				"b – independentemente do procedimento anterior, promover cobrança ou execução judicial do total do débito, pelos meios legalmente permitidos.\n" + 
				"",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§3º –NÃO RENOVAÇÃO DE MATRÍCULA – ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("Havendo débito ao final do ano letivo, o BENEFICIÁRIO será automaticamente desligado do CONTRATADO (Lei nº 9.870/99, art. 6º. §1º - MP 2.173-24),"
				+ " desobrigando-se esta de deferir pedido de renovação de matrícula (art. 5º da citada Lei).",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("CLÁUSULA 10ª – DESISTÊNCIA/TRANCAMENTO DE MATRÍCULA/TRANSFERÊNCIA –", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("O pedido de cancelamento, de desistência, de trancamento de matrícula ou de transferência deverá ser formalizado"
				+ " por escrito pelo(s) CONTRATANTE(S), com antecedência mínima de 30 (dias), através de instrumento próprio, observadas as disposições"
				+ " legais e o Regimento Interno do CONTRATADO. ",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§1º - DA INFREQUÊNCIA– ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("A mera infrequência do BENEFICIÁRIO às aulas ou atividades escolares, sem a comunicação de que trata o caput,"
				+ " não desobriga o(s) CONTRATANTE(S) do pagamento das parcelas da anuidade vencidas e vincendas.",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§2° - Em caso de desistência/trancamento/cancelamento de matrícula, os CONTRATANTE(S) deverão pagar a parcela do mês em que se der"
				+ " a efetiva rescisão, além de outros débitos acaso existentes, que serão calculados com base nesse contrato.", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("§3º - ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("Após 02 (DUAS) parcelas vencidas e não pagas, estarão automaticamente "
				+ "cancelados todos e quaisquer descontos eventualmente concedidos ao(s) CONTRATANTE(S).",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("CLÁUSULA 11ª – RESCISÃO –", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("O presente contrato poderá ser rescindido:",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("		I –", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("pelo CONTRATADO, pela prática de ato infracional ou por motivo disciplinar dado pelo BENEFICIÁRIO, ou outro previsto no Regimento Escolar,"
				+ " ou por incompatibilidade ou desarmonia do BENEFICIÁRIO, ou de seu responsável, com o regime ou filosofia pedagógica adotada pela Escola;",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("		II –", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("pelo(s) CONTRATANTE(S), a qualquer tempo, observada a Cláusula 8ª;",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("		III –", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("por acordo entre as partes;",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("		IV –", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("em razão do descumprimento de quaisquer obrigações previstas neste instrumento.",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("CLÁUSULA 12ª – MUDANÇA DE ENDEREÇO E INFORMAÇÕES CADASTRAIS – ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("O(s) CONTRATANTE(S) obriga(m)-se a comunicar ao CONTRATADO seu novo endereço residencial e domicílio,"
				+ " bem como alteração de endereço de e mail e telefone sempre que houver alteração dos mesmos.",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("CLÁUSULA 13ª – APTIDÃO DAS INFORMAÇÕES - ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("O CONTRATANTE(S), neste ato, assume(m) total responsabilidade nas declarações prestadas neste contrato e no Formulário de Inscrição, relativas à aptidão legal do BENEFICIÁRIO para a matrícula e frequência na série e curso indicados, obrigando-se a entregar(em),"
				+ " no prazo estabelecido pela legislação escolar vigente, os documentos comprobatórios daquelas declarações e dos demais documentos exigidos por lei. ",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("CLÁUSULA 14ª – ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("O(s) CONTRATANTE(s) será(ão) responsável(eis) por todo e qualquer dano causado pelo aluno ao patrimônio ou a qualquer bem do CONTRATADO,"
				+ " como a destruição total ou parcial, acarretando, além da indenização e/ou reposição do bem, sanções disciplinares ao aluno, desde advertência até desligamento.",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("CLÁUSULA 15ª –VALIDADE - ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		LocalDateTime now = LocalDateTime.now();
		p.add(new Phrase(new Chunk("O presente contrato tem validade de até 12 (dez) meses, extinguindo-se em 31 de dezembro de "+now.getYear() +".",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("CLÁUSULA 16ª –", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("O presente instrumento de CONTRATO DE PRESTAÇÃO DE SERVIÇOS EDUCACIONAIS é firmado com base nos artigos 206, "
				+ "incisos II e III e 209 da Constituição Federal, no Código Civil Brasileiro, Livro I, Títulos V e VI e no Código de Defesa do Consumidor,"
				+ " e entrará em vigor com o deferimento da matrícula do ALUNO/CONTRATANTE(es) pela Direção Geral e uma vez efetuado o pagamento do material "
				+ "didático à FRANQUEADORA.",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.add(new Phrase(new Chunk("CLÁUSULA 17ª – FORO – ", catFont)));
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("Para dirimir quaisquer dúvidas provenientes deste contrato, o foro é o constante do domicílio do CONTRATADO,"
				+ " conforme indicado no cabeçalho deste instrumento. ",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_JUSTIFIED);
		p.add(new Phrase(new Chunk("E, por estarem assim justos e contratados, assinam o presente,"
				+ " em duas vias de igual teor, para que surta seus jurídicos e legais efeitos.",smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_RIGHT);
		p.add(new Phrase(new Chunk("Presidente Prudente-SP, "+formatter.format(Date.valueOf(now.toLocalDate())),smallBold)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_CENTER);
		Chunk underline = new Chunk("                                                                                     ");
		underline.setUnderline(0.1f, -2f); //0.1 thick, -2 y-location
		p.add(new Phrase(underline));
		preface.add(p);
		p = new Paragraph();
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_CENTER);
		p.add(new Phrase(new Chunk("CENTRO PRUDENTINO DE ENSINO LTDA – ME",catFont)));
		preface.add(p);
		addEmptyLine(preface, 1);
		p = new Paragraph();
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_CENTER);
		underline = new Chunk("                                                ");
		underline.setUnderline(0.1f, -2f); //0.1 thick, -2 y-location
		p.add(new Phrase(underline));
		p.add(new Phrase("     "));
		p.add(new Phrase(underline));
		preface.add(p);
		p = new Paragraph();
		p.setLeading(1, 1);
		p.setAlignment(Element.ALIGN_CENTER);
		p.add(new Phrase(new Chunk("1° Contratante                             2° Contratante",catFont)));
		preface.add(p);
		document.add(preface);
		
		// Start a new page
		// document.newPage();
	}

	private static void addEmptyLine(Paragraph paragraph, int number) {
		for (int i = 0; i < number; i++) {
			paragraph.add(new Paragraph(" "));
		}
	}

	private void carregarcampos(Aluno resultado) {
		tfieldnome.setText(resultado.getResponsavel());
		tfieldEnd.setText(resultado.getEndereco());
		tfieldCep.setText(resultado.getCep());
		tfieldNum.setText(resultado.getNumeroendereco());
		tfieldnome3.setText(resultado.getResponsavel2());
		tfieldEnd1.setText(resultado.getEndereco());
		tfieldCep1.setText(resultado.getCep());
		tfieldNum1.setText(resultado.getNumeroendereco());
		tfieldAluno.setText(resultado.getNome());
	}

	@FXML
	void voltar(ActionEvent event) {
		try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public StackPane getRootPane() {
		return rootMenuPane;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	@FXML
	void buscaraluno(ActionEvent event) {
		try {
			FXMLAlunoSearchController controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_ALUNO_BUSCAR, null, 0.0)
					.<FXMLAlunoSearchController>getController();
			controller.setSourceFXMLController(this);

		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING,
					"Error: failed to open FXMLEquipmentRegistration", e);
		}
	}

	@FXML
	void buscarcontrato(ActionEvent event) {
		try {
			FXMLContratoSearchController controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_CONTRATO_BUSCAR, null, 0.0)
					.<FXMLContratoSearchController>getController();
			controller.setSourceFXMLController(this);

		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING,
					"Error: failed to open FXMLEquipmentRegistration", e);
		}
	}

	private void initTextFieldMasks() {
		tfieldnome.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				FieldValidators.RegexCharsets.CHARSET_PESSOA_NAME.getValue(), PessoaConstants.MAXLEN_NAME.getValue()));
		tfieldnome3.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				FieldValidators.RegexCharsets.CHARSET_PESSOA_NAME.getValue(), PessoaConstants.MAXLEN_NAME.getValue()));
		tfieldAluno.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				FieldValidators.RegexCharsets.CHARSET_PESSOA_NAME.getValue(), PessoaConstants.MAXLEN_NAME.getValue()));
		tfieldCPF.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[0-9]*", "###.###.###-##"));
		tfieldCPF1.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[0-9]*", "###.###.###-##"));
		tfieldRG.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				FieldValidators.RegexCharsets.CHARSET_PESSOAFISICA_RG.getValue(),
				PessoaConstants.MAXLEN_RG.getValue()));
		tfieldRG1.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				FieldValidators.RegexCharsets.CHARSET_PESSOAFISICA_RG.getValue(),
				PessoaConstants.MAXLEN_RG.getValue()));
		tfieldCep.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[\\d]*", "#####-###"));
		tfieldCep1.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[\\d]*", "#####-###"));
	}

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		this.sourceController = controller;

	}

	@Override
	public void setTargetFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {
		if (sender instanceof FXMLAlunoSearchController) {
			if (data instanceof Aluno) {
				FXUISetup.getInstance().clearTextInputs(rootPane);
				FXUISetup.getInstance().clearTableViews(rootPane);
				Aluno resultado = (Aluno) data;
				carregarcampos(resultado);
			}
		}
		if (sender instanceof FXMLContratoSearchController) {
			if (data instanceof Contrato) {
				FXUISetup.getInstance().clearTextInputs(rootPane);
				FXUISetup.getInstance().clearTableViews(rootPane);
				Contrato resultado = (Contrato) data;
				contratoController.setContrato(resultado);
				carregarcampos(resultado);
			}
		}
	}

	private void carregarcampos(Contrato resultado) {
		tfieldnome.setText(resultado.getResponsavel());
		tfieldEnd.setText(resultado.getEnd());
		tfieldCep.setText(resultado.getCep());
		tfieldNum.setText(resultado.getNum());
		tfieldnome3.setText(resultado.getResponsavel2());
		tfieldEnd1.setText(resultado.getEnd());
		tfieldCep1.setText(resultado.getCep());
		tfieldNum1.setText(resultado.getNum());
		tfieldAluno.setText(resultado.getAluno());
		dtdianasc.setValue(resultado.getDtnasc().toLocalDate());
        tfieldNacionalidade.setText(resultado.getNacionalidade());
        tfieldprofissao.setText(resultado.getProfissao());
        tfieldEstCivil.setText(resultado.getEstadocivil());
        tfieldCPF.setText(resultado.getCpf());
        tfieldRG.setText(resultado.getRg());
		tfieldComp.setText(resultado.getComp());
	    tfieldCidade.setText(resultado.getCidade());
		tfieldEstado.setText(resultado.getEstado());
		dtdianasc2.setValue(resultado.getDtnasc2().toLocalDate());
		tfieldNacionalidade1.setText(resultado.getNacionalidade2());
		tfieldprofissao1.setText(resultado.getProfissao2());
		tfieldEstCivil1.setText(resultado.getEstadocivil2());
		tfieldCPF1.setText(resultado.getCpf2());
		tfieldRG1.setText(resultado.getRg2());
		tfieldNum1.setText(resultado.getNum2());
		tfieldComp1.setText(resultado.getComp2());
		tfieldCidade1.setText(resultado.getCidade2());
		tfieldCep1.setText(resultado.getCep2());
		tfieldEstado1.setText(resultado.getEstado2());
		tfieldAluno.setText(resultado.getAluno());
		tfieldTurma.setText(resultado.getTurma());
		tfieldTurno.setText(resultado.getTurno());
		tfieldGuarda.setText(resultado.getGuarda());
		tfieldPreco.setText(resultado.getPreco());
		tfieldParcela.setText(resultado.getParcela());
		if (resultado.getPrimeiroVencimento() != null) {
			dtpagamento.setValue(resultado.getPrimeiroVencimento().toLocalDate());			
		}
	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		if (sender instanceof FXMLAlunoSearchController) {
			FXMLAlunoSearchController obj = (FXMLAlunoSearchController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLContratoSearchController) {
			FXMLContratoSearchController obj = (FXMLContratoSearchController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		initTextFieldMasks();
		contratoController = new ContratoController();
		contratoController.setupNewContrato();

	}

}
