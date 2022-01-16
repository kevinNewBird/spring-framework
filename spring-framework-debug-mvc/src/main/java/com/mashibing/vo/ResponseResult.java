package com.mashibing.vo;

import java.util.Objects;

/**
 * description  ResponseResult <BR>
 * <p>
 * author: zhao.song
 * date: created in 16:56  2022/1/7
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class ResponseResult {

	private int code;

	private String msg;

	private Object data;


	private ResponseResult() {

	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}


	public static class ResponseResultBuilder {
		private ResponseResult result = new ResponseResult();

		public ResponseResultBuilder addCode(int code) {
			result.setCode(code);
			return this;
		}

		public ResponseResultBuilder addMsg(String msg) {
			String prefixMsg = result.getMsg();
			if (Objects.isNull(prefixMsg)) {
				result.setMsg(msg);
			} else {
				result.setMsg(prefixMsg.concat(";").concat(msg));
			}
			return this;
		}

		public ResponseResultBuilder addData(Object data) {
			result.setData(data);
			return this;
		}

		public ResponseResult build() {
			return result;
		}
	}
}
