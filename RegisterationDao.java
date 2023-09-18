package com.RegDao.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.registermodel.org.Login;
import com.registermodel.org.RegistrationDetails;

public class RegisterationDao {
	public static String url = "jdbc:mysql://localhost:3306/ MVCdesign ";
	public static String username = "root";
	public static String password = "admin@1014";
	public static Connection cn = null;
	public static PreparedStatement ps = null;
	public static Statement st = null;
	public static ResultSet rs = null;
 
	public void insertRegisteration_Details(RegistrationDetails rdm) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(url, username, password);
			ps = cn.prepareStatement("insert into reg(Full_name,Email_ID,Pass_word,Mobile_number,Gender,City)values(?,?,?,?,?,?)");
			ps.setString(1, rdm.getRname());
			ps.setString(2, rdm.getRemail());
			ps.setString(3, rdm.getRpassword());
			ps.setLong(4, rdm.getMobile());
			ps.setString(5, rdm.getGender());
			ps.setString(6, rdm.getCity());
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				ps.close();
				cn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
		}

     public String checkLogin(Login lm) {
    	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(url, username, password);
             st = cn.createStatement();
             rs = st.executeQuery("select*from  Login");
             
             while(rs.next())
             {
            	 String demail = rs.getNString("Login_Email_Id");
            	 String dpassword = rs.getNString("Login_Password");
            	 if(demail.equals(lm.getEmail_Id())&&dpassword.equals(lm.getPassword()))
            	 {
            		 return "Success";
            	 }
             }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Failure";
    	
			}
}