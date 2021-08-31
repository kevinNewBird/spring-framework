package com.mashibing.analysis.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * description  Person <BR>
 * <p>
 * author: zhao.song
 * date: created in 14:53  2021/6/23
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class Person implements ApplicationContextAware, EnvironmentAware, BeanNameAware {
	private ApplicationContext applicationContext;

	private String beanName;

	private int id;

	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void init() {
		System.out.println("init");
	}

	public Person() {
		System.out.println("Person 初始化构造!!!");
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * Set the {@code Environment} that this component runs in.
	 *
	 * @param environment
	 */
	@Override
	public void setEnvironment(Environment environment) {

	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	public void show() {
		System.out.println(this.beanName);
		this.applicationContext.getAliases(this.beanName);
	}


}
