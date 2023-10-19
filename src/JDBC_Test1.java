import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_Test1 {

    public static void main(String[] args) {
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        try {
            //Class.forName("org.mariadb.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/java_prj", "root", "12345");
            preparedStatement = con.prepareStatement("select * from employees");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int employeeId = resultSet.getInt("EMPLOYEE_ID");
                System.out.println(employeeId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
