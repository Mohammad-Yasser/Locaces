import java.sql.SQLException;

public class UserController {

	public boolean login(String name, String password) throws ClassNotFoundException, SQLException {
		return user.getUser(name, password);
	}
	
	public boolean signup(String _name ,String _password , String _email) throws ClassNotFoundException, SQLException {
		return user.addNewUser(_name, _password, _email) ;
	}
	

	private static UserModel user;
}
