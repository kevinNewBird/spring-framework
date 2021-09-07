package com.mashibing.analysis.selfbdrpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;

/**
 * description  MyBeanDefinitionRegistryPostProcessor <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:27  2021/9/7
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class MySelfBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	/**
	 * description   实现BeanFactoryPostProcessor接口的方法  <BR>
	 *
	 * @param beanFactory:
	 * @return
	 * @author zhao.song  2021/9/7  9:27
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("实现BeanFactoryPostProcessor---" + MySelfBeanDefinitionRegistryPostProcessor.class.getSimpleName());
	}


	/**
	 * description   实现BeanDefinitionRegistryPostProcessor接口的方法  <BR>
	 *
	 * @param registry:
	 * @return
	 * @author zhao.song  2021/9/7  9:28
	 */
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("实现postProcessBeanDefinitionRegistry---" + MySelfBeanDefinitionRegistryPostProcessor.class.getSimpleName());
	}


	@Override
	public int getOrder() {
		return 0;
	}
}
