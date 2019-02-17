/**
 * 
 */
package br.com.maplebearsystem.view.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.naming.OperationNotSupportedException;

import br.com.maplebearsystem.main.MapleBearSystemDesktopClient;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextInputControl;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author Gabriel L. P. Abreu
 *
 */
public class FXUISetup {

	private static FXUISetup instance;

	public static FXUISetup getInstance() {

		if (instance == null)
			instance = new FXUISetup();

		return instance;
	}

	public ArrayList<Node> getAllNodes(Parent root) {
		ArrayList<Node> nodes = new ArrayList<Node>();
		addAllDescendents(root, nodes);
		return nodes;
	}

	private void addAllDescendents(Parent parent, ArrayList<Node> nodes) {
		for (Node node : parent.getChildrenUnmodifiable()) {
			nodes.add(node);
			if (node instanceof Parent) {
				addAllDescendents((Parent) node, nodes);
			}
		}
	}

	public Scene createSceneWithParentMinimalSize(Parent parent) {

		if (parent instanceof javafx.scene.layout.Pane) {
			double minWidth = ((javafx.scene.layout.Pane) parent).getMinWidth();
			double minHeight = ((javafx.scene.layout.Pane) parent).getMinHeight();
			return new Scene(parent, minWidth, minHeight);

		}

		return new Scene(parent, 640, 480);
	}

	public SubScene createSubSceneWithParentMinimalSize(Parent parent) {

		if (parent instanceof javafx.scene.layout.Pane) {
			double minWidth = ((javafx.scene.layout.Pane) parent).getMinWidth();
			double minHeight = ((javafx.scene.layout.Pane) parent).getMinHeight();
			return new SubScene(parent, minWidth, minHeight);

		}

		return new SubScene(parent, 640, 480);
	}

	public SubScene createSubSceneWithParentPrefSize(Parent parent) {

		if (parent instanceof javafx.scene.layout.Pane) {
//			double minWidth = ((javafx.scene.layout.Pane) parent).getMinWidth();
//			double minHeight = ((javafx.scene.layout.Pane) parent).getMinHeight();
			double prefWidth = ((javafx.scene.layout.Pane) parent).getPrefWidth();
			double prefHeight = ((javafx.scene.layout.Pane) parent).getPrefHeight();
			SubScene subScene = new SubScene(parent, prefWidth, prefHeight);

			return subScene;
		}

		return new SubScene(parent, 640, 480);
	}

	public void setSubSceneWithParentMinimalSize(SubScene scene, Parent parent) {
		if (parent instanceof javafx.scene.layout.Pane) {
			double minWidth = ((javafx.scene.layout.Pane) parent).getMinWidth();
			double minHeight = ((javafx.scene.layout.Pane) parent).getMinHeight();
			scene.resize(minWidth, minHeight);

		}
	}

	public void setStageIcon(Stage stage, String path) {
		// Set Stage Icon
		{
			InputStream IconInputStream = MapleBearSystemDesktopClient.class.getResourceAsStream(path);
			Image icon = new Image(IconInputStream);
			stage.getIcons().add(icon);
		}

	}

	public void matchStageDimensionsWith(Stage stage, Parent parent) {

		if (parent instanceof javafx.scene.layout.Pane) {
			double minWidth = ((javafx.scene.layout.Pane) parent).getMinWidth();
			double minHeight = ((javafx.scene.layout.Pane) parent).getMinHeight();
			stage.setMinWidth(minWidth);
			stage.setMinHeight(minHeight);
		} else {
			stage.setMinWidth(640);
			stage.setMinHeight(480);
		}
	}

	public FXMLLoader changeScene(Stage stage, Class<?> objectclass, String fxmlPath) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(objectclass.getResource(fxmlPath));

		Parent parent = fxmlLoader.load();
		Scene scene = createSceneWithParentMinimalSize(parent);
		stage.setScene(scene);
		matchStageDimensionsWith(stage, parent);

