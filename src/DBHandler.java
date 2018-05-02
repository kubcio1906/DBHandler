import java.sql.*;


public class DBHandler {
    static Connection connect = null;
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public static void connect() {
        // This will load the MySQL driver, each DB has its own driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DBHandler.connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/BookStore?"
                            + "user=root&password=");
        } catch (SQLException e1) {
            e1.printStackTrace();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
    }

    static public void insertCustomer(String name, String surname, String nationality) {
        try {
            String sqlInsert = "INSERT INTO tcustomer (name, surname, nationality) VALUES (?,?,?);";
            PreparedStatement preparedStatement = connect.prepareStatement(sqlInsert);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, nationality);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   static public void insertCustomerB2B(String name, String nip, String nationality) {
        try {
            String sqlInsert = "INSERT INTO tcustomerb2b (name, nip, nationality) VALUES (?,?,?);";
            PreparedStatement preparedStatement = connect.prepareStatement(sqlInsert);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, nip);
            preparedStatement.setString(3, nationality);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   static public void insertOrder(int customerId, CustomerType customerType, double price) {
        try {
            String sqlInsert = "INSERT INTO torder(customer_id, customer_type, price) VALUES (?,?,?);";
            PreparedStatement preparedStatement = connect.prepareStatement(sqlInsert);
            preparedStatement.setInt(1, customerId);
            preparedStatement.setString(2, customerType.toString());
            preparedStatement.setDouble(3, price);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
