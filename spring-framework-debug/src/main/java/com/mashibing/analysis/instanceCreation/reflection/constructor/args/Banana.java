package com.mashibing.analysis.instanceCreation.reflection.constructor.args;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * description  Banana <BR>
 * <p>
 * author: zhao.song
 * date: created in 17:37  2021/11/22
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class Banana {

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

	public Banana() {
		System.out.println("banana no args contructor init...");
	}

	@Autowired
	public Banana(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Banana(String name, int id) {
		this.id = id;
		this.name = name;
	}
}
