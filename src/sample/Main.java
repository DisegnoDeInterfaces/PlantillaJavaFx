package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Group root = new Group();

        Text txt = new Text("JavaFx");
        txt.setFont(new Font("Papyrus",80));
        TextField nameFld = new TextField();
        Label label = new Label("Nombre:");

        Button btn = new Button();
        btn.setText("Hola");
        btn.setOnAction(event -> System.out.printf("¡Hola %s! %n",nameFld.getText()));

        GridPane grid = new GridPane();
        grid.add(label,0,0);
        grid.add(nameFld,1,0);
        grid.setHgap(20);
        grid.add(btn,1,1);
        //grid.setGridLinesVisible(true);


        VBox box = new VBox();
        box.getChildren().addAll(txt, grid);
        root.getChildren().add(box);

        primaryStage.setTitle("Plantilla JavaFX");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
