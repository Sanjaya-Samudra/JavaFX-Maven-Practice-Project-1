package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class AddCustomerFormController {

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtID;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtSalary;

    List<Customer> customerList = new ArrayList<>();

    @FXML
    void btnAddCustomerOnAction(ActionEvent event) {
        if(txtID.getText()==null || txtName.getText()==null || txtAddress.getText()==null || txtSalary.getText()==null){

        }
        Customer customer = new Customer(txtID.getText(), txtName.getText(), txtAddress.getText(), Double.parseDouble(txtSalary.getText()));
        customerList.add(customer);
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
