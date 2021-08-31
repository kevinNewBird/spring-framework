package com.mashibing.analysis.selfaware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;

import java.security.AccessControlContext;

/**
 * description  MyAwareProcessor <BR>
 * <p>
 * author: zhao.song
 * date: created in 15:09  2021/8/31
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class MyAwareProcessor implements BeanPostProcessor {


	public MyAwareProcessor() {
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (!(bean instanceof MyAware)) {
			return bean;
		}

		invokeAwareInterfaces(bean);
		return bean;
	}

	private void invokeAwareInterfaces(Object bean) {
		if (bean instanceof MyAware) {
			((MyAware) bean).setMyAware("myAware test");
		}
	}
}
