package com.mashibing.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * description  HandlerMappingInterceptor <BR>
 * <p>
 * author: zhao.song
 * date: created in 10:06  2022/1/17
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class HandlerMappingInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("HandlerInterceptor拦截器前置处理");
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		System.out.println("HandlerInterceptor拦截器后置处理");
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
}
