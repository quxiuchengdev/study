package com.jdbctemplate.entity;

public class User {
	
	private String id;
	
	private String username;
	
	private String password;
	
	private String salt;
	
	private String enable;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	@Override
	public String toString() {
		return "JdbcTemplateTestEntity [id=" + id + ", username=" + username
				+ ", password=" + password + ", salt=" + salt + ", enable="
				+ enable + "]";
	}

}
