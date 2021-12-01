package com.mashibing.analysis.instanceCreation.reflection.constructor.noargs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * description  Persimmon <BR>
 * <p>
 * author: zhao.song
 * date: created in 16:30  2021/11/24
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Component
public class PersimmonV2 {

	@Resource
	private Tomato tomato;

	@Autowired
	private Potato potato;

	@PostConstruct
	public void init() {
		System.out.println(" v2 初始化方法....");
	}

	public void show() {
		System.out.println(" 本类show方法执行");
	}

	public void show2() {
		tomato.show();
	}

	public void show3() {
		potato.show();
	}

	public PersimmonV2() {
		System.out.println(" persimmon v2 构造方法...");
	}

	@PreDestroy
	public void destroy() {
		System.out.println(" v2 销毁方法...");
	}
}
