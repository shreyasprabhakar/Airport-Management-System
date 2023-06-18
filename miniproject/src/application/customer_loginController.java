package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class customer_loginController implements Initializable{
	
	 	@FXML
	    private Button book;

	    @FXML
	    private DatePicker date;

	    @FXML
	    private ComboBox from;
	    
	    @FXML
	    private ComboBox to;

	    @FXML
	    private Label label;
	    
	    @FXML
	    private Label label1;
	    
	    @FXML
	    private Label label2;
	    
	    @FXML
	    private Label label21;

	    @FXML
	    private Button shops;

	 
	
	//customer login to login
	@FXML
	public void onclick(ActionEvent event) throws IOException {
//		TODO Autogenerated
		Parent customer_login_parent = FXMLLoader.load(getClass().getResource("login.fxml"));
		Scene customer_login_scene = new Scene(customer_login_parent);
		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		app_stage.setScene(customer_login_scene);
		app_stage.show();
	}
	
	
	//customer login to shop
	@FXML
	public void clicked(ActionEvent event) throws IOException {
//		TODO Autogenerated
		Parent shop_parent = FXMLLoader.load(getClass().getResource("shop.fxml"));
		Scene shop_scene = new Scene(shop_parent);
		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		app_stage.setScene(shop_scene);
		app_stage.show();
	}
	
	@FXML
    void source(ActionEvent event) {
		
		String s = from.getSelectionModel().getSelectedItem().toString();
		label.setText(s);
		
    }
	
	@FXML
    void destination(ActionEvent event) {
		
		String s = to.getSelectionModel().getSelectedItem().toString();
		label1.setText(s);
		
    }
    
	public void book(ActionEvent event) throws IOException
	{
		String query2 = "SELECT flight_id, flight_name FROM flight_details WHERE departure_airport = ? and arrival_airport = ?";
	
		String ret="";
		String name = "";
		 try(Connection conn = connect_db();
				 
				 PreparedStatement pstmp = conn.prepareStatement(query2))

	     {
			pstmp.setString(1, (String) from.getValue()) ;
			pstmp.setString(2, (String) to.getValue()) ;
	    ResultSet rstm=pstmp.executeQuery();
	    
	    
	                while(rstm.next())
	                {
	                          ret += rstm.getString("flight_id");
	                          name += rstm.getString("flight_name");
	                                                                        
	                }
	               
	            }
	    catch(SQLException ex)
	    {
	    System.err.println("Error:" + ex);
	    }
		
		 label2.setText(ret);
		 label21.setText(name);
	}


	private Connection connect_db() throws SQLException {
		 String url = "jdbc:postgresql://localhost:5432/miniprojectfinal";
		    String username = "postgres";
		    String password = "1234";
		    return DriverManager.getConnection(url,username,password);
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<String> list = FXCollections.observableArrayList("Mumbai", "Delhi", "Bhopal", "Varanasi", "Shirdi");		
		from.setItems(list);
		
		
		ObservableList<String> list2 = FXCollections.observableArrayList("Mumbai", "Delhi", "Bhopal", "Varanasi", "Shirdi", "New York", "Boston");		
		to.setItems(list2);
	}

}
