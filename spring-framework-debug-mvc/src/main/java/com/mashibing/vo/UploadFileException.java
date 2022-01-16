package com.mashibing.vo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * description  UploadFileException <BR>
 * <p>
 * author: zhao.song
 * date: created in 17:17  2022/1/7
 * company: TRS信息技术有限公司
 * version 1.0
 */
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "上传文件发生异常！")
public class UploadFileException extends Exception {

	static final long serialVersionUID = 11111111111L;

	public UploadFileException(String message) {
		super(message);
	}
}
