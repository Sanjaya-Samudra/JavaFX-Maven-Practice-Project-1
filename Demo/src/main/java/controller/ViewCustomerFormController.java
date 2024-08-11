package controller;

import db.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ViewCustomerFormController implements Initializable {

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        loadTable();
    }

    @FXML
    void btnReloadOnAction(ActionEvent event) {
        loadTable();
    }

    private void loadTable(){
        List<Customer> connection = DBConnection.getInstance().getConnection();
        ObservableList<Customer> customerObservableList = FXCollections.observableArrayList();

        connection.forEach(obj-> {
            customerObservableList.add(obj);
        });

        customerObservableList.add(new Customer("C001", "Kamal", "Colombo", 10000.00));
        customerObservableList.add(new Customer("C001", "Kamal", "Colombo", 10000.00));
        customerObservableList.add(new Customer("C001", "Kamal", "Colombo", 10000.00));
        customerObservableList.add(new Customer("C001", "Kamal", "Colombo", 10000.00));
        tblCustomers.setItems(customerObservableList);
    }
}
