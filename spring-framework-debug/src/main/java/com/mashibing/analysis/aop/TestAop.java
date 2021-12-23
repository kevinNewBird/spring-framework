package com.mashibing.analysis.aop;

import com.mashibing.analysis.ContextHelper;
import com.mashibing.analysis.aop.xml.MyCalculator;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;

/**
 * description  TestAop <BR>
 * <p>
 * author: zhao.song
 * date: created in 8:57  2021/10/29
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestAop {

	public static void main(String[] args) throws NoSuchMethodException {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "code");
		ApplicationContext ac = ContextHelper.invokeCustomXML("aop.xml");
		MyCalculator calc = ac.getBean(MyCalculator.class);
		Integer result = calc.add(1, 1);
		System.out.println(result);
	}
}
