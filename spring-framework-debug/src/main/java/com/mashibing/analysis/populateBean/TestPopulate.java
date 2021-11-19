package com.mashibing.analysis.populateBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description  TestPopulate <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:15  2021/10/26
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestPopulate {


	static ClassPathXmlApplicationContext context;


	public static void main(String[] args) {
		invokeCustomXML("populateBean.xml");
		PBPerson p1 = context.getBean(PBPerson.class);
		System.out.println(p1);
	}

	private static void invokeCustomXML(String oXMLName) {
		context = new ClassPathXmlApplicationContext(oXMLName);
	}
}
