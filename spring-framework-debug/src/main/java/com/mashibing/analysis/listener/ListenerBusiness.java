package com.mashibing.analysis.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * description  ListenerBusiness <BR>
 * <p>
 * author: zhao.song
 * date: created in 11:20  2021/11/15
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class ListenerBusiness implements ApplicationListener<ContextRefreshedEvent> {
	/**
	 * Handle an application event.
	 *
	 * @param evt the event to respond to
	 */
	@Override
	public void onApplicationEvent(ContextRefreshedEvent evt) {
		/**
		 * 在web项目中,系统会存在两个容器,一个是root application context
		 * ,另一个就是我们自己的projectName-servlet context(作为root application context的子容器)
		 */
		if (evt.getApplicationContext().getParent() == null) {
			doBusiness();
		}
	}

	public void doBusiness() {
		System.out.println("启动监听类开始启动....");
	}
}
