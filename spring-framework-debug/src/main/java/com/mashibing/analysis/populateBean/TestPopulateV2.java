package com.mashibing.analysis.populateBean;

import com.mashibing.analysis.ContextHelper;
import org.springframework.context.ApplicationContext;

/**
 * description  TestPopulate <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:15  2021/10/26
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestPopulateV2 {


	public static void main(String[] args) {
		ApplicationContext context = ContextHelper.invokeCustomXML("populateBean2.xml");
		Human p1 = context.getBean(Human.class);
		System.out.println(p1);
	}

}
