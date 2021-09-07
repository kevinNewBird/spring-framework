package com.mashibing.analysis.selfbdrpp;

/**
 * description  Teacher <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:55  2021/9/7
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class Teacher {

	private String name;

	public Teacher() {
		System.out.println("创建teacher对象!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