		return fxmlLoader;
	}

	public FXMLLoader changeSceneFromDWORMainStage(String fxmlPath) throws IOException {
		return changeSceneFromDWORMain(MapleBearSystemDesktopClient.getStage(), fxmlPath);

	}

	public FXMLLoader changeSceneFromDWORMain(Stage stage, String fxmlPath) throws IOException {
		return changeScene(stage, MapleBearSystemDesktopClient.class, fxmlPath);
	}

	public FXMLLoader initNewScene(Stage stage, Class<?> objectclass, String fxmlPath) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(objectclass.getResource(fxmlPath));

		Parent parent = fxmlLoader.load();
		Scene scene = createSceneWithParentMinimalSize(parent);
		stage.setScene(scene);
		return fxmlLoader;
	}

	public FXMLLoader launchNewStage(Class<?> objectclass, String fxmlPath) throws IOException {
		Stage stage = new Stage();
		FXMLLoader fxmlLoader = initNewScene(stage, objectclass, fxmlPath);
		stage.show();
		return fxmlLoader;
	}

	public FXMLLoader launchNewStageAndWait(Class<?> objectclass, String fxmlPath) throws IOException {
		Stage stage = new Stage();
		FXMLLoader fxmlLoader = initNewScene(stage, objectclass, fxmlPath);
		stage.showAndWait();
		return fxmlLoader;
	}

	public FXMLLoader launchNewUndecoratedStageAndWait(Class<?> objectclass, String fxmlPath) throws IOException {
		Stage stage = new Stage();
		FXMLLoader fxmlLoader = initNewScene(stage, objectclass, fxmlPath);
		stage.initStyle(StageStyle.UNDECORATED);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.showAndWait();
		return fxmlLoader;
	}

	public FXMLLoader loadSubscene(SubScene subScene, Class<?> objectclass, String fxmlPath) throws IOException, Exception {
		throw new OperationNotSupportedException("Not Implemented yet");
	}

	public FXMLLoader loadFXMLIntoPane(Pane parent, Class<?> objectclass, String fxmlPath) throws IOException {
		FXMLLoader fxmlLoader = loadFXMLIntoPane(parent, null, objectclass, fxmlPath);

		return fxmlLoader;
	}

	public FXMLLoader loadFXMLIntoVbox(VBox parent, Class<?> objectclass, String fxmlPath) throws IOException {
		FXMLLoader fxmlLoader = loadFXMLIntoVbox(parent, null, objectclass, fxmlPath);

		return fxmlLoader;
	}

	public FXMLLoader loadFXMLIntoPane(Pane parent, Object controller, Class<?> objectclass, String fxmlPath)
			throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(objectclass.getResource(fxmlPath));

		if (controller != null)
			fxmlLoader.setController(controller);

		Node newchild = fxmlLoader.load();
		parent.getChildren().clear();
		parent.getChildren().add(newchild);

		return fxmlLoader;
	}

	public FXMLLoader loadFXMLIntoVbox(VBox parent, Object controller, Class<?> objectclass, String fxmlPath)
			throws IOException {
		FXMLLoader fxmlLoader = loadFXMLIntoPane(parent, controller, objectclass, fxmlPath);

		VBox.setVgrow(parent.getChildren().get(0), Priority.ALWAYS);

		return fxmlLoader;
	}
	
	public FXMLLoader loadFXMLIntoStackPane(StackPane parent, Class<?> objectclass, String fxmlPath, Effect effect) throws IOException {
		
		return loadFXMLIntoStackPane(parent, objectclass, fxmlPath, effect, 0.0);
	}
	
	public FXMLLoader loadFXMLIntoStackPane(StackPane parent, Class<?> objectclass, String fxmlPath, Effect effect,
			Double padding) throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(objectclass.getResource(fxmlPath));

		Pane newchild = fxmlLoader.load();

		if (padding != null && padding > 0.0 && padding < parent.getWidth() && padding < parent.getHeight()) {
			newchild.setMaxSize(parent.getWidth() - padding, parent.getHeight() - padding);
		}
		
		newchild.setEffect(effect);

		parent.getChildren().add(newchild);

		return fxmlLoader;
	}

	public FXMLLoader loadFXMLIntoNewSubSceneAndPutIntoStackPane(StackPane stackPane, Class<?> objectclass,
			String fxmlPath) throws IOException {

		SubScene subScene;

		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(objectclass.getResource(fxmlPath));

		Parent parent = fxmlLoader.load();
		subScene = createSubSceneWithParentMinimalSize(parent);
		subScene.setRoot(parent);
		subScene.setEffect(new DropShadow(127, Color.BLACK));
		stackPane.getChildren().add(subScene);

		return fxmlLoader;
	}

	public FXMLLoader loadFXMLIntoNewSubSceneAndPutIntoStackPane(StackPane stackPane, Class<?> objectclass,
			String fxmlPath, Effect effect) throws IOException {

		SubScene subScene;

		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(objectclass.getResource(fxmlPath));

		Parent parent = fxmlLoader.load();
		subScene = createSubSceneWithParentMinimalSize(parent);
		subScene.setRoot(parent);
		subScene.setEffect(effect);
		stackPane.getChildren().add(subScene);

		return fxmlLoader;
	}

	public void clearTextInputs(Pane parent) {
		ArrayList<Node> componentes = getAllNodes(parent);
		for (Node n : componentes) {
			if (n instanceof TextInputControl) {
				((TextInputControl) n).setText("");
			}
		}

	}

	public void clearListViews(Pane parent) {
		ArrayList<Node> componentes = getAllNodes(parent);
		for (Node n : componentes) {
			if (n instanceof ListView) {
				((ListView<?>) n).getItems().clear();
				((ListView<?>) n).setItems(null);
			}
		}

	}

	public void clearTableViews(Pane parent) {
		ArrayList<Node> componentes = getAllNodes(parent);
		for (Node n : componentes) {
			if (n instanceof TableView) {
				((TableView<?>) n).getItems().clear();
				((TableView<?>) n).setItems(null);
			}
		}

	}

	public void clearListAndTableViews(Pane parent) {
		ArrayList<Node> componentes = getAllNodes(parent);
		for (Node n : componentes) {
			if (n instanceof ListView) {
				((ListView<?>) n).getItems().clear();
				((ListView<?>) n).setItems(null);
			} else {
				if (n instanceof TableView) {
					((TableView<?>) n).getItems().clear();
					((TableView<?>) n).setItems(null);
				}
			}
		}

	}

	public void setTextInputsEditable(Pane parent, boolean value) {
		ArrayList<Node> componentes = getAllNodes(parent);
		for (Node n : componentes) {
			if (n instanceof TextInputControl) {
				((TextInputControl) n).setEditable(value);
			}
		}
	}

}
