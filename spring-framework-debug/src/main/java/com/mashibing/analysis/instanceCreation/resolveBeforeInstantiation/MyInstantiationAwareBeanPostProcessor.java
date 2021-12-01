package com.mashibing.analysis.instanceCreation.resolveBeforeInstantiation;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;

/**
 * description  BeforeInstantiationAwarePostProcessor <BR>
 * <p>
 * author: zhao.song
 * date: created in 16:38  2021/10/18
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	/**
	 * description   实例化之前  <BR>
	 *
	 * @param beanClass:
	 * @param beanName:
	 * @return {@link Object}
	 * @author zhao.song  2021/10/18  16:42
	 */
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("beanName:" + beanName + " ,执行postProcessBeforeInstantiation方法");
		if (beanClass == BeforeInstantiation.class) {
			Enhancer enhancer = new Enhancer();
			enhancer.setSuperclass(beanClass);
			enhancer.setCallback(new MyMethodInterceptor());
			BeforeInstantiation bi = (BeforeInstantiation) enhancer.create();
			System.out.println("创建代理对象:" + bi);
			return bi;
		}
		return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
	}

	/**
	 * description   实例化之后  <BR>
	 *
	 * @param bean:
	 * @param beanName:
	 * @return {@link Object}
	 * @author zhao.song  2021/10/18  16:42
	 */
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("beanName:" + beanName + " ,执行postProcessAfterInstantiation");
		return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
	}

	/**
	 * description   初始化之前  <BR>
	 *
	 * @param bean:
	 * @param beanName:
	 * @return {@link Object}
	 * @author zhao.song  2021/10/18  16:43
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("beanName:" + beanName + " ,执行postProcessBeforeInitialization");
		return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	/**
	 * description   初始化之后  <BR>
	 *
	 * @param bean:
	 * @param beanName:
	 * @return {@link Object}
	 * @author zhao.song  2021/10/18  16:43
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("beanName:" + beanName + " ,执行postProcessAfterInitialization");
		return InstantiationAwareBeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		System.out.println("beanName:" + beanName + " ,执行postProcessProperties");
		return pvs;
	}
}
