package com.mashibing.analysis.tx.xml;

import com.mashibing.analysis.ContextHelper;
import com.mashibing.analysis.tx.xml.dao.GlassDao;
import com.mashibing.analysis.tx.xml.service.GlassService;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;

/**
 * description  TestTxV1 <BR>
 * <p>
 * author: zhao.song
 * date: created in 8:45  2021/12/13
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestTxV1 {


	public static void main(String[] args) {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "code");
		ApplicationContext ac = ContextHelper.invokeCustomXML("tx.xml");
		// 无事务管理方法getPrice执行流程
//		GlassDao glassDao = ac.getBean(GlassDao.class);
//		System.out.println(glassDao.getPrice(1));

		// 事务管理的checkOut方法验证, 事务传播性验证
		GlassService glassService = ac.getBean(GlassService.class);
		glassService.checkout("kevin", 1);
	}
}
