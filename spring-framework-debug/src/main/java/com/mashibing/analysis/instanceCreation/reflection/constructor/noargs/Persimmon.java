package com.mashibing.analysis.instanceCreation.reflection.constructor.noargs;

/**
 * description  Persimmon <BR>
 * <p>
 * author: zhao.song
 * date: created in 16:30  2021/11/24
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class Persimmon {


	public void init() {
		System.out.println("初始化方法....");
	}

	public void show() {
		System.out.println(" show 方法执行");
	}

	public Persimmon() {
		System.out.println("persimmon 构造方法...");
	}

	public void destroy() {
		System.out.println("销毁方法...");
	}
}
