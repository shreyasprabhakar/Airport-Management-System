package application;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class connection{
    public static void main(String[] args) {
        Connection connection = null;
        String host="localhost";
        String port="5432";
        String db_name="miniprojectfinal";
        String username="postgres";
        String password="1234";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://"+host+":"+port+"/"+db_name+"", ""+username+"", ""+password+"");
            JOptionPane.showMessageDialog(null, "Connection Established");
            if (connection != null) {
                System.out.println("Connection OK");
            } else {
                System.out.println("Connection Failed");
            }
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }

	public static Connection getConnection() {
		
		try {
//            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/miniprojectfinal");
            JOptionPane.showMessageDialog(null, "Connection Established");
            return connection;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
	}
	
	
	private static String url = "jdbc:postgresql://localhost:5432/miniprojectfinal";
    private static String user = "postgres";
    private static String pass = "1234";
	
	public static Connection fetchConnection() throws SQLException {
        Connection con = DriverManager.getConnection(url,user,pass);
        return con;
    }

    public static ObservableList<shops_data> readPrt() throws SQLException {
        Connection con=fetchConnection();
        ObservableList<shops_data> list= FXCollections.observableArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("SELECT * FROM shop_details");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String shop_id = rs.getString(1);
                String product_type = rs.getString(2);
                String shop_name = rs.getString(3);
                String floor =rs.getString(4);
                shops_data row = new shops_data(shop_id,product_type,shop_name,floor);
                list.add( new shops_data(rs.getString("shop_id"),
                		rs.getString("product_type"), rs.getString("shop_name"),rs.getString("floor")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list;
    }

	
	
	
}
//	public Object createStatement() {
//		// TODO Auto-generated method stub
//		return null;
//	}



//    private static Connection ConnectDb() {
//		// TODO Auto-generated method stub
//		
//		 try {
//	            Class.forName("org.postgresql.Driver");
//	            Connection conn = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/miniprojectfinal");
//	           // JOptionPane.showMessageDialog(null, "Connection Established");
//	            return conn;
//	        } catch (Exception e) {
//	            JOptionPane.showMessageDialog(null, e);
//	            return null;
//	        }
//	}
//    
//    
//	public static ObservableList<users> getDatausers() {
//		// TODO Auto-generated method stub
//		Connection conn = ConnectDb();
//        ObservableList<users> list = FXCollections.observableArrayList();
//        try {
//            PreparedStatement ps = conn.prepareStatement("select * from employee_details");
//            ResultSet rs = ps.executeQuery();
//            
//            while (rs.next()){   
//                list.add(new users(rs.getString("emp_id"), rs.getString("emp_name"), rs.getString("emp_age"), rs.getString("emp_job"), rs.getString("emp_salary"), rs.getString("employee_password")));               
//            }
//        } catch (Exception e) {
//        }
//        return list;
//	}

	

	


