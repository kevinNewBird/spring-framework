package com.mashibing.analysis.instanceCreation.reflection.constructor.noargs;

import com.mashibing.analysis.ContextHelper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description  TestAutowireConstructor <BR>
 * <p>
 * author: zhao.song
 * date: created in 10:33  2021/10/21
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class AutowireConstructorTestV3 {


	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) ContextHelper
				.invokeCustomXML("reflect-autowireConstructor3.xml");

		// 使用XML配置的方式
		Persimmon persimmon = context.getBean(Persimmon.class);
		persimmon.show();
		context.close();
	}

}
