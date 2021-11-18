package com.mashibing.analysis.bpparse;

import com.mashibing.analysis.ContextHelper;
import org.springframework.context.ApplicationContext;

/**
 * description  TestBPParse <BR>
 * <p>
 * author: zhao.song
 * date: created in 15:59  2021/11/10
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestBPParse {

	public static void main(String[] args) {
		ApplicationContext ac = ContextHelper.invokeCustomXML("bpparse.xml");
		Grass grass = ac.getBean(Grass.class);
	}
}
