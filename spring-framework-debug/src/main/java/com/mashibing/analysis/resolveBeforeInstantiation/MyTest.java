package com.mashibing.analysis.resolveBeforeInstantiation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description  MyTest <BR>
 * <p>
 * author: zhao.song
 * date: created in 17:16  2021/10/18
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class MyTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beforeInstantiation.xml");
		BeforeInstantiation bi = ac.getBean(BeforeInstantiation.class);
		bi.doSomething();
	}
}
