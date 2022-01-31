package com.mashibing.pojo;

import java.io.Serializable;

/**
 * description  Monkey <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:55  2021/12/27
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class Monkey implements Serializable {
	private static final long serialVersionUID = 111111L;

	private Integer id;
	private String username;
	private Integer age;
	private String gender;

	public Monkey() {
	}

	public Monkey(String username, Integer age) {
		this.username = username;
		this.age = age;
	}

	public Monkey(Integer id, String username, Integer age, String gender) {
		this.id = id;
		this.username = username;
		this.age = age;
		this.gender = gender;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Monkey{" +
				"id=" + id +
				", name='" + username + '\'' +
				", age=" + age +
				", gender='" + gender + '\'' +
				'}';
	}
}
