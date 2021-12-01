package com.mashibing.analysis.instanceCreation.factoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * description  PersonFactoryBean <BR>
 * <p>
 * author: zhao.song
 * date: created in 17:07  2021/7/27
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class PersonFactoryBean implements FactoryBean<Person> {

	public Person getObject() throws Exception {
		return new Person(1, "factoryBean--小花");
	}


	@Override
	public Class<?> getObjectType() {
		return Person.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
