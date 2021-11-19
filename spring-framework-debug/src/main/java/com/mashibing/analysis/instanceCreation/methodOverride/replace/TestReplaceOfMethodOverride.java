package com.mashibing.analysis.instanceCreation.methodOverride.replace;

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
public class TestReplaceOfMethodOverride {

	public static void main(String[] args) {
		ApplicationContext ac = ContextHelper.invokeCustomXML("replace_methodOverride.xml");
		MethodBean originMethod = ac.getBean(MethodBean.class);
		originMethod.test();
	}
}
