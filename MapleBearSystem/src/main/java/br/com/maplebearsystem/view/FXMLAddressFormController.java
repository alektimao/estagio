
package br.com.maplebearsystem.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.maplebearsystem.dao.CityDAO;
import br.com.maplebearsystem.dao.ProvinceStateDAO;
import br.com.maplebearsystem.model.Address;
import br.com.maplebearsystem.model.City;
import br.com.maplebearsystem.model.ProvinceState;
import br.com.maplebearsystem.model.constants.PessoaConstants;
import br.com.maplebearsystem.model.validators.FieldValidators;
import br.com.maplebearsystem.ui.util.TextFieldFormatterHelper;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;
import com.jfoenix.controls.JFXAutoCompletePopup;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.StringConverter;

/**
 * @author Gabriel L. P. Abreu
 *
 */
public class FXMLAddressFormController implements FXMLDefaultControllerInterface, Initializable {

	@FXML
	private VBox rootPane;
	@FXML
	private HBox pnPostalCode;
	@FXML
	private JFXButton btnUpdateAddressByPostalCode;
	@FXML
	JFXTextField tfieldPostalCode;
	@FXML
	private JFXTextField tfieldAddress;
	@FXML
	private JFXTextField tfieldAddressNumber;
	@FXML
	private JFXTextField tfieldDistrict;
	@FXML
	private JFXTextField tfieldAddressComplement;
	@FXML
	JFXComboBox<ProvinceState> cmbboxProvinceState;
	@FXML
	JFXComboBox<City> cmbboxCity;
	private JFXAutoCompletePopup<ProvinceState> autoCompleteProvinceState;
	private JFXAutoCompletePopup<City> autoCompleteCity;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initUI();
	}

