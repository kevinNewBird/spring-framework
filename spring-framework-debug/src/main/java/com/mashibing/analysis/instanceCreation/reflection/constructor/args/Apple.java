package com.mashibing.analysis.instanceCreation.reflection.constructor.args;

/**
 * description  Apple <BR>
 * <p>
 * author: zhao.song
 * date: created in 17:35  2021/11/22
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class Apple {

	private Integer id;

	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Apple() {
		System.out.println("apple no args constructor init...");
	}

	public Apple(Integer id) {
		this.id = id;

	}

	public Apple(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Apple(String name, Integer id) {
		this.id = id;
		this.name = name;
	}
}
