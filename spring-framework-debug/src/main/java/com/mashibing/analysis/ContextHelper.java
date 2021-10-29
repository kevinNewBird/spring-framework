package com.mashibing.analysis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description  ContextHelper <BR>
 * <p>
 * author: zhao.song
 * date: created in 8:58  2021/10/29
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class ContextHelper {

	public static ApplicationContext invokeCustomXML(String oXMLName) {
		return new ClassPathXmlApplicationContext(oXMLName);
	}
}
