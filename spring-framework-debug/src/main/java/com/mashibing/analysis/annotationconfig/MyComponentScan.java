package com.mashibing.analysis.annotationconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * description  MyComponentScan <BR>
 * <p>
 * author: zhao.song
 * date: created in 10:28  2021/9/8
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Configuration
@ComponentScan("com.mashibing.analysis.selftag")
public class MyComponentScan {

	@ComponentScan("com.mashibing.analysis.selftag")
	@Configuration
	@Order(90)
	class InnerClass {

		@ComponentScan("com.mashibing.analysis.selftag")
		@Configuration
		@Order(91)
		class InnerInnerClass {

		}
	}
}
