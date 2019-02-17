package br.com.maplebearsystem.view.component;

import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class FXMLProductSaidaFormController {

    @FXML
    private VBox rootPane;

    @FXML
    private JFXTextField tfieldDescription;

    @FXML
    private JFXTextField tfieldInternalCod;

    @FXML
    private JFXTextField tfieldUnitQuant;

	public JFXTextField getTfieldDescription() {
		return tfieldDescription;
	}

	public JFXTextField getTfieldInternalCod() {
		return tfieldInternalCod;
	}

	public JFXTextField getTfieldUnitQuant() {
		return tfieldUnitQuant;
	}

}
