package com.mashibing.analysis.selftag;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description  MyService <BR>
 * <p>
 * author: zhao.song
 * date: created in 10:31  2021/9/8
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Configuration
public class MyService {

	@Bean
	public String show() {
		return "msb";
	}
}
