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
        Customer customer = new Customer(txtID.getText(), txtName.getText(), txtAddress.getText(), Double.parseDouble(txtSalary.getText()));

//        System.out.println(customer);

        customerList.add(customer);

//        System.out.println(customerList);

    }

    @FXML
    void btnClearCustomerOnAction(ActionEvent event) {
        txtID.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtSalary.setText("");
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
