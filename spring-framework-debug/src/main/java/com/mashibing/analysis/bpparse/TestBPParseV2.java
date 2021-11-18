package com.mashibing.analysis.bpparse;

import com.mashibing.analysis.ContextHelper;
import org.springframework.context.ApplicationContext;

/**
 * description  TestBPParseV2 <BR>
 * <p>
 * author: zhao.song
 * date: created in 16:22  2021/11/10
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestBPParseV2 {

	/**
	 * component-scan验证
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext ac = ContextHelper.invokeCustomXML("bpparsev2.xml");
		GrassV2 grass = ac.getBean(GrassV2.class);
	}
}
