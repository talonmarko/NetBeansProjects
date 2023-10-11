import java.sql.*;

public class javasqlconnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/infoscreen";
        String username = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT lounas1, lounas2, jälkiruoka FROM mytable")) {

            while (resultSet.next()) {
                String lounas1 = resultSet.getString("lounas1");
                String lounas2 = resultSet.getString("lounas2");
                String jälkiruoka = resultSet.getString("jälkiruoka");
                System.out.println("Lounas1: " + lounas1 + ", Lounas2: " + lounas2 + ", Jälkiruoka: " + jälkiruoka);
            }
        } catch (SQLException e) {
        }
    }
}