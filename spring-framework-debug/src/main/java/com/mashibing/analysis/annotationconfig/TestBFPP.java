package com.mashibing.analysis.annotationconfig;

import com.mashibing.analysis.ContextHelper;
import com.mashibing.analysis.annotationconfig.importion.MyImport;
import com.mashibing.analysis.annotationconfig.importion.MyImportV2;
import org.springframework.context.ApplicationContext;

/**
 * description  TestBFPP <BR>
 * <p>
 * author: zhao.song
 * date: created in 16:00  2021/11/11
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestBFPP {

	/**
	 * 验证注解  invokeBeanFactoryPostProcessors 方法的执行流程
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = ContextHelper.invokeCustomXML("annotationconfig.xml");
//		MyImport mi = ac.getBean(MyImport.class);
//		mi.red.myColor();
//		mi.blue.myColor();

		MyImportV2 mi2 = ac.getBean(MyImportV2.class);
		mi2.white.myColor();
	}
}
