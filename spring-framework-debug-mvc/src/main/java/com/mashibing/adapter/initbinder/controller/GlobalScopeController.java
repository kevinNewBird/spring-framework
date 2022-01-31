package com.mashibing.adapter.initbinder.controller;

import com.mashibing.adapter.initbinder.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * description  全局范围生效的注解 <BR>
 * <p>
 * author: zhao.song
 * date: created in 12:30  2022/1/19
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Controller
@RequestMapping("/global")
@SessionAttributes("suser")// 通过session可以在别的controller中被获取到；但是如果是通过@ModelAttribute，则只会在本类生效。
public class GlobalScopeController {

	@RequestMapping("/user")
	public String sessionUser(Map<String, Object> map, @ModelAttribute("suser") User user, HttpSession session) {

		System.out.println("user:" +user);
		// 1.定义在@SessionAttributes的controller中
		System.out.println("map suser:" + map.get("suser"));
		// 2.定义在简单的LocalScopeController本地的局部数据
		System.out.println("map buser:" + map.get("buser"));
		// 3.定义在@ControllerAdvice
		System.out.println("map md:" + map.get("md"));
		//session获取不到suser,因为此时会话还没建立
		System.out.println("session:" + session.getAttribute("suser"));
		return "success";
	}

	@ModelAttribute("suser")
	public User getUser() {
		User user = new User();
		user.setAge(17);
		user.setName("tomy");
		return user;
	}
}
