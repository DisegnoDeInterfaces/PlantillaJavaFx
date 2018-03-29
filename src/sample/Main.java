package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        /*Group root = new Group();

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
        root.getChildren().add(box);*/

        primaryStage.setTitle("Plantilla JavaFX");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
