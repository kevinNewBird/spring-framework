package com.mashibing.analysis.selfaware;

/**
 * description  Dog <BR>
 * <p>
 * author: zhao.song
 * date: created in 23:02  2021/11/9
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class Dog implements MyAware {


	@Override
	public void setMyAware(String name) {
		System.out.println(name);
	}
}
