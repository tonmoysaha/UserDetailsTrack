package org.ma.entity;

public class User {
	private int userId;
	private String fristName;
	private String lastName;
	private String email;
	private String userName;
	private String password;
	private String regdate;
	public boolean valid;

	
	
	public User(int userId, String fristName, String lastName, String email, String userName, String regdate) {
		super();
		this.userId = userId;
		this.fristName = fristName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.regdate = regdate;
	}

	public User(int userId, String fristName, String lastName, String email, String userName) {
		
		this.userId = userId;
		this.fristName = fristName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
	}

	public User(String fristName, String lastName, String email, String userName, String password) {

		this.fristName = fristName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}

	public User(String userName, String password) {

		this.userName = userName;
		this.password = password;
	}

	


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

}
