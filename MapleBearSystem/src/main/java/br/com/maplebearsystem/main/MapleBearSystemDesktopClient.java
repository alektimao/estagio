package br.com.maplebearsystem.main;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.NoResultException;

import br.com.maplebearsystem.dao.FederationDAO;
import br.com.maplebearsystem.model.Federation;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.ui.util.FXUISetup;
import br.com.maplebearsystem.view.util.BrazilianStatesAndCitiesImporter;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MapleBearSystemDesktopClient extends Application {

	private static Stage mainStage;
	private static String programTitle = "MapleBear System";

	private void initProgramStage(Stage primaryStage, boolean doInitConfig) {
		Parent root = null;

		try {

			if (!doInitConfig) {
//				root = FXMLLoader.load(DworDesktopClient.class.getResource(FXResourcePath.FXML_LOGIN.getPath()),
//						ResourceBundle.getBundle("br.com.maplebearsystem.messages.messages"));
				root = FXUISetup.getInstance().loadFXMLAsParent(FXResourcePath.FXML_MAPLEBEARSYSTEM_HOME);
				// FXMLLoader.load(FXResourcePath.FXML_DWOR_HOME,
				// ResourceBundle.getBundle("br.com.maplebearsystem.messages.messages"));
			} else {
				// execute Program Parameterization
//				FXMLLoader fxmlLoader = new FXMLLoader();
//				fxmlLoader.setLocation(FXResourcePath.FXML_DWOR_INITSETUP);
//
//				fxmlLoader.load();
//				root = fxmlLoader.<FXMLInitSetupController>getController().getRootPane();
			}

			Scene scene = FXUISetup.getInstance().createSceneWithParentMinimalSize(root);

			mainStage = primaryStage;
			
			//faz um icone carai
			//FXUISetup.getInstance().setStageIcon(mainStage, FXResourcePath.DWOR_ICON);

			mainStage.setTitle(programTitle);

			mainStage.setScene(scene);

			mainStage.show();

			// mainStage.setMaximized(true);
			mainStage.setMinWidth(scene.getWidth());
			mainStage.setMinHeight(scene.getHeight());

			mainStage.setOnCloseRequest((ae) -> {
				Platform.exit();
				System.exit(0);

			});

		} catch (IOException e) {
			Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "Failed to Start UI", e);
		}
	}

	@Override
	public void start(Stage primaryStage) {

//		boolean flag = ProgramParameterController.getInstance().isProgramParameterizationNeeded();
//
//		if (!flag)
//			ProgramParameterController.getInstance()
//					.setLoggedUser(ProgramParameterController.getInstance().getProgramParameter().getAdministrator());
//		initProgramStage(primaryStage, flag);
		initProgramStage(primaryStage, false);

	}

	public static void main(String[] args) {

		makeSureDatabaseHasBrazilianCitiesAndStates();

		launch(args);

		Platform.exit();
		System.exit(0);

	}

	public static String getProgramTitle() {

		return programTitle;
	}

	public static Stage getStage() {
		return mainStage;
	}

	private static void makeSureDatabaseHasBrazilianCitiesAndStates() {

		try {
			FederationDAO dao = new FederationDAO();
			List<Federation> result = dao.getFederationByName("Brasil");

			if (result.size() < 1) {
				throw new NoResultException();
				//BrazilianStatesAndCitiesImporter.main(null);
			}
		} catch (NoResultException e) {
			BrazilianStatesAndCitiesImporter.main(null);

		} catch (Exception e) {

			e.printStackTrace();
			Platform.exit();
			System.exit(0);
		}

	}
}
