package com.mashibing.exceptionHandler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Nonnull;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * description  ExceptionHandlerController <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:56  2022/1/21
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Controller
public class ExceptionHandlerController {


	/**
	 * 需要开启 MyExceptionHandlerExceptionResolver
	 *
	 */

	@RequestMapping("/exception")
	public ModelAndView exception(ModelAndView view) throws ClassNotFoundException {
		view.setViewName("index");
		throw new ClassNotFoundException("class not found");
	}

	/**
	 * description   500异常  <BR>
	 *
	  * @param view:
	 * @return {@link ModelAndView}
	 * @author zhao.song  2022/1/21  10:42
	 */
	@RequestMapping("/npe")
	public ModelAndView npe(ModelAndView view) {
		view.setViewName("index");
		String str = null;
		// 空指针异常
		str.length();
		return view;
	}

	@ExceptionHandler(RuntimeException.class)
	public ModelAndView error(RuntimeException error, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("error");
		mav.addObject("msg", "Runtime error");
		return mav;
	}

	@ExceptionHandler()
	public ModelAndView error(Exception error, HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("error");
		mav.addObject("msg", "Exception error");
		return mav;
	}


	/**
	 * description   找不到合适的参数处理器，抛出异常，导致ExceptionHandler执行失败  <BR>
	 *
	 *     (***)如果要使该捕捉被正常执行，开启 MyExceptionHandlerExceptionResolver
	 *
	  * @param mav:
	 * @return {@link ModelAndView}
	 * @author zhao.song  2022/1/21  10:39
	 */
    @ExceptionHandler(NullPointerException.class)
    public ModelAndView error( ModelAndView mav) {
		// 这种方式必须自定义MyExceptionHandlerExceptionResolver将参数设置进来
		// 第二种方式，直接创建：  ModelAndView mav = new ModelAndView()
        mav.setViewName("error");
        mav.addObject("msg", "NullPointer error");
        return mav;
    }

	public static void main(String[] args) {
		test(null);
	}

	private static void test(@Nonnull String s) {
		System.out.println(s);
	}
}
