package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

public class ViewCustomerFormController {

    @FXML
    private TableColumn colAddress;

    @FXML
    private TableColumn colID;

    @FXML
    private TableColumn colName;

    @FXML
    private TableColumn colSalary;

    @FXML
    private TableView tblCustomers;

    @FXML
    void btnReloadOnAction(ActionEvent event) {

        colID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        ObservableList<Customer> customerObservableList = FXCollections.observableArrayList();
        customerObservableList.add(new Customer("C001", "Kamal", "Colombo", 10000.00));
        customerObservableList.add(new Customer("C001", "Kamal", "Colombo", 10000.00));
        customerObservableList.add(new Customer("C001", "Kamal", "Colombo", 10000.00));
        customerObservableList.add(new Customer("C001", "Kamal", "Colombo", 10000.00));
        tblCustomers.setItems(customerObservableList);
    }
}
