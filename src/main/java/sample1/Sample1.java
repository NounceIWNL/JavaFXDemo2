package sample1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Sample1 extends Application {
    @FXML
    public Button fxButton;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //URL url = getClass().getResource("/org.sample1.fxml");

//System.out.println(url);
        Parent root = FXMLLoader.load(getClass().getResource("/sample1.fxml")); //Без слеша не работает
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void click(ActionEvent actionEvent) {
        System.out.println("Hello World");
        fxButton.setText("Hey!");
    }
}
