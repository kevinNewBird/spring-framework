package com.mashibing.analysis.supplier;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * description  SupplierBeanFactoryPostProcessor <BR>
 * <p>
 * author: zhao.song
 * date: created in 22:29  2021/10/19
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class SupplierBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	/**
	 * Modify the application context's internal bean factory after its standard
	 * initialization. All bean definitions will have been loaded, but no beans
	 * will have been instantiated yet. This allows for overriding or adding
	 * properties even to eager-initializing beans.
	 *
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException in case of errors
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition user = beanFactory.getBeanDefinition("user");
		GenericBeanDefinition gUser = (GenericBeanDefinition) user;
		gUser.setInstanceSupplier(CreateSupplier::createUser);
		gUser.setBeanClass(User.class);
	}
}
