package com.mashibing.controller;

import com.mashibing.pojo.Monkey;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Collections;

/**
 * description  ModelController <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:07  2021/12/30
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Controller
public class UserModelController {

	/**
	 * description   使用model  <BR>
	 *
	  * @param model:
	 * @return {@link String}
	 * @author zhao.song  2021/12/30  9:20
	 */
	@RequestMapping("/userlist.do")
	public String showUserList(Model model) {
		ArrayList<Monkey> list = new ArrayList<>();
		Monkey u1 = new Monkey("张三", 12);
		Monkey u2 = new Monkey("李四", 62);

		Collections.addAll(list, u1, u2);
		model.addAttribute("users", list);
		//设置访问的页面
		return "userlist";
	}

	/**
	 * description   使用ModelAndView  <BR>
	 *
	  * @param :
	 * @return {@link ModelAndView}
	 * @author zhao.song  2021/12/30  9:20
	 */
	@RequestMapping("/userlist2.do")
	public ModelAndView showUserList2() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("userlist");//设置访问的页面

		ArrayList<Monkey> list = new ArrayList<>();
		Monkey u1 = new Monkey("张三2", 122);
		Monkey u2 = new Monkey("李四2", 622);

		Collections.addAll(list, u1, u2);
		mav.addObject("users", list);
		return mav;
	}
}
