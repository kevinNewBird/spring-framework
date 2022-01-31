package com.mashibing.adapter.controllerAdvice;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * description  ControllerAdviceController <BR>
 * <p>
 * author: zhao.song
 * date: created in 15:17  2022/1/18
 * company: TRS信息技术有限公司
 * version 1.0
 */
@ControllerAdvice
public class ControllerAdviceController {

	//全局异常处理
    @ExceptionHandler(Exception.class)
    public ModelAndView customerException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message",e.getMessage());
        mv.setViewName("myerror");
        return mv;
    }

	// 全局数据绑定
	@ModelAttribute(name="md")// 表示返回的数据model -- key:md, value:Map<String,Object>
	public Map<String,Object> mydata(){
		HashMap<String,Object> map = new HashMap<>();
		map.put("age",99);
		map.put("gender","男");
		return map;
	}

	@InitBinder("a")
	public void a(WebDataBinder binder){
		binder.setFieldDefaultPrefix("a.");
	}

	@InitBinder("b")
	public void b(WebDataBinder binder){
		binder.setFieldDefaultPrefix("b.");
	}

}
