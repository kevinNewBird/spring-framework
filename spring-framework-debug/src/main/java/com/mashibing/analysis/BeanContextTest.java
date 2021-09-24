package com.mashibing.analysis;

import com.mashibing.analysis.methodOverride.lookup.FruitPlate;
import com.mashibing.analysis.pojo.Person;
import com.mashibing.analysis.pojo.PersonFactoryBean;
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
	static ClassPathXmlApplicationContext context;

	public static void main(String[] args) throws Exception {
		// 加载xml -> 解析xml -> 封装BeanDefinition -> 实例化 -> 放到容器中 ->从容器中取出
		//1.使用自带的bean属性增强器,getMergedLocalBeanDefinition
//		invokeCustomXML("applicationContext.xml");

		//2.使用自实现的bean属性增强器 MyBeanFactoryPostProcessor
//		invokeCustomXML("customBeanDefinition.xml");

		// 3. 使用factoryBean
//		invokeCustomXML("factoryBean.xml");
//		PersonFactoryBean fb = context.getBean("&personFB", PersonFactoryBean.class);
//		System.out.println(fb.getObject());
//		Person instance = context.getBean(Person.class);
//		System.out.println(instance);

		// 4.look-up  replace
		invokeCustomXML("methodOverride.xml");
		FruitPlate fp1 = context.getBean("fruitplate1", FruitPlate.class);
		fp1.getFruit();
		FruitPlate fp2 = context.getBean("fruitplate2", FruitPlate.class);
		fp2.getFruit();
	}

	private static void invokeCustomXML(String oXMLName) {
		context = new ClassPathXmlApplicationContext(oXMLName);
//		Person instance = context.getBean("person", Person.class);
//		System.out.println(instance.getApplicationContext());
//		System.out.println("-------------------------------------");

		// 获取FactoryBean创建的对象
//		Person p2 = (Person) context.getBean("personFactoryBean");
		// 获取FactoryBean本身
//		PersonFactoryBean pb2 = (PersonFactoryBean) context.getBean("&personFactoryBean");
//		System.out.println(p2);
	}

}
