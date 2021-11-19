package com.mashibing.analysis.instanceCreation.supplier;

/**
 * description  User <BR>
 * <p>
 * author: zhao.song
 * date: created in 22:27  2021/10/19
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class User {

	private String username;

	public User() {
	}

	public User(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				'}';
	}
}
