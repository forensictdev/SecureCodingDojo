public class DatabaseConnection {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            String user = System.getenv("DB_USER");
            String password = System.getenv("DB_PASSWORD");

            if (user == null || password == null) {
                throw new RuntimeException("Missing environment variables for database connection");
            }
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
