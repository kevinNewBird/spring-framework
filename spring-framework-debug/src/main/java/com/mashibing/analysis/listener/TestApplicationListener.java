package com.mashibing.analysis.listener;

import com.mashibing.analysis.ContextHelper;
import com.mashibing.analysis.bpparse.GrassV3;
import org.springframework.context.ApplicationContext;

/**
 * description  TestBFPP <BR>
 * <p>
 * author: zhao.song
 * date: created in 23:04  2021/11/10
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestApplicationListener {


	/**
	 * property-placeholder 验证
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = ContextHelper.invokeCustomXML("listener.xml");

	}
}
