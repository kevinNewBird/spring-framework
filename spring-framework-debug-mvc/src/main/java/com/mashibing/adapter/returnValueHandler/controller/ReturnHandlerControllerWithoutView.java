package com.mashibing.adapter.returnValueHandler.controller;

import com.mashibing.adapter.responsebodyAdvice.Doggy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description  返回值处理器（没有视图） <BR>
 * <p>
 * author: zhao.song
 * date: created in 8:23  2022/1/21
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Controller
@RequestMapping("/view")
public class ReturnHandlerControllerWithoutView {

	@RequestMapping(value = "/doggy",produces = "application/xml")
	@ResponseBody
	public Doggy getDoggyWithoutView() {
		Doggy doggy = new Doggy();
		doggy.setAge(35);
		doggy.setName("withoutView");
		return doggy;
	}

	@RequestMapping(value = "/doggy2")
	@ResponseBody
	public Doggy getDoggy2WithoutView() {
		Doggy doggy = new Doggy();
		doggy.setAge(45);
		doggy.setName("withoutView2");
		return doggy;
	}
}
