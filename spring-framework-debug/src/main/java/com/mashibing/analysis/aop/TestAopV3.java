package com.mashibing.analysis.aop;

import com.mashibing.analysis.ContextHelper;
import com.mashibing.analysis.aop.annotation2.SpringConfiguration;
import com.mashibing.analysis.aop.annotation2.ThirdCalculator;
import org.springframework.context.ApplicationContext;

/**
 * description  TestAopV3 <BR>
 * <p>
 * author: zhao.song
 * date: created in 22:03  2021/12/11
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestAopV3 {

	public static void main(String[] args) throws NoSuchMethodException {
		ApplicationContext ac = ContextHelper.invokeByAnnotation(SpringConfiguration.class);
		ThirdCalculator calculator = ac.getBean(ThirdCalculator.class);
		calculator.add(1, 1);
	}
}
