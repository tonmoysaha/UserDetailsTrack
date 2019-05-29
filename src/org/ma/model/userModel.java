package org.ma.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.ma.entity.User;

public class userModel {

	public void addNewuser(DataSource datasource, User newuser) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = datasource.getConnection();
			String fristname = newuser.getFristName();
			String lastname = newuser.getLastName();
			String email = newuser.getEmail();
			String username = newuser.getUserName();
			String password = newuser.getPassword();
			String query = "insert into users(first_name,last_name,email,uname,pass,regdate)values(?,?,?,?,?,curdate())";
			ps = conn.prepareStatement(query);
			ps.setString(1, fristname);
			ps.setString(2, lastname);
			ps.setString(3, email);
			ps.setString(4, username);
			ps.setString(5, password);
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

	}

}
