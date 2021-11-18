package com.mashibing.analysis.annotationconfig.importion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * description  MyImportV2 <BR>
 * <p>
 * author: zhao.song
 * date: created in 22:53  2021/11/12
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Configuration
@Import(ColorImportSelector.class)
public class MyImportV2 {
	@Autowired
	@Qualifier("com.mashibing.analysis.annotationconfig.importion.White")
	public Color white;
}
