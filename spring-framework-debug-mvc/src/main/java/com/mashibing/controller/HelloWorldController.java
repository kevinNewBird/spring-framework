package com.mashibing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description  HelloWorldController <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:55  2021/12/27
 * company: TRS信息技术有限公司
 * version 1.0
 */
@RestController
//@RequestMapping("/mvc")
public class HelloWorldController {

	@RequestMapping("/hello")
	public String say() {
		return "hello world!!!";
	}
}
