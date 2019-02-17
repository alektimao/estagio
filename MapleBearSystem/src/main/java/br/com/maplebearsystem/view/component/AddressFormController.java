package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.dwor.dao.CityDAO;
import com.dwor.dao.ProvinceStateDAO;
import com.dwor.model.City;
import com.dwor.model.ProvinceState;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.model.constants.PessoaConstantsEnum;
import br.com.maplebearsystem.view.controller.FXMLDefaultControllerInterface;
import br.com.maplebearsystem.view.util.TextFieldFormatterHelper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

public class AddressFormController implements FXMLDefaultControllerInterface, Initializable {

	@FXML
	private VBox rootPane;
	@FXML
	private JFXTextField tfieldPostalCode;
	@FXML
	private JFXTextField tfieldAddress;
	@FXML
	private JFXTextField tfieldDistrict;
	@FXML
	private JFXTextField tfieldAddressComplement;
	@FXML
	JFXComboBox<ProvinceState> cmbboxProvinceState;
	@FXML
	JFXComboBox<City> cmbboxCity;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initUI();
	}

// SECTION Data Access FXMLController Methods

	public JFXComboBox<City> getCmbboxCity() {
		return cmbboxCity;
	}

	public JFXComboBox<ProvinceState> getCmbboxProvinceState() {
		return cmbboxProvinceState;
	}

	public JFXTextField getTfieldPostalCode() {
		return tfieldPostalCode;
	}

	public JFXTextField getTfieldAddress() {
		return tfieldAddress;
	}

	public JFXTextField getTfieldDistrict() {
		return tfieldDistrict;
	}

	public JFXTextField getTfieldAddressComplement() {
		return tfieldAddressComplement;
	}

	public void setData(String postalCode, String address, String district, String addressComplement, City city) {

		tfieldPostalCode.setText(postalCode);
		tfieldAddress.setText(address);
		tfieldDistrict.setText(district);
		tfieldAddressComplement.setText(addressComplement);

		// TODO Improve this method safety

		if (!cmbboxProvinceState.getItems().isEmpty()
				&& cmbboxProvinceState.getItems().contains(city.getProvinceState())) {
			cmbboxProvinceState.getSelectionModel().select(city.getProvinceState());
		} else {
			loadCmbboxProvinceState();
			cmbboxProvinceState.getSelectionModel().select(city.getProvinceState());
		}

		loadCmbboxCity();

		if (cmbboxCity.getItems().contains(city)) {
			cmbboxCity.getSelectionModel().select(city);
		}

	}

// ENDSECTION Data Access FXMLController Methods

// SECTION UISetup FXMLController Methods

	public void initUI() {

		initTextFieldMasks();

		// loadCmbboxProvinceState();
		// setCmbboxesToDefaultLocation();
	}

	public void reset() {

		tfieldPostalCode.clear();
		tfieldAddress.clear();
		tfieldDistrict.clear();
		tfieldAddressComplement.clear();

		loadCmbboxProvinceState();
		setCmbboxesToDefaultLocation();

	}

	private void setCmbboxesToDefaultLocation() {

		String defaultState = "SP";
		String defaultCity = "Presidente Prudente";

		try {
			ProvinceState selectedState = cmbboxProvinceState.getItems().stream()
					.filter(state -> state.getAbbreviation().equals(defaultState)).findFirst().get();

			if (selectedState != null) {

				cmbboxProvinceState.getSelectionModel().select(selectedState);

				loadCmbboxCity();

				City selectedCity = cmbboxCity.getItems().stream().filter(city -> city.getName().equals(defaultCity))
						.findFirst().get();

				if (selectedCity != null)
					cmbboxCity.getSelectionModel().select(selectedCity);
				else
					cmbboxCity.getSelectionModel().selectFirst();

			} else {
				cmbboxProvinceState.getSelectionModel().selectFirst();
				cmbboxCity.setItems(null);
			}

		} catch (Exception e) {
			// TODO catch error about default location
			e.printStackTrace();
		}
	}

	private void initTextFieldMasks() {
		tfieldAddress.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				"[a-zA-ZÀ-ÿ0-9\\s\\.\\,\\-\\ª\\º]*", PessoaConstantsEnum.MAXLEN_ADDRESS.getValue()));
		tfieldAddressComplement.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				"[a-zA-ZÀ-ÿ0-9\\s\\.\\,\\-\\ª\\º]*", PessoaConstantsEnum.MAXLEN_ADDRESS.getValue()));
		tfieldDistrict.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				"[a-zA-ZÀ-ÿ0-9\\s\\.\\,\\-\\ª\\º]*", PessoaConstantsEnum.MAXLEN_DISTRICT.getValue()));
		tfieldPostalCode.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[\\d]*", "#####-###"));
	}

	private void loadCmbboxProvinceState() {
		ProvinceStateDAO provinceStateDAO = new ProvinceStateDAO();

		List<ProvinceState> states = provinceStateDAO.findAll();

		ObservableList<ProvinceState> observableStates = FXCollections.observableArrayList(states);

		cmbboxProvinceState.setItems(observableStates);

	}

	private void loadCmbboxCity() {
		CityDAO cityDAO = new CityDAO();

		List<City> cities = cityDAO.findByProvinceState(cmbboxProvinceState.getSelectionModel().getSelectedItem());

		ObservableList<City> observableCities = FXCollections.observableArrayList(cities);

		cmbboxCity.setItems(null);
		cmbboxCity.setItems(observableCities);
	}

	@Deprecated
	public void loadProvinceStates() {
		loadCmbboxProvinceState();
	}

// ENDSECTION UISetup FXMLController Methods

// SECTION FXML Event Methods

	@FXML
	private void actSelectProvinceState(ActionEvent event) {
		loadCmbboxCity();
	}

// ENDSECTION FXML Event Methods

// SECTION FXMLDefaultControllerInterface Implementation

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		// TODO Auto-generated type stub

	}

	@Override
	public void setTargetFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		// TODO Auto-generated type stub

	}

	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated type stub

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated method stub
		
	}

// ENDSECTION FXMLDefaultControllerInterface Implementation
}
