package com.springframework.analysis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description  BeanContextTestByXMLPlaceHolder <BR>
 * <p>
 * author: zhao.song
 * date: created in 21:33  2021/8/22
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class BeanContextTestByXMLPlaceHolder {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-${username}.xml");
	}
}
