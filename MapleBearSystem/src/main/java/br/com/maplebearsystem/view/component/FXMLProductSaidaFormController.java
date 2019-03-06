package br.com.maplebearsystem.view.component;

import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.view.viewmodel.ProdutoAlterado;
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

	public void loadData(ProdutoAlterado tempproduct) {
		try {
			tfieldDescription.setText(tempproduct.getShortDescription());
			tfieldUnitQuant.setText(""+tempproduct.getQtd());
			tfieldInternalCod.setText(tempproduct.getId().toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
