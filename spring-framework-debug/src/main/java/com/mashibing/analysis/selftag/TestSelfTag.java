package com.mashibing.analysis.selftag;

import com.mashibing.analysis.ContextHelper;
import org.springframework.context.ApplicationContext;

/**
 * description  TestSelfTag <BR>
 * <p>
 * author: zhao.song
 * date: created in 20:53  2021/11/9
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestSelfTag {

	public static void main(String[] args) {
		ApplicationContext ac = ContextHelper.invokeCustomXML("selftag.xml");
		User user = ac.getBean(User.class);
		System.out.println(user);

	}
}
