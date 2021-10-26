package com.mashibing.analysis.selfAutowired;

import org.springframework.stereotype.Controller;

/**
 * description  PeopleController <BR>
 * <p>
 * author: zhao.song
 * date: created in 16:59  2021/10/26
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Controller
public class PeopleController {

	@SelfAutowired
	private PeopleService peopleService;

	public void check() {
		peopleService.show();
	}
}
