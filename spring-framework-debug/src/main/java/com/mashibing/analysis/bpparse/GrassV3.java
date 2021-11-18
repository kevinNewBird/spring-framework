package com.mashibing.analysis.bpparse;

import org.springframework.context.annotation.Configuration;

/**
 * description  Grass <BR>
 * <p>
 * author: zhao.song
 * date: created in 15:59  2021/11/10
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class GrassV3 {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GrassV3() {
		System.out.println("grass v2 constructor...");
	}
}
