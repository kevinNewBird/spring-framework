package com.mashibing.analysis.instanceCreation.reflection.constructor.args;

import com.mashibing.analysis.ContextHelper;
import org.springframework.context.ApplicationContext;

/**
 * description  TestAutowireConstructor <BR>
 * <p>
 * author: zhao.song
 * date: created in 10:33  2021/10/21
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class AutowireConstructorTest {


	public static void main(String[] args) {
		ApplicationContext context = ContextHelper
				.invokeCustomXML("reflect-autowireConstructor.xml");
		// 第一次不会进入autowireConstructor方法,
		// 第一次对象没有创建BeanDefinition没有缓存构造器,resolved=false直接跳过
		Banana b11 = context.getBean("banana1", Banana.class);
		//第二次才进入
		Banana b12 = context.getBean("banana1", Banana.class);

		Banana b21 = context.getBean("banana2", Banana.class);
		Banana b22 = context.getBean("banana2", Banana.class);
	}

}