// SECTION UISetup FXMLController Methods

	public void initUI() {

		initTextFieldMasks();
		initCmbbxProvinceState();
		initCmbbxCity();
	}

	private void initCmbbxProvinceState() {

		cmbboxProvinceState.setConverter(new StringConverter<ProvinceState>() {

			@Override
			public String toString(ProvinceState provinceState) {
				if (provinceState == null)
					return "";
				return provinceState.toString();
			}

			@Override
			public ProvinceState fromString(String string) {

				try {
					int index = cmbboxProvinceState.getSelectionModel().getSelectedIndex();
					return cmbboxProvinceState.getItems().get(index);
				} catch (Exception e) {
					return null;
				}

//				try {
//					ProvinceState provinceState = cmbboxProvinceState.getItems().stream().filter(state -> state.toString().toLowerCase()
//									.equals(cmbboxProvinceState.getEditor().getText().toLowerCase())).findFirst().get();;
//									
//					return provinceState;
//				} catch (Exception e) {
//					return null;
//				}
			}
		});

		autoCompleteProvinceState = new JFXAutoCompletePopup<ProvinceState>();

		autoCompleteProvinceState.setSelectionHandler(event -> {
			Platform.runLater(() -> {
				try {
					cmbboxProvinceState.getSelectionModel().select(event.getObject());
					loadCmbboxCity(event.getObject());
				} catch (Exception e) {
					cmbboxProvinceState.getSelectionModel().select(-1);
				}
				cmbboxProvinceState.validate();
			});
		});

		Platform.runLater(() -> {
			cmbboxProvinceState.setEditable(true);

			cmbboxProvinceState.getEditor().textProperty().addListener(observable -> {

				autoCompleteProvinceState.filter(
						provinceState -> provinceState.getName().toLowerCase()
								.contains(cmbboxProvinceState.getEditor().getText().toLowerCase()));

				if (autoCompleteProvinceState.getFilteredSuggestions().isEmpty()
						|| cmbboxProvinceState.getEditor().getText().isEmpty()) {
					autoCompleteProvinceState.hide();
					// if you remove textField.getText.isEmpty() when text field is empty it
					// suggests all options
					// so you can choose
				} else {
					try {
						autoCompleteProvinceState.show(cmbboxProvinceState);
					} catch (Exception e) {
						System.out.println("Info: could not show pop suggestions");
					}
				}

			});
		});

	}

	private void initCmbbxCity() {

		cmbboxCity.setConverter(new StringConverter<City>() {

			@Override
			public String toString(City city) {
				if (city == null)
					return "";
				return city.toString();
			}

			@Override
			public City fromString(String string) {

				try {
					int index = cmbboxCity.getSelectionModel().getSelectedIndex();
					return cmbboxCity.getItems().get(index);
				} catch (Exception e) {
					return null;
				}
			}
		});

		autoCompleteCity = new JFXAutoCompletePopup<City>();

		autoCompleteCity.setSelectionHandler(event -> {
			Platform.runLater(() -> {
				try {
					cmbboxCity.getSelectionModel().select(event.getObject());
				} catch (Exception e) {
					cmbboxCity.getSelectionModel().select(-1);
				}
				cmbboxCity.validate();
			});
		});

		Platform.runLater(() -> {
			cmbboxCity.setEditable(true);

			cmbboxCity.getEditor().textProperty().addListener(observable -> {

				autoCompleteCity.filter(
						city -> city.getName().toLowerCase().contains(cmbboxCity.getEditor().getText().toLowerCase()));

				if (autoCompleteCity.getFilteredSuggestions().isEmpty() || cmbboxCity.getEditor().getText().isEmpty()) {
					autoCompleteCity.hide();
					// if you remove textField.getText.isEmpty() when text field is empty it
					// suggests all options
					// so you can choose
				} else {
					try {
						autoCompleteCity.show(cmbboxCity);
					} catch (Exception e) {
						System.out.println("Info: could not show pop suggestions");
					}
				}

			});
		});

	}

	/**
	 * Method to enable cmbboxcity content loading according to cmbboxProvinceState
	 * new Value
	 * 
	 */
	private void initCmbboxProvinceStateListener() {
		cmbboxProvinceState.valueProperty()
				.addListener((ChangeListener<ProvinceState>) (observable, oldValue, newValue) -> {
					if (newValue != null) {
						loadCmbboxCity(newValue);
					}
				});
	}

	public void reset() {

		throw new UnsupportedOperationException();

	}

	private void setCEPAutoCompletionListener() {
		tfieldPostalCode.textProperty().addListener((obs, oldText, newText) -> {
			System.out.println("Text changed from " + oldText + " to " + newText);

			if (FieldValidators.validadeBrazilianCEPFormat(newText)) {
				if (checkEligibilityForAutocompleteByPostalCodeSearch()) {
					loadAddressFromCPF();
				}
			}

		});
	}

	private void initTextFieldMasks() {
		tfieldAddress.setTextFormatter(
				TextFieldFormatterHelper.getTextFieldFormatter(
						"[a-zA-ZÀ-ÿ0-9\\s\\.\\,\\-\\ª\\º]*",
						PessoaConstants.MAXLEN_ADDRESS.getValue()));
		tfieldAddressComplement.setTextFormatter(
				TextFieldFormatterHelper.getTextFieldFormatter(
						"[a-zA-ZÀ-ÿ0-9\\s\\.\\,\\-\\ª\\º]*",
						PessoaConstants.MAXLEN_ADDRESS.getValue()));
		tfieldDistrict.setTextFormatter(
				TextFieldFormatterHelper.getTextFieldFormatter(
						"[a-zA-ZÀ-ÿ0-9\\s\\.\\,\\-\\ª\\º]*",
						PessoaConstants.MAXLEN_DISTRICT.getValue()));
		tfieldPostalCode.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[\\d]*", "#####-###"));
	}

// ENDSECTION UISetup FXMLController Methods

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

	public JFXTextField getTfieldAddressNumber() {
		return tfieldAddressNumber;
	}

// ENDSECTION Data Access FXMLController Methods

