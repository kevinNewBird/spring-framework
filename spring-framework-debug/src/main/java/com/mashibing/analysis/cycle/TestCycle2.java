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
public class TestCycle2 {


	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("cycle2.xml");
 		A a1 = ac.getBean(A.class);
		System.out.println(a1.getB());
		B b1 = ac.getBean(B.class);
		System.out.println(b1.getA());

	}
}
