package com.mashibing.analysis.factoryMethod;

/**
 * description  Animal <BR>
 * <p>
 * author: zhao.song
 * date: created in 10:22  2021/10/20
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class Animal {

	private int id;

	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
