package com.mashibing.analysis.selfaware;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description  MyClassPathXmlApplicationContext <BR>
 * <p>
 * author: zhao.song
 * date: created in 15:32  2021/8/25
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class MyAwareClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyAwareClassPathXmlApplicationContext(String... configLocations) {
		super(configLocations);

	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.customizeBeanFactory(beanFactory);
		// 添加自定义的Aware
		beanFactory.addBeanPostProcessor(new MyAwareProcessor());
	}
}
