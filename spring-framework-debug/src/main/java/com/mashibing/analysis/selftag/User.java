package com.mashibing.analysis.selftag;

/**
 * description  User <BR>
 * <p>
 * author: zhao.song
 * date: created in 22:14  2021/8/29
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class User {

	private String id;

	private String username;

	private String email;

	private String password;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{" +
				"id='" + id + '\'' +
				", username='" + username + '\'' +
				", email='" + email + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
