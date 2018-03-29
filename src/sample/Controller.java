package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField nombre;

    public void accionSaludar(ActionEvent actionEvent) {
        System.out.printf("¡Hola %s! %n",nombre.getText());
    }
}
