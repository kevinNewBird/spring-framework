package com.mashibing.analysis.reflection;

import com.mashibing.analysis.pojo.Person;
import com.mashibing.analysis.pojo.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description  TestAutowireConstructor <BR>
 * <p>
 * author: zhao.song
 * date: created in 10:33  2021/10/21
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class AutowireConstructorTest {

	static ClassPathXmlApplicationContext context;


	public static void main(String[] args) {
		invokeCustomXML("reflect-autowireConstructor.xml");
		// 第一次不会进入autowireConstructor方法,
		// 第一次对象没有创建BeanDefinition没有缓存构造器,resolved=false直接跳过
//		Person p1 = context.getBean(Person.class);
		// 第二次才进入
//		Person p2 = context.getBean(Person.class);


		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);



	}

	private static void invokeCustomXML(String oXMLName) {
		context = new ClassPathXmlApplicationContext(oXMLName);
	}
}
