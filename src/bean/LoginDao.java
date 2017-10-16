package bean;
import java.sql.*;

public class LoginDao {

	public static boolean validate(LoginBean bean){
		//boolean status=false;
			try{
				Connection con=ConnectionProvider.getCon();
				String query = "select * from user432";
			        String DbUserName = "";
			        String DbPassword = "";
			        try {
			            System.out.println("--------------------USER LOGIN----------------CALL----------------");
			            //Connection con = ConnectionService.getConnection();
			            Statement stmt = con.createStatement();
			            ResultSet rst = stmt.executeQuery(query);
			            while (rst.next()) {
			                DbUserName = rst.getString("EMAIL");
			                DbPassword = rst.getString("PASS");
				                if (bean.getEmail().equals(DbUserName) && bean.getPass().equals(DbPassword)) {
				                	//status=true;
				                	return true;
			                }
			            }
				
			        	return false;		
			}catch(Exception e){
				System.out.println("connection problem: "+e);
				return false;
				}
			}finally {
				System.out.println("DB verification completed at Finally");
			}
		}
		
	}

