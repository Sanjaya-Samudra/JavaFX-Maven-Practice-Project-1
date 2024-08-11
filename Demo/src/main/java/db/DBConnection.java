package db;
import model.Customer;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {
    private static DBConnection instance;
    private List<Customer> customerList;

    // To make something singleton design pattern, first thing need to be done is make constructor private.
    private DBConnection(){
        customerList = new ArrayList<>();
    }

    public List<Customer> getConnection(){
        return customerList;
    }

    public static DBConnection getInstance(){
        if(instance==null){
            return instance=new DBConnection();
        }
        return instance;
    }
}
