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
public class AutowireConstructorTestV2 {


	public static void main(String[] args) {
		ApplicationContext context = ContextHelper
				.invokeCustomXML("reflect-autowireConstructor2.xml");

		Apple p1 = context.getBean(Apple.class);

		Apple p2 = context.getBean(Apple.class);


	}

}
