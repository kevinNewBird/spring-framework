package com.mashibing.adapter.responsebodyAdvice;

import com.mashibing.adapter.initbinder.pojo.User;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * description  MyResponseBodyAdvice <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:09  2022/1/21
 * company: TRS信息技术有限公司
 * version 1.0
 */
// 控制其是否生效！
//@ControllerAdvice
public class MyResponseBodyAdvice implements ResponseBodyAdvice<Doggy> {


	@Override
	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
		return true;
	}

	@Override
	public Doggy beforeBodyWrite(Doggy body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
		return body;
	}
}
