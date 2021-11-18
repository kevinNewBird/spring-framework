package com.mashibing.analysis.selfbdrpp;

import com.mashibing.analysis.ContextHelper;
import org.springframework.context.ApplicationContext;

/**
 * description  TestBDRPP <BR>
 * <p>
 * author: zhao.song
 * date: created in 8:39  2021/11/11
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestBDRPP {

	public static void main(String[] args) {
		ApplicationContext ac = ContextHelper.invokeCustomXML("selfbdrpp.xml");
		Teacher teacher = ac.getBean(Teacher.class);
	}
}
