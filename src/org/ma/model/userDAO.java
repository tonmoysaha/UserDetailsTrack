package org.ma.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.ma.entity.User;

public class userDAO {

	public static User userLogin(DataSource datasource, User login) {
		Connection conn =null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		try {
			conn= datasource.getConnection();
			String username= login.getUserName();
			String password = login.getPassword();
			String sql = "select * from users where uname=? and pass=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			rs= ps.executeQuery();
			while (rs.next()) {
				login.setUserName(rs.getString("uname"));
				login.setPassword(rs.getString("pass"));
				login.setValid(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return login;
	}

}
