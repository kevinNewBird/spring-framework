package com.mashibing.analysis.annotationconfig.importion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * description  MyImport <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:53  2021/11/12
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Configuration
@Import({Red.class, Blue.class})
public class MyImport {

	@Autowired
	@Qualifier("com.mashibing.analysis.annotationconfig.importion.Red")
	public Color red;

	@Autowired
	@Qualifier("com.mashibing.analysis.annotationconfig.importion.Blue")
	public Color blue;
}
