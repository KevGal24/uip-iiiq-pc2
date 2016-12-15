package fxml.fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {

    @FXML
    private Button BTN_Siguiente;
    @FXML
    private Button BTN_Anterior;

    public void Cambiar_Pantalla(ActionEvent actionEvent) throws IOException{
        Stage stage;
        Parent root;
        if (actionEvent.getSource() == BTN_Siguiente) {
            stage = (Stage) BTN_Siguiente.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("Secundario.fxml"));
            Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setTitle("Informacion Importante");
            alerta.setContentText("No me vas a ignorar");
            alerta.setContentText("Vas a cambiar de Pantalla");
            Optional<ButtonType> resultado = alerta.showAndWait();
        } if (resultado.get()) == ButtonType.OK: {
            root = FXMLLoader.load(getClass().getResource("Principal.fxml"));
                    Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
