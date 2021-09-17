package com.mashibing.analysis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * description  MyPropertySource <BR>
 * <p>
 * author: zhao.song
 * date: created in 10:29  2021/9/8
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Configuration
@PropertySource("classpath:myconfig2.properties")
public class MyPropertySource {
	@Value("${myconfig2.name}")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
