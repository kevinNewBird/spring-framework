package com.mashibing.analysis.instanceCreation.methodOverride.replace;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * description  MethodBean <BR>
 * <p>
 * author: zhao.song
 * date: created in 13:33  2021/11/18
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class MethodBeanReplace implements MethodReplacer {

	private Object obj2 = new Object();

	/**
	 * Reimplement the given method.
	 *
	 * @param obj    the instance we're reimplementing the method for
	 * @param method the method to reimplement
	 * @param args   arguments to the method
	 * @return return value for the method
	 */
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("方法已经被替换" + obj2.toString());
		System.out.println("方法已经被替换2" + new Object().toString());
		return null;
	}
}
