package com.mashibing.analysis.instanceCreation.factoryMethod;

import com.mashibing.analysis.ContextHelper;
import com.mashibing.analysis.instanceCreation.factoryMethod.Animal;
import org.springframework.context.ApplicationContext;
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



	public static void main(String[] args) {
		ApplicationContext ac = ContextHelper.invokeCustomXML("factoryMethod.xml");
		Animal dog = ac.getBean("dog", Animal.class);
		Animal cat = ac.getBean("cat", Animal.class);

		System.out.println(dog);
		System.out.println(cat);

		Map<String, Animal> beansOfType = ac.getBeansOfType(Animal.class);
		System.out.println(beansOfType);
	}

}
