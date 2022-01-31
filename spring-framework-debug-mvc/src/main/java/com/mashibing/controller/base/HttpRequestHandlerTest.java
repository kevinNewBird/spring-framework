package com.mashibing.controller.base;

import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * description  HttpRequestHandlerTest <BR>
 * <p>
 * author: zhao.song
 * date: created in 9:08  2022/1/16
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Component("/hrhtest")
public class HttpRequestHandlerTest implements HttpRequestHandler {
	/**
	 * Process the given request, generating a response.
	 *
	 * @param request  current HTTP request
	 * @param response current HTTP response
	 * @throws ServletException in case of general errors
	 * @throws IOException      in case of I/O errors
	 */
	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.write("<!DOCTYPE html>\n" +
				"<html lang=\"en\" xmlns=\"http://www.w3.org/1999/html\">\n" +
				"<head>\n" +
				"    <meta charset=\"UTF-8\">\n" +
				"    <title>httpRequestHandler接口测试</title>\n" +
				"</head>");

		writer.write("<body>success</body></html>");
		writer.flush();
		writer.close();
	}
}
