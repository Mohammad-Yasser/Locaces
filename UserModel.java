import java.sql.ResultSet;
import java.sql.SQLException;

public class UserModel {

	public boolean addNewUser(String _name, String _password, String _email) throws ClassNotFoundException, SQLException {

		ResultSet resultSet = DataBaseManager
				.execute("select * from User where Name = " + _name + " OR Email = " + _email);
		if (resultSet.getFetchSize() != 0)
			return false;

		DataBaseManager.execute("INSERT INTO User ( Name, Password, Email) VALUES ('" + _name + "'," + "'" + _password
				+ "'," + "'" + _email + "')");

		return true;
	}

	public boolean getUser(String _name, String _password) throws ClassNotFoundException, SQLException {
		ResultSet resultSet = DataBaseManager.execute("select * from User where Name = " + _name + " AND Password = "
				+ _password);
		if (resultSet.getFetchSize() == 0)
			return false;

		name = _name;
		password = _password;
		email = resultSet.getString("Email");
		id = resultSet.getInt("ID");
		type = resultSet.getInt("Type");

		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private int id, type;
	private String name, password, email;
}
