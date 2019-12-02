package dad.javafx.ahorcado;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

public class AhorcadoController implements Initializable {

	@FXML
	private TabPane root;
	@FXML
	private Label palabraLabel, letrasLabel;
	@FXML
	private TextField letraText;
	@FXML
	private ListView<String> palabrasList, puntuacionesList;

	private AhorcadoModel model = new AhorcadoModel();

	public AhorcadoController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AhorcadoView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public TabPane getView() {
		return root;
	}

	@FXML
	void agregarPalabraAction(ActionEvent event) {

	}

	@FXML
	void checkLetraAction(ActionEvent event) {

	}

	@FXML
	void checkPalabraAction(ActionEvent event) {

	}

	@FXML
	void quitarPalabraAction(ActionEvent event) {

	}

}
