package com.mashibing.analysis.populateBean.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description  PersonService <BR>
 * <p>
 * author: zhao.song
 * date: created in 15:13  2021/10/26
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Service
public class PersonService {

	@Autowired
	private PersonDao personDao;
}
