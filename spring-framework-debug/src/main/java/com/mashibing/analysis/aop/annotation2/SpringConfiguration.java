package com.mashibing.analysis.aop.annotation2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * description  SpringConfiguration <BR>
 * <p>
 * author: zhao.song
 * date: created in 22:02  2021/12/11
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.mashibing.analysis.aop.annotation2")
@EnableAspectJAutoProxy
public class SpringConfiguration {

}
