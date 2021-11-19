package com.mashibing.analysis.instanceCreation.supplier;

import com.mashibing.analysis.ContextHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description  SupplierTest <BR>
 * <p>
 * author: zhao.song
 * date: created in 22:37  2021/10/19
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class SupplierTest {




	public static void main(String[] args) {
		ApplicationContext ac = ContextHelper.invokeCustomXML("supplier.xml");
		User user = ac.getBean(User.class);
		System.out.println(user);
	}


}
