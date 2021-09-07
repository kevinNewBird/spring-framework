package com.mashibing.analysis.selfbdrpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.core.PriorityOrdered;

/**
 * description  MyBeanDefinitionRegistryPostProcessor <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:27  2021/9/7
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	/**
	 * description   实现BeanFactoryPostProcessor接口的方法  <BR>
	 *
	 * @param beanFactory:
	 * @return
	 * @author zhao.song  2021/9/7  9:27
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("实现BeanFactoryPostProcessor---" + MyBeanDefinitionRegistryPostProcessor.class.getSimpleName());
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
		System.out.println("实现postProcessBeanDefinitionRegistry---" + MyBeanDefinitionRegistryPostProcessor.class.getSimpleName());
		// 1.方式一:构建器
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(MySelfBeanDefinitionRegistryPostProcessor.class);
		// 1.1. 属性填充,参考doCreateBean方法下的populateBean()
		builder.addPropertyValue("name", "zhangsan");
		AbstractBeanDefinition beanDefinition = builder.getBeanDefinition();
		// 2.方式二: new
//		RootBeanDefinition beanDefinition = new RootBeanDefinition(Teacher.class);
		registry.registerBeanDefinition("teacher", beanDefinition);
	}

}
