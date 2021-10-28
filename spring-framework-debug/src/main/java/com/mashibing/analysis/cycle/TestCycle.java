package com.mashibing.analysis.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description  TestCycle <BR>
 * <p>
 * author: zhao.song
 * date: created in 16:10  2021/10/27
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestCycle {


	public static void main(String[] args) {
		// 此时这两个类中不可有toString方法,否则会报错
		ApplicationContext ac = new ClassPathXmlApplicationContext("cycle.xml");
		A a = ac.getBean(A.class);
		System.out.println(a.getB());
		B b = ac.getBean(B.class);
		System.out.println(b.getA());

	}
}
