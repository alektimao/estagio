package br.com.maplebearsystem.view.component;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXProgressBar;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.BackupController;
import br.com.maplebearsystem.main.MapleBearSystemDesktopClient;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;

public class FXMLConfigurationBackupController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootPane;

	@FXML
	private VBox primaryPane;

	@FXML
	private JFXTextField tfieldBackupDirectory;

	@FXML
	private JFXButton btnSelectDir;

	@FXML
	private JFXButton btnMakeBackup;

	@FXML
	private JFXProgressBar progressBarProgress;

	private FXMLDefaultControllerInterface sourceController;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		btnMakeBackup.setDisable(true);
		progressBarProgress.setProgress(0);
		progressBarProgress.setDisable(true);

		tfieldBackupDirectory.textProperty().addListener((obs, oldValue, newValue) -> {

			if (newValue != null && !"".equals(newValue)) {
				Path directory = Paths.get(newValue);
				if (Files.exists(directory)) {
					btnMakeBackup.setDisable(false);
				} else {
					btnMakeBackup.setDisable(true);
				}
			} else {
				btnMakeBackup.setDisable(true);
			}
		});
	}

	@FXML
	void actMakeBackup(ActionEvent event) {

		String path = tfieldBackupDirectory.getText();
		progressBarProgress.setDisable(false);
		progressBarProgress.setProgress(JFXProgressBar.INDETERMINATE_PROGRESS);

		Task<Void> task = new Task<Void>() {

			@Override
			protected Void call() throws Exception {

				BackupController backupController = new BackupController();
				backupController.doBackup(path);
				return null;
			}
		};

		task.setOnFailed((taskevent) -> {
			Platform.runLater(() -> {
				progressBarProgress.setDisable(true);
				progressBarProgress.setProgress(0);
				new FXNotification("Falha ao efetuar backup!", FXNotification.NotificationType.ERROR).show();
			});
		});

		task.setOnSucceeded((taskevent) -> {
			Platform.runLater(() -> {
				progressBarProgress.setProgress(1);
				new FXNotification("Backup efetuado com sucesso!", FXNotification.NotificationType.INFORMATION).show();
			});
		});

		new Thread(task).start();

	}

	@FXML
	void actSelectDir(ActionEvent event) {
		DirectoryChooser dchooser = new DirectoryChooser();
		dchooser.setTitle("Selecione o diretório onde o backup será salvo...");

		File directory = dchooser.showDialog(MapleBearSystemDesktopClient.getStage());
		try {
			tfieldBackupDirectory.setText(directory.getCanonicalPath());
			btnMakeBackup.setDisable(false);
		} catch (IOException e) {
			Logger.getLogger(this.getClass().getName())
					.log(Level.INFO, "Failed to set tfieldBackupDirectory to directory CanonicalPath", e);
			tfieldBackupDirectory.setText("");
			btnMakeBackup.setDisable(true);
		}
	}

	@Override
	public void reset() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		this.sourceController = controller;
	}

	@Override
	public void setTargetFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		throw new UnsupportedOperationException();
	}

	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {
		throw new UnsupportedOperationException();
	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		throw new UnsupportedOperationException();
	}

	public StackPane getRootPane() {
		return this.rootPane;
	}

}
