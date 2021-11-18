package com.mashibing.analysis.selfaware;

import org.springframework.context.ApplicationContext;

/**
 * description  TestMyAware <BR>
 * <p>
 * author: zhao.song
 * date: created in 22:59  2021/11/9
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestMyAware {

	public static void main(String[] args) {
		ApplicationContext ac = new MyAwareClassPathXmlApplicationContext("selfaware.xml");
		Dog dog = ac.getBean(Dog.class);
	}
}
