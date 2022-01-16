package com.mashibing.controller.fileupload;

import com.mashibing.vo.ResponseResult;
import com.mashibing.vo.UploadFileException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * description  FileUploadController <BR>
 * <p>
 * author: zhao.song
 * date: created in 16:20  2022/1/7
 * company: TRS信息技术有限公司
 * version 1.0
 */
@RestController
@RequestMapping("/upload")
public class FileUploadController {

	@Autowired
	private HttpServletRequest request;

	@RequestMapping("/file")
	public ResponseResult uploadSingle(MultipartFile upfile) throws Exception {
		if (downloadFile(upfile)) {
			return new ResponseResult.ResponseResultBuilder().addCode(200).addMsg("success").build();
		}
		return new ResponseResult.ResponseResultBuilder().addCode(500).addMsg("failed").build();
	}


	@RequestMapping("/files")
	public ResponseResult uploadSeveral(@RequestParam("upfiles") MultipartFile[] upfiles) throws Exception {
		ResponseResult.ResponseResultBuilder builder = new ResponseResult.ResponseResultBuilder().addCode(200);
		boolean isAllSuccess = true;
		if (Objects.nonNull(upfiles) && upfiles.length > 0) {
			for (MultipartFile upfile : upfiles) {
				if (!downloadFile(upfile)) {
					isAllSuccess = false;
					builder.addCode(500).addMsg(upfile.getOriginalFilename() + "下载失败");
				}
			}
		} else {
			builder.addCode(500).addMsg("请选择上传文件!");
		}

		if (isAllSuccess) {
			return builder.addMsg("success").build();
		} else {
			return builder.build();
		}
	}


	private boolean downloadFile(MultipartFile upfile) {
		try {
			if (upfile.isEmpty()) {
				return false;
			}
			String path = request.getServletContext().getRealPath("/WEB-INF/file");
			String fileName = upfile.getOriginalFilename();
			File filePath = new File(path, fileName);
			if (!filePath.getParentFile().exists()) {
				filePath.getParentFile().mkdir();
			}
			upfile.transferTo(filePath);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	@RequestMapping("/checkEx")
	public String checkEx() throws Exception {
		throw new UploadFileException("发生异常！");
	}

}
