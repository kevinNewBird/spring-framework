package com.mashibing.analysis.aop.proxy.jdk;

/**
 * description  AppleTest <BR>
 * <p>
 * author: zhao.song
 * date: created in 20:46  2021/12/10
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class AppleTest {

	public static void main(String[] args) {
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		ICalculator proxy = CalculatorProxy.getProxy(new AppleCalculator());
		proxy.add(1,1);
		System.out.println(proxy.getClass());
	}
}
