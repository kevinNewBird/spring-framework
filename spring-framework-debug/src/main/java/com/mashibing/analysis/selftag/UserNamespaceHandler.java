package com.mashibing.analysis.selftag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * description  UserNamespaceHandler <BR>
 * <p>
 * author: zhao.song
 * date: created in 22:24  2021/8/29
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class UserNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}
}
