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

	public List<User> Userlist(DataSource datasource) {

		// TODO Auto-generated method stub
		List<User> userlist = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = datasource.getConnection();

			String sql = "SELECT uid,first_name,last_name,email,uname,regdate FROM users";

			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				userlist.add(new User(rs.getInt("uid"), rs.getString("first_name"), rs.getString("last_name"),
						rs.getString("email"), rs.getString("uname"), rs.getString("regdate")));

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return userlist;
	}

	public User getUser(int userId, DataSource datasource) {
		User user = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = datasource.getConnection();

			String query = "select * from users where uid = ?";
			ps = conn.prepareStatement(query);
			ps.setInt(1, userId);

			rs = ps.executeQuery();
			while (rs.next()) {
				String fristName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String email = rs.getString("email");
				String userName = rs.getString("uname");
				String password = rs.getString("pass");

				user = new User(userId, fristName, lastName, email, userName, password);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return user;
		// TODO Auto-generated method stub

	}

	public void updateUser(User theuser, DataSource datasource) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		int userid = theuser.getUserId();
		String fristname = theuser.getFristName();
		String lastname = theuser.getLastName();
		String email = theuser.getEmail();
		String username = theuser.getUserName();

		try {
			conn = datasource.getConnection();

			String sql = "update users set first_name = ? , last_name = ? , email = ?,uname = ? where uid = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, fristname);
			ps.setString(2, lastname);
			ps.setString(3, email);
			ps.setString(4, username);
			ps.setInt(5, userid);

			ps.execute();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void deleteUser(int parseInt, DataSource datasource) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = datasource.getConnection();
			String query = "delete from users where uid = ?";

			ps = con.prepareStatement(query);

			ps.setInt(1, parseInt);

			ps.execute();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
