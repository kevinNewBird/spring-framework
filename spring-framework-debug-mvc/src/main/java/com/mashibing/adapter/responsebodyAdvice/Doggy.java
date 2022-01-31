package com.mashibing.adapter.responsebodyAdvice;

import java.io.Serializable;

/**
 * description  Doggy <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:30  2022/1/21
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class Doggy implements Serializable {

	private static final long serialVersionUID = -4784557672932324805L;
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
