package com.mashibing.analysis;

import com.mashibing.analysis.pojo.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description  BeanContextTest <BR>
 * <p>
 * author: zhao.song
 * date: created in 14:41  2021/6/23
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class BeanContextTest {


	public static void main(String[] args) throws Exception {
		// 加载xml -> 解析xml -> 封装BeanDefinition -> 实例化 -> 放到容器中 ->从容器中取出
		//1.使用自带的bean属性增强器
//		invokeCustomXML("applicationContext.xml");

		//1.使用自实现的bean属性增强器 MyBeanFactoryPostProcessor
		invokeCustomXML("customBeanDefinition.xml");

	}

	private static void invokeCustomXML(String oXMLName) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(oXMLName);
		Person instance = context.getBean("person", Person.class);
		System.out.println(instance.getApplicationContext());
		System.out.println("-------------------------------------");

		// 获取FactoryBean创建的对象
//		Person p2 = (Person) context.getBean("personFactoryBean");
		// 获取FactoryBean本身
//		PersonFactoryBean pb2 = (PersonFactoryBean) context.getBean("&personFactoryBean");
//		System.out.println(p2);
	}

}
