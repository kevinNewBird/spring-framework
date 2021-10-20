package com.mashibing.analysis.supplier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description  SupplierTest <BR>
 * <p>
 * author: zhao.song
 * date: created in 22:37  2021/10/19
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class SupplierTest {

	static ClassPathXmlApplicationContext context;


	public static void main(String[] args) {
		invokeCustomXML("supplier.xml");
		User user = context.getBean(User.class);
		System.out.println(user);
	}

	private static void invokeCustomXML(String oXMLName) {
		context = new ClassPathXmlApplicationContext(oXMLName);
	}
}
