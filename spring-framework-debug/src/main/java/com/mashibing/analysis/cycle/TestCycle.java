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
		ApplicationContext ac = new ClassPathXmlApplicationContext("cycle.xml");
		A instance = ac.getBean(A.class);

	}
}
