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
public class AutowireConstructorTestV4 {


	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) ContextHelper
				.invokeCustomXML("reflect-autowireConstructor4.xml");

		// 使用注解的方式
		PersimmonV2 persimmon = context.getBean(PersimmonV2.class);
		// 验证@PostContruct / @PreDestroy
		persimmon.show();
		// 验证@Resource
		persimmon.show2();
		// 验证 @Autowired
		persimmon.show3();
		context.close();
	}

}
