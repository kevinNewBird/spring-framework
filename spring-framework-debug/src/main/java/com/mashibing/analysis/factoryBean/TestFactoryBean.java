package com.mashibing.analysis.factoryBean;

import com.mashibing.analysis.ContextHelper;
import org.springframework.context.ApplicationContext;

/**
 * description  TestFactoryBean <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:20  2021/11/17
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestFactoryBean {

	public static void main(String[] args) throws Exception {
		ApplicationContext ac = ContextHelper.invokeCustomXML("factoryBean.xml");
//		PersonFactoryBean pfb = ac.getBean("&personFB", PersonFactoryBean.class);
//		Person p0 = pfb.getObject();

		Person p1 = ac.getBean("personFB", Person.class);
		Person p2 = ac.getBean("personFB", Person.class);

	}
}
