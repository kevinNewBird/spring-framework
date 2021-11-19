package com.mashibing.analysis.instanceCreation.methodOverride.lookup;

import com.mashibing.analysis.ContextHelper;
import com.mashibing.analysis.instanceCreation.methodOverride.lookup.FruitPlate;
import org.springframework.context.ApplicationContext;

/**
 * description  TestLookupOfMethodOverride <BR>
 * <p>
 * author: zhao.song
 * date: created in 11:33  2021/11/18
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestLookupOfMethodOverride {

	public static void main(String[] args) {
		ApplicationContext ac = ContextHelper.invokeCustomXML("lookup_methodOverride.xml");
		//1. look-up标签下验证
		//获取到的是动态代理对象
		FruitPlate fp1 = ac.getBean("fruitplate1", FruitPlate.class);
		// CglibSubclassingInstantiationStrategy.LookupOverrideMethodInterceptor.intercept()
		fp1.getFruit();
		FruitPlate fp2 = ac.getBean("fruitplate2", FruitPlate.class);
		fp2.getFruit();



		// 2.常规的单例对象引入多例的验证
		FruitBasket basket = ac.getBean(FruitBasket.class);
		System.out.println(basket.getApple());
		System.out.println(basket.getApple());
	}
}
