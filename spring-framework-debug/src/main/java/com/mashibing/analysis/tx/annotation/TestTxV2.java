package com.mashibing.analysis.tx.annotation;

import com.mashibing.analysis.ContextHelper;
import com.mashibing.analysis.tx.annotation.config.TransactionConfig;
import com.mashibing.analysis.tx.annotation.dao.GlassDaoV2;
import org.springframework.context.ApplicationContext;

/**
 * description  TestTxV2 <BR>
 * <p>
 * author: zhao.song
 * date: created in 20:55  2021/12/13
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class TestTxV2 {

	public static void main(String[] args) {
		ApplicationContext ac = ContextHelper.invokeByAnnotation(TransactionConfig.class);
		GlassDaoV2 glassDao = ac.getBean(GlassDaoV2.class);
		int price = glassDao.getPrice(1);
		System.out.println(price);
	}
}
