package br.com.maplebearsystem.tests.main;

import java.io.IOException;
//import br.com.maplebearsystem.controller.ProgramParameterController;
import br.com.maplebearsystem.view.util.FXMLResourcePathsEnum;
import br.com.maplebearsystem.view.util.FXUISetup;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MapleBearSystemSaida extends Application {

	private static Stage mainStage;
	private static String programTitle = "MapleBear System";

	private void initProgramStage(Stage primaryStage, boolean doInitConfig) {
		Parent root;

		try {
			
			
			//root = FXMLLoader.load(MapleBearSystemSaida.class.getResource(FXMLResourcePathsEnum.FXML_MAPLE_PRODUCTMANAGER.getPath()));
			root = FXMLLoader.load(MapleBearSystemSaida.class.getResource(FXMLResourcePathsEnum.FXML_MAPLE_SAIDA_MANAGER.getPath()));
			Scene scene = FXUISetup.getInstance().createSceneWithParentMinimalSize(root);

			mainStage = primaryStage;

			//FXUISetup.getInstance().setStageIcon(mainStage, FXMLResourcePathsEnum.DWOR_ICON.getPath());

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void start(Stage primaryStage) {
		
//		
//		boolean flag = ProgramParameterController.getInstance().isProgramParameterizationNeeded();
//		
//		initProgramStage(primaryStage,flag);
		initProgramStage(primaryStage,false);
	}

	public static void main(String[] args) {

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
}
