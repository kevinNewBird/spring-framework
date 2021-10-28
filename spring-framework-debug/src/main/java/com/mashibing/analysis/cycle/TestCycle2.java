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
		// 使用了aop,此时如果使用两级代理就会发生异常
		// 报错位置: AbstractAutowireCapableBeanFactory#754
		ApplicationContext ac = new ClassPathXmlApplicationContext("cycle2.xml");
		A a = ac.getBean(A.class);
		System.out.println(a.getB());
		B b = ac.getBean(B.class);
		System.out.println(b.getA());

	}
}
