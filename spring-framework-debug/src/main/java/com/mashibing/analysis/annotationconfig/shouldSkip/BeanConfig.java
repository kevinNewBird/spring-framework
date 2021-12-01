package com.mashibing.analysis.annotationconfig.shouldSkip;

import com.mashibing.analysis.instanceCreation.factoryBean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * description  BeanConfig <BR>
 * <p>
 * author: zhao.song
 * date: created in 10:39  2021/9/8
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Conditional(WindowsCondition.class)
@Configuration
public class BeanConfig {

	@Bean("bill")
	public Person person1(){
		return new Person(62, "Bill Gates");
	}

	@Bean("linus")
	public Person person2(){
		return new Person(48, "Linus");
	}
}
