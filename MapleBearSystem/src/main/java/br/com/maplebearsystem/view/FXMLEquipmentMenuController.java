/**
 * 
 */
package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;

/**
 * @author Gabriel L. P. Abreu
 *
 */
public class FXMLEquipmentMenuController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	VBox primaryPane;
	@FXML
	JFXButton btnManageEquipments;
	@FXML
	JFXButton btnManageEquipmentTypes;
	@FXML
	JFXButton btnManageEquipmentBrands;

	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.fxml.Initializable#initialize(java.net.URL,
	 * java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated type stub

	}

	/**
	 * 
	 */
	public FXMLEquipmentMenuController() {
		// TODO Auto-generated constructor stub
	}
	
	
	private void initUI() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.maplebearsystem.view.viewcontroller.FXMLDefaultControllerInterface#
	 * setSourceController(br.com.maplebearsystem.view.viewcontroller.
	 * FXMLDefaultControllerInterface)
	 */
	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		// TODO Auto-generated type stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.maplebearsystem.view.viewcontroller.FXMLDefaultControllerInterface#
	 * setTargetController(br.com.maplebearsystem.view.viewcontroller.
	 * FXMLDefaultControllerInterface)
	 */
	@Override
	public void setTargetFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		// TODO Auto-generated type stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.maplebearsystem.view.viewcontroller.FXMLDefaultControllerInterface#sendData(java.
	 * lang.Object)
	 */
	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated type stub

	}

	/*
	 * FXML Event Methods
	 **************************************************************************/

	@FXML
	public void actManageEquipments(ActionEvent event) {
	}
	

	@FXML
	public void actManageEquipmentTypes(ActionEvent event) {
	}
	

	@FXML
	public void actManageEquipmentBrands(ActionEvent event) {
	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/*
	 * End FXML Event Methods
	 **************************************************************************/
}
