package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class CustomerLoginForm {

    @FXML
    private JFXTextField txtPassword;

    @FXML
    private JFXTextField txtUsername;

    @FXML
    void btnLoginOnAction(ActionEvent event) {
        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../view/dash_customer_form.fxml")))));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
