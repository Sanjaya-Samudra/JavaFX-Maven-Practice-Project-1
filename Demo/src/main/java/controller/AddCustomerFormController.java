package controller;

import com.jfoenix.controls.JFXTextField;
import db.DBConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Customer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AddCustomerFormController {

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtID;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtSalary;

    @FXML
    void btnAddCustomerOnAction(ActionEvent event) {
        List<Customer> connection = DBConnection.getInstance().getConnection();

        if(txtID.getLength()==0 || txtName.getLength() == 0 || txtAddress.getLength() == 0 || txtSalary.getLength() == 0){
            Stage stage = new Stage();
            try {
                stage.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../view/prompt_customer_message.fxml")))));
                stage.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        connection.add(new Customer(
                txtID.getText(),
                txtName.getText(),
                txtAddress.getText(),
                Double.parseDouble(txtSalary.getText())
        ));
        clearText();
    }

    @FXML
    void btnClearCustomerOnAction(ActionEvent event) {
        clearText();
    }

    public void clearText(){
        txtID.clear();
        txtName.clear();
        txtAddress.clear();
        txtSalary.clear();
    }

    @FXML
    void btnDeleteCustomerOnAction(ActionEvent event) {

    }

    @FXML
    void btnSearchCustomerOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateCustomerOnAction(ActionEvent event) {

    }

}
