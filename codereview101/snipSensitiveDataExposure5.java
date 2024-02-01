public class DatabaseConnection {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            String user = "myuser";
            String password = "mypassword";
            connection = DriverManager.getConnection(url, user, password);
            // Perform database operations
            // ...
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
