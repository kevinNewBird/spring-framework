package com.mashibing.analysis.instanceCreation.resolveBeforeInstantiation;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * description  MyMethodInterceptor <BR>
 * <p>
 * author: zhao.song
 * date: created in 16:48  2021/10/18
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class MyMethodInterceptor implements MethodInterceptor {


	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("目标方法执行之前:" + method);
		Object o1 = methodProxy.invokeSuper(o, objects);
		System.out.println("目标方法执行之后:" + method);
		return o1;
	}
}
