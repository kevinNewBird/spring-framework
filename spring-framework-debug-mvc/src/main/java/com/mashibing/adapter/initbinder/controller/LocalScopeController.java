package com.mashibing.adapter.initbinder.controller;

import com.mashibing.adapter.initbinder.pojo.Student;
import com.mashibing.adapter.initbinder.pojo.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * description  局部范围生效的注解 <BR>
 * <p>
 * author: zhao.song
 * date: created in 11:35  2022/1/18
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Controller
@RequestMapping("/local")
public class LocalScopeController {

	/**
	 * InitBinder注解作用于Controller中的方法，表示为当前控制器注册一个属性编辑器
	 * 对webDataBinder进行初始化且只对当前的Controller有效
	 * <br/>
	 * 对应getDataBinderFactory方法
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		CustomDateEditor dateEditor = new CustomDateEditor(df, true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}

	@ModelAttribute("buser")
	public User getUser() {
		User user = new User();
		user.setAge(20);
		user.setName("buser");
		return user;
	}


	// 属性编辑器

	/**
	 * description   验证属性编辑器/@ModelAttribute  <BR>
	 *
	 * @param date:
	 * @param map:
	 * @param user:
	 * @return {@link String}
	 * @author zhao.song  2022/1/19  13:36
	 */
	@RequestMapping("/param")
	public String getFormatDate(Date date, Map<String, Object> map, @ModelAttribute("buser") User user) {
		System.out.println(date);
		map.put("name", "zhangsan");
		map.put("age", 12);
		map.put("date", date);
		System.out.println("map:" + map);
		System.out.println("buser:" + user);
		return "success";
	}

	/**
	 * description   验证@SessionAttributes和@ModelAttribute组合  <BR>
	 *
	 * @param map:
	 * @param session:
	 * @return {@link String}
	 * @author zhao.song  2022/1/19  13:36
	 */
	@RequestMapping("/user")
	public String sessionUser(Map<String, Object> map, HttpSession session) {
		// 1.定义在@SessionAttributes的controller中
		System.out.println("map suser:" + map.get("suser"));
		// 2.定义在简单的LocalScopeController本地的局部数据
		System.out.println("map buser:" + map.get("buser"));
		// 3.定义在@ControllerAdvice
		System.out.println("session:" + session.getAttribute("suser"));
		return "success";
	}

	// 参数绑定
	@InitBinder("user")
	public void init1(WebDataBinder binder) {
		// 设置属性默认的前缀
		binder.setFieldDefaultPrefix("u.");
	}

	@InitBinder("stu")
	public void init2(WebDataBinder binder) {
		binder.setFieldDefaultPrefix("s.");
	}

	@RequestMapping("/getBean")
	public ModelAndView getBean(User user, @ModelAttribute("stu") Student stu) {
		System.out.println(stu);
		System.out.println(user);
		String viewName = "success";
		ModelAndView modelAndView = new ModelAndView(viewName);
		modelAndView.addObject("user", user);
		modelAndView.addObject("student", stu);
		return modelAndView;
	}
}
