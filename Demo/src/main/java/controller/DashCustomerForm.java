package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class DashCustomerForm {

    @FXML
    void addCustomerForm(ActionEvent event) {
        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../view/add_customer_form.fxml")))));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void deleteCustomerForm(ActionEvent event) {

    }

    @FXML
    void logout(ActionEvent event) {

    }

    @FXML
    void searchCustomerForm(ActionEvent event) {

    }

    @FXML
    void updateCustomerForm(ActionEvent event) {

    }

    public void viewCustomerForm(ActionEvent actionEvent) {
        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../view/view_customer_form.fxml")))));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
