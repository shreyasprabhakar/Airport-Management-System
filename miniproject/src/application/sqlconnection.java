package application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


class newuser {

    public static void newuserDatabase(String Ticket_id,String new_username, String Name,
    		String phonenumber, String Age,String Email,
    		String new_passowrd, String Gender) {

        String url = "jdbc:postgresql://localhost:5432/miniprojectfinal";
        String username = "postgres";
        String password = "1234";

        String ticket_id = Ticket_id;
        String passenger_id = new_username;
        String passenger_name = Name;
        String phone_no= phonenumber;
        String passenger_age = Age;
        String email_id = Email;
        String passenger_pwd = new_passowrd;
        String gender = Gender;
        
        

        // query
        String query = "INSERT INTO passengerdetails(ticket_id, passenger_id, passenger_name, phone_no, passenger_age, email_id, passenger_pwd, gender) VALUES(?,?,?,?,?,?,?,?)";

        try 
       
        (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement p = con.prepareStatement(query)) {

        	p.setString(1, ticket_id);
        	p.setString(2, passenger_id);
            p.setString(3, passenger_name);
            p.setString(4, phone_no);
            p.setString(5, passenger_age);
            p.setString(6, email_id);
            p.setString(7, passenger_pwd);
            p.setString(8, gender);
            
            
            p.executeUpdate();
            System.out.println("Sucessfully created.");

        }
    
        catch (Exception e) {
        	System.out.println("ERROR CONNECTION");
        	System.out.println(e);
        	    }

    }
    
    
    //--------------------------------------Table emp-----------------------------------
    
    private static Connection ConnectDb() {
		// TODO Auto-generated method stub
		
		 try {
	            Class.forName("org.postgresql.Driver");
	            Connection conn = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/miniprojectfinal");
	           // JOptionPane.showMessageDialog(null, "Connection Established");
	            return conn;
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, e);
	            return null;
	        }
	}
//    
//    
	public static ObservableList<users> getDatausers() {
		// TODO Auto-generated method stub
		Connection conn = ConnectDb();
        ObservableList<users> list = FXCollections.observableArrayList();
        try {
            PreparedStatement pst = conn.prepareStatement("select * from employee_details");
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){   
                list.add(new users(rs.getString("emp_id"), rs.getString("emp_name"), rs.getString("emp_age"), rs.getString("emp_job"), rs.getString("emp_salary"), rs.getString("employee_password")));               
            }
        } catch (Exception e) {
        }
        return list;
	}


	
	}
