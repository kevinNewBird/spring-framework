package com.mashibing.springstart.contextInitializer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * description  SpringApplicationContextInitializer <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:47  2022/1/1
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class SpringApplicationGlobalInitializer implements ApplicationContextInitializer<XmlWebApplicationContext> {

	private static Log logger = LogFactory.getLog(SpringApplicationGlobalInitializer.class);

	/**
	 * Initialize the given application context.
	 *
	 * @param applicationContext the application to configure
	 */
	@Override
	public void initialize(XmlWebApplicationContext applicationContext) {
		logger.info("globalInitializerClasses属性生效!");
//		applicationContext.setAllowBeanDefinitionOverriding(true);
	}
}
