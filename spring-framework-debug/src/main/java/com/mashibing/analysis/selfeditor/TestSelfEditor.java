package com.mashibing.analysis.selfeditor;

import com.mashibing.analysis.ContextHelper;
import com.mashibing.analysis.selftag.User;
import org.springframework.context.ApplicationContext;

/**
 * description  TestSelfEditor <BR>
 * <p>
 * author: zhao.song
 * date: created in 21:31  2021/11/9
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestSelfEditor {

	public static void main(String[] args) {
		ApplicationContext ac = ContextHelper.invokeCustomXML("selfeditor.xml");
		Customer customer = ac.getBean(Customer.class);
		System.out.println(customer);
	}
}
