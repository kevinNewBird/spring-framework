package com.mashibing.analysis.cycle;

/**
 * description  A <BR>
 * <p>
 * author: zhao.song
 * date: created in 16:07  2021/10/27
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class A {

	private String name;
	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public String toString() {
//		return "A{" +
//				"b=" + b +
//				'}';
//	}
}
