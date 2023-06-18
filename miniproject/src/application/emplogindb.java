package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class emplogindb {

    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/miniprojectfinal";
    private static final String DATABASE_USERNAME = "postgres";
    private static final String DATABASE_PASSWORD = "1234";
    private static final String SELECT_QUERY = "SELECT * FROM employee_details WHERE emp_id = ? and employee_pwd = ?";

    public boolean validate(String emp_user, String emp_password) throws SQLException {

        try (Connection connection = DriverManager
            .getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);

            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_QUERY)) {
            preparedStatement.setString(1, emp_user);
            preparedStatement.setString(2, emp_password);

            System.out.println(preparedStatement);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            }


        } catch (SQLException e) {
            printSQLException(e);
        }
        return false;
    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
    
    public static Connection fetchConnection() throws SQLException {
        Connection con = DriverManager.getConnection(DATABASE_URL,DATABASE_USERNAME,DATABASE_PASSWORD);
        return con;
    }

    public static ObservableList<users> readPrt() throws SQLException {
        Connection con=fetchConnection();
        ObservableList<users> list= FXCollections.observableArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("SELECT * FROM employee_details");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                String emp_id = rs.getString("emp_id");
                String emp_name = rs.getString("emp_name");
                String emp_age = rs.getString("emp_age");
                String emp_job =rs.getString("emp_job");
                String emp_salary =rs.getString("emp_salary");
                String employee_pwd =rs.getString("employee_pwd");
                users row = new users(emp_id,emp_name,emp_age,emp_job,emp_salary, employee_pwd);
                list.add(new users(rs.getString("emp_id"),rs.getString("emp_name"),
                        rs.getString("emp_age"),
                        rs.getString("emp_job"),rs.getString("emp_salary"), rs.getString("employee_pwd")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return list;
    }
    
}