package com.mashibing.analysis.annotationconfig.shouldSkip;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;
import sun.nio.cs.ext.EUC_JP_LINUX;

/**
 * description  WindowsCondition <BR>
 * <p>
 * author: zhao.song
 * date: created in 10:41  2021/9/8
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class WindowsCondition implements Condition {
	/**
	 * Determine if the condition matches.
	 *
	 * @param context  the condition context
	 * @param metadata metadata of the {@link AnnotationMetadata class}
	 *                 or {@link MethodMetadata method} being checked
	 * @return {@code true} if the condition matches and the component can be registered,
	 * or {@code false} to veto the annotated component's registration
	 */
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// 获取ioc使用的beanFactory
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		// 获取类加载器
		ClassLoader classLoader = context.getClassLoader();
		// 获取当前环境信息
		Environment environment = context.getEnvironment();
		// 获取bean定义的注册类
		BeanDefinitionRegistry registry = context.getRegistry();
		// 获取当前系统名
		String property = environment.getProperty("os.name");
		String os = System.getProperty("os.name");
		// 包含windows则说明是windows系统,返回true
		if (property.contains("Windows")) {
			return true;
		}

		return false;
	}
}
