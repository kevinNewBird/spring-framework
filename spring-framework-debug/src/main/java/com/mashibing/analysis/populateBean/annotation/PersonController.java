package com.mashibing.analysis.populateBean.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

/**
 * description  PersonController <BR>
 * <p>
 * author: zhao.song
 * date: created in 15:12  2021/10/26
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Controller
public class PersonController {

	@Autowired
	private PersonService personService;

	@Autowired
	private Map<String,PersonService> serviceMap;
}
