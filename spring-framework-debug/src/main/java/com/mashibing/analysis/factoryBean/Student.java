package com.mashibing.analysis.factoryBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * description  Student <BR>
 * <p>
 * author: zhao.song
 * date: created in 17:00  2021/10/21
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class Student {

	private Integer id;

	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Student() {
		System.out.println("Student 初始化构造!!!");
	}

	//	@Autowired
	public Student(Integer id) {
		this.id = id;

	}

	//	@Autowired
	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}


	@PostConstruct
	public void init() {
		System.out.println("Student init ....");
	}


	@PreDestroy
	public void destroy() {
		System.out.println("Student destroy ....");
	}

}