// SECTION Helper FXMLController Methods

	@Deprecated
	public void loadData(String postalCode,
			String address,
			String district,
			String addressComplement,
			final City city) {

		tfieldPostalCode.setText(postalCode);
		tfieldAddress.setText(address);
		tfieldDistrict.setText(district);
		tfieldAddressComplement.setText(addressComplement);
		tfieldAddressNumber.requestFocus();
		// TODO Improve this method safety

		Task<Void> provinceState = new Task<Void>() {

			@Override
			protected Void call() throws Exception {
				if (!cmbboxProvinceState.getItems().isEmpty()
						&& cmbboxProvinceState.getItems().contains(city.getProvinceState())) {
					Platform.runLater(() -> cmbboxProvinceState.getSelectionModel().select(city.getProvinceState()));
				} else {
					loadCmbboxProvinceState(null);
					Platform.runLater(() -> cmbboxProvinceState.getSelectionModel().select(city.getProvinceState()));
				}
				return null;
			}
		};

		provinceState.setOnSucceeded((event) -> {
			Task<Void> cityTask = new Task<Void>() {

				@Override
				protected Void call() throws Exception {
					loadCmbboxCity(getCmbboxProvinceState().getSelectionModel().getSelectedItem());

					return null;
				}
			};

			cityTask.setOnSucceeded((event2) -> {
				if (cmbboxCity.getItems().contains(city)) {
					Platform.runLater(() -> cmbboxCity.getSelectionModel().select(city));
				}
			});

			new Thread(cityTask).run();
		});

		new Thread(provinceState).run();

	}

	public void loadData(Address data) {
		try {
			tfieldAddress.setText(data.getAddress());
			tfieldAddressComplement.setText(data.getAddressComplement());
			tfieldAddressNumber.setText(data.getAddressNumber());
			tfieldDistrict.setText(data.getDistrict());
			tfieldPostalCode.setText(data.getPostalCode());

			loadLocationCmbboxByCity(data.getCity());

			setCEPAutoCompletionListener();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void loadAddressFromCPF() {

		Task<Void> task = new Task<Void>() {
			@Override
			public Void call() {
				try {
					ViaCEPClient viaCEPClient = new ViaCEPClient();
					viaCEPClient.setUsingHTTPS(false);
					ViaCEPEndereco cepAddress = viaCEPClient.getEndereco(tfieldPostalCode.getText());

					City city = new CityDAO()
							.getCityByNameAndProvinceStateAbbreviation(cepAddress.getLocalidade(), cepAddress.getUf());

					Platform.runLater(() -> {
						loadData(cepAddress.getCep(), cepAddress.getLogradouro(), cepAddress.getBairro(), "", city);
					});

				} catch (IOException e) {
					Logger.getLogger(this.getClass().getName()).log(
							Level.WARNING,
							"Error: an IO error ocurred when searching for CEP, falling back to default Location",
							e);
				} catch (Exception e) {
					Logger.getLogger(this.getClass().getName()).log(
							Level.WARNING,
							"Warning: an error ocurred when searching for CEP, falling back to default Location",
							e);
					Platform.runLater(() -> {
						setCmbboxesToDefaultLocation();
					});
				}
				return null;
			}
		};
		new Thread(task).start();

	}

	public void setCmbboxesToDefaultLocation() {

		setCEPAutoCompletionListener();

		String defaultState = "SP";
		String defaultCity = "Presidente Prudente";

		Task<LocationCombo> task = new Task<LocationCombo>() {
			@Override
			protected LocationCombo call() throws Exception {
				LocationCombo combo = new LocationCombo();
				City city = new CityDAO().getCityByNameAndProvinceStateAbbreviation(defaultCity, defaultState);
				combo.setCity(city);
				combo.setCities(
						FXCollections.observableArrayList(new CityDAO().findByProvinceState(city.getProvinceState())));
				combo.setStates(FXCollections.observableArrayList(new ProvinceStateDAO().findAll()));

				return combo;
			}
		};

		task.setOnSucceeded((event) -> {

			Platform.runLater(() -> {
				cmbboxProvinceState.getItems().clear();
				// testing
				autoCompleteProvinceState.getSuggestions().clear();
				cmbboxCity.getItems().clear();
				try {
					if (task.get() != null) {

						if (task.get().getStates() != null) {
							cmbboxProvinceState.setItems(task.get().getStates());
							// testing
							autoCompleteProvinceState.getSuggestions().addAll(task.get().getStates());

							if (task.get().getCity() != null) {
								cmbboxProvinceState.getSelectionModel().select(task.get().getCity().getProvinceState());

								cmbboxCity.getItems().clear();
								// testing
								autoCompleteCity.getSuggestions().clear();
								if (task.get().getCities() != null) {
									cmbboxCity.setItems(task.get().getCities());
									// testing
									autoCompleteCity.getSuggestions().addAll(task.get().getCities());
									cmbboxCity.getSelectionModel().select(task.get().getCity());
								}

							}
						}

					}
				} catch (InterruptedException | ExecutionException e) {
					Logger.getLogger(this.getClass().getName())
							.log(Level.WARNING, "Error: failed to run Task for default location loading", e);
				}
			});
		});

		new Thread(task).start();

	}

	void loadCmbboxProvinceState(ProvinceState provinceState) {

		Task<ObservableList<ProvinceState>> task = new Task<ObservableList<ProvinceState>>() {
			@Override
			protected ObservableList<ProvinceState> call() throws Exception {
				return FXCollections.observableArrayList(new ProvinceStateDAO().findAll());
			}

		};

		task.setOnSucceeded((event) -> {
			Platform.runLater(() -> {
				cmbboxProvinceState.getItems().clear();
				cmbboxCity.getItems().clear();
				try {
					if (task.get() != null) {
						cmbboxProvinceState.setItems(task.get());
						// testing
						autoCompleteProvinceState.getSuggestions().addAll(task.get());
					}
				} catch (InterruptedException | ExecutionException e) {
					Logger.getLogger(this.getClass().getName())
							.log(Level.WARNING, "Error: failed to load Province States", e);
				}
			});
		});

		new Thread(task).run();

	}

	void loadCmbboxCity(final ProvinceState provinceState) {

		if (provinceState == null)
			return;

		Task<ObservableList<City>> task = new Task<ObservableList<City>>() {

			@Override
			protected ObservableList<City> call() throws Exception {
				return FXCollections.observableArrayList(new CityDAO().findByProvinceState(provinceState));
			}

		};

		task.setOnSucceeded((event) -> {
			Platform.runLater(() -> {
				cmbboxCity.getItems().clear();
				// testing
				// testing
				autoCompleteCity.getSuggestions().clear();
				try {
					if (task.get() != null) {
						cmbboxCity.setItems(task.get());
						// testing
						autoCompleteCity.getSuggestions().addAll(task.get());
					}
				} catch (InterruptedException | ExecutionException e) {
					Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to load Cities", e);
				}
			});
		});

		new Thread(task).run();

	}

	private void loadLocationCmbboxByCity(City city) {

		Task<LocationCombo> task = new Task<LocationCombo>() {
			@Override
			protected LocationCombo call() throws Exception {
				LocationCombo combo = new LocationCombo();
				combo.setCity(city);
				combo.setCities(
						FXCollections.observableArrayList(new CityDAO().findByProvinceState(city.getProvinceState())));
				combo.setStates(FXCollections.observableArrayList(new ProvinceStateDAO().findAll()));

				return combo;
			}
		};

		task.setOnSucceeded((event) -> {

			Platform.runLater(() -> {
				cmbboxProvinceState.getItems().clear();
				cmbboxCity.getItems().clear();
				try {
					if (task.get() != null) {

						if (task.get().getStates() != null) {
							cmbboxProvinceState.setItems(task.get().getStates());

							if (task.get().getCity() != null) {
								cmbboxProvinceState.getSelectionModel().select(task.get().getCity().getProvinceState());
								// testing
								autoCompleteProvinceState.getSuggestions().addAll(task.get().getStates());

								cmbboxCity.getItems().clear();
								// testing
								// testing
								autoCompleteCity.getSuggestions().clear();
								if (task.get().getCities() != null) {
									cmbboxCity.setItems(task.get().getCities());
									// testing
									autoCompleteCity.getSuggestions().addAll(task.get().getCities());
									cmbboxCity.getSelectionModel().select(task.get().getCity());
								}

							}
						}

					}
				} catch (InterruptedException | ExecutionException e) {
					Logger.getLogger(this.getClass().getName())
							.log(Level.WARNING, "Error: failed to load Province States and Cities by City", e);
				}
			});
		});

		new Thread(task).start();

	}

	private boolean checkEligibilityForAutocompleteByPostalCodeSearch() {

		if (tfieldAddress.getText().equals("") && tfieldAddressComplement.getText().equals("")
				&& tfieldDistrict.getText().equals("")) {
			return true;
		}

		return false;
	}

// ENDSECTION Helper FXMLController Methods

// SECTION FXML Event Methods

	@FXML
	private void actPostalCode(ActionEvent event) {
		if (FieldValidators.validadeBrazilianCEPFormat(tfieldPostalCode.getText())
				&& checkEligibilityForAutocompleteByPostalCodeSearch()) {
			loadAddressFromCPF();
		}
	}

	@FXML
	private void actUpdateAddressByPostalCode(ActionEvent event) {
		if (FieldValidators.validadeBrazilianCEPFormat(tfieldPostalCode.getText())) {
			loadAddressFromCPF();
		}
	}

// ENDSECTION FXML Event Methods

// SECTION FXMLDefaultControllerInterface Implementation

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		throw new UnsupportedOperationException();

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

// ENDSECTION FXMLDefaultControllerInterface Implementation

	public void switchToNewContact() {
		setCmbboxesToDefaultLocation();
		initCmbboxProvinceStateListener();
	}

	private class LocationCombo {
		private City city;
		private ObservableList<City> cities;
		private ObservableList<ProvinceState> states;

		public LocationCombo() {
		};

		public ObservableList<City> getCities() {
			return cities;
		}

		public City getCity() {
			return city;
		}

		public ObservableList<ProvinceState> getStates() {
			return states;
		}

		public void setCities(ObservableList<City> cities) {
			this.cities = cities;
		}

		public void setCity(City city) {
			this.city = city;
		}

		public void setStates(ObservableList<ProvinceState> states) {
			this.states = states;
		}
	}
}
