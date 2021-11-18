package com.mashibing.analysis.selftag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * description  UserBeanDefinitionParser <BR>
 * <p>
 * author: zhao.song
 * date: created in 22:15  2021/8/29
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<?> getBeanClass(Element element) {
		// 放回属性值所对应的对象
		return User.class;
	}


	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		// 获取标签具体的属性值
		String id = element.getAttribute("id");
		String userName = element.getAttribute("username");
		String email = element.getAttribute("email");
		String password = element.getAttribute("password");

		if (StringUtils.hasText(id)) {
			builder.addPropertyValue("id",id);
		}

		if (StringUtils.hasText(userName)) {
			builder.addPropertyValue("username",userName);
		}

		if (StringUtils.hasText(email)) {
			builder.addPropertyValue("email", email);
		}

		if (StringUtils.hasText(password)) {
			builder.addPropertyValue("password", password);
		}
	}
}
