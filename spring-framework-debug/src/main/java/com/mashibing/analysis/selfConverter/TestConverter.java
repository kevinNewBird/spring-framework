package com.mashibing.analysis.selfConverter;

import com.mashibing.analysis.ContextHelper;
import org.springframework.context.ApplicationContext;

/**
 * description  TestConverter <BR>
 * <p>
 * author: zhao.song
 * date: created in 11:23  2021/11/17
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestConverter {

	public static void main(String[] args) {
		ApplicationContext ac = ContextHelper.invokeCustomXML("selfConverter.xml");
		People people = ac.getBean(People.class);
		System.out.println(people);
	}
}
