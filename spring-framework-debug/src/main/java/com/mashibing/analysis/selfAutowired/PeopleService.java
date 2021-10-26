package com.mashibing.analysis.selfAutowired;

import org.springframework.stereotype.Service;

/**
 * description  PeopleService <BR>
 * <p>
 * author: zhao.song
 * date: created in 17:00  2021/10/26
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Service
public class PeopleService {

	public void show() {
		System.out.println("self autowired success!!!");
	}
}
