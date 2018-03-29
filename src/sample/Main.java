package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group root = new Group();
        Text txt = new Text("Hola mundo");
        root.getChildren().add(txt);
        txt.setY(50);
        primaryStage.setTitle("Plantilla JavaFX");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
