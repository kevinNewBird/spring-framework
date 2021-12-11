package com.mashibing.analysis.aop.proxy.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

/**
 * description  HuaweiTest <BR>
 * <p>
 * author: zhao.song
 * date: created in 20:40  2021/12/10
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class HuaweiTest {

	public static void main(String[] args) {
		//动态代理创建的class文件存储到本地
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "code");
		//通过cglib动态代理获取代理对象的过程，创建调用的对象,在后续创建过程中EnhanceKey的对象，所以在进行enhancer对象创建的时候需要把EnhancerKey（newInstance）对象准备好,恰好这个对象也需要动态代理来生成
		Enhancer enhancer = new Enhancer();
		//设置enhancer对象的父类
		enhancer.setSuperclass(HuaweiCalculator.class);
		//设置enhancer的回调对象
		enhancer.setCallback(new HuaweiCglib());
		//创建代理对象
		HuaweiCalculator myCalculator = (HuaweiCalculator) enhancer.create();
		//通过代理对象调用目标方法
		myCalculator.add(1, 1);
		System.out.println(myCalculator.getClass());
	}
}
