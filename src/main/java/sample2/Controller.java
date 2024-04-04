package sample2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class Controller {

    @FXML
    private Button fxButton;

    @FXML
    private Label inputA;

    @FXML
    private Label inputB;

    @FXML
    private Label outputC;

    @FXML
    private TextField textFieldA;

    @FXML
    private TextField textFieldB;

    @FXML
    private TextField textFieldC;

    @FXML
    public void click(javafx.event.ActionEvent actionEvent) {
        textFieldC.setText(String.valueOf(Integer.parseInt(textFieldA.getText())
                + Integer.parseInt(textFieldB.getText())));

    }
}
