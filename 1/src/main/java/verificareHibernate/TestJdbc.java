package verificareHibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:mysql://localhost:3306/bookManager";
		String user = "root";
		String pass = "root";
		
		
		try {
			System.out.println("Connecting to database" + jdbcURL);
			Connection myConn;
		    myConn = DriverManager.getConnection(jdbcURL, user, pass);
		    System.out.println("Connection succesful!!!!:):)");
		}
		catch(Exception exc){
			exc.printStackTrace();
		}

	}

}
