/**
 * 
 */
package br.com.maplebearsystem.view.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

import javax.naming.OperationNotSupportedException;


import br.com.maplebearsystem.main.MapleBearSystemDesktopClient;
import javafx.fxml.FXMLLoader;
import javafx.scene.CacheHint;
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
	private FXMLLoader fxmlLoader;

	public FXUISetup() {
		fxmlLoader = new FXMLLoader();
	}

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

	public void setStageIcon(Stage stage, URL url) {
		// Set Stage Icon
		{
			InputStream IconInputStream = null;
			try {
				IconInputStream = url.openStream();
				Image icon = new Image(IconInputStream);
				stage.getIcons().add(icon);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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

	public FXMLLoader changeScene(Stage stage, URL fxmlURL) throws IOException {

		this.resetFXMLLoaderAndSetLocation(fxmlURL);

		Parent parent = fxmlLoader.load(fxmlURL.openStream());
		Scene scene = createSceneWithParentMinimalSize(parent);
		stage.setScene(scene);
		matchStageDimensionsWith(stage, parent);

		return fxmlLoader;
	}

	@Deprecated
	public FXMLLoader changeSceneFromDWORMainStage(URL fxmlURL) throws IOException {
		return changeSceneFromDWORMain(MapleBearSystemDesktopClient.getStage(), fxmlURL);

	}

	@Deprecated
	public FXMLLoader changeSceneFromDWORMain(Stage stage, URL fxmlURL) throws IOException {
		return changeScene(stage, fxmlURL);
	}

	public FXMLLoader initNewScene(Stage stage, URL fxmlURL) throws IOException {

		this.resetFXMLLoaderAndSetLocation(fxmlURL);

		Parent parent = fxmlLoader.load(fxmlURL.openStream());
		Scene scene = createSceneWithParentMinimalSize(parent);
		stage.setScene(scene);
		return fxmlLoader;
	}

	public FXMLLoader launchNewStage(URL fxmlURL) throws IOException {
		Stage stage = new Stage();
		FXMLLoader fxmlLoader = initNewScene(stage, fxmlURL);
		stage.show();
		return fxmlLoader;
	}

	public FXMLLoader launchNewStageAndWait(URL fxmlURL) throws IOException {
		Stage stage = new Stage();
		FXMLLoader fxmlLoader = initNewScene(stage, fxmlURL);
		stage.showAndWait();
		return fxmlLoader;
	}

	public FXMLLoader launchNewUndecoratedStageAndWait(URL fxmlURL) throws IOException {
		Stage stage = new Stage();
		FXMLLoader fxmlLoader = initNewScene(stage, fxmlURL);
		stage.initStyle(StageStyle.UNDECORATED);
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.showAndWait();
		return fxmlLoader;
	}

	public FXMLLoader loadSubscene(SubScene subScene, URL fxmlURL) throws IOException, Exception {
		throw new OperationNotSupportedException("Not Implemented yet");
	}

	public FXMLLoader loadFXMLIntoPane(Pane parent, URL fxmlURL) throws IOException {
		FXMLLoader fxmlLoader = loadFXMLIntoPane(parent, null, fxmlURL);

		return fxmlLoader;
	}

	public FXMLLoader loadFXMLIntoVbox(VBox parent, URL fxmlURL) throws IOException {
		FXMLLoader fxmlLoader = loadFXMLIntoVbox(parent, null, fxmlURL);

		return fxmlLoader;
	}

	public FXMLLoader loadFXMLIntoPane(Pane parent, Object controller, URL fxmlURL) throws IOException {
		this.resetFXMLLoaderAndSetLocation(fxmlURL);

		if (controller != null)
			fxmlLoader.setController(controller);

		Node newchild = fxmlLoader.load(fxmlURL.openStream());
		parent.getChildren().clear();
		parent.getChildren().add(newchild);

		return fxmlLoader;
	}

	public FXMLLoader loadFXMLIntoVbox(VBox parent, Object controller, URL fxmlURL) throws IOException {
		FXMLLoader fxmlLoader = loadFXMLIntoPane(parent, controller, fxmlURL);

		VBox.setVgrow(parent.getChildren().get(parent.getChildren().size() - 1), Priority.ALWAYS);

		return fxmlLoader;
	}

	public FXMLLoader loadFXMLIntoStackPane(StackPane parent, URL fxmlURL, Effect effect) throws IOException {

		return loadFXMLIntoStackPane(parent, fxmlURL, effect, 0.0);
	}

	public FXMLLoader loadFXMLIntoStackPane(StackPane parent, URL fxmlURL, Effect effect, Double padding)
			throws IOException {

		this.resetFXMLLoaderAndSetLocation(fxmlURL);

		Pane newchild = fxmlLoader.load(fxmlURL.openStream());

		if (padding != null && padding > 0.0 && padding < parent.getWidth() && padding < parent.getHeight()) {
			newchild.setMaxSize(parent.getWidth() - padding, parent.getHeight() - padding);
		}

		newchild.setEffect(effect);

		parent.getChildren().add(newchild);

		return fxmlLoader;
	}

	private void resetFXMLLoaderAndSetLocation(URL fxmlURL) {
		fxmlLoader.setController(null);
		fxmlLoader.setRoot(null);
		// fxmlLoader.setResources(null);
		fxmlLoader.setLocation(fxmlURL);
	}

	public FXMLLoader loadFXMLIntoNewSubSceneAndPutIntoStackPane(StackPane stackPane, URL fxmlURL) throws IOException {

		SubScene subScene;

		this.resetFXMLLoaderAndSetLocation(fxmlURL);

		Parent parent = fxmlLoader.load(fxmlURL.openStream());
		subScene = createSubSceneWithParentMinimalSize(parent);
		subScene.setRoot(parent);
		subScene.setEffect(new DropShadow(127, Color.BLACK));
		stackPane.getChildren().add(subScene);

		return fxmlLoader;
	}

	public FXMLLoader loadFXMLIntoNewSubSceneAndPutIntoStackPane(StackPane stackPane, URL fxmlURL, Effect effect)
			throws IOException {

		SubScene subScene;

		this.resetFXMLLoaderAndSetLocation(fxmlURL);

		Parent parent = fxmlLoader.load(fxmlURL.openStream());
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
			}
		}

	}

	public void clearTableViews(Pane parent) {
		ArrayList<Node> componentes = getAllNodes(parent);
		for (Node n : componentes) {
			if (n instanceof TableView) {
				((TableView<?>) n).getItems().clear();
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

	public void setNodeCache(Pane parent, boolean enabled, CacheHint cacheHint) {
		ArrayList<Node> componentes = getAllNodes(parent);

		parent.setCache(enabled);
		parent.setCacheHint(cacheHint);
		for (Node n : componentes) {
			n.setCache(enabled);
			n.setCacheHint(cacheHint);
		}

	}

	public Parent loadFXMLAsParent(URL fxmlURL) throws IOException {

		this.resetFXMLLoaderAndSetLocation(fxmlURL);

		Parent parent = fxmlLoader.load(fxmlURL.openStream());
		return parent;
	}

}