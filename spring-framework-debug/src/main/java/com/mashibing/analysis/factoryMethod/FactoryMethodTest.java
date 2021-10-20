package com.mashibing.analysis.factoryMethod;

import com.mashibing.analysis.supplier.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * description  FactoryMethodTest <BR>
 * <p>
 * author: zhao.song
 * date: created in 10:36  2021/10/20
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class FactoryMethodTest {

	static ClassPathXmlApplicationContext context;


	public static void main(String[] args) {
		invokeCustomXML("factoryMethod.xml");
		Animal dog = context.getBean("dog", Animal.class);
		Animal cat = context.getBean("cat", Animal.class);

		System.out.println(dog);
		System.out.println(cat);

		Map<String, Animal> beansOfType = context.getBeansOfType(Animal.class);
		System.out.println(beansOfType);
	}

	private static void invokeCustomXML(String oXMLName) {
		context = new ClassPathXmlApplicationContext(oXMLName);
	}
}
