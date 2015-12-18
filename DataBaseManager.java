import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseManager {
	public static ResultSet execute(String command) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/feedback?"
				+ "user=sqluser&password=sqluserpw");
		return connect.createStatement().executeQuery(command);
	}
}
