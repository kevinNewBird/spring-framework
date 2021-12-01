package com.mashibing.analysis.aop;

import com.mashibing.analysis.ContextHelper;
import com.mashibing.analysis.aop.annotation.SecondCalculator;
import com.mashibing.analysis.aop.base.Calculator;
import com.mashibing.analysis.aop.xml.MyCalculator;
import org.springframework.context.ApplicationContext;

/**
 * description  TestAop <BR>
 * <p>
 * author: zhao.song
 * date: created in 8:57  2021/10/29
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestAopV2 {

	public static void main(String[] args) throws NoSuchMethodException {
		ApplicationContext ac = ContextHelper.invokeCustomXML("aop2.xml");
		Calculator calc = ac.getBean(Calculator.class);
		Integer result = calc.add(1, 1);
		System.out.println(result);
	}
}
