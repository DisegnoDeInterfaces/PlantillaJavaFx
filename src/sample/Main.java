package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group root = new Group();

        Text txt = new Text("¿Quién eres?");
        TextField nameFld = new TextField();

        Button btn = new Button();
        btn.setText("Hola");
        btn.setOnAction(event -> System.out.printf("¡Hola %s! %n",nameFld.getText()));

        VBox box = new VBox();
        box.getChildren().addAll(txt, nameFld, btn);
        root.getChildren().add(box);

        primaryStage.setTitle("Plantilla JavaFX");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
